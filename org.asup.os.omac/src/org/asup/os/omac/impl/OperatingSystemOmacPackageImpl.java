/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.omac.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.os.omac.QCreationInfo;
import org.asup.os.omac.QManager;
import org.asup.os.omac.QMemoryInfo;
import org.asup.os.omac.QBundleManager;
import org.asup.os.omac.QBundleVisitor;
import org.asup.os.omac.QClass;
import org.asup.os.omac.QObject;
import org.asup.os.omac.QObjectContainer;
import org.asup.os.omac.QObjectIterator;
import org.asup.os.omac.QObjectNameable;
import org.asup.os.omac.QOperatingSystemOmacFactory;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemOmacPackageImpl extends EPackageImpl implements QOperatingSystemOmacPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNameableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

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
	 * @see org.asup.os.omac.QOperatingSystemOmacPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemOmacPackageImpl() {
		super(eNS_URI, QOperatingSystemOmacFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemOmacPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemOmacPackage init() {
		if (isInited) return (QOperatingSystemOmacPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOmacPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemOmacPackageImpl theOperatingSystemOmacPackage = (OperatingSystemOmacPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemOmacPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemOmacPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QFrameworkCorePackage.eINSTANCE.eClass();
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemOmacPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemOmacPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemOmacPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemOmacPackage.eNS_URI, theOperatingSystemOmacPackage);
		return theOperatingSystemOmacPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleManager() {
		return bundleManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleVisitor() {
		return bundleVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationInfo() {
		return creationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationInfo_CreationDate() {
		return (EAttribute)creationInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationInfo_CreationUser() {
		return (EAttribute)creationInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationInfo_CreationSystem() {
		return (EAttribute)creationInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryInfo() {
		return memoryInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryInfo_Dimension() {
		return (EAttribute)memoryInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectContainer() {
		return objectContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectContainer_Contents() {
		return (EReference)objectContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIterator() {
		return objectIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNameable() {
		return objectNameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemOmacFactory getOperatingSystemOmacFactory() {
		return (QOperatingSystemOmacFactory)getEFactoryInstance();
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
		bundleManagerEClass = createEClass(BUNDLE_MANAGER);

		bundleVisitorEClass = createEClass(BUNDLE_VISITOR);

		classEClass = createEClass(CLASS);

		creationInfoEClass = createEClass(CREATION_INFO);
		createEAttribute(creationInfoEClass, CREATION_INFO__CREATION_DATE);
		createEAttribute(creationInfoEClass, CREATION_INFO__CREATION_USER);
		createEAttribute(creationInfoEClass, CREATION_INFO__CREATION_SYSTEM);

		managerEClass = createEClass(MANAGER);

		memoryInfoEClass = createEClass(MEMORY_INFO);
		createEAttribute(memoryInfoEClass, MEMORY_INFO__DIMENSION);

		objectEClass = createEClass(OBJECT);

		objectContainerEClass = createEClass(OBJECT_CONTAINER);
		createEReference(objectContainerEClass, OBJECT_CONTAINER__CONTENTS);

		objectIteratorEClass = createEClass(OBJECT_ITERATOR);

		objectNameableEClass = createEClass(OBJECT_NAMEABLE);
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter objectContainerEClass_T = addETypeParameter(objectContainerEClass, "T");
		ETypeParameter objectIteratorEClass_T = addETypeParameter(objectIteratorEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getObject());
		objectContainerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getObject());
		objectIteratorEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		bundleManagerEClass.getESuperTypes().add(this.getManager());
		creationInfoEClass.getESuperTypes().add(this.getObject());
		managerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		memoryInfoEClass.getESuperTypes().add(this.getObject());
		objectNameableEClass.getESuperTypes().add(this.getObject());
		objectNameableEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNameable());

		// Initialize classes and features; add operations and parameters
		initEClass(bundleManagerEClass, QBundleManager.class, "BundleManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(bundleManagerEClass, ecorePackage.getEBoolean(), "isRegisterable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "bundleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleManagerEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "bundleName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBundleVisitor(), "visitor", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleManagerEClass, null, "register", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "bundleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleManagerEClass, null, "unregister", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "symbolicName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bundleVisitorEClass, QBundleVisitor.class, "BundleVisitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(bundleVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleVisitorEClass, null, "visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getObjectContainer());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "container", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bundleVisitorEClass, null, "visitExit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getObjectContainer());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "container", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(classEClass, QClass.class, "Class", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(creationInfoEClass, QCreationInfo.class, "CreationInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreationInfo_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, QCreationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationInfo_CreationUser(), ecorePackage.getEString(), "creationUser", null, 0, 1, QCreationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationInfo_CreationSystem(), ecorePackage.getEString(), "creationSystem", null, 0, 1, QCreationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerEClass, QManager.class, "Manager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryInfoEClass, QMemoryInfo.class, "MemoryInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryInfo_Dimension(), ecorePackage.getEInt(), "dimension", null, 0, 1, QMemoryInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, QObject.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(objectEClass, this.getClass_(), "qClass", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectContainerEClass, QObjectContainer.class, "ObjectContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(objectContainerEClass_T);
		initEReference(getObjectContainer_Contents(), g1, null, "contents", null, 0, -1, QObjectContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(objectContainerEClass, null, "lookupByName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(objectContainerEClass_T);
		initEOperation(op, g1);

		initEClass(objectIteratorEClass, QObjectIterator.class, "ObjectIterator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(objectIteratorEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectIteratorEClass, ecorePackage.getEBoolean(), "hasNext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectIteratorEClass, null, "next", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(objectIteratorEClass_T);
		initEOperation(op, g1);

		addEOperation(objectIteratorEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectNameableEClass, QObjectNameable.class, "ObjectNameable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OSCoreOmacPackageImpl
