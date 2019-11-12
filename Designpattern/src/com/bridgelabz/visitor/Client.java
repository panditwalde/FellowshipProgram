package com.bridgelabz.visitor;

public class Client {

	public static void main(String[] args) {
		ItemElement[] item = new ItemElement[] { new Book(20, "12345"), new Book(100, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple") };

		System.out.println("Total cost: " + calculateprice(item));

	}

	private static int calculateprice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingcartvisitorImp();
		int sum = 0;
		for (ItemElement item : items) {

			sum = sum + item.accept(visitor);
		}
		
		return sum;
	}

}
