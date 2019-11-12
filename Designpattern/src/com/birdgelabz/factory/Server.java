package com.birdgelabz.factory;

public class Server extends Computer {

	private String ram;
	private String cpu;
	private String hdd;

	public Server(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {

		return this.ram;
	}

	@Override
	public String getCPU() {

		return this.cpu;
	}

	@Override
	public String getHDD() {

		return this.hdd;
	}

}
