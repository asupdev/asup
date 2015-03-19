/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.core.jobs.QOperatingSystemJobsPackage;
import org.asup.os.core.resources.QOperatingSystemResourcesPackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypeFactory;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.asup.os.type.QType;
import org.asup.os.type.QTypeManager;
import org.asup.os.type.QTypeRegistry;
import org.asup.os.type.QTypedContainer;
import org.asup.os.type.QTypedManager;
import org.asup.os.type.QTypedObject;
import org.asup.os.type.QTypedReference;
import org.eclipse.emf.common.util.URI;
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
public class OperatingSystemTypePackageImpl extends EPackageImpl implements QOperatingSystemTypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedContainerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedManagerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedObjectEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRegistryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeManagerEClass = null;
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
	 * @see org.asup.os.type.QOperatingSystemTypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemTypePackageImpl() {
		super(eNS_URI, QOperatingSystemTypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemTypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemTypePackage init() {
		if (isInited) return (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemTypePackageImpl theOperatingSystemTypePackage = (OperatingSystemTypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemTypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemTypePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemTypePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemTypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemTypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemTypePackage.eNS_URI, theOperatingSystemTypePackage);
		return theOperatingSystemTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_ClassName() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Domain() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Manager() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Specials() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedContainer() {
		return typedContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedManager() {
		return typedManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedObject() {
		return typedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedObject_Application() {
		return (EAttribute)typedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedObject_CreationInfo() {
		return (EReference)typedObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedObject_Library() {
		return (EAttribute)typedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedObject_MemoryInfo() {
		return (EReference)typedObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedObject_Name() {
		return (EAttribute)typedObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedObject_Text() {
		return (EAttribute)typedObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeRegistry() {
		return typeRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedReference() {
		return typedReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedReference_Library() {
		return (EAttribute)typedReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedReference_Name() {
		return (EAttribute)typedReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeManager() {
		return typeManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemTypeFactory getOperatingSystemTypeFactory() {
		return (QOperatingSystemTypeFactory)getEFactoryInstance();
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
		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__CLASS_NAME);
		createEAttribute(typeEClass, TYPE__DOMAIN);
		createEAttribute(typeEClass, TYPE__MANAGER);
		createEAttribute(typeEClass, TYPE__SPECIALS);

		typedContainerEClass = createEClass(TYPED_CONTAINER);

		typedManagerEClass = createEClass(TYPED_MANAGER);

		typedObjectEClass = createEClass(TYPED_OBJECT);
		createEAttribute(typedObjectEClass, TYPED_OBJECT__APPLICATION);
		createEAttribute(typedObjectEClass, TYPED_OBJECT__LIBRARY);
		createEAttribute(typedObjectEClass, TYPED_OBJECT__NAME);
		createEAttribute(typedObjectEClass, TYPED_OBJECT__TEXT);
		createEReference(typedObjectEClass, TYPED_OBJECT__CREATION_INFO);
		createEReference(typedObjectEClass, TYPED_OBJECT__MEMORY_INFO);

		typedReferenceEClass = createEClass(TYPED_REFERENCE);
		createEAttribute(typedReferenceEClass, TYPED_REFERENCE__LIBRARY);
		createEAttribute(typedReferenceEClass, TYPED_REFERENCE__NAME);

		typeManagerEClass = createEClass(TYPE_MANAGER);

		typeRegistryEClass = createEClass(TYPE_REGISTRY);
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
		QOperatingSystemOmacPackage theOperatingSystemOmacPackage = (QOperatingSystemOmacPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOmacPackage.eNS_URI);
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);
		QOperatingSystemResourcesPackage theOperatingSystemResourcesPackage = (QOperatingSystemResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemResourcesPackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemCorePackage theOperatingSystemCorePackage = (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter typedContainerEClass_T = addETypeParameter(typedContainerEClass, "T");
		ETypeParameter typedManagerEClass_T = addETypeParameter(typedManagerEClass, "T");
		ETypeParameter typedReferenceEClass_T = addETypeParameter(typedReferenceEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getTypedObject());
		typedContainerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getTypedObject());
		typedManagerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getTypedObject());
		typedReferenceEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		typeEClass.getESuperTypes().add(this.getTypedObject());
		g1 = createEGenericType(theOperatingSystemOmacPackage.getObjectContainer());
		EGenericType g2 = createEGenericType(typedContainerEClass_T);
		g1.getETypeArguments().add(g2);
		typedContainerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFrameworkCorePackage.getPlugin());
		typedContainerEClass.getEGenericSuperTypes().add(g1);
		typedManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getPlugin());
		typedManagerEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getManager());
		typedObjectEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObjectNameable());
		typedReferenceEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());
		g1 = createEGenericType(this.getTypedManager());
		g2 = createEGenericType(this.getType());
		g1.getETypeArguments().add(g2);
		typeManagerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFrameworkCorePackage.getPluginRegistry());
		g2 = createEGenericType(this.getTypedManager());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getTypedObject());
		g2.getETypeArguments().add(g3);
		typeRegistryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(typeEClass, QType.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Domain(), ecorePackage.getEString(), "domain", null, 1, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Manager(), ecorePackage.getEString(), "manager", null, 1, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Specials(), ecorePackage.getEString(), "specials", null, 0, -1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedContainerEClass, QTypedContainer.class, "TypedContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedManagerEClass, QTypedManager.class, "TypedManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(typedManagerEClass, null, "getTypedClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(typedManagerEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(typedManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "container", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theOperatingSystemResourcesPackage.getResourceReader());
		g2 = createEGenericType(typedManagerEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(typedManagerEClass, null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemCorePackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theOperatingSystemResourcesPackage.getResourceSetReader());
		g2 = createEGenericType(typedManagerEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(typedManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "container", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theOperatingSystemResourcesPackage.getResourceWriter());
		g2 = createEGenericType(typedManagerEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(typedManagerEClass, null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemCorePackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theOperatingSystemResourcesPackage.getResourceWriter());
		g2 = createEGenericType(typedManagerEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(typedObjectEClass, QTypedObject.class, "TypedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedObject_Application(), ecorePackage.getEString(), "application", null, 0, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedObject_Library(), ecorePackage.getEString(), "library", null, 0, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedObject_Text(), ecorePackage.getEString(), "text", null, 0, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedObject_CreationInfo(), theOperatingSystemOmacPackage.getCreationInfo(), null, "creationInfo", null, 0, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedObject_MemoryInfo(), theOperatingSystemOmacPackage.getMemoryInfo(), null, "memoryInfo", null, 0, 1, QTypedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(typedObjectEClass, ecorePackage.getEString(), "getAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typedReferenceEClass, QTypedReference.class, "TypedReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedReference_Library(), ecorePackage.getEString(), "library", null, 1, 1, QTypedReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, QTypedReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeManagerEClass, QTypeManager.class, "TypeManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(typeManagerEClass, this.getType(), "lookupByDomain", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeManagerEClass, this.getType(), "lookupByClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getTypedObject());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeManagerEClass, null, "getTypeReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theOperatingSystemResourcesPackage.getResourceReader());
		g2 = createEGenericType(this.getType());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(typeRegistryEClass, QTypeRegistry.class, "TypeRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(typeRegistryEClass, null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getTypedObject());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "typedClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getTypedManager());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(typeRegistryEClass, null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getTypedObject());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "typedObject", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getTypedManager());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// il-data
		createIldataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>il-data</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIldataAnnotations() {
		String source = "il-data";	
		addAnnotation
		  (getType_ClassName(), 
		   source, 
		   new String[] {
			 "length", "64"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getType_Domain(), 
		   source, 
		   new String[] {
			 "length", "32"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getType_Manager(), 
		   source, 
		   new String[] {
			 "length", "64"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getTypedObject_Application(), 
		   source, 
		   new String[] {
			 "length", "2"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getTypedObject_Library(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getTypedObject_Name(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getTypedObject_Text(), 
		   source, 
		   new String[] {
			 "length", "50"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getTypedObject_CreationInfo(), 
		   source, 
		   new String[] {
			 "length", "30"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getTypedReference_Library(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getTypedReference_Name(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });
	}

} //OSTypePackageImpl
