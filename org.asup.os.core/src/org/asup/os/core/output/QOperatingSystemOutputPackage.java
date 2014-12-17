/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.output;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
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
 * @see org.asup.os.core.output.QOperatingSystemOutputFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemOutputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "output";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/core/output";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-core-output";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemOutputPackage eINSTANCE = org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.core.output.QObjectWriter <em>Object Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.output.QObjectWriter
	 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getObjectWriter()
	 * @generated
	 */
	int OBJECT_WRITER = 0;

	/**
	 * The number of structural features of the '<em>Object Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.output.impl.ObjectWriterFactoryRegistryImpl <em>Object Writer Factory Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.output.impl.ObjectWriterFactoryRegistryImpl
	 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getObjectWriterFactoryRegistry()
	 * @generated
	 */
	int OBJECT_WRITER_FACTORY_REGISTRY = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Object Writer Factory Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.output.impl.ObjectWriterFactoryImpl <em>Object Writer Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.output.impl.ObjectWriterFactoryImpl
	 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getObjectWriterFactory()
	 * @generated
	 */
	int OBJECT_WRITER_FACTORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Writer Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WRITER_FACTORY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.core.output.impl.OutputManagerImpl <em>Output Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.output.impl.OutputManagerImpl
	 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getOutputManager()
	 * @generated
	 */
	int OUTPUT_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Output Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.core.output.impl.ObjectRowImpl <em>Object Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.core.output.impl.ObjectRowImpl
	 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getObjectRow()
	 * @generated
	 */
	int OBJECT_ROW = 4;

	/**
	 * The number of structural features of the '<em>Object Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROW_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.output.QObjectWriter <em>Object Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Writer</em>'.
	 * @see org.asup.os.core.output.QObjectWriter
	 * @generated
	 */
	EClass getObjectWriter();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.output.QObjectWriterFactoryRegistry <em>Object Writer Factory Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Writer Factory Registry</em>'.
	 * @see org.asup.os.core.output.QObjectWriterFactoryRegistry
	 * @generated
	 */
	EClass getObjectWriterFactoryRegistry();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.output.QObjectWriterFactory <em>Object Writer Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Writer Factory</em>'.
	 * @see org.asup.os.core.output.QObjectWriterFactory
	 * @generated
	 */
	EClass getObjectWriterFactory();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.output.QOutputManager <em>Output Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Manager</em>'.
	 * @see org.asup.os.core.output.QOutputManager
	 * @generated
	 */
	EClass getOutputManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.core.output.QObjectRow <em>Object Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Row</em>'.
	 * @see org.asup.os.core.output.QObjectRow
	 * @generated
	 */
	EClass getObjectRow();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemOutputFactory getOperatingSystemOutputFactory();

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
		 * The meta object literal for the '{@link org.asup.os.core.output.QObjectWriter <em>Object Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.output.QObjectWriter
		 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getObjectWriter()
		 * @generated
		 */
		EClass OBJECT_WRITER = eINSTANCE.getObjectWriter();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.output.impl.ObjectWriterFactoryRegistryImpl <em>Object Writer Factory Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.output.impl.ObjectWriterFactoryRegistryImpl
		 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getObjectWriterFactoryRegistry()
		 * @generated
		 */
		EClass OBJECT_WRITER_FACTORY_REGISTRY = eINSTANCE.getObjectWriterFactoryRegistry();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.output.impl.ObjectWriterFactoryImpl <em>Object Writer Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.output.impl.ObjectWriterFactoryImpl
		 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getObjectWriterFactory()
		 * @generated
		 */
		EClass OBJECT_WRITER_FACTORY = eINSTANCE.getObjectWriterFactory();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.output.impl.OutputManagerImpl <em>Output Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.output.impl.OutputManagerImpl
		 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getOutputManager()
		 * @generated
		 */
		EClass OUTPUT_MANAGER = eINSTANCE.getOutputManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.core.output.impl.ObjectRowImpl <em>Object Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.core.output.impl.ObjectRowImpl
		 * @see org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl#getObjectRow()
		 * @generated
		 */
		EClass OBJECT_ROW = eINSTANCE.getObjectRow();

	}

} //OSCoreOutputPackage
