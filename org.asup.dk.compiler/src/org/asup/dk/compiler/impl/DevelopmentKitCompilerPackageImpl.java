/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler.impl;

import org.asup.dk.compiler.CaseSensitiveType;
import org.asup.dk.compiler.EntryType;
import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.QCompilerLinker;
import org.asup.dk.compiler.QCompilerManager;
import org.asup.dk.compiler.QDevelopmentKitCompilerFactory;
import org.asup.dk.compiler.QDevelopmentKitCompilerPackage;
import org.asup.dk.compiler.QUnitConverter;
import org.asup.dk.compiler.QUnitConverterRegistry;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.java.QFrameworkJavaPackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage;
import org.asup.il.flow.QIntegratedLanguageFlowPackage;
import org.asup.il.isam.QIntegratedLanguageIsamPackage;
import org.asup.os.core.jobs.QOperatingSystemJobsPackage;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.asup.os.type.module.QOperatingSystemModulePackage;
import org.asup.os.type.pgm.QOperatingSystemProgramPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class DevelopmentKitCompilerPackageImpl extends EPackageImpl implements QDevelopmentKitCompilerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilerManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitConverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitConverterRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilerLinkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum caseSensitiveTypeEEnum = null;

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
	 * @see org.asup.dk.compiler.QDevelopmentKitCompilerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevelopmentKitCompilerPackageImpl() {
		super(eNS_URI, QDevelopmentKitCompilerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDevelopmentKitCompilerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDevelopmentKitCompilerPackage init() {
		if (isInited) return (QDevelopmentKitCompilerPackage)EPackage.Registry.INSTANCE.getEPackage(QDevelopmentKitCompilerPackage.eNS_URI);

		// Obtain or create and register package
		DevelopmentKitCompilerPackageImpl theDevelopmentKitCompilerPackage = (DevelopmentKitCompilerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevelopmentKitCompilerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevelopmentKitCompilerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageFlowPackage.eINSTANCE.eClass();
		QOperatingSystemFilePackage.eINSTANCE.eClass();
		QOperatingSystemModulePackage.eINSTANCE.eClass();
		QOperatingSystemProgramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDevelopmentKitCompilerPackage.createPackageContents();

		// Initialize created meta-data
		theDevelopmentKitCompilerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevelopmentKitCompilerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDevelopmentKitCompilerPackage.eNS_URI, theDevelopmentKitCompilerPackage);
		return theDevelopmentKitCompilerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationSetup() {
		return compilationSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationSetup_BasePackage() {
		return (EAttribute)compilationSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationSetup_EntryType() {
		return (EAttribute)compilationSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilerManager() {
		return compilerManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitConverter() {
		return unitConverterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitConverterRegistry() {
		return unitConverterRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilerLinker() {
		return compilerLinkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilerLinker_LinkedClass() {
		return (EAttribute)compilerLinkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntryType() {
		return entryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCaseSensitiveType() {
		return caseSensitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDevelopmentKitCompilerFactory getDevelopmentKitCompilerFactory() {
		return (QDevelopmentKitCompilerFactory)getEFactoryInstance();
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
		compilationUnitEClass = createEClass(COMPILATION_UNIT);

		compilationSetupEClass = createEClass(COMPILATION_SETUP);
		createEAttribute(compilationSetupEClass, COMPILATION_SETUP__BASE_PACKAGE);
		createEAttribute(compilationSetupEClass, COMPILATION_SETUP__ENTRY_TYPE);

		compilerManagerEClass = createEClass(COMPILER_MANAGER);

		unitConverterEClass = createEClass(UNIT_CONVERTER);

		unitConverterRegistryEClass = createEClass(UNIT_CONVERTER_REGISTRY);

		compilerLinkerEClass = createEClass(COMPILER_LINKER);
		createEAttribute(compilerLinkerEClass, COMPILER_LINKER__LINKED_CLASS);

		// Create enums
		entryTypeEEnum = createEEnum(ENTRY_TYPE);
		caseSensitiveTypeEEnum = createEEnum(CASE_SENSITIVE_TYPE);
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
		QIntegratedLanguageEmbeddedSQLPackage theIntegratedLanguageEmbeddedSQLPackage = (QIntegratedLanguageEmbeddedSQLPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageEmbeddedSQLPackage.eNS_URI);
		QIntegratedLanguageIsamPackage theIntegratedLanguageIsamPackage = (QIntegratedLanguageIsamPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageIsamPackage.eNS_URI);
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);
		QIntegratedLanguageFlowPackage theIntegratedLanguageFlowPackage = (QIntegratedLanguageFlowPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageFlowPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemFilePackage theOperatingSystemFilePackage = (QOperatingSystemFilePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemFilePackage.eNS_URI);
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);
		QOperatingSystemModulePackage theOperatingSystemModulePackage = (QOperatingSystemModulePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemModulePackage.eNS_URI);
		QOperatingSystemProgramPackage theOperatingSystemProgramPackage = (QOperatingSystemProgramPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemProgramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compilationUnitEClass.getESuperTypes().add(theFrameworkCorePackage.getContextProvider());
		compilerManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		unitConverterEClass.getESuperTypes().add(theFrameworkCorePackage.getPlugin());
		unitConverterEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		EGenericType g1 = createEGenericType(theFrameworkCorePackage.getPluginRegistry());
		EGenericType g2 = createEGenericType(this.getUnitConverter());
		g1.getETypeArguments().add(g2);
		unitConverterRegistryEClass.getEGenericSuperTypes().add(g1);
		compilerLinkerEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getFacet());

		// Initialize classes and features; add operations and parameters
		initEClass(compilationUnitEClass, QCompilationUnit.class, "CompilationUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(compilationUnitEClass, ecorePackage.getEBoolean(), "equalsTermName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compilationUnitEClass, this.getCaseSensitiveType(), "getCaseSensitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageEmbeddedSQLPackage.getCursorTerm(), "getCursor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compilationUnitEClass, this.getCompilationUnit(), "getChildCompilationUnits", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageIsamPackage.getDataSetTerm(), "getDataSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, null, "getDataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageIsamPackage.getKeyListTerm(), "getKeyList", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageFlowPackage.getModule(), "getModule", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageCorePackage.getNamedNode(), "getNamedNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageFlowPackage.getProcedure(), "getProcedure", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, null, "getPrototype", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageFlowPackage.getPrototype());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(compilationUnitEClass, ecorePackage.getEString(), "getQualifiedName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCorePackage.getNamedNode(), "namedNode", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compilationUnitEClass, theIntegratedLanguageCorePackage.getNamedNode(), "getRoot", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageFlowPackage.getRoutine(), "getRoutine", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageEmbeddedSQLPackage.getStatementTerm(), "getStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, ecorePackage.getEString(), "normalizeTermName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, ecorePackage.getEString(), "normalizeTypeName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, ecorePackage.getEString(), "normalizeTypeName", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compilationSetupEClass, QCompilationSetup.class, "CompilationSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompilationSetup_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, QCompilationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompilationSetup_EntryType(), this.getEntryType(), "entryType", null, 0, 1, QCompilationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilerManagerEClass, QCompilerManager.class, "CompilerManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(compilerManagerEClass, this.getCompilationUnit(), "createChildCompilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "master", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageFlowPackage.getProcedure(), "procedure", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, this.getCompilationUnit(), "createCompilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemFilePackage.getFile(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCaseSensitiveType(), "caseSensitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, this.getCompilationUnit(), "createCompilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageFlowPackage.getModule(), "module", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCaseSensitiveType(), "caseSensitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, this.getCompilationUnit(), "createCompilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageFlowPackage.getProgram(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCaseSensitiveType(), "caseSensitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, null, "linkCompilationUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, null, "writeDatabaseFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writeDisplayFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writeModule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writePrinterFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writeProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writeStub", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaIOException());

		initEClass(unitConverterEClass, QUnitConverter.class, "UnitConverter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(unitConverterEClass, theIntegratedLanguageFlowPackage.getModule(), "convertModule", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemModulePackage.getModule(), "module", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaException());

		op = addEOperation(unitConverterEClass, theIntegratedLanguageFlowPackage.getProgram(), "convertProgram", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemProgramPackage.getProgram(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theFrameworkJavaPackage.getJavaException());

		initEClass(unitConverterRegistryEClass, QUnitConverterRegistry.class, "UnitConverterRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compilerLinkerEClass, QCompilerLinker.class, "CompilerLinker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getCompilerLinker_LinkedClass(), g1, "linkedClass", null, 0, 1, QCompilerLinker.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(entryTypeEEnum, EntryType.class, "EntryType");
		addEEnumLiteral(entryTypeEEnum, EntryType.MAIN);
		addEEnumLiteral(entryTypeEEnum, EntryType.ENTRY);

		initEEnum(caseSensitiveTypeEEnum, CaseSensitiveType.class, "CaseSensitiveType");
		addEEnumLiteral(caseSensitiveTypeEEnum, CaseSensitiveType.LOWER);
		addEEnumLiteral(caseSensitiveTypeEEnum, CaseSensitiveType.UPPER);
		addEEnumLiteral(caseSensitiveTypeEEnum, CaseSensitiveType.IGNORE);

		// Create resource
		createResource(eNS_URI);
	}

} //DevelopmentKitCompilerPackageImpl
