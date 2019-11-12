/******************************************************************************
 *  Compilation:  javac -d bin guessNumber.java
 *  Execution:    java -cp bin com.bridgelabz.utility.findyournumber    first ,last
 *               
 *  
 *  Purpose:     check  your guess number using binary  search
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.Algoritham;



import com.bridgelabz.utility.Utility;

public class guessNumber {

	public static void main(String[] args) {
	
		
		 System.out.println("Enter the First Number");
		 int first=Utility.ReadInteger();
		 System.out.println("Enter the Last Number");
		 int last=Utility.ReadInteger();
		 
		 int result=Utility.findyournumber(first,last);
		 System.out.println("Your Guess Number "+result);
		
		 

	}

}
