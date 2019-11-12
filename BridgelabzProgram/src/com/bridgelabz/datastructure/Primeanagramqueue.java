/******************************************************************************
 *  Compilation:  javac -d bin primeanagramQueue.java
 *  Execution:    java -cp bin com.bridgelabz.utility.PrimeRange    
 *  
 *  Purpose:     check   palimdrome  using queue
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Primeanagramqueue {

	public static void main(String[] args) {
		
		
		
		 int prime[]=Utility.PrimeRange();
		 
		 
		 String arr1[][] = util.primeanagram2D(prime);
		 
		 
		 for (int i = 0; i < arr1.length; i++) 
			{
				for (int j = 0; j < arr1.length; j++) 
				{
					if (arr1[i][j] != null) 
					{
						util.enqueue(arr1[i][j]);
					}
				}
			}
		
		 System.out.println("Display all prime anagram in Queue");
          util.queuedisplay();
	}

}
