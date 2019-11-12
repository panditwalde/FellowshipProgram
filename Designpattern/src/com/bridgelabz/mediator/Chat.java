package com.bridgelabz.mediator;

public class Chat {

	public static void main(String[] args) {
		ChatMediator mediator=new ChatMediatorImpl();
		
		User user1= new UserImpl(mediator, "pandit");
		User user2= new UserImpl(mediator, "ajay");
		User user3= new UserImpl(mediator, "dipak");
		User user4= new UserImpl(mediator, "ravi");
		
		mediator.adduser(user1);
		mediator.adduser(user2);
		mediator.adduser(user3);
		mediator.adduser(user4);
		
		
		user2.send("hi All");
	}

}
