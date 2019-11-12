package com.bridgelabz.addressbook.utility;

import java.util.Scanner;

public class Utility {
	static Scanner scanner=new Scanner(System.in);
	
	/**********************Integer Scanner*******************************/
		
		/**
		 * @return   Read Integer value of User
		 */
		public static  int  readinteger()
		{
			return scanner.nextInt();
		}
		
		
		
		
	/**********************Long Scanner*******************************/
		
		/**
		 * @return   Read Integer value of User
		 */
		public static  long  readlong()
		{
			return scanner.nextLong();
		}
		
		
		
	/**********************String Scanner*******************************/
		

		/**
		 * @return   Read String value of User
		 */
		public  static  String  readstring()
		{
			return scanner.next();
		}
		
		
		
		

	/**********************Double Scanner*******************************/
		

		/**
		 * @return   Read Double value of User
		 */
		public static  double  ReadDouble()
		{
			return scanner.nextDouble();
		}
		

}
