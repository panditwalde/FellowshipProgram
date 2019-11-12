/******************************************************************************
 *  Compilation:  javac -d bin sumofThreeNumber.java
 *  Execution:    java -cp bin com.bridgelabz.utility.Issumofthree    array
 *               
 *  
 *  Purpose:      Sum of three Integer adds to ZERO

 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class sumofThreeNumber {

	public static void main(String[] args) {
		
        try {
		System.out.println("Enter the Array size");
		int size=Utility.ReadInteger();
		
		System.out.println("Enter the  "+size+" Number size array");
		int arr[]=Utility.IntegerArray(size);
		for(int i=0;i<size;i++)
		{
			arr[i]=Utility.ReadInteger();
			
		}
		int sum= Utility.Issumofthree(arr);
		System.out.println("sum "+sum);
        }
        catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}

	}

}
