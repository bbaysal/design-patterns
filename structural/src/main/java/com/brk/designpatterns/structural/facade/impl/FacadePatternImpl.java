package com.brk.designpatterns.structural.facade.impl;

import com.brk.designpatterns.structural.contract.StructralPattern;
import com.brk.designpatterns.structural.facade.contract.ComputerService;

public class FacadePatternImpl implements StructralPattern {

	@Override
	public void apply() {
		ComputerService computerService = new ComputerServiceImpl();
		computerService.startComputer();
		computerService.stopComputer();
	}

	@Override
	public String getName() {
		return "Facade Pattern";
	}

}
