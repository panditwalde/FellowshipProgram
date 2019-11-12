/******************************************************************************
 *  Compilation:  javac -d bin CouponNumber.java
 *  Execution:    java -cp bin com.bridgelabz.utility.permutation    size
 *               
 *  
 *  Purpose:      generate random distinct coupon number
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.HashSet;
import java.util.Iterator;

import com.bridgelabz.utility.Utility;

public class CouponNumber {

	public static void main(String[] args) {
	
		try {
			System.out.println("Enter how many coupon you want...");
			int size = Utility.ReadInteger();
			HashSet<String> hs = Utility.IsCouponNumber(size);
			int count = 0;
			Iterator<String> i = hs.iterator();
			while (i.hasNext()) {
				count++;
				System.out.println(i.next());
			}
			System.out.println("all distinct numbers are :" + count);
		} 
		catch (Exception e) {
			System.out.println("only integer number is allowed");
		}
	}

}
