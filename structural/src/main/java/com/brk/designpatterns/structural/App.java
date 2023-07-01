package com.brk.designpatterns.structural;

import java.util.ArrayList;
import java.util.List;

import com.brk.designpatterns.structural.adapter.impl.AdapterPatternImpl;
import com.brk.designpatterns.structural.bridge.impl.BridgePatternImpl;
import com.brk.designpatterns.structural.composite.impl.CompositePatternImpl;
import com.brk.designpatterns.structural.contract.StructralPattern;

public class App {

	private static List<StructralPattern> patterns;

	public static void main(String[] args) {
		addPatterns();
		applyPatterns();
	}

	private static void applyPatterns() {
		patterns.forEach(pattern -> applyPattern(pattern));

	}

	private static void addPatterns() {
		patterns = new ArrayList<>();
		patterns.add(new AdapterPatternImpl());
		patterns.add(new BridgePatternImpl());
		patterns.add(new CompositePatternImpl());
	}

	private static void applyPattern(StructralPattern pattern) {
		System.out.println("---------------" + pattern.getName() + " Begins---------------");
		pattern.apply();
		System.out.println("---------------" + pattern.getName() + " Ends---------------");
	}
}
