package com.brk.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

import com.brk.designpatterns.behavioral.chain.impl.ChainPatternImpl;
import com.brk.designpatterns.behavioral.command.impl.CommandPatternImpl;
import com.brk.designpatterns.behavioral.contract.BehavioralPattern;
import com.brk.designpatterns.behavioral.interpreter.impl.InterpreterPatternImpl;
import com.brk.designpatterns.behavioral.iterator.IteratorPatternImpl;
import com.brk.designpatterns.behavioral.mediator.impl.MediatorPaternImpl;
import com.brk.designpatterns.behavioral.memento.impl.MementoPatternImpl;

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
		patterns.add(new CommandPatternImpl());
		patterns.add(new InterpreterPatternImpl());
		patterns.add(new IteratorPatternImpl());
		patterns.add(new MediatorPaternImpl());
		patterns.add(new MementoPatternImpl());
	}

	private static void applyPattern(BehavioralPattern pattern) {
		System.out.println("---------------" + pattern.getName() + " Begins---------------");
		pattern.apply();
		System.out.println("---------------" + pattern.getName() + " Ends---------------");
	}
}
