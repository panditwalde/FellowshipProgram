/******************************************************************************
 *  Compilation:  javac -d bin PowerOf2.java
 *  Execution:    java -cp bin com.bridgelabz.utility.ispowerof2    num
 *               
 *  
 *  Purpose:     his program takes a command-line argument N and prints a table of the powers of 2 that are
 *               less than or equal to 2^N.
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		try {

			System.out.println("Enter the number");
			int num = Utility.ReadInteger();
			int result[] = Utility.ispowerof2(num);
			for (int i = 0; i < result.length; i++) {
				System.out.println("2 ^ " + (i + 1) + " = " + result[i]);
			}
		} 
		catch (Exception e) {
			System.out.println("only integer number is allowed");
		}
		
		

	}

}
