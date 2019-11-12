/******************************************************************************
 *  Compilation:  javac -d bin BinarySearch.java
 *  Execution:    java -cp bin com.bridgelabz.utility.countbinarysearchtree    num
 *  
 *  Purpose:      show the how many possible  in binary search tree number
 *
 *  @author  BridgeLabz
 *  
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Binarysearchtree {

	public static void main(String[] args) {
		
		try {
		System.out.println("Enter the number of test cases");
		int num=Utility.ReadInteger();
		System.out.println("Enter the number of nodes");
		
		while(num!=0)
		{
			num--;
			System.out.println(util.countbinarysearchtree(Utility.ReadInteger()));
		}
		}
		catch
		(Exception e)
		{
			System.out.println("Enter only Integer");
		}
		
	
		
		

	}

}
