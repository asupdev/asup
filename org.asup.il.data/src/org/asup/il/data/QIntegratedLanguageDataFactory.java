/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.il.data.QIntegratedLanguageDataPackage
 * @generated
 */
public interface QIntegratedLanguageDataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageDataFactory eINSTANCE = org.asup.il.data.impl.IntegratedLanguageDataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adapter Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapter Def</em>'.
	 * @generated
	 */
	QAdapterDef createAdapterDef();

	/**
	 * Returns a new object of class '<em>Array Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Def</em>'.
	 * @generated
	 */
	<D extends QArray<?>> QArrayDef<D> createArrayDef();

	/**
	 * Returns a new object of class '<em>Binary Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Def</em>'.
	 * @generated
	 */
	QBinaryDef createBinaryDef();

	/**
	 * Returns a new object of class '<em>Buffer Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer Def</em>'.
	 * @generated
	 */
	QBufferDef createBufferDef();

	/**
	 * Returns a new object of class '<em>Character Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Def</em>'.
	 * @generated
	 */
	QCharacterDef createCharacterDef();

	/**
	 * Returns a new object of class '<em>Data Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Dictionary</em>'.
	 * @generated
	 */
	QDataDictionary createDataDictionary();

	/**
	 * Returns a new object of class '<em>Data Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Evaluator</em>'.
	 * @generated
	 */
	QDataEvaluator createDataEvaluator();

	/**
	 * Returns a new object of class '<em>Data Struct Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Struct Def</em>'.
	 * @generated
	 */
	QDataStructDef createDataStructDef();

	/**
	 * Returns a new object of class '<em>Datetime Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datetime Def</em>'.
	 * @generated
	 */
	QDatetimeDef createDatetimeDef();

	/**
	 * Returns a new object of class '<em>Decimal Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Def</em>'.
	 * @generated
	 */
	QDecimalDef createDecimalDef();

	/**
	 * Returns a new object of class '<em>Floating Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floating Def</em>'.
	 * @generated
	 */
	QFloatingDef createFloatingDef();

	/**
	 * Returns a new object of class '<em>Hexadecimal Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hexadecimal Def</em>'.
	 * @generated
	 */
	QHexadecimalDef createHexadecimalDef();

	/**
	 * Returns a new object of class '<em>Indicator Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indicator Def</em>'.
	 * @generated
	 */
	QIndicatorDef createIndicatorDef();

	/**
	 * Returns a new object of class '<em>List Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Def</em>'.
	 * @generated
	 */
	<D extends QList<?>> QListDef<D> createListDef();

	/**
	 * Returns a new object of class '<em>Multiple Atomic Data Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Atomic Data Term</em>'.
	 * @generated
	 */
	<DD extends QMultipleAtomicDataDef<?>> QMultipleAtomicDataTerm<DD> createMultipleAtomicDataTerm();

	/**
	 * Returns a new object of class '<em>Multiple Compound Data Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Compound Data Term</em>'.
	 * @generated
	 */
	<DD extends QMultipleCompoundDataDef<?>> QMultipleCompoundDataTerm<DD> createMultipleCompoundDataTerm();

	/**
	 * Returns a new object of class '<em>Numeric Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Def</em>'.
	 * @generated
	 */
	QNumericDef createNumericDef();

	/**
	 * Returns a new object of class '<em>Pointer Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Def</em>'.
	 * @generated
	 */
	QPointerDef createPointerDef();

	/**
	 * Returns a new object of class '<em>Scroller Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scroller Def</em>'.
	 * @generated
	 */
	<D extends QScroller<QBufferedData>> QScrollerDef<D> createScrollerDef();

	/**
	 * Returns a new object of class '<em>String Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Def</em>'.
	 * @generated
	 */
	QStringDef createStringDef();

	/**
	 * Returns a new object of class '<em>Stroller Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stroller Def</em>'.
	 * @generated
	 */
	<D extends QStroller<?>> QStrollerDef<D> createStrollerDef();

	/**
	 * Returns a new object of class '<em>Unary Atomic Data Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Atomic Data Term</em>'.
	 * @generated
	 */
	<DD extends QUnaryAtomicDataDef<?>> QUnaryAtomicDataTerm<DD> createUnaryAtomicDataTerm();

	/**
	 * Returns a new object of class '<em>Unary Compound Data Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Compound Data Term</em>'.
	 * @generated
	 */
	<DD extends QUnaryCompoundDataDef<?>> QUnaryCompoundDataTerm<DD> createUnaryCompoundDataTerm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QIntegratedLanguageDataPackage getIntegratedLanguageDataPackage();

} //QIntegratedLanguageDataFactory
