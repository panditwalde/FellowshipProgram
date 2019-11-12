package com.bridgelabz.observer;

public class Main {

	public static void main(String[] args) {
		Topic topic =new Topic();
		
		
		Observer obj1=new Subscriber("obj1");
		Observer obj2=new Subscriber("obj2");
		Observer obj3=new Subscriber("obj3");
		
		
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);

		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		
		obj1.update();
		
		topic.postmessage("new Message");

	}

}
