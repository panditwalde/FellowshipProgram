package com.bridgelabz.Algoritham;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

/******************************************************************************
 *  Compilation:  javac -d bin SearchLogic.java
 *  Execution:    java -cp bin com.bridgelabz.utility.binarySearch              array
 *                java -cp bin com.bridgelabz.utility.binarySearchString        array
 *                java -cp bin com.bridgelabz.utility.insertionSort             array
 *                java -cp bin com.bridgelabz.utility.insertionSortString       array
 *                java -cp bin com.bridgelabz.utility.bubbleSort                array
 *                java -cp bin com.bridgelabz.utility.bubbleSortString          array
 *  Purpose:      Word list Using  binary  search element
 *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019s
 *
 ******************************************************************************/
public class SearchLogic {
	
	public static long start=0;
	public static long end=0;
	public static long elapsed;
	static int ch=0;

	public static void main(String[] args) {
		
		
		do
		{ 
			System.out.println("--------Menu for Searching and Sorting----------");
			
			System.out.println("1. BinarySearch  for Integer");
			System.out.println("2. BinarySearch  for String");
			System.out.println("3. InsertionSort  for Integer");
			System.out.println("4. InsertionSort  for String");
			System.out.println("5. BubbleSort for Integer");
			System.out.println("6. BubbleSort for String");
			System.out.println("7. Exit");
			System.out.println();
			System.out.println("Enter Your Choice:");
			int choice=Utility.ReadInteger();
			System.out.println();
	
			switch (choice) 
			{ 
			case 1:
					start=System.currentTimeMillis();
					System.out.println("BinarySearch  For Integer");
					System.out.println("Enter size: ");
					int arraySize=Utility.ReadInteger();
					int a[]=Utility.input1DArray(arraySize);
					Arrays.sort(a);
					Utility.print1DArray(a);
					System.out.println("Enter Key: ");
					int position=Utility.binarySearch(a,Utility.ReadInteger());

					if(position==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+position+" position");
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
					
					
					
			case 2:{
				
					start=System.currentTimeMillis();
					System.out.println("BinarySearch  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize1=Utility.ReadInteger();
					String b[]=Utility.input1DStringArray(arraySize1);
					Arrays.sort(b);
					Utility.print1DStringArray(b);
					System.out.println("Enter Key: ");
					int position1=Utility.binarySearchString(b,Utility.ReadString());

					if(position1==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+position1+" position");
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
					
			      }
					
					
			case 3:{
				
				
				
					start=System.currentTimeMillis();
					System.out.println("InsertionSort  For Integer");
					System.out.println("Enter size: ");
					int arraySize5=Utility.ReadInteger();
					int c[]=Utility.input1DArray(arraySize5);
					Utility.print1DArray(c);
					System.out.println("Enter Key: ");
					int k[]=Utility.insertionSort(c);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k.length;i++)
					{
						System.out.println(k[i]);
					}

					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
					
			       }
					
					
			case 4 :
				
				
				
					start=System.currentTimeMillis();
					System.out.println("InsertionSort  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize4=Utility.ReadInteger();
					String d[]=Utility.input1DStringArray(arraySize4);
					Utility.print1DStringArray(d);
					System.out.println("Enter Key: ");
					String k1[]=Utility.insertionSortString(d);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k1.length;i++)
					{
						System.out.println(k1[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
					
					
					
			case 5:
				
					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For Integer: ");
					System.out.println("Enter size: ");
					int arraySize2=Utility.ReadInteger();
					int e[]=Utility.input1DArray(arraySize2);
					Utility.print1DArray(e);
					System.out.println("Enter Key: ");
					int k2[]=Utility.bubbleSort(e);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k2.length;i++)
					{
						System.out.println(k2[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
					
					
					
			case 6:
				
				
					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize3=Utility.ReadInteger();
					String f[]=Utility.input1DStringArray(arraySize3);
					Utility.print1DStringArray(f);
					System.out.println("Enter Key: ");
					String k3[]=Utility.bubbleSortString(f);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k3.length;i++)
					{
						System.out.println(k3[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
					
					
					
			case 7: 
					System.exit(0);
			default:
					System.out.println("Wrong Input");
					break;
			}
		}
		while(ch<8);

	}

}
