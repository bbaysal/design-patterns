package com.brk.designpatterns.structural.adapter.model;

import com.brk.designpatterns.structural.adapter.contract.model.ProductModel;

public class ProductAdapterModel implements ProductModel {

	private LegacyProduct instance;

	public ProductAdapterModel(LegacyProduct instance) {
		this.instance = instance;
	}

	@Override
	public String getSerial() {
		return instance.getCode();
	}

	@Override
	public String getName() {
		return instance.getLabel();
	}

	@Override
	public String getCategory() {
		return instance.getType();
	}

	@Override
	public double getPrice() {
		return instance.getPrice();
	}

	@Override
	public String toString() {
		return "Serial: " + getSerial() + " - Name: " + getName() + " - Category: " + getCategory() + " - Price: "
				+ getPrice();
	}
}
