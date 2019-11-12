/******************************************************************************
 *  Compilation:  javac -d bin RangePrime.java
 *  Execution:    java -cp bin com.bridgelabz.utility.israngeprime       array
 *                
 *  Purpose:     show all  prime   between range
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019s
 *
 ******************************************************************************/

package com.bridgelabz.Algoritham;

import java.util.ArrayList;
import java.util.Iterator;

import com.bridgelabz.utility.Utility;

public class RangePrime {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the Starting number");
			int first = Utility.ReadInteger();
			System.out.println("Enter the Ending number");
			int last = Utility.ReadInteger();

			ArrayList<Integer> al = Utility.israngeprime(first, last);

			System.out.println("Prime Number Between " + first + " to " + last);

			Iterator<Integer> i = al.iterator();
			while (i.hasNext()) {
				System.out.print(" " + i.next());
			}
		} catch (Exception e) {
			System.out.println("Only Integer Number is  allowed");
		}

	}

}
