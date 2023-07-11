package com.brk.designpatterns.structural.facade.impl;

import com.brk.designpatterns.structural.facade.contract.HardwarePart;

public class CPU implements HardwarePart {

	@Override
	public void start() {
		System.out.println("CPU has started");
	}

	@Override
	public void stop() {
		System.out.println("CPU has stopped");
	}

}
