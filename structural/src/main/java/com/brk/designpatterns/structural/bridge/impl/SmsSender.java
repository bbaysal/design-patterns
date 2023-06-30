package com.brk.designpatterns.structural.bridge.impl;

import com.brk.designpatterns.structural.bridge.contract.MessageSender;

public class SmsSender extends MessageSender {

	@Override
	public void sendMessage(String text) {
		System.out.println("Sent as a sms - Message: " + text);
	}

}
