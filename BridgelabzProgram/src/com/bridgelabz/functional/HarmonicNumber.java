/******************************************************************************
 *  Compilation:  javac -d bin HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.utility.isharmonicNumber    number
 *               
 *  
 *  Purpose:       find nth Harmonic Number
 *   *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
	
		try {
		System.out.println("Enter The Range");
		int number=Utility.ReadInteger();
	    double arr[]	=Utility.isharmonicNumber(number);
	    double sum=0;
		for(double i=1;i<=arr.length;i++)
		{
			System.out.println("1 /" +i);
			sum+=i;
		}
		System.out.println("Print the "+ number +" Harmonic Value :" +sum);
		}
		catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}

	}

}
