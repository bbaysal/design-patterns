package com.brk.designpatterns.structural.composite.impl;

import com.brk.designpatterns.structural.composite.contract.MenuService;

public class MenuServiceImpl implements MenuService {

	@Override
	public void getMenus() {
		Menu menu = new Menu("Main Menu", "/main");
		MenuItem infoItem = new MenuItem("Info", "/info");
		menu.addComponent(infoItem);

		Menu servicesMenu = new Menu("services", "/services");

		menu.addComponent(servicesMenu);

		MenuItem repairMenu = new MenuItem("Repair", "/repair");
		MenuItem buyMenu = new MenuItem("Buy", "/buy");
		
		// This line throws UnsupportedOperationException due to the MenuItem object dow not support adding.
		// repairMenu.addComponent(menu);

		servicesMenu.addComponent(repairMenu);
		servicesMenu.addComponent(buyMenu);

		System.out.println(menu.toString());
	}

}
