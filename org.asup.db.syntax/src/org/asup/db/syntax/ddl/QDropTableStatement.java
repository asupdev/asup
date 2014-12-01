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
 * A representation of the model object '<em><b>Drop Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.QDropTableStatement#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.QDropTableStatement#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.ddl.QDdlPackage#getDropTableStatement()
 * @model
 * @generated
 */
public interface QDropTableStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' reference.
	 * @see #setTableName(QQualifiedName)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getDropTableStatement_TableName()
	 * @model
	 * @generated
	 */
	QQualifiedName getTableName();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QDropTableStatement#getTableName <em>Table Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' reference.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(QQualifiedName value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.asup.db.syntax.ddl.DropRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see org.asup.db.syntax.ddl.DropRange
	 * @see #setRange(DropRange)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getDropTableStatement_Range()
	 * @model default=""
	 * @generated
	 */
	DropRange getRange();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QDropTableStatement#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see org.asup.db.syntax.ddl.DropRange
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DropRange value);

} // QDropTableStatement
