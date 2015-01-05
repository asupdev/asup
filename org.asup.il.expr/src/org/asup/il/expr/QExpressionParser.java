/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.expr;

import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.expr.QIntegratedLanguageExpressionPackage#getExpressionParser()
 * @model abstract="true"
 * @generated
 */
public interface QExpressionParser extends QPlugin, QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.il.expr.ILExpressionRuntimeException" expressionRequired="true"
	 * @generated
	 */
	QExpression parseExpression(String expression) throws IntegratedLanguageExpressionRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.il.expr.ILExpressionRuntimeException" expressionRequired="true"
	 * @generated
	 */
	QAssignmentExpression parseAssignment(String expression) throws IntegratedLanguageExpressionRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.il.expr.ILExpressionRuntimeException" expressionRequired="true"
	 * @generated
	 */
	QPredicateExpression parsePredicate(String expression) throws IntegratedLanguageExpressionRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.il.expr.ILExpressionRuntimeException" expressionRequired="true"
	 * @generated
	 */
	QArithmeticExpression parseArithmetic(String expression) throws IntegratedLanguageExpressionRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.il.expr.ILExpressionRuntimeException" expressionRequired="true"
	 * @generated
	 */
	QTermExpression parseTerm(String expression) throws IntegratedLanguageExpressionRuntimeException;

} // QExpressionParser
