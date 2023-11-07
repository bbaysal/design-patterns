package com.brk.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

import com.brk.designpatterns.behavioral.chain.impl.ChainPatternImpl;
import com.brk.designpatterns.behavioral.contract.BehavioralPattern;

public class App {

	private static List<BehavioralPattern> patterns;

	public static void main(String[] args) {
		addPatterns();
		applyPatterns();
	}

	private static void applyPatterns() {
		patterns.forEach(pattern -> applyPattern(pattern));

	}

	private static void addPatterns() {
		patterns = new ArrayList<>();
		patterns.add(new ChainPatternImpl());
	}

	private static void applyPattern(BehavioralPattern pattern) {
		System.out.println("---------------" + pattern.getName() + " Begins---------------");
		pattern.apply();
		System.out.println("---------------" + pattern.getName() + " Ends---------------");
	}
}
