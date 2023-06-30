package com.brk.designpatterns.structural.bridge.impl;

import com.brk.designpatterns.structural.bridge.contract.MessageService;
import com.brk.designpatterns.structural.contract.StructralPattern;

public class BridgePatternImpl implements StructralPattern {

	@Override
	public void apply() {
		MessageService messageService = new MessageServiceImpl();
		messageService.sendMessages();
	}

	@Override
	public String getName() {
		return "Bridge Pattern";
	}

}
