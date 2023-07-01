package com.brk.designpatterns.structural.composite.impl;

import java.util.List;

import com.brk.designpatterns.structural.composite.contract.MenuComponent;

public class Menu extends MenuComponent {
	public Menu(String name, String url) {
		super(name, url);
	}

	@Override
	public List<MenuComponent> addComponent(MenuComponent menuComponent) {
		this.components.add(menuComponent);
		return components;
	}

	@Override
	public List<MenuComponent> removeComponent(MenuComponent menuComponent) {
		this.components.remove(menuComponent);
		return components;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(print(this));

		components.forEach(component -> stringBuilder.append(component.toString()));
		return stringBuilder.toString();
	}
}
