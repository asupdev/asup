/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.QDefinitionStatement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getDefinitionStatement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDefinitionStatement {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"DDL"</code>.
	 * The literals are from the enumeration {@link org.asup.db.syntax.StatementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.asup.db.syntax.StatementType
	 * @see #setType(StatementType)
	 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getDefinitionStatement_Type()
	 * @model default="DDL"
	 * @generated
	 */
	StatementType getType();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.QDefinitionStatement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.asup.db.syntax.StatementType
	 * @see #getType()
	 * @generated
	 */
	void setType(StatementType value);
} // QDefinitionStatement
