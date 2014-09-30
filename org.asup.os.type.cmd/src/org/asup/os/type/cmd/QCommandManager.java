/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.cmd;

import java.util.Map;

import org.asup.fw.core.QContextID;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.type.QTypedManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QCommand Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.cmd.QOperatingSystemCommandPackage#getCommandManager()
 * @model abstract="true"
 * @generated
 */
public interface QCommandManager extends QTypedManager<QCommand> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.os.core.OperatingSystemException" contextIDRequired="true" commandRequired="true" defaultsRequired="true"
	 * @generated
	 */
	QCallableCommand prepareCommand(QContextID contextID, String command, Map<String, Object> variables, boolean defaults) throws OperatingSystemException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.core.OperatingSystemException" contextIDRequired="true" commandRequired="true"
	 * @generated
	 */
	void executeCommand(QContextID contextID, QCallableCommand command) throws OperatingSystemException;

} // QCommandManager
