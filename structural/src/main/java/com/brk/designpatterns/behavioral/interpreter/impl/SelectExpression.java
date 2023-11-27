package com.brk.designpatterns.behavioral.interpreter.impl;

import com.brk.designpatterns.behavioral.interpreter.contract.Expression;

// Terminal Expression
public class SelectExpression implements Expression {

	@Override
	public boolean interpret(Query query) {
		return query.getQuery().startsWith("SELECT");
	}

}
