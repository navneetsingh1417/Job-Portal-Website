package company;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import company_model.Company_Model;

/**
 * Servlet implementation class JobPost
 */
public class JobPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Company_Bean cb = new Company_Bean();
		Company_Model cm = new Company_Model();
		HttpSession ses = request.getSession();
		cb.setJobname(request.getParameter("jobname"));
		cb.setJobdesc(request.getParameter("jobdesc"));
		cb.setEligibility(request.getParameter("eligibility"));
		cb.setSalary(request.getParameter("salary"));
		cb.setJobcity(request.getParameter("jcity"));
		cb.setJobstate(request.getParameter("jstate"));
		cb.setJobcountry(request.getParameter("jcountry"));
		cb.setExperience(request.getParameter("experience"));
		String x = (String)ses.getAttribute("company_name");
		cb.setCompany_name(x);
		if(cm.postJob(cb)) {
			RequestDispatcher rd = request.getRequestDispatcher("company-profile.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
