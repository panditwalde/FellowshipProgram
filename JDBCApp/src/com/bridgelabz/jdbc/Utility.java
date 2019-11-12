package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Utility {
	static Scanner scanner = new Scanner(System.in);

	/********************** Integer Scanner *******************************/

	/**
	 * @return Read Integer value of User
	 */
	public static int readinteger() {
		return scanner.nextInt();
	}

	/********************** Long Scanner *******************************/

	/**
	 * @return Read Integer value of User
	 */
	public static long readlong() {
		return scanner.nextLong();
	}

	/********************** String Scanner *******************************/

	/**
	 * @return Read String value of User
	 */
	public static String readstring() {
		return scanner.next();
	}

	/********************** Double Scanner *******************************/

	/**
	 * @return Read Double value of User
	 */
	public static double ReadDouble() {
		return scanner.nextDouble();
	}

	/*---------------------------------------jdbc Curd operaton---------------------------------------*/

	public static void add() throws ClassNotFoundException, SQLException {// add new record

		try {
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

		Connection con = DBConnection.connction();

		PreparedStatement stmt = (PreparedStatement) con.prepareStatement("insert into student values('0',?,?,?,?,?)");
		stmt.setString(1, name);
		stmt.setString(2, address);
		stmt.setLong(3, moible);
		stmt.setInt(4, age);
		stmt.setString(5, course);
		int value = stmt.executeUpdate();
		if (value > 0) {
			System.out.println(" data Insert........ ");
		} else {
			System.out.println("some problem is there");
		}}
		catch(Exception e)
		{
			
			System.out.println("something wrong there...");
		}

	}

	public static void show() throws ClassNotFoundException, SQLException {// show all record
		Connection con = DBConnection.connction();

		PreparedStatement stmt = (PreparedStatement) con.prepareStatement("select * from student");

		ResultSet rs = stmt.executeQuery();

		System.out.println("------------ Stduent Info ----------\n");
		while (rs.next()) {

			System.out.println("ID    :" + rs.getInt("Id") + "\n" + "Name :" + rs.getString("Name") + " \n"
					+ "Address :" + rs.getString("Address") + " \n" + "Moible :" + rs.getLong("Moible") + "\nCourse :"
					+ rs.getString("Course"));
			System.out.println("------------------------------------\n");
		}

	}

	public static void delete() throws ClassNotFoundException, SQLException { // delete perticular record by id

		System.out.println("Enter delete record for Id");
		int delete = Utility.readinteger();

		Connection con = DBConnection.connction();
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement("delete from student where Id=?");
		stmt.setInt(1, delete);
		int value = stmt.executeUpdate();
		if (value > 0) {
			System.out.println("Delete successfully...");
		} else {
			System.out.println("Some problem is there...");
		}

	}

	public static void update() throws ClassNotFoundException, SQLException { // update student record

		try {
		System.out.println("Enter Student Id  you want to update information ");

		System.out.println("Enter Id");
		int id = Utility.readinteger();
		System.out.println("Enter Student Information");
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

		Connection con = DBConnection.connction();

		PreparedStatement stmt = (PreparedStatement) con
				.prepareStatement("UPDATE student SET Name=?,Address=?,Moible=?,Age=?,Course=? where Id='" + id + "'");
		stmt.setString(1, name);
		stmt.setString(2, address);
		stmt.setLong(3, moible);
		stmt.setInt(4, age);
		stmt.setString(5, course);
		int value = stmt.executeUpdate();
		if (value > 0) {
			System.out.println(" data Update........ ");
		} else {
			System.out.println("same problem is there");
		}}
		catch(Exception e)
		{
			
			System.out.println("something wrong there...");
		}

	}

	public static void search() throws ClassNotFoundException, SQLException { // search perticular record in table and
																				// show it
		System.out.println("Enter Search Id");
		int search = Utility.readinteger();

		Connection con = DBConnection.connction();
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement("select * from student where Id=?");
		stmt.setInt(1, search);

		ResultSet rs = stmt.executeQuery();

		System.out.println("------------ Stduent Info ----------\n");
		while (rs.next()) {

			System.out.println("ID    :" + rs.getInt("Id") + "\n" + "Name :" + rs.getString("Name") + " \n"
					+ "Address :" + rs.getString("Address") + " \n" + "Moible :" + rs.getLong("Moible") + "\nCourse :"
					+ rs.getString("Course"));
			System.out.println("------------------------------------\n");
		}

	}

}
