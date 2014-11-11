/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import org.asup.os.type.file.*;
import org.asup.os.type.file.FileType;
import org.asup.os.type.file.QDisplayFile;
import org.asup.os.type.file.QDisplayFileFormat;
import org.asup.os.type.file.QExternalFile;
import org.asup.os.type.file.QFileFormat;
import org.asup.os.type.file.QFileMember;
import org.asup.os.type.file.QFileMemberRow;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QOperatingSystemFileFactory;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.asup.os.type.file.QPhysicalFile;
import org.asup.os.type.file.QPrinterFile;
import org.asup.os.type.file.QPrinterFileFormat;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemFileFactoryImpl extends EFactoryImpl implements QOperatingSystemFileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemFileFactory init() {
		try {
			QOperatingSystemFileFactory theOperatingSystemFileFactory = (QOperatingSystemFileFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemFilePackage.eNS_URI);
			if (theOperatingSystemFileFactory != null) {
				return theOperatingSystemFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemFileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemFileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemFilePackage.DISPLAY_FILE: return (EObject)createDisplayFile();
			case QOperatingSystemFilePackage.DISPLAY_FILE_FORMAT: return (EObject)createDisplayFileFormat();
			case QOperatingSystemFilePackage.EXTERNAL_FILE: return (EObject)createExternalFile();
			case QOperatingSystemFilePackage.FILE_FORMAT: return (EObject)createFileFormat();
			case QOperatingSystemFilePackage.FILE_FORMAT_FIELD: return (EObject)createFileFormatField();
			case QOperatingSystemFilePackage.FILE_MEMBER: return (EObject)createFileMember();
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW: return (EObject)createFileMemberRow();
			case QOperatingSystemFilePackage.LOGICAL_FILE: return (EObject)createLogicalFile();
			case QOperatingSystemFilePackage.PHYSICAL_FILE: return (EObject)createPhysicalFile();
			case QOperatingSystemFilePackage.PRINTER_FILE: return (EObject)createPrinterFile();
			case QOperatingSystemFilePackage.PRINTER_FILE_FORMAT: return (EObject)createPrinterFileFormat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemFilePackage.FILE_TYPE:
				return createFileTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemFilePackage.FILE_TYPE:
				return convertFileTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDisplayFile createDisplayFile() {
		DisplayFileImpl displayFile = new DisplayFileImpl();
		return displayFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDisplayFileFormat createDisplayFileFormat() {
		DisplayFileFormatImpl displayFileFormat = new DisplayFileFormatImpl();
		return displayFileFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFileFormat createFileFormat() {
		FileFormatImpl fileFormat = new FileFormatImpl();
		return fileFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFileFormatField createFileFormatField() {
		FileFormatFieldImpl fileFormatField = new FileFormatFieldImpl();
		return fileFormatField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFileMember createFileMember() {
		FileMemberImpl fileMember = new FileMemberImpl();
		return fileMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFileMemberRow createFileMemberRow() {
		FileMemberRowImpl fileMemberRow = new FileMemberRowImpl();
		return fileMemberRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QLogicalFile createLogicalFile() {
		LogicalFileImpl logicalFile = new LogicalFileImpl();
		return logicalFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPhysicalFile createPhysicalFile() {
		PhysicalFileImpl physicalFile = new PhysicalFileImpl();
		return physicalFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPrinterFile createPrinterFile() {
		PrinterFileImpl printerFile = new PrinterFileImpl();
		return printerFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPrinterFileFormat createPrinterFileFormat() {
		PrinterFileFormatImpl printerFileFormat = new PrinterFileFormatImpl();
		return printerFileFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QExternalFile createExternalFile() {
		ExternalFileImpl externalFile = new ExternalFileImpl();
		return externalFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileTypeFromString(EDataType eDataType, String initialValue) {
		FileType result = FileType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemFilePackage getOperatingSystemFilePackage() {
		return (QOperatingSystemFilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemFilePackage getPackage() {
		return QOperatingSystemFilePackage.eINSTANCE;
	}

} //OSFileCoreFactoryImpl
