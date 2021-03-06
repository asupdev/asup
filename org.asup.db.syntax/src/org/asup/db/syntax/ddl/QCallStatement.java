/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl;

import java.util.List;

import org.asup.db.core.QQualifiedName;

import org.asup.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.QCallStatement#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.QCallStatement#getParms <em>Parms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.ddl.QDdlPackage#getCallStatement()
 * @model
 * @generated
 */
public interface QCallStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Procedure Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Name</em>' containment reference.
	 * @see #setProcedureName(QQualifiedName)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getCallStatement_ProcedureName()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getProcedureName();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QCallStatement#getProcedureName <em>Procedure Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Name</em>' containment reference.
	 * @see #getProcedureName()
	 * @generated
	 */
	void setProcedureName(QQualifiedName value);

	/**
	 * Returns the value of the '<em><b>Parms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parms</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parms</em>' attribute list.
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getCallStatement_Parms()
	 * @model
	 * @generated
	 */
	List<String> getParms();

} // QCallStatement
