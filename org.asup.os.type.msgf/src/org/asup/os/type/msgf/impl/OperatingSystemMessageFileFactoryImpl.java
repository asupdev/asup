/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.msgf.impl;

import org.asup.os.type.msgf.*;

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
public class OperatingSystemMessageFileFactoryImpl extends EFactoryImpl implements QOperatingSystemMessageFileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemMessageFileFactory init() {
		try {
			QOperatingSystemMessageFileFactory theOperatingSystemMessageFileFactory = (QOperatingSystemMessageFileFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemMessageFilePackage.eNS_URI);
			if (theOperatingSystemMessageFileFactory != null) {
				return theOperatingSystemMessageFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemMessageFileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemMessageFileFactoryImpl() {
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
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION: return (EObject)createMessageDescription();
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION_DATA_FIELD: return (EObject)createMessageDescriptionDataField();
			case QOperatingSystemMessageFilePackage.MESSAGE_FILE: return (EObject)createMessageFile();
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
			case QOperatingSystemMessageFilePackage.MESSAGE_VARIABLE_LIST:
				return createMessageVariableListFromString(eDataType, initialValue);
			case QOperatingSystemMessageFilePackage.MESSAGE_EXCEPTION:
				return createMessageExceptionFromString(eDataType, initialValue);
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
			case QOperatingSystemMessageFilePackage.MESSAGE_VARIABLE_LIST:
				return convertMessageVariableListToString(eDataType, instanceValue);
			case QOperatingSystemMessageFilePackage.MESSAGE_EXCEPTION:
				return convertMessageExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMessageDescription createMessageDescription() {
		MessageDescriptionImpl messageDescription = new MessageDescriptionImpl();
		return messageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMessageDescriptionDataField createMessageDescriptionDataField() {
		MessageDescriptionDataFieldImpl messageDescriptionDataField = new MessageDescriptionDataFieldImpl();
		return messageDescriptionDataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMessageFile createMessageFile() {
		MessageFileImpl messageFile = new MessageFileImpl();
		return messageFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object[] createMessageVariableListFromString(EDataType eDataType, String initialValue) {
		return (Object[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageVariableListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageException createMessageExceptionFromString(EDataType eDataType, String initialValue) {
		return (MessageException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemMessageFilePackage getOperatingSystemMessageFilePackage() {
		return (QOperatingSystemMessageFilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemMessageFilePackage getPackage() {
		return QOperatingSystemMessageFilePackage.eINSTANCE;
	}

} //OperatingSystemMessageFileFactoryImpl
