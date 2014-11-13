/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import java.util.List;

import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.asup.os.type.file.QPrinterFileField;
import org.asup.os.type.file.QPrinterFileFormat;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Printer File Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrinterFileFormatImpl extends FileFormatImpl<QPrinterFileField> implements QPrinterFileFormat {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrinterFileFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.PRINTER_FILE_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public List<QPrinterFileField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<QPrinterFileField>(QPrinterFileField.class, this, QOperatingSystemFilePackage.PRINTER_FILE_FORMAT__FIELDS);
		}
		return fields;
	}

} //PrinterFileFormatImpl
