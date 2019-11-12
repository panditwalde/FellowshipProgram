/******************************************************************************
 *  Compilation:  javac -d bin StringPalimdorme.java
 *  Execution:    java -cp bin com.bridgelabz.utility.StopWatch    start stop
 *               
 *  
 *  Purpose:     Simulate Stopwatch Program


 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class StringPalimdorme {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the String");
		String str=Utility.ReadString();
		
		int result=Utility.isPalimdrome(str);
		if(result==1)
		{
			System.out.println("String is Palimdrome");
		}
		else
		{
			System.out.println("String  is Not Palimdrome");
		}
		

	}

}
