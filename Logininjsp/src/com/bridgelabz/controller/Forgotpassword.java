
/******************************************************************************
 *  Compilation:  javac -d bin Forgotpassword.java
 *  Execution:    java -cp bin com.bridgelabz.utility.checkemail    email
 *  
 *  Purpose:    user give email for  check email present or not 
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   12-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.DBConnection;
import com.bridgelabz.model.Registermodel;

/**
 * Servlet implementation class Forgotpassword
 */
@WebServlet("/forgotpassword")
public class Forgotpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		Registermodel reg=new Registermodel();
		
		String email=request.getParameter("email");
		
		reg.setEmail(email);
		
		 int found=DBConnection.checkemail(email);
		 System.out.println(found);
		 
		 if(found>0)
		 {
			 
			 HttpSession session=request.getSession();
			 session.setAttribute("emailid",email );
			 response.sendRedirect("Resetpassword.jsp");
			 
		 }
		 else {
			 PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Emaild id not found ');");
				out.println("location='ForgotPassword.jsp';");
				out.println("</script>");
			 
			 
			 
		 }
		
		
		
		
		
				
				
	}

}
