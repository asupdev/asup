/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.file.impl;

import org.asup.os.type.file.*;
import org.asup.os.type.file.QDatabaseFileField;
import org.asup.os.type.file.QDatabaseFileFormat;
import org.asup.os.type.file.QDisplayFile;
import org.asup.os.type.file.QDisplayFileField;
import org.asup.os.type.file.QDisplayFileFormat;
import org.asup.os.type.file.QExternalFile;
import org.asup.os.type.file.QFileMember;
import org.asup.os.type.file.QFileMemberRow;
import org.asup.os.type.file.QLogicalFile;
import org.asup.os.type.file.QOperatingSystemFileFactory;
import org.asup.os.type.file.QOperatingSystemFilePackage;
import org.asup.os.type.file.QPhysicalFile;
import org.asup.os.type.file.QPrinterFile;
import org.asup.os.type.file.QPrinterFileField;
import org.asup.os.type.file.QPrinterFileFormat;
import org.asup.os.type.file.QSourceFile;
import org.eclipse.emf.ecore.EClass;
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
			case QOperatingSystemFilePackage.DATABASE_FILE_FIELD: return (EObject)createDatabaseFileField();
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT: return (EObject)createDatabaseFileFormat();
			case QOperatingSystemFilePackage.DISPLAY_FILE: return (EObject)createDisplayFile();
			case QOperatingSystemFilePackage.DISPLAY_FILE_FIELD: return (EObject)createDisplayFileField();
			case QOperatingSystemFilePackage.DISPLAY_FILE_FORMAT: return (EObject)createDisplayFileFormat();
			case QOperatingSystemFilePackage.EXTERNAL_FILE: return (EObject)createExternalFile();
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY: return (EObject)createFileFormatKey();
			case QOperatingSystemFilePackage.FILE_MEMBER: return (EObject)createFileMember();
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW: return (EObject)createFileMemberRow();
			case QOperatingSystemFilePackage.LOGICAL_FILE: return (EObject)createLogicalFile();
			case QOperatingSystemFilePackage.PHYSICAL_FILE: return (EObject)createPhysicalFile();
			case QOperatingSystemFilePackage.PRINTER_FILE: return (EObject)createPrinterFile();
			case QOperatingSystemFilePackage.PRINTER_FILE_FORMAT: return (EObject)createPrinterFileFormat();
			case QOperatingSystemFilePackage.PRINTER_FILE_FIELD: return (EObject)createPrinterFileField();
			case QOperatingSystemFilePackage.SOURCE_FILE: return (EObject)createSourceFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseFileField createDatabaseFileField() {
		DatabaseFileFieldImpl databaseFileField = new DatabaseFileFieldImpl();
		return databaseFileField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseFileFormat createDatabaseFileFormat() {
		DatabaseFileFormatImpl databaseFileFormat = new DatabaseFileFormatImpl();
		return databaseFileFormat;
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
	public QDisplayFileField createDisplayFileField() {
		DisplayFileFieldImpl displayFileField = new DisplayFileFieldImpl();
		return displayFileField;
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
	public QPrinterFileField createPrinterFileField() {
		PrinterFileFieldImpl printerFileField = new PrinterFileFieldImpl();
		return printerFileField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSourceFile createSourceFile() {
		SourceFileImpl sourceFile = new SourceFileImpl();
		return sourceFile;
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
	public QFileFormatKey createFileFormatKey() {
		FileFormatKeyImpl fileFormatKey = new FileFormatKeyImpl();
		return fileFormatKey;
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
