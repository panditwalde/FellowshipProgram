package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Batchprocessing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = DBConnection.connction();

		PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("insert into student values('0',?,?,?,?,?)");
		while (true) {

			System.out.println("Enter Name");
			String name = Utility.readstring();
			System.out.println("Enter Address");
			String address = Utility.readstring();
			System.out.println("Enter moible");
			long moible = Utility.readinteger();
			System.out.println("Enter age");
			int age = Utility.readinteger();
			System.out.println("Course");
			String course = Utility.readstring();

			stmt.setString(1, name);
			stmt.setString(2, address);
			stmt.setLong(3, moible);
			stmt.setInt(4, age);
			stmt.setString(5, course);
			stmt.addBatch();

			System.out.println("you want add more press 1 or 0");
			int ans = Utility.readinteger();
			if (ans == 0) {
				break;
			}
			stmt.executeBatch();
			System.out.println("record save ........");

		}
	}

}
