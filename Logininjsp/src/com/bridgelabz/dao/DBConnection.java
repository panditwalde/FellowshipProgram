
/******************************************************************************
 *  Compilation:  javac -d bin DBConnection.java
 *  Execution:   
 *  
 *  Purpose:    all db connection here perform all operation
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   12-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.bridgelabz.model.Registermodel;
import com.mysql.jdbc.Connection;


public class DBConnection {
	
	
	static PreparedStatement stmt;
	

	public static Connection connction() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String dbURL = "jdbc:mysql://localhost:3306/jdbcdatabase";
	
		Connection conn = (Connection) DriverManager.getConnection(dbURL, "root", "password");
		return conn;
	}
	
	/**
	 * @param reg     already new data store in model set and cange get here
	 * @return        if data  store in database 1 or 0
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static int add(Registermodel reg) throws ClassNotFoundException, SQLException
	{
		
		
		String email = reg.getEmail();

		int value = 0;
		int existingcheck = checkemail(email);
		if(existingcheck==0)
		{

			PreparedStatement stmt = connction().prepareStatement("insert into emp values('0',?,?,?,?)");

			stmt.setString(1, reg.getName());
			stmt.setString(2, reg.getPhone());
			stmt.setString(3, reg.getEmail());
			stmt.setString(4, reg.getPassword());

			value = stmt.executeUpdate();
		}
		else { System.out.println("user existing...");}
		return value;
		
	}

	/**
	 * @param username  user give email  for check in database present or not
	 * @param password  user give password for check in database present or not
	 * @return   if both user name and password present database return 1 or 0
	 */
	public static int login(String username ,String password) {
		
		int i=0;
		try {
			
			
			
			PreparedStatement stmt=connction().prepareStatement("select * from emp");
			
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				String usernamedb=rs.getString("email");
				String passworddb=rs.getString("password");
				
				if(usernamedb.equals(username) &&passworddb.equalsIgnoreCase(password))
				{
					i=1;
				}
			
			}
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return i;
		
		
	}
	
	/**
	 * @return      return all form data in database by list
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static ArrayList show() throws ClassNotFoundException, SQLException
	{
		List<Registermodel>al=new ArrayList<Registermodel>();
		

		PreparedStatement stmt=connction().prepareStatement("select * from emp");		
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			Registermodel reg=new Registermodel();
			reg.setId(rs.getInt("Id"));
			reg.setName(rs.getString("Name"));
			reg.setPhone(rs.getString("Phone"));
			reg.setEmail(rs.getString("Email"));
			reg.setPassword(rs.getString("Password"));			
			al.add(reg);
			
			
			
		}
		
		
		return (ArrayList) al; 
		
	}

	/**
	 * @param email  user give email for checking email present or not
	 * @return  check email present or not in database
	 */
	public static int checkemail(String email) {
		
		
		
		int i=0;
		try {
			
			
			
			PreparedStatement stmt=connction().prepareStatement("select * from emp");
			
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				String usernamedb=rs.getString("email");
				
				
				
				if(usernamedb.equals(email) )
				{
					i++;
				}
			
			}
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return i;
		
	}

	/**
	 * @param email   user  give email for which want change  password
	 * @param new_password   user give new password for change
	 * @return  if new password change in database 1 or 0
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static int resetpassword(String email, String new_password) throws ClassNotFoundException, SQLException {
		
		int i=0;
		
		stmt=connction().prepareStatement("update emp set Password=? where Email=?");
		stmt.setString(1,new_password);

		stmt.setString(2, email);
		int result=stmt.executeUpdate();
		if(result>0)
		{
			i++;
			System.out.println("update...");
		}
		else
		{
		 System.out.println("some problem");
		}
		
		
		return i;
	}

}
