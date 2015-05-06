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

import java.nio.Buffer;

import javax.inject.Inject;

import org.asup.dk.compiler.QCompilationUnit;
import org.asup.il.core.QNamedNode;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QMultipleAtomicBufferedDataDef;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.expr.ArithmeticOperator;
import org.asup.il.expr.AtomicType;
import org.asup.il.expr.ExpressionType;
import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.asup.il.expr.QArithmeticExpression;
import org.asup.il.expr.QAssignmentExpression;
import org.asup.il.expr.QAtomicTermExpression;
import org.asup.il.expr.QExpression;
import org.asup.il.expr.QExpressionParser;
import org.asup.il.expr.QPredicateExpression;
import org.asup.il.expr.QRelationalExpression;
import org.asup.il.expr.QTermExpression;
import org.asup.il.expr.RelationalOperator;
import org.asup.il.flow.QEval;
import org.asup.il.flow.QFor;
import org.asup.il.flow.QIf;
import org.asup.il.flow.QMethodExec;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QUntil;
import org.asup.il.flow.QWhile;
import org.asup.il.flow.impl.StatementVisitorImpl;

public class RPJExpressionNormalizer extends StatementVisitorImpl {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QExpressionParser expressionParser;

	@Override
	public boolean visit(QMethodExec statement) {

		if (statement.getObject() == null)
			return super.visit(statement);

		QTermExpression termExpression = expressionParser.parseTerm(statement.getObject());

		QNamedNode namedNode = compilationUnit.getNamedNode(termExpression.getValue(), true);
		if (namedNode == null)
			return super.visit(statement);

		if (!(namedNode instanceof QDataTerm<?>))
			return super.visit(statement);

		QDataTerm<?> dataTerm = (QDataTerm<?>) namedNode;

		// unary
		if (dataTerm.getDataTermType().isUnary())
			return super.visit(statement);

		if (!statement.getMethod().equals("sum"))
			return super.visit(statement);

		statement.setMethod("%xfoot");
		statement.getParameters().add(0, statement.getObject());
		statement.setObject(null);

		return super.visit(statement);
	}

