package com.brk.designpatterns.structural.bridge.impl;

import com.brk.designpatterns.structural.bridge.contract.Message;
import com.brk.designpatterns.structural.bridge.contract.MessageSender;

public class SmsMessage extends Message {

	private String text;

	public SmsMessage(String text, MessageSender messageSender) {
		super(messageSender);
		this.text = text;
	}

	public void send() {
		messageSender.sendMessage(text);
	}
}
