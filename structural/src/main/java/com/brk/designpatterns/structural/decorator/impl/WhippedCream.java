package com.brk.designpatterns.structural.decorator.impl;

import com.brk.designpatterns.structural.decorator.contract.Beverage;
import com.brk.designpatterns.structural.decorator.contract.CondimentDecorator;

public class WhippedCream extends CondimentDecorator {

	public WhippedCream(Beverage beverage) {
		super(beverage);
		this.description = "WhippedCream";
	}

	@Override
	public double cost() {
		return beverage.cost() + 3;
	}

}
