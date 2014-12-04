/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.fw.core.QFrameworkCorePackage
 * @generated
 */
public interface QFrameworkCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QFrameworkCoreFactory eINSTANCE = org.asup.fw.core.impl.FrameworkCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	QApplication createApplication();

	/**
	 * Returns a new object of class '<em>Application Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Level</em>'.
	 * @generated
	 */
	QApplicationLevel createApplicationLevel();

	/**
	 * Returns a new object of class '<em>Application Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Module</em>'.
	 * @generated
	 */
	QApplicationModule createApplicationModule();

	/**
	 * Returns a new object of class '<em>Service Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Hook</em>'.
	 * @generated
	 */
	QServiceHook createServiceHook();

	/**
	 * Returns a new object of class '<em>Service Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Plugin</em>'.
	 * @generated
	 */
	QServicePlugin createServicePlugin();

	/**
	 * Returns a new object of class '<em>Service Plugin Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Plugin Registry</em>'.
	 * @generated
	 */
	QServicePluginRegistry createServicePluginRegistry();

	/**
	 * Returns a new object of class '<em>Service Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Reference</em>'.
	 * @generated
	 */
	QServiceReference createServiceReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QFrameworkCorePackage getFrameworkCorePackage();

} //QFrameworkCoreFactory
