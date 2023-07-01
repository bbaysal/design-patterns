package com.brk.designpatterns.structural.decorator.contract;

public abstract class Beverage {
	protected String description;

	public String getDescription() {
		return this.description + "(" + cost() + ")";
	}

	public abstract double cost();
}
