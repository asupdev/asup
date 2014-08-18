/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.data.impl;

import org.asup.il.core.impl.DictionaryImpl;
import org.asup.il.data.QDataDictionary;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QData Dictionary</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataDictionaryImpl extends DictionaryImpl<QDataTerm<?>> implements
		QDataDictionary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDictionaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataPackage.Literals.DATA_DICTIONARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	/*public QDataTerm<?> findDataTerm(String name) {
		String n = "";
		String m = "";

		CharacterIterator it = new StringCharacterIterator(name);
		String status = "name";
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
			// function
			if (ch == '(') {
				break;
			}
			if (ch == '.') {
				status = "member";
				continue;
			}
			if (ch == '[') {
				status = "index";
				continue;
			}
			if (ch == ']') {
				break;
			}
			if (status.equals("name"))
				n += ch;
			else if (status.equals("member"))
				m += ch;
		}

		if (n.equals(""))
			n = null;
		if (m.equals(""))
			m = null;

		QDataTerm<?> data = getDataTerm(n);

		// search on owner
		// if (data == null && getParent() != null) return
		// getParent().findDataTerm(name);

		if (data == null)
			return null;

		// structured data
		if (m != null)
			return ((QDataStructureDef) data).getElement(m);

		return data;

	}*/

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public QDataTerm<?> getDataTerm(String element) {

		QDataTerm<?> dataDefinition = null;

		for (QDataTerm<?> definition : getTerms()) {
			if (definition.getName().equals(element)) {
				dataDefinition = definition;
				break;
			}
		}

		return dataDefinition;
	}

} // DataDictionaryImpl
