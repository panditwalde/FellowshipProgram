package com.bridgelabz.corespring;

import org.springframework.stereotype.Component;

@Component
public class Vodafone implements Sim {

	@Override
	public void calling() {
		
		
		System.out.println("Calling sim using Vodafone");
	}

	@Override
	public void data() {
		System.out.println("Browser internet using Vodafone sim card");
		
	}

}
