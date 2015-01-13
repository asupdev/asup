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
package org.asup.dk.compiler.rpj;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleAtomicBufferedDataDef;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.expr.AtomicType;
import org.asup.il.expr.QAssignmentExpression;
import org.asup.il.expr.QAtomicTermExpression;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QTermExpression;
import org.asup.il.flow.QEval;
import org.asup.il.flow.impl.StatementVisitorImpl;

public class RPJExpressionNormalizer extends StatementVisitorImpl {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QExpressionParser expressionParser;

	@Override
	public boolean visit(QEval statement) {

		QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(statement.getAssignment());

		// function
		QTermExpression leftExpression = assignmentExpression.getLeftOperand();
		if (leftExpression.isFunction())
			return super.visit(statement);

		// dataTerm
		QDataTerm<?> dataTerm = compilationUnit.getDataTerm(leftExpression.getValue(), true);
		if (dataTerm == null)  
			return super.visit(statement);

		// unary
		if (dataTerm.getDataTermType().isUnary()) {

			/*
			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(assignmentExpression);
			statement.setAssignment(expressionStringBuilder.getResult());
			*/
			
			return false;
		}			

		// multiple
		QMultipleDataTerm<?> multipleDataTerm = (QMultipleDataTerm<?>) dataTerm;

		// search QArray<QNumeric>.eval(0)
		// search QArray<QString>.eval('')
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
			case STRING:
				if (multipleDataTerm.getDefinition() instanceof QMultipleAtomicBufferedDataDef<?>) {
					if (((QMultipleAtomicBufferedDataDef<?>) multipleDataTerm.getDefinition()).getArgument().getJavaClass().equals(String.class)) {
						try {
							if (atomicTermExpression.getValue().isEmpty()) {							
								atomicTermExpression.setType(AtomicType.SPECIAL);
								atomicTermExpression.setValue("*BLANKS");

								RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
								expressionStringBuilder.visit(assignmentExpression);
								statement.setAssignment(expressionStringBuilder.getResult());
							}
						} catch (NumberFormatException e) {
							System.err.println(e);
						}
					}
				}

				break;
			case INTEGER:
				if (multipleDataTerm.getDefinition() instanceof QMultipleAtomicBufferedDataDef<?>) {
					if (((QMultipleAtomicBufferedDataDef<?>) multipleDataTerm.getDefinition()).getArgument().getJavaClass().equals(Integer.class)) {
						try {
							int i = Integer.parseInt(atomicTermExpression.getValue());
							if (i == 0) {
								atomicTermExpression.setType(AtomicType.SPECIAL);
								atomicTermExpression.setValue("*ZEROS");

								RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
								expressionStringBuilder.visit(assignmentExpression);
								statement.setAssignment(expressionStringBuilder.getResult());
							}
						} catch (NumberFormatException e) {
							System.err.println(e);
						}
					}
				}
				break;
			case NAME:
				dataTerm = compilationUnit.getDataTerm(atomicTermExpression.getValue(), true);

				if (dataTerm == null)
					System.err.println("d684350dgfsd6654");
				
				break;
			case SPECIAL:
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
