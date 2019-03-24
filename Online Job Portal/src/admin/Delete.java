package admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import employee.Employee_Bean;

/**
 * Servlet implementation class Delete
 */
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Employee_Bean eb=new Employee_Bean();
		int eid=Integer.parseInt(request.getParameter("a"));
		eb.setEid(eid);
		AdminModels delete=new AdminModels();
		if(delete.deleteEmployee(eb))
		{
			RequestDispatcher rd = request.getRequestDispatcher("TotalEmployees");
			rd.forward(request, response);
		}
	}

}
