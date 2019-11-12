/******************************************************************************
 *  Compilation:  javac -d bin Permutation.java
 *  Execution:    java -cp bin com.bridgelabz.utility.permutation    str first, last
 *               
 *  
 *  Purpose:     String permutation in string
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;



import com.bridgelabz.utility.Utility;

public class Permutation {

	public static void main(String[] args) {
	
		
		System.out.println("Enter the String");
		String input = Utility.ReadString();
		if ((input.matches("^[a-zA-Z]*$")))
		{
			Utility.permutation(input, 0, input.length() - 1);
		} 
		else {
			System.out.println("Only String is allowed");
		}
		
				
				
				
		

	}

}
