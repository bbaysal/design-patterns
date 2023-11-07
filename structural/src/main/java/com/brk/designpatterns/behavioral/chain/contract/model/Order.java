package com.brk.designpatterns.behavioral.chain.contract.model;

public class Order {

	private long id;
	private double amount;
	private boolean isAvailable;
	private boolean isValidPayment;

	public Order(long id, double amount, boolean isAvailable, boolean isValidPayment) {
		this.id = id;
		this.amount = amount;
		this.isAvailable = isAvailable;
		this.isValidPayment = isValidPayment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public boolean isValidPayment() {
		return isValidPayment;
	}

	public void setValidPayment(boolean isValidPayment) {
		this.isValidPayment = isValidPayment;
	}

}
