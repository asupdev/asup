/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.util.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.java.QFrameworkJavaPackage;
import org.asup.fw.util.QFrameworkUtilFactory;
import org.asup.fw.util.QFrameworkUtilPackage;
import org.asup.fw.util.QFileUtil;
import org.asup.fw.util.QIOUtil;
import org.asup.fw.util.QListUtil;
import org.asup.fw.util.QStringUtil;
import org.asup.fw.util.QURIUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameworkUtilPackageImpl extends EPackageImpl implements QFrameworkUtilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileUtilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioUtilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listUtilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringUtilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriUtilEClass = null;

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
	 * @see org.asup.fw.util.QFrameworkUtilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FrameworkUtilPackageImpl() {
		super(eNS_URI, QFrameworkUtilFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QFrameworkUtilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QFrameworkUtilPackage init() {
		if (isInited) return (QFrameworkUtilPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkUtilPackage.eNS_URI);

		// Obtain or create and register package
		FrameworkUtilPackageImpl theFrameworkUtilPackage = (FrameworkUtilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FrameworkUtilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FrameworkUtilPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QFrameworkCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFrameworkUtilPackage.createPackageContents();

		// Initialize created meta-data
		theFrameworkUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFrameworkUtilPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QFrameworkUtilPackage.eNS_URI, theFrameworkUtilPackage);
		return theFrameworkUtilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileUtil() {
		return fileUtilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOUtil() {
		return ioUtilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListUtil() {
		return listUtilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringUtil() {
		return stringUtilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURIUtil() {
		return uriUtilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFrameworkUtilFactory getFrameworkUtilFactory() {
		return (QFrameworkUtilFactory)getEFactoryInstance();
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
		fileUtilEClass = createEClass(FILE_UTIL);

		ioUtilEClass = createEClass(IO_UTIL);

		listUtilEClass = createEClass(LIST_UTIL);

		stringUtilEClass = createEClass(STRING_UTIL);

		uriUtilEClass = createEClass(URI_UTIL);
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
		fileUtilEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		ioUtilEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		listUtilEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		stringUtilEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		uriUtilEClass.getESuperTypes().add(theFrameworkCorePackage.getService());

		// Initialize classes and features; add operations and parameters
		initEClass(fileUtilEClass, QFileUtil.class, "FileUtil", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(fileUtilEClass, ecorePackage.getEString(), "getBaseName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ioUtilEClass, QIOUtil.class, "IOUtil", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(ioUtilEClass, null, "copy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaInputStream(), "input", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listUtilEClass, QListUtil.class, "ListUtil", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(listUtilEClass, null, "addFirst", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		addEParameter(op, theFrameworkJavaPackage.getJavaList(), "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listUtilEClass, null, "addLast", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		addEParameter(op, theFrameworkJavaPackage.getJavaList(), "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringUtilEClass, QStringUtil.class, "StringUtil", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(stringUtilEClass, ecorePackage.getEString(), "firstToUpper", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringUtilEClass, ecorePackage.getEString(), "appendChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "chars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "times", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "before", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uriUtilEClass, QURIUtil.class, "URIUtil", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(uriUtilEClass, ecorePackage.getEString(), "getBaseName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaURI(), "uri", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FWUtilPackageImpl
