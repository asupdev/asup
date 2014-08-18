/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.core.impl;

import org.asup.il.core.FormatType;
import org.asup.il.core.QCardinality;
import org.asup.il.core.QDomain;
import org.asup.il.core.QFormat;
import org.asup.il.core.QIntegratedLanguageCoreFactory;
import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.core.QOverlay;
import org.asup.il.core.QRange;
import org.asup.il.core.QSpecial;
import org.asup.il.core.QSpecialElement;
import org.asup.il.core.QSubject;
import org.asup.il.core.QVerb;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageCoreFactoryImpl extends EFactoryImpl implements QIntegratedLanguageCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageCoreFactory init() {
		try {
			QIntegratedLanguageCoreFactory theIntegratedLanguageCoreFactory = (QIntegratedLanguageCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageCorePackage.eNS_URI);
			if (theIntegratedLanguageCoreFactory != null) {
				return theIntegratedLanguageCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QIntegratedLanguageCorePackage.CARDINALITY: return (EObject)createCardinality();
			case QIntegratedLanguageCorePackage.DOMAIN: return (EObject)createDomain();
			case QIntegratedLanguageCorePackage.FORMAT: return (EObject)createFormat();
			case QIntegratedLanguageCorePackage.OVERLAY: return (EObject)createOverlay();
			case QIntegratedLanguageCorePackage.RANGE: return (EObject)createRange();
			case QIntegratedLanguageCorePackage.SPECIAL: return (EObject)createSpecial();
			case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT: return (EObject)createSpecialElement();
			case QIntegratedLanguageCorePackage.SUBJECT: return (EObject)createSubject();
			case QIntegratedLanguageCorePackage.VERB: return (EObject)createVerb();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageCorePackage.FORMAT_TYPE:
				return createFormatTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageCorePackage.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDomain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFormat createFormat() {
		FormatImpl format = new FormatImpl();
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOverlay createOverlay() {
		OverlayImpl overlay = new OverlayImpl();
		return overlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRange createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSpecial createSpecial() {
		SpecialImpl special = new SpecialImpl();
		return special;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSpecialElement createSpecialElement() {
		SpecialElementImpl specialElement = new SpecialElementImpl();
		return specialElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSubject createSubject() {
		SubjectImpl subject = new SubjectImpl();
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVerb createVerb() {
		VerbImpl verb = new VerbImpl();
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageCorePackage getIntegratedLanguageCorePackage() {
		return (QIntegratedLanguageCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageCorePackage getPackage() {
		return QIntegratedLanguageCorePackage.eINSTANCE;
	}

} //IntegratedLanguageCoreFactoryImpl
