/******************************************************************************
 *  Compilation:  javac -d bin bankingCashcounter.java
 *  Execution:    java -cp bin com.bridgelabz.utility.checkbalancedparentheses    eq
 *  
 *  Purpose:     perform banking cash counter  service
 *
 *  @author  BridgeLabz
 *  
 *  @version 1.0
 *  @since   21-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Bankingcashcounter {

	public static void main(String[] args) {
	
		
		try {
		System.out.println("Enter number of Customer");
		int customer=Utility.ReadInteger();
		long balance=2000;
		int choice ,amount;
		for(int i=0;i<customer;i++)
		{
			util.enqueue(i);
		}
		
		while(util.isEmpty()==true)
		{
			System.out.println("Enter your  choice.");
			System.out.println("1.withdraw money\n 2.diposit money");
			choice=Utility.ReadInteger();
			
			switch (choice) 
			{
			case 1: {
				System.out.println("Enter the amount ");
				amount=Utility.ReadInteger();
				balance=util.withdraw(balance,amount);
				util.dequeue();
				System.out.println("Total balance is "+balance);
				break;

			}
				
			case 2: {
				System.out.println("Enter the amount ");
				amount=Utility.ReadInteger();
				balance=util.diposit(balance,amount);
				util.dequeue();
				System.out.println("Total balance is "+balance);
				break;

			}
			
			default:
				System.out.println("Wrong choice..");
			}
		}
		
		System.out.println("Total balance is "+balance);
		}
		catch(Exception e)
		{
			System.out.println("Inavalid key..");
		}

	}

}
