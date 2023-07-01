package com.brk.designpatterns.structural.bridge.impl;

import com.brk.designpatterns.structural.bridge.contract.Message;
import com.brk.designpatterns.structural.bridge.contract.MessageSender;

public class MailMessage extends Message {

	private String mail;

	public MailMessage(String mail, MessageSender messageSender) {
		super(messageSender);
		this.mail = mail;
	}

	public void send() {
		messageSender.sendMessage(mail);
	}
}
