package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.util;

public class Calendarstack {

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		util s1=new util();
		@SuppressWarnings("rawtypes")
		util s2=new util();
	
		String[] months= {"", "january","February","march","April","may","june","july","August","September","October","November","December"};
		int[] date = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };		
		
		try {
		System.out.println("Enter the month");
		int month=Utility.ReadInteger();
		System.out.println("Enter the year");
		int year=Utility.ReadInteger();
		
		
		if(month==2 && Utility.CheckLeapyear(year)==1)
		{   
			date[month]=29;
		}
		int arr[][]=new int[6][7];
		
		int day=Utility.dayofweek(1, month, year);
		
		
		int daymonth=date[month];
	

		
		
		
		 
		 int count=1;
		 for(int i=0;i<6;i++)
		 {
			 for(int j=day;j<7;j++)
			 {
				 if(count<=daymonth)
				 {
					 arr[i][j] = count;
					 
					 util.push(arr[i][j]);		
					 count++;
					 
				 }
				 else
				 {
					 break;
				 }
			 }
			 day=0;
		 }
		 		 
		
		 for(int i=0;i<daymonth;i++)
		 {
			util.push(util.pop());
		 }
		 
		
		   s2.reverse();
		
		 
		 
		System.out.println("sun\tMon\tTue\twed\tThu\tFri\tSat");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] == 0)
				{
					System.out.print("\t");
				} else if (arr[i][j] > 9) 
				{
					int val = (int) s2.pop();
					System.out.print(+val + "\t");
				} else {
					int val = (int) s2.pop();
					System.out.print(+val + "\t");
				}
			}
			System.out.println();
		}
		}
		catch(Exception e)
		{
			System.out.println("only Integer is Allowed...");
		}
		

	}

}
