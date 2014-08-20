/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.osgi.ecf.impl;

import org.asup.co.osgi.QConnectorOSGIPackage;
import org.asup.co.osgi.ecf.QECFClientContainerConfig;
import org.asup.co.osgi.ecf.QECFConnectorOSGIFactory;
import org.asup.co.osgi.ecf.QECFConnectorOSGIPackage;
import org.asup.co.osgi.ecf.QECFContainerConfig;
import org.asup.co.osgi.ecf.QECFServerContainerConfig;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ECFConnectorOSGIPackageImpl extends EPackageImpl implements QECFConnectorOSGIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecfContainerConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecfServerContainerConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecfClientContainerConfigEClass = null;

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
	 * @see org.asup.co.osgi.ecf.QECFConnectorOSGIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ECFConnectorOSGIPackageImpl() {
		super(eNS_URI, QECFConnectorOSGIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QECFConnectorOSGIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QECFConnectorOSGIPackage init() {
		if (isInited) return (QECFConnectorOSGIPackage)EPackage.Registry.INSTANCE.getEPackage(QECFConnectorOSGIPackage.eNS_URI);

		// Obtain or create and register package
		ECFConnectorOSGIPackageImpl theECFConnectorOSGIPackage = (ECFConnectorOSGIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ECFConnectorOSGIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ECFConnectorOSGIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QConnectorOSGIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theECFConnectorOSGIPackage.createPackageContents();

		// Initialize created meta-data
		theECFConnectorOSGIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theECFConnectorOSGIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QECFConnectorOSGIPackage.eNS_URI, theECFConnectorOSGIPackage);
		return theECFConnectorOSGIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECFContainerConfig() {
		return ecfContainerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECFServerContainerConfig() {
		return ecfServerContainerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECFServerContainerConfig_ServerContainerType() {
		return (EAttribute)ecfServerContainerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECFServerContainerConfig_ContainerId() {
		return (EAttribute)ecfServerContainerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECFClientContainerConfig() {
		return ecfClientContainerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECFClientContainerConfig_ClientContainerType() {
		return (EAttribute)ecfClientContainerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QECFConnectorOSGIFactory getECFConnectorOSGIFactory() {
		return (QECFConnectorOSGIFactory)getEFactoryInstance();
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
		ecfContainerConfigEClass = createEClass(ECF_CONTAINER_CONFIG);

		ecfServerContainerConfigEClass = createEClass(ECF_SERVER_CONTAINER_CONFIG);
		createEAttribute(ecfServerContainerConfigEClass, ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE);
		createEAttribute(ecfServerContainerConfigEClass, ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID);

		ecfClientContainerConfigEClass = createEClass(ECF_CLIENT_CONTAINER_CONFIG);
		createEAttribute(ecfClientContainerConfigEClass, ECF_CLIENT_CONTAINER_CONFIG__CLIENT_CONTAINER_TYPE);
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
		QConnectorOSGIPackage theConnectorOSGIPackage = (QConnectorOSGIPackage)EPackage.Registry.INSTANCE.getEPackage(QConnectorOSGIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ecfContainerConfigEClass.getESuperTypes().add(theConnectorOSGIPackage.getBaseConfig());
		ecfServerContainerConfigEClass.getESuperTypes().add(this.getECFContainerConfig());
		ecfClientContainerConfigEClass.getESuperTypes().add(this.getECFContainerConfig());

		// Initialize classes and features; add operations and parameters
		initEClass(ecfContainerConfigEClass, QECFContainerConfig.class, "ECFContainerConfig", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecfServerContainerConfigEClass, QECFServerContainerConfig.class, "ECFServerContainerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECFServerContainerConfig_ServerContainerType(), ecorePackage.getEString(), "serverContainerType", null, 1, 1, QECFServerContainerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECFServerContainerConfig_ContainerId(), ecorePackage.getEString(), "containerId", null, 1, 1, QECFServerContainerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecfClientContainerConfigEClass, QECFClientContainerConfig.class, "ECFClientContainerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECFClientContainerConfig_ClientContainerType(), ecorePackage.getEString(), "clientContainerType", null, 1, 1, QECFClientContainerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ECFConnectorOSGIPackageImpl