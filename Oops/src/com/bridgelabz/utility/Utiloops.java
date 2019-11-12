package com.bridgelabz.utility;

import java.io.File;

import com.bridgelabz.model.StockHolder;
import com.bridgelabz.model.StockPortfolio;
import com.bridgelabz.oops.model.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utiloops {

	@SuppressWarnings("rawtypes")
	public static void jsonfilewriter(String path, Map filedata)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(new File(path), filedata);
	}

	@SuppressWarnings("rawtypes")
	public static void jsonfilereader(String path, Map filedata)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(new File(path), filedata);
	}

	@SuppressWarnings("resource")
	public static long storestockdata(StockPortfolio stock[])
			throws JsonGenerationException, JsonMappingException, IOException {

		try {
			long total_stock_value = 0;
			String path = "/home/user/Desktop/pandit/BridgelabzProgram/src/com/bridgelabz/oops/stock.json";

			for (int i = 0; i < stock.length; i++) {

				stock[i] = new StockPortfolio();

				System.out.println("Enter stock name ");
				String stock_name = new Scanner(System.in).nextLine();

				stock[i].setStock_name(stock_name);

				System.out.println("Enter Number of  Share");
				int number_of_share = Utility.ReadInteger();
				stock[i].setNumber_of_share(number_of_share);

				System.out.println("Enter share price");
				long share_price = Utility.readlong();
				stock[i].setShare_price(share_price);

				long stock_value = number_of_share * share_price;
				stock[i].setTotal_value(stock_value);

				total_stock_value = total_stock_value + stock_value;

				stock_value = 0;

			}
			Map<String, StockPortfolio> map = new HashMap<String, StockPortfolio>();

			for (int i = 0; i < stock.length; i++) {
				map.put("stock" + (i + 1) + "", stock[i]);
			}

			Utiloops.jsonfilewriter(path, map);

			return total_stock_value;
		} catch (Exception e) {
			System.out.println("Enter correct input");
		}
		return 0;

	}
	
	
	
	
	
	
	
	
	
	
	
	               /*------------------Commercial data processing ---------------*/
	
	            /*******************************************/
	
	
	
	
	int set = 0;
	String buyer, seller, buy_symbol, sell_symbol;
	int bought_shares = 0, sold_shares = 0;
	int buy_amount = 0, sell_amount = 0;
	int balance_of_buyer = 0;
	LocalDate date;
	LocalTime start_time = null;
	LocalTime end_time = null;

	String path_of_stockHolder = "/home/user/Desktop/pandit/Oops/src/com/bridgelabz/oops/stockholder.json";
	String path_of_companies = "/home/user/Desktop/pandit/Oops/src/com/bridgelabz/oops/company.json";

	// Read Stock Holders
	public List<StockHolder> readStockHolder() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<StockHolder> list_of_buyers = mapper.readValue(new File(path_of_stockHolder),
				new TypeReference<List<StockHolder>>() {
				});
		return list_of_buyers;
	}

	// Read Companies
	public List<Companies> readCompanies() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Companies> list_of_companies = mapper.readValue(new File(path_of_companies),
				new TypeReference<List<Companies>>() {
				});
		return list_of_companies;
	}

	public void writeStockHolder(List<StockHolder> list_of_buyers)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File(path_of_stockHolder), list_of_buyers);
	}

	public void writeCompanies(List<Companies> list_of_companies)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File(path_of_companies), list_of_companies);
	}

	public void stockAccount() throws JsonParseException, JsonMappingException, IOException {
		date = LocalDate.now();
		start_time = LocalTime.now();
		System.out.println(start_time);
		List<StockHolder> list_of_buyers = readStockHolder();
		StockHolder newUser = new StockHolder();
		System.out.println("Enter name of user");
		newUser.setName(Utility.ReadString());
		System.out.println("Enter balance of use");
		newUser.setBalance(Utility.ReadInteger());
		int quantity[] = null;
		String stockHoldings[] = null;
		newUser.setQuantity(quantity);
		newUser.setShareholding(stockHoldings);
		list_of_buyers.add(newUser);
		writeStockHolder(list_of_buyers);
		end_time = LocalTime.now();
		System.out.println("Account created successfully......");
	}

	public void buy(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException {
		date = LocalDate.now();
		start_time = LocalTime.now();
		List<StockHolder> list_of_buyers = readStockHolder();
		List<Companies> list_of_companies = readCompanies();

		System.out.println("Enter name of buyer");
		String buyer = Utility.ReadString();

		int flag_buyer_cheak = 0, flag_symbol_cheak = 0;

		for (StockHolder i : list_of_buyers) {
			if (buyer.equals(i.getName())) {
				flag_buyer_cheak = 1;
				balance_of_buyer = i.getBalance();
				break;
			}
		}

		// Check buyer has account
		if (flag_buyer_cheak != 1) {
			System.out.println("Buyer no account");
			return;
		}

		// Check buyer have sufficient balance
		if (amount > balance_of_buyer) {
			System.out.println("Entered Amount is > balance");
			return;
		}
		int number_of_shares_avaliable = 0;
		int price_per_share = 0;
		for (Companies i : list_of_companies) {
			if (symbol.equals(i.getSymbol())) {
				flag_symbol_cheak = 1;
				number_of_shares_avaliable = i.getShares();
				price_per_share = i.getPrice();
				break;
			}
		}
		// Check buyer enterd sufficient amount to buy atleast one share
		if (amount < price_per_share) {
			System.out.println("Entered amount is < price of one share");
			return;
		}

		// Check requested company is listed at Stock exchange
		if (flag_symbol_cheak != 1) {
			System.out.println("Company not present change it");
			return;
		}

		// Check sufficent number of shares are present
		if (number_of_shares_avaliable * price_per_share < amount) {
			System.out.println("Unsufficient share is present");
			return;
		}
		int number_of_shares_bought = amount / price_per_share;
		int total_value_of_shares = number_of_shares_bought * price_per_share;
		bought_shares = number_of_shares_bought;
		buy_amount = total_value_of_shares;
		this.buyer = buyer;
		buy_symbol = symbol;
		set = 1;
		for (StockHolder i : list_of_buyers) {
			if (buyer.equals(i.getName())) {
				// Reducing balance of buyer account
				i.setBalance(i.getBalance() - total_value_of_shares);

				// adding Bought Share symbol to buyer account
				String[] temp = i.getShareholding();
				int index_of_symbol = 0;
				for (int j = 0; j < temp.length; j++) {
					if (symbol.equals(temp[j])) {
						index_of_symbol = j;
						int quantity[] = new int[temp.length];
						quantity = i.getQuantity();
						quantity[j] = quantity[j] + number_of_shares_bought;
						i.setQuantity(quantity);
						break;
					}
				}
				if (symbol.equals(temp[index_of_symbol])) {

				} else {
					int size_of_share_holdings = i.getShareholding().length + 1;
					String share_holdings[] = new String[size_of_share_holdings];
					System.arraycopy(temp, 0, share_holdings, 0, temp.length);
					share_holdings[size_of_share_holdings - 1] = symbol;
					i.setShareholding(share_holdings);

					// Adding Bought share quantity to buyer account
					int size_of_quantity = i.getQuantity().length + 1;
					int quantity[] = new int[size_of_quantity];
					int temp1[] = i.getQuantity();
					System.arraycopy(temp1, 0, quantity, 0, temp1.length);
					quantity[size_of_quantity - 1] = number_of_shares_bought;
					i.setQuantity(quantity);
					break;
				}
			}

		}

		for (Companies i : list_of_companies) {
			if (symbol.equals(i.getSymbol())) {
				// Adding balance of sold shares
				i.setBalance(i.getBalance() + total_value_of_shares);

				// Substracting Number of shares sold
				i.setShares(i.getShares() - number_of_shares_bought);
			}
		}
		System.out.println("if you want ave transacation press 1 or 0");
		int choice = Utility.ReadInteger();
		if (choice == 1) {
			save(list_of_buyers, list_of_companies);
		}
		end_time = LocalTime.now();
		System.out.println("Transaction done successfully");
		return;

	}

	public void sell(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException {
		date = LocalDate.now();
		start_time = LocalTime.now();
		List<StockHolder> list_of_sellers = readStockHolder();
		List<Companies> list_of_companies = readCompanies();

		System.out.println("Enter name of Seller");
		String seller = Utility.ReadString();

		int flag_seller_cheak = 0;
		// int balance_of_seller = 0;
		StockHolder index_of_seller = null;
		for (StockHolder i : list_of_sellers) {
			if (seller.equals(i.getName())) {
				index_of_seller = i;
				flag_seller_cheak = 1;
				// balance_of_seller = i.getBalance();
				break;
			}
		}

		// Check seller has account
		if (flag_seller_cheak != 1) {
			System.out.println("seller no account");
			return;
		}
		// Check seller have shares of requested company
		String[] shares = index_of_seller.getShareholding();
		boolean check_company = false;
		int index_of_required_symbol = 0;
		for (int i = 0; i < shares.length; i++) {
			if (symbol.equals(shares[i])) {
				index_of_required_symbol = i;
				check_company = true;
			}
		}
		if (check_company == false) {
			System.out.println("Seller donot have requested company shares");
			return;
		}
		// Check seller have sufficient shares
		int price_per_share = 0;
		boolean flag_symbol_cheak = false;
		Companies index_of_company = null;
		for (Companies i : list_of_companies) {
			if (symbol.equals(i.getSymbol())) {
				index_of_company = i;
				flag_symbol_cheak = true;
				price_per_share = i.getPrice();
			}
		}
		int quantity[] = index_of_seller.getQuantity();
		if (amount > quantity[index_of_required_symbol] * price_per_share) {
			System.out.println("Seller do not have sufficient number of shares");
			return;
		}

		// Check buyer enterd sufficient amount to buy atleast one share
		if (amount < price_per_share) {
			System.out.println("Entered amount is less than price of one share");
			return;
		}

		// Check requested company is listed at Stock exchange
		if (flag_symbol_cheak == false) {
			System.out.println(" company is not listesd in stock exchange");
			return;
		}
		if (amount > index_of_company.getBalance()) {
			System.out.println("Company do not have sufficient balance");
			return;
		}

		int number_of_shares_sold = amount / price_per_share;
		int total_value_of_shares = number_of_shares_sold * price_per_share;
		sold_shares = number_of_shares_sold;
		this.seller = seller;
		sell_amount = total_value_of_shares;
		sell_symbol = symbol;
		set = 2;
		index_of_company.setBalance(index_of_company.getBalance() - total_value_of_shares);
		index_of_company.setShares(index_of_company.getShares() + number_of_shares_sold);

		index_of_seller.setBalance(index_of_seller.getBalance() + total_value_of_shares);
		quantity[index_of_required_symbol] = quantity[index_of_required_symbol] - number_of_shares_sold;
		index_of_seller.setQuantity(quantity);

		System.out.println("Want to save then press 1 else press 0");
		int choice = Utility.ReadInteger();
		if (choice == 1) {
			save(list_of_sellers, list_of_companies);
		}
		end_time = LocalTime.now();
		System.out.println("Transaction done successfully");
		return;
	}

	/**
	 * @Purpose - Saves transaction into file
	 * @param list_of_buyers    - accepts list of buyers
	 * @param list_of_companies - accepts list of companies
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	void save(List<StockHolder> list_of_buyers, List<Companies> list_of_companies)
			throws JsonGenerationException, JsonMappingException, IOException {
		writeStockHolder(list_of_buyers);
		writeCompanies(list_of_companies);
		System.out.println("Data save successfully....");
	}

	/**
	 * @Purpose - Calculate net worth of account holder
	 * @return - Returns net worth of account holder
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public double valueOf() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter name of account holder");
		String account_holder = Utility.ReadString();

		List<StockHolder> list_of_account_holders = readStockHolder();
		List<Companies> list_of_companies = readCompanies();

		StockHolder index_of_account = null;
		boolean check_account = false;

		for (StockHolder i : list_of_account_holders) {
			if (account_holder.equals(i.getName())) {
				check_account = true;
				index_of_account = i;
			}
		}
		// validate account holder
		if (check_account == false) {
			
			System.out.println("Account holder is not present");
			return 0;
		}

		double sum = 0;

		int quantity[] = index_of_account.getQuantity();
		int price_per_share = 0;

		String company[] = index_of_account.getShareholding();

		for (int j = 0; j < company.length; j++) {
			for (Companies k : list_of_companies) {
				if (company[j].equals(k.getSymbol())) {
					price_per_share = k.getPrice();
					break;
				}
			}
			sum += (quantity[j] * price_per_share);
		}
		return sum;
	}

	/**
	 * @Purpose - Prints Transaction report
	 */
	public void printReport() {
		System.out.println();
		System.out.println("Date of Transaction :" + date);
		System.out.println("Time :" + (end_time));
		if (set == 1) {
			System.out.println("Name of Buyer :" + buyer);
			System.out.println("Total amount :" + buy_amount);
			System.out.println("Stock name :" + buy_symbol);
			System.out.println("Number of shares purchesed :" + bought_shares);
			System.out.println();
		}
		if (set == 2) {
			System.out.println("Name of Seller :" + seller);
			System.out.println("Total amount :" + sell_amount);
			System.out.println("Stock name :" + sell_symbol);
			System.out.println("Number of shares sold :" + sold_shares);
			System.out.println();
		}

	}

}
