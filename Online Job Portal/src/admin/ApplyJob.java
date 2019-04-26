package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import employee.Employee_Bean;
import employee_model.Employee_Model;

/**
 * Servlet implementation class ApplyJob
 */
public class ApplyJob extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Employee_Model em = new Employee_Model();
//		int x = Integer.parseInt(request.getParameter("a"));
		String companyname = request.getParameter("a");
		Employee_Bean eb = new Employee_Bean();
		HttpSession ses = request.getSession();
		String email = (String)ses.getAttribute("useremail");
		eb = em.getEmployeeDetails(email);
		if(em.applyJob(eb, companyname)) {
			out.println("job applied");
		}
		
	}

}
