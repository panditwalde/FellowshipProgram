package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Unorderedlinkelist {

	public static void main(String[] args) throws Exception {
		try {
		
		  int ch;
			do {
				System.out.println("1.add");
				System.out.println("2.remove");
				System.out.println("3.search");
				System.out.println("4.size");
				System.out.println("5.append");
				System.out.println("6.index ");
				System.out.println("7.insert at position");
				System.out.println("8.pop");
				System.out.println("9.pop At position ");
				System.out.println("10.Display");
				System.out.println("11.exit ");

				System.out.println("\nEnter your choice ");
				 ch = Utility.ReadInteger();

				switch (ch) {
				case 1: {
					System.out.println("Enter the element");

					int element = Utility.ReadInteger();
					util.add(element);
				}
					break;
				case 2:
					util.remove();
					break;
				case 3: {
					System.out.println("Enter the Search element");
					int search = Utility.ReadInteger();
					System.out.println(" Is Element presnt ? :" + util.search(search));
				}
					break;
				case 4:{
					     int size=util.unorderdlistsize();
					    System.out.println("Linked list size :"+size);
					    }
					break;

				
				case 5:{ 
					     util.append();
					
				}
					break;
				case 6: {
					System.out.println("Enter the element");
					int element = Utility.ReadInteger();
					System.out.println(" Element present  is " + util.index(element) + " position");

				}   break;

				case 7: {
					System.out.println("Enter the element");
					int element = Utility.ReadInteger();
					System.out.println("Enter the Position");
					int pos = Utility.ReadInteger();
					util.insert(element, pos);
				}
					break;
				case 8:
					util.pop();
					break;
				case 9: {

					System.out.println("Enter the Position");
					int position = Utility.ReadInteger();
					util.popAtPos(position);
				}
					break;
				case 10:

					util.UnOrderedListDisplay();
					break;
				case 11:
					System.exit(0);

				default:
					System.out.println("invalid choice...");

				}
			} while (ch != 11);
		} catch (Exception e) {
			System.out.println("Inavalid key");
		}

	}

}
