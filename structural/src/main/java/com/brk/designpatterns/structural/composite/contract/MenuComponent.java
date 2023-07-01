package com.brk.designpatterns.structural.composite.contract;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	String name;
	String url;

	protected List<MenuComponent> components;

	public MenuComponent(String name, String url) {
		this.name = name;
		this.url = url;

		components = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public String getUrl() {
		return this.url;
	}

	public List<MenuComponent> addComponent(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature is not supported at this level");
	}

	public List<MenuComponent> removeComponent(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature is not supported at this level");
	}

	public abstract String toString();

	protected String print(MenuComponent component) {
		StringBuilder stringBuilder = new StringBuilder(name);
		stringBuilder.append(": ");
		stringBuilder.append(url);
		stringBuilder.append(" \n");
		return stringBuilder.toString();
	}

}
