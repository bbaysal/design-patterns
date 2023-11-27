package com.brk.designpatterns.behavioral.interpreter.impl;

import java.util.ArrayList;
import java.util.List;

import com.brk.designpatterns.behavioral.contract.BehavioralPattern;
import com.brk.designpatterns.behavioral.interpreter.contract.Expression;

public class InterpreterPatternImpl implements BehavioralPattern {

	@Override
	public void apply() {
		Query query = new Query();

		List<String> queries = new ArrayList<String>();
		queries.add("SELECT * FROM SAMPLE_TABLE");
		queries.add("SELECT * FROM SAMPLE_TABLE WHERE");
		queries.add("SELECT * FROM SAMPLE_TABLE WHERE ID = 222");
		queries.add("SELECT FROM SAMPLE_TABLE");
		queries.add("SELECT * SAMPLE_TABLE");

		Expression selectExpression = new SelectExpression();
		Expression fromExpression = new FromExpression();
		Expression whereExpression = new WhereExpression();

		Expression compundExpression = new QueryExpression(selectExpression, fromExpression);
		Expression queryExpression = new QueryExpression(whereExpression, compundExpression);
		
		for (String queryString : queries) {
			query.setQuery(queryString);
			query.setValid(queryExpression.interpret(query));
			System.out.println("Query: " + query.getQuery());
			System.out.println("Query Validation: " + query.isValid());
		}
	}

	@Override
	public String getName() {
		return "Interpreter";
	}

}
