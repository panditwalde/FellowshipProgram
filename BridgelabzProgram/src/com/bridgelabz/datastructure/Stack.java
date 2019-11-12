/******************************************************************************
 *  Compilation:  javac -d bin StackWithgenerics.java
 *  Execution:    java -cp bin com.bridgelabz.util.push    element
 *                java -cp bin com.bridgelabz.util.pop    
 *                java -cp bin com.bridgelabz.util.peek    
 *                java -cp bin com.bridgelabz.util.size    
 *                java -cp bin com.bridgelabz.util.display    
 *              
 *  
 *  Purpose:     Perform Stack Operation Using generic
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;


public class Stack{   
	
	public static void main(String[] args) 
	{
		
		   int ch;
		do {
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.size");
			System.out.println("5.display");
			System.out.println("6.Exit");

			System.out.println("\nEnter your choice ");
			 ch = Utility.ReadInteger();

			switch (ch) {
			case 1: {
				System.out.println("Enter the element");
				int element = Utility.ReadInteger();
				util.push(element);
			}
				break;

			case 2:
				int value=util.pop();
				System.out.println(value);
				break;
			case 3:
				util.peek();
				break;
			case 4:
				util.size();
				break;
			case 5:
				util.Display();
				break;
			case 6:
				System.exit(0);
				;
			default:
				System.out.println("invalid choice...");

			}
		} while (ch != 6);
		
		
	}

}
