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

import javax.inject.Inject;

import org.asup.fw.core.QContext;
import org.asup.fw.core.QContextID;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.il.data.QDataContext;
import org.asup.il.data.QDataDictionary;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataTerm;

public class NIODataManagerImpl extends ServiceImpl implements QDataManager {

	@Inject
	private QContext context;
	
	private List<QDataDictionary> dictionaries = new ArrayList<QDataDictionary>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataContext createContext(QContextID contextID, List<QDataTerm<?>> dataTerms) {
		return new NIODataContextImpl(contextID, createFactory(contextID), dataTerms);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public QDataFactory createFactory(QContextID contextID) {
		return new NIODataFactoryImpl(context, contextID, null);
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
	public void validateContext(QDataContext context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
}