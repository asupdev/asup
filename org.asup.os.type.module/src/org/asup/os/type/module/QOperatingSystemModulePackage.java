/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.module;

import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.asup.os.type.module.QOperatingSystemModuleFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemModulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "module";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type/module";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type-module";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemModulePackage eINSTANCE = org.asup.os.type.module.impl.OperatingSystemModulePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.module.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.module.impl.ModuleImpl
	 * @see org.asup.os.type.module.impl.OperatingSystemModulePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MEMORY_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SOURCE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.type.module.impl.ModuleManagerImpl <em>Module Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.module.impl.ModuleManagerImpl
	 * @see org.asup.os.type.module.impl.OperatingSystemModulePackageImpl#getModuleManager()
	 * @generated
	 */
	int MODULE_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MANAGER__NAME = QOperatingSystemTypePackage.TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MANAGER__TEXT = QOperatingSystemTypePackage.TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MANAGER__VERSION = QOperatingSystemTypePackage.TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MANAGER__VENDOR = QOperatingSystemTypePackage.TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MANAGER__CONFIG = QOperatingSystemTypePackage.TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>Module Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MANAGER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_MANAGER_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.asup.os.type.module.impl.ModuleSourceImpl <em>Module Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.module.impl.ModuleSourceImpl
	 * @see org.asup.os.type.module.impl.OperatingSystemModulePackageImpl#getModuleSource()
	 * @generated
	 */
	int MODULE_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SOURCE__TYPE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SOURCE__CONTENT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SOURCE_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.asup.os.type.module.QModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.asup.os.type.module.QModule
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.module.QModule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.asup.os.type.module.QModule#getSource()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Source();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.module.QModuleManager <em>Module Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Manager</em>'.
	 * @see org.asup.os.type.module.QModuleManager
	 * @generated
	 */
	EClass getModuleManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.module.QModuleSource <em>Module Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Source</em>'.
	 * @see org.asup.os.type.module.QModuleSource
	 * @generated
	 */
	EClass getModuleSource();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.module.QModuleSource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.os.type.module.QModuleSource#getType()
	 * @see #getModuleSource()
	 * @generated
	 */
	EAttribute getModuleSource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.module.QModuleSource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.asup.os.type.module.QModuleSource#getContent()
	 * @see #getModuleSource()
	 * @generated
	 */
	EAttribute getModuleSource_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemModuleFactory getOperatingSystemModuleFactory();

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
		 * The meta object literal for the '{@link org.asup.os.type.module.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.module.impl.ModuleImpl
		 * @see org.asup.os.type.module.impl.OperatingSystemModulePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SOURCE = eINSTANCE.getModule_Source();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.module.impl.ModuleManagerImpl <em>Module Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.module.impl.ModuleManagerImpl
		 * @see org.asup.os.type.module.impl.OperatingSystemModulePackageImpl#getModuleManager()
		 * @generated
		 */
		EClass MODULE_MANAGER = eINSTANCE.getModuleManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.module.impl.ModuleSourceImpl <em>Module Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.module.impl.ModuleSourceImpl
		 * @see org.asup.os.type.module.impl.OperatingSystemModulePackageImpl#getModuleSource()
		 * @generated
		 */
		EClass MODULE_SOURCE = eINSTANCE.getModuleSource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_SOURCE__TYPE = eINSTANCE.getModuleSource_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_SOURCE__CONTENT = eINSTANCE.getModuleSource_Content();

	}

} //QOperatingSystemModulePackage
