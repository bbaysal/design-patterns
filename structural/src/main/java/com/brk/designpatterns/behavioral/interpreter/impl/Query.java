package com.brk.designpatterns.behavioral.interpreter.impl;

public class Query {
	private String Query;
	private boolean isValid;

	public String getQuery() {
		return Query;
	}

	public void setQuery(String query) {
		Query = query;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
}
