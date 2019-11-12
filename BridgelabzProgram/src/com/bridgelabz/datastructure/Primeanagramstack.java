/******************************************************************************
 *  Compilation:  javac -d bin primeanagramStack.java
 *  Execution:    java -cp bin com.bridgelabz.utility.palimdromechecker    str , size
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

public class Primeanagramstack {

	public static void main(String[] args) {
		
		
		try {
         int prime[]=Utility.PrimeRange();		 
		 
		 String arr1[][] = util.primeanagram2D(prime);
		 
		 
		 for (int i = 0; i < arr1.length; i++) 
			{
				for (int j = 0; j < arr1.length; j++) 
				{
					if (arr1[i][j] != null) 
					{
						util.push(arr1[i][j]);
		
					
					
					
					}
				}
			}
		 
		 //util.Display();
		 System.out.println("Stack element is Reverse");
		 for (int i = 0; i < arr1.length; i++) 
			{
				for (int j = 0; j < arr1.length; j++) 
				{
					if (arr1[i][j] != null) 
 					{    	
						 Object value=util.pop();
						 System.out.println(value);	
				
                        				
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
