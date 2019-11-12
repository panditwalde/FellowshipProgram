package com.bridgelabz.model;

public class Customer {

	
	
	   public Customer(String name, int wiproshare, int infosysshare, int tatashare)
    {
		
		this.name = name;
		this.wiproshare = wiproshare;
		this.infosysshare = infosysshare;
		this.tatashare = tatashare;
	}
	String name;
	   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWiproshare() {
		return wiproshare;
	}
	public void setWiproshare(int wiproshare) {
		this.wiproshare = wiproshare;
	}
	public int getInfosysshare() {
		return infosysshare;
	}
	public void setInfosysshare(int infosysshare) {
		this.infosysshare = infosysshare;
	}
	public int getTatashare() {
		return tatashare;
	}
	public void setTatashare(int tatashare) {
		this.tatashare = tatashare;
	}
	private int  wiproshare;
	   private int  infosysshare;
	   private int  tatashare;
	   
	   public String tostring()
	   {
		   StringBuilder sb=new StringBuilder();
		   sb.append(String.format(name,wiproshare,infosysshare,tatashare));
		   return sb.toString();
	   }

}
