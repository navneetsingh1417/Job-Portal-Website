package employee_model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Connection.MyConnection;
import employee.Employee_Bean;

public class Employee_Model {
	Connection con=MyConnection.getConnection();
	
	public boolean register_employee(Employee_Bean eb) {
		boolean x=false;
		try {
			PreparedStatement ps=con.prepareStatement("insert into register_employee(fullname,email,phone,password) values(?,?,?,?)");
			ps.setString(1, eb.getFullname());
			ps.setString(2, eb.getEmail());
			ps.setString(3, eb.getPhone());
			ps.setString(4, eb.getPassword());
			int a=ps.executeUpdate();
			if(a>0) {
				x=true;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
		
	
	
	public boolean validate_employee(Employee_Bean eb) {
		boolean isValid=false;
		try {
			PreparedStatement ps=con.prepareStatement("select * from register_employee where email=? and password=?");
			ps.setString(1, eb.getEmail());
			ps.setString(2, eb.getPassword());
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
	
	public boolean savingProfile(Employee_Bean em) {
		boolean isSave = false;
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee_profile(gender,highqualif,marks12,marks10,fieldofinterest,photo,dob,email) values(?,?,?,?,?,?,?,?)");

			ps.setString(1 ,em.getGender());
			
			ps.setString(2 ,em.getHigh_qualif());
			ps.setString(3 ,em.getMarks_12());
			ps.setString(4 ,em.getMarks_10());
			ps.setString(5 ,em.getField_of_interest());
			ps.setString(6 ,em.getPhoto());
			ps.setString(7 ,em.getDob());
			ps.setString(8, em.getEmail());
			int a = ps.executeUpdate();
			if(a>0) {
				isSave = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isSave;
	}
//	
//	public String EmployeeProfileImage(String email){
//		String imageName = "";
//			PreparedStatement ps;
//			try {
//				ps = con.prepareStatement("select photo from employee_profile where email = ");
//				ps.setString(1, email);
//				ResultSet rs = ps.executeQuery();
//				if(rs.next()) {
//					imageName = rs.getString(10);
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(imageName);
//		return imageName;
//		
//	}
//	
//	public ArrayList<Employee_Bean> SetterEmployee(Employee_Bean eb) {
//		ArrayList<Employee_Bean> li=new ArrayList<Employee_Bean>();
//		try {
//			PreparedStatement ps1 = con.prepareStatement("select * from employee_profile where email=?");
//			ps1.setString(1,eb.getEmail());
//			int a = ps1.executeUpdate();
//			if(a>0) {
//				
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return li;
//	}
}
