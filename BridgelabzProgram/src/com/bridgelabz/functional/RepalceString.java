
/******************************************************************************
 *  Compilation:  javac -d bin RepalceString.java
 *  Execution:    java -cp bin com.bridgelabz.utility.replacestring    str
 *               
 *  
 *  Purpose:    User Input and Replace String Template “Hello <<UserName>>, How are you?”
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class RepalceString {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the Your name");
		String str=Utility.ReadString();
		
		String result=Utility.replacestring(str);
		
		System.out.println(result);

	}

}
