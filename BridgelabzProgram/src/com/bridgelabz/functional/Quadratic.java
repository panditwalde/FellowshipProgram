/******************************************************************************
 *  Compilation:  javac -d bin Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.utility.isquadratic    first , second , thrid
 *               
 *  
 *  Purpose:    Write a program Quadratic  to find the roots of the equation formula
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		try {
		System.out.println("equation a*x*x + b*x + c.");
		System.out.println("Enter the 'a'");
		int a=Utility.ReadInteger();
		System.out.println("Enter the 'b'");
		int b=Utility.ReadInteger();
		System.out.println("Enter the 'c'");
		int c=Utility.ReadInteger();
	
       double result[] =Utility.isquadratic(a, b,c);
       System.out.println(result[0]);
       System.out.println(result[1]);
		}
		catch(Exception e)
		{
			System.out.println("only Integer number is allowed..");
		}
	} 

}
