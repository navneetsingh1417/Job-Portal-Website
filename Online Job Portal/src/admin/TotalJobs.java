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
 * Servlet implementation class TotalJobs
 */
public class TotalJobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdminModels am = new AdminModels();
		HttpSession ses = request.getSession();
		List<Company_Bean> li = new ArrayList<Company_Bean>();
		li = am.getAllJobs();
		
		ses.setAttribute("alljobs", li);
		RequestDispatcher rd = request.getRequestDispatcher("total-jobs.jsp");
		rd.forward(request, response);
	}

}
