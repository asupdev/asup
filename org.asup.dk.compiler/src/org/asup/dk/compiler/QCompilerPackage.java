/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.dk.compiler;

import org.asup.fw.core.QFrameworkCorePackage;
import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link org.asup.dk.compiler.impl.UnitConverterImpl <em>Unit Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.impl.UnitConverterImpl
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getUnitConverter()
	 * @generated
	 */
	int UNIT_CONVERTER = 1;

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
	 * The meta object id for the '{@link org.asup.dk.compiler.impl.UnitConverterRegistryImpl <em>Unit Converter Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.impl.UnitConverterRegistryImpl
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getUnitConverterRegistry()
	 * @generated
	 */
	int UNIT_CONVERTER_REGISTRY = 2;

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
	 * The meta object id for the '{@link org.asup.dk.compiler.impl.CompilerManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.compiler.impl.CompilerManagerImpl
	 * @see org.asup.dk.compiler.impl.CompilerPackageImpl#getCompilerManager()
	 * @generated
	 */
	int COMPILER_MANAGER = 3;

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
	 * Returns the meta object for class '{@link org.asup.dk.compiler.QCompilationContext <em>Compilation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Context</em>'.
	 * @see org.asup.dk.compiler.QCompilationContext
	 * @generated
	 */
	EClass getCompilationContext();

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
