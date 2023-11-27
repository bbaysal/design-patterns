package com.brk.designpatterns.behavioral.interpreter.contract;

import com.brk.designpatterns.behavioral.interpreter.impl.Query;

public interface Expression {
	boolean interpret(Query query);
}
