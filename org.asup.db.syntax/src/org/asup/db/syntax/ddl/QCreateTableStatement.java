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
import org.asup.db.core.QTableColumnDef;
import org.asup.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.QCreateTableStatement#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.QCreateTableStatement#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.ddl.QDdlPackage#getCreateTableStatement()
 * @model
 * @generated
 */
public interface QCreateTableStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' containment reference.
	 * @see #setTableName(QQualifiedName)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getCreateTableStatement_TableName()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getTableName();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QCreateTableStatement#getTableName <em>Table Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' containment reference.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(QQualifiedName value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.db.core.QTableColumnDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getCreateTableStatement_Fields()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<QTableColumnDef> getFields();

} // QCreateTableStatement
