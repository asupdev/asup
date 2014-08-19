/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam.impl;

import org.asup.il.isam.*;
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
public class IntegratedLanguageIsamFactoryImpl extends EFactoryImpl implements QIntegratedLanguageIsamFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageIsamFactory init() {
		try {
			QIntegratedLanguageIsamFactory theIntegratedLanguageIsamFactory = (QIntegratedLanguageIsamFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageIsamPackage.eNS_URI);
			if (theIntegratedLanguageIsamFactory != null) {
				return theIntegratedLanguageIsamFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageIsamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageIsamFactoryImpl() {
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
			case QIntegratedLanguageIsamPackage.DATA_SET_TERM: return (EObject)createDataSetTerm();
			case QIntegratedLanguageIsamPackage.KEY_LIST_TERM: return (EObject)createKeyListTerm();
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
			case QIntegratedLanguageIsamPackage.ACCESS_MODE:
				return createAccessModeFromString(eDataType, initialValue);
			case QIntegratedLanguageIsamPackage.OPERATION_SET:
				return createOperationSetFromString(eDataType, initialValue);
			case QIntegratedLanguageIsamPackage.OPERATION_READ:
				return createOperationReadFromString(eDataType, initialValue);
			case QIntegratedLanguageIsamPackage.KEY_VALUE:
				return createKeyValueFromString(eDataType, initialValue);
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
			case QIntegratedLanguageIsamPackage.ACCESS_MODE:
				return convertAccessModeToString(eDataType, instanceValue);
			case QIntegratedLanguageIsamPackage.OPERATION_SET:
				return convertOperationSetToString(eDataType, instanceValue);
			case QIntegratedLanguageIsamPackage.OPERATION_READ:
				return convertOperationReadToString(eDataType, instanceValue);
			case QIntegratedLanguageIsamPackage.KEY_VALUE:
				return convertKeyValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataSetTerm createDataSetTerm() {
		DataSetTermImpl dataSetTerm = new DataSetTermImpl();
		return dataSetTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QKeyListTerm createKeyListTerm() {
		KeyListTermImpl keyListTerm = new KeyListTermImpl();
		return keyListTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMode createAccessModeFromString(EDataType eDataType, String initialValue) {
		AccessMode result = AccessMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSet createOperationSetFromString(EDataType eDataType, String initialValue) {
		OperationSet result = OperationSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRead createOperationReadFromString(EDataType eDataType, String initialValue) {
		OperationRead result = OperationRead.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationReadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object[] createKeyValueFromString(EDataType eDataType, String initialValue) {
		return (Object[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyValueToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageIsamPackage getIntegratedLanguageIsamPackage() {
		return (QIntegratedLanguageIsamPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageIsamPackage getPackage() {
		return QIntegratedLanguageIsamPackage.eINSTANCE;
	}

} //IntegratedLanguageISAMFactoryImpl
