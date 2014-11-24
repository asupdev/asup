/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.pgm.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.data.QData;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.core.jobs.QOperatingSystemJobsPackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.asup.os.type.pgm.OperatingSystemRuntimeProgramException;
import org.asup.os.type.pgm.QActivationGroup;
import org.asup.os.type.pgm.QActivationGroupManager;
import org.asup.os.type.pgm.QCallableProgram;
import org.asup.os.type.pgm.QCallableProgramDelegator;
import org.asup.os.type.pgm.QOperatingSystemProgramFactory;
import org.asup.os.type.pgm.QOperatingSystemProgramPackage;
import org.asup.os.type.pgm.QProgram;
import org.asup.os.type.pgm.QProgramContainer;
import org.asup.os.type.pgm.QProgramManager;
import org.asup.os.type.pgm.QProgramSource;
import org.asup.os.type.pgm.QProgramStack;
import org.asup.os.type.pgm.QProgramStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemProgramPackageImpl extends EPackageImpl implements QOperatingSystemProgramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationGroupManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableProgramDelegatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programStackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parameterListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operatingSystemRuntimeProgramExceptionEDataType = null;

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
	 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemProgramPackageImpl() {
		super(eNS_URI, QOperatingSystemProgramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemProgramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemProgramPackage init() {
		if (isInited) return (QOperatingSystemProgramPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemProgramPackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemProgramPackageImpl theOperatingSystemProgramPackage = (OperatingSystemProgramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemProgramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemProgramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemProgramPackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemProgramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemProgramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemProgramPackage.eNS_URI, theOperatingSystemProgramPackage);
		return theOperatingSystemProgramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationGroup() {
		return activationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationGroup_FrameworkContext() {
		return (EReference)activationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationGroup_Name() {
		return (EAttribute)activationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationGroup_Programs() {
		return (EReference)activationGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationGroupManager() {
		return activationGroupManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_ActivationGroup() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_Address() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_CreationParams() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Source() {
		return (EReference)programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallableProgram() {
		return callableProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableProgram_QActivationGroup() {
		return (EReference)callableProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallableProgram_QEntry() {
		return (EAttribute)callableProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableProgram_QProgram() {
		return (EReference)callableProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallableProgramDelegator() {
		return callableProgramDelegatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramContainer() {
		return programContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramContainer_BasePackage() {
		return (EAttribute)programContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramContainer_ScanPackage() {
		return (EAttribute)programContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramManager() {
		return programManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramSource() {
		return programSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramSource_Type() {
		return (EAttribute)programSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramSource_Content() {
		return (EAttribute)programSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramStack() {
		return programStackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramStack_DateEnter() {
		return (EAttribute)programStackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramStack_DateExit() {
		return (EAttribute)programStackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramStatus() {
		return programStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramStatus_CallableProgram() {
		return (EReference)programStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParameterList() {
		return parameterListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperatingSystemRuntimeProgramException() {
		return operatingSystemRuntimeProgramExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemProgramFactory getOperatingSystemProgramFactory() {
		return (QOperatingSystemProgramFactory)getEFactoryInstance();
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
		activationGroupEClass = createEClass(ACTIVATION_GROUP);
		createEReference(activationGroupEClass, ACTIVATION_GROUP__FRAMEWORK_CONTEXT);
		createEAttribute(activationGroupEClass, ACTIVATION_GROUP__NAME);
		createEReference(activationGroupEClass, ACTIVATION_GROUP__PROGRAMS);

		activationGroupManagerEClass = createEClass(ACTIVATION_GROUP_MANAGER);

		callableProgramEClass = createEClass(CALLABLE_PROGRAM);
		createEReference(callableProgramEClass, CALLABLE_PROGRAM__QACTIVATION_GROUP);
		createEAttribute(callableProgramEClass, CALLABLE_PROGRAM__QENTRY);
		createEReference(callableProgramEClass, CALLABLE_PROGRAM__QPROGRAM);

		callableProgramDelegatorEClass = createEClass(CALLABLE_PROGRAM_DELEGATOR);

		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__ACTIVATION_GROUP);
		createEAttribute(programEClass, PROGRAM__ADDRESS);
		createEAttribute(programEClass, PROGRAM__CREATION_PARAMS);
		createEReference(programEClass, PROGRAM__SOURCE);

		programContainerEClass = createEClass(PROGRAM_CONTAINER);
		createEAttribute(programContainerEClass, PROGRAM_CONTAINER__BASE_PACKAGE);
		createEAttribute(programContainerEClass, PROGRAM_CONTAINER__SCAN_PACKAGE);

		programManagerEClass = createEClass(PROGRAM_MANAGER);

		programSourceEClass = createEClass(PROGRAM_SOURCE);
		createEAttribute(programSourceEClass, PROGRAM_SOURCE__TYPE);
		createEAttribute(programSourceEClass, PROGRAM_SOURCE__CONTENT);

		programStackEClass = createEClass(PROGRAM_STACK);
		createEAttribute(programStackEClass, PROGRAM_STACK__DATE_ENTER);
		createEAttribute(programStackEClass, PROGRAM_STACK__DATE_EXIT);

		programStatusEClass = createEClass(PROGRAM_STATUS);
		createEReference(programStatusEClass, PROGRAM_STATUS__CALLABLE_PROGRAM);

		// Create data types
		parameterListEDataType = createEDataType(PARAMETER_LIST);
		operatingSystemRuntimeProgramExceptionEDataType = createEDataType(OPERATING_SYSTEM_RUNTIME_PROGRAM_EXCEPTION);
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
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemCorePackage theOperatingSystemCorePackage = (QOperatingSystemCorePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI);
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activationGroupEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());
		activationGroupManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		callableProgramEClass.getESuperTypes().add(theOperatingSystemCorePackage.getCallable());
		programEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		EGenericType g1 = createEGenericType(theOperatingSystemTypePackage.getTypedContainer());
		EGenericType g2 = createEGenericType(this.getProgram());
		g1.getETypeArguments().add(g2);
		programContainerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theOperatingSystemTypePackage.getTypedManager());
		g2 = createEGenericType(this.getProgram());
		g1.getETypeArguments().add(g2);
		programManagerEClass.getEGenericSuperTypes().add(g1);
		programSourceEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());
		programStackEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());
		programStatusEClass.getESuperTypes().add(theOperatingSystemOmacPackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(activationGroupEClass, QActivationGroup.class, "ActivationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivationGroup_FrameworkContext(), theFrameworkCorePackage.getContext(), null, "frameworkContext", null, 1, 1, QActivationGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationGroup_Name(), ecorePackage.getEString(), "name", null, 1, 1, QActivationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationGroup_Programs(), this.getCallableProgram(), this.getCallableProgram_QActivationGroup(), "programs", null, 0, -1, QActivationGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(activationGroupEClass, this.getCallableProgram(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgram(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activationGroupManagerEClass, QActivationGroupManager.class, "ActivationGroupManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(activationGroupManagerEClass, this.getActivationGroup(), "create", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "register", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activationGroupManagerEClass, this.getActivationGroup(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activationGroupManagerEClass, null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivationGroup(), "activationGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(callableProgramEClass, QCallableProgram.class, "CallableProgram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallableProgram_QActivationGroup(), this.getActivationGroup(), this.getActivationGroup_Programs(), "qActivationGroup", null, 0, 1, QCallableProgram.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallableProgram_QEntry(), this.getParameterList(), "qEntry", null, 1, 1, QCallableProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallableProgram_QProgram(), this.getProgram(), null, "qProgram", null, 1, 1, QCallableProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(callableProgramEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(callableProgramEClass, ecorePackage.getEBoolean(), "isOpen", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(callableProgramEClass, ecorePackage.getEBoolean(), "isStateless", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(callableProgramEClass, null, "open", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theOperatingSystemCorePackage.getOperatingSystemRuntimeException());

		initEClass(callableProgramDelegatorEClass, QCallableProgramDelegator.class, "CallableProgramDelegator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(callableProgramDelegatorEClass, ecorePackage.getEObject(), "getDelegate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programEClass, QProgram.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_ActivationGroup(), ecorePackage.getEString(), "activationGroup", "*DFT", 0, 1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_Address(), ecorePackage.getEString(), "address", null, 0, 1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_CreationParams(), ecorePackage.getEString(), "creationParams", null, 0, -1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Source(), this.getProgramSource(), null, "source", null, 0, 1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programContainerEClass, QProgramContainer.class, "ProgramContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramContainer_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, QProgramContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramContainer_ScanPackage(), ecorePackage.getEBoolean(), "scanPackage", null, 1, 1, QProgramContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programManagerEClass, QProgramManager.class, "ProgramManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(programManagerEClass, null, "callProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "program", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameterList(), "params", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemRuntimeProgramException());

		op = addEOperation(programManagerEClass, null, "callProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameterList(), "params", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemRuntimeProgramException());

		op = addEOperation(programManagerEClass, this.getCallableProgram(), "getCaller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCallableProgram(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, this.getProgramStack(), "getProgramStack", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programManagerEClass, this.getCallableProgram(), "loadProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgram(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemRuntimeProgramException());

		op = addEOperation(programManagerEClass, this.getCallableProgram(), "loadProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatingSystemRuntimeProgramException());

		initEClass(programSourceEClass, QProgramSource.class, "ProgramSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramSource_Type(), ecorePackage.getEString(), "type", "ASUP", 0, 1, QProgramSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramSource_Content(), ecorePackage.getEString(), "content", null, 0, 1, QProgramSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programStackEClass, QProgramStack.class, "ProgramStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramStack_DateEnter(), ecorePackage.getEDate(), "dateEnter", null, 0, 1, QProgramStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramStack_DateExit(), ecorePackage.getEDate(), "dateExit", null, 0, 1, QProgramStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(programStackEClass, ecorePackage.getEBoolean(), "isEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStackEClass, this.getCallableProgram(), "list", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(programStackEClass, null, "push", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCallableProgram(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStackEClass, this.getCallableProgram(), "peek", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStackEClass, this.getCallableProgram(), "pop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(programStackEClass, ecorePackage.getEInt(), "size", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programStatusEClass, QProgramStatus.class, "ProgramStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramStatus_CallableProgram(), this.getCallableProgram(), null, "callableProgram", null, 1, 1, QProgramStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(parameterListEDataType, QData[].class, "ParameterList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operatingSystemRuntimeProgramExceptionEDataType, OperatingSystemRuntimeProgramException.class, "OperatingSystemRuntimeProgramException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (getProgram_ActivationGroup(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });	
		addAnnotation
		  (getProgram_Address(), 
		   source, 
		   new String[] {
			 "length", "128"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//CharacterDef")
		   });
	}

} //OSProgramCorePackageImpl
