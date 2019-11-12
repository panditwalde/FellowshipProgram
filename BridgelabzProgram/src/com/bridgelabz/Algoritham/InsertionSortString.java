/******************************************************************************
 *  Compilation:  javac -d bin InsertionSortString.java
 *  Execution:    java -cp bin com.bridgelabz.utility.InsertionSortIString    array
 *               
 *  
 *  Purpose:     sort  String array using insertion sort
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.Algoritham;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class InsertionSortString {

	public static void main(String[] args) {
	
		try {
		
		 System.out.println("Enter the Array Size"); 
		 int size=Utility.ReadInteger();
	
		 System.out.println("Enter the Array element");
		 String array[]=Utility.StringArray(size);
		  
		System.out.println(Arrays.toString(array));
		
		String result[]=Utility.InsertionSortIString(array);
		
		System.out.println("Print the Sorted List ");
		System.out.println(Arrays.toString(result));
		}
		catch(Exception e)
		{
			System.out.println(" Array size  only  allowed in integer");
		}

	}

}
