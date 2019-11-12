/******************************************************************************
 *  Compilation:  javac -d bin Distance.java
 *  Execution:    java -cp bin com.bridgelabz.utility.isEuclidean    first second
 *               
 *  
 *  Purpose:      Write a program Distance that takes two integer command-line arguments x and y and prints the
 *                Euclidean distance
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;



import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
	
    
		try
		{       
       System.out.println("Enter the first number");
       int first=Utility.ReadInteger();
       System.out.println("Enter the Second Number");
       int second=Utility.ReadInteger();
       
       double result=Utility.isEuclidean(first, second);
       System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}
       

	}

}
