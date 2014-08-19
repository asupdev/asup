/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.osgi.ecf;

import org.asup.co.osgi.QConnectorOSGIPackage;
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
 * @see org.asup.co.osgi.ecf.QECFConnectorOSGIFactory
 * @model kind="package"
 * @generated
 */
public interface QECFConnectorOSGIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/co/osgi/ecf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co-osgi-ecf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QECFConnectorOSGIPackage eINSTANCE = org.asup.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.co.osgi.ecf.impl.ECFContainerConfigImpl <em>ECF Container Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.osgi.ecf.impl.ECFContainerConfigImpl
	 * @see org.asup.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl#getECFContainerConfig()
	 * @generated
	 */
	int ECF_CONTAINER_CONFIG = 0;

	/**
	 * The number of structural features of the '<em>ECF Container Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECF_CONTAINER_CONFIG_FEATURE_COUNT = QConnectorOSGIPackage.BASE_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.co.osgi.ecf.impl.ECFServerContainerConfigImpl <em>ECF Server Container Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.osgi.ecf.impl.ECFServerContainerConfigImpl
	 * @see org.asup.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl#getECFServerContainerConfig()
	 * @generated
	 */
	int ECF_SERVER_CONTAINER_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Server Container Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE = ECF_CONTAINER_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID = ECF_CONTAINER_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECF Server Container Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECF_SERVER_CONTAINER_CONFIG_FEATURE_COUNT = ECF_CONTAINER_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.co.osgi.ecf.impl.ECFClientContainerConfigImpl <em>ECF Client Container Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.co.osgi.ecf.impl.ECFClientContainerConfigImpl
	 * @see org.asup.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl#getECFClientContainerConfig()
	 * @generated
	 */
	int ECF_CLIENT_CONTAINER_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Client Container Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECF_CLIENT_CONTAINER_CONFIG__CLIENT_CONTAINER_TYPE = ECF_CONTAINER_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ECF Client Container Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECF_CLIENT_CONTAINER_CONFIG_FEATURE_COUNT = ECF_CONTAINER_CONFIG_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.asup.co.osgi.ecf.QECFContainerConfig <em>ECF Container Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECF Container Config</em>'.
	 * @see org.asup.co.osgi.ecf.QECFContainerConfig
	 * @generated
	 */
	EClass getECFContainerConfig();

	/**
	 * Returns the meta object for class '{@link org.asup.co.osgi.ecf.QECFServerContainerConfig <em>ECF Server Container Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECF Server Container Config</em>'.
	 * @see org.asup.co.osgi.ecf.QECFServerContainerConfig
	 * @generated
	 */
	EClass getECFServerContainerConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.co.osgi.ecf.QECFServerContainerConfig#getServerContainerType <em>Server Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Container Type</em>'.
	 * @see org.asup.co.osgi.ecf.QECFServerContainerConfig#getServerContainerType()
	 * @see #getECFServerContainerConfig()
	 * @generated
	 */
	EAttribute getECFServerContainerConfig_ServerContainerType();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.co.osgi.ecf.QECFServerContainerConfig#getContainerId <em>Container Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Id</em>'.
	 * @see org.asup.co.osgi.ecf.QECFServerContainerConfig#getContainerId()
	 * @see #getECFServerContainerConfig()
	 * @generated
	 */
	EAttribute getECFServerContainerConfig_ContainerId();

	/**
	 * Returns the meta object for class '{@link org.asup.co.osgi.ecf.QECFClientContainerConfig <em>ECF Client Container Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECF Client Container Config</em>'.
	 * @see org.asup.co.osgi.ecf.QECFClientContainerConfig
	 * @generated
	 */
	EClass getECFClientContainerConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.co.osgi.ecf.QECFClientContainerConfig#getClientContainerType <em>Client Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Container Type</em>'.
	 * @see org.asup.co.osgi.ecf.QECFClientContainerConfig#getClientContainerType()
	 * @see #getECFClientContainerConfig()
	 * @generated
	 */
	EAttribute getECFClientContainerConfig_ClientContainerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QECFConnectorOSGIFactory getECFConnectorOSGIFactory();

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
		 * The meta object literal for the '{@link org.asup.co.osgi.ecf.impl.ECFContainerConfigImpl <em>ECF Container Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.osgi.ecf.impl.ECFContainerConfigImpl
		 * @see org.asup.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl#getECFContainerConfig()
		 * @generated
		 */
		EClass ECF_CONTAINER_CONFIG = eINSTANCE.getECFContainerConfig();

		/**
		 * The meta object literal for the '{@link org.asup.co.osgi.ecf.impl.ECFServerContainerConfigImpl <em>ECF Server Container Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.osgi.ecf.impl.ECFServerContainerConfigImpl
		 * @see org.asup.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl#getECFServerContainerConfig()
		 * @generated
		 */
		EClass ECF_SERVER_CONTAINER_CONFIG = eINSTANCE.getECFServerContainerConfig();

		/**
		 * The meta object literal for the '<em><b>Server Container Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE = eINSTANCE.getECFServerContainerConfig_ServerContainerType();

		/**
		 * The meta object literal for the '<em><b>Container Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID = eINSTANCE.getECFServerContainerConfig_ContainerId();

		/**
		 * The meta object literal for the '{@link org.asup.co.osgi.ecf.impl.ECFClientContainerConfigImpl <em>ECF Client Container Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.co.osgi.ecf.impl.ECFClientContainerConfigImpl
		 * @see org.asup.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl#getECFClientContainerConfig()
		 * @generated
		 */
		EClass ECF_CLIENT_CONTAINER_CONFIG = eINSTANCE.getECFClientContainerConfig();

		/**
		 * The meta object literal for the '<em><b>Client Container Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECF_CLIENT_CONTAINER_CONFIG__CLIENT_CONTAINER_TYPE = eINSTANCE.getECFClientContainerConfig_ClientContainerType();

	}

} //QECFConnectorOSGIPackage
