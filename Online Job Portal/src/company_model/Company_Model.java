package company_model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

import com.sun.xml.internal.ws.api.FeatureListValidatorAnnotation;

import Connection.MyConnection;
import company.Company_Bean;


public class Company_Model {
	Connection con=MyConnection.getConnection();
	
	public boolean Register_Company(Company_Bean cb)
	{
		boolean result=false;
		try {
			PreparedStatement ps=con.prepareStatement("insert into register_company(company_name,username,password) values(?,?,?)");
			ps.setString(1, cb.getCompany_name());
			ps.setString(2, cb.getUser_name());
			ps.setString(3, cb.getPassword());
			int a=ps.executeUpdate();
			if(a>0) {
				result=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public boolean validate_company(Company_Bean cb) {
		boolean result=false;
		try {
			PreparedStatement ps=con.prepareStatement("select * from register_company where username=? and password=?");
			ps.setString(1, cb.getUser_name());
			ps.setString(2, cb.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				result=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public boolean postJob(Company_Bean cb) {
		boolean isPosted=false;
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into job(jobname,jobdescription,eligibility,salary,jobcity,experience,companyname,jobstate,jobcountry) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, cb.getJobname());
			ps.setString(2, cb.getJobdesc());
			ps.setString(3, cb.getEligibility());
			ps.setString(4, cb.getSalary());
			ps.setString(5, cb.getJobcity());
			ps.setString(6, cb.getExperience());
			ps.setString(7, cb.getCompany_name());
			ps.setString(8, cb.getJobstate());
			ps.setString(9, cb.getJobcountry());
			int a =ps.executeUpdate();
			if(a>0) {
				isPosted=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isPosted;
	}
	
	public String getCompanyName(Company_Bean cb) {
		String result=null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from register_company where username=?");
			ps.setString(1, cb.getUser_name());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				result = rs.getString("company_name");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
