
/******************************************************************************
 *  Compilation:  javac -d bin Loginservlet.java
 *  Execution:    java -cp bin com.bridgelabz.utility.login    username , password
 *  
 *  Purpose:     user give input for check username and password in db present or not
 *
 *  @author  BridgeLabz
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

@WebServlet("/Login")
public class Loginservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Registermodel reg = new Registermodel();

		int value = DBConnection.login(username, password);
		if (value > 0) {
			

			
			HttpSession session=request.getSession();  
	        session.setAttribute("username",username);  
	      
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Login Successfully...');");
			out.println("location='Welcome.jsp';");
			out.println("</script>");

		} else {

			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Invalid Username & password');");
			out.println("location='Login.jsp';");
			out.println("</script>");

		}

	}

}
