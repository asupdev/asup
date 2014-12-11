/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.module.impl;

import org.asup.fw.java.QFrameworkJavaPackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.asup.os.type.module.QModule;
import org.asup.os.type.module.QModuleManager;
import org.asup.os.type.module.QModuleSource;
import org.asup.os.type.module.QOperatingSystemModuleFactory;
import org.asup.os.type.module.QOperatingSystemModulePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemModulePackageImpl extends EPackageImpl implements QOperatingSystemModulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleSourceEClass = null;

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
	 * @see org.asup.os.type.module.QOperatingSystemModulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemModulePackageImpl() {
		super(eNS_URI, QOperatingSystemModuleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemModulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemModulePackage init() {
		if (isInited) return (QOperatingSystemModulePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemModulePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemModulePackageImpl theOperatingSystemModulePackage = (OperatingSystemModulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemModulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemModulePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemModulePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemModulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemModulePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemModulePackage.eNS_URI, theOperatingSystemModulePackage);
		return theOperatingSystemModulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Source() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleManager() {
		return moduleManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleSource() {
		return moduleSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleSource_Type() {
		return (EAttribute)moduleSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleSource_Content() {
		return (EAttribute)moduleSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemModuleFactory getOperatingSystemModuleFactory() {
		return (QOperatingSystemModuleFactory)getEFactoryInstance();
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
		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__SOURCE);

		moduleManagerEClass = createEClass(MODULE_MANAGER);

		moduleSourceEClass = createEClass(MODULE_SOURCE);
		createEAttribute(moduleSourceEClass, MODULE_SOURCE__TYPE);
		createEAttribute(moduleSourceEClass, MODULE_SOURCE__CONTENT);
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
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);
		QOperatingSystemOmacPackage theOperatingSystemOmacPackage = (QOperatingSystemOmacPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOmacPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moduleEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		EGenericType g1 = createEGenericType(theOperatingSystemTypePackage.getTypedManager());
		EGenericType g2 = createEGenericType(this.getModule());
		g1.getETypeArguments().add(g2);
		moduleManagerEClass.getEGenericSuperTypes().add(g1);
		moduleSourceEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(moduleEClass, QModule.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Source(), this.getModuleSource(), null, "source", null, 0, 1, QModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(moduleEClass, theFrameworkJavaPackage.getJavaURI(), "getClassURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(moduleEClass, theFrameworkJavaPackage.getJavaURI(), "getPackageInfoURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moduleManagerEClass, QModuleManager.class, "ModuleManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleSourceEClass, QModuleSource.class, "ModuleSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleSource_Type(), ecorePackage.getEString(), "type", "ASUP", 0, 1, QModuleSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleSource_Content(), ecorePackage.getEString(), "content", null, 0, 1, QModuleSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OperatingSystemModulePackageImpl
