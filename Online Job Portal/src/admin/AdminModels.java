package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.MyConnection;
import company.Company_Bean;

public class AdminModels {
	
	Connection con = MyConnection.getConnection();
	
	public List<Company_Bean> getAllJobs(){
		List<Company_Bean> li = new ArrayList<Company_Bean>();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from job");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("ehehehhheeh");
				Company_Bean cb = new Company_Bean();
				cb.setJobname(rs.getString("jobname"));
				cb.setJobdesc(rs.getString("jobdescription"));
				li.add(cb);
				System.out.println("hellooooooooooo");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	
}
