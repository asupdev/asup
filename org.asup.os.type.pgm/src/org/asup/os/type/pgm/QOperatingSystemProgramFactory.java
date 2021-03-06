/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.pgm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage
 * @generated
 */
public interface QOperatingSystemProgramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemProgramFactory eINSTANCE = org.asup.os.type.pgm.impl.OperatingSystemProgramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activation Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Group</em>'.
	 * @generated
	 */
	QActivationGroup createActivationGroup();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	QProgram createProgram();

	/**
	 * Returns a new object of class '<em>Program Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Container</em>'.
	 * @generated
	 */
	QProgramContainer createProgramContainer();

	/**
	 * Returns a new object of class '<em>Program Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Source</em>'.
	 * @generated
	 */
	QProgramSource createProgramSource();

	/**
	 * Returns a new object of class '<em>Program Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Stack</em>'.
	 * @generated
	 */
	QProgramStack createProgramStack();

	/**
	 * Returns a new object of class '<em>Program Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Status</em>'.
	 * @generated
	 */
	QProgramStatus createProgramStatus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperatingSystemProgramPackage getOperatingSystemProgramPackage();

} //OSProgramCoreFactory
