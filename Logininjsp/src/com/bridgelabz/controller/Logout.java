
/******************************************************************************
 *  Compilation:  javac -d bin Logout.java
 *  Execution:    j
 *  
 *  Purpose:   user logout here
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   12-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		out.println("<script type=\"text/javascript\">");
		out.println("alert('You are successfully logged out!');");
		out.println("location='Login.jsp';");
		out.println("</script>");

	}

}
