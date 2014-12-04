/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.shell;

import org.asup.fw.core.QFrameworkCorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.co.shell.QShellFactory
 * @model kind="package"
 * @generated
 */
public interface QShellPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shell";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/co/shell";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co-shell";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QShellPackage eINSTANCE = org.asup.co.shell.impl.ShellPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.co.shell.impl.OutputWrapperImpl <em>Output Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.shell.impl.OutputWrapperImpl
	 * @see org.asup.co.shell.impl.ShellPackageImpl#getOutputWrapper()
	 * @generated
	 */
	int OUTPUT_WRAPPER = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WRAPPER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Output Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WRAPPER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.asup.co.shell.QOutputWrapper <em>Output Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Wrapper</em>'.
	 * @see org.asup.co.shell.QOutputWrapper
	 * @generated
	 */
	EClass getOutputWrapper();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QShellFactory getShellFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.co.shell.impl.OutputWrapperImpl <em>Output Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.shell.impl.OutputWrapperImpl
		 * @see org.asup.co.shell.impl.ShellPackageImpl#getOutputWrapper()
		 * @generated
		 */
		EClass OUTPUT_WRAPPER = eINSTANCE.getOutputWrapper();

	}

} //QShellPackage
