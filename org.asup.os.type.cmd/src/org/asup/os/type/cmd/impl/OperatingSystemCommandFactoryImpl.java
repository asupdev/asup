/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation
 */
package org.asup.os.type.cmd.impl;

import org.asup.os.type.cmd.CommandStatus;
import org.asup.os.type.cmd.QCallableCommand;
import org.asup.os.type.cmd.QCommand;
import org.asup.os.type.cmd.QCommandContainer;
import org.asup.os.type.cmd.QCommandParameter;
import org.asup.os.type.cmd.QCommandSource;
import org.asup.os.type.cmd.QOperatingSystemCommandFactory;
import org.asup.os.type.cmd.QOperatingSystemCommandPackage;
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
public class OperatingSystemCommandFactoryImpl extends EFactoryImpl implements QOperatingSystemCommandFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemCommandFactory init() {
		try {
			QOperatingSystemCommandFactory theOperatingSystemCommandFactory = (QOperatingSystemCommandFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemCommandPackage.eNS_URI);
			if (theOperatingSystemCommandFactory != null) {
				return theOperatingSystemCommandFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemCommandFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemCommandFactoryImpl() {
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
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND: return (EObject)createCallableCommand();
			case QOperatingSystemCommandPackage.COMMAND: return (EObject)createCommand();
			case QOperatingSystemCommandPackage.COMMAND_CONTAINER: return (EObject)createCommandContainer();
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER: return (EObject)createCommandParameter();
			case QOperatingSystemCommandPackage.COMMAND_SOURCE: return (EObject)createCommandSource();
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
			case QOperatingSystemCommandPackage.COMMAND_STATUS:
				return createCommandStatusFromString(eDataType, initialValue);
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
			case QOperatingSystemCommandPackage.COMMAND_STATUS:
				return convertCommandStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCallableCommand createCallableCommand() {
		CallableCommandImpl callableCommand = new CallableCommandImpl();
		return callableCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCommand createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCommandContainer createCommandContainer() {
		CommandContainerImpl commandContainer = new CommandContainerImpl();
		return commandContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCommandParameter createCommandParameter() {
		CommandParameterImpl commandParameter = new CommandParameterImpl();
		return commandParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCommandSource createCommandSource() {
		CommandSourceImpl commandSource = new CommandSourceImpl();
		return commandSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandStatus createCommandStatusFromString(EDataType eDataType, String initialValue) {
		CommandStatus result = CommandStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemCommandPackage getOperatingSystemCommandPackage() {
		return (QOperatingSystemCommandPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemCommandPackage getPackage() {
		return QOperatingSystemCommandPackage.eINSTANCE;
	}

} //OSCommandCoreFactoryImpl
