/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.output.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.java.QFrameworkJavaPackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.core.datetime.QDatetimePackage;
import org.asup.os.core.datetime.impl.DatetimePackageImpl;
import org.asup.os.core.impl.OperatingSystemCorePackageImpl;
import org.asup.os.core.jobs.QOperatingSystemJobsPackage;
import org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl;
import org.asup.os.core.output.QObjectWriter;
import org.asup.os.core.output.QObjectWriterFactory;
import org.asup.os.core.output.QObjectWriterFactoryRegistry;
import org.asup.os.core.output.QOperatingSystemOutputFactory;
import org.asup.os.core.output.QOperatingSystemOutputPackage;
import org.asup.os.core.output.QOutputManager;
import org.asup.os.core.resources.QOperatingSystemResourcesPackage;
import org.asup.os.core.resources.impl.OperatingSystemResourcesPackageImpl;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemOutputPackageImpl extends EPackageImpl implements QOperatingSystemOutputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWriterFactoryRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectWriterFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputManagerEClass = null;

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
	 * @see org.asup.os.core.output.QOperatingSystemOutputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemOutputPackageImpl() {
		super(eNS_URI, QOperatingSystemOutputFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemOutputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemOutputPackage init() {
		if (isInited) return (QOperatingSystemOutputPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOutputPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemOutputPackageImpl theOperatingSystemOutputPackage = (OperatingSystemOutputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemOutputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemOutputPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();
		QOperatingSystemOmacPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OperatingSystemCorePackageImpl theOperatingSystemCorePackage = (OperatingSystemCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI) instanceof OperatingSystemCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI) : QOperatingSystemCorePackage.eINSTANCE);
		OperatingSystemJobsPackageImpl theOperatingSystemJobsPackage = (OperatingSystemJobsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) instanceof OperatingSystemJobsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) : QOperatingSystemJobsPackage.eINSTANCE);
		OperatingSystemResourcesPackageImpl theOperatingSystemResourcesPackage = (OperatingSystemResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemResourcesPackage.eNS_URI) instanceof OperatingSystemResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemResourcesPackage.eNS_URI) : QOperatingSystemResourcesPackage.eINSTANCE);
		DatetimePackageImpl theDatetimePackage = (DatetimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatetimePackage.eNS_URI) instanceof DatetimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatetimePackage.eNS_URI) : QDatetimePackage.eINSTANCE);

		// Create package meta-data objects
		theOperatingSystemOutputPackage.createPackageContents();
		theOperatingSystemCorePackage.createPackageContents();
		theOperatingSystemJobsPackage.createPackageContents();
		theOperatingSystemResourcesPackage.createPackageContents();
		theDatetimePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemOutputPackage.initializePackageContents();
		theOperatingSystemCorePackage.initializePackageContents();
		theOperatingSystemJobsPackage.initializePackageContents();
		theOperatingSystemResourcesPackage.initializePackageContents();
		theDatetimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemOutputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemOutputPackage.eNS_URI, theOperatingSystemOutputPackage);
		return theOperatingSystemOutputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectWriter() {
		return objectWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectWriterFactoryRegistry() {
		return objectWriterFactoryRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectWriterFactory() {
		return objectWriterFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputManager() {
		return outputManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemOutputFactory getOperatingSystemOutputFactory() {
		return (QOperatingSystemOutputFactory)getEFactoryInstance();
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
		objectWriterEClass = createEClass(OBJECT_WRITER);

		objectWriterFactoryRegistryEClass = createEClass(OBJECT_WRITER_FACTORY_REGISTRY);

		objectWriterFactoryEClass = createEClass(OBJECT_WRITER_FACTORY);

		outputManagerEClass = createEClass(OUTPUT_MANAGER);
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
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theFrameworkCorePackage.getPluginRegistry());
		EGenericType g2 = createEGenericType(this.getObjectWriterFactory());
		g1.getETypeArguments().add(g2);
		objectWriterFactoryRegistryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFrameworkCorePackage.getService());
		objectWriterFactoryRegistryEClass.getEGenericSuperTypes().add(g1);
		objectWriterFactoryEClass.getESuperTypes().add(theFrameworkCorePackage.getPlugin());
		objectWriterFactoryEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		outputManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());

		// Initialize classes and features; add operations and parameters
		initEClass(objectWriterEClass, QObjectWriter.class, "ObjectWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(objectWriterEClass, null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectWriterEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(objectWriterEClass, null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemOmacPackage.getObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		initEClass(objectWriterFactoryRegistryEClass, QObjectWriterFactoryRegistry.class, "ObjectWriterFactoryRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(objectWriterFactoryRegistryEClass, this.getObjectWriterFactory(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobType(), "jobType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectWriterFactoryEClass, QObjectWriterFactory.class, "ObjectWriterFactory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(objectWriterFactoryEClass, this.getObjectWriter(), "createObjectWriter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputManagerEClass, QOutputManager.class, "OutputManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(outputManagerEClass, this.getObjectWriter(), "getDefaultWriter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputManagerEClass, this.getObjectWriter(), "getObjectWriter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputManagerEClass, null, "registerWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectWriter(), "writer", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputManagerEClass, null, "setDefaultWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
	}

} //OSCoreOutputPackageImpl
