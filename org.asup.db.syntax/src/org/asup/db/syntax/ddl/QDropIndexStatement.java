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
 * A representation of the model object '<em><b>Drop Index Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.QDropIndexStatement#getIndexName <em>Index Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.ddl.QDdlPackage#getDropIndexStatement()
 * @model
 * @generated
 */
public interface QDropIndexStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Index Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Name</em>' reference.
	 * @see #setIndexName(QQualifiedName)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getDropIndexStatement_IndexName()
	 * @model
	 * @generated
	 */
	QQualifiedName getIndexName();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QDropIndexStatement#getIndexName <em>Index Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Name</em>' reference.
	 * @see #getIndexName()
	 * @generated
	 */
	void setIndexName(QQualifiedName value);

} // QDropIndexStatement
