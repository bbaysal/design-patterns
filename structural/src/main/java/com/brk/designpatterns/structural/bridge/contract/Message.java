package com.brk.designpatterns.structural.bridge.contract;

public abstract class Message {

	protected MessageSender messageSender;

	public Message(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	public abstract void send();

}
