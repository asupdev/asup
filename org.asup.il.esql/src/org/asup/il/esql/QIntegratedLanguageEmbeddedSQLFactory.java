/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.esql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage
 * @generated
 */
public interface QIntegratedLanguageEmbeddedSQLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageEmbeddedSQLFactory eINSTANCE = org.asup.il.esql.impl.IntegratedLanguageEmbeddedSQLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communication Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Area</em>'.
	 * @generated
	 */
	QCommunicationArea createCommunicationArea();

	/**
	 * Returns a new object of class '<em>Cursor Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cursor Term</em>'.
	 * @generated
	 */
	QCursorTerm createCursorTerm();

	/**
	 * Returns a new object of class '<em>Descriptor Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor Area</em>'.
	 * @generated
	 */
	QDescriptorArea createDescriptorArea();

	/**
	 * Returns a new object of class '<em>Statement Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Term</em>'.
	 * @generated
	 */
	QStatementTerm createStatementTerm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QIntegratedLanguageEmbeddedSQLPackage getIntegratedLanguageEmbeddedSQLPackage();

} //QIntegratedLanguageEmbeddedSQLFactory
