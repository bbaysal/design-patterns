package com.brk.designpatterns.structural.decorator.impl;

import com.brk.designpatterns.structural.decorator.contract.Beverage;
import com.brk.designpatterns.structural.decorator.contract.CoffeeService;

public class CoffeeServiceImpl implements CoffeeService {

	@Override
	public void getOrder() {
		Beverage coffeeWithMocha = new Mocha(new HouseBlend());
		coffeeWithMocha = new WhippedCream(coffeeWithMocha);
		System.out.println(coffeeWithMocha.getDescription());
		System.out.println(coffeeWithMocha.cost());
	}

}
