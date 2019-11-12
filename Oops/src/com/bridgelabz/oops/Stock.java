package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import java.util.Map;

import com.bridgelabz.model.StockPortfolio;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Utiloops;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Stock {
	
	
	

	static String path = "/home/user/Desktop/pandit/Oops/src/com/bridgelabz/oops/stock.json";

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		try {

		System.out.println("Enter number of stock");
		int stock = Utility.ReadInteger();

		
		StockPortfolio[] stockport = new StockPortfolio[stock];

		long total_stock_value = Utiloops.storestockdata(stockport);

		ObjectMapper mapper = new ObjectMapper();
		
		Map<String,StockPortfolio> map = mapper.readValue(new File(path), new TypeReference<Map<String,StockPortfolio>>() {
		});
     
		  System.out.println("Stock name  stock share  share price  stock value");
		
		map.forEach((k,v) -> System.out.println( v.getStock_name()+"\t\t"+v.getNumber_of_share()+"\t\t"+v.getShare_price()+" \t"+v.getTotal_value()));
			
	
	
		System.out.println("Total value of Stock :" + total_stock_value);
		}
		catch(Exception e)
		{
			System.out.println("only Integer number is allowed");
		}

	}
	

}
