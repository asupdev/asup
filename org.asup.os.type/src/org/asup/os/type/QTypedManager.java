/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type;

import org.asup.fw.core.QPlugin;
import org.asup.os.core.Scope;
import org.asup.os.core.jobs.QJob;
import org.asup.os.core.resources.QResourceReader;
import org.asup.os.core.resources.QResourceSetReader;
import org.asup.os.core.resources.QResourceWriter;
import org.asup.os.omac.QManager;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QTyped Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.QOperatingSystemTypePackage#getTypedManager()
 * @model abstract="true"
 * @generated
 */
public interface QTypedManager<T extends QTypedObject> extends QPlugin, QManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Class<T> getTypedClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" containerRequired="true"
	 * @generated
	 */
	QResourceReader<T> getResourceReader(QJob job, String container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	QResourceSetReader<T> getResourceReader(QJob job, Scope scope);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" containerRequired="true"
	 * @generated
	 */
	QResourceWriter<T> getResourceWriter(QJob job, String container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	QResourceWriter<T> getResourceWriter(QJob job, Scope scope);

} // QTypedManager
