package com.brk.designpatterns.structural.flyweight.contract;

import javax.naming.SizeLimitExceededException;

public interface CarOrder {
	void takeOrder(String name, String model, double price) throws SizeLimitExceededException;

	void processOrders();

	void printCatalogSummary();
}
