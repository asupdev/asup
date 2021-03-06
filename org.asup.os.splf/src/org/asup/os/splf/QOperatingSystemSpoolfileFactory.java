/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.splf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.os.splf.QOperatingSystemSpoolfilePackage
 * @generated
 */
public interface QOperatingSystemSpoolfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemSpoolfileFactory eINSTANCE = org.asup.os.splf.impl.OperatingSystemSpoolfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Spool File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spool File</em>'.
	 * @generated
	 */
	QSpoolFile createSpoolFile();

	/**
	 * Returns a new object of class '<em>Spool File Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spool File Row</em>'.
	 * @generated
	 */
	QSpoolFileRow createSpoolFileRow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperatingSystemSpoolfilePackage getOperatingSystemSpoolfilePackage();

} //QOperatingSystemSpoolfileFactory
