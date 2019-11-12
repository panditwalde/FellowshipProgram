package com.bridgelabz.observer;

public class Subscriber implements Observer {
	
	
	private String name;
	private Subject topic;
	
	public Subscriber(String nm) {
		
		this.name=nm;
	}
	@Override
	public void update() {
		String msg=(String) topic.getUpdate(this);
		if(msg==null)
		{
			System.out.println(name+"No new message");
		}
		else {
			System.out.println(name+"consuming message  "+msg);
		}
		
	}
	@Override
	public void setSubject(Subject sub) {
		
		this.topic=sub;
	}

}
