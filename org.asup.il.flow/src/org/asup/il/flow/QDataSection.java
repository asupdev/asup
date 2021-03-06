/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow;

import java.util.List;

import org.asup.il.data.QDataTerm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.asup.il.flow.QDataSection#getDatas <em>Datas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getDataSection()
 * @model
 * @generated
 */
public interface QDataSection extends QUnitSection {

	/**
	 * Returns the value of the '<em><b>Datas</b></em>' containment reference list.
	 * The list contents are of type {@link org.asup.il.data.QDataTerm}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datas</em>' containment reference list.
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#getDataSection_Datas()
	 * @model containment="true"
	 * @generated
	 */
	List<QDataTerm<?>> getDatas();
} // QDataSection
