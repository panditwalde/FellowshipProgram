/******************************************************************************
 *  Compilation:  javac -d bin TWoDArray.java
 *  Execution:    java -cp bin com.bridgelabz.utility.arrayInt       row,column 
 *                java -cp bin com.bridgelabz.utility.arrayDouble    row,column 
 *                java -cp bin com.bridgelabz.utility.arrayBoolean   row,column 
 *                
 *  Purpose:     A library for reading in 2D arrays of integers, doubles, or booleans from standard input and 
 *               printing them out to standard output.

 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.io.PrintWriter;

import com.bridgelabz.utility.Utility;

public class TWoDArray {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("1. Array Integer");
			System.out.println("2. Array double");
			System.out.println("3. Array boolean");
			System.out.println("Enter your choice");
			int ch=Utility.ReadInteger();
			switch(ch)
			{
			case 1: {
				PrintWriter pw = new PrintWriter(System.out,true);
				System.out.println("Enter the row");
				int row = Utility.ReadInteger();

				System.out.println("Enter the Column");
				int column = Utility.ReadInteger();
				int[][] a = Utility.arrayInt(row, column);
				
				System.out.println();
				pw.println("2D ARRAY INTEGER");

				for (int i = 0; i < row; i++) 
				{
					for (int j = 0; j < column; j++)
					{
						pw.print("\t" + a[i][j] + " ");
					}
					pw.println("\t");
				}
		
			       }
			break;
			
			case 2: {
				PrintWriter pw = new PrintWriter(System.out,true);
				System.out.println("Enter the row");
				int row = Utility.ReadInteger();

				System.out.println("Enter the Column");
				int column = Utility.ReadInteger();
				
				double[][] b =Utility. arrayDouble(row, column);

				System.out.println();
				pw.println("2D ARRAY DOUBLE");

				for (int i = 0; i < row; i++) 
				{
					for (int j = 0; j < column; j++)
					{
						pw.print("\t" + b[i][j] + " ");
					}
					pw.println("\t");
				}
		
			       }
			break;
			
			case 3: {
				PrintWriter pw = new PrintWriter(System.out,true);
				System.out.println("Enter the row");
				int row = Utility.ReadInteger();

				System.out.println("Enter the Column");
				int column = Utility.ReadInteger();
			
				boolean[][] c =Utility. arrayBoolean(row, column);
				System.out.println();
				pw.println("2D ARRAY BOOLEAN");

				for (int i = 0; i < row; i++)
				{
					for (int j = 0; j < column; j++)
					{
						pw.print("\t" + c[i][j] + " ");
					}
					pw.println("\t");
				}
		
			       }
			break;
			default:System.out.println("Enter valid number");
			}
			
		
		
		
	
	
		
		

		
		

	

		
		}
		catch(Exception e)
		{
			System.out.println("only integer number is allowed");
		}

	}

}
