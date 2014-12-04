/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 */
package org.asup.co.shell;

import java.io.IOException;
import java.io.Writer;

import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.co.shell.QShellPackage#getOutputWrapper()
 * @model abstract="true"
 * @generated
 */
public interface QOutputWrapper extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException"
	 * @generated
	 */
	void flush(String jobID) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.java.JavaIOException"
	 * @generated
	 */
	void write(String jobID, String value) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model writerDataType="org.asup.fw.java.JavaWriter"
	 * @generated
	 */
	void register(String jobID, Writer writer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unregister(String jobID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean contains(String jobID);

} // QOutputWrapper
