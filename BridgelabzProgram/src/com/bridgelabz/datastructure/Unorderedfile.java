package com.bridgelabz.datastructure;




import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;



public class Unorderedfile {  
	
	  
	

	public static void main(String[] args) throws Exception{
		
		try {
			
			 String path="/home/user/Desktop/pandit/BridgelabzProgram/src/com/bridgelabz/datastructure/file1";
		String[] str = util.file(path);
		for (int i = 0; i < str.length; i++) {
			util.add(str[i]);
		}
		util.UnOrderedListDisplay();

		System.out.println("Enter the search string");
		String sear = Utility.ReadString();
		String word = util.search(sear);

		if (sear == word) {

			util.add(word);
		} else {

			util.count(word);
		}

		String newdata = util.UnOrderedListDisplay();

		util.appned(newdata,path);
		}
		catch(Exception e)
		{
			System.out.println("some problem is there...");
		}
       
		
	}

}
