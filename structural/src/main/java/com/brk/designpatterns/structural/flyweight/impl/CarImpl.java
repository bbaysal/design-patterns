package com.brk.designpatterns.structural.flyweight.impl;

import com.brk.designpatterns.structural.flyweight.contract.Car;

//Concrete Flyweight
// It has intrinsic members
public class CarImpl implements Car {
	private final String brand;
	private final String model;
	private final double price;

	public CarImpl(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public void summary() {
		System.out.println("Brand: " + this.brand + " - Model: " + this.model);
	}

	@Override
	public String getKey() {
		return this.brand + this.model;
	}
}
