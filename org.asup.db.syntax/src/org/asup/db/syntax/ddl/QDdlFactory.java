/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.ddl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.db.syntax.ddl.QDdlPackage
 * @generated
 */
public interface QDdlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDdlFactory eINSTANCE = org.asup.db.syntax.ddl.impl.DdlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Commit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commit Statement</em>'.
	 * @generated
	 */
	QCommitStatement createCommitStatement();

	/**
	 * Returns a new object of class '<em>Connect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect Statement</em>'.
	 * @generated
	 */
	QConnectStatement createConnectStatement();

	/**
	 * Returns a new object of class '<em>Create Alias Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Alias Statement</em>'.
	 * @generated
	 */
	QCreateAliasStatement createCreateAliasStatement();

	/**
	 * Returns a new object of class '<em>Create Index Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Index Statement</em>'.
	 * @generated
	 */
	QCreateIndexStatement createCreateIndexStatement();

	/**
	 * Returns a new object of class '<em>Create Table Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Table Statement</em>'.
	 * @generated
	 */
	QCreateTableStatement createCreateTableStatement();

	/**
	 * Returns a new object of class '<em>Disconnect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disconnect Statement</em>'.
	 * @generated
	 */
	QDisconnectStatement createDisconnectStatement();

	/**
	 * Returns a new object of class '<em>Drop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Statement</em>'.
	 * @generated
	 */
	QDropStatement createDropStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDdlPackage getDdlPackage();

} //QDdlFactory
