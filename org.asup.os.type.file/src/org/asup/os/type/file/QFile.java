/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import java.net.URI;
import org.asup.il.core.QNamedNode;
import org.asup.os.type.QTypedObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QFile</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.os.type.file.QOperatingSystemFilePackage#getFile()
 * @model abstract="true"
 * @generated
 */
public interface QFile extends QTypedObject, QNamedNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.asup.fw.java.JavaURI"
	 * @generated
	 */
	URI getClassURI();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.asup.fw.java.JavaURI"
	 * @generated
	 */
	URI getPackageInfoURI();

} // QFile
