
/******************************************************************************
 *  Compilation:  javac -d bin Binary.java
 *  Execution:    java -cp bin com.bridgelabz.utility.swapNibbles    array
 *                java -cp bin com.bridgelabz.utility.toBinary       n
 *                java -cp bin com.bridgelabz.utility.toDecimal      n                 
 *                java -cp bin com.bridgelabz.utility.powerOf2       n
 *  
 *  Purpose:     binary  number convert into  decimal  using nibble swapping
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.Algoritham;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class Binary {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		try {
			
			
			System.out.println("enter number");
			int[] binary = utility.toBinary(Utility.ReadInteger());
			System.out.println("binary is ");			
			System.out.println(Arrays.toString(binary));
			
			Utility.swapNibbles(binary);
			System.out.println("after swapping ");
			System.out.println(Arrays.toString(binary));
			int swapDec = Utility.toDecimal(binary);
			System.out.println("decimal of swapped binary is " + swapDec);
			 
			if (Utility.powerOf2(swapDec))
				System.out.println("its power of 2");
			else
				System.out.println("not power of 2");

		} catch (Exception e)
		{
			System.out.println("enter input as integer ");
		}

	}

}
