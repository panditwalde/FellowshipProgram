package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	
	public static Connection connction() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String dbURL = "jdbc:mysql://localhost:3306/jdbcdatabase";
	
		Connection conn = DriverManager.getConnection(dbURL, "root", "password");
		return conn;
	}
	
	

}
