/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.il.data.nio;

import java.util.ArrayList;
import java.util.List;

import org.asup.fw.core.QContextProvider;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.il.data.QDataContainer;
import org.asup.il.data.QDataDictionary;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataTerm;

public class NIODataManagerImpl extends ServiceImpl implements QDataManager {
	
	private List<QDataDictionary> dictionaries = new ArrayList<QDataDictionary>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataContainer createDataContainer(QContextProvider contextProvider, List<QDataTerm<?>> dataTerms) {
		return new NIODataContainerImpl(createFactory(contextProvider), dataTerms);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataFactory createFactory(QContextProvider contextProvider) {
		return new NIODataFactoryImpl(contextProvider.getContext());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataDictionary lookupDictionary(String name) {
		for (QDataDictionary dictionary : dictionaries) {
			if (dictionary.getName().equals(name))
				return dictionary;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerDictionary(QDataDictionary dictionary) {
		dictionaries.add(dictionary);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void validateDataContainer(QDataContainer dataContainer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
}
