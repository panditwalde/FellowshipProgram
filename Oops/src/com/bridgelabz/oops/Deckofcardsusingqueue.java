
/******************************************************************************
 *  Compilation:  javac -d bin Deckofcardsusingqueue.java
 *  Execution:    java -cp bin com.bridgelabz.Deckofcards.getCards
 *                java -cp bin com.bridgelabz.Deckofcards.shuffleCard
 *                java -cp bin com.bridgelabz.Deckofcards.distribute  numberofplayer ,numberofcards
 *  
 *  Purpose:     print deck of card using queue
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   1-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;

import com.bridgelabz.utility.util;

public class Deckofcardsusingqueue   extends Deckofcards{

	public static void main(String[] args) {
   
		     Deckofcards dc=new Deckofcardsusingqueue();
		     dc.getCards();
		     dc.shuffleCard();
		     
		     
		     String playercards[][]=dc.distribute(4, 9);
		     
		     int i=1;
		     for(String [] playcard:playercards)
		     {
		    	 
		    	 System.out.println();
		    	 System.out.print("Player "+(i++)+"Cards: ");
		    	 for(String card:playcard)
		    	 {
		    		 util.enqueue(card);
		    		 System.out.print(card+" ");
		    	 }
		     }
		     
		     

	}

}
