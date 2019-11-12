package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class IntegerPalimdrome {

	public static void main(String[] args) {

		
		System.out.println("Enter the Number");
		int number=Utility.ReadInteger();
		int result=Utility.ispalimdrome(number);
		if(result==1)
		{
			System.out.println("Number is   palimdrome");
		}
		else {
			System.out.println("Number is not Palimdrome");
		}

	}

}
