/******************************************************************************
 *  Compilation:  javac -d bin Queue.java
 *  Execution:    java -cp bin com.bridgelabz.utility.enqueue    value
 *                java -cp bin com.bridgelabz.utility.dequeue 
 *                java -cp bin com.bridgelabz.utility.queuesize 
 *                java -cp bin com.bridgelabz.utility.queuedisplay 
 *          
 *                
 *  Purpose:    Perform all Queue Operations using linked list
 *
 *  @author  BridgeLabz
 *  
 *  @version 1.0
 *  @since   19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;


import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Queue {
	
	
	

	public static void main(String[] args) {
		
		
		try {
		
		 int ch;
			do {
				System.out.println("1.Enqueue");
				System.out.println("2.Dequeue");			
				System.out.println("3.size");
				System.out.println("4.display");
				System.out.println("5.Exit");

				System.out.println("\nEnter your choice ");
				 ch = Utility.ReadInteger();

				switch (ch) {
				case 1: {
					System.out.println("Enter the element");
					int element = Utility.ReadInteger();
					util.enqueue(element);
				}
					break;

				case 2:
					util.dequeue();
					break;
			
				case 3:
					util.queuesize();
					break;
				case 4:
					util.queuedisplay();
					break;
				case 5:
					System.exit(0);
					;
				default:
					System.out.println("invalid choice...");

				}
			} while (ch != 6);
		}
		catch(Exception e)
		{
			System.out.println("Invalid key");
		}

	}

}
