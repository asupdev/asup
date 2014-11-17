/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.os.type.QOperatingSystemTypeFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemTypePackage eINSTANCE = org.asup.os.type.impl.OperatingSystemTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.impl.TypedContainerImpl <em>Typed Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.impl.TypedContainerImpl
	 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypedContainer()
	 * @generated
	 */
	int TYPED_CONTAINER = 1;

	/**
	 * The meta object id for the '{@link org.asup.os.type.impl.TypedManagerImpl <em>Typed Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.impl.TypedManagerImpl
	 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypedManager()
	 * @generated
	 */
	int TYPED_MANAGER = 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.impl.TypedObjectImpl <em>Typed Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.impl.TypedObjectImpl
	 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypedObject()
	 * @generated
	 */
	int TYPED_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__APPLICATION = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__LIBRARY = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__NAME = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__TEXT = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__CREATION_INFO = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT__MEMORY_INFO = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Typed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OBJECT_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.asup.os.type.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.impl.TypeImpl
	 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__APPLICATION = TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__LIBRARY = TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TEXT = TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CREATION_INFO = TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MEMORY_INFO = TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CLASS_NAME = TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DOMAIN = TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MANAGER = TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specials</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SPECIALS = TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONTAINER__CONTENTS = QOperatingSystemOmacPackage.OBJECT_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONTAINER__NAME = QOperatingSystemOmacPackage.OBJECT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONTAINER__TEXT = QOperatingSystemOmacPackage.OBJECT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONTAINER__VERSION = QOperatingSystemOmacPackage.OBJECT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONTAINER__VENDOR = QOperatingSystemOmacPackage.OBJECT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Typed Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_CONTAINER_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MANAGER__NAME = QFrameworkCorePackage.PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MANAGER__TEXT = QFrameworkCorePackage.PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MANAGER__VERSION = QFrameworkCorePackage.PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MANAGER__VENDOR = QFrameworkCorePackage.PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MANAGER__CONFIG = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.type.impl.TypeRegistryImpl <em>Type Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.impl.TypeRegistryImpl
	 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypeRegistry()
	 * @generated
	 */
	int TYPE_REGISTRY = 6;

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.QTypedContainer <em>Typed Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Container</em>'.
	 * @see org.asup.os.type.QTypedContainer
	 * @generated
	 */
	EClass getTypedContainer();

	/**
	 * The meta object id for the '{@link org.asup.os.type.impl.TypedReferenceImpl <em>Typed Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.impl.TypedReferenceImpl
	 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypedReference()
	 * @generated
	 */
	int TYPED_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_REFERENCE__LIBRARY = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_REFERENCE__NAME = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_REFERENCE_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.impl.TypeManagerImpl <em>Type Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.impl.TypeManagerImpl
	 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypeManager()
	 * @generated
	 */
	int TYPE_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MANAGER__NAME = TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MANAGER__TEXT = TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MANAGER__VERSION = TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MANAGER__VENDOR = TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MANAGER__CONFIG = TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>Type Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MANAGER_FEATURE_COUNT = TYPED_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REGISTRY__CONFIG = QFrameworkCorePackage.PLUGIN_REGISTRY__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REGISTRY__STORE = QFrameworkCorePackage.PLUGIN_REGISTRY__STORE;

	/**
	 * The number of structural features of the '<em>Type Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REGISTRY_FEATURE_COUNT = QFrameworkCorePackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.QType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.asup.os.type.QType
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.QType#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.asup.os.type.QType#getClassName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.QType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.asup.os.type.QType#getDomain()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.QType#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see org.asup.os.type.QType#getManager()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Manager();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.os.type.QType#getSpecials <em>Specials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Specials</em>'.
	 * @see org.asup.os.type.QType#getSpecials()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Specials();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.QTypedManager <em>Typed Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Manager</em>'.
	 * @see org.asup.os.type.QTypedManager
	 * @generated
	 */
	EClass getTypedManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.QTypedObject <em>Typed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Object</em>'.
	 * @see org.asup.os.type.QTypedObject
	 * @generated
	 */
	EClass getTypedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.QTypedObject#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see org.asup.os.type.QTypedObject#getApplication()
	 * @see #getTypedObject()
	 * @generated
	 */
	EAttribute getTypedObject_Application();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.QTypedObject#getCreationInfo <em>Creation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Info</em>'.
	 * @see org.asup.os.type.QTypedObject#getCreationInfo()
	 * @see #getTypedObject()
	 * @generated
	 */
	EReference getTypedObject_CreationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.QTypedObject#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see org.asup.os.type.QTypedObject#getLibrary()
	 * @see #getTypedObject()
	 * @generated
	 */
	EAttribute getTypedObject_Library();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.QTypedObject#getMemoryInfo <em>Memory Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Info</em>'.
	 * @see org.asup.os.type.QTypedObject#getMemoryInfo()
	 * @see #getTypedObject()
	 * @generated
	 */
	EReference getTypedObject_MemoryInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.QTypedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.type.QTypedObject#getName()
	 * @see #getTypedObject()
	 * @generated
	 */
	EAttribute getTypedObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.QTypedObject#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.os.type.QTypedObject#getText()
	 * @see #getTypedObject()
	 * @generated
	 */
	EAttribute getTypedObject_Text();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.QTypeRegistry <em>Type Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Registry</em>'.
	 * @see org.asup.os.type.QTypeRegistry
	 * @generated
	 */
	EClass getTypeRegistry();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.QTypedReference <em>Typed Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Reference</em>'.
	 * @see org.asup.os.type.QTypedReference
	 * @generated
	 */
	EClass getTypedReference();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.QTypedReference#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see org.asup.os.type.QTypedReference#getLibrary()
	 * @see #getTypedReference()
	 * @generated
	 */
	EAttribute getTypedReference_Library();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.QTypedReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.type.QTypedReference#getName()
	 * @see #getTypedReference()
	 * @generated
	 */
	EAttribute getTypedReference_Name();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.QTypeManager <em>Type Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Manager</em>'.
	 * @see org.asup.os.type.QTypeManager
	 * @generated
	 */
	EClass getTypeManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemTypeFactory getOperatingSystemTypeFactory();

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
		 * The meta object literal for the '{@link org.asup.os.type.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.impl.TypeImpl
		 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();
		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__CLASS_NAME = eINSTANCE.getType_ClassName();
		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__DOMAIN = eINSTANCE.getType_Domain();
		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__MANAGER = eINSTANCE.getType_Manager();
		/**
		 * The meta object literal for the '<em><b>Specials</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__SPECIALS = eINSTANCE.getType_Specials();
		/**
		 * The meta object literal for the '{@link org.asup.os.type.impl.TypedContainerImpl <em>Typed Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.impl.TypedContainerImpl
		 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypedContainer()
		 * @generated
		 */
		EClass TYPED_CONTAINER = eINSTANCE.getTypedContainer();
		/**
		 * The meta object literal for the '{@link org.asup.os.type.impl.TypedManagerImpl <em>Typed Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.impl.TypedManagerImpl
		 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypedManager()
		 * @generated
		 */
		EClass TYPED_MANAGER = eINSTANCE.getTypedManager();
		/**
		 * The meta object literal for the '{@link org.asup.os.type.impl.TypedObjectImpl <em>Typed Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.impl.TypedObjectImpl
		 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypedObject()
		 * @generated
		 */
		EClass TYPED_OBJECT = eINSTANCE.getTypedObject();
		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_OBJECT__APPLICATION = eINSTANCE.getTypedObject_Application();
		/**
		 * The meta object literal for the '<em><b>Creation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_OBJECT__CREATION_INFO = eINSTANCE.getTypedObject_CreationInfo();
		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_OBJECT__LIBRARY = eINSTANCE.getTypedObject_Library();
		/**
		 * The meta object literal for the '<em><b>Memory Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_OBJECT__MEMORY_INFO = eINSTANCE.getTypedObject_MemoryInfo();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_OBJECT__NAME = eINSTANCE.getTypedObject_Name();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_OBJECT__TEXT = eINSTANCE.getTypedObject_Text();
		/**
		 * The meta object literal for the '{@link org.asup.os.type.impl.TypeRegistryImpl <em>Type Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.impl.TypeRegistryImpl
		 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypeRegistry()
		 * @generated
		 */
		EClass TYPE_REGISTRY = eINSTANCE.getTypeRegistry();
		/**
		 * The meta object literal for the '{@link org.asup.os.type.impl.TypedReferenceImpl <em>Typed Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.impl.TypedReferenceImpl
		 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypedReference()
		 * @generated
		 */
		EClass TYPED_REFERENCE = eINSTANCE.getTypedReference();
		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_REFERENCE__LIBRARY = eINSTANCE.getTypedReference_Library();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_REFERENCE__NAME = eINSTANCE.getTypedReference_Name();
		/**
		 * The meta object literal for the '{@link org.asup.os.type.impl.TypeManagerImpl <em>Type Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.impl.TypeManagerImpl
		 * @see org.asup.os.type.impl.OperatingSystemTypePackageImpl#getTypeManager()
		 * @generated
		 */
		EClass TYPE_MANAGER = eINSTANCE.getTypeManager();

	}

} //OSTypePackage
