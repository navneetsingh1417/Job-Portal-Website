package admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import company.Company_Bean;

/**
 * Servlet implementation class DeleteJobs
 */
public class DeleteJobs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminModels am = new AdminModels();
		Company_Bean cb = new Company_Bean();
		int jobid = Integer.parseInt(request.getParameter("a"));
		cb.setJobid(jobid);
		if(am.deleteJobs(cb)) {
			RequestDispatcher rd = request.getRequestDispatcher("TotalJobs");
			rd.forward(request, response);
		}
		
	}

}
