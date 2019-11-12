package com.bridgelabz.singleton;

public class Eagerinitialization {

	private static final Eagerinitialization instance = new Eagerinitialization();

	// private constructor to avoid client applications to use constructor
	private Eagerinitialization() {
		System.out.println("Eager instance created");
	}

	public static Eagerinitialization getInstance() {
		return instance;
	}

}
