/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.core.datetime.impl;

import org.asup.il.data.QIntegratedLanguageDataPackage;

import org.asup.os.core.QOperatingSystemCorePackage;

import org.asup.os.core.datetime.DateFormat;
import org.asup.os.core.datetime.QDatetimeFactory;
import org.asup.os.core.datetime.QDatetimePackage;
import org.asup.os.core.datetime.TimeFormat;

import org.asup.os.core.impl.OperatingSystemCorePackageImpl;

import org.asup.os.core.jobs.QOperatingSystemJobsPackage;

import org.asup.os.core.jobs.impl.OperatingSystemJobsPackageImpl;

import org.asup.os.core.output.QOperatingSystemOutputPackage;

import org.asup.os.core.output.impl.OperatingSystemOutputPackageImpl;

import org.asup.os.core.resources.QOperatingSystemResourcesPackage;

import org.asup.os.core.resources.impl.OperatingSystemResourcesPackageImpl;

import org.asup.os.omac.QOperatingSystemOmacPackage;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatetimePackageImpl extends EPackageImpl implements QDatetimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeFormatEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.asup.os.core.datetime.QDatetimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatetimePackageImpl() {
		super(eNS_URI, QDatetimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QDatetimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDatetimePackage init() {
		if (isInited) return (QDatetimePackage)EPackage.Registry.INSTANCE.getEPackage(QDatetimePackage.eNS_URI);

		// Obtain or create and register package
		DatetimePackageImpl theDatetimePackage = (DatetimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatetimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatetimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();
		QOperatingSystemOmacPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OperatingSystemCorePackageImpl theOperatingSystemCorePackage = (OperatingSystemCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI) instanceof OperatingSystemCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemCorePackage.eNS_URI) : QOperatingSystemCorePackage.eINSTANCE);
		OperatingSystemJobsPackageImpl theOperatingSystemJobsPackage = (OperatingSystemJobsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) instanceof OperatingSystemJobsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI) : QOperatingSystemJobsPackage.eINSTANCE);
		OperatingSystemOutputPackageImpl theOperatingSystemOutputPackage = (OperatingSystemOutputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOutputPackage.eNS_URI) instanceof OperatingSystemOutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemOutputPackage.eNS_URI) : QOperatingSystemOutputPackage.eINSTANCE);
		OperatingSystemResourcesPackageImpl theOperatingSystemResourcesPackage = (OperatingSystemResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemResourcesPackage.eNS_URI) instanceof OperatingSystemResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemResourcesPackage.eNS_URI) : QOperatingSystemResourcesPackage.eINSTANCE);

		// Create package meta-data objects
		theDatetimePackage.createPackageContents();
		theOperatingSystemCorePackage.createPackageContents();
		theOperatingSystemJobsPackage.createPackageContents();
		theOperatingSystemOutputPackage.createPackageContents();
		theOperatingSystemResourcesPackage.createPackageContents();

		// Initialize created meta-data
		theDatetimePackage.initializePackageContents();
		theOperatingSystemCorePackage.initializePackageContents();
		theOperatingSystemJobsPackage.initializePackageContents();
		theOperatingSystemOutputPackage.initializePackageContents();
		theOperatingSystemResourcesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatetimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDatetimePackage.eNS_URI, theDatetimePackage);
		return theDatetimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDateFormat() {
		return dateFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeFormat() {
		return timeFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatetimeFactory getDatetimeFactory() {
		return (QDatetimeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create enums
		dateFormatEEnum = createEEnum(DATE_FORMAT);
		timeFormatEEnum = createEEnum(TIME_FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(dateFormatEEnum, DateFormat.class, "DateFormat");
		addEEnumLiteral(dateFormatEEnum, DateFormat.MDY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.DMY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.YMD);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JUL);
		addEEnumLiteral(dateFormatEEnum, DateFormat.ISO);
		addEEnumLiteral(dateFormatEEnum, DateFormat.USA);
		addEEnumLiteral(dateFormatEEnum, DateFormat.EUR);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JIS);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JOBRUN);

		initEEnum(timeFormatEEnum, TimeFormat.class, "TimeFormat");
		addEEnumLiteral(timeFormatEEnum, TimeFormat.HMS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.ISO);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.USA);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.EUR);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JIS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JOBRUN);
	}

} //DatetimePackageImpl
