/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.dk.compiler.QCompilerFactory
 * @model kind="package"
 * @generated
 */
public interface QCompilerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compiler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ww.asup.org/dk/compiler";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dk-compiler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QCompilerPackage eINSTANCE = org.asup.dk.compiler.impl.CompilerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.dk.compiler.impl.CompilationContextImpl <em>Compilation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.impl.CompilationContextImpl
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCompilationContext()
	 * @generated
	 */
	int COMPILATION_CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Compilation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_CONTEXT_FEATURE_COUNT = QFrameworkCorePackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.dk.compiler.impl.CompilationSetupImpl <em>Compilation Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.impl.CompilationSetupImpl
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCompilationSetup()
	 * @generated
	 */
	int COMPILATION_SETUP = 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SETUP__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Entry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SETUP__ENTRY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Compilation Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SETUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.asup.dk.compiler.impl.UnitConverterImpl <em>Unit Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.impl.UnitConverterImpl
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getUnitConverter()
	 * @generated
	 */
	int UNIT_CONVERTER = 3;

	/**
	 * The meta object id for the '{@link org.asup.dk.compiler.impl.UnitConverterRegistryImpl <em>Unit Converter Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.impl.UnitConverterRegistryImpl
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getUnitConverterRegistry()
	 * @generated
	 */
	int UNIT_CONVERTER_REGISTRY = 4;

	/**
	 * The meta object id for the '{@link org.asup.dk.compiler.EntryType <em>Entry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.EntryType
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.asup.dk.compiler.CaseSensitiveType <em>Case Sensitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.CaseSensitiveType
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCaseSensitiveType()
	 * @generated
	 */
	int CASE_SENSITIVE_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.asup.dk.compiler.impl.CompilerManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.impl.CompilerManagerImpl
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCompilerManager()
	 * @generated
	 */
	int COMPILER_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;


	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Unit Converter Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.asup.dk.compiler.impl.CompilerLinkerImpl <em>Linker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.impl.CompilerLinkerImpl
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCompilerLinker()
	 * @generated
	 */
	int COMPILER_LINKER = 5;

	/**
	 * The feature id for the '<em><b>Linked Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_LINKER__LINKED_CLASS = QIntegratedLanguageCorePackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_LINKER_FEATURE_COUNT = QIntegratedLanguageCorePackage.FACET_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.asup.dk.compiler.QCompilationContext <em>Compilation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Context</em>'.
	 * @see org.asup.dk.compiler.QCompilationContext
	 * @generated
	 */
	EClass getCompilationContext();

	/**
	 * Returns the meta object for class '{@link org.asup.dk.compiler.QCompilationSetup <em>Compilation Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Setup</em>'.
	 * @see org.asup.dk.compiler.QCompilationSetup
	 * @generated
	 */
	EClass getCompilationSetup();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.dk.compiler.QCompilationSetup#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.asup.dk.compiler.QCompilationSetup#getBasePackage()
	 * @see #getCompilationSetup()
	 * @generated
	 */
	EAttribute getCompilationSetup_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.dk.compiler.QCompilationSetup#getEntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Type</em>'.
	 * @see org.asup.dk.compiler.QCompilationSetup#getEntryType()
	 * @see #getCompilationSetup()
	 * @generated
	 */
	EAttribute getCompilationSetup_EntryType();

	/**
	 * Returns the meta object for class '{@link org.asup.dk.compiler.QUnitConverter <em>Unit Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Converter</em>'.
	 * @see org.asup.dk.compiler.QUnitConverter
	 * @generated
	 */
	EClass getUnitConverter();

	/**
	 * Returns the meta object for class '{@link org.asup.dk.compiler.QUnitConverterRegistry <em>Unit Converter Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Converter Registry</em>'.
	 * @see org.asup.dk.compiler.QUnitConverterRegistry
	 * @generated
	 */
	EClass getUnitConverterRegistry();

	/**
	 * Returns the meta object for class '{@link org.asup.dk.compiler.QCompilerLinker <em>Linker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linker</em>'.
	 * @see org.asup.dk.compiler.QCompilerLinker
	 * @generated
	 */
	EClass getCompilerLinker();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.dk.compiler.QCompilerLinker#getLinkedClass <em>Linked Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linked Class</em>'.
	 * @see org.asup.dk.compiler.QCompilerLinker#getLinkedClass()
	 * @see #getCompilerLinker()
	 * @generated
	 */
	EAttribute getCompilerLinker_LinkedClass();

	/**
	 * Returns the meta object for enum '{@link org.asup.dk.compiler.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entry Type</em>'.
	 * @see org.asup.dk.compiler.EntryType
	 * @generated
	 */
	EEnum getEntryType();

	/**
	 * Returns the meta object for enum '{@link org.asup.dk.compiler.CaseSensitiveType <em>Case Sensitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Sensitive Type</em>'.
	 * @see org.asup.dk.compiler.CaseSensitiveType
	 * @generated
	 */
	EEnum getCaseSensitiveType();

	/**
	 * Returns the meta object for class '{@link org.asup.dk.compiler.QCompilerManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.asup.dk.compiler.QCompilerManager
	 * @generated
	 */
	EClass getCompilerManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QCompilerFactory getCompilerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.dk.compiler.impl.CompilationContextImpl <em>Compilation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.compiler.impl.CompilationContextImpl
		 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCompilationContext()
		 * @generated
		 */
		EClass COMPILATION_CONTEXT = eINSTANCE.getCompilationContext();

		/**
		 * The meta object literal for the '{@link org.asup.dk.compiler.impl.CompilationSetupImpl <em>Compilation Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.compiler.impl.CompilationSetupImpl
		 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCompilationSetup()
		 * @generated
		 */
		EClass COMPILATION_SETUP = eINSTANCE.getCompilationSetup();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_SETUP__BASE_PACKAGE = eINSTANCE.getCompilationSetup_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Entry Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_SETUP__ENTRY_TYPE = eINSTANCE.getCompilationSetup_EntryType();

		/**
		 * The meta object literal for the '{@link org.asup.dk.compiler.impl.UnitConverterImpl <em>Unit Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.compiler.impl.UnitConverterImpl
		 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getUnitConverter()
		 * @generated
		 */
		EClass UNIT_CONVERTER = eINSTANCE.getUnitConverter();

		/**
		 * The meta object literal for the '{@link org.asup.dk.compiler.impl.UnitConverterRegistryImpl <em>Unit Converter Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.compiler.impl.UnitConverterRegistryImpl
		 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getUnitConverterRegistry()
		 * @generated
		 */
		EClass UNIT_CONVERTER_REGISTRY = eINSTANCE.getUnitConverterRegistry();

		/**
		 * The meta object literal for the '{@link org.asup.dk.compiler.impl.CompilerLinkerImpl <em>Linker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.compiler.impl.CompilerLinkerImpl
		 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCompilerLinker()
		 * @generated
		 */
		EClass COMPILER_LINKER = eINSTANCE.getCompilerLinker();

		/**
		 * The meta object literal for the '<em><b>Linked Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER_LINKER__LINKED_CLASS = eINSTANCE.getCompilerLinker_LinkedClass();

		/**
		 * The meta object literal for the '{@link org.asup.dk.compiler.EntryType <em>Entry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.compiler.EntryType
		 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getEntryType()
		 * @generated
		 */
		EEnum ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '{@link org.asup.dk.compiler.CaseSensitiveType <em>Case Sensitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.compiler.CaseSensitiveType
		 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCaseSensitiveType()
		 * @generated
		 */
		EEnum CASE_SENSITIVE_TYPE = eINSTANCE.getCaseSensitiveType();

		/**
		 * The meta object literal for the '{@link org.asup.dk.compiler.impl.CompilerManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.compiler.impl.CompilerManagerImpl
		 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCompilerManager()
		 * @generated
		 */
		EClass COMPILER_MANAGER = eINSTANCE.getCompilerManager();

	}

} //QCompilerPackage
