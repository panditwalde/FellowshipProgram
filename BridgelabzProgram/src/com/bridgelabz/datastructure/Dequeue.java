/******************************************************************************
 *  Compilation:  javac -d bin Dequeue.java
 *  Execution:    java -cp bin com.bridgelabz.utility.add_front     element
 *                java -cp bin com.bridgelabz.utility.add_rear     element
 *                java -cp bin com.bridgelabz.utility.remove_first     
 *                java -cp bin com.bridgelabz.utility.remove_last     
 *                java -cp bin com.bridgelabz.utility.size     
 *                java -cp bin com.bridgelabz.utility.queuedisplay     
 *  
 *  Purpose:     perform all Dequeue Operation
 *
 *  @author  BridgeLabz
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Dequeue {

	public static void main(String[] args) {
		
		
		try {
		  int ch;
			do {
				System.out.println("Dequeue Opration");
				System.out.println("1.AddFront");
				System.out.println("2.AddRear");
				System.out.println("3.RemoveFirst");
				System.out.println("4.RemoveLast");
				System.out.println("5.Queue Size");
				System.out.println("6.display");
				System.out.println("7.Exit");

				System.out.println("\nEnter your choice ");
				 ch = Utility.ReadInteger();

				switch (ch) {
				case 1: {
					System.out.println("Enter the element");
					int element = Utility.ReadInteger();
					util.add_front(element);
				}
					break;

				case 2: {
					System.out.println("Enter the element");
					int element = Utility.ReadInteger();
					util.add_rear(element);
				}
					break;

				case 3:
					util.remove_first();
					break;
				case 4:
					util.remove_last();
					break;
				case 5:
					util.size();
					break;
				case 6:
					util.queuedisplay();
					break;
				case 7:
					System.exit(0);
					
				default:
					System.out.println("invalid choice...");

				}
			} while (ch != 7);
		
		}
		catch(Exception e)
		{
			System.out.println("Enter Integer Number");
		}

	}

}
