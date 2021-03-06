/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.usrprf.impl;

import org.asup.os.type.QOperatingSystemTypePackage;
import org.asup.os.type.usrprf.QOperatingSystemUserProfileFactory;
import org.asup.os.type.usrprf.QOperatingSystemUserProfilePackage;
import org.asup.os.type.usrprf.QUserProfile;
import org.asup.os.type.usrprf.QUserProfileManager;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemUserProfilePackageImpl extends EPackageImpl implements QOperatingSystemUserProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userProfileManagerEClass = null;

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
	 * @see org.asup.os.type.usrprf.QOperatingSystemUserProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemUserProfilePackageImpl() {
		super(eNS_URI, QOperatingSystemUserProfileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemUserProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemUserProfilePackage init() {
		if (isInited) return (QOperatingSystemUserProfilePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemUserProfilePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemUserProfilePackageImpl theOperatingSystemUserProfilePackage = (OperatingSystemUserProfilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemUserProfilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemUserProfilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemUserProfilePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemUserProfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemUserProfilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemUserProfilePackage.eNS_URI, theOperatingSystemUserProfilePackage);
		return theOperatingSystemUserProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserProfile() {
		return userProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_JobDescription() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_InitialProgram() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_MessageQueue() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_OutQueue() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserProfileManager() {
		return userProfileManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemUserProfileFactory getOperatingSystemUserProfileFactory() {
		return (QOperatingSystemUserProfileFactory)getEFactoryInstance();
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
		userProfileEClass = createEClass(USER_PROFILE);
		createEAttribute(userProfileEClass, USER_PROFILE__JOB_DESCRIPTION);
		createEAttribute(userProfileEClass, USER_PROFILE__INITIAL_PROGRAM);
		createEAttribute(userProfileEClass, USER_PROFILE__MESSAGE_QUEUE);
		createEAttribute(userProfileEClass, USER_PROFILE__OUT_QUEUE);

		userProfileManagerEClass = createEClass(USER_PROFILE_MANAGER);
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
		userProfileEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		EGenericType g1 = createEGenericType(theOperatingSystemTypePackage.getTypedManager());
		EGenericType g2 = createEGenericType(this.getUserProfile());
		g1.getETypeArguments().add(g2);
		userProfileManagerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(userProfileEClass, QUserProfile.class, "UserProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProfile_JobDescription(), ecorePackage.getEString(), "jobDescription", null, 0, 1, QUserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_InitialProgram(), ecorePackage.getEString(), "initialProgram", null, 0, 1, QUserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_MessageQueue(), ecorePackage.getEString(), "messageQueue", null, 0, 1, QUserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_OutQueue(), ecorePackage.getEString(), "outQueue", null, 0, 1, QUserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userProfileManagerEClass, QUserProfileManager.class, "UserProfileManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OSUserProfileCorePackageImpl
