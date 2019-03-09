package employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee_model.Employee_Model;

/**
 * Servlet implementation class employee_login
 */
public class employee_login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee_Model em=new Employee_Model();
		Employee_Bean eb=new Employee_Bean();
		eb.setEmail(request.getParameter("user_email"));
		eb.setPassword(request.getParameter("user_password"));
		
		if(em.validate_employee(eb)) {
			
			RequestDispatcher rd=request.getRequestDispatcher("employee-profile.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.print("error in employee_login");
		}
	}

}
