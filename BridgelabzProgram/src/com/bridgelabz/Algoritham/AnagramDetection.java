
/******************************************************************************
 *  Compilation:  javac -d bin AnagramDetection.java
 *  Execution:    java -cp bin com.bridgelabz.utility.isAnagram    str1 , str2
 *  
 *  Purpose:     two check two  string is Anagram or not
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algoritham;

import com.bridgelabz.utility.Utility;

public class AnagramDetection {

	public static void main(String[] args) {
		
                    //ddd
		System.out.println("Enter the First String");
		String str1=Utility.ReadString();
		System.out.println("Enter the Second String");
		String str2=Utility.ReadString();
		int result=Utility.isAnagram(str1, str2);
		if(result==1)
		{
			System.out.println("Both String are Anagram");
		}
		else {
			
			System.out.println("Both string are not Anagram");
		}
		
	}

}
