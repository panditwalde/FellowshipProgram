/******************************************************************************
 *  Compilation:  javac -d bin Hashing.java
 *  Execution:    java -cp bin com.bridgelabz.utility.file    path   
 *                java -cp bin com.bridgelabz.addToHashTable slot filedata 
 *                java -cp bin com.bridgelabz.writeIntoFile path  
 *                
 *  Purpose:     Searching element  in file using Hashing
 *
 *  @author  BridgeLabz
 *  
 *  @version 1.0
 *  @since   23-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Hashingutil;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Hashing {
	public static void main(String[] args)throws Exception
	{
		
		
		try {
		
		String path = "/home/user/Desktop/pandit/BridgelabzProgram/src/com/bridgelabz/datastructure/file";
		int size;
		System.out.println("Enter hash table size");
		size = Utility.ReadInteger();
		Hashingutil<?> slot[] = new Hashingutil[size];
		
		Hashingutil<?> writefile = new Hashingutil<>();

		
		String[] filedata = util.file(path);
		System.out.println(filedata[0].length());

		for (int j = 0; j < filedata.length; j++) 
		{
			
			( writefile).addToHashTable(slot, Integer.parseInt(filedata[j]));
		}
		System.out.println();
		System.out.println("Enetr number to be searched");
		int searchkey = Utility.ReadInteger();
		writefile.addToHashTable(slot, searchkey);

		for (int j = 0; j < 11; j++) {
			System.out.println();
			try {
				slot[j].display();
			} catch (Exception e) {
				System.out.print("null");
			}
		}
		for(int i=0;i<11;i++)
		{ 
			try {
				int size1 = slot[i].size();
				for(int j=0;j<size1;j++)
				{
					writefile.add((int)slot[i].pop());
				}
			}
			catch(Exception e)
			{
				continue;
			}
		}
		System.out.println();
		writefile.display();
		writefile.writeIntoFile(path);
		}
		catch(Exception e)
		{
			System.out.println("Enter only integer");
		}
	}

}
