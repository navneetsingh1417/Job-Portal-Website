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
 * Servlet implementation class SearchFilter
 */
public class SearchFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminModels am=new AdminModels();
		String choice = request.getParameter("jsearch");
		String value = request.getParameter("choice");
		System.out.println(choice+" "+value);
		List<Company_Bean> li=new ArrayList<Company_Bean>();
		if(choice.equals("jobtitle")) {
			li = am.getFilteredJobsjobtitle(value);
		}
		if(choice.equals("state")) {
			li = am.getFilteredJobsstate(value);
		}
		HttpSession ses = request.getSession();
		ses.setAttribute("allfjobs", li);
		RequestDispatcher rd = request.getRequestDispatcher("ShowFilteredJobs.jsp");
		rd.forward(request, response);
	}

}
