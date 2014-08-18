/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.core;

import java.lang.annotation.Annotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.asup.fw.core.QFrameworkCorePackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface QContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.core.FrameowrkCoreRuntimeException"
	 * @generated
	 */
	QContext createChild() throws FrameworkCoreRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" clazzRequired="true"
	 * @generated
	 */
	<T> T get(Class<T> clazz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.core.FrameowrkCoreRuntimeException" objectRequired="true"
	 * @generated
	 */
	void inject(Object object) throws FrameworkCoreRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextIDRequired="true" addressRequired="true"
	 * @generated
	 */
	Class<?> loadClass(QContextID contextID, String address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.core.FrameowrkCoreRuntimeException" objectRequired="true" qualifierRequired="true" ABounds="org.asup.fw.java.JavaAnnotation"
	 * @generated
	 */
	<A extends Annotation> void invoke(Object object, Class<A> qualifier) throws FrameworkCoreRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.asup.fw.core.FrameowrkCoreRuntimeException" klassRequired="true"
	 * @generated
	 */
	<T> T make(Class<T> klass) throws FrameworkCoreRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.core.FrameowrkCoreRuntimeException" klassRequired="true" objectRequired="true"
	 * @generated
	 */
	<T> void set(Class<T> klass, T object) throws FrameworkCoreRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.asup.fw.core.FrameowrkCoreRuntimeException" nameRequired="true" objectRequired="true"
	 * @generated
	 */
	<T> void set(String name, T object) throws FrameworkCoreRuntimeException;

} // QContext
