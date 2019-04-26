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

/**
 * Servlet implementation class SearchJobs
 */
public class SearchJobs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminModels am = new AdminModels();
		List<Company_Bean> cb = new ArrayList<Company_Bean>();
		cb = am.getAllJobs();
		HttpSession ses = request.getSession();
		ses.setAttribute("alljobs", cb);
		RequestDispatcher rd = request.getRequestDispatcher("SearchJobs.jsp");
		rd.forward(request, response);
	}

}