	@Override
	public boolean visit(QEval statement) {

		QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(statement.getAssignment());

		// function
		QTermExpression leftExpression = assignmentExpression.getLeftOperand();

		QDataTerm<?> dataTerm = null;
		if (leftExpression.isFunction() && leftExpression.isSpecial()) {
			QPrototype<?> prototype = compilationUnit.getPrototype(leftExpression.getValue(), true);
			if (prototype != null)
				dataTerm = prototype.getDelegate();
			else
				dataTerm = compilationUnit.getDataTerm(leftExpression.getValue(), true);
		} else
			dataTerm = compilationUnit.getDataTerm(leftExpression.getValue(), true);

		if (dataTerm == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid data term: " + leftExpression.getValue());

		// unary
		if (dataTerm.getDataTermType().isUnary())
			return false;

		// multiple
		QMultipleDataTerm<?> multipleDataTerm = (QMultipleDataTerm<?>) dataTerm;

		QExpression rightExpression = assignmentExpression.getRightOperand();
		switch (rightExpression.getExpressionType()) {
		case ARITHMETIC:
			QArithmeticExpression arithmeticExpression = (QArithmeticExpression) rightExpression;

/*			String result = normalizeArithmeticExpression(arithmeticExpression);
			if (result != null) {
				RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit(assignmentExpression);
				statement.setAssignment(expressionStringBuilder.getResult());

				statement.setAssignment(value);
			}*/
			
			// array element
			if (leftExpression.isFunction())
				return false;

			if (multipleDataTerm.getDefinition() instanceof QMultipleAtomicBufferedDataDef<?>) {

				Class<?> argumentClass = ((QMultipleAtomicBufferedDataDef<?>) multipleDataTerm.getDefinition()).getArgument().getJavaClass();

				if (argumentClass.equals(Buffer.class)) {
				} else if (argumentClass.equals(String.class)) {
					if (isConcatExpression(arithmeticExpression)) {

						RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
						expressionStringBuilder.visit(arithmeticExpression);
						assignmentExpression.setRightOperand(expressionParser.parseExpression("%all(" + expressionStringBuilder.getResult() + ")"));

						expressionStringBuilder = new RPJExpressionStringBuilder();
						expressionStringBuilder.visit(assignmentExpression);
						statement.setAssignment(expressionStringBuilder.getResult());
					}
				} else if (argumentClass.equals(Integer.class)) {
				}
			}

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
				// search QArray<QNumeric>.eval("")
			case INTEGER:
				// search QArray<QNumeric>.eval(0)

				if (multipleDataTerm.getDefinition() instanceof QMultipleAtomicBufferedDataDef<?>) {

					Class<?> argumentClass = ((QMultipleAtomicBufferedDataDef<?>) multipleDataTerm.getDefinition()).getArgument().getJavaClass();

					if (argumentClass.equals(Buffer.class)) {
						if (isNumeric(atomicTermExpression.getValue())) {
							checkSpecialInteger(atomicTermExpression, statement, assignmentExpression);
						} else
							checkSpecialString(atomicTermExpression, statement, assignmentExpression);
					} else if (argumentClass.equals(String.class)) {
						checkSpecialString(atomicTermExpression, statement, assignmentExpression);
					} else if (argumentClass.equals(Integer.class)) {
						checkSpecialInteger(atomicTermExpression, statement, assignmentExpression);
					}
				}

				break;
			case NAME:
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

	private boolean isConcatExpression(QArithmeticExpression arithmeticExpression) {

		RPJArithmeticExpressionAnalyzer arithmeticExpressionAnalyzer = compilationUnit.getContext().make(RPJArithmeticExpressionAnalyzer.class);
		arithmeticExpression.accept(arithmeticExpressionAnalyzer);

		return arithmeticExpressionAnalyzer.isStringConcatExpression();
	}

	private void checkSpecialString(QAtomicTermExpression atomicTermExpression, QEval statement, QAssignmentExpression assignmentExpression) {

		if (atomicTermExpression.getValue().isEmpty()) {
			atomicTermExpression.setType(AtomicType.SPECIAL);
			atomicTermExpression.setValue("*BLANKS");

			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(assignmentExpression);
			statement.setAssignment(expressionStringBuilder.getResult());
		}

	}

	private void checkSpecialInteger(QAtomicTermExpression atomicTermExpression, QEval statement, QAssignmentExpression assignmentExpression) {

		int i = Integer.parseInt(atomicTermExpression.getValue());
		if (i == 0) {
			atomicTermExpression.setType(AtomicType.SPECIAL);
			atomicTermExpression.setValue("*ZEROS");

			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(assignmentExpression);
			statement.setAssignment(expressionStringBuilder.getResult());
		}

	}

	private boolean isNumeric(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private String normalizeRelationalExpression(QRelationalExpression relationalExpression) {

		QExpression leftExpression = relationalExpression.getLeftOperand();
		QExpression rightExpression = relationalExpression.getRightOperand();

		if (leftExpression.getExpressionType() == ExpressionType.ATOMIC) {
			QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) leftExpression;

			if (atomicTermExpression.isSpecial())
				System.out.println(atomicTermExpression);

			if (atomicTermExpression.getValue().equalsIgnoreCase("*BLANKS"))
				atomicTermExpression.toString();

			// special founded on left -> reverse operands
			if (atomicTermExpression.isSpecial() && !atomicTermExpression.isFunction()) {
				relationalExpression.setLeftOperand(rightExpression);
				relationalExpression.setRightOperand(leftExpression);

				RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit(relationalExpression);
				return expressionStringBuilder.getResult();
			}
			// STRING founded on left -> reverse operands and operator
			if(atomicTermExpression.getType().equals(AtomicType.STRING)){
				relationalExpression.setLeftOperand(rightExpression);
				relationalExpression.setRightOperand(leftExpression);
				// operator
				switch(relationalExpression.getOperator()){
				case EQUAL:
					break;
				case GREATER_THAN:
					relationalExpression.setOperator(RelationalOperator.LESS_THAN);
					break;
				case GREATER_THAN_EQUAL:
					relationalExpression.setOperator(RelationalOperator.LESS_THAN_EQUAL);
					break;
				case LESS_THAN:
					relationalExpression.setOperator(RelationalOperator.GREATER_THAN);
					break;
				case LESS_THAN_EQUAL:
					relationalExpression.setOperator(RelationalOperator.GREATER_THAN_EQUAL);
					break;
				case NOT_EQUAL:
					break;
				}
				RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit(relationalExpression);
				return expressionStringBuilder.getResult();
			}

		
		
		
		}

		return null;
	}

	@SuppressWarnings("unused")
	private String normalizeArithmeticExpression(QArithmeticExpression arithmeticExpression) {

		QExpression leftExpression = arithmeticExpression.getLeftOperand();
		QExpression rightExpression = arithmeticExpression.getRightOperand();

		// addition
		if (arithmeticExpression.getOperator() == ArithmeticOperator.PLUS) {

			if (leftExpression.getExpressionType() == ExpressionType.ATOMIC && 
				rightExpression.getExpressionType() == ExpressionType.ATOMIC) {
				
				QAtomicTermExpression atomicLeftExpression = (QAtomicTermExpression) leftExpression;
				QAtomicTermExpression atomicRightExpression = (QAtomicTermExpression) rightExpression;
				
				if(atomicLeftExpression.getType() == AtomicType.HEXADECIMAL &&
				   atomicRightExpression.getType() == AtomicType.HEXADECIMAL) {
					arithmeticExpression.toString();
				}
			}
		}
		return null;
	}

	@Override
	public boolean visit(QIf statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QFor statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QUntil statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QWhile statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}
}
