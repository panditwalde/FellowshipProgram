/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramPalindrome.java
 *  Execution:    java -cp bin com.bridgelabz.utility.isprimeanagarm       array
 *                java -cp bin com.bridgelabz.utility.isprimepalimdrome    array
 *  
 *  Purpose:     show all  prime anagram and prime palimdrome between range
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019s
 *
 ******************************************************************************/


package com.bridgelabz.Algoritham;

import com.bridgelabz.utility.Utility;

public class PrimeAnagramPalindrome {

	public static void main(String[] args) {
		
	
		System.out.println("1.PrimeAnagram");
		System.out.println("2.PrimePalimdrome");
		System.out.println("Enter your choice..");
		int ch=Utility.ReadInteger();
		
		int result[]=Utility.PrimeRange();
		
		switch(ch)
		{
		case 1:Utility.isprimeanagarm(result);
		       break;
		       
		case 2:Utility.isprimepalimdrome(result); 
		       break;
		 default: 
			  System.out.println("Wrong Choice...");
		}
		
		
	

	}

}
