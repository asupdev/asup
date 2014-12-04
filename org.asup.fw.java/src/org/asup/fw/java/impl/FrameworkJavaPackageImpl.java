/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.fw.java.impl;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

import java.lang.Iterable;

import java.lang.annotation.Annotation;

import java.lang.reflect.Type;

import java.net.URI;
import java.net.URL;

import java.util.Dictionary;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.Properties;
import org.asup.fw.java.QFrameworkJavaFactory;
import org.asup.fw.java.QFrameworkJavaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameworkJavaPackageImpl extends EPackageImpl implements QFrameworkJavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaAnnotationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaCloseableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaDictionaryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaInputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaIOExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaIterableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaIteratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaPropertiesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaOutputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaRunnableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaThrowableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaURLEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaWriterEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.asup.fw.java.QFrameworkJavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FrameworkJavaPackageImpl() {
		super(eNS_URI, QFrameworkJavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QFrameworkJavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QFrameworkJavaPackage init() {
		if (isInited) return (QFrameworkJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QFrameworkJavaPackage.eNS_URI);

		// Obtain or create and register package
		FrameworkJavaPackageImpl theFrameworkJavaPackage = (FrameworkJavaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FrameworkJavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FrameworkJavaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFrameworkJavaPackage.createPackageContents();

		// Initialize created meta-data
		theFrameworkJavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFrameworkJavaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QFrameworkJavaPackage.eNS_URI, theFrameworkJavaPackage);
		return theFrameworkJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaEnum() {
		return javaEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaList() {
		return javaListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaNumber() {
		return javaNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaAnnotation() {
		return javaAnnotationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaCloseable() {
		return javaCloseableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaDictionary() {
		return javaDictionaryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaException() {
		return javaExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaInputStream() {
		return javaInputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaIOException() {
		return javaIOExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaIterable() {
		return javaIterableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaIterator() {
		return javaIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaMap() {
		return javaMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaProperties() {
		return javaPropertiesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaOutputStream() {
		return javaOutputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaRunnable() {
		return javaRunnableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaType() {
		return javaTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaThrowable() {
		return javaThrowableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaURI() {
		return javaURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaURL() {
		return javaURLEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaWriter() {
		return javaWriterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFrameworkJavaFactory getFrameworkJavaFactory() {
		return (QFrameworkJavaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		javaEnumEClass = createEClass(JAVA_ENUM);

		javaListEClass = createEClass(JAVA_LIST);

		javaNumberEClass = createEClass(JAVA_NUMBER);

		// Create data types
		javaAnnotationEDataType = createEDataType(JAVA_ANNOTATION);
		javaCloseableEDataType = createEDataType(JAVA_CLOSEABLE);
		javaDictionaryEDataType = createEDataType(JAVA_DICTIONARY);
		javaExceptionEDataType = createEDataType(JAVA_EXCEPTION);
		javaInputStreamEDataType = createEDataType(JAVA_INPUT_STREAM);
		javaIOExceptionEDataType = createEDataType(JAVA_IO_EXCEPTION);
		javaIterableEDataType = createEDataType(JAVA_ITERABLE);
		javaIteratorEDataType = createEDataType(JAVA_ITERATOR);
		javaMapEDataType = createEDataType(JAVA_MAP);
		javaPropertiesEDataType = createEDataType(JAVA_PROPERTIES);
		javaOutputStreamEDataType = createEDataType(JAVA_OUTPUT_STREAM);
		javaRunnableEDataType = createEDataType(JAVA_RUNNABLE);
		javaTypeEDataType = createEDataType(JAVA_TYPE);
		javaThrowableEDataType = createEDataType(JAVA_THROWABLE);
		javaURIEDataType = createEDataType(JAVA_URI);
		javaURLEDataType = createEDataType(JAVA_URL);
		javaWriterEDataType = createEDataType(JAVA_WRITER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(javaDictionaryEDataType, "K");
		addETypeParameter(javaDictionaryEDataType, "V");
		addETypeParameter(javaMapEDataType, "K");
		addETypeParameter(javaMapEDataType, "V");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(javaEnumEClass, Enum.class, "JavaEnum", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Enum<E>");

		initEClass(javaListEClass, List.class, "JavaList", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<E>");

		initEClass(javaNumberEClass, Number.class, "JavaNumber", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(javaAnnotationEDataType, Annotation.class, "JavaAnnotation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaCloseableEDataType, Closeable.class, "JavaCloseable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaDictionaryEDataType, Dictionary.class, "JavaDictionary", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaExceptionEDataType, Exception.class, "JavaException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaInputStreamEDataType, InputStream.class, "JavaInputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaIOExceptionEDataType, IOException.class, "JavaIOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaIterableEDataType, Iterable.class, "JavaIterable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Iterable<T>");
		initEDataType(javaIteratorEDataType, Iterator.class, "JavaIterator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Iterator<T>");
		initEDataType(javaMapEDataType, Map.class, "JavaMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaPropertiesEDataType, Properties.class, "JavaProperties", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaOutputStreamEDataType, OutputStream.class, "JavaOutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaRunnableEDataType, Runnable.class, "JavaRunnable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaTypeEDataType, Type.class, "JavaType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaThrowableEDataType, Throwable.class, "JavaThrowable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaURIEDataType, URI.class, "JavaURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaURLEDataType, URL.class, "JavaURL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaWriterEDataType, Writer.class, "JavaWriter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FrameworkJavaPackageImpl
