/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
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
 * @see org.asup.il.isam.QIntegratedLanguageIsamFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageIsamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "isam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/il/isam";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-isam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageIsamPackage eINSTANCE = org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.il.isam.QDataSet <em>Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.QDataSet
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 0;

	/**
	 * The number of structural features of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.impl.DataSetTermImpl <em>Data Set Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.impl.DataSetTermImpl
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getDataSetTerm()
	 * @generated
	 */
	int DATA_SET_TERM = 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__FACETS = QIntegratedLanguageCorePackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Access Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__ACCESS_MODE = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__FILE_NAME = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__FORMAT_NAME = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keyed Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__KEYED_ACCESS = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__PREFIX = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__RECORD = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>User Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__USER_OPEN = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Data Set Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM_FEATURE_COUNT = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.impl.KeyListTermImpl <em>Key List Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.impl.KeyListTermImpl
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getKeyListTerm()
	 * @generated
	 */
	int KEY_LIST_TERM = 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LIST_TERM__FACETS = QIntegratedLanguageCorePackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LIST_TERM__NAME = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LIST_TERM__KEY_FIELDS = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key List Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LIST_TERM_FEATURE_COUNT = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.QKSDataSet <em>KS Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.QKSDataSet
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getKSDataSet()
	 * @generated
	 */
	int KS_DATA_SET = 3;

	/**
	 * The number of structural features of the '<em>KS Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS_DATA_SET_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.QIsamManager <em>Isam Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.QIsamManager
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getIsamManager()
	 * @generated
	 */
	int ISAM_MANAGER = 6;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.QIsamFactory <em>Isam Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.QIsamFactory
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getIsamFactory()
	 * @generated
	 */
	int ISAM_FACTORY = 7;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.QIndex <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.QIndex
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 4;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.QIndexColumn <em>Index Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.QIndexColumn
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getIndexColumn()
	 * @generated
	 */
	int INDEX_COLUMN = 5;

	/**
	 * The number of structural features of the '<em>Index Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISAM_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Isam Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISAM_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Isam Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISAM_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.QRecord <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.QRecord
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 8;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = QIntegratedLanguageDataPackage.STRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.QRRDataSet <em>RR Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.QRRDataSet
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getRRDataSet()
	 * @generated
	 */
	int RR_DATA_SET = 9;

	/**
	 * The number of structural features of the '<em>RR Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RR_DATA_SET_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.impl.RecordDefImpl <em>Record Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.impl.RecordDefImpl
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getRecordDef()
	 * @generated
	 */
	int RECORD_DEF = 10;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__FORMULAS = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__CLASS_DELEGATOR = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__ELEMENTS = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__PREFIX = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF__PREFIX;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__QUALIFIED = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF__QUALIFIED;

	/**
	 * The number of structural features of the '<em>Record Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF_FEATURE_COUNT = QIntegratedLanguageDataPackage.UNARY_COMPOUND_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.AccessMode <em>Access Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.AccessMode
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getAccessMode()
	 * @generated
	 */
	int ACCESS_MODE = 11;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.OperationDirection <em>Operation Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.OperationDirection
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getOperationDirection()
	 * @generated
	 */
	int OPERATION_DIRECTION = 12;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.OperationSet <em>Operation Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.OperationSet
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getOperationSet()
	 * @generated
	 */
	int OPERATION_SET = 13;

	/**
	 * The meta object id for the '{@link org.asup.il.isam.OperationRead <em>Operation Read</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.OperationRead
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getOperationRead()
	 * @generated
	 */
	int OPERATION_READ = 14;

	/**
	 * The meta object id for the '<em>Key List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getKeyList()
	 * @generated
	 */
	int KEY_LIST = 15;

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set</em>'.
	 * @see org.asup.il.isam.QDataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QDataSetTerm <em>Data Set Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set Term</em>'.
	 * @see org.asup.il.isam.QDataSetTerm
	 * @generated
	 */
	EClass getDataSetTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.isam.QDataSetTerm#getAccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Mode</em>'.
	 * @see org.asup.il.isam.QDataSetTerm#getAccessMode()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_AccessMode();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.isam.QDataSetTerm#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.asup.il.isam.QDataSetTerm#getFileName()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.isam.QDataSetTerm#getFormatName <em>Format Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Name</em>'.
	 * @see org.asup.il.isam.QDataSetTerm#getFormatName()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_FormatName();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.isam.QDataSetTerm#isKeyedAccess <em>Keyed Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyed Access</em>'.
	 * @see org.asup.il.isam.QDataSetTerm#isKeyedAccess()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_KeyedAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.isam.QDataSetTerm#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.asup.il.isam.QDataSetTerm#getPrefix()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_Prefix();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.isam.QDataSetTerm#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record</em>'.
	 * @see org.asup.il.isam.QDataSetTerm#getRecord()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EReference getDataSetTerm_Record();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.isam.QDataSetTerm#isUserOpen <em>User Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Open</em>'.
	 * @see org.asup.il.isam.QDataSetTerm#isUserOpen()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_UserOpen();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QKeyListTerm <em>Key List Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key List Term</em>'.
	 * @see org.asup.il.isam.QKeyListTerm
	 * @generated
	 */
	EClass getKeyListTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.isam.QKeyListTerm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.isam.QKeyListTerm#getName()
	 * @see #getKeyListTerm()
	 * @generated
	 */
	EAttribute getKeyListTerm_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.il.isam.QKeyListTerm#getKeyFields <em>Key Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Key Fields</em>'.
	 * @see org.asup.il.isam.QKeyListTerm#getKeyFields()
	 * @see #getKeyListTerm()
	 * @generated
	 */
	EAttribute getKeyListTerm_KeyFields();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QKSDataSet <em>KS Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KS Data Set</em>'.
	 * @see org.asup.il.isam.QKSDataSet
	 * @generated
	 */
	EClass getKSDataSet();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QIsamManager <em>Isam Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Isam Manager</em>'.
	 * @see org.asup.il.isam.QIsamManager
	 * @generated
	 */
	EClass getIsamManager();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QIsamFactory <em>Isam Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Isam Factory</em>'.
	 * @see org.asup.il.isam.QIsamFactory
	 * @generated
	 */
	EClass getIsamFactory();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see org.asup.il.isam.QRecord
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QRRDataSet <em>RR Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RR Data Set</em>'.
	 * @see org.asup.il.isam.QRRDataSet
	 * @generated
	 */
	EClass getRRDataSet();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QRecordDef <em>Record Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Def</em>'.
	 * @see org.asup.il.isam.QRecordDef
	 * @generated
	 */
	EClass getRecordDef();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see org.asup.il.isam.QIndex
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for class '{@link org.asup.il.isam.QIndexColumn <em>Index Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Column</em>'.
	 * @see org.asup.il.isam.QIndexColumn
	 * @generated
	 */
	EClass getIndexColumn();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.isam.AccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Mode</em>'.
	 * @see org.asup.il.isam.AccessMode
	 * @generated
	 */
	EEnum getAccessMode();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.isam.OperationDirection <em>Operation Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Direction</em>'.
	 * @see org.asup.il.isam.OperationDirection
	 * @generated
	 */
	EEnum getOperationDirection();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.isam.OperationSet <em>Operation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Set</em>'.
	 * @see org.asup.il.isam.OperationSet
	 * @generated
	 */
	EEnum getOperationSet();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.isam.OperationRead <em>Operation Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Read</em>'.
	 * @see org.asup.il.isam.OperationRead
	 * @generated
	 */
	EEnum getOperationRead();

	/**
	 * Returns the meta object for data type '<em>Key List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Key List</em>'.
	 * @model instanceClass="java.lang.Object[]"
	 * @generated
	 */
	EDataType getKeyList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageIsamFactory getIntegratedLanguageIsamFactory();

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
		 * The meta object literal for the '{@link org.asup.il.isam.QDataSet <em>Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.QDataSet
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.impl.DataSetTermImpl <em>Data Set Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.impl.DataSetTermImpl
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getDataSetTerm()
		 * @generated
		 */
		EClass DATA_SET_TERM = eINSTANCE.getDataSetTerm();

		/**
		 * The meta object literal for the '<em><b>Access Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__ACCESS_MODE = eINSTANCE.getDataSetTerm_AccessMode();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__FILE_NAME = eINSTANCE.getDataSetTerm_FileName();

		/**
		 * The meta object literal for the '<em><b>Format Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__FORMAT_NAME = eINSTANCE.getDataSetTerm_FormatName();

		/**
		 * The meta object literal for the '<em><b>Keyed Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__KEYED_ACCESS = eINSTANCE.getDataSetTerm_KeyedAccess();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__PREFIX = eINSTANCE.getDataSetTerm_Prefix();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET_TERM__RECORD = eINSTANCE.getDataSetTerm_Record();

		/**
		 * The meta object literal for the '<em><b>User Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__USER_OPEN = eINSTANCE.getDataSetTerm_UserOpen();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.impl.KeyListTermImpl <em>Key List Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.impl.KeyListTermImpl
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getKeyListTerm()
		 * @generated
		 */
		EClass KEY_LIST_TERM = eINSTANCE.getKeyListTerm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_LIST_TERM__NAME = eINSTANCE.getKeyListTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Key Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_LIST_TERM__KEY_FIELDS = eINSTANCE.getKeyListTerm_KeyFields();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.QKSDataSet <em>KS Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.QKSDataSet
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getKSDataSet()
		 * @generated
		 */
		EClass KS_DATA_SET = eINSTANCE.getKSDataSet();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.QIsamManager <em>Isam Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.QIsamManager
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getIsamManager()
		 * @generated
		 */
		EClass ISAM_MANAGER = eINSTANCE.getIsamManager();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.QIsamFactory <em>Isam Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.QIsamFactory
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getIsamFactory()
		 * @generated
		 */
		EClass ISAM_FACTORY = eINSTANCE.getIsamFactory();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.QRecord <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.QRecord
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.QRRDataSet <em>RR Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.QRRDataSet
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getRRDataSet()
		 * @generated
		 */
		EClass RR_DATA_SET = eINSTANCE.getRRDataSet();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.impl.RecordDefImpl <em>Record Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.impl.RecordDefImpl
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getRecordDef()
		 * @generated
		 */
		EClass RECORD_DEF = eINSTANCE.getRecordDef();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.QIndex <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.QIndex
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.QIndexColumn <em>Index Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.QIndexColumn
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getIndexColumn()
		 * @generated
		 */
		EClass INDEX_COLUMN = eINSTANCE.getIndexColumn();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.AccessMode <em>Access Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.AccessMode
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getAccessMode()
		 * @generated
		 */
		EEnum ACCESS_MODE = eINSTANCE.getAccessMode();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.OperationDirection <em>Operation Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.OperationDirection
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getOperationDirection()
		 * @generated
		 */
		EEnum OPERATION_DIRECTION = eINSTANCE.getOperationDirection();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.OperationSet <em>Operation Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.OperationSet
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getOperationSet()
		 * @generated
		 */
		EEnum OPERATION_SET = eINSTANCE.getOperationSet();

		/**
		 * The meta object literal for the '{@link org.asup.il.isam.OperationRead <em>Operation Read</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.OperationRead
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getOperationRead()
		 * @generated
		 */
		EEnum OPERATION_READ = eINSTANCE.getOperationRead();

		/**
		 * The meta object literal for the '<em>Key List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.isam.impl.IntegratedLanguageIsamPackageImpl#getKeyList()
		 * @generated
		 */
		EDataType KEY_LIST = eINSTANCE.getKeyList();

	}

} //QIntegratedLanguageISAMPackage
