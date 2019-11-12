
/******************************************************************************
 *  Compilation:  javac -d bin Calendar.java
 *  Execution:    java -cp bin com.bridgelabz.utility.dayofweek     d ,month,year
 *                java -cp bin com.bridgelabz.utility.calandar     day ,month,year
 *  
 *  Purpose:    user give month ,year they are  print month
 *
 *  @author  BridgeLabz
 *  
 *  @version 1.0
 *  @since   21 -10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Calendar {

	public static void main(String[] args) {
			
		
		try {
			
		System.out.println("Enter the  month"
				);
		int month = Utility.ReadInteger();
		System.out.println("Enter the year");
		int year = Utility.ReadInteger();
	
		int day = Utility.dayofweek(1, month, year);
		System.out.println(day);
		int arr[][] = util.calandar(month, day, year);
		System.out.println("  Su  Mon Tue Wed Thu Fri Sat");
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 7; j++) {

				if (arr[i][j] != 0) {
					System.out.printf("%4d", arr[i][j]);
					util.enqueue(arr[i][j]);

				} else
					System.out.print("    ");
			}
			System.out.println();
		}

		}
		catch(Exception e)
		{
			System.out.println("Enter Integer number. Not String allowed");
		}
		}
		

		
	}
	
	
	 
	


