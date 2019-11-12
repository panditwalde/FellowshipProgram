/******************************************************************************
 *  Compilation:  javac -d bin temperaturConversion.java
 *  Execution:    java -cp bin com.bridgelabz.utility.CelsiustoFahrenheit       f
 *                 java -cp bin com.bridgelabz.utility.FahrenheittoCelsius      c
 *                
 *  Purpose:      temperature in Celsius or viceversa using the formula

 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.Algoritham;

import com.bridgelabz.utility.Utility;

public class temperaturConversion {

	public static void main(String[] args) {
	
        try {
	
		System.out.println("1. Celsius to Fahrenheit:");
		System.out.println("2. Fahrenheit to Celsius:");
		System.out.println("Enter your choice");
		int ch=Utility.ReadInteger();
		switch(ch)
		{
		
		case 1: {
			
			         System.out.println("Enter  Fahrenheit temperature");
			         double f=Utility.ReadDouble();
			         
			         System.out.println("Celsius temperature is = "+ Utility.CelsiustoFahrenheit(f));
		        }
		break;
		case 2: {
			         System.out.println("Enter  Celsius temperature");
			         double c=Utility.ReadDouble();			    	 
	                 System.out.println("Fahrenheit temperature is = "+ Utility.FahrenheittoCelsius(c));
		        }
		default:
			   System.out.println("Wrong choice!!!!!");
		
		}
        }
        catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}

	}

}
