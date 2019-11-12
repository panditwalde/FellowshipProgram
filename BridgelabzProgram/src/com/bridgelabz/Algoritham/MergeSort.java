/******************************************************************************
 *  Compilation:  javac -d bin MergeSort.java
 *  Execution:    java -cp bin com.bridgelabz.utility.mergesort    array,first ,last
 *               
 *  
 *  Purpose:     sort array using merge sort
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.Algoritham;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		
		
	    try {
		System.out.println("Enter the Array Size");
		int size=Utility.ReadInteger();
		
		System.out.println("Enter the Array element");
		int arr[]=Utility.IntegerArray(size);
		
		
		Utility.mergesort(arr, 0, arr.length-1);
		
		System.out.println("Print the Sorted List ");
		System.out.println(Arrays.toString(arr));
	    }
	    catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}
	}

}
