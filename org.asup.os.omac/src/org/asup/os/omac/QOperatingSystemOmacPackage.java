/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.omac;

import org.asup.fw.core.QFrameworkCorePackage;
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
 * @see org.asup.os.omac.QOperatingSystemOmacFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemOmacPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "omac";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/omac";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-omac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemOmacPackage eINSTANCE = org.asup.os.omac.impl.OperatingSystemOmacPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.omac.QAdaptable <em>Adaptable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.QAdaptable
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getAdaptable()
	 * @generated
	 */
	int ADAPTABLE = 0;

	/**
	 * The number of structural features of the '<em>Adaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.os.omac.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.impl.ObjectImpl
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 6;

	/**
	 * The meta object id for the '{@link org.asup.os.omac.impl.CreationInfoImpl <em>Creation Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.impl.CreationInfoImpl
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getCreationInfo()
	 * @generated
	 */
	int CREATION_INFO = 4;

	/**
	 * The meta object id for the '{@link org.asup.os.omac.impl.MemoryInfoImpl <em>Memory Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.impl.MemoryInfoImpl
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getMemoryInfo()
	 * @generated
	 */
	int MEMORY_INFO = 5;

	/**
	 * The meta object id for the '{@link org.asup.os.omac.QObjectIterator <em>Object Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.QObjectIterator
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getObjectIterator()
	 * @generated
	 */
	int OBJECT_ITERATOR = 8;

	/**
	 * The meta object id for the '{@link org.asup.os.omac.impl.ObjectNameableImpl <em>Object Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.impl.ObjectNameableImpl
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getObjectNameable()
	 * @generated
	 */
	int OBJECT_NAMEABLE = 9;

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QBundleManager <em>Bundle Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Manager</em>'.
	 * @see org.asup.os.omac.QBundleManager
	 * @generated
	 */
	EClass getBundleManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QBundleVisitor <em>Bundle Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Visitor</em>'.
	 * @see org.asup.os.omac.QBundleVisitor
	 * @generated
	 */
	EClass getBundleVisitor();

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.asup.os.omac.QClass
	 * @generated
	 */
	EClass getClass_();

	/**
	 * The meta object id for the '{@link org.asup.os.omac.QManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.QManager
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 10;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.omac.impl.BundleManagerImpl <em>Bundle Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.impl.BundleManagerImpl
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getBundleManager()
	 * @generated
	 */
	int BUNDLE_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_MANAGER__CONFIG = MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>Bundle Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_MANAGER_FEATURE_COUNT = MANAGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.omac.impl.BundleVisitorImpl <em>Bundle Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.impl.BundleVisitorImpl
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getBundleVisitor()
	 * @generated
	 */
	int BUNDLE_VISITOR = 2;

	/**
	 * The number of structural features of the '<em>Bundle Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.os.omac.QClass <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.QClass
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = ADAPTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_INFO__CREATION_DATE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_INFO__CREATION_USER = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_INFO__CREATION_SYSTEM = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Creation Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_INFO_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INFO__DIMENSION = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INFO_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.omac.impl.ObjectContainerImpl <em>Object Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.omac.impl.ObjectContainerImpl
	 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getObjectContainer()
	 * @generated
	 */
	int OBJECT_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTAINER__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Object Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Object Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ITERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Object Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAMEABLE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QAdaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptable</em>'.
	 * @see org.asup.os.omac.QAdaptable
	 * @generated
	 */
	EClass getAdaptable();

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QCreationInfo <em>Creation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Info</em>'.
	 * @see org.asup.os.omac.QCreationInfo
	 * @generated
	 */
	EClass getCreationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.omac.QCreationInfo#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.asup.os.omac.QCreationInfo#getCreationDate()
	 * @see #getCreationInfo()
	 * @generated
	 */
	EAttribute getCreationInfo_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.omac.QCreationInfo#getCreationUser <em>Creation User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation User</em>'.
	 * @see org.asup.os.omac.QCreationInfo#getCreationUser()
	 * @see #getCreationInfo()
	 * @generated
	 */
	EAttribute getCreationInfo_CreationUser();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.omac.QCreationInfo#getCreationSystem <em>Creation System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation System</em>'.
	 * @see org.asup.os.omac.QCreationInfo#getCreationSystem()
	 * @see #getCreationInfo()
	 * @generated
	 */
	EAttribute getCreationInfo_CreationSystem();

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QMemoryInfo <em>Memory Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Info</em>'.
	 * @see org.asup.os.omac.QMemoryInfo
	 * @generated
	 */
	EClass getMemoryInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.omac.QMemoryInfo#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.asup.os.omac.QMemoryInfo#getDimension()
	 * @see #getMemoryInfo()
	 * @generated
	 */
	EAttribute getMemoryInfo_Dimension();

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.asup.os.omac.QObject
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QObjectContainer <em>Object Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Container</em>'.
	 * @see org.asup.os.omac.QObjectContainer
	 * @generated
	 */
	EClass getObjectContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.omac.QObjectContainer#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.asup.os.omac.QObjectContainer#getContents()
	 * @see #getObjectContainer()
	 * @generated
	 */
	EReference getObjectContainer_Contents();

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QObjectIterator <em>Object Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Iterator</em>'.
	 * @see org.asup.os.omac.QObjectIterator
	 * @generated
	 */
	EClass getObjectIterator();

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QObjectNameable <em>Object Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Nameable</em>'.
	 * @see org.asup.os.omac.QObjectNameable
	 * @generated
	 */
	EClass getObjectNameable();

	/**
	 * Returns the meta object for class '{@link org.asup.os.omac.QManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.asup.os.omac.QManager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemOmacFactory getOperatingSystemOmacFactory();

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
		 * The meta object literal for the '{@link org.asup.os.omac.QAdaptable <em>Adaptable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.QAdaptable
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getAdaptable()
		 * @generated
		 */
		EClass ADAPTABLE = eINSTANCE.getAdaptable();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.impl.BundleManagerImpl <em>Bundle Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.impl.BundleManagerImpl
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getBundleManager()
		 * @generated
		 */
		EClass BUNDLE_MANAGER = eINSTANCE.getBundleManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.impl.BundleVisitorImpl <em>Bundle Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.impl.BundleVisitorImpl
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getBundleVisitor()
		 * @generated
		 */
		EClass BUNDLE_VISITOR = eINSTANCE.getBundleVisitor();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.QClass <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.QClass
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.impl.CreationInfoImpl <em>Creation Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.impl.CreationInfoImpl
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getCreationInfo()
		 * @generated
		 */
		EClass CREATION_INFO = eINSTANCE.getCreationInfo();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_INFO__CREATION_DATE = eINSTANCE.getCreationInfo_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Creation User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_INFO__CREATION_USER = eINSTANCE.getCreationInfo_CreationUser();

		/**
		 * The meta object literal for the '<em><b>Creation System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_INFO__CREATION_SYSTEM = eINSTANCE.getCreationInfo_CreationSystem();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.impl.MemoryInfoImpl <em>Memory Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.impl.MemoryInfoImpl
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getMemoryInfo()
		 * @generated
		 */
		EClass MEMORY_INFO = eINSTANCE.getMemoryInfo();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_INFO__DIMENSION = eINSTANCE.getMemoryInfo_Dimension();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.impl.ObjectImpl
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.impl.ObjectContainerImpl <em>Object Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.impl.ObjectContainerImpl
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getObjectContainer()
		 * @generated
		 */
		EClass OBJECT_CONTAINER = eINSTANCE.getObjectContainer();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CONTAINER__CONTENTS = eINSTANCE.getObjectContainer_Contents();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.QObjectIterator <em>Object Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.QObjectIterator
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getObjectIterator()
		 * @generated
		 */
		EClass OBJECT_ITERATOR = eINSTANCE.getObjectIterator();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.impl.ObjectNameableImpl <em>Object Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.impl.ObjectNameableImpl
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getObjectNameable()
		 * @generated
		 */
		EClass OBJECT_NAMEABLE = eINSTANCE.getObjectNameable();

		/**
		 * The meta object literal for the '{@link org.asup.os.omac.QManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.omac.QManager
		 * @see org.asup.os.omac.impl.OperatingSystemOmacPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

	}

} //OSCoreOmacPackage
