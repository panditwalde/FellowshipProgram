/******************************************************************************
 *  Compilation:  javac -d bin Primefactor.java
 *  Execution:    java -cp bin com.bridgelabz.utility.Primefactor    number
 *               
 *  
 *  Purpose:     find prime  factor
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Enter the Number");
			int num = Utility.ReadInteger();
			System.out.println("Factor of Prime Number");

			System.out.println(Utility.Primefactor(num));
		} 
		catch (Exception e) {
			System.out.println("only integer number is allowed");
		}

	}

}
