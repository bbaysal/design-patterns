package com.brk.designpatterns.structural.decorator.impl;

import com.brk.designpatterns.structural.decorator.contract.Beverage;

public class DeCaf extends Beverage {

	public DeCaf() {
		this.description = "DeCafe Coffee";
	}

	@Override
	public double cost() {
		return 5;
	}

}
