/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.co.osgi.ecf.impl;

import org.asup.co.osgi.ecf.*;

import org.eclipse.emf.ecore.EClass;
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
public class ECFConnectorOSGIFactoryImpl extends EFactoryImpl implements QECFConnectorOSGIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QECFConnectorOSGIFactory init() {
		try {
			QECFConnectorOSGIFactory theECFConnectorOSGIFactory = (QECFConnectorOSGIFactory)EPackage.Registry.INSTANCE.getEFactory(QECFConnectorOSGIPackage.eNS_URI);
			if (theECFConnectorOSGIFactory != null) {
				return theECFConnectorOSGIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ECFConnectorOSGIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECFConnectorOSGIFactoryImpl() {
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
			case QECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG: return (EObject)createECFServerContainerConfig();
			case QECFConnectorOSGIPackage.ECF_CLIENT_CONTAINER_CONFIG: return (EObject)createECFClientContainerConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QECFServerContainerConfig createECFServerContainerConfig() {
		ECFServerContainerConfigImpl ecfServerContainerConfig = new ECFServerContainerConfigImpl();
		return ecfServerContainerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QECFClientContainerConfig createECFClientContainerConfig() {
		ECFClientContainerConfigImpl ecfClientContainerConfig = new ECFClientContainerConfigImpl();
		return ecfClientContainerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QECFConnectorOSGIPackage getECFConnectorOSGIPackage() {
		return (QECFConnectorOSGIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QECFConnectorOSGIPackage getPackage() {
		return QECFConnectorOSGIPackage.eINSTANCE;
	}

} //ECFConnectorOSGIFactoryImpl
