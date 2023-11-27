package com.brk.designpatterns.behavioral.interpreter.impl;

import java.util.Arrays;
import java.util.List;

import com.brk.designpatterns.behavioral.interpreter.contract.Expression;

public class FromExpression implements Expression {

	@Override
	public boolean interpret(Query query) {
		List<String> queryWords = Arrays.asList(query.getQuery().split(" "));
		int fromIndex = queryWords.indexOf("FROM");
		int whereIndex = queryWords.indexOf("WHERE");
		boolean isValid = true;
		isValid = isValid && (fromIndex > 1);
		if (whereIndex > 0) {
			isValid = isValid && (fromIndex < whereIndex);
		}
		return isValid;
	}

}