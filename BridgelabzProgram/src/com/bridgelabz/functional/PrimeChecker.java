package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PrimeChecker {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=Utility.ReadInteger();
		
		int result=Utility.isprime(number);
		if(result==1)
		{
			System.out.println("Number is prime");
			
		}
		else
		{
			System.out.println("Number is not prime");
		}
		

	}

}
