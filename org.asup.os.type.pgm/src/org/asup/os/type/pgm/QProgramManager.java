/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.pgm;

import org.asup.fw.core.QContextID;
import org.asup.il.data.QData;
import org.asup.os.core.OperatingSystemException;
import org.asup.os.core.jobs.QJob;
import org.asup.os.type.QTypedManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QProgram Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.pgm.QOperatingSystemProgramPackage#getProgramManager()
 * @model abstract="true"
 * @generated
 */
public interface QProgramManager extends QTypedManager<QProgram> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.type.pgm.OperatingSystemRuntimeProgramException" paramsDataType="org.asup.os.type.pgm.ParameterList"
	 * @generated
	 */
	void callProgram(QContextID contextID, String library, String program, QData[] params) throws OperatingSystemRuntimeProgramException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.type.pgm.OperatingSystemRuntimeProgramException" paramsDataType="org.asup.os.type.pgm.ParameterList"
	 * @generated
	 */
	void callProgram(QJob job, Class<?> klass, QData[] params) throws OperatingSystemRuntimeProgramException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	QCallableProgram getCaller(QContextID contextID, QCallableProgram context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rawProgramRequired="true"
	 * @generated
	 */
	QCallableProgram getCaller(QContextID contextID, Object rawProgram);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QProgramStack getProgramStack(QContextID contextID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.type.pgm.OperatingSystemRuntimeProgramException" programRequired="true"
	 * @generated
	 */
	QCallableProgram loadProgram(QJob job, QProgram program) throws OperatingSystemException, OperatingSystemRuntimeProgramException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.os.type.pgm.OperatingSystemRuntimeProgramException"
	 * @generated
	 */
	QCallableProgram loadProgram(QJob job, Class<?> klass) throws OperatingSystemException, OperatingSystemRuntimeProgramException;

} // QProgramManager
