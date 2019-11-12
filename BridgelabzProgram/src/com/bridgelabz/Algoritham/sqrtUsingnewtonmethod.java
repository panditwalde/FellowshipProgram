/******************************************************************************
 *  Compilation:  javac -d bin v.java
 *  Execution:    java -cp bin com.bridgelabz.utility.sqrtWithNewton              c
 *              
 *                
 *  Purpose:      find   square root using newton method  
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019s
 *
 ******************************************************************************/
package com.bridgelabz.Algoritham;

import com.bridgelabz.utility.Utility;

public class sqrtUsingnewtonmethod {

	public static void main(String[] args) {
		
		try
		{
		
		System.out.println("Enter non negative number");
		double c=Utility.ReadDouble();
		double t=Utility.sqrtWithNewton(c);
        System.out.println( "print out the estimate of the square root : "+t);
		}
		catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}
	
	}

}
