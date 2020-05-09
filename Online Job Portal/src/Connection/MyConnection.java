package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	private static Connection conn;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_job_portal","root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return conn;
	}
}
