/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.asup.fw.core.QFrameworkCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QFrameworkCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/fw/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fw-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QFrameworkCorePackage eINSTANCE = org.asup.fw.core.impl.FrameworkCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ApplicationImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HOOKS = 0;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LEVELS = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ApplicationLevelImpl <em>Application Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ApplicationLevelImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getApplicationLevel()
	 * @generated
	 */
	int APPLICATION_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LEVEL__HOOKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LEVEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LEVEL__MODULES = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LEVEL__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Application Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LEVEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.QApplicationManager <em>Application Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.QApplicationManager
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getApplicationManager()
	 * @generated
	 */
	int APPLICATION_MANAGER = 2;

	/**
	 * The number of structural features of the '<em>Application Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ApplicationModuleImpl <em>Application Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ApplicationModuleImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getApplicationModule()
	 * @generated
	 */
	int APPLICATION_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Application Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ContextImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 4;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.QContextID <em>Context ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.QContextID
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getContextID()
	 * @generated
	 */
	int CONTEXT_ID = 5;

	/**
	 * The number of structural features of the '<em>Context ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ID_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ServiceImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 10;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.QLogger <em>Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.QLogger
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getLogger()
	 * @generated
	 */
	int LOGGER = 6;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER__CONFIG = SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.PluginImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__VENDOR = 3;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.PluginRegistryImpl <em>Plugin Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.PluginRegistryImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getPluginRegistry()
	 * @generated
	 */
	int PLUGIN_REGISTRY = 8;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REGISTRY__CONFIG = SERVICE__CONFIG;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REGISTRY__STORE = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plugin Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REGISTRY_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.PluginRegistryFactoryImpl <em>Plugin Registry Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.PluginRegistryFactoryImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getPluginRegistryFactory()
	 * @generated
	 */
	int PLUGIN_REGISTRY_FACTORY = 9;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REGISTRY_FACTORY__CONFIG = SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Plugin Registry Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_REGISTRY_FACTORY_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ServiceConfigImpl <em>Service Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ServiceConfigImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServiceConfig()
	 * @generated
	 */
	int SERVICE_CONFIG = 11;

	/**
	 * The number of structural features of the '<em>Service Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ServiceReferenceImpl <em>Service Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ServiceReferenceImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServiceReference()
	 * @generated
	 */
	int SERVICE_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE__INTERFACE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE__CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE__REMOTE_EXPORT = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE__STATUS = 4;

	/**
	 * The number of structural features of the '<em>Service Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ServiceHookImpl <em>Service Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ServiceHookImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServiceHook()
	 * @generated
	 */
	int SERVICE_HOOK = 12;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK__CLASS_NAME = SERVICE_REFERENCE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK__INTERFACE_NAME = SERVICE_REFERENCE__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK__CONFIG = SERVICE_REFERENCE__CONFIG;

	/**
	 * The feature id for the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK__REMOTE_EXPORT = SERVICE_REFERENCE__REMOTE_EXPORT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK__STATUS = SERVICE_REFERENCE__STATUS;

	/**
	 * The number of structural features of the '<em>Service Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HOOK_FEATURE_COUNT = SERVICE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ServicePluginImpl <em>Service Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ServicePluginImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServicePlugin()
	 * @generated
	 */
	int SERVICE_PLUGIN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__NAME = PLUGIN__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__TEXT = PLUGIN__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__VERSION = PLUGIN__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__VENDOR = PLUGIN__VENDOR;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__CLASS_NAME = PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__INTERFACE_NAME = PLUGIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__CONFIG = PLUGIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__REMOTE_EXPORT = PLUGIN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__STATUS = PLUGIN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN__SERVICES = PLUGIN_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Service Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN_FEATURE_COUNT = PLUGIN_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.impl.ServicePluginRegistryImpl <em>Service Plugin Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.impl.ServicePluginRegistryImpl
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServicePluginRegistry()
	 * @generated
	 */
	int SERVICE_PLUGIN_REGISTRY = 14;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN_REGISTRY__CLASS_NAME = SERVICE_REFERENCE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN_REGISTRY__INTERFACE_NAME = SERVICE_REFERENCE__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN_REGISTRY__CONFIG = SERVICE_REFERENCE__CONFIG;

	/**
	 * The feature id for the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN_REGISTRY__REMOTE_EXPORT = SERVICE_REFERENCE__REMOTE_EXPORT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN_REGISTRY__STATUS = SERVICE_REFERENCE__STATUS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN_REGISTRY__SERVICES = SERVICE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plugin Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN_REGISTRY__PLUGIN_INTERFACE = SERVICE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Plugin Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PLUGIN_REGISTRY_FEATURE_COUNT = SERVICE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.fw.core.ServiceStatus <em>Service Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.ServiceStatus
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServiceStatus()
	 * @generated
	 */
	int SERVICE_STATUS = 16;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.FrameworkCoreException
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getFrameworkCoreException()
	 * @generated
	 */
	int FRAMEWORK_CORE_EXCEPTION = 17;

	/**
	 * The meta object id for the '<em>Frameowrk Core Runtime Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.fw.core.FrameworkCoreRuntimeException
	 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getFrameowrkCoreRuntimeException()
	 * @generated
	 */
	int FRAMEOWRK_CORE_RUNTIME_EXCEPTION = 18;

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.asup.fw.core.QApplication
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.fw.core.QApplication#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hooks</em>'.
	 * @see org.asup.fw.core.QApplication#getHooks()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Hooks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.fw.core.QApplication#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see org.asup.fw.core.QApplication#getLevels()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Levels();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QApplication#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.fw.core.QApplication#getText()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Text();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QApplicationLevel <em>Application Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Level</em>'.
	 * @see org.asup.fw.core.QApplicationLevel
	 * @generated
	 */
	EClass getApplicationLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.fw.core.QApplicationLevel#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hooks</em>'.
	 * @see org.asup.fw.core.QApplicationLevel#getHooks()
	 * @see #getApplicationLevel()
	 * @generated
	 */
	EReference getApplicationLevel_Hooks();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QApplicationLevel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.fw.core.QApplicationLevel#getName()
	 * @see #getApplicationLevel()
	 * @generated
	 */
	EAttribute getApplicationLevel_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.asup.fw.core.QApplicationLevel#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see org.asup.fw.core.QApplicationLevel#getModules()
	 * @see #getApplicationLevel()
	 * @generated
	 */
	EReference getApplicationLevel_Modules();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QApplicationLevel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.asup.fw.core.QApplicationLevel#getValue()
	 * @see #getApplicationLevel()
	 * @generated
	 */
	EAttribute getApplicationLevel_Value();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QApplicationManager <em>Application Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Manager</em>'.
	 * @see org.asup.fw.core.QApplicationManager
	 * @generated
	 */
	EClass getApplicationManager();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QApplicationModule <em>Application Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Module</em>'.
	 * @see org.asup.fw.core.QApplicationModule
	 * @generated
	 */
	EClass getApplicationModule();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QApplicationModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.fw.core.QApplicationModule#getName()
	 * @see #getApplicationModule()
	 * @generated
	 */
	EAttribute getApplicationModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.fw.core.QApplicationModule#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.asup.fw.core.QApplicationModule#getServices()
	 * @see #getApplicationModule()
	 * @generated
	 */
	EReference getApplicationModule_Services();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.asup.fw.core.QContext
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QContextID <em>Context ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context ID</em>'.
	 * @see org.asup.fw.core.QContextID
	 * @generated
	 */
	EClass getContextID();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logger</em>'.
	 * @see org.asup.fw.core.QLogger
	 * @generated
	 */
	EClass getLogger();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.asup.fw.core.QPlugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QPlugin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.fw.core.QPlugin#getName()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QPlugin#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.fw.core.QPlugin#getText()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QPlugin#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.asup.fw.core.QPlugin#getVersion()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QPlugin#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.asup.fw.core.QPlugin#getVendor()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Vendor();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QPluginRegistry <em>Plugin Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Registry</em>'.
	 * @see org.asup.fw.core.QPluginRegistry
	 * @generated
	 */
	EClass getPluginRegistry();

	/**
	 * Returns the meta object for the reference '{@link org.asup.fw.core.QPluginRegistry#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see org.asup.fw.core.QPluginRegistry#getStore()
	 * @see #getPluginRegistry()
	 * @generated
	 */
	EReference getPluginRegistry_Store();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QPluginRegistryFactory <em>Plugin Registry Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Registry Factory</em>'.
	 * @see org.asup.fw.core.QPluginRegistryFactory
	 * @generated
	 */
	EClass getPluginRegistryFactory();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.asup.fw.core.QService
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.fw.core.QService#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.asup.fw.core.QService#getConfig()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Config();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QServiceConfig <em>Service Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Config</em>'.
	 * @see org.asup.fw.core.QServiceConfig
	 * @generated
	 */
	EClass getServiceConfig();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QServiceHook <em>Service Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Hook</em>'.
	 * @see org.asup.fw.core.QServiceHook
	 * @generated
	 */
	EClass getServiceHook();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QServicePlugin <em>Service Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Plugin</em>'.
	 * @see org.asup.fw.core.QServicePlugin
	 * @generated
	 */
	EClass getServicePlugin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.fw.core.QServicePlugin#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.asup.fw.core.QServicePlugin#getServices()
	 * @see #getServicePlugin()
	 * @generated
	 */
	EReference getServicePlugin_Services();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QServicePluginRegistry <em>Service Plugin Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Plugin Registry</em>'.
	 * @see org.asup.fw.core.QServicePluginRegistry
	 * @generated
	 */
	EClass getServicePluginRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.fw.core.QServicePluginRegistry#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.asup.fw.core.QServicePluginRegistry#getServices()
	 * @see #getServicePluginRegistry()
	 * @generated
	 */
	EReference getServicePluginRegistry_Services();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QServicePluginRegistry#getPluginInterface <em>Plugin Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Interface</em>'.
	 * @see org.asup.fw.core.QServicePluginRegistry#getPluginInterface()
	 * @see #getServicePluginRegistry()
	 * @generated
	 */
	EAttribute getServicePluginRegistry_PluginInterface();

	/**
	 * Returns the meta object for class '{@link org.asup.fw.core.QServiceReference <em>Service Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Reference</em>'.
	 * @see org.asup.fw.core.QServiceReference
	 * @generated
	 */
	EClass getServiceReference();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QServiceReference#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.asup.fw.core.QServiceReference#getClassName()
	 * @see #getServiceReference()
	 * @generated
	 */
	EAttribute getServiceReference_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QServiceReference#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.asup.fw.core.QServiceReference#getInterfaceName()
	 * @see #getServiceReference()
	 * @generated
	 */
	EAttribute getServiceReference_InterfaceName();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.fw.core.QServiceReference#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see org.asup.fw.core.QServiceReference#getConfig()
	 * @see #getServiceReference()
	 * @generated
	 */
	EReference getServiceReference_Config();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QServiceReference#isRemoteExport <em>Remote Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Export</em>'.
	 * @see org.asup.fw.core.QServiceReference#isRemoteExport()
	 * @see #getServiceReference()
	 * @generated
	 */
	EAttribute getServiceReference_RemoteExport();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.fw.core.QServiceReference#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.asup.fw.core.QServiceReference#getStatus()
	 * @see #getServiceReference()
	 * @generated
	 */
	EAttribute getServiceReference_Status();

	/**
	 * Returns the meta object for enum '{@link org.asup.fw.core.ServiceStatus <em>Service Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Status</em>'.
	 * @see org.asup.fw.core.ServiceStatus
	 * @generated
	 */
	EEnum getServiceStatus();

	/**
	 * Returns the meta object for data type '{@link org.asup.fw.core.FrameworkCoreException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see org.asup.fw.core.FrameworkCoreException
	 * @model instanceClass="org.asup.fw.core.FrameworkCoreException"
	 * @generated
	 */
	EDataType getFrameworkCoreException();

	/**
	 * Returns the meta object for data type '{@link org.asup.fw.core.FrameworkCoreRuntimeException <em>Frameowrk Core Runtime Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frameowrk Core Runtime Exception</em>'.
	 * @see org.asup.fw.core.FrameworkCoreRuntimeException
	 * @model instanceClass="org.asup.fw.core.FrameworkCoreRuntimeException"
	 * @generated
	 */
	EDataType getFrameowrkCoreRuntimeException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QFrameworkCoreFactory getFrameworkCoreFactory();

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
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ApplicationImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HOOKS = eINSTANCE.getApplication_Hooks();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__LEVELS = eINSTANCE.getApplication_Levels();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__TEXT = eINSTANCE.getApplication_Text();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ApplicationLevelImpl <em>Application Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ApplicationLevelImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getApplicationLevel()
		 * @generated
		 */
		EClass APPLICATION_LEVEL = eINSTANCE.getApplicationLevel();

		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_LEVEL__HOOKS = eINSTANCE.getApplicationLevel_Hooks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_LEVEL__NAME = eINSTANCE.getApplicationLevel_Name();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_LEVEL__MODULES = eINSTANCE.getApplicationLevel_Modules();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_LEVEL__VALUE = eINSTANCE.getApplicationLevel_Value();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.QApplicationManager <em>Application Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.QApplicationManager
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getApplicationManager()
		 * @generated
		 */
		EClass APPLICATION_MANAGER = eINSTANCE.getApplicationManager();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ApplicationModuleImpl <em>Application Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ApplicationModuleImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getApplicationModule()
		 * @generated
		 */
		EClass APPLICATION_MODULE = eINSTANCE.getApplicationModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_MODULE__NAME = eINSTANCE.getApplicationModule_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MODULE__SERVICES = eINSTANCE.getApplicationModule_Services();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ContextImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.QContextID <em>Context ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.QContextID
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getContextID()
		 * @generated
		 */
		EClass CONTEXT_ID = eINSTANCE.getContextID();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.QLogger <em>Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.QLogger
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getLogger()
		 * @generated
		 */
		EClass LOGGER = eINSTANCE.getLogger();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.PluginImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__NAME = eINSTANCE.getPlugin_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__TEXT = eINSTANCE.getPlugin_Text();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__VERSION = eINSTANCE.getPlugin_Version();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__VENDOR = eINSTANCE.getPlugin_Vendor();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.PluginRegistryImpl <em>Plugin Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.PluginRegistryImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getPluginRegistry()
		 * @generated
		 */
		EClass PLUGIN_REGISTRY = eINSTANCE.getPluginRegistry();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_REGISTRY__STORE = eINSTANCE.getPluginRegistry_Store();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.PluginRegistryFactoryImpl <em>Plugin Registry Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.PluginRegistryFactoryImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getPluginRegistryFactory()
		 * @generated
		 */
		EClass PLUGIN_REGISTRY_FACTORY = eINSTANCE.getPluginRegistryFactory();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ServiceImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CONFIG = eINSTANCE.getService_Config();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ServiceConfigImpl <em>Service Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ServiceConfigImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServiceConfig()
		 * @generated
		 */
		EClass SERVICE_CONFIG = eINSTANCE.getServiceConfig();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ServiceHookImpl <em>Service Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ServiceHookImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServiceHook()
		 * @generated
		 */
		EClass SERVICE_HOOK = eINSTANCE.getServiceHook();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ServicePluginImpl <em>Service Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ServicePluginImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServicePlugin()
		 * @generated
		 */
		EClass SERVICE_PLUGIN = eINSTANCE.getServicePlugin();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PLUGIN__SERVICES = eINSTANCE.getServicePlugin_Services();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ServicePluginRegistryImpl <em>Service Plugin Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ServicePluginRegistryImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServicePluginRegistry()
		 * @generated
		 */
		EClass SERVICE_PLUGIN_REGISTRY = eINSTANCE.getServicePluginRegistry();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PLUGIN_REGISTRY__SERVICES = eINSTANCE.getServicePluginRegistry_Services();

		/**
		 * The meta object literal for the '<em><b>Plugin Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PLUGIN_REGISTRY__PLUGIN_INTERFACE = eINSTANCE.getServicePluginRegistry_PluginInterface();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.impl.ServiceReferenceImpl <em>Service Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.impl.ServiceReferenceImpl
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServiceReference()
		 * @generated
		 */
		EClass SERVICE_REFERENCE = eINSTANCE.getServiceReference();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REFERENCE__CLASS_NAME = eINSTANCE.getServiceReference_ClassName();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REFERENCE__INTERFACE_NAME = eINSTANCE.getServiceReference_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REFERENCE__CONFIG = eINSTANCE.getServiceReference_Config();

		/**
		 * The meta object literal for the '<em><b>Remote Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REFERENCE__REMOTE_EXPORT = eINSTANCE.getServiceReference_RemoteExport();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REFERENCE__STATUS = eINSTANCE.getServiceReference_Status();

		/**
		 * The meta object literal for the '{@link org.asup.fw.core.ServiceStatus <em>Service Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.ServiceStatus
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getServiceStatus()
		 * @generated
		 */
		EEnum SERVICE_STATUS = eINSTANCE.getServiceStatus();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.FrameworkCoreException
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getFrameworkCoreException()
		 * @generated
		 */
		EDataType FRAMEWORK_CORE_EXCEPTION = eINSTANCE.getFrameworkCoreException();

		/**
		 * The meta object literal for the '<em>Frameowrk Core Runtime Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.fw.core.FrameworkCoreRuntimeException
		 * @see org.asup.fw.core.impl.FrameworkCorePackageImpl#getFrameowrkCoreRuntimeException()
		 * @generated
		 */
		EDataType FRAMEOWRK_CORE_RUNTIME_EXCEPTION = eINSTANCE.getFrameowrkCoreRuntimeException();

	}

} //QFrameworkCorePackage
