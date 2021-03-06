/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.osgi;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.co.osgi.QConnectorOSGIFactory
 * @model kind="package"
 * @generated
 */
public interface QConnectorOSGIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osgi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/co/osgi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co-osgi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QConnectorOSGIPackage eINSTANCE = org.asup.co.osgi.impl.ConnectorOSGIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.co.osgi.impl.BaseConfigImpl <em>Base Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.osgi.impl.BaseConfigImpl
	 * @see org.asup.co.osgi.impl.ConnectorOSGIPackageImpl#getBaseConfig()
	 * @generated
	 */
	int BASE_CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Base Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONFIG_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.co.osgi.impl.CommunicationManagerImpl <em>Communication Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.osgi.impl.CommunicationManagerImpl
	 * @see org.asup.co.osgi.impl.ConnectorOSGIPackageImpl#getCommunicationManager()
	 * @generated
	 */
	int COMMUNICATION_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Communication Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.co.osgi.QEndPoint <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.osgi.QEndPoint
	 * @see org.asup.co.osgi.impl.ConnectorOSGIPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 2;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.asup.co.osgi.QBaseConfig <em>Base Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Config</em>'.
	 * @see org.asup.co.osgi.QBaseConfig
	 * @generated
	 */
	EClass getBaseConfig();

	/**
	 * Returns the meta object for class '{@link org.asup.co.osgi.QCommunicationManager <em>Communication Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Manager</em>'.
	 * @see org.asup.co.osgi.QCommunicationManager
	 * @generated
	 */
	EClass getCommunicationManager();

	/**
	 * Returns the meta object for class '{@link org.asup.co.osgi.QEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see org.asup.co.osgi.QEndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QConnectorOSGIFactory getConnectorOSGIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.co.osgi.impl.BaseConfigImpl <em>Base Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.osgi.impl.BaseConfigImpl
		 * @see org.asup.co.osgi.impl.ConnectorOSGIPackageImpl#getBaseConfig()
		 * @generated
		 */
		EClass BASE_CONFIG = eINSTANCE.getBaseConfig();
		/**
		 * The meta object literal for the '{@link org.asup.co.osgi.impl.CommunicationManagerImpl <em>Communication Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.osgi.impl.CommunicationManagerImpl
		 * @see org.asup.co.osgi.impl.ConnectorOSGIPackageImpl#getCommunicationManager()
		 * @generated
		 */
		EClass COMMUNICATION_MANAGER = eINSTANCE.getCommunicationManager();
		/**
		 * The meta object literal for the '{@link org.asup.co.osgi.QEndPoint <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.osgi.QEndPoint
		 * @see org.asup.co.osgi.impl.ConnectorOSGIPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

	}

} //QConnectorOSGIPackage
