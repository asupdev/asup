/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl;

import org.asup.db.core.QQualifiedName;

import org.asup.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Alias Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.QDropAliasStatement#getAliasName <em>Alias Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.ddl.QDdlPackage#getDropAliasStatement()
 * @model
 * @generated
 */
public interface QDropAliasStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' reference.
	 * @see #setAliasName(QQualifiedName)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getDropAliasStatement_AliasName()
	 * @model
	 * @generated
	 */
	QQualifiedName getAliasName();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QDropAliasStatement#getAliasName <em>Alias Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name</em>' reference.
	 * @see #getAliasName()
	 * @generated
	 */
	void setAliasName(QQualifiedName value);

} // QDropAliasStatement
