package employee;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@MultipartConfig(
		maxFileSize= 1024*1024*5,
		fileSizeThreshold=1024*1024*5,
		maxRequestSize=1024*1024*5
		)
public class edit_employee_profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	public String extractFileName(Part part)
	{
	
		String d="flag";
		 String c = part.getHeader("content-disposition");
		 //c= form-data; name="file"; filename="IMG-20161006-WA0027.jpg"
		 //System.out.println(c+"\n");
	            if (c.contains("filename")) {
	                return c.substring(c.lastIndexOf("\\") + 1, c.length()-1);
		}
	
	return d;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hiii");
		String fullname=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String high_qualif=request.getParameter("high_qualif");
		String marks_12=request.getParameter("marks_12");
		String marks_10=request.getParameter("marks_10");
		String field_of_interest=request.getParameter("field_of_interest");
		

		String fileName="";
		String savePath="D:\\Git\\Job-Portal-Website\\Online Job Portal\\WebContent\\Employee_Profile";
		File fileSave=new File(savePath);
		
		 for (Part part : request.getParts()) {
	  	      	 fileName = extractFileName(part);  
	      	  
	          if(fileName!="flag") 
	          {
	        	 // System.out.println("suc.");
	        	 System.out.println(fileName);
	        	  part.write(fileSave + File.separator + fileName);
	          }  
			
		
	      }
		 
	
	}

}
