/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.asup.il.core.QIntegratedLanguageCorePackage
 * @generated
 */
public interface QIntegratedLanguageCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCoreFactory eINSTANCE = org.asup.il.core.impl.IntegratedLanguageCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Test</em>'.
	 * @generated
	 */
	QAnnotationTest createAnnotationTest();

	/**
	 * Returns a new object of class '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality</em>'.
	 * @generated
	 */
	QCardinality createCardinality();

	/**
	 * Returns a new object of class '<em>Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion</em>'.
	 * @generated
	 */
	QConversion createConversion();

	/**
	 * Returns a new object of class '<em>Derived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived</em>'.
	 * @generated
	 */
	QDerived createDerived();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	QDomain createDomain();

	/**
	 * Returns a new object of class '<em>Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Format</em>'.
	 * @generated
	 */
	QFormat createFormat();

	/**
	 * Returns a new object of class '<em>Overlay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overlay</em>'.
	 * @generated
	 */
	QOverlay createOverlay();

	/**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
	QRange createRange();

	/**
	 * Returns a new object of class '<em>Remap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remap</em>'.
	 * @generated
	 */
	QRemap createRemap();

	/**
	 * Returns a new object of class '<em>Special</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Special</em>'.
	 * @generated
	 */
	QSpecial createSpecial();

	/**
	 * Returns a new object of class '<em>Special Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Special Element</em>'.
	 * @generated
	 */
	QSpecialElement createSpecialElement();

	/**
	 * Returns a new object of class '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subject</em>'.
	 * @generated
	 */
	QSubject createSubject();

	/**
	 * Returns a new object of class '<em>Verb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verb</em>'.
	 * @generated
	 */
	QVerb createVerb();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QIntegratedLanguageCorePackage getIntegratedLanguageCorePackage();

} //QIntegratedLanguageCoreFactory
