package com.brk.designpatterns.structural.flyweight.impl;

import java.util.HashMap;
import java.util.Map;

import javax.naming.SizeLimitExceededException;

import com.brk.designpatterns.structural.flyweight.contract.Car;

//Flyweight factory
public class CarCatalog {

	private final static int MAX_POOL_SIZE = 100;
	private final Map<String, Car> carCatalogMap = new HashMap<String, Car>();

	public Car lookup(String brand, String model, double price) throws SizeLimitExceededException {
		String key = brand + model;

		if (carCatalogMap.containsKey(key)) {
			return carCatalogMap.get(key);
		} else if (carCatalogMap.size() <= MAX_POOL_SIZE) {
			Car car = new CarImpl(brand, model, price);
			carCatalogMap.put(key, car);
			return car;
		}

		throw new SizeLimitExceededException("Catalog size exceeded");
	}

	public void catalogSummary() {
		System.out.println("Ordered item count: " + carCatalogMap.size());
		for (Map.Entry<String, Car> entry : carCatalogMap.entrySet()) {
			entry.getValue().summary();
		}
	}
}
