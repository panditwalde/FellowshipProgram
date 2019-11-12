
/******************************************************************************
 *  Compilation:  javac -d bin Registerservlet.java
 *  Execution:    java -cp bin com.bridgelabz.utility.add    model
 *  
 *  Purpose:    add new user in table if add 1 ortherwise o
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   12-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dao.DBConnection;
import com.bridgelabz.model.Registermodel;


@WebServlet("/Register")
public class Registerservlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		

		String name=request.getParameter("name");
		
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		
		Registermodel reg=new Registermodel();
		
		reg.setName(name);
		reg.setPhone(phone);
		reg.setEmail(email);
		reg.setPassword(password);
		
		DBConnection db=new DBConnection();
		try {
			int value=DBConnection.add(reg);
			

			 if(value>0) 
			 { 
				 PrintWriter out = response.getWriter();
					response.setContentType("text/html");
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Registration Succssfully..');");
					out.println("location='Login.jsp';");
					out.println("</script>");
			 } 
			 else {
				    PrintWriter out = response.getWriter();
					response.setContentType("text/html");
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Email Id Already Existing');");
					out.println("location='Registration.jsp';");
					out.println("</script>");
				 
			 
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}

}
