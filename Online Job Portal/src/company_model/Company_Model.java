package company_model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.MyConnection;
import company.Company_Bean;

public class Company_Model {
	Connection con=MyConnection.getConnection();
	
	public boolean Register_Company(Company_Bean cb)
	{
		boolean result=false;
		try {
			PreparedStatement ps=con.prepareStatement("insert into register_company values(?,?,?)");
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
}
