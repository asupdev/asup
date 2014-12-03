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
 * A representation of the model object '<em><b>Create View Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.syntax.ddl.QCreateViewStatement#getFields <em>Fields</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.QCreateViewStatement#getQuery <em>Query</em>}</li>
 *   <li>{@link org.asup.db.syntax.ddl.QCreateViewStatement#getViewName <em>View Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.syntax.ddl.QDdlPackage#getCreateViewStatement()
 * @model
 * @generated
 */
public interface QCreateViewStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.db.core.QTableColumnDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getCreateViewStatement_Fields()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<QTableColumnDef> getFields();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getCreateViewStatement_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QCreateViewStatement#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>View Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name</em>' containment reference.
	 * @see #setViewName(QQualifiedName)
	 * @see org.asup.db.syntax.ddl.QDdlPackage#getCreateViewStatement_ViewName()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getViewName();

	/**
	 * Sets the value of the '{@link org.asup.db.syntax.ddl.QCreateViewStatement#getViewName <em>View Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' containment reference.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(QQualifiedName value);

} // QCreateViewStatement
