package com.brk.designpatterns.structural.decorator.impl;

import com.brk.designpatterns.structural.decorator.contract.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		super();
		this.description = "HouseBlend Coffee";
	}

	@Override
	public double cost() {
		return 10;
	}
}
