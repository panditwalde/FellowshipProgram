package com.bridgelabz.mediator;

public class UserImpl  extends User{

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
		
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendmessage(msg, this);
		
	}

	@Override
	public void receive(String msg) {
		
		
		System.out.println(this.name+": Received Message:"+msg);
		
	}

}
