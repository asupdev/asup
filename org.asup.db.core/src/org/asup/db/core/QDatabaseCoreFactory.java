/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.asup.db.core.QDatabaseCorePackage
 * @generated
 */
public interface QDatabaseCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QDatabaseCoreFactory eINSTANCE = org.asup.db.core.impl.DatabaseCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Connection Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Config</em>'.
	 * @generated
	 */
	QConnectionConfig createConnectionConfig();

	/**
	 * Returns a new object of class '<em>Database Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Container</em>'.
	 * @generated
	 */
	QDatabaseContainer createDatabaseContainer();

	/**
	 * Returns a new object of class '<em>Index Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Def</em>'.
	 * @generated
	 */
	QIndexDef createIndexDef();

	/**
	 * Returns a new object of class '<em>Index Column Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Column Def</em>'.
	 * @generated
	 */
	QIndexColumnDef createIndexColumnDef();

	/**
	 * Returns a new object of class '<em>Schema Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Def</em>'.
	 * @generated
	 */
	QSchemaDef createSchemaDef();

	/**
	 * Returns a new object of class '<em>Table Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Def</em>'.
	 * @generated
	 */
	QTableDef createTableDef();

	/**
	 * Returns a new object of class '<em>Table Column Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Column Def</em>'.
	 * @generated
	 */
	QTableColumnDef createTableColumnDef();

	/**
	 * Returns a new object of class '<em>View Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Def</em>'.
	 * @generated
	 */
	QViewDef createViewDef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDatabaseCorePackage getDatabaseCorePackage();

} // DatabaseCoreFactory
