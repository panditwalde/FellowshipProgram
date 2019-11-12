/******************************************************************************
 *  Compilation:  javac -d bin BalancedParentheses.java
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
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Balancedparentheses {
	
	
	
	    public static void main(String[] args) {
			///ertkl;
	    
	      try {
	    	System.out.println("Enter Equation.");
	    	
	    	String eq=Utility.ReadString();
	    	  
	         boolean result=util.isbalancedparentheses(eq);
	         	         
	    	if(result==true)
	    	{	    		
	    		
	    		System.out.println("Arithmetic Expression is balanced");   
	    		
	    	}
	    	else 
	    	{
	    		
	    		System.out.println("Arithmetic Expression is not balanced");   
	    		
	    	}
	    	
	    	}
	      catch(Exception e)
	      {
	    	  System.out.println("some problem is there..");
	      }
	    }
	    	
	    	
	    	
		

}
