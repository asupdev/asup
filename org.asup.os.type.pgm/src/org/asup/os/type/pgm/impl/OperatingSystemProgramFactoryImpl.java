/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.pgm.impl;

import org.asup.il.data.QData;
import org.asup.os.type.pgm.QActivationGroup;
import org.asup.os.type.pgm.QOperatingSystemProgramFactory;
import org.asup.os.type.pgm.QOperatingSystemProgramPackage;
import org.asup.os.type.pgm.QProgram;
import org.asup.os.type.pgm.QProgramContainer;
import org.asup.os.type.pgm.QProgramSource;
import org.asup.os.type.pgm.QProgramStack;
import org.asup.os.type.pgm.QProgramStatus;
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
public class OperatingSystemProgramFactoryImpl extends EFactoryImpl implements QOperatingSystemProgramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemProgramFactory init() {
		try {
			QOperatingSystemProgramFactory theOperatingSystemProgramFactory = (QOperatingSystemProgramFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemProgramPackage.eNS_URI);
			if (theOperatingSystemProgramFactory != null) {
				return theOperatingSystemProgramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemProgramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemProgramFactoryImpl() {
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
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP: return (EObject)createActivationGroup();
			case QOperatingSystemProgramPackage.PROGRAM: return (EObject)createProgram();
			case QOperatingSystemProgramPackage.PROGRAM_CONTAINER: return (EObject)createProgramContainer();
			case QOperatingSystemProgramPackage.PROGRAM_SOURCE: return (EObject)createProgramSource();
			case QOperatingSystemProgramPackage.PROGRAM_STACK: return (EObject)createProgramStack();
			case QOperatingSystemProgramPackage.PROGRAM_STATUS: return (EObject)createProgramStatus();
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
			case QOperatingSystemProgramPackage.PARAMETER_LIST:
				return createParameterListFromString(eDataType, initialValue);
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
			case QOperatingSystemProgramPackage.PARAMETER_LIST:
				return convertParameterListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QActivationGroup createActivationGroup() {
		ActivationGroupImpl activationGroup = new ActivationGroupImpl();
		return activationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProgram createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProgramContainer createProgramContainer() {
		ProgramContainerImpl programContainer = new ProgramContainerImpl();
		return programContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProgramSource createProgramSource() {
		ProgramSourceImpl programSource = new ProgramSourceImpl();
		return programSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProgramStack createProgramStack() {
		ProgramStackImpl programStack = new ProgramStackImpl();
		return programStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProgramStatus createProgramStatus() {
		ProgramStatusImpl programStatus = new ProgramStatusImpl();
		return programStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QData[] createParameterListFromString(EDataType eDataType, String initialValue) {
		return (QData[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemProgramPackage getOperatingSystemProgramPackage() {
		return (QOperatingSystemProgramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemProgramPackage getPackage() {
		return QOperatingSystemProgramPackage.eINSTANCE;
	}

} //OSProgramCoreFactoryImpl
