package com.brk.designpatterns.structural.composite.impl;

import com.brk.designpatterns.structural.composite.contract.MenuComponent;

public class MenuItem extends MenuComponent {

	public MenuItem(String name, String url) {
		super(name, url);
	}

	@Override
	public String toString() {
		return print(this);
	}
}
