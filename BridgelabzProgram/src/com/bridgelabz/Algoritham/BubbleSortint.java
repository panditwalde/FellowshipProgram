
/******************************************************************************
 *  Compilation:  javac -d bin BubbleSortint.java
 *  Execution:    java -cp bin com.bridgelabz.utility.BubbleSortInt   array
 *  
 *  Purpose:     sort  Integer array using Bubble sort
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algoritham;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BubbleSortint {

	public static void main(String[] args) {
	
		try {
			System.out.println("Enter the Array Size");
			int size = Utility.ReadInteger();

			System.out.println("Enter the Array element");
			int arr[] = Utility.IntegerArray(size);

			int result[] = Utility.BubbleSortInt(arr);

			System.out.println("Print the Sorted List ");
			System.out.println(Arrays.toString(result));
		} 
		catch (Exception e) {
			System.out.println("only integer number is allowed");
		}

	}

}
