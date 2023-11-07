package com.brk.designpatterns.behavioral.chain.impl;

import com.brk.designpatterns.behavioral.chain.contract.model.Order;
import com.brk.designpatterns.behavioral.contract.BehavioralPattern;

public class ChainPatternImpl implements BehavioralPattern {

	@Override
	public void apply() {
		OrderHandler orderHandler = new OrderHandler();
		WarehouseHandler warehouseHandler = new WarehouseHandler();
		PaymentHandler paymentHandler = new PaymentHandler();
		ShippingHandler shippingHandler = new ShippingHandler();
		orderHandler.setSuccessor(warehouseHandler);
		warehouseHandler.setSuccessor(paymentHandler);
		paymentHandler.setSuccessor(shippingHandler);

		Order order = new Order(123, 123, true, true);
		orderHandler.process(order);

	}

	@Override
	public String getName() {
		return new String("Chain of responsibility");
	}

}
