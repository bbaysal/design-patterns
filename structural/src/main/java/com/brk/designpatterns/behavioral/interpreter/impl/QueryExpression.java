package com.brk.designpatterns.behavioral.interpreter.impl;

import com.brk.designpatterns.behavioral.interpreter.contract.Expression;

public class QueryExpression implements Expression {
	Expression expression1;
	Expression expression2;

	public QueryExpression(Expression expression1, Expression expression2) {
		super();
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public boolean interpret(Query query) {
		// TODO Auto-generated method stub
		return expression1.interpret(query) && expression2.interpret(query);
	}

}
