/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.il.expr.base;

import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.asup.il.expr.QArithmeticExpression;
import org.asup.il.expr.QAssignmentExpression;
import org.asup.il.expr.QPredicateExpression;
import org.asup.il.expr.QTermExpression;
import org.asup.il.expr.base.util.ExpressionBuilder;
import org.asup.il.expr.base.util.RPGExpressionHelper;
import org.asup.il.expr.impl.ExpressionParserImpl;

public class RPGExpressionParserImpl extends ExpressionParserImpl {


	private ExpressionBuilder expressionBuilder;

	public RPGExpressionParserImpl() {
		expressionBuilder = new ExpressionBuilder(new RPGExpressionHelper());
	}

	@Override
	public QAssignmentExpression parseAssignment(String expression) throws IntegratedLanguageExpressionRuntimeException {
		return expressionBuilder.buildAsAssignment(expression);
	}

	@Override
	public QPredicateExpression parsePredicate(String expression) throws IntegratedLanguageExpressionRuntimeException {
		return expressionBuilder.buildAsPredicate(expression);
	}

	@Override
	public QArithmeticExpression parseArithmetic(String expression) throws IntegratedLanguageExpressionRuntimeException {
		return expressionBuilder.buildAsArithmetic(expression);
	}

	@Override
	public QTermExpression parseTerm(String expression) throws IntegratedLanguageExpressionRuntimeException {		
		return expressionBuilder.buildAsTerm(expression);
	}

}