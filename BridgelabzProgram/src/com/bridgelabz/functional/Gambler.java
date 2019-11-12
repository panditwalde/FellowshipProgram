/******************************************************************************
 *  Compilation:  javac -d bin Gambler.java
 *  Execution:    java -cp bin com.bridgelabz.utility.gambler    Stake ,goal,trail
 *               
 *  
 *  Purpose:      Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke 
 *                (i.e. has no money) or reach $goal.
 *   *
 *  @author  pandit walde
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the Stake");
			int stake = Utility.ReadInteger();
			System.out.println("Enter the Goal");
			int goal = Utility.ReadInteger();
			System.out.println("Enter the Trail");
			int trail = Utility.ReadInteger();

			Object result[] = Utility.gambler(stake, goal, trail);

			System.out.println("Win :" + result[0]);
			System.out.println("Loss :" + result[1]);
			System.out.println("Winning Percentage :" + result[2]);
			System.out.println("Los" + "" + "" + "ing Percentage  :" + result[3]);
			
		}
		catch (Exception e) 
		{
			System.out.println("only integer number is allowed");
		}
	
	}

}
