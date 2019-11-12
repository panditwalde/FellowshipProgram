/******************************************************************************
 *  Compilation:  javac -d bin dayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.utility.dayofweek    array
 *               
 *  
 *  Purpose:     show the enter date  day
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.Algoritham;

import com.bridgelabz.utility.Utility;

public class dayOfWeek {

	public static void main(String[] args) {
	
       try {
       System.out.println("Enter the day");
       int day=Utility.ReadInteger();
       System.out.println("Enter the Month");
       int month=Utility.ReadInteger();
       System.out.println("Enter the year");
       int year=Utility.ReadInteger();
       
       int result=Utility.dayofweek(day,month,year);
       
       switch(result)
		{
		case 1:{System.out.println("Monday");}break;
		case 2:{System.out.println("Tuesday");}break;
		case 3:{System.out.println("Wednesday");}break;
		case 4:{System.out.println("Thursday");}break;
		case 5:{System.out.println("Friday");}break;
		case 6:{System.out.println("Saturday");}break;
		case 7:{System.out.println("Sunday");}break;
		default:{System.out.println("Some problem");}
		}
       }
       catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}
	}

}
