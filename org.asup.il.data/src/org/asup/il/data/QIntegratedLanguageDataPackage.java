/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.String;
import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.il.data.QIntegratedLanguageDataFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/il/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageDataPackage eINSTANCE = org.asup.il.data.impl.IntegratedLanguageDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataDefImpl <em>Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDef()
	 * @generated
	 */
	int DATA_DEF = 21;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QBufferedDataDef <em>Buffered Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QBufferedDataDef
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedDataDef()
	 * @generated
	 */
	int BUFFERED_DATA_DEF = 13;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.ArrayDefImpl <em>Array Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.ArrayDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getArrayDef()
	 * @generated
	 */
	int ARRAY_DEF = 3;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QData <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QData
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getData()
	 * @generated
	 */
	int DATA = 19;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QBufferedData <em>Buffered Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QBufferedData
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedData()
	 * @generated
	 */
	int BUFFERED_DATA = 9;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QNumeric <em>Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QNumeric
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 58;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QBinary <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QBinary
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 6;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataTermImpl <em>Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataTerm()
	 * @generated
	 */
	int DATA_TERM = 29;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.BufferedDataTermImpl <em>Buffered Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.BufferedDataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedDataTerm()
	 * @generated
	 */
	int BUFFERED_DATA_TERM = 12;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.BinaryDefImpl <em>Binary Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.BinaryDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBinaryDef()
	 * @generated
	 */
	int BINARY_DEF = 7;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QBoolean <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QBoolean
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 8;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QString <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QString
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getString()
	 * @generated
	 */
	int STRING = 64;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QCharacter <em>Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QCharacter
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 15;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.CharacterDefImpl <em>Character Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.CharacterDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getCharacterDef()
	 * @generated
	 */
	int CHARACTER_DEF = 16;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataDictionaryImpl <em>Data Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataDictionaryImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDictionary()
	 * @generated
	 */
	int DATA_DICTIONARY = 23;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QDataFactory <em>Data Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QDataFactory
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataFactory()
	 * @generated
	 */
	int DATA_FACTORY = 24;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QDataManager <em>Data Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QDataManager
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataManager()
	 * @generated
	 */
	int DATA_MANAGER = 25;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataTermContainerImpl <em>Data Term Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataTermContainerImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataTermContainer()
	 * @generated
	 */
	int DATA_TERM_CONTAINER = 30;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QDatetime <em>Datetime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QDatetime
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDatetime()
	 * @generated
	 */
	int DATETIME = 34;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DatetimeDefImpl <em>Datetime Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DatetimeDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDatetimeDef()
	 * @generated
	 */
	int DATETIME_DEF = 35;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QDecimal <em>Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QDecimal
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 36;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DecimalDefImpl <em>Decimal Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DecimalDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDecimalDef()
	 * @generated
	 */
	int DECIMAL_DEF = 37;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QEnum <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QEnum
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 38;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QFloating <em>Floating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QFloating
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getFloating()
	 * @generated
	 */
	int FLOATING = 40;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.FloatingDefImpl <em>Floating Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.FloatingDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getFloatingDef()
	 * @generated
	 */
	int FLOATING_DEF = 41;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QGraphic <em>Graphic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QGraphic
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getGraphic()
	 * @generated
	 */
	int GRAPHIC = 42;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QHexadecimal <em>Hexadecimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QHexadecimal
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getHexadecimal()
	 * @generated
	 */
	int HEXADECIMAL = 43;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.HexadecimalDefImpl <em>Hexadecimal Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.HexadecimalDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getHexadecimalDef()
	 * @generated
	 */
	int HEXADECIMAL_DEF = 44;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QIdentifier <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QIdentifier
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 45;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QIndicator <em>Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QIndicator
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getIndicator()
	 * @generated
	 */
	int INDICATOR = 46;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.IndicatorDefImpl <em>Indicator Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.IndicatorDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getIndicatorDef()
	 * @generated
	 */
	int INDICATOR_DEF = 47;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QMoveable <em>Moveable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QMoveable
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMoveable()
	 * @generated
	 */
	int MOVEABLE = 50;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QList <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QList
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getList()
	 * @generated
	 */
	int LIST = 48;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QArray <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QArray
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QAdapter <em>Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QAdapter
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getAdapter()
	 * @generated
	 */
	int ADAPTER = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.MultipleDataDefImpl <em>Multiple Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.MultipleDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleDataDef()
	 * @generated
	 */
	int MULTIPLE_DATA_DEF = 56;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.MultipleAtomicDataDefImpl <em>Multiple Atomic Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.MultipleAtomicDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleAtomicDataDef()
	 * @generated
	 */
	int MULTIPLE_ATOMIC_DATA_DEF = 51;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.AtomicDataDefImpl <em>Atomic Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.AtomicDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getAtomicDataDef()
	 * @generated
	 */
	int ATOMIC_DATA_DEF = 4;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.UnaryDataTermImpl <em>Unary Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.UnaryDataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryDataTerm()
	 * @generated
	 */
	int UNARY_DATA_TERM = 75;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.UnaryAtomicDataTermImpl <em>Unary Atomic Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.UnaryAtomicDataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryAtomicDataTerm()
	 * @generated
	 */
	int UNARY_ATOMIC_DATA_TERM = 71;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.UnaryCompoundDataTermImpl <em>Unary Compound Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.UnaryCompoundDataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryCompoundDataTerm()
	 * @generated
	 */
	int UNARY_COMPOUND_DATA_TERM = 73;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.UnaryDataDefImpl <em>Unary Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.UnaryDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryDataDef()
	 * @generated
	 */
	int UNARY_DATA_DEF = 74;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.UnaryAtomicDataDefImpl <em>Unary Atomic Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.UnaryAtomicDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryAtomicDataDef()
	 * @generated
	 */
	int UNARY_ATOMIC_DATA_DEF = 69;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.AtomicDataTermImpl <em>Atomic Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.AtomicDataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getAtomicDataTerm()
	 * @generated
	 */
	int ATOMIC_DATA_TERM = 5;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.AdapterDefImpl <em>Adapter Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.AdapterDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getAdapterDef()
	 * @generated
	 */
	int ADAPTER_DEF = 1;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QBufferedList <em>Buffered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QBufferedList
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedList()
	 * @generated
	 */
	int BUFFERED_LIST = 14;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.MultipleAtomicBufferedDataDefImpl <em>Multiple Atomic Buffered Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.MultipleAtomicBufferedDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleAtomicBufferedDataDef()
	 * @generated
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF = 52;

	/**
	 * The number of structural features of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__FORMULAS = 0;

	/**
	 * The number of structural features of the '<em>Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Unary Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_DEF__FORMULAS = UNARY_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Unary Atomic Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT = UNARY_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DEF__FORMULAS = UNARY_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Adapter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DEF_FEATURE_COUNT = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buffered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = BUFFERED_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_DEF__DIMENSION = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_DEF__FORMULAS = MULTIPLE_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_DEF__DIMENSION = MULTIPLE_DATA_DEF__DIMENSION;

	/**
	 * The number of structural features of the '<em>Multiple Atomic Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT = MULTIPLE_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__FORMULAS = MULTIPLE_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__DIMENSION = MULTIPLE_ATOMIC_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT = MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Atomic Buffered Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT = MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__FORMULAS = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__DIMENSION = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__ARGUMENT = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT;

	/**
	 * The number of structural features of the '<em>Array Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF_FEATURE_COUNT = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Atomic Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__FACETS = QIntegratedLanguageCorePackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__CONSTANT = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__DEFINITION = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__INITIALIZED = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__LIKE = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__NAME = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__RESTRICTED = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__TEXT = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM_FEATURE_COUNT = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_TERM__FACETS = DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_TERM__CONSTANT = DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_TERM__DEFINITION = DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_TERM__INITIALIZED = DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_TERM__LIKE = DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_TERM__NAME = DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_TERM__RESTRICTED = DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_TERM__TEXT = DATA_TERM__TEXT;

	/**
	 * The number of structural features of the '<em>Atomic Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_TERM_FEATURE_COUNT = DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buffered Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.CompoundDataDefImpl <em>Compound Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.CompoundDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getCompoundDataDef()
	 * @generated
	 */
	int COMPOUND_DATA_DEF = 17;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataStructDefImpl <em>Data Struct Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataStructDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataStructDef()
	 * @generated
	 */
	int DATA_STRUCT_DEF = 28;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QPointer <em>Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QPointer
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getPointer()
	 * @generated
	 */
	int POINTER = 60;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.PointerDefImpl <em>Pointer Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.PointerDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getPointerDef()
	 * @generated
	 */
	int POINTER_DEF = 61;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QScroller <em>Scroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QScroller
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getScroller()
	 * @generated
	 */
	int SCROLLER = 62;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.ScrollerDefImpl <em>Scroller Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.ScrollerDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getScrollerDef()
	 * @generated
	 */
	int SCROLLER_DEF = 63;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QStruct <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QStruct
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 68;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QStroller <em>Stroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QStroller
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getStroller()
	 * @generated
	 */
	int STROLLER = 66;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QDataStruct <em>Data Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QDataStruct
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataStruct()
	 * @generated
	 */
	int DATA_STRUCT = 27;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.MultipleDataTermImpl <em>Multiple Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.MultipleDataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleDataTerm()
	 * @generated
	 */
	int MULTIPLE_DATA_TERM = 57;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.CompoundDataTermImpl <em>Compound Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.CompoundDataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getCompoundDataTerm()
	 * @generated
	 */
	int COMPOUND_DATA_TERM = 18;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QDataDelegator <em>Data Delegator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QDataDelegator
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDelegator()
	 * @generated
	 */
	int DATA_DELEGATOR = 22;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.UnaryCompoundDataDefImpl <em>Unary Compound Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.UnaryCompoundDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryCompoundDataDef()
	 * @generated
	 */
	int UNARY_COMPOUND_DATA_DEF = 72;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.MultipleCompoundDataDefImpl <em>Multiple Compound Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.MultipleCompoundDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleCompoundDataDef()
	 * @generated
	 */
	int MULTIPLE_COMPOUND_DATA_DEF = 54;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.MultipleAtomicDataTermImpl <em>Multiple Atomic Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.MultipleAtomicDataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleAtomicDataTerm()
	 * @generated
	 */
	int MULTIPLE_ATOMIC_DATA_TERM = 53;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.MultipleCompoundDataTermImpl <em>Multiple Compound Data Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.MultipleCompoundDataTermImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleCompoundDataTerm()
	 * @generated
	 */
	int MULTIPLE_COMPOUND_DATA_TERM = 55;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.StrollerDefImpl <em>Stroller Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.StrollerDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getStrollerDef()
	 * @generated
	 */
	int STROLLER_DEF = 67;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataTermVisitorImpl <em>Data Term Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataTermVisitorImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataTermVisitor()
	 * @generated
	 */
	int DATA_TERM_VISITOR = 31;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataVisitorImpl <em>Data Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataVisitorImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataVisitor()
	 * @generated
	 */
	int DATA_VISITOR = 32;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.EnumDefImpl <em>Enum Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.EnumDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getEnumDef()
	 * @generated
	 */
	int ENUM_DEF = 39;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.NumericDefImpl <em>Numeric Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.NumericDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getNumericDef()
	 * @generated
	 */
	int NUMERIC_DEF = 59;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.StringDefImpl <em>String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.StringDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getStringDef()
	 * @generated
	 */
	int STRING_DEF = 65;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.UnaryAtomicBufferedDataDefImpl <em>Unary Atomic Buffered Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.UnaryAtomicBufferedDataDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryAtomicBufferedDataDef()
	 * @generated
	 */
	int UNARY_ATOMIC_BUFFERED_DATA_DEF = 70;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS = UNARY_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Unary Atomic Buffered Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__TYPE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unsigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__UNSIGNED = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.BufferDefImpl <em>Buffer Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.BufferDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferDef()
	 * @generated
	 */
	int BUFFER_DEF = 10;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Buffer Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Delegator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DELEGATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.data.QBufferedDataDelegator <em>Buffered Data Delegator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.QBufferedDataDelegator
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedDataDelegator()
	 * @generated
	 */
	int BUFFERED_DATA_DELEGATOR = 11;

	/**
	 * The number of structural features of the '<em>Buffered Data Delegator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_DELEGATOR_FEATURE_COUNT = DATA_DELEGATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_TERM__FACETS = DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_TERM__CONSTANT = DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_TERM__DEFINITION = DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_TERM__INITIALIZED = DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_TERM__LIKE = DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_TERM__NAME = DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_TERM__RESTRICTED = DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_TERM__TEXT = DATA_TERM__TEXT;

	/**
	 * The number of structural features of the '<em>Buffered Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_TERM_FEATURE_COUNT = DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Buffered Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__LENGTH = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Varying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__VARYING = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__CLASS_DELEGATOR = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__ELEMENTS = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__PREFIX = DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__QUALIFIED = DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Compound Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_TERM__FACETS = DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_TERM__CONSTANT = DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_TERM__DEFINITION = DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_TERM__INITIALIZED = DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_TERM__LIKE = DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_TERM__NAME = DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_TERM__RESTRICTED = DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_TERM__TEXT = DATA_TERM__TEXT;

	/**
	 * The number of structural features of the '<em>Compound Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_TERM_FEATURE_COUNT = DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Term Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM_CONTAINER_FEATURE_COUNT = QIntegratedLanguageCorePackage.TERM_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataContainerImpl <em>Data Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataContainerImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataContainer()
	 * @generated
	 */
	int DATA_CONTAINER = 20;

	/**
	 * The number of structural features of the '<em>Data Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER_FEATURE_COUNT = DATA_TERM_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__NAME = QIntegratedLanguageCorePackage.DICTIONARY__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__TEXT = QIntegratedLanguageCorePackage.DICTIONARY__TEXT;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__VENDOR = QIntegratedLanguageCorePackage.DICTIONARY__VENDOR;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__URI = QIntegratedLanguageCorePackage.DICTIONARY__URI;

	/**
	 * The number of structural features of the '<em>Data Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY_FEATURE_COUNT = QIntegratedLanguageCorePackage.DICTIONARY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataReaderImpl <em>Data Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataReaderImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataReader()
	 * @generated
	 */
	int DATA_READER = 26;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.DataWriterImpl <em>Data Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.DataWriterImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataWriter()
	 * @generated
	 */
	int DATA_WRITER = 33;

	/**
	 * The number of structural features of the '<em>Data Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Data Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Data Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_READER_FEATURE_COUNT = DATA_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__FORMULAS = UNARY_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR = UNARY_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__ELEMENTS = UNARY_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__PREFIX = UNARY_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__QUALIFIED = UNARY_DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unary Compound Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF_FEATURE_COUNT = UNARY_DATA_DEF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__FORMULAS = UNARY_COMPOUND_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__CLASS_DELEGATOR = UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__ELEMENTS = UNARY_COMPOUND_DATA_DEF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__PREFIX = UNARY_COMPOUND_DATA_DEF__PREFIX;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__QUALIFIED = UNARY_COMPOUND_DATA_DEF__QUALIFIED;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__LENGTH = UNARY_COMPOUND_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Struct Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF_FEATURE_COUNT = UNARY_COMPOUND_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Term Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Data Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WRITER_FEATURE_COUNT = DATA_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datetime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__TYPE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__FORMAT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datetime Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__PRECISION = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__SCALE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__TYPE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decimal Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__FORMULAS = UNARY_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__DELEGATE = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Klass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__KLASS = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF_FEATURE_COUNT = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Floating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF__TYPE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floating Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hexadecimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_DEF__LENGTH = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hexadecimal Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Indicator Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.data.impl.ListDefImpl <em>List Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.ListDefImpl
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getListDef()
	 * @generated
	 */
	int LIST_DEF = 49;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DEF__FORMULAS = MULTIPLE_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DEF__DIMENSION = MULTIPLE_ATOMIC_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DEF__ARGUMENT = MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DEF_FEATURE_COUNT = MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Moveable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM__FACETS = DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM__CONSTANT = DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM__DEFINITION = DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM__INITIALIZED = DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM__LIKE = DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM__NAME = DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM__RESTRICTED = DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM__TEXT = DATA_TERM__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM__DEFAULT = DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_TERM_FEATURE_COUNT = DATA_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM__FACETS = MULTIPLE_DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM__CONSTANT = MULTIPLE_DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM__DEFINITION = MULTIPLE_DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM__INITIALIZED = MULTIPLE_DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM__LIKE = MULTIPLE_DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM__NAME = MULTIPLE_DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM__RESTRICTED = MULTIPLE_DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM__TEXT = MULTIPLE_DATA_TERM__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM__DEFAULT = MULTIPLE_DATA_TERM__DEFAULT;

	/**
	 * The number of structural features of the '<em>Multiple Atomic Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_TERM_FEATURE_COUNT = MULTIPLE_DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__FORMULAS = MULTIPLE_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__DIMENSION = MULTIPLE_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR = MULTIPLE_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS = MULTIPLE_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__PREFIX = MULTIPLE_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED = MULTIPLE_DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multiple Compound Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF_FEATURE_COUNT = MULTIPLE_DATA_DEF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM__FACETS = MULTIPLE_DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM__CONSTANT = MULTIPLE_DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM__DEFINITION = MULTIPLE_DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM__INITIALIZED = MULTIPLE_DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM__LIKE = MULTIPLE_DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM__NAME = MULTIPLE_DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM__RESTRICTED = MULTIPLE_DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM__TEXT = MULTIPLE_DATA_TERM__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM__DEFAULT = MULTIPLE_DATA_TERM__DEFAULT;

	/**
	 * The number of structural features of the '<em>Multiple Compound Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_TERM_FEATURE_COUNT = MULTIPLE_DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Numeric Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Pointer Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER_FEATURE_COUNT = BUFFERED_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER_DEF__FORMULAS = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER_DEF__DIMENSION = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER_DEF__ARGUMENT = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT;

	/**
	 * The number of structural features of the '<em>Scroller Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER_DEF_FEATURE_COUNT = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>String Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_FEATURE_COUNT = SCROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__FORMULAS = MULTIPLE_COMPOUND_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__DIMENSION = MULTIPLE_COMPOUND_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__CLASS_DELEGATOR = MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__ELEMENTS = MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__PREFIX = MULTIPLE_COMPOUND_DATA_DEF__PREFIX;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__QUALIFIED = MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__LENGTH = MULTIPLE_COMPOUND_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stroller Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF_FEATURE_COUNT = MULTIPLE_COMPOUND_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__FACETS = DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__CONSTANT = DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__DEFINITION = DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__INITIALIZED = DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__LIKE = DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__NAME = DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__RESTRICTED = DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__TEXT = DATA_TERM__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__DEFAULT = DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM__MANDATORY = DATA_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_TERM_FEATURE_COUNT = DATA_TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__FACETS = UNARY_DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__CONSTANT = UNARY_DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__DEFINITION = UNARY_DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__INITIALIZED = UNARY_DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__LIKE = UNARY_DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__NAME = UNARY_DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__RESTRICTED = UNARY_DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__TEXT = UNARY_DATA_TERM__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__DEFAULT = UNARY_DATA_TERM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM__MANDATORY = UNARY_DATA_TERM__MANDATORY;

	/**
	 * The number of structural features of the '<em>Unary Atomic Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_TERM_FEATURE_COUNT = UNARY_DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__FACETS = UNARY_DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__CONSTANT = UNARY_DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__DEFINITION = UNARY_DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__INITIALIZED = UNARY_DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__LIKE = UNARY_DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__NAME = UNARY_DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__RESTRICTED = UNARY_DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__TEXT = UNARY_DATA_TERM__TEXT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__DEFAULT = UNARY_DATA_TERM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM__MANDATORY = UNARY_DATA_TERM__MANDATORY;

	/**
	 * The number of structural features of the '<em>Unary Compound Data Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_TERM_FEATURE_COUNT = UNARY_DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.data.BinaryType <em>Binary Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.BinaryType
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 76;

	/**
	 * The meta object id for the '{@link org.asup.il.data.DataDefType <em>Data Def Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.DataDefType
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDefType()
	 * @generated
	 */
	int DATA_DEF_TYPE = 77;

	/**
	 * The meta object id for the '{@link org.asup.il.data.DataTermType <em>Data Term Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.DataTermType
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataTermType()
	 * @generated
	 */
	int DATA_TERM_TYPE = 78;

	/**
	 * The meta object id for the '{@link org.asup.il.data.DatetimeType <em>Datetime Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.DatetimeType
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDatetimeType()
	 * @generated
	 */
	int DATETIME_TYPE = 79;

	/**
	 * The meta object id for the '{@link org.asup.il.data.DateFormat <em>Date Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.DateFormat
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDateFormat()
	 * @generated
	 */
	int DATE_FORMAT = 80;

	/**
	 * The meta object id for the '{@link org.asup.il.data.DecimalType <em>Decimal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.DecimalType
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDecimalType()
	 * @generated
	 */
	int DECIMAL_TYPE = 81;

	/**
	 * The meta object id for the '{@link org.asup.il.data.FloatingType <em>Floating Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.FloatingType
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getFloatingType()
	 * @generated
	 */
	int FLOATING_TYPE = 82;

	/**
	 * The meta object id for the '{@link org.asup.il.data.TimeFormat <em>Time Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.TimeFormat
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getTimeFormat()
	 * @generated
	 */
	int TIME_FORMAT = 83;

	/**
	 * The meta object id for the '<em>Data Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataArray()
	 * @generated
	 */
	int DATA_ARRAY = 84;


	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see org.asup.il.data.QAdapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QAdapterDef <em>Adapter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter Def</em>'.
	 * @see org.asup.il.data.QAdapterDef
	 * @generated
	 */
	EClass getAdapterDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.asup.il.data.QArray
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QArrayDef <em>Array Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Def</em>'.
	 * @see org.asup.il.data.QArrayDef
	 * @generated
	 */
	EClass getArrayDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QAtomicDataDef <em>Atomic Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Data Def</em>'.
	 * @see org.asup.il.data.QAtomicDataDef
	 * @generated
	 */
	EClass getAtomicDataDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QAtomicDataTerm <em>Atomic Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Data Term</em>'.
	 * @see org.asup.il.data.QAtomicDataTerm
	 * @generated
	 */
	EClass getAtomicDataTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see org.asup.il.data.QBinary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QBinaryDef <em>Binary Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Def</em>'.
	 * @see org.asup.il.data.QBinaryDef
	 * @generated
	 */
	EClass getBinaryDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QBinaryDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.il.data.QBinaryDef#getType()
	 * @see #getBinaryDef()
	 * @generated
	 */
	EAttribute getBinaryDef_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QBinaryDef#isUnsigned <em>Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsigned</em>'.
	 * @see org.asup.il.data.QBinaryDef#isUnsigned()
	 * @see #getBinaryDef()
	 * @generated
	 */
	EAttribute getBinaryDef_Unsigned();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.asup.il.data.QBoolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QBufferedData <em>Buffered Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffered Data</em>'.
	 * @see org.asup.il.data.QBufferedData
	 * @generated
	 */
	EClass getBufferedData();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QBufferDef <em>Buffer Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Def</em>'.
	 * @see org.asup.il.data.QBufferDef
	 * @generated
	 */
	EClass getBufferDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QBufferedDataDelegator <em>Buffered Data Delegator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffered Data Delegator</em>'.
	 * @see org.asup.il.data.QBufferedDataDelegator
	 * @generated
	 */
	EClass getBufferedDataDelegator();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QBufferedDataDef <em>Buffered Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffered Data Def</em>'.
	 * @see org.asup.il.data.QBufferedDataDef
	 * @generated
	 */
	EClass getBufferedDataDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QBufferedDataTerm <em>Buffered Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffered Data Term</em>'.
	 * @see org.asup.il.data.QBufferedDataTerm
	 * @generated
	 */
	EClass getBufferedDataTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QBufferedList <em>Buffered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffered List</em>'.
	 * @see org.asup.il.data.QBufferedList
	 * @generated
	 */
	EClass getBufferedList();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QCharacter <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character</em>'.
	 * @see org.asup.il.data.QCharacter
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QCharacterDef <em>Character Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Def</em>'.
	 * @see org.asup.il.data.QCharacterDef
	 * @generated
	 */
	EClass getCharacterDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QCharacterDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.asup.il.data.QCharacterDef#getLength()
	 * @see #getCharacterDef()
	 * @generated
	 */
	EAttribute getCharacterDef_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QCharacterDef#isVarying <em>Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varying</em>'.
	 * @see org.asup.il.data.QCharacterDef#isVarying()
	 * @see #getCharacterDef()
	 * @generated
	 */
	EAttribute getCharacterDef_Varying();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QCompoundDataDef <em>Compound Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Data Def</em>'.
	 * @see org.asup.il.data.QCompoundDataDef
	 * @generated
	 */
	EClass getCompoundDataDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QCompoundDataDef#getClassDelegator <em>Class Delegator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Delegator</em>'.
	 * @see org.asup.il.data.QCompoundDataDef#getClassDelegator()
	 * @see #getCompoundDataDef()
	 * @generated
	 */
	EAttribute getCompoundDataDef_ClassDelegator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.data.QCompoundDataDef#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.asup.il.data.QCompoundDataDef#getElements()
	 * @see #getCompoundDataDef()
	 * @generated
	 */
	EReference getCompoundDataDef_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QCompoundDataDef#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.asup.il.data.QCompoundDataDef#getPrefix()
	 * @see #getCompoundDataDef()
	 * @generated
	 */
	EAttribute getCompoundDataDef_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QCompoundDataDef#isQualified <em>Qualified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified</em>'.
	 * @see org.asup.il.data.QCompoundDataDef#isQualified()
	 * @see #getCompoundDataDef()
	 * @generated
	 */
	EAttribute getCompoundDataDef_Qualified();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.asup.il.data.QData
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Container</em>'.
	 * @see org.asup.il.data.QDataContainer
	 * @generated
	 */
	EClass getDataContainer();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Def</em>'.
	 * @see org.asup.il.data.QDataDef
	 * @generated
	 */
	EClass getDataDef();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.il.data.QDataDef#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formulas</em>'.
	 * @see org.asup.il.data.QDataDef#getFormulas()
	 * @see #getDataDef()
	 * @generated
	 */
	EAttribute getDataDef_Formulas();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataDelegator <em>Data Delegator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Delegator</em>'.
	 * @see org.asup.il.data.QDataDelegator
	 * @generated
	 */
	EClass getDataDelegator();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataDictionary <em>Data Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Dictionary</em>'.
	 * @see org.asup.il.data.QDataDictionary
	 * @generated
	 */
	EClass getDataDictionary();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataWriter <em>Data Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Writer</em>'.
	 * @see org.asup.il.data.QDataWriter
	 * @generated
	 */
	EClass getDataWriter();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataFactory <em>Data Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Factory</em>'.
	 * @see org.asup.il.data.QDataFactory
	 * @generated
	 */
	EClass getDataFactory();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataManager <em>Data Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Manager</em>'.
	 * @see org.asup.il.data.QDataManager
	 * @generated
	 */
	EClass getDataManager();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataReader <em>Data Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Reader</em>'.
	 * @see org.asup.il.data.QDataReader
	 * @generated
	 */
	EClass getDataReader();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataStruct <em>Data Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Struct</em>'.
	 * @see org.asup.il.data.QDataStruct
	 * @generated
	 */
	EClass getDataStruct();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataStructDef <em>Data Struct Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Struct Def</em>'.
	 * @see org.asup.il.data.QDataStructDef
	 * @generated
	 */
	EClass getDataStructDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDataStructDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.asup.il.data.QDataStructDef#getLength()
	 * @see #getDataStructDef()
	 * @generated
	 */
	EAttribute getDataStructDef_Length();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataTerm <em>Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Term</em>'.
	 * @see org.asup.il.data.QDataTerm
	 * @generated
	 */
	EClass getDataTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDataTerm#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.asup.il.data.QDataTerm#isConstant()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Constant();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.data.QDataTerm#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.asup.il.data.QDataTerm#getDefinition()
	 * @see #getDataTerm()
	 * @generated
	 */
	EReference getDataTerm_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDataTerm#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.asup.il.data.QDataTerm#isInitialized()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Initialized();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDataTerm#getLike <em>Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Like</em>'.
	 * @see org.asup.il.data.QDataTerm#getLike()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Like();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDataTerm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.data.QDataTerm#getName()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDataTerm#isRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restricted</em>'.
	 * @see org.asup.il.data.QDataTerm#isRestricted()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Restricted();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDataTerm#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.il.data.QDataTerm#getText()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Text();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataTermContainer <em>Data Term Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Term Container</em>'.
	 * @see org.asup.il.data.QDataTermContainer
	 * @generated
	 */
	EClass getDataTermContainer();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataTermVisitor <em>Data Term Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Term Visitor</em>'.
	 * @see org.asup.il.data.QDataTermVisitor
	 * @generated
	 */
	EClass getDataTermVisitor();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDataVisitor <em>Data Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Visitor</em>'.
	 * @see org.asup.il.data.QDataVisitor
	 * @generated
	 */
	EClass getDataVisitor();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime</em>'.
	 * @see org.asup.il.data.QDatetime
	 * @generated
	 */
	EClass getDatetime();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDatetimeDef <em>Datetime Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime Def</em>'.
	 * @see org.asup.il.data.QDatetimeDef
	 * @generated
	 */
	EClass getDatetimeDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDatetimeDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.il.data.QDatetimeDef#getType()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDatetimeDef#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.asup.il.data.QDatetimeDef#getFormat()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_Format();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal</em>'.
	 * @see org.asup.il.data.QDecimal
	 * @generated
	 */
	EClass getDecimal();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QDecimalDef <em>Decimal Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Def</em>'.
	 * @see org.asup.il.data.QDecimalDef
	 * @generated
	 */
	EClass getDecimalDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDecimalDef#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.asup.il.data.QDecimalDef#getPrecision()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDecimalDef#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.asup.il.data.QDecimalDef#getScale()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QDecimalDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.il.data.QDecimalDef#getType()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Type();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see org.asup.il.data.QEnum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QEnumDef <em>Enum Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Def</em>'.
	 * @see org.asup.il.data.QEnumDef
	 * @generated
	 */
	EClass getEnumDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.data.QEnumDef#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see org.asup.il.data.QEnumDef#getDelegate()
	 * @see #getEnumDef()
	 * @generated
	 */
	EReference getEnumDef_Delegate();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QEnumDef#getKlass <em>Klass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Klass</em>'.
	 * @see org.asup.il.data.QEnumDef#getKlass()
	 * @see #getEnumDef()
	 * @generated
	 */
	EAttribute getEnumDef_Klass();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QFloating <em>Floating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating</em>'.
	 * @see org.asup.il.data.QFloating
	 * @generated
	 */
	EClass getFloating();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QFloatingDef <em>Floating Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Def</em>'.
	 * @see org.asup.il.data.QFloatingDef
	 * @generated
	 */
	EClass getFloatingDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QFloatingDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.il.data.QFloatingDef#getType()
	 * @see #getFloatingDef()
	 * @generated
	 */
	EAttribute getFloatingDef_Type();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QGraphic <em>Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic</em>'.
	 * @see org.asup.il.data.QGraphic
	 * @generated
	 */
	EClass getGraphic();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QHexadecimal <em>Hexadecimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hexadecimal</em>'.
	 * @see org.asup.il.data.QHexadecimal
	 * @generated
	 */
	EClass getHexadecimal();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QHexadecimalDef <em>Hexadecimal Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hexadecimal Def</em>'.
	 * @see org.asup.il.data.QHexadecimalDef
	 * @generated
	 */
	EClass getHexadecimalDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QHexadecimalDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.asup.il.data.QHexadecimalDef#getLength()
	 * @see #getHexadecimalDef()
	 * @generated
	 */
	EAttribute getHexadecimalDef_Length();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.asup.il.data.QIdentifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indicator</em>'.
	 * @see org.asup.il.data.QIndicator
	 * @generated
	 */
	EClass getIndicator();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QIndicatorDef <em>Indicator Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indicator Def</em>'.
	 * @see org.asup.il.data.QIndicatorDef
	 * @generated
	 */
	EClass getIndicatorDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QMoveable <em>Moveable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moveable</em>'.
	 * @see org.asup.il.data.QMoveable
	 * @generated
	 */
	EClass getMoveable();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.asup.il.data.QList
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QListDef <em>List Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Def</em>'.
	 * @see org.asup.il.data.QListDef
	 * @generated
	 */
	EClass getListDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.data.QListDef#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see org.asup.il.data.QListDef#getArgument()
	 * @see #getListDef()
	 * @generated
	 */
	EReference getListDef_Argument();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QMultipleAtomicDataDef <em>Multiple Atomic Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Atomic Data Def</em>'.
	 * @see org.asup.il.data.QMultipleAtomicDataDef
	 * @generated
	 */
	EClass getMultipleAtomicDataDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QMultipleAtomicBufferedDataDef <em>Multiple Atomic Buffered Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Atomic Buffered Data Def</em>'.
	 * @see org.asup.il.data.QMultipleAtomicBufferedDataDef
	 * @generated
	 */
	EClass getMultipleAtomicBufferedDataDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.data.QMultipleAtomicBufferedDataDef#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see org.asup.il.data.QMultipleAtomicBufferedDataDef#getArgument()
	 * @see #getMultipleAtomicBufferedDataDef()
	 * @generated
	 */
	EReference getMultipleAtomicBufferedDataDef_Argument();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QMultipleAtomicDataTerm <em>Multiple Atomic Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Atomic Data Term</em>'.
	 * @see org.asup.il.data.QMultipleAtomicDataTerm
	 * @generated
	 */
	EClass getMultipleAtomicDataTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QMultipleCompoundDataDef <em>Multiple Compound Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Compound Data Def</em>'.
	 * @see org.asup.il.data.QMultipleCompoundDataDef
	 * @generated
	 */
	EClass getMultipleCompoundDataDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QMultipleCompoundDataTerm <em>Multiple Compound Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Compound Data Term</em>'.
	 * @see org.asup.il.data.QMultipleCompoundDataTerm
	 * @generated
	 */
	EClass getMultipleCompoundDataTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QMultipleDataDef <em>Multiple Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Data Def</em>'.
	 * @see org.asup.il.data.QMultipleDataDef
	 * @generated
	 */
	EClass getMultipleDataDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QMultipleDataDef#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.asup.il.data.QMultipleDataDef#getDimension()
	 * @see #getMultipleDataDef()
	 * @generated
	 */
	EAttribute getMultipleDataDef_Dimension();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QMultipleDataTerm <em>Multiple Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Data Term</em>'.
	 * @see org.asup.il.data.QMultipleDataTerm
	 * @generated
	 */
	EClass getMultipleDataTerm();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.il.data.QMultipleDataTerm#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default</em>'.
	 * @see org.asup.il.data.QMultipleDataTerm#getDefault()
	 * @see #getMultipleDataTerm()
	 * @generated
	 */
	EAttribute getMultipleDataTerm_Default();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see org.asup.il.data.QNumeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QNumericDef <em>Numeric Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Def</em>'.
	 * @see org.asup.il.data.QNumericDef
	 * @generated
	 */
	EClass getNumericDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer</em>'.
	 * @see org.asup.il.data.QPointer
	 * @generated
	 */
	EClass getPointer();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QPointerDef <em>Pointer Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Def</em>'.
	 * @see org.asup.il.data.QPointerDef
	 * @generated
	 */
	EClass getPointerDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QScroller <em>Scroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroller</em>'.
	 * @see org.asup.il.data.QScroller
	 * @generated
	 */
	EClass getScroller();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QScrollerDef <em>Scroller Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroller Def</em>'.
	 * @see org.asup.il.data.QScrollerDef
	 * @generated
	 */
	EClass getScrollerDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.asup.il.data.QString
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QStringDef <em>String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Def</em>'.
	 * @see org.asup.il.data.QStringDef
	 * @generated
	 */
	EClass getStringDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see org.asup.il.data.QStruct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QUnaryAtomicDataDef <em>Unary Atomic Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Atomic Data Def</em>'.
	 * @see org.asup.il.data.QUnaryAtomicDataDef
	 * @generated
	 */
	EClass getUnaryAtomicDataDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QUnaryAtomicBufferedDataDef <em>Unary Atomic Buffered Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Atomic Buffered Data Def</em>'.
	 * @see org.asup.il.data.QUnaryAtomicBufferedDataDef
	 * @generated
	 */
	EClass getUnaryAtomicBufferedDataDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QUnaryAtomicDataTerm <em>Unary Atomic Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Atomic Data Term</em>'.
	 * @see org.asup.il.data.QUnaryAtomicDataTerm
	 * @generated
	 */
	EClass getUnaryAtomicDataTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QUnaryCompoundDataDef <em>Unary Compound Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Compound Data Def</em>'.
	 * @see org.asup.il.data.QUnaryCompoundDataDef
	 * @generated
	 */
	EClass getUnaryCompoundDataDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QUnaryCompoundDataTerm <em>Unary Compound Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Compound Data Term</em>'.
	 * @see org.asup.il.data.QUnaryCompoundDataTerm
	 * @generated
	 */
	EClass getUnaryCompoundDataTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QUnaryDataDef <em>Unary Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Data Def</em>'.
	 * @see org.asup.il.data.QUnaryDataDef
	 * @generated
	 */
	EClass getUnaryDataDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QUnaryDataTerm <em>Unary Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Data Term</em>'.
	 * @see org.asup.il.data.QUnaryDataTerm
	 * @generated
	 */
	EClass getUnaryDataTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QUnaryDataTerm#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.asup.il.data.QUnaryDataTerm#getDefault()
	 * @see #getUnaryDataTerm()
	 * @generated
	 */
	EAttribute getUnaryDataTerm_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QUnaryDataTerm#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.asup.il.data.QUnaryDataTerm#isMandatory()
	 * @see #getUnaryDataTerm()
	 * @generated
	 */
	EAttribute getUnaryDataTerm_Mandatory();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QCompoundDataTerm <em>Compound Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Data Term</em>'.
	 * @see org.asup.il.data.QCompoundDataTerm
	 * @generated
	 */
	EClass getCompoundDataTerm();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QStroller <em>Stroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroller</em>'.
	 * @see org.asup.il.data.QStroller
	 * @generated
	 */
	EClass getStroller();

	/**
	 * Returns the meta object for class '{@link org.asup.il.data.QStrollerDef <em>Stroller Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroller Def</em>'.
	 * @see org.asup.il.data.QStrollerDef
	 * @generated
	 */
	EClass getStrollerDef();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.data.QStrollerDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.asup.il.data.QStrollerDef#getLength()
	 * @see #getStrollerDef()
	 * @generated
	 */
	EAttribute getStrollerDef_Length();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.data.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Type</em>'.
	 * @see org.asup.il.data.BinaryType
	 * @generated
	 */
	EEnum getBinaryType();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.data.DataDefType <em>Data Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Def Type</em>'.
	 * @see org.asup.il.data.DataDefType
	 * @generated
	 */
	EEnum getDataDefType();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.data.DataTermType <em>Data Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Term Type</em>'.
	 * @see org.asup.il.data.DataTermType
	 * @generated
	 */
	EEnum getDataTermType();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.data.DatetimeType <em>Datetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datetime Type</em>'.
	 * @see org.asup.il.data.DatetimeType
	 * @generated
	 */
	EEnum getDatetimeType();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.data.DateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Format</em>'.
	 * @see org.asup.il.data.DateFormat
	 * @generated
	 */
	EEnum getDateFormat();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.data.DecimalType <em>Decimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decimal Type</em>'.
	 * @see org.asup.il.data.DecimalType
	 * @generated
	 */
	EEnum getDecimalType();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.data.FloatingType <em>Floating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Floating Type</em>'.
	 * @see org.asup.il.data.FloatingType
	 * @generated
	 */
	EEnum getFloatingType();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.data.TimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Format</em>'.
	 * @see org.asup.il.data.TimeFormat
	 * @generated
	 */
	EEnum getTimeFormat();

	/**
	 * Returns the meta object for data type '<em>Data Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Array</em>'.
	 * @model instanceClass="java.lang.Object[]"
	 * @generated
	 */
	EDataType getDataArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageDataFactory getIntegratedLanguageDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.il.data.QAdapter <em>Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QAdapter
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.AdapterDefImpl <em>Adapter Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.AdapterDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getAdapterDef()
		 * @generated
		 */
		EClass ADAPTER_DEF = eINSTANCE.getAdapterDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QArray <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QArray
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.ArrayDefImpl <em>Array Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.ArrayDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getArrayDef()
		 * @generated
		 */
		EClass ARRAY_DEF = eINSTANCE.getArrayDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.AtomicDataDefImpl <em>Atomic Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.AtomicDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getAtomicDataDef()
		 * @generated
		 */
		EClass ATOMIC_DATA_DEF = eINSTANCE.getAtomicDataDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.AtomicDataTermImpl <em>Atomic Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.AtomicDataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getAtomicDataTerm()
		 * @generated
		 */
		EClass ATOMIC_DATA_TERM = eINSTANCE.getAtomicDataTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QBinary <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QBinary
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.BinaryDefImpl <em>Binary Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.BinaryDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBinaryDef()
		 * @generated
		 */
		EClass BINARY_DEF = eINSTANCE.getBinaryDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEF__TYPE = eINSTANCE.getBinaryDef_Type();

		/**
		 * The meta object literal for the '<em><b>Unsigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEF__UNSIGNED = eINSTANCE.getBinaryDef_Unsigned();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QBoolean <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QBoolean
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QBufferedData <em>Buffered Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QBufferedData
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedData()
		 * @generated
		 */
		EClass BUFFERED_DATA = eINSTANCE.getBufferedData();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.BufferDefImpl <em>Buffer Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.BufferDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferDef()
		 * @generated
		 */
		EClass BUFFER_DEF = eINSTANCE.getBufferDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QBufferedDataDelegator <em>Buffered Data Delegator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QBufferedDataDelegator
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedDataDelegator()
		 * @generated
		 */
		EClass BUFFERED_DATA_DELEGATOR = eINSTANCE.getBufferedDataDelegator();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QBufferedDataDef <em>Buffered Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QBufferedDataDef
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedDataDef()
		 * @generated
		 */
		EClass BUFFERED_DATA_DEF = eINSTANCE.getBufferedDataDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.BufferedDataTermImpl <em>Buffered Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.BufferedDataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedDataTerm()
		 * @generated
		 */
		EClass BUFFERED_DATA_TERM = eINSTANCE.getBufferedDataTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QBufferedList <em>Buffered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QBufferedList
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedList()
		 * @generated
		 */
		EClass BUFFERED_LIST = eINSTANCE.getBufferedList();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QCharacter <em>Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QCharacter
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.CharacterDefImpl <em>Character Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.CharacterDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getCharacterDef()
		 * @generated
		 */
		EClass CHARACTER_DEF = eINSTANCE.getCharacterDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_DEF__LENGTH = eINSTANCE.getCharacterDef_Length();

		/**
		 * The meta object literal for the '<em><b>Varying</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_DEF__VARYING = eINSTANCE.getCharacterDef_Varying();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.CompoundDataDefImpl <em>Compound Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.CompoundDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getCompoundDataDef()
		 * @generated
		 */
		EClass COMPOUND_DATA_DEF = eINSTANCE.getCompoundDataDef();

		/**
		 * The meta object literal for the '<em><b>Class Delegator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_DATA_DEF__CLASS_DELEGATOR = eINSTANCE.getCompoundDataDef_ClassDelegator();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_DATA_DEF__ELEMENTS = eINSTANCE.getCompoundDataDef_Elements();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_DATA_DEF__PREFIX = eINSTANCE.getCompoundDataDef_Prefix();

		/**
		 * The meta object literal for the '<em><b>Qualified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_DATA_DEF__QUALIFIED = eINSTANCE.getCompoundDataDef_Qualified();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QData <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QData
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataContainerImpl <em>Data Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataContainerImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataContainer()
		 * @generated
		 */
		EClass DATA_CONTAINER = eINSTANCE.getDataContainer();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataDefImpl <em>Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDef()
		 * @generated
		 */
		EClass DATA_DEF = eINSTANCE.getDataDef();

		/**
		 * The meta object literal for the '<em><b>Formulas</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DEF__FORMULAS = eINSTANCE.getDataDef_Formulas();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QDataDelegator <em>Data Delegator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QDataDelegator
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDelegator()
		 * @generated
		 */
		EClass DATA_DELEGATOR = eINSTANCE.getDataDelegator();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataDictionaryImpl <em>Data Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataDictionaryImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDictionary()
		 * @generated
		 */
		EClass DATA_DICTIONARY = eINSTANCE.getDataDictionary();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataWriterImpl <em>Data Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataWriterImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataWriter()
		 * @generated
		 */
		EClass DATA_WRITER = eINSTANCE.getDataWriter();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QDataFactory <em>Data Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QDataFactory
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataFactory()
		 * @generated
		 */
		EClass DATA_FACTORY = eINSTANCE.getDataFactory();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QDataManager <em>Data Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QDataManager
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataManager()
		 * @generated
		 */
		EClass DATA_MANAGER = eINSTANCE.getDataManager();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataReaderImpl <em>Data Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataReaderImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataReader()
		 * @generated
		 */
		EClass DATA_READER = eINSTANCE.getDataReader();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QDataStruct <em>Data Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QDataStruct
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataStruct()
		 * @generated
		 */
		EClass DATA_STRUCT = eINSTANCE.getDataStruct();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataStructDefImpl <em>Data Struct Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataStructDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataStructDef()
		 * @generated
		 */
		EClass DATA_STRUCT_DEF = eINSTANCE.getDataStructDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STRUCT_DEF__LENGTH = eINSTANCE.getDataStructDef_Length();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataTermImpl <em>Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataTerm()
		 * @generated
		 */
		EClass DATA_TERM = eINSTANCE.getDataTerm();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__CONSTANT = eINSTANCE.getDataTerm_Constant();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TERM__DEFINITION = eINSTANCE.getDataTerm_Definition();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__INITIALIZED = eINSTANCE.getDataTerm_Initialized();

		/**
		 * The meta object literal for the '<em><b>Like</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__LIKE = eINSTANCE.getDataTerm_Like();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__NAME = eINSTANCE.getDataTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Restricted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__RESTRICTED = eINSTANCE.getDataTerm_Restricted();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__TEXT = eINSTANCE.getDataTerm_Text();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataTermContainerImpl <em>Data Term Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataTermContainerImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataTermContainer()
		 * @generated
		 */
		EClass DATA_TERM_CONTAINER = eINSTANCE.getDataTermContainer();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataTermVisitorImpl <em>Data Term Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataTermVisitorImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataTermVisitor()
		 * @generated
		 */
		EClass DATA_TERM_VISITOR = eINSTANCE.getDataTermVisitor();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DataVisitorImpl <em>Data Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DataVisitorImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataVisitor()
		 * @generated
		 */
		EClass DATA_VISITOR = eINSTANCE.getDataVisitor();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QDatetime <em>Datetime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QDatetime
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDatetime()
		 * @generated
		 */
		EClass DATETIME = eINSTANCE.getDatetime();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DatetimeDefImpl <em>Datetime Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DatetimeDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDatetimeDef()
		 * @generated
		 */
		EClass DATETIME_DEF = eINSTANCE.getDatetimeDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__TYPE = eINSTANCE.getDatetimeDef_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__FORMAT = eINSTANCE.getDatetimeDef_Format();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QDecimal <em>Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QDecimal
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDecimal()
		 * @generated
		 */
		EClass DECIMAL = eINSTANCE.getDecimal();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.DecimalDefImpl <em>Decimal Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.DecimalDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDecimalDef()
		 * @generated
		 */
		EClass DECIMAL_DEF = eINSTANCE.getDecimalDef();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__PRECISION = eINSTANCE.getDecimalDef_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__SCALE = eINSTANCE.getDecimalDef_Scale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__TYPE = eINSTANCE.getDecimalDef_Type();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QEnum <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QEnum
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.EnumDefImpl <em>Enum Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.EnumDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getEnumDef()
		 * @generated
		 */
		EClass ENUM_DEF = eINSTANCE.getEnumDef();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_DEF__DELEGATE = eINSTANCE.getEnumDef_Delegate();

		/**
		 * The meta object literal for the '<em><b>Klass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_DEF__KLASS = eINSTANCE.getEnumDef_Klass();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QFloating <em>Floating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QFloating
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getFloating()
		 * @generated
		 */
		EClass FLOATING = eINSTANCE.getFloating();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.FloatingDefImpl <em>Floating Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.FloatingDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getFloatingDef()
		 * @generated
		 */
		EClass FLOATING_DEF = eINSTANCE.getFloatingDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_DEF__TYPE = eINSTANCE.getFloatingDef_Type();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QGraphic <em>Graphic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QGraphic
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getGraphic()
		 * @generated
		 */
		EClass GRAPHIC = eINSTANCE.getGraphic();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QHexadecimal <em>Hexadecimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QHexadecimal
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getHexadecimal()
		 * @generated
		 */
		EClass HEXADECIMAL = eINSTANCE.getHexadecimal();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.HexadecimalDefImpl <em>Hexadecimal Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.HexadecimalDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getHexadecimalDef()
		 * @generated
		 */
		EClass HEXADECIMAL_DEF = eINSTANCE.getHexadecimalDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEXADECIMAL_DEF__LENGTH = eINSTANCE.getHexadecimalDef_Length();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QIdentifier <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QIdentifier
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QIndicator <em>Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QIndicator
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getIndicator()
		 * @generated
		 */
		EClass INDICATOR = eINSTANCE.getIndicator();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.IndicatorDefImpl <em>Indicator Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.IndicatorDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getIndicatorDef()
		 * @generated
		 */
		EClass INDICATOR_DEF = eINSTANCE.getIndicatorDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QMoveable <em>Moveable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QMoveable
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMoveable()
		 * @generated
		 */
		EClass MOVEABLE = eINSTANCE.getMoveable();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QList <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QList
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.ListDefImpl <em>List Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.ListDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getListDef()
		 * @generated
		 */
		EClass LIST_DEF = eINSTANCE.getListDef();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_DEF__ARGUMENT = eINSTANCE.getListDef_Argument();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.MultipleAtomicDataDefImpl <em>Multiple Atomic Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.MultipleAtomicDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleAtomicDataDef()
		 * @generated
		 */
		EClass MULTIPLE_ATOMIC_DATA_DEF = eINSTANCE.getMultipleAtomicDataDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.MultipleAtomicBufferedDataDefImpl <em>Multiple Atomic Buffered Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.MultipleAtomicBufferedDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleAtomicBufferedDataDef()
		 * @generated
		 */
		EClass MULTIPLE_ATOMIC_BUFFERED_DATA_DEF = eINSTANCE.getMultipleAtomicBufferedDataDef();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT = eINSTANCE.getMultipleAtomicBufferedDataDef_Argument();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.MultipleAtomicDataTermImpl <em>Multiple Atomic Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.MultipleAtomicDataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleAtomicDataTerm()
		 * @generated
		 */
		EClass MULTIPLE_ATOMIC_DATA_TERM = eINSTANCE.getMultipleAtomicDataTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.MultipleCompoundDataDefImpl <em>Multiple Compound Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.MultipleCompoundDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleCompoundDataDef()
		 * @generated
		 */
		EClass MULTIPLE_COMPOUND_DATA_DEF = eINSTANCE.getMultipleCompoundDataDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.MultipleCompoundDataTermImpl <em>Multiple Compound Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.MultipleCompoundDataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleCompoundDataTerm()
		 * @generated
		 */
		EClass MULTIPLE_COMPOUND_DATA_TERM = eINSTANCE.getMultipleCompoundDataTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.MultipleDataDefImpl <em>Multiple Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.MultipleDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleDataDef()
		 * @generated
		 */
		EClass MULTIPLE_DATA_DEF = eINSTANCE.getMultipleDataDef();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_DATA_DEF__DIMENSION = eINSTANCE.getMultipleDataDef_Dimension();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.MultipleDataTermImpl <em>Multiple Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.MultipleDataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getMultipleDataTerm()
		 * @generated
		 */
		EClass MULTIPLE_DATA_TERM = eINSTANCE.getMultipleDataTerm();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_DATA_TERM__DEFAULT = eINSTANCE.getMultipleDataTerm_Default();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QNumeric <em>Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QNumeric
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.NumericDefImpl <em>Numeric Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.NumericDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getNumericDef()
		 * @generated
		 */
		EClass NUMERIC_DEF = eINSTANCE.getNumericDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QPointer <em>Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QPointer
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getPointer()
		 * @generated
		 */
		EClass POINTER = eINSTANCE.getPointer();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.PointerDefImpl <em>Pointer Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.PointerDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getPointerDef()
		 * @generated
		 */
		EClass POINTER_DEF = eINSTANCE.getPointerDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QScroller <em>Scroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QScroller
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getScroller()
		 * @generated
		 */
		EClass SCROLLER = eINSTANCE.getScroller();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.ScrollerDefImpl <em>Scroller Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.ScrollerDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getScrollerDef()
		 * @generated
		 */
		EClass SCROLLER_DEF = eINSTANCE.getScrollerDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QString <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QString
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.StringDefImpl <em>String Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.StringDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getStringDef()
		 * @generated
		 */
		EClass STRING_DEF = eINSTANCE.getStringDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QStruct <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QStruct
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.UnaryAtomicDataDefImpl <em>Unary Atomic Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.UnaryAtomicDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryAtomicDataDef()
		 * @generated
		 */
		EClass UNARY_ATOMIC_DATA_DEF = eINSTANCE.getUnaryAtomicDataDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.UnaryAtomicBufferedDataDefImpl <em>Unary Atomic Buffered Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.UnaryAtomicBufferedDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryAtomicBufferedDataDef()
		 * @generated
		 */
		EClass UNARY_ATOMIC_BUFFERED_DATA_DEF = eINSTANCE.getUnaryAtomicBufferedDataDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.UnaryAtomicDataTermImpl <em>Unary Atomic Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.UnaryAtomicDataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryAtomicDataTerm()
		 * @generated
		 */
		EClass UNARY_ATOMIC_DATA_TERM = eINSTANCE.getUnaryAtomicDataTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.UnaryCompoundDataDefImpl <em>Unary Compound Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.UnaryCompoundDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryCompoundDataDef()
		 * @generated
		 */
		EClass UNARY_COMPOUND_DATA_DEF = eINSTANCE.getUnaryCompoundDataDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.UnaryCompoundDataTermImpl <em>Unary Compound Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.UnaryCompoundDataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryCompoundDataTerm()
		 * @generated
		 */
		EClass UNARY_COMPOUND_DATA_TERM = eINSTANCE.getUnaryCompoundDataTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.UnaryDataDefImpl <em>Unary Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.UnaryDataDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryDataDef()
		 * @generated
		 */
		EClass UNARY_DATA_DEF = eINSTANCE.getUnaryDataDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.UnaryDataTermImpl <em>Unary Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.UnaryDataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getUnaryDataTerm()
		 * @generated
		 */
		EClass UNARY_DATA_TERM = eINSTANCE.getUnaryDataTerm();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_DATA_TERM__DEFAULT = eINSTANCE.getUnaryDataTerm_Default();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_DATA_TERM__MANDATORY = eINSTANCE.getUnaryDataTerm_Mandatory();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.CompoundDataTermImpl <em>Compound Data Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.CompoundDataTermImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getCompoundDataTerm()
		 * @generated
		 */
		EClass COMPOUND_DATA_TERM = eINSTANCE.getCompoundDataTerm();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.QStroller <em>Stroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.QStroller
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getStroller()
		 * @generated
		 */
		EClass STROLLER = eINSTANCE.getStroller();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.impl.StrollerDefImpl <em>Stroller Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.StrollerDefImpl
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getStrollerDef()
		 * @generated
		 */
		EClass STROLLER_DEF = eINSTANCE.getStrollerDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STROLLER_DEF__LENGTH = eINSTANCE.getStrollerDef_Length();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.BinaryType <em>Binary Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.BinaryType
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getBinaryType()
		 * @generated
		 */
		EEnum BINARY_TYPE = eINSTANCE.getBinaryType();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.DataDefType <em>Data Def Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.DataDefType
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDefType()
		 * @generated
		 */
		EEnum DATA_DEF_TYPE = eINSTANCE.getDataDefType();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.DataTermType <em>Data Term Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.DataTermType
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataTermType()
		 * @generated
		 */
		EEnum DATA_TERM_TYPE = eINSTANCE.getDataTermType();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.DatetimeType <em>Datetime Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.DatetimeType
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDatetimeType()
		 * @generated
		 */
		EEnum DATETIME_TYPE = eINSTANCE.getDatetimeType();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.DateFormat <em>Date Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.DateFormat
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDateFormat()
		 * @generated
		 */
		EEnum DATE_FORMAT = eINSTANCE.getDateFormat();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.DecimalType <em>Decimal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.DecimalType
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDecimalType()
		 * @generated
		 */
		EEnum DECIMAL_TYPE = eINSTANCE.getDecimalType();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.FloatingType <em>Floating Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.FloatingType
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getFloatingType()
		 * @generated
		 */
		EEnum FLOATING_TYPE = eINSTANCE.getFloatingType();

		/**
		 * The meta object literal for the '{@link org.asup.il.data.TimeFormat <em>Time Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.TimeFormat
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getTimeFormat()
		 * @generated
		 */
		EEnum TIME_FORMAT = eINSTANCE.getTimeFormat();

		/**
		 * The meta object literal for the '<em>Data Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.data.impl.IntegratedLanguageDataPackageImpl#getDataArray()
		 * @generated
		 */
		EDataType DATA_ARRAY = eINSTANCE.getDataArray();

	}

} //QIntegratedLanguageDataPackage
