package com.bridgelabz.facade;

public class Shopkeeper {

	private MobileShop samsung;
	private MobileShop realme;
	private MobileShop redme;

	public Shopkeeper() {
		samsung = new Samsung();
		realme = new Realme();
		redme = new Redme();

	}

	public void samsungsale() {

		samsung.moibleno();
		samsung.price();
	}

	public void realmesale() {

		realme.moibleno();
		realme.price();
	}

	public void redme() {
		redme.moibleno();
		redme.price();
	}

}
