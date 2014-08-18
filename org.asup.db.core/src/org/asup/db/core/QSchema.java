/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QSchema#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.asup.db.core.QSchema#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.core.QSchema#getTables <em>Tables</em>}</li>
 *   <li>{@link org.asup.db.core.QSchema#getViews <em>Views</em>}</li>
 *   <li>{@link org.asup.db.core.QSchema#getIndexes <em>Indexes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getSchema()
 * @model
 * @generated
 */
public interface QSchema {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.asup.db.core.QDatabase#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(QDatabase)
	 * @see org.asup.db.core.QDatabaseCorePackage#getSchema_Database()
	 * @see org.asup.db.core.QDatabase#getSchemas
	 * @model opposite="schemas" required="true"
	 * @generated
	 */
	QDatabase getDatabase();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QSchema#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(QDatabase value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.db.core.QTable}.
	 * It is bidirectional and its opposite is '{@link org.asup.db.core.QTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see org.asup.db.core.QDatabaseCorePackage#getSchema_Tables()
	 * @see org.asup.db.core.QTable#getSchema
	 * @model opposite="schema" containment="true"
	 * @generated
	 */
	List<QTable> getTables();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.db.core.QView}.
	 * It is bidirectional and its opposite is '{@link org.asup.db.core.QView#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.asup.db.core.QDatabaseCorePackage#getSchema_Views()
	 * @see org.asup.db.core.QView#getSchema
	 * @model opposite="schema" containment="true"
	 * @generated
	 */
	List<QView> getViews();

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.db.core.QIndex}.
	 * It is bidirectional and its opposite is '{@link org.asup.db.core.QIndex#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see org.asup.db.core.QDatabaseCorePackage#getSchema_Indexes()
	 * @see org.asup.db.core.QIndex#getSchema
	 * @model opposite="schema" containment="true"
	 * @generated
	 */
	List<QIndex> getIndexes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.asup.db.core.QDatabaseCorePackage#getSchema_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QSchema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Schema
