/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.data.impl;

import org.asup.os.data.*;
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
public class OperatingSystemDataFactoryImpl extends EFactoryImpl implements QOperatingSystemDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemDataFactory init() {
		try {
			QOperatingSystemDataFactory theOperatingSystemDataFactory = (QOperatingSystemDataFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemDataPackage.eNS_URI);
			if (theOperatingSystemDataFactory != null) {
				return theOperatingSystemDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemDataFactoryImpl() {
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
			case QOperatingSystemDataPackage.TYPED_DATA_DEF: return (EObject)createTypedDataDef();
			case QOperatingSystemDataPackage.EXTERNAL_FILE_NAME: return (EObject)createExternalFileName();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTypedDataDef createTypedDataDef() {
		TypedDataDefImpl typedDataDef = new TypedDataDefImpl();
		return typedDataDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QExternalFileName createExternalFileName() {
		ExternalFileNameImpl externalFileName = new ExternalFileNameImpl();
		return externalFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemDataPackage getOperatingSystemDataPackage() {
		return (QOperatingSystemDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemDataPackage getPackage() {
		return QOperatingSystemDataPackage.eINSTANCE;
	}

} //OSDataFactoryImpl
