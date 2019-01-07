package employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee_model.Employee_Model;

/**
 * Servlet implementation class Register_Employee
 */
public class Register_Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee_Model em= new Employee_Model();
//		String name=request.getParameter("name");
//		String email=request.getParameter("email");
//		String phone=request.getParameter("phone");
//		String password=request.getParameter("password");
		Employee_Bean eb=new Employee_Bean();
		eb.setName(request.getParameter("name"));
		eb.setEmail(request.getParameter("email"));
		eb.setPhone(request.getParameter("phone"));
		eb.setPassword(request.getParameter("password"));
		PrintWriter out=response.getWriter();
		if(em.register_employee(eb)){
			RequestDispatcher rd=request.getRequestDispatcher("employee-profile.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.println("error in register_employee");
		}
	}

}
