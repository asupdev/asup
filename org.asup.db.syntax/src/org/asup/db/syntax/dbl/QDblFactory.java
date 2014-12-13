/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.db.syntax.dbl.QDblPackage
 * @generated
 */
public interface QDblFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDblFactory eINSTANCE = org.asup.db.syntax.dbl.impl.DblFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Declare Cursor Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Cursor Statement</em>'.
	 * @generated
	 */
	QDeclareCursorStatement createDeclareCursorStatement();

	/**
	 * Returns a new object of class '<em>Describe Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Describe Statement</em>'.
	 * @generated
	 */
	QDescribeStatement createDescribeStatement();

	/**
	 * Returns a new object of class '<em>Execute Immediate Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Immediate Statement</em>'.
	 * @generated
	 */
	QExecuteImmediateStatement createExecuteImmediateStatement();

	/**
	 * Returns a new object of class '<em>Execute Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Statement</em>'.
	 * @generated
	 */
	QExecuteStatement createExecuteStatement();

	/**
	 * Returns a new object of class '<em>Set Transaction Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Transaction Statement</em>'.
	 * @generated
	 */
	QSetTransactionStatement createSetTransactionStatement();

	/**
	 * Returns a new object of class '<em>Open Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Statement</em>'.
	 * @generated
	 */
	QOpenStatement createOpenStatement();

	/**
	 * Returns a new object of class '<em>Prepare Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prepare Statement</em>'.
	 * @generated
	 */
	QPrepareStatement createPrepareStatement();

	/**
	 * Returns a new object of class '<em>Close Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Close Statement</em>'.
	 * @generated
	 */
	QCloseStatement createCloseStatement();

	/**
	 * Returns a new object of class '<em>Into Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Into Clause</em>'.
	 * @generated
	 */
	QIntoClause createIntoClause();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDblPackage getDblPackage();

} //QDblFactory
