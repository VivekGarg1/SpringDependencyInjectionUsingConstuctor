package com.home.service;

import com.home.message.Messaging;

public class Communication {
	
	private Messaging messaging;
	
	public Communication(Messaging messaging) {
		super();
		this.messaging=messaging;
	}
	
	public void communicate() {
		messaging.sendMessage();
	}

}
