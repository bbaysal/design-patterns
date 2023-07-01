package com.brk.designpatterns.structural.bridge.impl;

import com.brk.designpatterns.structural.bridge.contract.MessageService;

public class MessageServiceImpl implements MessageService {

	@Override
	public void sendMessages() {
		SmsMessage smsMessage = new SmsMessage("Sample SMS Message", new SmsSender());
		MailMessage mailMessage = new MailMessage("Sample mail message", new MailSender());
		smsMessage.send();
		mailMessage.send();
	}

}
