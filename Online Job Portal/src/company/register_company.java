package company;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import company_model.Company_Model;

/**
 * Servlet implementation class register_company
 */
public class register_company extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Company_Model cm=new Company_Model();
		Company_Bean cb=new Company_Bean();
		cb.setCompany_name(request.getParameter("name"));
		cb.setUser_name(request.getParameter("user_name"));
		cb.setPassword(request.getParameter("password"));
		if(cm.Register_Company(cb)) {
			RequestDispatcher rd=request.getRequestDispatcher("company-profile.jsp");
			rd.forward(request, response);
		}
	}

}
