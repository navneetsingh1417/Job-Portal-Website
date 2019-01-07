package employee_model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Connection.MyConnection;
import employee.Employee_Bean;

public class Employee_Model {
	Connection con=MyConnection.getConnection();
	
	public boolean register_employee(Employee_Bean eb) {
		boolean result=false;
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into register_employee values(?,?,?,?)");
			ps.setString(1,eb.getName());
			ps.setString(2,eb.getEmail());
			ps.setString(3,eb.getPhone());
			ps.setString(4,eb.getPassword());
			int a=ps.executeUpdate();
			if(a>0) {
				result=true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public boolean validate_employee(Employee_Bean eb) {
		boolean result=false;
		try {
			PreparedStatement ps=con.prepareStatement("select * from register_employee where email=? and password=?");
			ps.setString(1, eb.getEmail());
			ps.setString(2, eb.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				result=true;
			}
			else {
				result=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
