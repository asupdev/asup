/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.msgf;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.QTypedManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message File Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.msgf.QOperatingSystemMessageFilePackage#getMessageFileManager()
 * @model abstract="true"
 * @generated
 */
public interface QMessageFileManager extends QTypedManager<QMessageFile> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.asup.os.type.msgf.MessageException" contextIDRequired="true" messageFileRequired="true" messageNameType="org.asup.fw.java.JavaEnum" messageNameRequired="true" variablesDataType="org.asup.os.type.msgf.MessageVariableList" variablesRequired="true" EBounds="org.asup.fw.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> MessageException prepareException(QContextID contextID, String messageFile, Enum<E> messageName, Object[] variables);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemRuntimeException" messageFileFromRequired="true" messageFileToRequired="true"
	 * @generated
	 */
	void overrideMessageFile(QJob job, String messageFileFrom, QMessageFile messageFileTo) throws OperatingSystemRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemRuntimeException" messageFileNameRequired="true"
	 * @generated
	 */
	QMessageFile getOverrideMessageFile(QJob job, String messageFileName) throws OperatingSystemRuntimeException;
} // QMessageFileManager
