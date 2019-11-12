/******************************************************************************
 *  Compilation:  javac -d bin CalendarQueue.java
 *  Execution:    java -cp bin com.bridgelabz.utility.dayofweek    day,month,year
 *                java -cp bin com.bridgelabz.utility.calandarQueue    month ,day,year
 *  
 *  Purpose:     check    balanced Parentheses or not using stack
 *
 *  @author  BridgeLabz
 *  
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Calendarqueue {

	public static void main(String[] args) {
		
		try {
		System.out.println("Enter the month");
		int month=Utility.ReadInteger();
		System.out.println("Enter the year");
		int year=Utility.ReadInteger();		
	
		int day=Utility.dayofweek(1, month, year);		
		
		 util.calandarqueue(month, day, year);
		 
		int value;
		System.out.println("  Su  Mon Tue Wed Thu Fri Sat");
		for (int i = 0; i < 6; i++) 
		{
			System.out.println();
			for (int j = 0; j < 7; j++)
			{
				value=util.dequeue();
				if(value!=0)
				{
					System.out.printf("%4d",value);
					
					
				}
				else
				{
					System.out.print("    ");
				}
				
				

			}
		}
		}
		catch(Exception e)
		{
			System.out.println("Enter Correct Integer number..");
		}
		
		
		
		
		
		
	     
		
		

	}

}
