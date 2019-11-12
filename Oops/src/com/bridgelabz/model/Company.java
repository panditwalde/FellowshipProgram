package com.bridgelabz.model;

public class Company {

	public Company(String company_name, String symbol, int share, int share_price) 
	{
		
		this.company_name = company_name;
		this.symbol = symbol;
		this.share = share;
		this.share_price = share_price;
	}

	String company_name;

	public String getCompany_name() 
	{
		return company_name;
	}

	public void setCompany_name(String company_name)
	{
		this.company_name = company_name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getShare() {
		return share;
	}

	public void setShare(int share) {
		this.share = share;
	}

	public int getShare_price() {
		return share_price;
	}

	public void setShare_price(int share_price) {
		this.share_price = share_price;
	}

	String symbol;
	int share;
	int share_price;
	public String tostring()
	   {
		   StringBuilder sb=new StringBuilder();
		   sb.append(String.format(company_name,symbol,share,share_price));
		   return sb.toString();
	   }

}
