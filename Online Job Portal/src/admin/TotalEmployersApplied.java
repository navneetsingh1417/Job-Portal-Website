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
 * Servlet implementation class TotalEmployersApplied
 */
public class TotalEmployersApplied extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminModels am = new AdminModels();
		HttpSession ses = request.getSession();
		String x = (String) ses.getAttribute("company_name");
		List<Employee_Bean> li = new ArrayList<Employee_Bean>();
		li = am.getAllEmployersApplied(x);
		ses.setAttribute("alleapp", li);
		RequestDispatcher rd = request.getRequestDispatcher("TotalEmployersApplied.jsp");
		rd.forward(request, response);
		
	}

}
