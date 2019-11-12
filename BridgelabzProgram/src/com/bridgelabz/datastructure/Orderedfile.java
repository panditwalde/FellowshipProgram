/******************************************************************************
 *  Compilation:  javac -d bin ListOfNumberFile.java
 *  Execution:    java -cp bin com.bridgelabz.utility.checkbalancedparentheses    eq
 *  
 *  Purpose:     check    balanced Parentheses or not using stack
 *
 *  @author  BridgeLabz
 *  
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;


import java.util.Arrays;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Orderedfile {
	
	
	
	
	


	
	public static void main(String[] args)throws Exception {
		

		try {
			 String path="/home/user/Desktop/pandit/BridgelabzProgram/src/com/bridgelabz/datastructure/file";
			 String[] str=util.file(path);   
			 String[]  sortstr=Utility.insertionSortString(str);	
			 System.out.println(Arrays.toString(sortstr));


			System.out.println("Enter the element");
			int search=Utility.ReadInteger();

			String ser=String.valueOf(search);
			int f=0;         


			for(int i=0;i<sortstr.length;i++)
			{   
				util.add(str[i]);
			}          


			for(int i=0;i<sortstr.length;i++)
			{   

				if(str[i].equals(ser))
				{
					f=1;

				}
			}
			
			util.UnOrderedListDisplay();
			if(f==1)
			{
				util.upop();
			}
			else
			{

				System.out.println("Enter the  position");
				int pos=Utility.ReadInteger();
				util.insert(ser, pos);
			}

			util.UnOrderedListDisplay();
			


		}

		catch(Exception e)
		{
			System.out.println();
		}
       
		  	
			
		
		 
				  
		
		
		

	}

}
