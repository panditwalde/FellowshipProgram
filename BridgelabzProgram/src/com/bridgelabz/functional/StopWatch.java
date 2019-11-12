/******************************************************************************
 *  Compilation:  javac -d bin StopWatch.java
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

public class StopWatch {

	public static void main(String[] args) {
	
	   try {
		
		System.out.println("Enter Start time");
		int start=Utility.ReadInteger();
		
		System.out.println("Enter End time");
		int stop=Utility.ReadInteger();
		
		
		int result=  Utility.StopWatch(start, stop);
		
		System.out.println("elapsed time :"+result);
	   }
	   catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}

	}

}
