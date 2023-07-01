package com.brk.designpatterns.structural.bridge.impl;

import com.brk.designpatterns.structural.bridge.contract.MessageSender;

public class MailSender extends MessageSender {

	@Override
	public void sendMessage(String text) {
		System.out.println("Sent as a mail - Message: " + text);
	}

}
