package admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import company.Company_Bean;
import employee.Employee_Bean;

/**
 * Servlet implementation class TotalEmployees
 */
public class TotalEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminModels am = new AdminModels();
		HttpSession ses = request.getSession();
		List<Employee_Bean> li2 = new ArrayList<Employee_Bean>();
		li2 = am.getAllEmployees();
		ses.setAttribute("allemployee", li2);
		RequestDispatcher rd = request.getRequestDispatcher("total-employee.jsp");
		rd.forward(request, response);
	}

}
