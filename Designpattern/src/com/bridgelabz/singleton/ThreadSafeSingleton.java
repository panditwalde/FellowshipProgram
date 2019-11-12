package com.bridgelabz.singleton;

public class ThreadSafeSingleton {

	  public static void main(String[] args) {
		
		  
		  Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Eagerinitialization instance1=Eagerinitialization.getInstance();
				System.out.println("Instance 1: "+instance1.hashCode());
				
			}
		});
		
		  
		  Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				Eagerinitialization instance2=Eagerinitialization.getInstance();
				System.out.println("Instance 2: "+instance2.hashCode());
				
			}
		});
		  thread1.start();
		  thread2.start();
	}

}
