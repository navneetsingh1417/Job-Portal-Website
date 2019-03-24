package admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import company.Company_Bean;

/**
 * Servlet implementation class DeleteCompany
 */
public class DeleteCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("a"));
		AdminModels am = new AdminModels();
		Company_Bean cb = new Company_Bean();
		cb.setComp_id(id);
		if(am.deleteCompany(cb)) {
			RequestDispatcher rd = request.getRequestDispatcher("TotalCompanies");
			rd.forward(request, response);
		}
	}
       
   
	

}
