/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.os.core.ContentLockType;
import org.asup.os.core.LockType;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.QCallable;
import org.asup.os.core.QContainer;
import org.asup.os.core.QContentLock;
import org.asup.os.core.QContentLockable;
import org.asup.os.core.QContentLocker;
import org.asup.os.core.QLockable;
import org.asup.os.core.QLocker;
import org.asup.os.core.QObjectContent;
import org.asup.os.core.QOperatingSystemCoreFactory;
import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.core.QSystem;
import org.asup.os.core.QSystemManager;
import org.asup.os.core.Scope;
import org.asup.os.core.SystemStatus;
import org.asup.os.core.datetime.QDatetimePackage;
import org.asup.os.core.datetime.impl.DatetimePackageImpl;
import org.asup.os.core.jobs.QOperatingSystemJobsPackage;
import org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl;
import org.asup.os.core.output.QOperatingSystemOutputPackage;
import org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl;
import org.asup.os.core.resources.QOperatingSystemResourcesPackage;
import org.asup.os.core.resources.impl.OperatingSystemResourcesPackageImpl;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class OperatingSystemCorePackageImpl extends EPackageImpl implements QOperatingSystemCorePackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentLockableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentLockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentLockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentLockTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lockTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operatingSystemExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operatingSystemRuntimeExceptionEDataType = null;

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
	 * @see org.asup.os.core.QOperatingSystemCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemCorePackageImpl() {
		super(eNS_URI, QOperatingSystemCoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemCorePackage init() {
		if (isInited) return (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemCorePackageImpl theOperatingSystemCorePackage = (OperatingSystemCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();
		QOperatingSystemOmacPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OperatingSystemJobsPackageImpl theOperatingSystemJobsPackage = (OperatingSystemJobsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) instanceof OperatingSystemJobsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) : QOperatingSystemJobsPackage.eINSTANCE);
		OperatingSystemOutputPackageImpl theOperatingSystemOutputPackage = (OperatingSystemOutputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOutputPackage.eNS_URI) instanceof OperatingSystemOutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOutputPackage.eNS_URI) : QOperatingSystemOutputPackage.eINSTANCE);
		OperatingSystemResourcesPackageImpl theOperatingSystemResourcesPackage = (OperatingSystemResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemResourcesPackage.eNS_URI) instanceof OperatingSystemResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemResourcesPackage.eNS_URI) : QOperatingSystemResourcesPackage.eINSTANCE);
		DatetimePackageImpl theDatetimePackage = (DatetimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDatetimePackage.eNS_URI) instanceof DatetimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDatetimePackage.eNS_URI) : QDatetimePackage.eINSTANCE);

		// Create package meta-data objects
		theOperatingSystemCorePackage.createPackageContents();
		theOperatingSystemJobsPackage.createPackageContents();
		theOperatingSystemOutputPackage.createPackageContents();
		theOperatingSystemResourcesPackage.createPackageContents();
		theDatetimePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemCorePackage.initializePackageContents();
		theOperatingSystemJobsPackage.initializePackageContents();
		theOperatingSystemOutputPackage.initializePackageContents();
		theOperatingSystemResourcesPackage.initializePackageContents();
		theDatetimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemCorePackage.eNS_URI, theOperatingSystemCorePackage);
		return theOperatingSystemCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallable() {
		return callableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Content() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentLockable() {
		return contentLockableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentLock() {
		return contentLockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentLock_Type() {
		return (EAttribute)contentLockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentLocker() {
		return contentLockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLockable() {
		return lockableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocker() {
		return lockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectContent() {
		return objectContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectContent_Entries() {
		return (EReference)objectContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectContent_ReadLock() {
		return (EReference)objectContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectContent_WriteLock() {
		return (EReference)objectContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Context() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_CreationInfo() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_InstallPath() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_LastJobNumber() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Status() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_SystemLibrary() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_SystemUser() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemManager() {
		return systemManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContentLockType() {
		return contentLockTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLockType() {
		return lockTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScope() {
		return scopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemStatus() {
		return systemStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperatingSystemException() {
		return operatingSystemExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperatingSystemRuntimeException() {
		return operatingSystemRuntimeExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemCoreFactory getOperatingSystemCoreFactory() {
		return (QOperatingSystemCoreFactory)getEFactoryInstance();
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
		callableEClass = createEClass(CALLABLE);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTENT);

		contentLockableEClass = createEClass(CONTENT_LOCKABLE);

		contentLockEClass = createEClass(CONTENT_LOCK);
		createEAttribute(contentLockEClass, CONTENT_LOCK__TYPE);

		contentLockerEClass = createEClass(CONTENT_LOCKER);

		lockableEClass = createEClass(LOCKABLE);

		lockerEClass = createEClass(LOCKER);

		objectContentEClass = createEClass(OBJECT_CONTENT);
		createEReference(objectContentEClass, OBJECT_CONTENT__ENTRIES);
		createEReference(objectContentEClass, OBJECT_CONTENT__READ_LOCK);
		createEReference(objectContentEClass, OBJECT_CONTENT__WRITE_LOCK);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__CONTEXT);
		createEReference(systemEClass, SYSTEM__CREATION_INFO);
		createEAttribute(systemEClass, SYSTEM__INSTALL_PATH);
		createEAttribute(systemEClass, SYSTEM__LAST_JOB_NUMBER);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEAttribute(systemEClass, SYSTEM__STATUS);
		createEAttribute(systemEClass, SYSTEM__SYSTEM_LIBRARY);
		createEAttribute(systemEClass, SYSTEM__SYSTEM_USER);

		systemManagerEClass = createEClass(SYSTEM_MANAGER);

		// Create enums
		contentLockTypeEEnum = createEEnum(CONTENT_LOCK_TYPE);
		lockTypeEEnum = createEEnum(LOCK_TYPE);
		scopeEEnum = createEEnum(SCOPE);
		systemStatusEEnum = createEEnum(SYSTEM_STATUS);

		// Create data types
		operatingSystemExceptionEDataType = createEDataType(OPERATING_SYSTEM_EXCEPTION);
		operatingSystemRuntimeExceptionEDataType = createEDataType(OPERATING_SYSTEM_RUNTIME_EXCEPTION);
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
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemOutputPackage theOperatingSystemOutputPackage = (QOperatingSystemOutputPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOutputPackage.eNS_URI);
		QOperatingSystemResourcesPackage theOperatingSystemResourcesPackage = (QOperatingSystemResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemResourcesPackage.eNS_URI);
		QDatetimePackage theDatetimePackage = (QDatetimePackage)EPackage.Registry.INSTANCE.getEPackage(QDatetimePackage.eNS_URI);
		QOperatingSystemOmacPackage theOperatingSystemOmacPackage = (QOperatingSystemOmacPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOmacPackage.eNS_URI);
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOperatingSystemJobsPackage);
		getESubpackages().add(theOperatingSystemOutputPackage);
		getESubpackages().add(theOperatingSystemResourcesPackage);
		getESubpackages().add(theDatetimePackage);

		// Create type parameters
		ETypeParameter containerEClass_T = addETypeParameter(containerEClass, "T");
		ETypeParameter contentLockableEClass_T = addETypeParameter(contentLockableEClass, "T");
		ETypeParameter contentLockableEClass_K = addETypeParameter(contentLockableEClass, "K");
		ETypeParameter contentLockerEClass_T = addETypeParameter(contentLockerEClass, "T");
		ETypeParameter contentLockerEClass_K = addETypeParameter(contentLockerEClass, "K");
		ETypeParameter lockableEClass_T = addETypeParameter(lockableEClass, "T");
		ETypeParameter lockerEClass_T = addETypeParameter(lockerEClass, "T");
		ETypeParameter objectContentEClass_T = addETypeParameter(objectContentEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theOperatingSystemOmacPackage.getObject());
		containerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getContainer());
		EGenericType g2 = createEGenericType(contentLockableEClass_K);
		g1.getETypeArguments().add(g2);
		contentLockableEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theOperatingSystemOmacPackage.getObject());
		contentLockableEClass_K.getEBounds().add(g1);
		g1 = createEGenericType(this.getContainer());
		g2 = createEGenericType(contentLockerEClass_K);
		g1.getETypeArguments().add(g2);
		contentLockerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theOperatingSystemOmacPackage.getObject());
		contentLockerEClass_K.getEBounds().add(g1);
		g1 = createEGenericType(theOperatingSystemOmacPackage.getObject());
		lockableEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theOperatingSystemOmacPackage.getObject());
		lockerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theOperatingSystemOmacPackage.getObject());
		objectContentEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		contentLockEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());
		objectContentEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());
		systemEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObjectNameable());
		systemEClass.getESuperTypes().add(theFrameworkCorePackage.getContextProvider());
		g1 = createEGenericType(this.getLockable());
		g2 = createEGenericType(this.getSystem());
		g1.getETypeArguments().add(g2);
		systemManagerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFrameworkCorePackage.getService());
		systemManagerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(callableEClass, QCallable.class, "Callable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(callableEClass, null, "call", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containerEClass, QContainer.class, "Container", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getObjectContent());
		g2 = createEGenericType(containerEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getContainer_Content(), g1, null, "content", null, 0, 1, QContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentLockableEClass, QContentLockable.class, "ContentLockable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(contentLockableEClass, null, "getContainLocker", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getContentLocker());
		g2 = createEGenericType(contentLockableEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(contentLockableEClass_K);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(contentLockEClass, QContentLock.class, "ContentLock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentLock_Type(), this.getContentLockType(), "type", null, 0, 1, QContentLock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentLockerEClass, QContentLocker.class, "ContentLocker", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(contentLockerEClass, null, "lock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(contentLockerEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContentLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemRuntimeException());

		op = addEOperation(contentLockerEClass, ecorePackage.getEBoolean(), "tryLock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(contentLockerEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContentLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contentLockerEClass, null, "unlock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(contentLockerEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContentLockType(), "lockType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemRuntimeException());

		op = addEOperation(contentLockerEClass, ecorePackage.getEBoolean(), "isLocked", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(contentLockerEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContentLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contentLockerEClass, ecorePackage.getEBoolean(), "isLockedByOther", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(contentLockerEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContentLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lockableEClass, QLockable.class, "Lockable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lockableEClass, null, "getLocker", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getLocker());
		g2 = createEGenericType(lockableEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(lockerEClass, QLocker.class, "Locker", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lockerEClass, null, "lock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(lockerEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemRuntimeException());

		op = addEOperation(lockerEClass, ecorePackage.getEBoolean(), "tryLock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(lockerEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lockerEClass, null, "unlock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(lockerEClass_T);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemRuntimeException());

		initEClass(objectContentEClass, QObjectContent.class, "ObjectContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(objectContentEClass_T);
		initEReference(getObjectContent_Entries(), g1, null, "entries", null, 0, -1, QObjectContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectContent_ReadLock(), this.getContentLock(), null, "readLock", null, 1, 1, QObjectContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectContent_WriteLock(), this.getContentLock(), null, "writeLock", null, 1, 1, QObjectContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, QSystem.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Context(), theFrameworkCorePackage.getContext(), null, "context", null, 0, 1, QSystem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_CreationInfo(), theOperatingSystemOmacPackage.getCreationInfo(), null, "creationInfo", null, 0, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_InstallPath(), ecorePackage.getEString(), "installPath", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_LastJobNumber(), ecorePackage.getEInt(), "lastJobNumber", null, 0, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Status(), this.getSystemStatus(), "status", "STP", 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_SystemLibrary(), ecorePackage.getEString(), "systemLibrary", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_SystemUser(), ecorePackage.getEString(), "systemUser", null, 1, 1, QSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemManagerEClass, QSystemManager.class, "SystemManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(systemManagerEClass, this.getSystem(), "getSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(systemManagerEClass, theOperatingSystemJobsPackage.getJob(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemException());

		op = addEOperation(systemManagerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemException());

		// Initialize enums and add enum literals
		initEEnum(contentLockTypeEEnum, ContentLockType.class, "ContentLockType");
		addEEnumLiteral(contentLockTypeEEnum, ContentLockType.READ_LOCKED);
		addEEnumLiteral(contentLockTypeEEnum, ContentLockType.WRITE_LOCKED);

		initEEnum(lockTypeEEnum, LockType.class, "LockType");
		addEEnumLiteral(lockTypeEEnum, LockType.EXCLUSIVE);
		addEEnumLiteral(lockTypeEEnum, LockType.EXCLUSIVE_RD);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.ALL);
		addEEnumLiteral(scopeEEnum, Scope.LIBRARY_LIST);
		addEEnumLiteral(scopeEEnum, Scope.CURRENT_LIBRARY);
		addEEnumLiteral(scopeEEnum, Scope.USER_LIBRARY_LIST);
		addEEnumLiteral(scopeEEnum, Scope.ALL_USER);

		initEEnum(systemStatusEEnum, SystemStatus.class, "SystemStatus");
		addEEnumLiteral(systemStatusEEnum, SystemStatus.ACTIVATING);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.STARTED);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.ENDING);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.STOPPED);

		// Initialize data types
		initEDataType(operatingSystemExceptionEDataType, OperatingSystemException.class, "OperatingSystemException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operatingSystemRuntimeExceptionEDataType, OperatingSystemRuntimeException.class, "OperatingSystemRuntimeException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OSCorePackageImpl
