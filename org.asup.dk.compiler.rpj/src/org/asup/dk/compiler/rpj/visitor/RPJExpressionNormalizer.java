/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.dk.compiler.rpj.visitor;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationContext;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QPredicateExpression;
import org.asup.il.expr.QTermExpression;
import org.asup.il.flow.QCall;
import org.asup.il.flow.QIf;
import org.asup.il.flow.impl.StatementVisitorImpl;

public class RPJExpressionNormalizer extends StatementVisitorImpl {

	@Inject
	private QCompilationContext compilationContext;
	@Inject
	private QExpressionParser expressionParser;

	private RPJExpressionStringBuilder expressionBuilder;
	
	@PostConstruct
	public void init() {
		this.expressionBuilder = compilationContext.make(RPJExpressionStringBuilder.class);
	}
	
	@Override
	public boolean visit(QCall statement) {
				
		// program
		QTermExpression expression = expressionParser.parseTerm(statement.getProgram());
		expression.accept(expressionBuilder.reset());
		statement.setProgram(expressionBuilder.getResult());

		// parameters
		List<String> parameters = new ArrayList<>();		
		for(String parameter: statement.getParameters()) {
			expression = expressionParser.parseTerm(parameter);
			expression.accept(expressionBuilder.reset());
			parameters.add(expressionBuilder.getResult());
		}
		statement.getParameters().clear();
		statement.getParameters().addAll(parameters);
		
		return super.visit(statement);
	}

	@Override
	public boolean visit(QIf statement) {
		
		// program
		QPredicateExpression expression = expressionParser.parsePredicate(statement.getCondition());
		expression.accept(expressionBuilder.reset());
		statement.setCondition(expressionBuilder.getResult());
		
		return super.visit(statement);
	}
}
