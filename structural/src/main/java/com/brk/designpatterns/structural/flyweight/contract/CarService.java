package com.brk.designpatterns.structural.flyweight.contract;

import javax.naming.SizeLimitExceededException;

public interface CarService {
	void doOrders() throws SizeLimitExceededException;
}
