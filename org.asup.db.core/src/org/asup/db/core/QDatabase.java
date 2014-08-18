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
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.db.core.QDatabase#getName <em>Name</em>}</li>
 *   <li>{@link org.asup.db.core.QDatabase#getSchemas <em>Schemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getDatabase()
 * @model
 * @generated
 */
public interface QDatabase {
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
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabase_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.asup.db.core.QDatabase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' reference list.
	 * The list contents are of type {@link org.asup.db.core.QSchema}.
	 * It is bidirectional and its opposite is '{@link org.asup.db.core.QSchema#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Si intendono gli schemi richiesti   dalle connection.
	 * Se invece si desidera ottenere uno schema disponibile, ma non ancora caricato, utilizzare la funzione DatabaseConnection.getSchema(String name).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schemas</em>' reference list.
	 * @see org.asup.db.core.QDatabaseCorePackage#getDatabase_Schemas()
	 * @see org.asup.db.core.QSchema#getDatabase
	 * @model opposite="database"
	 * @generated
	 */
	List<QSchema> getSchemas();

} // Database
