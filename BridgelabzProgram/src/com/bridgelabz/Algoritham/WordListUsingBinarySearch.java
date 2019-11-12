/******************************************************************************
 *  Compilation:  javac -d bin WordListUsingBinarySearch.java
 *  Execution:    java -cp bin com.bridgelabz.utility.WordList       search
 *                
 *  Purpose:      Word list Using  binary  search element
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019s
 *
 ******************************************************************************/

package com.bridgelabz.Algoritham;



import com.bridgelabz.utility.Utility;

public class WordListUsingBinarySearch {

	public static void main(String[] args)throws Exception
	{
		
		
		System.out.println("Enter the Search  Word");
		String search = Utility.ReadString();

		int result = Utility.WordList(search);
		if (result == -1) 
		{
			System.out.println("String not found...");
		} else
		{
			System.out.println("String is Found");
		}

	}

}
