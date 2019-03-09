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
 * Servlet implementation class Company_Login
 */
public class Company_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ses = request.getSession();
		Company_Model cm=new Company_Model();
		Company_Bean cb=new Company_Bean();
		cb.setUser_name(request.getParameter("user_name"));
		cb.setPassword(request.getParameter("user_password"));
		if(cm.validate_company(cb)) {
			String x = cm.getCompanyName(cb);
			ses.setAttribute("company_name", x);
			
			RequestDispatcher rd=request.getRequestDispatcher("company-profile.jsp");
			rd.forward(request, response);
		}
	}

}
