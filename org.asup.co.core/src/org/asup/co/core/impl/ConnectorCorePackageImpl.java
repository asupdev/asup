/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.core.impl;

import org.asup.co.core.QConnectorCoreFactory;
import org.asup.co.core.QConnectorCorePackage;
import org.asup.co.core.QServerSocket;
import org.asup.co.core.QServerSocketConfig;
import org.asup.co.core.QServerSocketManager;
import org.asup.fw.core.QFrameworkCorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorCorePackageImpl extends EPackageImpl implements QConnectorCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSocketConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSocketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSocketManagerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.asup.co.core.QConnectorCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConnectorCorePackageImpl() {
		super(eNS_URI, QConnectorCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QConnectorCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QConnectorCorePackage init() {
		if (isInited) return (QConnectorCorePackage)EPackage.Registry.INSTANCE.getEPackage(QConnectorCorePackage.eNS_URI);

		// Obtain or create and register package
		ConnectorCorePackageImpl theConnectorCorePackage = (ConnectorCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConnectorCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConnectorCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QFrameworkCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConnectorCorePackage.createPackageContents();

		// Initialize created meta-data
		theConnectorCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConnectorCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QConnectorCorePackage.eNS_URI, theConnectorCorePackage);
		return theConnectorCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerSocketConfig() {
		return serverSocketConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSocketConfig_Address() {
		return (EAttribute)serverSocketConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSocketConfig_Port() {
		return (EAttribute)serverSocketConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerSocket() {
		return serverSocketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerSocketManager() {
		return serverSocketManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectorCoreFactory getConnectorCoreFactory() {
		return (QConnectorCoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serverSocketConfigEClass = createEClass(SERVER_SOCKET_CONFIG);
		createEAttribute(serverSocketConfigEClass, SERVER_SOCKET_CONFIG__ADDRESS);
		createEAttribute(serverSocketConfigEClass, SERVER_SOCKET_CONFIG__PORT);

		serverSocketEClass = createEClass(SERVER_SOCKET);

		serverSocketManagerEClass = createEClass(SERVER_SOCKET_MANAGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serverSocketConfigEClass.getESuperTypes().add(theFrameworkCorePackage.getServiceConfig());
		serverSocketEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		serverSocketManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());

		// Initialize classes and features; add operations and parameters
		initEClass(serverSocketConfigEClass, QServerSocketConfig.class, "ServerSocketConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerSocketConfig_Address(), ecorePackage.getEString(), "address", null, 1, 1, QServerSocketConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSocketConfig_Port(), ecorePackage.getEInt(), "port", null, 1, 1, QServerSocketConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverSocketEClass, QServerSocket.class, "ServerSocket", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverSocketManagerEClass, QServerSocketManager.class, "ServerSocketManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(serverSocketManagerEClass, null, "startServerSocket", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getServerSocketConfig(), "config", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //COCorePackageImpl
