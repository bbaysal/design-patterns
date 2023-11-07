package com.brk.designpatterns.behavioral.chain.contract;

import com.brk.designpatterns.behavioral.chain.contract.model.Order;

public interface Handler {
	public void setSuccessor(Handler successor);
	
	public void process(Order order);
}
