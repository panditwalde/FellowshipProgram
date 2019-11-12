package com.bridgelabz.oops;

import java.io.IOException;




import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Utiloops;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class StockAccount {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		 
		 Utiloops uo=new Utiloops();
		int ch;
		do {

			System.out.println("1.Create new Account");
			System.out.println("2.Buy Share");
			System.out.println("3.Sell  Share");
			System.out.println("4.print Net worth");
			System.out.println("5.Print  Report");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			ch = Utility.ReadInteger();
			switch (ch) {
			case 1:
				uo.stockAccount();
				break;

			case 2: {
				System.out.println("Enter Amount");
				int amount = Utility.ReadInteger();
				System.out.println("Enter Symbol");
				String Symbol = Utility.ReadString();
				uo.buy(amount, Symbol);

				break;
			}

			case 3: {
				System.out.println("Enter Amount");
				int amount = Utility.ReadInteger();
				System.out.println("Enter Symbol");
				String Symbol = Utility.ReadString();
				uo.sell(amount, Symbol);

				break;
			}

			case 4:
				System.out.println("$ " + uo.valueOf());
				break;
			case 5:
				uo.printReport();
				break;
			case 6:
				System.out.println("Existing ");
				System.exit(0);
				break;

			default:
				
				System.out.println("invalid Options");

			}

		} while (ch != 6);

	}

	

}
