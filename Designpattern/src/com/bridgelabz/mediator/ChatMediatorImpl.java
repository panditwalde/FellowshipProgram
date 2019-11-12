package com.bridgelabz.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;

	public ChatMediatorImpl() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void sendmessage(String msg, User user) {

		for (User u : this.users) {
			if (u != user) {
				u.receive(msg);
			}
		}

	}

	@Override
	public void adduser(User user) {
		this.users.add(user);

	}

}
