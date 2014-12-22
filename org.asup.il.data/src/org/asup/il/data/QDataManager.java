/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data;

import java.lang.String;
import java.util.List;

import org.asup.fw.core.QContextProvider;
import org.asup.fw.core.QService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.data.QIntegratedLanguageDataPackage#getDataManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDataManager extends QService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true" dataTermsMany="true"
	 * @generated
	 */
	QDataContainer createDataContainer(QContextProvider contextProvider, List<QDataTerm<?>> dataTerms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true"
	 * @generated
	 */
	QDataFactory createFactory(QContextProvider contextProvider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QDataDictionary lookupDictionary(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dictionaryRequired="true"
	 * @generated
	 */
	void registerDictionary(QDataDictionary dictionary);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerRequired="true"
	 * @generated
	 */
	void validateDataContainer(QDataContainer container);

} // QDataManager
