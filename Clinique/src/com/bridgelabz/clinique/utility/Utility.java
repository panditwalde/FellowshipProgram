package com.bridgelabz.clinique.utility;

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
	public static  double  readdouble()
	{
		return scanner.nextDouble();
	}
	
/**********************Integer Array*******************************/
	
	/**
	 * @return   Read Integer value of User
	 */
	public  static int[]  integerarray(int size)
	{ 
		int array[]=new int[size];
		try {
		
	   for( int i=0;i<size;i++)
	   {
		   array[i]=scanner.nextInt();
		   
	   }
	
	   }
	catch(Exception e)
	{
		System.out.println("only integer number is allowed");
	}
	return array;
	}
	
/**********************String Array*******************************/
	
	/**
	 * @return   Read Integer value of User
	 */
	public  static String[]  StringArray(int size)
	{
		String array[]=new String[size];
		try {
	   for( int i=0;i<size;i++)
	   {
		   array[i]=scanner.nextLine();
		   
	   }
	}
		catch(Exception e)
		{
			System.out.println("only S number is allowed");
		}
	   return array;
	}
	
}
