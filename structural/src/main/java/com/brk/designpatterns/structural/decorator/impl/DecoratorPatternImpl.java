package com.brk.designpatterns.structural.decorator.impl;

import com.brk.designpatterns.structural.contract.StructralPattern;
import com.brk.designpatterns.structural.decorator.contract.CoffeeService;

public class DecoratorPatternImpl implements StructralPattern {

	@Override
	public void apply() {
		CoffeeService coffeeService = new CoffeeServiceImpl();
		coffeeService.getOrder();
	}

	@Override
	public String getName() {
		return "Decorator Pattern";
	}

}
