package com.brk.designpatterns.structural.flyweight.impl;

import javax.naming.SizeLimitExceededException;

import com.brk.designpatterns.structural.flyweight.contract.CarOrder;
import com.brk.designpatterns.structural.flyweight.contract.CarService;

public class CarServiceImpl implements CarService {

	@Override
	public void doOrders() throws SizeLimitExceededException {
		CarOrder carOrder = new CarOrderImpl();

		carOrder.takeOrder("Mercedes Benz", "c300 Coupe", 46000);
		carOrder.takeOrder("Mercedes Benz", "C Class Sedan", 41000);
		carOrder.takeOrder("Nissan", "Altima", 23000);
		carOrder.takeOrder("Volvo", "XC90", 52000);
		carOrder.takeOrder("Mercedes Benz", "C Class Sedan", 43000);
		carOrder.takeOrder("Renault", "Megane", 14000);
		carOrder.takeOrder("Nissan", "Altima", 23000);
		carOrder.takeOrder("Volvo", "XC90", 51000);
		carOrder.takeOrder("Volvo", "XC90", 51500);
		carOrder.takeOrder("Volvo", "XC90", 51000);
		carOrder.takeOrder("Renault", "Megane", 14000);
		carOrder.processOrders();
		carOrder.printCatalogSummary();
	}
}
