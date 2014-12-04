/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.msgf.impl;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.impl.TypedManagerImpl;
import org.asup.os.type.msgf.MessageException;
import org.asup.os.type.msgf.QMessageFile;
import org.asup.os.type.msgf.QMessageFileManager;
import org.asup.os.type.msgf.QOperatingSystemMessageFilePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message File Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class MessageFileManagerImpl extends TypedManagerImpl<QMessageFile> implements QMessageFileManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFileManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Class<QMessageFile> getTypedClass() {
		return QMessageFile.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemMessageFilePackage.Literals.MESSAGE_FILE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <E extends Enum<E>> MessageException prepareException(QContextID contextID, Enum<E> messageName, Object[] variables) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void overrideMessageFile(QJob job, String messageFileFrom, QMessageFile messageFileTo) throws OperatingSystemRuntimeException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMessageFile getOverrideMessageFile(QJob job, String messageFileName) throws OperatingSystemRuntimeException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //MessageFileManagerImpl
