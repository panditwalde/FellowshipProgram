/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.utility.LeapYear    year
 *               
 *  
 *  Purpose:    check year is leap year or not
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		
		try {
		System.out.println("Enter the Year");
		int year=Utility.ReadInteger();
		int result=Utility.CheckLeapyear(year);
		 if(result==1)
		 {
			 System.out.println("Leap Year");
		 }
		 else
		 {
			 System.out.println("not Leap Year");
			 
		 }
		}
		catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}

	}

}
