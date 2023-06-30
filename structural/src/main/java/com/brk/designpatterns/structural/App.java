package com.brk.designpatterns.structural;

import com.brk.designpatterns.structural.adapter.contract.AdapterPattern;
import com.brk.designpatterns.structural.adapter.impl.AdapterPatternImpl;

public class App {
	public static void main(String[] args) {
		applyAdapter();
	}

	public static void applyAdapter() {
		AdapterPattern adapterPattern = new AdapterPatternImpl();
		adapterPattern.apply();
	}
}
