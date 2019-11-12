package com.bridgelabz.Algoritham;



import com.bridgelabz.utility.Utility;

public class RegularExpression {

	public static void main(String[] args) 
	{
		
		
	      
		String str[]="Hello <<name>> ,We have your full name as <<fullname>> in our system. your contact number is 91- xxxxxxxxxx .Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016 . ".split(" ");
		System.out.println("Enter the Name");
		String name=Utility.ReadString();
		Utility.Regexstring(str, name );
		
		
		System.out.println("Enter full name");
		String fullname=Utility.ReadString();
		Utility. Regexstringfull(str,fullname);
		
		
		System.out.println("Enter moible number");
		String moibleno=Utility.ReadString();	
		Utility. Regexstringmoible(str,moibleno);
		Utility. regexdate(str);
		 
		

		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(" " + str[i]);
		}
		
		
		
		
		
		
		
	      
		
		
	}

}
