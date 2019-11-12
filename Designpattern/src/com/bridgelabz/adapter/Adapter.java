package com.bridgelabz.adapter;

public class Adapter {

	public static void main(String[] args) {

		classadapter();

	}

	public static void classadapter() {

		Socketadapter socketadapter = new SocketadapterImp();

		Volt volt3 = getVolt(socketadapter, 3);
		Volt volt12 = getVolt(socketadapter, 12);
		Volt volt120 = getVolt(socketadapter, 120);
		
		System.out.println("V3   Volts :"+volt3.getVolts());
		System.out.println("v12  Volts : "+volt12.getVolts());
		System.out.println("v120 Volts :"+volt120.getVolts());
		
	}

	private static Volt getVolt(Socketadapter socketadapter, int i) {
		switch (i) {
		case 3:return socketadapter.get3Volt();
		case 12:return socketadapter.get12Volt();
		case 120:return socketadapter.get120Volt();
		default:return socketadapter.get120Volt();
			
		}
	
	}

}
