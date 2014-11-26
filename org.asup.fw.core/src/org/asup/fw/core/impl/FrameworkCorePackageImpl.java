/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core.impl;

import org.asup.fw.core.FrameworkCoreException;
import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.fw.core.QApplication;
import org.asup.fw.core.QApplicationLevel;
import org.asup.fw.core.QApplicationManager;
import org.asup.fw.core.QApplicationModule;
import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.QFrameworkCoreFactory;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.core.QLogger;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;
import org.asup.fw.core.QService;
import org.asup.fw.core.QServiceConfig;
import org.asup.fw.core.QServiceHook;
import org.asup.fw.core.QServicePlugin;
import org.asup.fw.core.QServicePluginRegistry;
import org.asup.fw.core.QServiceReference;
import org.asup.fw.core.ServiceStatus;
import org.asup.fw.java.QFrameworkJavaPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameworkCorePackageImpl extends EPackageImpl implements QFrameworkCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginRegistryFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePluginRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frameworkCoreExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frameowrkCoreRuntimeExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.asup.fw.core.QFrameworkCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FrameworkCorePackageImpl() {
		super(eNS_URI, QFrameworkCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QFrameworkCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QFrameworkCorePackage init() {
		if (isInited) return (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);

		// Obtain or create and register package
		FrameworkCorePackageImpl theFrameworkCorePackage = (FrameworkCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FrameworkCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FrameworkCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QFrameworkJavaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFrameworkCorePackage.createPackageContents();

		// Initialize created meta-data
		theFrameworkCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFrameworkCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QFrameworkCorePackage.eNS_URI, theFrameworkCorePackage);
		return theFrameworkCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Hooks() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Levels() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Text() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationLevel() {
		return applicationLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationLevel_Hooks() {
		return (EReference)applicationLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationLevel_Name() {
		return (EAttribute)applicationLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationLevel_Modules() {
		return (EReference)applicationLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationLevel_Value() {
		return (EAttribute)applicationLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationManager() {
		return applicationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationModule() {
		return applicationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationModule_Name() {
		return (EAttribute)applicationModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationModule_Services() {
		return (EReference)applicationModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextID() {
		return contextIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogger() {
		return loggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlugin() {
		return pluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Name() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Text() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Version() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Vendor() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginRegistry() {
		return pluginRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginRegistry_Store() {
		return (EReference)pluginRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginRegistryFactory() {
		return pluginRegistryFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Config() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConfig() {
		return serviceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceHook() {
		return serviceHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicePlugin() {
		return servicePluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePlugin_Services() {
		return (EReference)servicePluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicePluginRegistry() {
		return servicePluginRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePluginRegistry_Services() {
		return (EReference)servicePluginRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePluginRegistry_PluginInterface() {
		return (EAttribute)servicePluginRegistryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceReference() {
		return serviceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceReference_ClassName() {
		return (EAttribute)serviceReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceReference_InterfaceName() {
		return (EAttribute)serviceReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceReference_Config() {
		return (EReference)serviceReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceReference_RemoteExport() {
		return (EAttribute)serviceReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceReference_Status() {
		return (EAttribute)serviceReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceStatus() {
		return serviceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrameworkCoreException() {
		return frameworkCoreExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrameowrkCoreRuntimeException() {
		return frameowrkCoreRuntimeExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFrameworkCoreFactory getFrameworkCoreFactory() {
		return (QFrameworkCoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__HOOKS);
		createEReference(applicationEClass, APPLICATION__LEVELS);
		createEAttribute(applicationEClass, APPLICATION__TEXT);

		applicationLevelEClass = createEClass(APPLICATION_LEVEL);
		createEReference(applicationLevelEClass, APPLICATION_LEVEL__HOOKS);
		createEAttribute(applicationLevelEClass, APPLICATION_LEVEL__NAME);
		createEReference(applicationLevelEClass, APPLICATION_LEVEL__MODULES);
		createEAttribute(applicationLevelEClass, APPLICATION_LEVEL__VALUE);

		applicationManagerEClass = createEClass(APPLICATION_MANAGER);

		applicationModuleEClass = createEClass(APPLICATION_MODULE);
		createEAttribute(applicationModuleEClass, APPLICATION_MODULE__NAME);
		createEReference(applicationModuleEClass, APPLICATION_MODULE__SERVICES);

		contextEClass = createEClass(CONTEXT);

		contextIDEClass = createEClass(CONTEXT_ID);

		loggerEClass = createEClass(LOGGER);

		pluginEClass = createEClass(PLUGIN);
		createEAttribute(pluginEClass, PLUGIN__NAME);
		createEAttribute(pluginEClass, PLUGIN__TEXT);
		createEAttribute(pluginEClass, PLUGIN__VERSION);
		createEAttribute(pluginEClass, PLUGIN__VENDOR);

		pluginRegistryEClass = createEClass(PLUGIN_REGISTRY);
		createEReference(pluginRegistryEClass, PLUGIN_REGISTRY__STORE);

		pluginRegistryFactoryEClass = createEClass(PLUGIN_REGISTRY_FACTORY);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__CONFIG);

		serviceConfigEClass = createEClass(SERVICE_CONFIG);

		serviceHookEClass = createEClass(SERVICE_HOOK);

		servicePluginEClass = createEClass(SERVICE_PLUGIN);
		createEReference(servicePluginEClass, SERVICE_PLUGIN__SERVICES);

		servicePluginRegistryEClass = createEClass(SERVICE_PLUGIN_REGISTRY);
		createEReference(servicePluginRegistryEClass, SERVICE_PLUGIN_REGISTRY__SERVICES);
		createEAttribute(servicePluginRegistryEClass, SERVICE_PLUGIN_REGISTRY__PLUGIN_INTERFACE);

		serviceReferenceEClass = createEClass(SERVICE_REFERENCE);
		createEAttribute(serviceReferenceEClass, SERVICE_REFERENCE__CLASS_NAME);
		createEAttribute(serviceReferenceEClass, SERVICE_REFERENCE__INTERFACE_NAME);
		createEReference(serviceReferenceEClass, SERVICE_REFERENCE__CONFIG);
		createEAttribute(serviceReferenceEClass, SERVICE_REFERENCE__REMOTE_EXPORT);
		createEAttribute(serviceReferenceEClass, SERVICE_REFERENCE__STATUS);

		// Create enums
		serviceStatusEEnum = createEEnum(SERVICE_STATUS);

		// Create data types
		frameworkCoreExceptionEDataType = createEDataType(FRAMEWORK_CORE_EXCEPTION);
		frameowrkCoreRuntimeExceptionEDataType = createEDataType(FRAMEOWRK_CORE_RUNTIME_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);

		// Create type parameters
		ETypeParameter pluginRegistryEClass_T = addETypeParameter(pluginRegistryEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getPlugin());
		pluginRegistryEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		loggerEClass.getESuperTypes().add(this.getService());
		pluginRegistryEClass.getESuperTypes().add(this.getService());
		pluginRegistryFactoryEClass.getESuperTypes().add(this.getService());
		serviceHookEClass.getESuperTypes().add(this.getServiceReference());
		servicePluginEClass.getESuperTypes().add(this.getPlugin());
		servicePluginEClass.getESuperTypes().add(this.getServiceReference());
		servicePluginRegistryEClass.getESuperTypes().add(this.getServiceReference());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationEClass, QApplication.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Hooks(), this.getServiceHook(), null, "hooks", null, 0, -1, QApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Levels(), this.getApplicationLevel(), null, "levels", null, 0, -1, QApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Text(), ecorePackage.getEString(), "text", null, 0, 1, QApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationLevelEClass, QApplicationLevel.class, "ApplicationLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationLevel_Hooks(), this.getServiceHook(), null, "hooks", null, 0, -1, QApplicationLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationLevel_Name(), ecorePackage.getEString(), "name", null, 1, 1, QApplicationLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationLevel_Modules(), this.getApplicationModule(), null, "modules", null, 0, -1, QApplicationLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationLevel_Value(), ecorePackage.getEInt(), "value", null, 1, 1, QApplicationLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationManagerEClass, QApplicationManager.class, "ApplicationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(applicationManagerEClass, this.getContext(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getApplication(), "application", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaOutputStream(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(applicationModuleEClass, QApplicationModule.class, "ApplicationModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, QApplicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationModule_Services(), this.getServiceReference(), null, "services", null, 0, -1, QApplicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, QContext.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(contextEClass, null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameowrkCoreRuntimeException());

		op = addEOperation(contextEClass, this.getContext(), "createChild", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameowrkCoreRuntimeException());

		op = addEOperation(contextEClass, null, "get", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEJavaObject(), "adaptable", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "adapterType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "inject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameowrkCoreRuntimeException());

		op = addEOperation(contextEClass, null, "loadClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "address", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "invoke", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "A");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaAnnotation());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "qualifier", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameowrkCoreRuntimeException());

		op = addEOperation(contextEClass, null, "make", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameowrkCoreRuntimeException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameowrkCoreRuntimeException());

		op = addEOperation(contextEClass, null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getFrameowrkCoreRuntimeException());

		initEClass(contextIDEClass, QContextID.class, "ContextID", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contextIDEClass, ecorePackage.getEString(), "getID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loggerEClass, QLogger.class, "Logger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(loggerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pluginEClass, QPlugin.class, "Plugin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlugin_Name(), ecorePackage.getEString(), "name", null, 1, 1, QPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Text(), ecorePackage.getEString(), "text", null, 0, 1, QPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Version(), ecorePackage.getEString(), "version", null, 0, 1, QPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, QPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(pluginEClass, ecorePackage.getEString(), "getPluginID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pluginRegistryEClass, QPluginRegistry.class, "PluginRegistry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getPluginRegistry());
		g2 = createEGenericType(pluginRegistryEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getPluginRegistry_Store(), g1, null, "store", null, 0, 1, QPluginRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(pluginRegistryEClass, null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pluginRegistryEClass_T);
		initEOperation(op, g1);

		op = addEOperation(pluginRegistryEClass, null, "lookupByVendorVersion", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "vendor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "version", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pluginRegistryEClass_T);
		initEOperation(op, g1);

		op = addEOperation(pluginRegistryEClass, null, "list", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(pluginRegistryEClass_T);
		initEOperation(op, g1);

		initEClass(pluginRegistryFactoryEClass, QPluginRegistryFactory.class, "PluginRegistryFactory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(pluginRegistryFactoryEClass, null, "createPluginRegistry", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getPlugin());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "pluginClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPluginRegistry());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(serviceEClass, QService.class, "Service", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Config(), this.getServiceConfig(), null, "config", null, 0, 1, QService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConfigEClass, QServiceConfig.class, "ServiceConfig", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceHookEClass, QServiceHook.class, "ServiceHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicePluginEClass, QServicePlugin.class, "ServicePlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicePlugin_Services(), this.getServiceReference(), null, "services", null, 0, -1, QServicePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicePluginRegistryEClass, QServicePluginRegistry.class, "ServicePluginRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicePluginRegistry_Services(), this.getServicePlugin(), null, "services", null, 0, -1, QServicePluginRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePluginRegistry_PluginInterface(), ecorePackage.getEString(), "pluginInterface", null, 1, 1, QServicePluginRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceReferenceEClass, QServiceReference.class, "ServiceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceReference_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, QServiceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceReference_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, QServiceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceReference_Config(), this.getServiceConfig(), null, "config", null, 0, 1, QServiceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceReference_RemoteExport(), ecorePackage.getEBoolean(), "remoteExport", null, 1, 1, QServiceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceReference_Status(), this.getServiceStatus(), "status", null, 1, 1, QServiceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceStatusEEnum, ServiceStatus.class, "ServiceStatus");
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.ACTIVE);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.STOPPED);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.TESTING);

		// Initialize data types
		initEDataType(frameworkCoreExceptionEDataType, FrameworkCoreException.class, "FrameworkCoreException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(frameowrkCoreRuntimeExceptionEDataType, FrameworkCoreRuntimeException.class, "FrameowrkCoreRuntimeException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FrameworkCorePackageImpl
