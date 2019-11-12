
/******************************************************************************
 *  Compilation:  javac -d bin resetpassword.java
 *  Execution:    java -cp bin com.bridgelabz.utility.resetpassword    email,password
 *  
 *  Purpose:    user want reset a password so which user want to reset password user provide password and cfmpassword
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
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.DBConnection;

/**
 * Servlet implementation class Resetpassword
 */
@WebServlet("/resetpassword")
public class Resetpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("emailid");

		String password = request.getParameter("password");
		String cfmpassword = request.getParameter("cfmpassword");
		if (password.equals(cfmpassword)) {

			int value;
			try {
				value = DBConnection.resetpassword(email, password);
				if (value > 0) {
					PrintWriter out = response.getWriter();
					response.setContentType("text/html");
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Password change Successfully');");
					out.println("location='Login.jsp';");
					out.println("</script>");
				} else {

					PrintWriter out = response.getWriter();
					response.setContentType("text/html");
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Both password not same');");
					out.println("location='Resetpassword.jsp';");
					out.println("</script>");

				}
			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}

}
