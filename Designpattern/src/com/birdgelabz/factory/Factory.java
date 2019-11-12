package com.birdgelabz.factory;

public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Computer pc=ComputerFactory.getComputer("pc", "3 GB", "500 GB", "2.4 GHz");
		
		Computer server=ComputerFactory.getComputer("server", "4 GB", "1 TB", "2.7 GHz");
		
		
		System.out.println("Factory PC Config     : "+pc);
		System.out.println("Factory Server Config : "+server);

	}

}
