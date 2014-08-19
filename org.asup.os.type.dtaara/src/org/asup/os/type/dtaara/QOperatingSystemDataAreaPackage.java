/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.dtaara;

import org.asup.os.type.QOperatingSystemTypePackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.os.type.dtaara.QOperatingSystemDataAreaFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemDataAreaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dtaara";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type/dtaara";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type-dtaara";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemDataAreaPackage eINSTANCE = org.asup.os.type.dtaara.impl.OperatingSystemDataAreaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.dtaara.impl.DataAreaImpl <em>Data Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.dtaara.impl.DataAreaImpl
	 * @see org.asup.os.type.dtaara.impl.OperatingSystemDataAreaPackageImpl#getDataArea()
	 * @generated
	 */
	int DATA_AREA = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__ATTRIBUTE = QOperatingSystemTypePackage.TYPED_OBJECT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__MEMORY_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Data Area Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__DATA_AREA_TYPE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__CONTENT_LENGTH = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__CONTENT_DECIMAL = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA__CONTENT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.asup.os.type.dtaara.impl.DataAreaManagerImpl <em>Data Area Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.dtaara.impl.DataAreaManagerImpl
	 * @see org.asup.os.type.dtaara.impl.OperatingSystemDataAreaPackageImpl#getDataAreaManager()
	 * @generated
	 */
	int DATA_AREA_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA_MANAGER__NAME = QOperatingSystemTypePackage.TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA_MANAGER__TEXT = QOperatingSystemTypePackage.TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA_MANAGER__VERSION = QOperatingSystemTypePackage.TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA_MANAGER__VENDOR = QOperatingSystemTypePackage.TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA_MANAGER__CONFIG = QOperatingSystemTypePackage.TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>Data Area Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AREA_MANAGER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.dtaara.DataAreaType <em>Data Area Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.dtaara.DataAreaType
	 * @see org.asup.os.type.dtaara.impl.OperatingSystemDataAreaPackageImpl#getDataAreaType()
	 * @generated
	 */
	int DATA_AREA_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link org.asup.os.type.dtaara.QDataArea <em>Data Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Area</em>'.
	 * @see org.asup.os.type.dtaara.QDataArea
	 * @generated
	 */
	EClass getDataArea();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaara.QDataArea#getDataAreaType <em>Data Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Area Type</em>'.
	 * @see org.asup.os.type.dtaara.QDataArea#getDataAreaType()
	 * @see #getDataArea()
	 * @generated
	 */
	EAttribute getDataArea_DataAreaType();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaara.QDataArea#getContentLength <em>Content Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Length</em>'.
	 * @see org.asup.os.type.dtaara.QDataArea#getContentLength()
	 * @see #getDataArea()
	 * @generated
	 */
	EAttribute getDataArea_ContentLength();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaara.QDataArea#getContentDecimal <em>Content Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Decimal</em>'.
	 * @see org.asup.os.type.dtaara.QDataArea#getContentDecimal()
	 * @see #getDataArea()
	 * @generated
	 */
	EAttribute getDataArea_ContentDecimal();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.dtaara.QDataArea#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.asup.os.type.dtaara.QDataArea#getContent()
	 * @see #getDataArea()
	 * @generated
	 */
	EAttribute getDataArea_Content();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.dtaara.QDataAreaManager <em>Data Area Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Area Manager</em>'.
	 * @see org.asup.os.type.dtaara.QDataAreaManager
	 * @generated
	 */
	EClass getDataAreaManager();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.type.dtaara.DataAreaType <em>Data Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Area Type</em>'.
	 * @see org.asup.os.type.dtaara.DataAreaType
	 * @generated
	 */
	EEnum getDataAreaType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemDataAreaFactory getOperatingSystemDataAreaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.os.type.dtaara.impl.DataAreaImpl <em>Data Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.dtaara.impl.DataAreaImpl
		 * @see org.asup.os.type.dtaara.impl.OperatingSystemDataAreaPackageImpl#getDataArea()
		 * @generated
		 */
		EClass DATA_AREA = eINSTANCE.getDataArea();

		/**
		 * The meta object literal for the '<em><b>Data Area Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_AREA__DATA_AREA_TYPE = eINSTANCE.getDataArea_DataAreaType();

		/**
		 * The meta object literal for the '<em><b>Content Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_AREA__CONTENT_LENGTH = eINSTANCE.getDataArea_ContentLength();

		/**
		 * The meta object literal for the '<em><b>Content Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_AREA__CONTENT_DECIMAL = eINSTANCE.getDataArea_ContentDecimal();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_AREA__CONTENT = eINSTANCE.getDataArea_Content();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.dtaara.impl.DataAreaManagerImpl <em>Data Area Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.dtaara.impl.DataAreaManagerImpl
		 * @see org.asup.os.type.dtaara.impl.OperatingSystemDataAreaPackageImpl#getDataAreaManager()
		 * @generated
		 */
		EClass DATA_AREA_MANAGER = eINSTANCE.getDataAreaManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.dtaara.DataAreaType <em>Data Area Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.dtaara.DataAreaType
		 * @see org.asup.os.type.dtaara.impl.OperatingSystemDataAreaPackageImpl#getDataAreaType()
		 * @generated
		 */
		EEnum DATA_AREA_TYPE = eINSTANCE.getDataAreaType();

	}

} //QOperatingSystemDataAreaPackage
