/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.util;

import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QService;

import org.asup.os.omac.QAdaptable;
import org.asup.os.omac.QManager;
import org.asup.os.omac.QObject;
import org.asup.os.omac.QObjectContainer;
import org.asup.os.omac.QObjectNameable;

import org.asup.os.type.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.os.type.QOperatingSystemTypePackage
 * @generated
 */
public class OperatingSystemTypeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QOperatingSystemTypePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemTypeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QOperatingSystemTypePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingSystemTypeSwitch<Adapter> modelSwitch =
		new OperatingSystemTypeSwitch<Adapter>() {
			@Override
			public Adapter caseType(QType object) {
				return createTypeAdapter();
			}
			@Override
			public <T extends QTypedObject> Adapter caseTypedContainer(QTypedContainer<T> object) {
				return createTypedContainerAdapter();
			}
			@Override
			public <T extends QTypedObject> Adapter caseTypedManager(QTypedManager<T> object) {
				return createTypedManagerAdapter();
			}
			@Override
			public Adapter caseTypedObject(QTypedObject object) {
				return createTypedObjectAdapter();
			}
			@Override
			public <T extends QTypedObject> Adapter caseTypedReference(QTypedReference<T> object) {
				return createTypedReferenceAdapter();
			}
			@Override
			public Adapter caseTypeManager(QTypeManager object) {
				return createTypeManagerAdapter();
			}
			@Override
			public Adapter caseTypeRegistry(QTypeRegistry object) {
				return createTypeRegistryAdapter();
			}
			@Override
			public Adapter caseAdaptable(QAdaptable object) {
				return createAdaptableAdapter();
			}
			@Override
			public Adapter caseObject(QObject object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseObjectNameable(QObjectNameable object) {
				return createObjectNameableAdapter();
			}
			@Override
			public <T extends QObject> Adapter caseObjectContainer(QObjectContainer<T> object) {
				return createObjectContainerAdapter();
			}
			@Override
			public Adapter casePlugin(QPlugin object) {
				return createPluginAdapter();
			}
			@Override
			public Adapter caseService(QService object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseManager(QManager object) {
				return createManagerAdapter();
			}
			@Override
			public <T extends QPlugin> Adapter casePluginRegistry(QPluginRegistry<T> object) {
				return createPluginRegistryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.type.QType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.type.QType
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.type.QTypedContainer <em>Typed Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.type.QTypedContainer
	 * @generated
	 */
	public Adapter createTypedContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.type.QTypedManager <em>Typed Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.type.QTypedManager
	 * @generated
	 */
	public Adapter createTypedManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.type.QTypedObject <em>Typed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.type.QTypedObject
	 * @generated
	 */
	public Adapter createTypedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.type.QTypedReference <em>Typed Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.type.QTypedReference
	 * @generated
	 */
	public Adapter createTypedReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.type.QTypeManager <em>Type Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.type.QTypeManager
	 * @generated
	 */
	public Adapter createTypeManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.type.QTypeRegistry <em>Type Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.type.QTypeRegistry
	 * @generated
	 */
	public Adapter createTypeRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.omac.QAdaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.omac.QAdaptable
	 * @generated
	 */
	public Adapter createAdaptableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.omac.QObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.omac.QObject
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.omac.QObjectNameable <em>Object Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.omac.QObjectNameable
	 * @generated
	 */
	public Adapter createObjectNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.omac.QObjectContainer <em>Object Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.omac.QObjectContainer
	 * @generated
	 */
	public Adapter createObjectContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.fw.core.QPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.fw.core.QPlugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.fw.core.QService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.fw.core.QService
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.os.omac.QManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.os.omac.QManager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asup.fw.core.QPluginRegistry <em>Plugin Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asup.fw.core.QPluginRegistry
	 * @generated
	 */
	public Adapter createPluginRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OperatingSystemTypeAdapterFactory
