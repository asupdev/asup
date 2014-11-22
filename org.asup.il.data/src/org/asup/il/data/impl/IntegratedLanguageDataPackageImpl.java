/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.fw.java.QFrameworkJavaPackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.data.BinaryType;
import org.asup.il.data.DataType;
import org.asup.il.data.DateFormat;
import org.asup.il.data.DatetimeType;
import org.asup.il.data.DecimalType;
import org.asup.il.data.FloatingType;
import org.asup.il.data.QAdapter;
import org.asup.il.data.QAdapterDef;
import org.asup.il.data.QArray;
import org.asup.il.data.QArrayDef;
import org.asup.il.data.QAtomicDataDef;
import org.asup.il.data.QAtomicDataTerm;
import org.asup.il.data.QBinary;
import org.asup.il.data.QBinaryDef;
import org.asup.il.data.QBoolean;
import org.asup.il.data.QBufferDef;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QBufferedDataDef;
import org.asup.il.data.QBufferedDataDelegator;
import org.asup.il.data.QBufferedDataTerm;
import org.asup.il.data.QBufferedList;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QCharacterDef;
import org.asup.il.data.QCompoundDataDef;
import org.asup.il.data.QCompoundDataTerm;
import org.asup.il.data.QData;
import org.asup.il.data.QDataContext;
import org.asup.il.data.QDataDef;
import org.asup.il.data.QDataDelegator;
import org.asup.il.data.QDataDictionary;
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDataStructDef;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QDataTermContainer;
import org.asup.il.data.QDataTermVisitor;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QDatetimeDef;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QDecimalDef;
import org.asup.il.data.QEnum;
import org.asup.il.data.QEnumDef;
import org.asup.il.data.QFloating;
import org.asup.il.data.QFloatingDef;
import org.asup.il.data.QGraphic;
import org.asup.il.data.QHexadecimal;
import org.asup.il.data.QHexadecimalDef;
import org.asup.il.data.QIdentifier;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QIndicatorDef;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.data.QList;
import org.asup.il.data.QListDef;
import org.asup.il.data.QMoveable;
import org.asup.il.data.QMultipleAtomicBufferedDataDef;
import org.asup.il.data.QMultipleAtomicDataDef;
import org.asup.il.data.QMultipleAtomicDataTerm;
import org.asup.il.data.QMultipleCompoundDataDef;
import org.asup.il.data.QMultipleCompoundDataTerm;
import org.asup.il.data.QMultipleDataDef;
import org.asup.il.data.QMultipleDataTerm;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QNumericDef;
import org.asup.il.data.QPointer;
import org.asup.il.data.QPointerDef;
import org.asup.il.data.QScroller;
import org.asup.il.data.QScrollerDef;
import org.asup.il.data.QString;
import org.asup.il.data.QStringDef;
import org.asup.il.data.QStroller;
import org.asup.il.data.QStrollerDef;
import org.asup.il.data.QStruct;
import org.asup.il.data.QUnaryAtomicBufferedDataDef;
import org.asup.il.data.QUnaryAtomicDataDef;
import org.asup.il.data.QUnaryAtomicDataTerm;
import org.asup.il.data.QUnaryCompoundDataDef;
import org.asup.il.data.QUnaryCompoundDataTerm;
import org.asup.il.data.QUnaryDataDef;
import org.asup.il.data.QUnaryDataTerm;
import org.asup.il.data.TimeFormat;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageDataPackageImpl extends EPackageImpl implements QIntegratedLanguageDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicDataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferedDataDelegatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferedDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferedDataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDelegatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDictionaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEvaluatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStructDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTermContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTermVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexadecimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexadecimalDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicatorDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleAtomicDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleAtomicBufferedDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleAtomicDataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleCompoundDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleCompoundDataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleDataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollerDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryAtomicDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryAtomicBufferedDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryAtomicDataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryCompoundDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryCompoundDataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryDataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundDataTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strollerDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datetimeTypeEEnum = null;

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
	private EEnum decimalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum floatingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataArrayEDataType = null;

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
	 * @see org.asup.il.data.QIntegratedLanguageDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageDataPackageImpl() {
		super(eNS_URI, QIntegratedLanguageDataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QIntegratedLanguageDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageDataPackage init() {
		if (isInited) return (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageDataPackageImpl theIntegratedLanguageDataPackage = (IntegratedLanguageDataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageDataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageDataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();
		QFrameworkCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageDataPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageDataPackage.eNS_URI, theIntegratedLanguageDataPackage);
		return theIntegratedLanguageDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapter() {
		return adapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapterDef() {
		return adapterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDef() {
		return arrayDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicDataDef() {
		return atomicDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicDataTerm() {
		return atomicDataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryDef() {
		return binaryDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryDef_Type() {
		return (EAttribute)binaryDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryDef_Unsigned() {
		return (EAttribute)binaryDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferedData() {
		return bufferedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferDef() {
		return bufferDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferedDataDelegator() {
		return bufferedDataDelegatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferedDataDef() {
		return bufferedDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferedDataTerm() {
		return bufferedDataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferedList() {
		return bufferedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter() {
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterDef() {
		return characterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterDef_Length() {
		return (EAttribute)characterDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterDef_Varying() {
		return (EAttribute)characterDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundDataDef() {
		return compoundDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundDataDef_ClassDelegator() {
		return (EAttribute)compoundDataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundDataDef_Elements() {
		return (EReference)compoundDataDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundDataDef_Prefix() {
		return (EAttribute)compoundDataDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundDataDef_Qualified() {
		return (EAttribute)compoundDataDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataContext() {
		return dataContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDef() {
		return dataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDef_Formulas() {
		return (EAttribute)dataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDelegator() {
		return dataDelegatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDictionary() {
		return dataDictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataEvaluator() {
		return dataEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFactory() {
		return dataFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataManager() {
		return dataManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStruct() {
		return dataStructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStructDef() {
		return dataStructDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataStructDef_Length() {
		return (EAttribute)dataStructDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTerm() {
		return dataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTerm_Constant() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTerm_Definition() {
		return (EReference)dataTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTerm_Initialized() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTerm_Like() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTerm_Name() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTerm_Restricted() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTerm_Text() {
		return (EAttribute)dataTermEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTermContainer() {
		return dataTermContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTermVisitor() {
		return dataTermVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataVisitor() {
		return dataVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatetime() {
		return datetimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatetimeDef() {
		return datetimeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeDef_Type() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeDef_Format() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimal() {
		return decimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalDef() {
		return decimalDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalDef_Precision() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalDef_Scale() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalDef_Type() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumDef() {
		return enumDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumDef_Delegate() {
		return (EReference)enumDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumDef_Klass() {
		return (EAttribute)enumDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloating() {
		return floatingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatingDef() {
		return floatingDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingDef_Type() {
		return (EAttribute)floatingDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphic() {
		return graphicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexadecimal() {
		return hexadecimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexadecimalDef() {
		return hexadecimalDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexadecimalDef_Length() {
		return (EAttribute)hexadecimalDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndicator() {
		return indicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndicatorDef() {
		return indicatorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveable() {
		return moveableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListDef() {
		return listDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListDef_Argument() {
		return (EReference)listDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleAtomicDataDef() {
		return multipleAtomicDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleAtomicBufferedDataDef() {
		return multipleAtomicBufferedDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleAtomicBufferedDataDef_Argument() {
		return (EReference)multipleAtomicBufferedDataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleAtomicDataTerm() {
		return multipleAtomicDataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleCompoundDataDef() {
		return multipleCompoundDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleCompoundDataTerm() {
		return multipleCompoundDataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleDataDef() {
		return multipleDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleDataDef_Dimension() {
		return (EAttribute)multipleDataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleDataTerm() {
		return multipleDataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleDataTerm_Default() {
		return (EAttribute)multipleDataTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumeric() {
		return numericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericDef() {
		return numericDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointer() {
		return pointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerDef() {
		return pointerDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScroller() {
		return scrollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollerDef() {
		return scrollerDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringDef() {
		return stringDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryAtomicDataDef() {
		return unaryAtomicDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryAtomicBufferedDataDef() {
		return unaryAtomicBufferedDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryAtomicDataTerm() {
		return unaryAtomicDataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryCompoundDataDef() {
		return unaryCompoundDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryCompoundDataTerm() {
		return unaryCompoundDataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryDataDef() {
		return unaryDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryDataTerm() {
		return unaryDataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryDataTerm_Default() {
		return (EAttribute)unaryDataTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryDataTerm_Mandatory() {
		return (EAttribute)unaryDataTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundDataTerm() {
		return compoundDataTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStroller() {
		return strollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrollerDef() {
		return strollerDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrollerDef_Length() {
		return (EAttribute)strollerDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryType() {
		return binaryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatetimeType() {
		return datetimeTypeEEnum;
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
	public EEnum getDecimalType() {
		return decimalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFloatingType() {
		return floatingTypeEEnum;
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
	public EDataType getDataArray() {
		return dataArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageDataFactory getIntegratedLanguageDataFactory() {
		return (QIntegratedLanguageDataFactory)getEFactoryInstance();
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

		// Create classes and their features
		adapterEClass = createEClass(ADAPTER);

		adapterDefEClass = createEClass(ADAPTER_DEF);

		arrayEClass = createEClass(ARRAY);

		arrayDefEClass = createEClass(ARRAY_DEF);

		atomicDataDefEClass = createEClass(ATOMIC_DATA_DEF);

		atomicDataTermEClass = createEClass(ATOMIC_DATA_TERM);

		binaryEClass = createEClass(BINARY);

		binaryDefEClass = createEClass(BINARY_DEF);
		createEAttribute(binaryDefEClass, BINARY_DEF__TYPE);
		createEAttribute(binaryDefEClass, BINARY_DEF__UNSIGNED);

		booleanEClass = createEClass(BOOLEAN);

		bufferedDataEClass = createEClass(BUFFERED_DATA);

		bufferDefEClass = createEClass(BUFFER_DEF);

		bufferedDataDelegatorEClass = createEClass(BUFFERED_DATA_DELEGATOR);

		bufferedDataTermEClass = createEClass(BUFFERED_DATA_TERM);

		bufferedDataDefEClass = createEClass(BUFFERED_DATA_DEF);

		bufferedListEClass = createEClass(BUFFERED_LIST);

		characterEClass = createEClass(CHARACTER);

		characterDefEClass = createEClass(CHARACTER_DEF);
		createEAttribute(characterDefEClass, CHARACTER_DEF__LENGTH);
		createEAttribute(characterDefEClass, CHARACTER_DEF__VARYING);

		compoundDataDefEClass = createEClass(COMPOUND_DATA_DEF);
		createEAttribute(compoundDataDefEClass, COMPOUND_DATA_DEF__CLASS_DELEGATOR);
		createEReference(compoundDataDefEClass, COMPOUND_DATA_DEF__ELEMENTS);
		createEAttribute(compoundDataDefEClass, COMPOUND_DATA_DEF__PREFIX);
		createEAttribute(compoundDataDefEClass, COMPOUND_DATA_DEF__QUALIFIED);

		compoundDataTermEClass = createEClass(COMPOUND_DATA_TERM);

		dataEClass = createEClass(DATA);

		dataContextEClass = createEClass(DATA_CONTEXT);

		dataDefEClass = createEClass(DATA_DEF);
		createEAttribute(dataDefEClass, DATA_DEF__FORMULAS);

		dataDelegatorEClass = createEClass(DATA_DELEGATOR);

		dataDictionaryEClass = createEClass(DATA_DICTIONARY);

		dataEvaluatorEClass = createEClass(DATA_EVALUATOR);

		dataFactoryEClass = createEClass(DATA_FACTORY);

		dataManagerEClass = createEClass(DATA_MANAGER);

		dataStructEClass = createEClass(DATA_STRUCT);

		dataStructDefEClass = createEClass(DATA_STRUCT_DEF);
		createEAttribute(dataStructDefEClass, DATA_STRUCT_DEF__LENGTH);

		dataTermEClass = createEClass(DATA_TERM);
		createEAttribute(dataTermEClass, DATA_TERM__CONSTANT);
		createEReference(dataTermEClass, DATA_TERM__DEFINITION);
		createEAttribute(dataTermEClass, DATA_TERM__INITIALIZED);
		createEAttribute(dataTermEClass, DATA_TERM__LIKE);
		createEAttribute(dataTermEClass, DATA_TERM__NAME);
		createEAttribute(dataTermEClass, DATA_TERM__RESTRICTED);
		createEAttribute(dataTermEClass, DATA_TERM__TEXT);

		dataTermContainerEClass = createEClass(DATA_TERM_CONTAINER);

		dataTermVisitorEClass = createEClass(DATA_TERM_VISITOR);

		dataVisitorEClass = createEClass(DATA_VISITOR);

		datetimeEClass = createEClass(DATETIME);

		datetimeDefEClass = createEClass(DATETIME_DEF);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__TYPE);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__FORMAT);

		decimalEClass = createEClass(DECIMAL);

		decimalDefEClass = createEClass(DECIMAL_DEF);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__PRECISION);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__SCALE);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__TYPE);

		enumEClass = createEClass(ENUM);

		enumDefEClass = createEClass(ENUM_DEF);
		createEReference(enumDefEClass, ENUM_DEF__DELEGATE);
		createEAttribute(enumDefEClass, ENUM_DEF__KLASS);

		floatingEClass = createEClass(FLOATING);

		floatingDefEClass = createEClass(FLOATING_DEF);
		createEAttribute(floatingDefEClass, FLOATING_DEF__TYPE);

		graphicEClass = createEClass(GRAPHIC);

		hexadecimalEClass = createEClass(HEXADECIMAL);

		hexadecimalDefEClass = createEClass(HEXADECIMAL_DEF);
		createEAttribute(hexadecimalDefEClass, HEXADECIMAL_DEF__LENGTH);

		identifierEClass = createEClass(IDENTIFIER);

		indicatorEClass = createEClass(INDICATOR);

		indicatorDefEClass = createEClass(INDICATOR_DEF);

		listEClass = createEClass(LIST);

		listDefEClass = createEClass(LIST_DEF);
		createEReference(listDefEClass, LIST_DEF__ARGUMENT);

		moveableEClass = createEClass(MOVEABLE);

		multipleAtomicDataDefEClass = createEClass(MULTIPLE_ATOMIC_DATA_DEF);

		multipleAtomicBufferedDataDefEClass = createEClass(MULTIPLE_ATOMIC_BUFFERED_DATA_DEF);
		createEReference(multipleAtomicBufferedDataDefEClass, MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT);

		multipleAtomicDataTermEClass = createEClass(MULTIPLE_ATOMIC_DATA_TERM);

		multipleCompoundDataDefEClass = createEClass(MULTIPLE_COMPOUND_DATA_DEF);

		multipleCompoundDataTermEClass = createEClass(MULTIPLE_COMPOUND_DATA_TERM);

		multipleDataDefEClass = createEClass(MULTIPLE_DATA_DEF);
		createEAttribute(multipleDataDefEClass, MULTIPLE_DATA_DEF__DIMENSION);

		multipleDataTermEClass = createEClass(MULTIPLE_DATA_TERM);
		createEAttribute(multipleDataTermEClass, MULTIPLE_DATA_TERM__DEFAULT);

		numericEClass = createEClass(NUMERIC);

		numericDefEClass = createEClass(NUMERIC_DEF);

		pointerEClass = createEClass(POINTER);

		pointerDefEClass = createEClass(POINTER_DEF);

		scrollerEClass = createEClass(SCROLLER);

		scrollerDefEClass = createEClass(SCROLLER_DEF);

		stringEClass = createEClass(STRING);

		stringDefEClass = createEClass(STRING_DEF);

		strollerEClass = createEClass(STROLLER);

		strollerDefEClass = createEClass(STROLLER_DEF);
		createEAttribute(strollerDefEClass, STROLLER_DEF__LENGTH);

		structEClass = createEClass(STRUCT);

		unaryAtomicDataDefEClass = createEClass(UNARY_ATOMIC_DATA_DEF);

		unaryAtomicBufferedDataDefEClass = createEClass(UNARY_ATOMIC_BUFFERED_DATA_DEF);

		unaryAtomicDataTermEClass = createEClass(UNARY_ATOMIC_DATA_TERM);

		unaryCompoundDataDefEClass = createEClass(UNARY_COMPOUND_DATA_DEF);

		unaryCompoundDataTermEClass = createEClass(UNARY_COMPOUND_DATA_TERM);

		unaryDataDefEClass = createEClass(UNARY_DATA_DEF);

		unaryDataTermEClass = createEClass(UNARY_DATA_TERM);
		createEAttribute(unaryDataTermEClass, UNARY_DATA_TERM__DEFAULT);
		createEAttribute(unaryDataTermEClass, UNARY_DATA_TERM__MANDATORY);

		// Create enums
		binaryTypeEEnum = createEEnum(BINARY_TYPE);
		dataTypeEEnum = createEEnum(DATA_TYPE);
		datetimeTypeEEnum = createEEnum(DATETIME_TYPE);
		dateFormatEEnum = createEEnum(DATE_FORMAT);
		decimalTypeEEnum = createEEnum(DECIMAL_TYPE);
		floatingTypeEEnum = createEEnum(FLOATING_TYPE);
		timeFormatEEnum = createEEnum(TIME_FORMAT);

		// Create data types
		dataArrayEDataType = createEDataType(DATA_ARRAY);
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

		// Obtain other dependent packages
		QFrameworkJavaPackage theFrameworkJavaPackage = (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QFrameworkCorePackage theFrameworkCorePackage = (QFrameworkCorePackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter arrayEClass_D = addETypeParameter(arrayEClass, "D");
		ETypeParameter arrayDefEClass_D = addETypeParameter(arrayDefEClass, "D");
		ETypeParameter atomicDataDefEClass_D = addETypeParameter(atomicDataDefEClass, "D");
		ETypeParameter atomicDataTermEClass_DD = addETypeParameter(atomicDataTermEClass, "DD");
		ETypeParameter bufferedDataTermEClass_DD = addETypeParameter(bufferedDataTermEClass, "DD");
		ETypeParameter bufferedDataDefEClass_D = addETypeParameter(bufferedDataDefEClass, "D");
		ETypeParameter bufferedListEClass_D = addETypeParameter(bufferedListEClass, "D");
		ETypeParameter compoundDataDefEClass_D = addETypeParameter(compoundDataDefEClass, "D");
		ETypeParameter compoundDataTermEClass_DD = addETypeParameter(compoundDataTermEClass, "DD");
		ETypeParameter dataDefEClass_D = addETypeParameter(dataDefEClass, "D");
		ETypeParameter dataDelegatorEClass_D = addETypeParameter(dataDelegatorEClass, "D");
		ETypeParameter dataTermEClass_DD = addETypeParameter(dataTermEClass, "DD");
		ETypeParameter enumEClass_E = addETypeParameter(enumEClass, "E");
		ETypeParameter enumEClass_D = addETypeParameter(enumEClass, "D");
		ETypeParameter enumDefEClass_E = addETypeParameter(enumDefEClass, "E");
		ETypeParameter enumDefEClass_D = addETypeParameter(enumDefEClass, "D");
		ETypeParameter listEClass_D = addETypeParameter(listEClass, "D");
		ETypeParameter listDefEClass_D = addETypeParameter(listDefEClass, "D");
		ETypeParameter multipleAtomicDataDefEClass_D = addETypeParameter(multipleAtomicDataDefEClass, "D");
		ETypeParameter multipleAtomicBufferedDataDefEClass_D = addETypeParameter(multipleAtomicBufferedDataDefEClass, "D");
		ETypeParameter multipleAtomicDataTermEClass_DD = addETypeParameter(multipleAtomicDataTermEClass, "DD");
		ETypeParameter multipleCompoundDataDefEClass_D = addETypeParameter(multipleCompoundDataDefEClass, "D");
		ETypeParameter multipleCompoundDataTermEClass_DD = addETypeParameter(multipleCompoundDataTermEClass, "DD");
		ETypeParameter multipleDataDefEClass_D = addETypeParameter(multipleDataDefEClass, "D");
		ETypeParameter multipleDataTermEClass_DD = addETypeParameter(multipleDataTermEClass, "DD");
		ETypeParameter scrollerEClass_D = addETypeParameter(scrollerEClass, "D");
		ETypeParameter scrollerDefEClass_D = addETypeParameter(scrollerDefEClass, "D");
		ETypeParameter strollerEClass_D = addETypeParameter(strollerEClass, "D");
		ETypeParameter strollerDefEClass_D = addETypeParameter(strollerDefEClass, "D");
		ETypeParameter structEClass_D = addETypeParameter(structEClass, "D");
		ETypeParameter unaryAtomicDataDefEClass_D = addETypeParameter(unaryAtomicDataDefEClass, "D");
		ETypeParameter unaryAtomicBufferedDataDefEClass_D = addETypeParameter(unaryAtomicBufferedDataDefEClass, "D");
		ETypeParameter unaryAtomicDataTermEClass_DD = addETypeParameter(unaryAtomicDataTermEClass, "DD");
		ETypeParameter unaryCompoundDataDefEClass_D = addETypeParameter(unaryCompoundDataDefEClass, "D");
		ETypeParameter unaryCompoundDataTermEClass_DD = addETypeParameter(unaryCompoundDataTermEClass, "DD");
		ETypeParameter unaryDataDefEClass_D = addETypeParameter(unaryDataDefEClass, "D");
		ETypeParameter unaryDataTermEClass_DD = addETypeParameter(unaryDataTermEClass, "DD");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getBufferedData());
		arrayEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getArray());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		arrayDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		atomicDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getAtomicDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		atomicDataTermEClass_DD.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		bufferedDataTermEClass_DD.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		bufferedDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		bufferedListEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getStruct());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		compoundDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getCompoundDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		compoundDataTermEClass_DD.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		dataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		dataDelegatorEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		dataTermEClass_DD.getEBounds().add(g1);
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		enumEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		enumEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		enumDefEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		enumDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		listEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		listDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleAtomicDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleAtomicBufferedDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getMultipleAtomicDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleAtomicDataTermEClass_DD.getEBounds().add(g1);
		g1 = createEGenericType(this.getStroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleCompoundDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getMultipleCompoundDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleCompoundDataTermEClass_DD.getEBounds().add(g1);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getMultipleDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleDataTermEClass_DD.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		scrollerEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getScroller());
		g2 = createEGenericType(this.getBufferedData());
		g1.getETypeArguments().add(g2);
		scrollerDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getDataStruct());
		strollerEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getStroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		strollerDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		structEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		unaryAtomicDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		unaryAtomicBufferedDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		unaryAtomicDataTermEClass_DD.getEBounds().add(g1);
		g1 = createEGenericType(this.getStruct());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		unaryCompoundDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getUnaryCompoundDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		unaryCompoundDataTermEClass_DD.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		unaryDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getUnaryDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		unaryDataTermEClass_DD.getEBounds().add(g1);

		// Add supertypes to classes
		adapterEClass.getESuperTypes().add(this.getData());
		adapterEClass.getESuperTypes().add(this.getBufferedDataDelegator());
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType(this.getAdapter());
		g1.getETypeArguments().add(g2);
		adapterDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedList());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		arrayEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleAtomicBufferedDataDef());
		g2 = createEGenericType(arrayDefEClass_D);
		g1.getETypeArguments().add(g2);
		arrayDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(atomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		atomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType(atomicDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		atomicDataTermEClass.getEGenericSuperTypes().add(g1);
		binaryEClass.getESuperTypes().add(this.getNumeric());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getBinary());
		g1.getETypeArguments().add(g2);
		binaryDefEClass.getEGenericSuperTypes().add(g1);
		booleanEClass.getESuperTypes().add(this.getData());
		bufferedDataEClass.getESuperTypes().add(this.getData());
		bufferedDataEClass.getESuperTypes().add(this.getMoveable());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getBufferedData());
		g1.getETypeArguments().add(g2);
		bufferDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDelegator());
		g2 = createEGenericType(this.getBufferedData());
		g1.getETypeArguments().add(g2);
		bufferedDataDelegatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType(bufferedDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		bufferedDataTermEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(bufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		bufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(bufferedListEClass_D);
		g1.getETypeArguments().add(g2);
		bufferedListEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		bufferedListEClass.getEGenericSuperTypes().add(g1);
		characterEClass.getESuperTypes().add(this.getString());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getCharacter());
		g1.getETypeArguments().add(g2);
		characterDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(compoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		compoundDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType(compoundDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		compoundDataTermEClass.getEGenericSuperTypes().add(g1);
		dataContextEClass.getESuperTypes().add(this.getDataTermContainer());
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getDictionary());
		g2 = createEGenericType(this.getDataTerm());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		dataDictionaryEClass.getEGenericSuperTypes().add(g1);
		dataEvaluatorEClass.getESuperTypes().add(this.getDataVisitor());
		dataManagerEClass.getESuperTypes().add(theFrameworkCorePackage.getService());
		g1 = createEGenericType(this.getString());
		dataStructEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStruct());
		g2 = createEGenericType(this.getBufferedData());
		g1.getETypeArguments().add(g2);
		dataStructEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryCompoundDataDef());
		g2 = createEGenericType(this.getDataStruct());
		g1.getETypeArguments().add(g2);
		dataStructDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(this.getDataStruct());
		g1.getETypeArguments().add(g2);
		dataStructDefEClass.getEGenericSuperTypes().add(g1);
		dataTermEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getTerm());
		g1 = createEGenericType(theIntegratedLanguageCorePackage.getTermContainer());
		g2 = createEGenericType(this.getDataTerm());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		dataTermContainerEClass.getEGenericSuperTypes().add(g1);
		datetimeEClass.getESuperTypes().add(this.getBufferedData());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getDatetime());
		g1.getETypeArguments().add(g2);
		datetimeDefEClass.getEGenericSuperTypes().add(g1);
		decimalEClass.getESuperTypes().add(this.getNumeric());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getDecimal());
		g1.getETypeArguments().add(g2);
		decimalDefEClass.getEGenericSuperTypes().add(g1);
		enumEClass.getESuperTypes().add(this.getBufferedData());
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType(enumDefEClass_D);
		g1.getETypeArguments().add(g2);
		enumDefEClass.getEGenericSuperTypes().add(g1);
		floatingEClass.getESuperTypes().add(this.getNumeric());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getFloating());
		g1.getETypeArguments().add(g2);
		floatingDefEClass.getEGenericSuperTypes().add(g1);
		graphicEClass.getESuperTypes().add(this.getString());
		hexadecimalEClass.getESuperTypes().add(this.getBufferedData());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getHexadecimal());
		g1.getETypeArguments().add(g2);
		hexadecimalDefEClass.getEGenericSuperTypes().add(g1);
		identifierEClass.getESuperTypes().add(this.getBufferedData());
		indicatorEClass.getESuperTypes().add(this.getString());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getIndicator());
		g1.getETypeArguments().add(g2);
		indicatorDefEClass.getEGenericSuperTypes().add(g1);
		listEClass.getESuperTypes().add(this.getData());
		g1 = createEGenericType(this.getMultipleAtomicDataDef());
		g2 = createEGenericType(listDefEClass_D);
		g1.getETypeArguments().add(g2);
		listDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleDataDef());
		g2 = createEGenericType(multipleAtomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleAtomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAtomicDataDef());
		g2 = createEGenericType(multipleAtomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleAtomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleAtomicDataDef());
		g2 = createEGenericType(multipleAtomicBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleAtomicBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(multipleAtomicBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleAtomicBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleDataTerm());
		g2 = createEGenericType(multipleAtomicDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		multipleAtomicDataTermEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAtomicDataTerm());
		g2 = createEGenericType(multipleAtomicDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		multipleAtomicDataTermEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleDataDef());
		g2 = createEGenericType(multipleCompoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleCompoundDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCompoundDataDef());
		g2 = createEGenericType(multipleCompoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleCompoundDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleDataTerm());
		g2 = createEGenericType(multipleCompoundDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		multipleCompoundDataTermEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCompoundDataTerm());
		g2 = createEGenericType(multipleCompoundDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		multipleCompoundDataTermEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(multipleDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType(multipleDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		multipleDataTermEClass.getEGenericSuperTypes().add(g1);
		numericEClass.getESuperTypes().add(this.getBufferedData());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getNumeric());
		g1.getETypeArguments().add(g2);
		numericDefEClass.getEGenericSuperTypes().add(g1);
		pointerEClass.getESuperTypes().add(this.getBufferedData());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getPointer());
		g1.getETypeArguments().add(g2);
		pointerDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedList());
		g2 = createEGenericType(scrollerEClass_D);
		g1.getETypeArguments().add(g2);
		scrollerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleAtomicBufferedDataDef());
		g2 = createEGenericType(scrollerDefEClass_D);
		g1.getETypeArguments().add(g2);
		scrollerDefEClass.getEGenericSuperTypes().add(g1);
		stringEClass.getESuperTypes().add(this.getBufferedData());
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(this.getString());
		g1.getETypeArguments().add(g2);
		stringDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getScroller());
		g2 = createEGenericType(strollerEClass_D);
		g1.getETypeArguments().add(g2);
		strollerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataStruct());
		strollerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleCompoundDataDef());
		g2 = createEGenericType(strollerDefEClass_D);
		g1.getETypeArguments().add(g2);
		strollerDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(strollerDefEClass_D);
		g1.getETypeArguments().add(g2);
		strollerDefEClass.getEGenericSuperTypes().add(g1);
		structEClass.getESuperTypes().add(this.getData());
		g1 = createEGenericType(this.getUnaryDataDef());
		g2 = createEGenericType(unaryAtomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryAtomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAtomicDataDef());
		g2 = createEGenericType(unaryAtomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryAtomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType(unaryAtomicBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryAtomicBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(unaryAtomicBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryAtomicBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryDataTerm());
		g2 = createEGenericType(unaryAtomicDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		unaryAtomicDataTermEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAtomicDataTerm());
		g2 = createEGenericType(unaryAtomicDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		unaryAtomicDataTermEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryDataDef());
		g2 = createEGenericType(unaryCompoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryCompoundDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCompoundDataDef());
		g2 = createEGenericType(unaryCompoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryCompoundDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryDataTerm());
		g2 = createEGenericType(unaryCompoundDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		unaryCompoundDataTermEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCompoundDataTerm());
		g2 = createEGenericType(unaryCompoundDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		unaryCompoundDataTermEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(unaryDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType(unaryDataTermEClass_DD);
		g1.getETypeArguments().add(g2);
		unaryDataTermEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(adapterEClass, QAdapter.class, "Adapter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(adapterEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdapter(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adapterEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adapterDefEClass, QAdapterDef.class, "AdapterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayEClass, QArray.class, "Array", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arrayEClass, this.getDataArray(), "asArray", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(arrayEClass, null, "sorta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arrayDefEClass, QArrayDef.class, "ArrayDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicDataDefEClass, QAtomicDataDef.class, "AtomicDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicDataTermEClass, QAtomicDataTerm.class, "AtomicDataTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryEClass, QBinary.class, "Binary", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryDefEClass, QBinaryDef.class, "BinaryDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryDef_Type(), this.getBinaryType(), "type", null, 1, 1, QBinaryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryDef_Unsigned(), ecorePackage.getEBoolean(), "unsigned", null, 0, 1, QBinaryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanEClass, QBoolean.class, "Boolean", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferedDataEClass, QBufferedData.class, "BufferedData", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(bufferedDataEClass, ecorePackage.getEByteArray(), "asBytes", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataEClass, ecorePackage.getEString(), "asString", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, null, "assign", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "isNull", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataEClass, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataEClass, ecorePackage.getEInt(), "size", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bufferDefEClass, QBufferDef.class, "BufferDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferedDataDelegatorEClass, QBufferedDataDelegator.class, "BufferedDataDelegator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(bufferedDataDelegatorEClass, this.getBufferedData(), "getDelegate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bufferedDataTermEClass, QBufferedDataTerm.class, "BufferedDataTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferedDataDefEClass, QBufferedDataDef.class, "BufferedDataDef", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(bufferedDataDefEClass, ecorePackage.getEInt(), "getLength", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bufferedListEClass, QBufferedList.class, "BufferedList", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterEClass, QCharacter.class, "Character", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterDefEClass, QCharacterDef.class, "CharacterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterDef_Length(), ecorePackage.getEInt(), "length", null, 1, 1, QCharacterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterDef_Varying(), ecorePackage.getEBoolean(), "varying", null, 0, 1, QCharacterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundDataDefEClass, QCompoundDataDef.class, "CompoundDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompoundDataDef_ClassDelegator(), ecorePackage.getEString(), "classDelegator", null, 0, 1, QCompoundDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getCompoundDataDef_Elements(), g1, null, "elements", null, 0, -1, QCompoundDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundDataDef_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, QCompoundDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundDataDef_Qualified(), ecorePackage.getEBoolean(), "qualified", null, 0, 1, QCompoundDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundDataTermEClass, QCompoundDataTerm.class, "CompoundDataTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEClass, QData.class, "Data", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataVisitor(), "visitor", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataEClass, null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataEClass, ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataContextEClass, QDataContext.class, "DataContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(dataContextEClass, null, "clearData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContextEClass, this.getData(), "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContextEClass, this.getData(), "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContextEClass, ecorePackage.getEBoolean(), "isSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContextEClass, ecorePackage.getEBoolean(), "isSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContextEClass, null, "resetData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContextEClass, null, "resetData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContextEClass, null, "resetData", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataDefEClass, QDataDef.class, "DataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDef_Formulas(), ecorePackage.getEString(), "formulas", null, 0, -1, QDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dataDefEClass, null, "getDataClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataDefEClass, null, "getJavaClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(dataDelegatorEClass, QDataDelegator.class, "DataDelegator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(dataDelegatorEClass, this.getData(), "getDelegate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataDictionaryEClass, QDataDictionary.class, "DataDictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEvaluatorEClass, QDataEvaluator.class, "DataEvaluator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataEvaluatorEClass, this.getDataEvaluator(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEvaluatorEClass, this.getDataEvaluator(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEvaluatorEClass, this.getDataEvaluator(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCorePackage.getSpecialElement(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEvaluatorEClass, this.getDataEvaluator(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataFactoryEClass, QDataFactory.class, "DataFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataFactoryEClass, null, "createArray", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getBufferedData());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "argument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "dimension", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getBinary(), "createBinary", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinaryType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "unsigned", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getCharacter(), "createCharacter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "varying", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, null, "createData", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getData());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataDef", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getData(), "createData", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, null, "createDataDef", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaAnnotation(), "annotations", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, null, "createDataStruct", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getDataStruct());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, null, "createDataStruct", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getDataStruct());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "classDelegator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getDatetime(), "createDate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetimeType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "format", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getDecimal(), "createDecimal", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "precision", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "scale", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimalType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, null, "createEnum", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		ETypeParameter t2 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getBufferedData());
		t2.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "classEnumerator", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t2);
		addEParameter(op, g1, "dataDelegate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEnum());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getFloating(), "createFloating", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFloatingType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getHexadecimal(), "createHexadecimal", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getIndicator(), "createIndicator", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getPointer(), "createPointer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, null, "createScroller", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getBufferedData());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getAtomicDataDef());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "argument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "dimension", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getScroller());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, null, "createStroller", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getDataStruct());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getCompoundDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "argument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "dimension", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStroller());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getDatetime(), "createTime", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getDatetime(), "createTimestamp", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataManagerEClass, QDataManager.class, "DataManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataManagerEClass, this.getDataContext(), "createContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerms", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataManagerEClass, this.getDataFactory(), "createFactory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkCorePackage.getContextID(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataManagerEClass, this.getDataDictionary(), "lookupDictionary", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataManagerEClass, null, "registerDictionary", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataDictionary(), "dictionary", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataManagerEClass, null, "validateContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataStructEClass, QDataStruct.class, "DataStruct", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataStructDefEClass, QDataStructDef.class, "DataStructDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataStructDef_Length(), ecorePackage.getEInt(), "length", null, 0, 1, QDataStructDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTermEClass, QDataTerm.class, "DataTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTerm_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(dataTermEClass_DD);
		initEReference(getDataTerm_Definition(), g1, null, "definition", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Initialized(), ecorePackage.getEBoolean(), "initialized", null, 1, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Like(), ecorePackage.getEString(), "like", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Name(), ecorePackage.getEString(), "name", null, 1, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Restricted(), ecorePackage.getEBoolean(), "restricted", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTerm_Text(), ecorePackage.getEString(), "text", null, 0, 1, QDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dataTermEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataTermVisitor(), "visitor", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataTermEClass, this.getDataType(), "getDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataTermContainerEClass, QDataTermContainer.class, "DataTermContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTermVisitorEClass, QDataTermVisitor.class, "DataTermVisitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataTermVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMultipleAtomicDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMultipleCompoundDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getUnaryAtomicDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getUnaryCompoundDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMultipleAtomicDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMultipleCompoundDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getUnaryAtomicDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataTermVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getUnaryCompoundDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataVisitorEClass, QDataVisitor.class, "DataVisitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getData(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdapter(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinary(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBoolean(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataStruct(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetime(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEnum());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFloating(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraphic(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIdentifier(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointer(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getScroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getData(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdapter(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinary(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBoolean(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataStruct(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetime(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEnum());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFloating(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraphic(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIdentifier(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointer(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getScroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datetimeEClass, QDatetime.class, "Datetime", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(datetimeEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(datetimeEClass, ecorePackage.getELong(), "getTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datetimeDefEClass, QDatetimeDef.class, "DatetimeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatetimeDef_Type(), this.getDatetimeType(), "type", null, 1, 1, QDatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeDef_Format(), ecorePackage.getEString(), "format", null, 0, 1, QDatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalEClass, QDecimal.class, "Decimal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(decimalEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(decimalEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(decimalDefEClass, QDecimalDef.class, "DecimalDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalDef_Precision(), ecorePackage.getEInt(), "precision", null, 1, 1, QDecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalDef_Scale(), ecorePackage.getEInt(), "scale", null, 0, 1, QDecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalDef_Type(), this.getDecimalType(), "type", null, 0, 1, QDecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumEClass, QEnum.class, "Enum", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(enumEClass, null, "asData", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(enumEClass_D);
		initEOperation(op, g1);

		op = addEOperation(enumEClass, null, "asEnum", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(enumEClass_E);
		initEOperation(op, g1);

		op = addEOperation(enumEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(enumEClass, ecorePackage.getEString(), "getSpecialName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumDefEClass, QEnumDef.class, "EnumDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(enumDefEClass_D);
		g1.getETypeArguments().add(g2);
		initEReference(getEnumDef_Delegate(), g1, null, "delegate", null, 1, 1, QEnumDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(enumDefEClass_E);
		g1.getETypeArguments().add(g2);
		initEAttribute(getEnumDef_Klass(), g1, "klass", null, 1, 1, QEnumDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatingEClass, QFloating.class, "Floating", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(floatingEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(floatingEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floatingDefEClass, QFloatingDef.class, "FloatingDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingDef_Type(), this.getFloatingType(), "type", null, 1, 1, QFloatingDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicEClass, QGraphic.class, "Graphic", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hexadecimalEClass, QHexadecimal.class, "Hexadecimal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hexadecimalEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(hexadecimalEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hexadecimalDefEClass, QHexadecimalDef.class, "HexadecimalDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexadecimalDef_Length(), ecorePackage.getEInt(), "length", null, 1, 1, QHexadecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, QIdentifier.class, "Identifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indicatorEClass, QIndicator.class, "Indicator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "asBoolean", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(indicatorDefEClass, QIndicatorDef.class, "IndicatorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listEClass, QList.class, "List", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(listEClass, ecorePackage.getEInt(), "capacity", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(listEClass, ecorePackage.getEInt(), "count", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(listEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listEClass, null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(listEClass_D);
		initEOperation(op, g1);

		op = addEOperation(listEClass, null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(listEClass_D);
		initEOperation(op, g1);

		op = addEOperation(listEClass, null, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(listEClass_D);
		addEParameter(op, g1, "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listEClass, null, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(listEClass_D);
		addEParameter(op, g1, "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listDefEClass, QListDef.class, "ListDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getListDef_Argument(), g1, null, "argument", null, 1, 1, QListDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveableEClass, QMoveable.class, "Moveable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataEvaluator(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(multipleAtomicDataDefEClass, QMultipleAtomicDataDef.class, "MultipleAtomicDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(multipleAtomicDataDefEClass, null, "getArgument", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(multipleAtomicBufferedDataDefEClass, QMultipleAtomicBufferedDataDef.class, "MultipleAtomicBufferedDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMultipleAtomicBufferedDataDef_Argument(), g1, null, "argument", null, 1, 1, QMultipleAtomicBufferedDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleAtomicDataTermEClass, QMultipleAtomicDataTerm.class, "MultipleAtomicDataTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleCompoundDataDefEClass, QMultipleCompoundDataDef.class, "MultipleCompoundDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleCompoundDataTermEClass, QMultipleCompoundDataTerm.class, "MultipleCompoundDataTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleDataDefEClass, QMultipleDataDef.class, "MultipleDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleDataDef_Dimension(), ecorePackage.getEInt(), "dimension", null, 1, 1, QMultipleDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleDataTermEClass, QMultipleDataTerm.class, "MultipleDataTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleDataTerm_Default(), ecorePackage.getEString(), "default", null, 0, -1, QMultipleDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(multipleDataTermEClass, theIntegratedLanguageCorePackage.getCardinality(), "getCardinality", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numericEClass, QNumeric.class, "Numeric", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(numericEClass, ecorePackage.getEDouble(), "asDouble", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getEInt(), "asInteger", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getELong(), "asLong", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getEShort(), "asShort", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getEBoolean(), "isSigned", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theFrameworkJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numericDefEClass, QNumericDef.class, "NumericDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointerEClass, QPointer.class, "Pointer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(pointerEClass, this.getPointer(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pointerDefEClass, QPointerDef.class, "PointerDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scrollerEClass, QScroller.class, "Scroller", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(scrollerEClass, null, "absolute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "current", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "first", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "last", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "next", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "previous", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		initEClass(scrollerDefEClass, QScrollerDef.class, "ScrollerDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEClass, QString.class, "String", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFrameworkJavaPackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, null, "in", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, null, "out", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, ecorePackage.getEString(), "trim", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, ecorePackage.getEString(), "trimL", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, ecorePackage.getEString(), "trimR", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringDefEClass, QStringDef.class, "StringDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strollerEClass, QStroller.class, "Stroller", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strollerDefEClass, QStrollerDef.class, "StrollerDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrollerDef_Length(), ecorePackage.getEInt(), "length", null, 0, 1, QStrollerDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structEClass, QStruct.class, "Struct", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(structEClass, null, "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(structEClass_D);
		initEOperation(op, g1);

		op = addEOperation(structEClass, null, "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(structEClass_D);
		initEOperation(op, g1);

		op = addEOperation(structEClass, null, "getElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(structEClass_D);
		initEOperation(op, g1);

		initEClass(unaryAtomicDataDefEClass, QUnaryAtomicDataDef.class, "UnaryAtomicDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryAtomicBufferedDataDefEClass, QUnaryAtomicBufferedDataDef.class, "UnaryAtomicBufferedDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryAtomicDataTermEClass, QUnaryAtomicDataTerm.class, "UnaryAtomicDataTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(unaryAtomicDataTermEClass, ecorePackage.getEBoolean(), "isRestricted", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unaryCompoundDataDefEClass, QUnaryCompoundDataDef.class, "UnaryCompoundDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryCompoundDataTermEClass, QUnaryCompoundDataTerm.class, "UnaryCompoundDataTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(unaryCompoundDataTermEClass, ecorePackage.getEBoolean(), "isQualified", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unaryDataDefEClass, QUnaryDataDef.class, "UnaryDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryDataTermEClass, QUnaryDataTerm.class, "UnaryDataTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryDataTerm_Default(), ecorePackage.getEString(), "default", null, 0, 1, QUnaryDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryDataTerm_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 1, 1, QUnaryDataTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryTypeEEnum, BinaryType.class, "BinaryType");
		addEEnumLiteral(binaryTypeEEnum, BinaryType.BYTE);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.SHORT);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.INTEGER);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.LONG);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.UNARY_ATOMIC);
		addEEnumLiteral(dataTypeEEnum, DataType.UNARY_COMPOUND);
		addEEnumLiteral(dataTypeEEnum, DataType.MULTIPLE_ATOMIC);
		addEEnumLiteral(dataTypeEEnum, DataType.MULTIPLE_COMPOUND);

		initEEnum(datetimeTypeEEnum, DatetimeType.class, "DatetimeType");
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.DATE);
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.TIME);
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.TIME_STAMP);

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

		initEEnum(decimalTypeEEnum, DecimalType.class, "DecimalType");
		addEEnumLiteral(decimalTypeEEnum, DecimalType.ZONED);
		addEEnumLiteral(decimalTypeEEnum, DecimalType.PACKED);

		initEEnum(floatingTypeEEnum, FloatingType.class, "FloatingType");
		addEEnumLiteral(floatingTypeEEnum, FloatingType.SINGLE);
		addEEnumLiteral(floatingTypeEEnum, FloatingType.DOUBLE);

		initEEnum(timeFormatEEnum, TimeFormat.class, "TimeFormat");
		addEEnumLiteral(timeFormatEEnum, TimeFormat.HMS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.ISO);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.USA);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.EUR);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JIS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JOBRUN);

		// Initialize data types
		initEDataType(dataArrayEDataType, Object[].class, "DataArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegratedLanguageDataPackageImpl
