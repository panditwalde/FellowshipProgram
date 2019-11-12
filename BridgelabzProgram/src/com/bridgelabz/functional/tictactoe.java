package com.bridgelabz.functional;


import java.util.InputMismatchException;


import com.bridgelabz.utility.Utility;

public class tictactoe {
	
	static String[] board;
	static String turn;

	public static void main(String[] args) {
		
		
		try {
		board = new String[9];
		turn = "X";
		String winner = null;
		Utility.populateEmptyBoard(board);

		System.out.println("Welcome to 2 Player Tic Tac Toe.");
		System.out.println("--------------------------------");
		Utility.printBoard(board);
		System.out.println("X's will play first. Enter a slot number to place X in:");

		while (winner == null)
		{
			int numInput;
			try {
				numInput = Utility.ReadInteger();
				if (!(numInput > 0 && numInput <= 9)) 
				{
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
			} catch (InputMismatchException e) 
			{
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}
			if (board[numInput - 1].equals(String.valueOf(numInput))) 
			{
				board[numInput - 1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				Utility.printBoard(board);
				winner =Utility. checkWinner(board,turn);
			} else {
				System.out.println("Slot already taken; re-enter slot number:");
				continue;
			}
		}
		if (winner.equalsIgnoreCase("draw")) 
		{
			System.out.println("It's a draw! Thanks for playing.");
		} else 
		{
			System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
		}
	
	}
		catch(Exception e)
	{
		System.out.println("Invalid Input..");
	}
}
	
	
	
	
	
	
	
}
