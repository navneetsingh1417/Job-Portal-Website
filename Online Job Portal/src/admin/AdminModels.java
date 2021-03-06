package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.MyConnection;
import company.Company_Bean;
import employee.Employee_Bean;

public class AdminModels {
	
	Connection con = MyConnection.getConnection();
	
	public List<Company_Bean> getAllJobs(){
		List<Company_Bean> li = new ArrayList<Company_Bean>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from job");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Company_Bean cb = new Company_Bean();
				cb.setJobname(rs.getString("jobname"));
				cb.setCompany_name(rs.getString("companyname"));
				cb.setSalary(rs.getString("salary"));
				cb.setJobid(rs.getInt("idjob"));
				li.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	public List<Company_Bean> getAllCompanies(){
		List<Company_Bean> li = new ArrayList<Company_Bean>();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from register_company");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Company_Bean cb = new Company_Bean();
				cb.setCompany_name(rs.getString("company_name"));
				cb.setComp_id(rs.getInt("comp_id"));
				li.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	public List<Employee_Bean> getAllEmployees(){
		List<Employee_Bean> li = new ArrayList<Employee_Bean>();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from register_employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee_Bean eb = new Employee_Bean();
				eb.setFullname(rs.getString("fullname"));
				eb.setEmail(rs.getString("email"));
				eb.setPhone(rs.getString("phone"));
				eb.setEid(rs.getInt("reid"));		
				li.add(eb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	public boolean deleteEmployee(Employee_Bean eb) {
		boolean isDeleted=false;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("delete from register_employee where reid=?");
			ps.setInt(1, eb.getEid());
			int a = ps.executeUpdate();
			if(a>0)
				isDeleted=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isDeleted;
	}
	
	public boolean deleteJobs(Company_Bean cb) {
		boolean isDeleted=false;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("delete from job where idjob=?");
			ps.setInt(1, cb.getJobid());
			int a = ps.executeUpdate();
			if(a>0)
				isDeleted=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isDeleted;
	}
	
	public boolean deleteCompany(Company_Bean eb) {
		boolean isDeleted=false;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("delete from register_company where comp_id=?");
			ps.setInt(1, eb.getComp_id());
			int a = ps.executeUpdate();
			if(a>0)
				isDeleted=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isDeleted;
	}
	
	public List<Company_Bean> getAllParticularJobs(String company_name){
		List<Company_Bean> li = new ArrayList<Company_Bean>();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select * from job where companyname=?");
			ps.setString(1, company_name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Company_Bean eb = new Company_Bean();
				eb.setJobname(rs.getString("jobname"));
				eb.setSalary(rs.getString("salary"));
				li.add(eb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return li;
	}
	public List<Employee_Bean> getAllAppliedJobs(String company_name){
		List<Employee_Bean> li = new ArrayList<Employee_Bean>();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select * from job where companyapplied=?");
			ps.setString(1, company_name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee_Bean eb = new Employee_Bean();
				eb.setFullname(rs.getString("name"));
				eb.setEmail(rs.getString("email"));
				eb.setField_of_interest(rs.getString("fieldofinterest"));
				li.add(eb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return li;
	}

	public List<Employee_Bean> getAllEmployersApplied(String x) {
		// TODO Auto-generated method stub
		List<Employee_Bean> li = new ArrayList<Employee_Bean>();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select * from appliedjobs where companyapplied=?");
			ps.setString(1, x);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee_Bean eb = new Employee_Bean();
				eb.setFullname(rs.getString("name"));
				eb.setEmail(rs.getString("email"));
				eb.setField_of_interest(rs.getString("fieldofinterest"));
				eb.setHigh_qualif(rs.getString("highqualif"));
				li.add(eb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return li;
	}
	public List<Company_Bean> getFilteredJobsjobtitle(String jobname){
		List<Company_Bean> li = new ArrayList<Company_Bean>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from job where jobname=?");
			ps.setString(1, jobname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Company_Bean cb = new Company_Bean();
				cb.setJobname(rs.getString("jobname"));
				cb.setCompany_name(rs.getString("companyname"));
				cb.setSalary(rs.getString("salary"));
				cb.setJobid(rs.getInt("idjob"));
				li.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	public List<Company_Bean> getFilteredJobsstate(String state){
		List<Company_Bean> li = new ArrayList<Company_Bean>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from job where jobstate=?");
			ps.setString(1, state);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Company_Bean cb = new Company_Bean();
				cb.setJobname(rs.getString("jobname"));
				cb.setCompany_name(rs.getString("companyname"));
				cb.setSalary(rs.getString("salary"));
				cb.setJobid(rs.getInt("idjob"));
				li.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	public boolean forgetCompany(String username, String password) {
		boolean a=false;
		try {
			PreparedStatement ps = con.prepareStatement("update register_company set password=? where username=?");
			ps.setString(1, password);
			ps.setString(2, username);
			int x = ps.executeUpdate();
			if(x>0) {
				a=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	public boolean forgetEmployee(String email, String password) {
		boolean a=false;
		try {
			PreparedStatement ps = con.prepareStatement("update register_employee set password=? where email=?");
			ps.setString(1, password);
			ps.setString(2, email);
			int x = ps.executeUpdate();
			if(x>0) {
				a=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	public boolean verifyAdmin(String username,String password) {
		boolean isValid=false;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select * from admin where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				isValid=true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				return isValid;
	}
}
