package com.bridgelabz.datastructure;



import com.bridgelabz.utility.Utility;


public class Primerange2Darray {

	public static void main(String[] args) {       
		
		try {
		   int prime[]=Utility.PrimeRange();
		   
		int arr[][] = new int[10][167];
        System.out.println(("Prime in Range "));
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j < 167; j++) 
			{

				if (prime[j] > ((i) * 100) && prime[j] < ((i + 1) * 100))
				{
                   arr[i][j]=prime[j];
                   
                   System.out.print(" "+arr[i][j]);
				}
			}System.out.println();
		}
		
		}
		catch(Exception e)
		{
			System.out.println("some problem is theres");
		}
		 
	}
	

}
