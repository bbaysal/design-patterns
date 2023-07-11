package com.brk.designpatterns.structural.flyweight.impl;

import java.util.ArrayList;
import java.util.List;

import javax.naming.SizeLimitExceededException;

import com.brk.designpatterns.structural.flyweight.contract.Car;
import com.brk.designpatterns.structural.flyweight.contract.CarOrder;

public class CarOrderImpl implements CarOrder {
	private final CarCatalog carCatalog = new CarCatalog();
	private List<Car> carOders = new ArrayList<>();

	@Override
	public void takeOrder(String name, String model, double price) throws SizeLimitExceededException {
		Car car = carCatalog.lookup(name, model, price);
		carOders.add(car);
	}

	@Override
	public void processOrders() {
		for (Car car : carOders) {
			System.out.print("Car has ordered: ");
			car.summary();
		}
	}

	@Override
	public void printCatalogSummary() {
		carCatalog.catalogSummary();
	}
}
