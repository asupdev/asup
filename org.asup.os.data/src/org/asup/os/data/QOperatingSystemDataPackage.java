/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.data;

import org.asup.il.data.QIntegratedLanguageDataPackage;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.os.data.QOperatingSystemDataFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemDataPackage eINSTANCE = org.asup.os.data.impl.OperatingSystemDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.data.QTypedData <em>Typed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.data.QTypedData
	 * @see org.asup.os.data.impl.OperatingSystemDataPackageImpl#getTypedData()
	 * @generated
	 */
	int TYPED_DATA = 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA__LIBRARY = QIntegratedLanguageDataPackage.DATA_STRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA__NAME = QIntegratedLanguageDataPackage.DATA_STRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_FEATURE_COUNT = QIntegratedLanguageDataPackage.DATA_STRUCT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.data.impl.TypedDataDefImpl <em>Typed Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.data.impl.TypedDataDefImpl
	 * @see org.asup.os.data.impl.OperatingSystemDataPackageImpl#getTypedDataDef()
	 * @generated
	 */
	int TYPED_DATA_DEF = 1;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_DEF__FORMULAS = QIntegratedLanguageDataPackage.DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_DEF__TYPE = QIntegratedLanguageDataPackage.DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DATA_DEF_FEATURE_COUNT = QIntegratedLanguageDataPackage.DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.asup.os.data.QTypedData <em>Typed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Data</em>'.
	 * @see org.asup.os.data.QTypedData
	 * @generated
	 */
	EClass getTypedData();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.data.QTypedData#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see org.asup.os.data.QTypedData#getLibrary()
	 * @see #getTypedData()
	 * @generated
	 */
	EAttribute getTypedData_Library();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.data.QTypedData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.data.QTypedData#getName()
	 * @see #getTypedData()
	 * @generated
	 */
	EAttribute getTypedData_Name();

	/**
	 * Returns the meta object for class '{@link org.asup.os.data.QTypedDataDef <em>Typed Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Data Def</em>'.
	 * @see org.asup.os.data.QTypedDataDef
	 * @generated
	 */
	EClass getTypedDataDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.data.QTypedDataDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.os.data.QTypedDataDef#getType()
	 * @see #getTypedDataDef()
	 * @generated
	 */
	EAttribute getTypedDataDef_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemDataFactory getOperatingSystemDataFactory();

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
		 * The meta object literal for the '{@link org.asup.os.data.QTypedData <em>Typed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.data.QTypedData
		 * @see org.asup.os.data.impl.OperatingSystemDataPackageImpl#getTypedData()
		 * @generated
		 */
		EClass TYPED_DATA = eINSTANCE.getTypedData();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_DATA__LIBRARY = eINSTANCE.getTypedData_Library();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_DATA__NAME = eINSTANCE.getTypedData_Name();

		/**
		 * The meta object literal for the '{@link org.asup.os.data.impl.TypedDataDefImpl <em>Typed Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.data.impl.TypedDataDefImpl
		 * @see org.asup.os.data.impl.OperatingSystemDataPackageImpl#getTypedDataDef()
		 * @generated
		 */
		EClass TYPED_DATA_DEF = eINSTANCE.getTypedDataDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_DATA_DEF__TYPE = eINSTANCE.getTypedDataDef_Type();

	}

} //OSDataPackage
