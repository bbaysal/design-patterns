package com.brk.designpatterns.structural.adapter.model;

import com.brk.designpatterns.structural.adapter.contract.model.ProductModel;

public class ProductAgentModel implements ProductModel {
	private String serial;
	private String name;
	private String category;
	private double price;
	private String agent;

	public ProductAgentModel(String serial, String name, String category, double price, String agent) {
		super();
		this.serial = serial;
		this.name = name;
		this.category = category;
		this.price = price;
		this.agent = agent;
	}

	public String getSerial() {
		return serial;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public String getAgent() {
		return agent;
	}

	@Override
	public String toString() {
		return "Serial: " + this.serial + " - Name: " + this.name + " - Category: " + this.category + " - Price: "
				+ this.price;
	}
}
