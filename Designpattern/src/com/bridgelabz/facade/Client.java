package com.bridgelabz.facade;

import java.util.Scanner;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Shopkeeper sk = new Shopkeeper();
		int ch;
		do {

			System.out.println("1.Samsung");
			System.out.println("2.Realme");
			System.out.println("3.Redme");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			ch = scan.nextInt();
			switch (ch) {
			case 1:
				sk.samsungsale();
				break;
			case 2:
				sk.realmesale();
				break;
			case 3:
				sk.redme();
				break;
			case 4:
				System.out.println("Existing");
				System.exit(0);
				;
			default:
				System.out.println("Wrong Options");
			}

		} while (ch != 4);

	}

}
