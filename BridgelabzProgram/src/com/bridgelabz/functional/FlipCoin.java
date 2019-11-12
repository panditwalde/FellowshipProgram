/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.utility.IsFlipCoin    trail
 *               
 *  
 *  Purpose:      Flip Coin and print percentage of Heads and Tails
 *  
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		
		try {
		System.out.println("Enter the trail..");
		int trail=Utility.ReadInteger();
		
	    Object a[]=Utility.IsFlipCoin(trail);
	    
	    System.out.println("Head : "+a[0]);
	    System.out.println("Head : "+a[1]);
		 
	    System.out.println("Head Percentage : "+a[2]);
		 
	    System.out.println("Tail  Percentage: "+a[3]);
		}
		catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}
	 
	 
		

	}

	

}
