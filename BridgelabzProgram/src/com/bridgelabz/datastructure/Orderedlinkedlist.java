package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Orderedlinkedlist {
	public static void main(String[] args) {

		try {

			int ch;
			do {
				System.out.println("1.add");
				System.out.println("2.remove");
				System.out.println("3.search");
				System.out.println("4.size");
				System.out.println("5.index");
				System.out.println("6.pop");
				System.out.println("7.pop At Position");
				System.out.println("8.Display");
				System.out.println("9.Exit");

				System.out.println("\nEnter your choice ");
				ch = Utility.ReadInteger();

				switch (ch) {
				case 1: {
					System.out.println("Enter the element");

					int element = Utility.ReadInteger();
					util.orderadd(element);
				}
					break;

				case 3: {
					System.out.println("Enter the Search element");
					int search = Utility.ReadInteger();
					System.out.println(" Is Element presnt ? :" + util.ordersearch(search));
				}
					break;

				case 4: {
					int size = util.orderdlistsize();
					System.out.println("Linked list size :" + size);
				}
					break;
				case 5: {
					System.out.println("Enter the element");
					int element = Utility.ReadInteger();
					System.out.println(" Element present  is " + util.orderindex(element) + " position");

				}

					break;

				case 6:
					util.orderpop();
					break;
				case 7: {

					System.out.println("Enter the Position");
					int position = Utility.ReadInteger();
					util.orderpopAtPos(position);
				}
					break;

				case 8:
					util.OrderedListDisplay();
					break;
				case 9:
					System.exit(0);

				default:
					System.out.println("invalid choice...");

				}
			} while (ch != 9);
		} catch (Exception e) {
			System.out.println("Inavalid key");
		}

	}

}
