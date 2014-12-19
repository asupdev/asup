/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core.impl;

import org.asup.fw.core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameworkCoreFactoryImpl extends EFactoryImpl implements QFrameworkCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QFrameworkCoreFactory init() {
		try {
			QFrameworkCoreFactory theFrameworkCoreFactory = (QFrameworkCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QFrameworkCorePackage.eNS_URI);
			if (theFrameworkCoreFactory != null) {
				return theFrameworkCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FrameworkCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QFrameworkCorePackage.APPLICATION: return (EObject)createApplication();
			case QFrameworkCorePackage.APPLICATION_LEVEL: return (EObject)createApplicationLevel();
			case QFrameworkCorePackage.APPLICATION_MODULE: return (EObject)createApplicationModule();
			case QFrameworkCorePackage.SERVICE_HOOK: return (EObject)createServiceHook();
			case QFrameworkCorePackage.SERVICE_PLUGIN: return (EObject)createServicePlugin();
			case QFrameworkCorePackage.SERVICE_PLUGIN_REGISTRY: return (EObject)createServicePluginRegistry();
			case QFrameworkCorePackage.SERVICE_REFERENCE: return (EObject)createServiceReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QFrameworkCorePackage.CONTEXT_INJECTION_STRATEGY:
				return createContextInjectionStrategyFromString(eDataType, initialValue);
			case QFrameworkCorePackage.SERVICE_STATUS:
				return createServiceStatusFromString(eDataType, initialValue);
			case QFrameworkCorePackage.FRAMEWORK_CORE_EXCEPTION:
				return createFrameworkCoreExceptionFromString(eDataType, initialValue);
			case QFrameworkCorePackage.FRAMEOWRK_CORE_RUNTIME_EXCEPTION:
				return createFrameowrkCoreRuntimeExceptionFromString(eDataType, initialValue);
			case QFrameworkCorePackage.FRAMEWORK_CORE_UNEXPECTED_CONDITION_EXCEPTION:
				return createFrameworkCoreUnexpectedConditionExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QFrameworkCorePackage.CONTEXT_INJECTION_STRATEGY:
				return convertContextInjectionStrategyToString(eDataType, instanceValue);
			case QFrameworkCorePackage.SERVICE_STATUS:
				return convertServiceStatusToString(eDataType, instanceValue);
			case QFrameworkCorePackage.FRAMEWORK_CORE_EXCEPTION:
				return convertFrameworkCoreExceptionToString(eDataType, instanceValue);
			case QFrameworkCorePackage.FRAMEOWRK_CORE_RUNTIME_EXCEPTION:
				return convertFrameowrkCoreRuntimeExceptionToString(eDataType, instanceValue);
			case QFrameworkCorePackage.FRAMEWORK_CORE_UNEXPECTED_CONDITION_EXCEPTION:
				return convertFrameworkCoreUnexpectedConditionExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QApplication createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QApplicationLevel createApplicationLevel() {
		ApplicationLevelImpl applicationLevel = new ApplicationLevelImpl();
		return applicationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QApplicationModule createApplicationModule() {
		ApplicationModuleImpl applicationModule = new ApplicationModuleImpl();
		return applicationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServiceHook createServiceHook() {
		ServiceHookImpl serviceHook = new ServiceHookImpl();
		return serviceHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServicePlugin createServicePlugin() {
		ServicePluginImpl servicePlugin = new ServicePluginImpl();
		return servicePlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServicePluginRegistry createServicePluginRegistry() {
		ServicePluginRegistryImpl servicePluginRegistry = new ServicePluginRegistryImpl();
		return servicePluginRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServiceReference createServiceReference() {
		ServiceReferenceImpl serviceReference = new ServiceReferenceImpl();
		return serviceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextInjectionStrategy createContextInjectionStrategyFromString(EDataType eDataType, String initialValue) {
		ContextInjectionStrategy result = ContextInjectionStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextInjectionStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStatus createServiceStatusFromString(EDataType eDataType, String initialValue) {
		ServiceStatus result = ServiceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkCoreException createFrameworkCoreExceptionFromString(EDataType eDataType, String initialValue) {
		return (FrameworkCoreException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkCoreExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkCoreRuntimeException createFrameowrkCoreRuntimeExceptionFromString(EDataType eDataType, String initialValue) {
		return (FrameworkCoreRuntimeException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameowrkCoreRuntimeExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkCoreUnexpectedConditionException createFrameworkCoreUnexpectedConditionExceptionFromString(EDataType eDataType, String initialValue) {
		return (FrameworkCoreUnexpectedConditionException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkCoreUnexpectedConditionExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFrameworkCorePackage getFrameworkCorePackage() {
		return (QFrameworkCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QFrameworkCorePackage getPackage() {
		return QFrameworkCorePackage.eINSTANCE;
	}

} //FrameworkCoreFactoryImpl
