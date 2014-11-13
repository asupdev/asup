/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import java.util.List;

import org.asup.os.type.file.QDisplayFileField;
import org.asup.os.type.file.QDisplayFileFormat;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display File Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DisplayFileFormatImpl extends FileFormatImpl<QDisplayFileField> implements QDisplayFileFormat {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayFileFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.DISPLAY_FILE_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public List<QDisplayFileField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<QDisplayFileField>(QDisplayFileField.class, this, QOperatingSystemFilePackage.DISPLAY_FILE_FORMAT__FIELDS);
		}
		return fields;
	}

} //DisplayFileFormatImpl
