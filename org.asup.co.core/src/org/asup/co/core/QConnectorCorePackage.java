/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.core;

import org.asup.fw.core.QFrameworkCorePackage;
import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.asup.co.core.QConnectorCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QConnectorCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/co/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QConnectorCorePackage eINSTANCE = org.asup.co.core.impl.ConnectorCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.co.core.impl.ServerSocketConfigImpl <em>Server Socket Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.core.impl.ServerSocketConfigImpl
	 * @see org.asup.co.core.impl.ConnectorCorePackageImpl#getServerSocketConfig()
	 * @generated
	 */
	int SERVER_SOCKET_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_CONFIG__ADDRESS = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_CONFIG__PORT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server Socket Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_CONFIG_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.co.core.impl.ServerSocketImpl <em>Server Socket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.core.impl.ServerSocketImpl
	 * @see org.asup.co.core.impl.ConnectorCorePackageImpl#getServerSocket()
	 * @generated
	 */
	int SERVER_SOCKET = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Server Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.co.core.impl.ServerSocketManagerImpl <em>Server Socket Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.core.impl.ServerSocketManagerImpl
	 * @see org.asup.co.core.impl.ConnectorCorePackageImpl#getServerSocketManager()
	 * @generated
	 */
	int SERVER_SOCKET_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Server Socket Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.asup.co.core.QServerSocketConfig <em>Server Socket Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Socket Config</em>'.
	 * @see org.asup.co.core.QServerSocketConfig
	 * @generated
	 */
	EClass getServerSocketConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.co.core.QServerSocketConfig#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.asup.co.core.QServerSocketConfig#getAddress()
	 * @see #getServerSocketConfig()
	 * @generated
	 */
	EAttribute getServerSocketConfig_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.co.core.QServerSocketConfig#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.asup.co.core.QServerSocketConfig#getPort()
	 * @see #getServerSocketConfig()
	 * @generated
	 */
	EAttribute getServerSocketConfig_Port();

	/**
	 * Returns the meta object for class '{@link org.asup.co.core.QServerSocket <em>Server Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Socket</em>'.
	 * @see org.asup.co.core.QServerSocket
	 * @generated
	 */
	EClass getServerSocket();

	/**
	 * Returns the meta object for class '{@link org.asup.co.core.QServerSocketManager <em>Server Socket Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Socket Manager</em>'.
	 * @see org.asup.co.core.QServerSocketManager
	 * @generated
	 */
	EClass getServerSocketManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QConnectorCoreFactory getConnectorCoreFactory();

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
		 * The meta object literal for the '{@link org.asup.co.core.impl.ServerSocketConfigImpl <em>Server Socket Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.core.impl.ServerSocketConfigImpl
		 * @see org.asup.co.core.impl.ConnectorCorePackageImpl#getServerSocketConfig()
		 * @generated
		 */
		EClass SERVER_SOCKET_CONFIG = eINSTANCE.getServerSocketConfig();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SOCKET_CONFIG__ADDRESS = eINSTANCE.getServerSocketConfig_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SOCKET_CONFIG__PORT = eINSTANCE.getServerSocketConfig_Port();

		/**
		 * The meta object literal for the '{@link org.asup.co.core.impl.ServerSocketImpl <em>Server Socket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.core.impl.ServerSocketImpl
		 * @see org.asup.co.core.impl.ConnectorCorePackageImpl#getServerSocket()
		 * @generated
		 */
		EClass SERVER_SOCKET = eINSTANCE.getServerSocket();

		/**
		 * The meta object literal for the '{@link org.asup.co.core.impl.ServerSocketManagerImpl <em>Server Socket Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.core.impl.ServerSocketManagerImpl
		 * @see org.asup.co.core.impl.ConnectorCorePackageImpl#getServerSocketManager()
		 * @generated
		 */
		EClass SERVER_SOCKET_MANAGER = eINSTANCE.getServerSocketManager();

	}

} //COCorePackage
