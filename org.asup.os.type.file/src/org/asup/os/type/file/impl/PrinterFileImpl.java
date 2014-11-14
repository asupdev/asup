/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import java.util.Collection;
import java.util.List;

import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.asup.os.type.file.QPrinterFile;
import org.asup.os.type.file.QPrinterFileFormat;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Printer File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.asup.os.type.file.impl.PrinterFileImpl#getPrinterFormats <em>Printer Formats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrinterFileImpl extends FileImpl implements QPrinterFile {
	/**
	 * The cached value of the '{@link #getPrinterFormats() <em>Printer Formats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrinterFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<QPrinterFileFormat> printerFormats;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrinterFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.PRINTER_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QPrinterFileFormat> getPrinterFormats() {
		if (printerFormats == null) {
			printerFormats = new EObjectContainmentEList<QPrinterFileFormat>(QPrinterFileFormat.class, this, QOperatingSystemFilePackage.PRINTER_FILE__PRINTER_FORMATS);
		}
		return printerFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<QPrinterFileFormat> getFileFormats() {
		return getPrinterFormats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.PRINTER_FILE__PRINTER_FORMATS:
				return ((InternalEList<?>)getPrinterFormats()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemFilePackage.PRINTER_FILE__PRINTER_FORMATS:
				return getPrinterFormats();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemFilePackage.PRINTER_FILE__PRINTER_FORMATS:
				getPrinterFormats().clear();
				getPrinterFormats().addAll((Collection<? extends QPrinterFileFormat>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperatingSystemFilePackage.PRINTER_FILE__PRINTER_FORMATS:
				getPrinterFormats().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperatingSystemFilePackage.PRINTER_FILE__PRINTER_FORMATS:
				return printerFormats != null && !printerFormats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrinterFileImpl
