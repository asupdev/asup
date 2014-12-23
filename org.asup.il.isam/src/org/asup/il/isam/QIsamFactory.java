/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.isam;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import org.asup.il.data.QDataStruct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Isam Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.il.isam.QIntegratedLanguageIsamPackage#getIsamFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QIsamFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataSetTermRequired="true"
	 * @generated
	 */
	QDataSet<?> createDataSet(QDataSetTerm dataSetTerm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataStructRequired="true"
	 * @generated
	 */
	<DS extends QDataStruct> QDataSet<DS> createDataSet(Class<DS> dataStruct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeDataType="org.asup.fw.java.JavaType" typeRequired="true" annotationsDataType="org.asup.fw.java.JavaAnnotation" annotationsRequired="true" annotationsMany="true"
	 * @generated
	 */
	QDataSetTerm createDataSetTerm(Type type, List<Annotation> annotations);

} // QIsamFactory
