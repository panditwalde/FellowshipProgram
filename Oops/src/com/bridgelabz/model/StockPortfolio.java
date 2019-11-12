package com.bridgelabz.model;

public class StockPortfolio {

	private String stock_name;
	private int number_of_share;
	private long share_price;
	private long total_value;
	

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public int getNumber_of_share() {
		return number_of_share;
	}

	public void setNumber_of_share(int number_of_share) {
		this.number_of_share = number_of_share;
	}

	public long getShare_price() {
		return share_price;
	}

	public void setShare_price(long share_price) {
		this.share_price = share_price;
	}

	public long getTotal_value() {
		return total_value;
	}

	public void setTotal_value(long total_value) {
		this.total_value = total_value;
	}

	
	public String toString()
	{
		return stock_name+","+share_price+","+number_of_share+","+total_value;
		
	}

}
