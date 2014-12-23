/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl;

import org.asup.db.syntax.QBindingStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.dbl.QOpenStatement#getCursor <em>Cursor</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QOpenStatement#getUsing <em>Using</em>}</li>
 *   <li>{@link org.asup.db.syntax.dbl.QOpenStatement#getUsingType <em>Using Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.dbl.QDblPackage#getOpenStatement()
 * @model
 * @generated
 */
public interface QOpenStatement extends QBindingStatement {
	/**
	 * Returns the value of the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor</em>' attribute.
	 * @see #setCursor(String)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getOpenStatement_Cursor()
	 * @model
	 * @generated
	 */
	String getCursor();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QOpenStatement#getCursor <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor</em>' attribute.
	 * @see #getCursor()
	 * @generated
	 */
	void setCursor(String value);

	/**
	 * Returns the value of the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' attribute.
	 * @see #setUsing(String)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getOpenStatement_Using()
	 * @model
	 * @generated
	 */
	String getUsing();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QOpenStatement#getUsing <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using</em>' attribute.
	 * @see #getUsing()
	 * @generated
	 */
	void setUsing(String value);

	/**
	 * Returns the value of the '<em><b>Using Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.asup.db.syntax.dbl.OpenUsingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Type</em>' attribute.
	 * @see org.asup.db.syntax.dbl.OpenUsingType
	 * @see #setUsingType(OpenUsingType)
	 * @see org.asup.db.syntax.dbl.QDblPackage#getOpenStatement_UsingType()
	 * @model
	 * @generated
	 */
	OpenUsingType getUsingType();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.dbl.QOpenStatement#getUsingType <em>Using Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using Type</em>' attribute.
	 * @see org.asup.db.syntax.dbl.OpenUsingType
	 * @see #getUsingType()
	 * @generated
	 */
	void setUsingType(OpenUsingType value);

} // QOpenStatement
