/******************************************************************************
 *  Compilation:  javac -d bin monthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.utility.monthlyPayment  p,y,r
 *  
 *  Purpose:    show  monthly Payment.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/



package com.bridgelabz.Algoritham;

import com.bridgelabz.utility.Utility;

public class monthlyPayment {

	public static void main(String[] args) {
		
		try {
		System.out.println("enter principal ,year and rate");
		double p = Utility.ReadDouble();
		double y = Utility.ReadDouble();
		double r = Utility.ReadDouble();
		
		System.out.println("mothly payment is " + Utility.monthlyPayment(p, y, r));
		}
		catch( Exception e)
		{
			System.out.println("Only Integer number is Allowed");
		}
	}

}
