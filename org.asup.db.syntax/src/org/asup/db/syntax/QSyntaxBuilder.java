/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.asup.db.core.QIndex;
import org.asup.db.core.QSchema;
import org.asup.db.core.QTable;
import org.asup.db.core.QView;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QService;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage#getSyntaxBuilder()
 * @model abstract="true"
 * @generated
 */
public interface QSyntaxBuilder extends QPlugin, QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String createTable(QTable table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" indexRequired="true"
	 * @generated
	 */
	String createIndex(QIndex index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" viewRequired="true"
	 * @generated
	 */
	String createView(QView view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true"
	 * @generated
	 */
	String createSchema(QSchema schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true"
	 * @generated
	 */
	String dropSchema(QSchema schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String dropTable(QTable table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" viewRequired="true"
	 * @generated
	 */
	String dropView(QView view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" indexRequired="true"
	 * @generated
	 */
	String dropIndex(QIndex index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String deleteData(QTable table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String selectData(QTable table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" prepareRequired="true"
	 * @generated
	 */
	String insertData(QTable table, boolean prepare);

} // SyntaxBuilder
