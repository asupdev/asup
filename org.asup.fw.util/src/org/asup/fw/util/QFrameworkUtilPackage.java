/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.util;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.fw.util.QFrameworkUtilFactory
 * @model kind="package"
 * @generated
 */
public interface QFrameworkUtilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "util";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/fw/util";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fw-util";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QFrameworkUtilPackage eINSTANCE = org.asup.fw.util.impl.FrameworkUtilPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.fw.util.QFileUtil <em>File Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.util.QFileUtil
	 * @see org.asup.fw.util.impl.FrameworkUtilPackageImpl#getFileUtil()
	 * @generated
	 */
	int FILE_UTIL = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UTIL__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>File Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_UTIL_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.util.QIOUtil <em>IO Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.util.QIOUtil
	 * @see org.asup.fw.util.impl.FrameworkUtilPackageImpl#getIOUtil()
	 * @generated
	 */
	int IO_UTIL = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_UTIL__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>IO Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_UTIL_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.util.QListUtil <em>List Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.util.QListUtil
	 * @see org.asup.fw.util.impl.FrameworkUtilPackageImpl#getListUtil()
	 * @generated
	 */
	int LIST_UTIL = 2;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UTIL__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>List Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_UTIL_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.util.QURIUtil <em>URI Util</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.util.QURIUtil
	 * @see org.asup.fw.util.impl.FrameworkUtilPackageImpl#getURIUtil()
	 * @generated
	 */
	int URI_UTIL = 3;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_UTIL__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>URI Util</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_UTIL_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.asup.fw.util.QFileUtil <em>File Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Util</em>'.
	 * @see org.asup.fw.util.QFileUtil
	 * @generated
	 */
	EClass getFileUtil();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.util.QIOUtil <em>IO Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Util</em>'.
	 * @see org.asup.fw.util.QIOUtil
	 * @generated
	 */
	EClass getIOUtil();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.util.QListUtil <em>List Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Util</em>'.
	 * @see org.asup.fw.util.QListUtil
	 * @generated
	 */
	EClass getListUtil();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.util.QURIUtil <em>URI Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URI Util</em>'.
	 * @see org.asup.fw.util.QURIUtil
	 * @generated
	 */
	EClass getURIUtil();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QFrameworkUtilFactory getFrameworkUtilFactory();

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
		 * The meta object literal for the '{@link org.asup.fw.util.QFileUtil <em>File Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.util.QFileUtil
		 * @see org.asup.fw.util.impl.FrameworkUtilPackageImpl#getFileUtil()
		 * @generated
		 */
		EClass FILE_UTIL = eINSTANCE.getFileUtil();

		/**
		 * The meta object literal for the '{@link org.asup.fw.util.QIOUtil <em>IO Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.util.QIOUtil
		 * @see org.asup.fw.util.impl.FrameworkUtilPackageImpl#getIOUtil()
		 * @generated
		 */
		EClass IO_UTIL = eINSTANCE.getIOUtil();

		/**
		 * The meta object literal for the '{@link org.asup.fw.util.QListUtil <em>List Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.util.QListUtil
		 * @see org.asup.fw.util.impl.FrameworkUtilPackageImpl#getListUtil()
		 * @generated
		 */
		EClass LIST_UTIL = eINSTANCE.getListUtil();

		/**
		 * The meta object literal for the '{@link org.asup.fw.util.QURIUtil <em>URI Util</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.util.QURIUtil
		 * @see org.asup.fw.util.impl.FrameworkUtilPackageImpl#getURIUtil()
		 * @generated
		 */
		EClass URI_UTIL = eINSTANCE.getURIUtil();

	}

} //FWUtilPackage
