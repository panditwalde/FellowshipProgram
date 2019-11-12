
/******************************************************************************
 *  Compilation:  javac -d bin Deckofcards.java
 *  Execution:    java -cp bin com.bridgelabz.Deckofcards.getCards
 *                java -cp bin com.bridgelabz.Deckofcards.shuffleCard
 *                java -cp bin com.bridgelabz.Deckofcards.distribute  numberofplayer ,numberofcards
 *  
 *  Purpose:     print deck of card using 2D array
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   1-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;

import java.util.Random;

public class Deckofcards {
	private String[] suits = { "Hearts", "Clubs", "Diamonds", "Spades" };
	private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static String[] cards = new String[52];

	public static void main(String[] args) {
		
		Deckofcards deck = new Deckofcards();

		deck.getCards();
		deck.shuffleCard();
		
		String playerCards[][] = deck.distribute(4, 9);

		deck.displayCards(playerCards);

		
	}

	/**
	 * @param playerCards  display all  deck of cards
	 */
	public void displayCards(String[][] playerCards) {
		
		int i = 1;
		for (String[] playerCard : playerCards) {
			System.out.println();
			System.out.println("player :" + (i++) + " cards : ");

			for (String card : playerCard) {
				System.out.print(card + "  ");
			}
			System.out.println();

		}
		
	}

	/**
	 * @param numOfPlayers
	 * @param numberOfCards
	 * @return
	 */
	public String[][] distribute(int numOfPlayers, int numberOfCards) {
		
		
		String playerCards[][] = new String[numOfPlayers][numberOfCards];
		int k = 0;
		for (int i = 0; i < numOfPlayers; i++) {

			for (int j = 0; j < numberOfCards; j++) {
				playerCards[i][j] = cards[k];
				k++;
			}
		}
		return playerCards;
	}

	/**
	 * 
	 */
	public void shuffleCard() {// shffulecard using random  function
		
		
		Random random = new Random();
		for (int i = 0; i < cards.length; i++)
		{
			int index = random.nextInt(52);
			String temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}

	
	
	/**
	 * @return store in 2d  array
	 */
	public String[] getCards() {
		int i = 0;
		for (String suit : suits) {
			for (String card : ranks) {
				cards[i] = card + "-" + suit;
				i++;
			}
		}
		return cards;
	}

	
}
