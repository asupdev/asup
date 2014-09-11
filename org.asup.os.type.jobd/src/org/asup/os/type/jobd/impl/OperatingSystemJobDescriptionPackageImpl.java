/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.jobd.impl;

import org.asup.os.type.QOperatingSystemTypePackage;
import org.asup.os.type.jobd.QJobDescription;
import org.asup.os.type.jobd.QJobDescriptionManager;
import org.asup.os.type.jobd.QOperatingSystemJobDescriptionFactory;
import org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage;
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
public class OperatingSystemJobDescriptionPackageImpl extends EPackageImpl implements QOperatingSystemJobDescriptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobDescriptionManagerEClass = null;

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
	 * @see org.asup.os.type.jobd.QOperatingSystemJobDescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemJobDescriptionPackageImpl() {
		super(eNS_URI, QOperatingSystemJobDescriptionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemJobDescriptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemJobDescriptionPackage init() {
		if (isInited) return (QOperatingSystemJobDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobDescriptionPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemJobDescriptionPackageImpl theOperatingSystemJobDescriptionPackage = (OperatingSystemJobDescriptionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemJobDescriptionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemJobDescriptionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemJobDescriptionPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemJobDescriptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemJobDescriptionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemJobDescriptionPackage.eNS_URI, theOperatingSystemJobDescriptionPackage);
		return theOperatingSystemJobDescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobDescription() {
		return jobDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobDescription_Libraries() {
		return (EAttribute)jobDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobDescription_JobQueue() {
		return (EReference)jobDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobDescription_OutQueue() {
		return (EReference)jobDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobDescription_User() {
		return (EAttribute)jobDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobDescriptionManager() {
		return jobDescriptionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemJobDescriptionFactory getOperatingSystemJobDescriptionFactory() {
		return (QOperatingSystemJobDescriptionFactory)getEFactoryInstance();
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
		jobDescriptionEClass = createEClass(JOB_DESCRIPTION);
		createEAttribute(jobDescriptionEClass, JOB_DESCRIPTION__LIBRARIES);
		createEReference(jobDescriptionEClass, JOB_DESCRIPTION__JOB_QUEUE);
		createEReference(jobDescriptionEClass, JOB_DESCRIPTION__OUT_QUEUE);
		createEAttribute(jobDescriptionEClass, JOB_DESCRIPTION__USER);

		jobDescriptionManagerEClass = createEClass(JOB_DESCRIPTION_MANAGER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jobDescriptionEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		EGenericType g1 = createEGenericType(theOperatingSystemTypePackage.getTypedManager());
		EGenericType g2 = createEGenericType(this.getJobDescription());
		g1.getETypeArguments().add(g2);
		jobDescriptionManagerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(jobDescriptionEClass, QJobDescription.class, "JobDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobDescription_Libraries(), ecorePackage.getEString(), "libraries", null, 0, -1, QJobDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theOperatingSystemTypePackage.getTypedReference());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getJobDescription_JobQueue(), g1, null, "jobQueue", null, 0, 1, QJobDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theOperatingSystemTypePackage.getTypedReference());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getJobDescription_OutQueue(), g1, null, "outQueue", null, 0, 1, QJobDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobDescription_User(), ecorePackage.getEString(), "user", null, 0, 1, QJobDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobDescriptionManagerEClass, QJobDescriptionManager.class, "JobDescriptionManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OSJobDescriptionCorePackageImpl
