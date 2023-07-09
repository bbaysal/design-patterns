package com.brk.designpatterns.structural.flyweight.impl;

import com.brk.designpatterns.structural.contract.StructralPattern;
import com.brk.designpatterns.structural.flyweight.contract.CarService;

public class FlyWeightPatternImpl implements StructralPattern {

	@Override
	public void apply() {
		CarService carService = new CarServiceImpl();
		try {
			carService.doOrders();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Flyweight Pattern";
	}

}
