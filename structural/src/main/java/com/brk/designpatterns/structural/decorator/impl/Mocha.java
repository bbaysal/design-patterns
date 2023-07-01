package com.brk.designpatterns.structural.decorator.impl;

import com.brk.designpatterns.structural.decorator.contract.Beverage;
import com.brk.designpatterns.structural.decorator.contract.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
		this.description = "Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 2;
	}

}
