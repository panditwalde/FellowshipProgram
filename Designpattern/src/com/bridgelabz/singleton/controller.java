package com.bridgelabz.singleton;

public class controller {

	public static void main(String[] args) {

		
		System.out.println("-----------------Eager Initialization-------------------");
		
		Eagerinitialization eager1 = Eagerinitialization.getInstance();
		Eagerinitialization eager2 = Eagerinitialization.getInstance();

		System.out.println("value of eager 1" + eager1.hashCode());
		System.out.println("value of eager 2" + eager2.hashCode());
		
		System.out.println("\n-----------------Lazy Initialization-------------------");
		
		LazyInitializedSingleton lazy1=LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton lazy2=LazyInitializedSingleton.getInstance();
		
		
		System.out.println("value of Lazy 1" + lazy1.hashCode());
		System.out.println("value of Lazy 2" + lazy2.hashCode());
		
		
		
       System.out.println("\n-----------------Bill pugh -------------------");
		
		BillPughSingleton billpugh1=BillPughSingleton.getInstance();
		BillPughSingleton billpugh2=BillPughSingleton.getInstance();
		
		
		System.out.println("value of Bill Pugh 1" + billpugh1.hashCode());
		System.out.println("value of Bill Pugh 2" + billpugh2.hashCode());
		
		
		
		  System.out.println("\n-----------------Serialzation  -------------------");
		  
		  
			
		  SerializedSingleton serial1=SerializedSingleton.getInstance();
		  SerializedSingleton serial2=SerializedSingleton.getInstance();
			
			
			System.out.println("value of serial 1" + serial1.hashCode());
			System.out.println("value of serial 2" + serial2.hashCode());
		
		
		
		
		System.out.println("\n-----------------Stack Block ---------------------------");
		
		
		StaticBlockSingleton  staticblock1=StaticBlockSingleton.getInstance();
		StaticBlockSingleton  staticblock2=StaticBlockSingleton.getInstance();
		
		System.out.println("value of staticblock 1 " + staticblock1.hashCode());
		System.out.println("value of staticblock 2 " + staticblock2.hashCode());
		

	}

}
