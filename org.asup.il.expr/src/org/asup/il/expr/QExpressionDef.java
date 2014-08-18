/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.expr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.expr.QExpressionDef#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.expr.QIntegratedLanguageExpressionPackage#getExpressionDef()
 * @model
 * @generated
 */
public interface QExpressionDef {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.il.expr.ExpressionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.asup.il.expr.ExpressionType
	 * @see #setType(ExpressionType)
	 * @see org.asup.il.expr.QIntegratedLanguageExpressionPackage#getExpressionDef_Type()
	 * @model required="true"
	 * @generated
	 */
	ExpressionType getType();

	/**
	 * Sets the value of the '{@link org.asup.il.expr.QExpressionDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.asup.il.expr.ExpressionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExpressionType value);

} // QExpressionDef
