/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import org.asup.il.data.QUnaryAtomicBufferedDataDef;
import org.asup.il.data.impl.UnaryAtomicDataTermImpl;
import org.asup.os.type.file.QFileFormatField;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Format Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class FileFormatFieldImpl extends UnaryAtomicDataTermImpl<QUnaryAtomicBufferedDataDef<?>> implements QFileFormatField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileFormatFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.FILE_FORMAT_FIELD;
	}

} //FileFormatFieldImpl
