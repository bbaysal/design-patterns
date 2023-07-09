package com.brk.designpatterns.structural.facade.impl;

import com.brk.designpatterns.structural.facade.contract.HardwarePart;

public class HDD implements HardwarePart {

	@Override
	public void start() {
		System.out.println("HDD has started");
	}

	@Override
	public void stop() {
		System.out.println("HDD has stopped");
	}

}
