package com.brk.designpatterns.behavioral.chain.impl;

import com.brk.designpatterns.behavioral.chain.contract.Handler;
import com.brk.designpatterns.behavioral.chain.contract.model.Order;

public class WarehouseHandler implements Handler {

	private Handler successor;

	@Override
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	@Override
	public void process(Order order) {
		System.out.println("Warehouse checking...");
		if (order.isAvailable()) {
			System.out.println("Order is available...");
			if (this.successor != null) {
				this.successor.process(order);
			}
		}
		else {
			System.out.println("Order is not available...");
		}
	}

}
