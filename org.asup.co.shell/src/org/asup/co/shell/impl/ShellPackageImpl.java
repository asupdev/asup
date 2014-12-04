/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.shell.impl;

import org.asup.co.shell.QOutputWrapper;
import org.asup.co.shell.QShellFactory;
import org.asup.co.shell.QShellPackage;

import org.asup.fw.core.QFrameworkCorePackage;

import org.asup.fw.java.QFrameworkJavaPackage;

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
public class ShellPackageImpl extends EPackageImpl implements QShellPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputWrapperEClass = null;

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
	 * @see org.asup.co.shell.QShellPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShellPackageImpl() {
		super(eNS_URI, QShellFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QShellPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QShellPackage init() {
		if (isInited) return (QShellPackage)EPackage.Registry.INSTANCE.getEPackage(QShellPackage.eNS_URI);

		// Obtain or create and register package
		ShellPackageImpl theShellPackage = (ShellPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ShellPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ShellPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QFrameworkCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theShellPackage.createPackageContents();

		// Initialize created meta-data
		theShellPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShellPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QShellPackage.eNS_URI, theShellPackage);
		return theShellPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputWrapper() {
		return outputWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QShellFactory getShellFactory() {
		return (QShellFactory)getEFactoryInstance();
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
		outputWrapperEClass = createEClass(OUTPUT_WRAPPER);
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
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		outputWrapperEClass.getESuperTypes().add(theFrameworkCorePackage.getService());

		// Initialize classes and features; add operations and parameters
		initEClass(outputWrapperEClass, QOutputWrapper.class, "OutputWrapper", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(outputWrapperEClass, null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(outputWrapperEClass, null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(outputWrapperEClass, null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaWriter(), "writer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputWrapperEClass, null, "unregister", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputWrapperEClass, ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jobID", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ShellPackageImpl
