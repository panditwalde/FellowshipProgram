package com.bridgelabz.corespring;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {

	@Override
	public void calling() {
	
		System.out.println("Calling sim using Airtel");
		
	}

	@Override
	public void data() {
		
		System.out.println("Browser internet using Airtel sim card");
		
	}

}
