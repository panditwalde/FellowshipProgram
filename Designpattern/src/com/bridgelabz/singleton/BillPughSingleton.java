package com.bridgelabz.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
		System.out.println("bill pugh instance Created");
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
