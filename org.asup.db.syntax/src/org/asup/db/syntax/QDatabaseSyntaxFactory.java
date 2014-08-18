/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.db.syntax.QDatabaseSyntaxPackage
 * @generated
 */
public interface QDatabaseSyntaxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxFactory eINSTANCE = org.asup.db.syntax.impl.DatabaseSyntaxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Extended Query Expression Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Query Expression Body</em>'.
	 * @generated
	 */
	QExtendedQueryExpressionBody createExtendedQueryExpressionBody();

	/**
	 * Returns a new object of class '<em>Extended Query Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Query Select</em>'.
	 * @generated
	 */
	QExtendedQuerySelect createExtendedQuerySelect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDatabaseSyntaxPackage getDatabaseSyntaxPackage();

} //DBSyntaxFactory
