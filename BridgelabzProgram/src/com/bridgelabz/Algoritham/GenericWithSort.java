/******************************************************************************
 *  Compilation:  javac -d bin GenericWithSort.java
 *  Execution:    java -cp bin com.bridgelabz.utility.genbinarySearch    array  search, first ,last
 *                 java -cp bin com.bridgelabz.utility.sort    array 
 *   
 *  Purpose:     Use Generics for Search and Sort Algorithms



 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algoritham;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class GenericWithSort {

	public static void main(String[] args) {
		
		
	     
		 Integer[] num= {44,3,22,667,544,33,4,54};
		 
		 System.out.println("Enter the search element");
		
		 String str[]= {"pandit","ajay","dipak","manoj"};
		
		 
		  System.out.println(" Search Integer :"+Utility.genbinarySearch(num, 3,0,num.length-1));
		  System.out.println(" Search String :"+Utility.genbinarySearch(str, "manoj",0,str.length-1));
		  
		  System.out.println("Sort Integer :"+Arrays.toString(Utility.sort(num)));
		  System.out.println("Sort String  :"+Arrays.toString(Utility.sort(str)));
	      
		   

	}

}
