package com.brk.designpatterns.structural.composite.impl;

import com.brk.designpatterns.structural.composite.contract.MenuService;
import com.brk.designpatterns.structural.contract.StructralPattern;

public class CompositePatternImpl implements StructralPattern {

	@Override
	public void apply() {
		MenuService menuService = new MenuServiceImpl();
		menuService.getMenus();
	}

	@Override
	public String getName() {
		return "Composite Pattern";
	}

}
