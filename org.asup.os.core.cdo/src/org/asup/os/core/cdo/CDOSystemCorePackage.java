/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.cdo;

import org.asup.fw.core.QFrameworkCorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.asup.os.core.cdo.QCDOSystemCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QCDOSystemCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/core/cdo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-core-cdo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QCDOSystemCorePackage eINSTANCE = org.asup.os.core.cdo.impl.CDOSystemCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.core.cdo.impl.CDOSystemConfigImpl <em>CDO System Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.cdo.impl.CDOSystemConfigImpl
	 * @see org.asup.os.core.cdo.impl.CDOSystemCorePackageImpl#getCDOSystemConfig()
	 * @generated
	 */
	int CDO_SYSTEM_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SYSTEM_CONFIG__SYSTEM = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CDO System Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SYSTEM_CONFIG_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.asup.os.core.cdo.QCDOSystemConfig <em>CDO System Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDO System Config</em>'.
	 * @see org.asup.os.core.cdo.QCDOSystemConfig
	 * @generated
	 */
	EClass getCDOSystemConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.core.cdo.QCDOSystemConfig#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.asup.os.core.cdo.QCDOSystemConfig#getSystem()
	 * @see #getCDOSystemConfig()
	 * @generated
	 */
	EReference getCDOSystemConfig_System();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QCDOSystemCoreFactory getCDOSystemCoreFactory();

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
		 * The meta object literal for the '{@link org.asup.os.core.cdo.impl.CDOSystemConfigImpl <em>CDO System Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.cdo.impl.CDOSystemConfigImpl
		 * @see org.asup.os.core.cdo.impl.CDOSystemCorePackageImpl#getCDOSystemConfig()
		 * @generated
		 */
		EClass CDO_SYSTEM_CONFIG = eINSTANCE.getCDOSystemConfig();
		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDO_SYSTEM_CONFIG__SYSTEM = eINSTANCE.getCDOSystemConfig_System();

	}

} //QCDOSystemCorePackage
