package com.brk.designpatterns.structural.adapter.model;

import com.brk.designpatterns.structural.adapter.contract.model.ProductModel;

public class ProductDBModel implements ProductModel {
	private String serial;
	private String name;
	private String category;
	private double price;

	public ProductDBModel(String serial, String name, String category, double price) {
		super();
		this.serial = serial;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Override
	public String getSerial() {
		return this.serial;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getCategory() {
		return this.category;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Serial: " + this.serial + " - Name: " + this.name + " - Category: " + this.category + " - Price: "
				+ this.price;
	}
}
