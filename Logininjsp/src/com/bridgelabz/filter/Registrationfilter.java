
/******************************************************************************
 *  Compilation:  javac -d bin Registrationfilter.java
 *  Execution:   
 *  
 *  Purpose:     validate  new user data if data is validate go to servelet ortherwise return jsp page
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   12-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter("/Register")
public class Registrationfilter implements Filter {
	HttpServletResponse res;
	HttpServletRequest reg;
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain ) throws IOException {
		reg = (HttpServletRequest)request;
		res = (HttpServletResponse)response;

		String name=reg.getParameter("name");
		String email=reg.getParameter("email");
		String password=reg.getParameter("password");
		String phone=reg.getParameter("phone");
		String cfmpassword=reg.getParameter("cfmpassword");
		if(phonerex(phone)!=true || namerex(name)!=true || emailrex(email)!=true || passwordrex(password,cfmpassword)!=true)
		{
			
			
			res.sendRedirect("Registration.jsp");
			
		}
		else
		{
			try {
				chain.doFilter(reg, res);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
		}		
		
	
	}

	private boolean namerex(String name) throws IOException {
	
		
		  Pattern patternstring = Pattern.compile("^([A-z\\'\\.-ᶜ]*(\\s))+[A-z\\'\\.-ᶜ]*$");
	      Matcher matcherstringname = patternstring.matcher(name);
	       if(matcherstringname.matches()==true)
	       {
	    	   return true;
	       }
	       else {

			 
	    	   PrintWriter out = res.getWriter();
				res.setContentType("text/html");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Invalid Name');");
				out.println("location='Registration.jsp';");
				out.println("</script>");

	    	   
	       }
	      
		return false;
	}

	private boolean emailrex(String email) throws IOException {
		
		  
		 Pattern patternemail = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
	      Matcher matcherstringname = patternemail.matcher(email);
	       if(matcherstringname.matches()==true)
	       {
	    	   return true;
	       }
	       else {
	    	   System.out.println("in email");
	    	   PrintWriter out = res.getWriter();
				res.setContentType("text/html");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Invalid Email');");
				out.println("location='Registration.jsp';");
				out.println("</script>");

	    	   
	       }
		
		return false;
	}

	private boolean phonerex(String phone) throws IOException {
		
		Pattern patternsmoible = Pattern.compile("(0/91)?[7-9][0-9]{9}");
	      Matcher matcherstringname = patternsmoible.matcher(phone);
	       if(matcherstringname.matches()==true)
	       {
	    	   return true;
	       }
	       else {

	    	   System.out.println("in phone");
	    	   PrintWriter out = res.getWriter();
				res.setContentType("text/html");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Invalid Phone number');");
				out.println("location='Registration.jsp';");
				out.println("</script>");

	    	   
	       }
	
		return false;
	}

	private boolean passwordrex(String password,String cfmpassword) throws IOException {
		
		 
		 if(password.equals(cfmpassword))
		 {
			 return true;
		 }
		 else
		 {
			 System.out.println("in  password");
			 PrintWriter out = res.getWriter();
				res.setContentType("text/html");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Cfm password not match');");
				out.println("location='Registration.jsp';");
				out.println("</script>");
		 }
		
		return false;
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
