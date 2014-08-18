/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import java.util.Dictionary;

import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.core.QDatabaseCorePackage#getConnectionManager()
 * @model abstract="true"
 * @generated
 */
public interface QConnectionManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dictionaryDataType="org.asup.fw.java.JavaDictionary<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject>" dictionaryRequired="true"
	 * @generated
	 */
	QConnectionConfig createConnectionConfig(Dictionary<String, Object> dictionary);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model configRequired="true"
	 * @generated
	 */
	QConnection getDatabaseConnection(QConnectionConfig config);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QConnection getDatabaseConnection(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" configRequired="true"
	 * @generated
	 */
	void registerConnectionConfig(String name, QConnectionConfig config);

} // QConnectionManager
