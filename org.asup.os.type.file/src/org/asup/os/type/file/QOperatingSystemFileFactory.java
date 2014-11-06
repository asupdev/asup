/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.os.type.file.QOperatingSystemFilePackage
 * @generated
 */
public interface QOperatingSystemFileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemFileFactory eINSTANCE = org.asup.os.type.file.impl.OperatingSystemFileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Display File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display File</em>'.
	 * @generated
	 */
	QDisplayFile createDisplayFile();

	/**
	 * Returns a new object of class '<em>Display File Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display File Format</em>'.
	 * @generated
	 */
	QDisplayFileFormat createDisplayFileFormat();

	/**
	 * Returns a new object of class '<em>File Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Format</em>'.
	 * @generated
	 */
	QFileFormat createFileFormat();

	/**
	 * Returns a new object of class '<em>File Format Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Format Field</em>'.
	 * @generated
	 */
	QFileFormatField createFileFormatField();

	/**
	 * Returns a new object of class '<em>File Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Member</em>'.
	 * @generated
	 */
	QFileMember createFileMember();

	/**
	 * Returns a new object of class '<em>File Member Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Member Row</em>'.
	 * @generated
	 */
	QFileMemberRow createFileMemberRow();

	/**
	 * Returns a new object of class '<em>Logical File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical File</em>'.
	 * @generated
	 */
	QLogicalFile createLogicalFile();

	/**
	 * Returns a new object of class '<em>Physical File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical File</em>'.
	 * @generated
	 */
	QPhysicalFile createPhysicalFile();

	/**
	 * Returns a new object of class '<em>Printer File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Printer File</em>'.
	 * @generated
	 */
	QPrinterFile createPrinterFile();

	/**
	 * Returns a new object of class '<em>Printer File Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Printer File Format</em>'.
	 * @generated
	 */
	QPrinterFileFormat createPrinterFileFormat();

	/**
	 * Returns a new object of class '<em>External File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External File</em>'.
	 * @generated
	 */
	QExternalFile createExternalFile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperatingSystemFilePackage getOperatingSystemFilePackage();

} //OSFileCoreFactory
