/******************************************************************************
 *  Compilation:  javac -d bin PalimdromeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.utility.palimdromechecker    str , size
 *  
 *  Purpose:     check   palimdrome  using queue
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Palimdromechecker {
	
	
	

	public static void main(String[] args) {
		
		try {
			System.out.println("Enter the String");
			String str = Utility.ReadString();
			if ((str.matches("^[a-zA-Z]*$")))
			{

				int size = str.length();

				int result = util.palimdromechecker(str, size);
				if (result == 1) {
					System.out.println("a palimdrome");

				} else {
					System.out.println("Not a Palimdrome");

				}
			}

			else {
				System.out.println("Enter  only String");
			}
		} catch (Exception e) {
			System.out.println();

		}
		 
	}

}
