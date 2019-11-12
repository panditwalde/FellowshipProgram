/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagram2DArray.java
 *  Execution:    java -cp bin com.bridgelabz.utility.primeanagram2D    arr
 *  
 *  Purpose:      display all prime anagram in 2D array
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   19-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;


import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;


public class Primeanagram2Darray {
	
	public static void main(String[] args) {
		
		
		
		int arr[] = Utility.PrimeRange();

		String arr1[][] = util.primeanagram2D(arr);

		System.out.println(" Prime  Anagram  ");

		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr1.length; j++) 
			{
				if (arr1[i][j] != null) 
				{
					System.out.println(arr1[i][j]);
				}
			}
		}
	}

}
