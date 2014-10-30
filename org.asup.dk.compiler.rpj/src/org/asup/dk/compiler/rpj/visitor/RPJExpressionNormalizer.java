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
import org.asup.il.data.QAtomicDataTerm;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleAtomicBufferedDataDef;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.expr.QAssignmentExpression;
import org.asup.il.expr.QAtomicTermExpression;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QPredicateExpression;
import org.asup.il.expr.QTermExpression;
import org.asup.il.flow.QCall;
import org.asup.il.flow.QEval;
import org.asup.il.flow.QIf;
import org.asup.il.flow.QMethodExec;
import org.asup.il.flow.impl.StatementVisitorImpl;

public class RPJExpressionNormalizer extends StatementVisitorImpl {

	@Inject
	private QCompilationContext compilationContext;
	@Inject
	private QExpressionParser expressionParser;

	private RPJExpressionStringBuilder expressionBuilder;

	@PostConstruct
	public void init() {
		this.expressionBuilder = compilationContext
				.make(RPJExpressionStringBuilder.class);
	}

	@Override
	public boolean visit(QCall statement) {

		// program
		QTermExpression expression = expressionParser.parseTerm(statement
				.getProgram());
		expression.accept(expressionBuilder.reset());
		statement.setProgram(expressionBuilder.getResult());

		// parameters
		List<String> parameters = new ArrayList<>();
		for (String parameter : statement.getParameters()) {
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
		QPredicateExpression expression = expressionParser
				.parsePredicate(statement.getCondition());
		expression.accept(expressionBuilder.reset());
		statement.setCondition(expressionBuilder.getResult());

		return super.visit(statement);
	}

	@Override
	public boolean visit(QMethodExec statement) {

		// program
		QTermExpression expression = expressionParser.parseTerm(statement.getObject());
		expression.accept(expressionBuilder.reset());
		statement.setObject(expressionBuilder.getResult());

		// parameters
		List<String> parameters = new ArrayList<>();
		for (String parameter : statement.getParameters()) {
			expression = expressionParser.parseTerm(parameter);
			expression.accept(expressionBuilder.reset());
			parameters.add(expressionBuilder.getResult());
		}
		statement.getParameters().clear();
		statement.getParameters().addAll(parameters);

		return super.visit(statement);
	}

	@Override
	public boolean visit(QEval statement) {
		
		QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(statement.getAssignment());

		// function
		QTermExpression leftExpression = assignmentExpression.getLeftOperand();
		if(leftExpression.isFunction()) 
			return super.visit(statement);
		
		// dataTerm
		QDataTerm<?> dataTerm = compilationContext.getDataTerm(leftExpression.getValue(), true);
		if(dataTerm == null)
			return super.visit(statement);
		
		// unary
		if(dataTerm.getDataType().isUnary()) 
			return super.visit(statement);
		
		// multiple
		QMultipleDataTerm<?	> multipleDataTerm = (QMultipleDataTerm<?>) dataTerm;
					
		// search QArray<QNumeric>.eval(0)
		QExpression rightExpression = assignmentExpression.getRightOperand();
		switch (rightExpression.getExpressionType()) {
		case ARITHMETIC:
			break;
		case ASSIGNMENT:
			break;
		case ATOMIC:
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) rightExpression;
			switch (atomicTermExpression.getType()) {
			case BOOLEAN:
				break;
			case DATETIME:
				break;
			case FLOATING:
				break;
			case HEXADECIMAL:
				break;
			case INDICATOR:
				break;
			case INTEGER:
				if(multipleDataTerm.getDefinition() instanceof QMultipleAtomicBufferedDataDef<?>) {
					if(((QMultipleAtomicBufferedDataDef<?>)multipleDataTerm.getDefinition()).getArgument().getJavaClass().equals(Integer.class)) {
						try {
							int i = Integer.parseInt(atomicTermExpression.getValue());
							if(i==0) {
								atomicTermExpression.setValue("*ZEROS");

								RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
								expressionStringBuilder.visit(assignmentExpression);											
								statement.setAssignment(expressionStringBuilder.getResult());
							}
						}
						catch(NumberFormatException e) {
							System.err.println(e);
						}
					}
				}
				break;
			case NAME:
				QAtomicDataTerm<?> atomicDataTerm = (QAtomicDataTerm<?>) compilationContext.getDataTerm(atomicTermExpression.getValue(), true);;
				if(atomicDataTerm != null) {
					atomicDataTerm.toString();	
				}
				else
					System.err.println("d684350dgfsd6654");
				break;
			case SPECIAL:
				break;
			case STRING:
				break;
			}
			break;
		case BLOCK:
			break;
		case BOOLEAN:
			break;
		case COMPOUND:
			break;
		case LOGICAL:
			break;
		case RELATIONAL:
			break;
		}

		return super.visit(statement);
	}
}
