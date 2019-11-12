/******************************************************************************
 *  Compilation:  javac -d bin Menu.java
 *  Execution:    java -cp bin com.bridgelabz.Doctorpatient.operation
 *                java -cp bin com.bridgelabz.Search.operation
 *                java -cp bin com.bridgelabz.Print.operation 
 *  
 *  Purpose:     Perform all clinique mangement Operation
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   1-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.clinique.controller;

import java.text.ParseException;
import java.util.Date;


import com.bridgelabz.clinique.utility.Utility;


public class Menu {
	static Date date;

	public static void main(String[] args) throws ParseException {
		int choice = 0;
		do {
			
			System.out.println(	"\n1. Add Doctor or Patient or fix an Appointment\n2. Search doctor\n3. Display details\n4. exit");
			choice = Utility.readinteger();
			
			switch (choice) {
			case 1:

				new Doctorpatient().operation();
				break;
			case 2:
				new Search().operation();
				break;
			case 3:
				 new Print().operation();
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (choice != 4);
	}
}
