package com.bridgelabz.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

	private List<Observer> observer;
	private String message;
	private boolean changed;
	private final Object mutex = new Object();

	public Topic() {
		this.observer = new ArrayList<Observer>();
	}

	public void register(Observer obj) {
		if (obj == null)
			throw new NullPointerException("null Observer");
		synchronized (mutex) {
			if (!observer.contains(obj))
				observer.add(obj);

		}

	}

	public void unregister(Observer obj) {
		synchronized (mutex) {
			observer.remove(obj);
		}

	}

	public void notifyObservers() {
		
		
		List<Observer>observerlocal=null;
		synchronized (mutex) {
			if(!changed) 
				return;
			observerlocal=new ArrayList<Observer>(this.observer);
			this.changed=false ;
				
			
		}
		for(Observer obj:observerlocal)
		{
			obj.update();
		}

	}

	public Object getUpdate(Observer obj) {

		return this.message;
	}
	
	public void postmessage(String msg)
	{
		System.out.println("msg Posted to topic: "+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}
	
	
	

}
