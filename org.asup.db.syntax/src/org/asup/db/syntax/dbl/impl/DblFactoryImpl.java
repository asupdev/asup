/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.db.syntax.dbl.impl;

import org.asup.db.syntax.dbl.*;

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
public class DblFactoryImpl extends EFactoryImpl implements QDblFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QDblFactory init() {
		try {
			QDblFactory theDblFactory = (QDblFactory)EPackage.Registry.INSTANCE.getEFactory(QDblPackage.eNS_URI);
			if (theDblFactory != null) {
				return theDblFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DblFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DblFactoryImpl() {
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
			case QDblPackage.EXECUTE_IMMEDIATE_STATEMENT: return (EObject)createExecuteImmediateStatement();
			case QDblPackage.EXECUTE_STATEMENT: return (EObject)createExecuteStatement();
			case QDblPackage.INTO_CLAUSE: return (EObject)createIntoClause();
			case QDblPackage.SET_TRANSACTION_STATEMENT: return (EObject)createSetTransactionStatement();
			case QDblPackage.OPEN_STATEMENT: return (EObject)createOpenStatement();
			case QDblPackage.PREPARE_STATEMENT: return (EObject)createPrepareStatement();
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
			case QDblPackage.ISOLATION_LEVEL:
				return createIsolationLevelFromString(eDataType, initialValue);
			case QDblPackage.RW_OPERATION:
				return createRWOperationFromString(eDataType, initialValue);
			case QDblPackage.OPEN_TYPE:
				return createOpenTypeFromString(eDataType, initialValue);
			case QDblPackage.USING_TYPE:
				return createUsingTypeFromString(eDataType, initialValue);
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
			case QDblPackage.ISOLATION_LEVEL:
				return convertIsolationLevelToString(eDataType, instanceValue);
			case QDblPackage.RW_OPERATION:
				return convertRWOperationToString(eDataType, instanceValue);
			case QDblPackage.OPEN_TYPE:
				return convertOpenTypeToString(eDataType, instanceValue);
			case QDblPackage.USING_TYPE:
				return convertUsingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QExecuteImmediateStatement createExecuteImmediateStatement() {
		ExecuteImmediateStatementImpl executeImmediateStatement = new ExecuteImmediateStatementImpl();
		return executeImmediateStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QExecuteStatement createExecuteStatement() {
		ExecuteStatementImpl executeStatement = new ExecuteStatementImpl();
		return executeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSetTransactionStatement createSetTransactionStatement() {
		SetTransactionStatementImpl setTransactionStatement = new SetTransactionStatementImpl();
		return setTransactionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOpenStatement createOpenStatement() {
		OpenStatementImpl openStatement = new OpenStatementImpl();
		return openStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPrepareStatement createPrepareStatement() {
		PrepareStatementImpl prepareStatement = new PrepareStatementImpl();
		return prepareStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntoClause createIntoClause() {
		IntoClauseImpl intoClause = new IntoClauseImpl();
		return intoClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolationLevel createIsolationLevelFromString(EDataType eDataType, String initialValue) {
		IsolationLevel result = IsolationLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsolationLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWOperation createRWOperationFromString(EDataType eDataType, String initialValue) {
		RWOperation result = RWOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRWOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenType createOpenTypeFromString(EDataType eDataType, String initialValue) {
		OpenType result = OpenType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsingType createUsingTypeFromString(EDataType eDataType, String initialValue) {
		UsingType result = UsingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDblPackage getDblPackage() {
		return (QDblPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDblPackage getPackage() {
		return QDblPackage.eINSTANCE;
	}

} //DblFactoryImpl
