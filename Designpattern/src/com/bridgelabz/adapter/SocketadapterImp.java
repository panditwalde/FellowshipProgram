package com.bridgelabz.adapter;

public class SocketadapterImp extends Socket implements Socketadapter {

	@Override
	public Volt get120Volt() {

		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convertvolt(v, 10);
	}

	@Override
	public Volt get3Volt() {

		Volt v=getVolt();
		return convertvolt(v, 40);
	}

	private Volt convertvolt(Volt v, int i) {
		// TODO Auto-generated method stub
		return new Volt(v.getVolts() / i);
	}

}
