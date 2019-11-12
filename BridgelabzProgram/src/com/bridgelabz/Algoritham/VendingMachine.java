/******************************************************************************
 *  Compilation:  javac -d bin VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.utility.vendingmachine       input
 *                
 *  Purpose:      Find the Fewest Notes to be returned for Vending Machine

 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019s
 *
 ******************************************************************************/
package com.bridgelabz.Algoritham;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
	    try {
	    System.out.println("Enter the Amount");
	    int input=Utility.ReadInteger();
	    Utility.vendingmachine(input);
	    }
	    catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}
	    
	

	}

}
