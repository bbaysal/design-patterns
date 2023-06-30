package com.brk.designpatterns.structural.adapter.model;

public class LegacyProduct {
	private String code;
	private String label;
	private String type;
	private double price;

	public LegacyProduct(String code, String label, String type, double price) {
		this.code = code;
		this.label = label;
		this.type = type;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public String getLabel() {
		return label;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}
}
