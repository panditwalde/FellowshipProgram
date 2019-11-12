package com.bridgelabz.visitor;

public class Book  implements ItemElement {

	
	
	
	private int  price;
	private String  isbnnumber;
	public Book(int cost, String isbn) {
	
		this.price = cost;
		this.isbnnumber = isbn;
	}
	
	
	
	public int getPrice() {
		return price;
	}



	public String getIsbnnumber() {
		return isbnnumber;
	}



	@Override
	public int accept(ShoppingCartVisitor visitor) {
		
		return visitor.visit(this);
	}

}
