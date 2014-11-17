/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.usrspc;

import org.asup.os.type.QOperatingSystemTypePackage;
import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.asup.os.type.usrspc.QOperatingSystemUserSpaceFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemUserSpacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usrspc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type/usrspc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type-usrspc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemUserSpacePackage eINSTANCE = org.asup.os.type.usrspc.impl.OperatingSystemUserSpacePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.usrspc.impl.UserSpaceImpl <em>User Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.usrspc.impl.UserSpaceImpl
	 * @see org.asup.os.type.usrspc.impl.OperatingSystemUserSpacePackageImpl#getUserSpace()
	 * @generated
	 */
	int USER_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE__MEMORY_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE__HEADER = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE__CONTENT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.usrspc.impl.UserSpaceManagerImpl <em>User Space Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.usrspc.impl.UserSpaceManagerImpl
	 * @see org.asup.os.type.usrspc.impl.OperatingSystemUserSpacePackageImpl#getUserSpaceManager()
	 * @generated
	 */
	int USER_SPACE_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE_MANAGER__NAME = QOperatingSystemTypePackage.TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE_MANAGER__TEXT = QOperatingSystemTypePackage.TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE_MANAGER__VERSION = QOperatingSystemTypePackage.TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE_MANAGER__VENDOR = QOperatingSystemTypePackage.TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE_MANAGER__CONFIG = QOperatingSystemTypePackage.TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>User Space Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPACE_MANAGER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_MANAGER_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.usrspc.QUserSpace <em>User Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Space</em>'.
	 * @see org.asup.os.type.usrspc.QUserSpace
	 * @generated
	 */
	EClass getUserSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.usrspc.QUserSpace#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.asup.os.type.usrspc.QUserSpace#getHeader()
	 * @see #getUserSpace()
	 * @generated
	 */
	EAttribute getUserSpace_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.usrspc.QUserSpace#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.asup.os.type.usrspc.QUserSpace#getContent()
	 * @see #getUserSpace()
	 * @generated
	 */
	EAttribute getUserSpace_Content();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.usrspc.QUserSpaceManager <em>User Space Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Space Manager</em>'.
	 * @see org.asup.os.type.usrspc.QUserSpaceManager
	 * @generated
	 */
	EClass getUserSpaceManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemUserSpaceFactory getOperatingSystemUserSpaceFactory();

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
		 * The meta object literal for the '{@link org.asup.os.type.usrspc.impl.UserSpaceImpl <em>User Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.usrspc.impl.UserSpaceImpl
		 * @see org.asup.os.type.usrspc.impl.OperatingSystemUserSpacePackageImpl#getUserSpace()
		 * @generated
		 */
		EClass USER_SPACE = eINSTANCE.getUserSpace();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_SPACE__HEADER = eINSTANCE.getUserSpace_Header();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_SPACE__CONTENT = eINSTANCE.getUserSpace_Content();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.usrspc.impl.UserSpaceManagerImpl <em>User Space Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.usrspc.impl.UserSpaceManagerImpl
		 * @see org.asup.os.type.usrspc.impl.OperatingSystemUserSpacePackageImpl#getUserSpaceManager()
		 * @generated
		 */
		EClass USER_SPACE_MANAGER = eINSTANCE.getUserSpaceManager();

	}

} //OSUserSpaceCorePackage
