package com.brk.designpatterns.structural.facade.impl;

import com.brk.designpatterns.structural.contract.StructralPattern;
import com.brk.designpatterns.structural.facade.contract.ComputerService;

public class FacadePatternImpl implements StructralPattern {

	/**
	 * This facade class reduces the complexity which exists in the back of the scenes. With this class, 
	 * the client only needs to use ComputerService interface to start and stop the computer. 
	 * The other operations are abstracted from the client. 
	 */
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
