package com.bridgelabz.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Eagerinitialization instanceOne = Eagerinitialization.getInstance();
		SerializedSingleton instanceTwo = null;
		try {
			Constructor[] constructors = SerializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (SerializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
