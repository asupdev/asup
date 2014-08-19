/**
 */
package org.asup.dk.source.impl;

import org.asup.dk.source.*;

import org.eclipse.emf.ecore.EClass;
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
public class DevelopmentKitSourceFactoryImpl extends EFactoryImpl implements QDevelopmentKitSourceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QDevelopmentKitSourceFactory init() {
		try {
			QDevelopmentKitSourceFactory theDevelopmentKitSourceFactory = (QDevelopmentKitSourceFactory)EPackage.Registry.INSTANCE.getEFactory(QDevelopmentKitSourcePackage.eNS_URI);
			if (theDevelopmentKitSourceFactory != null) {
				return theDevelopmentKitSourceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevelopmentKitSourceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentKitSourceFactoryImpl() {
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
			case QDevelopmentKitSourcePackage.SOURCE_ENTRY: return (EObject)createSourceEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSourceEntry createSourceEntry() {
		SourceEntryImpl sourceEntry = new SourceEntryImpl();
		return sourceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDevelopmentKitSourcePackage getDevelopmentKitSourcePackage() {
		return (QDevelopmentKitSourcePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDevelopmentKitSourcePackage getPackage() {
		return QDevelopmentKitSourcePackage.eINSTANCE;
	}

} //DKSourceFactoryImpl
