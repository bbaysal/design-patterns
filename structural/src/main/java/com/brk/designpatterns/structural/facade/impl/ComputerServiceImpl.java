package com.brk.designpatterns.structural.facade.impl;

import com.brk.designpatterns.structural.facade.contract.ComputerService;

public class ComputerServiceImpl implements ComputerService {

	private CPU cpu;
	private GPU gpu;
	private HDD hdd;

	@Override
	public void startComputer() {
		cpu = new CPU();
		gpu = new GPU();
		hdd = new HDD();
		cpu.start();
		gpu.start();
		hdd.start();
	}

	@Override
	public void stopComputer() {
		cpu.stop();
		gpu.stop();
		hdd.stop();
	}

}
