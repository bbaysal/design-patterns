package com.brk.designpatterns.structural.decorator.contract;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return this.beverage.getDescription() + " with " + this.description + "(" + cost() + ")";
	}
}
