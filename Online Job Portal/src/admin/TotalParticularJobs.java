package admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import company.Company_Bean;
import employee.Employee_Bean;

/**
 * Servlet implementation class TotalParticularJobs
 */
public class TotalParticularJobs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminModels am = new AdminModels();
		HttpSession ses = request.getSession();
		String x = (String) ses.getAttribute("company_name");
		List<Employee_Bean> li = new ArrayList<Employee_Bean>();
		li = am.getAllParticularJobs(x);
		for(Employee_Bean e : li) {
			System.out.println(e.getFullname()+ " " + e.getEmail()+" "+e.getField_of_interest());
		}
			
		
	}

}
