/**
 */
package org.asup.dk.source;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.dk.source.QDevelopmentKitSourceFactory
 * @model kind="package"
 * @generated
 */
public interface QDevelopmentKitSourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "source";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/dk/source";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dk-source";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitSourcePackage eINSTANCE = org.asup.dk.source.impl.DevelopmentKitSourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.dk.source.impl.SourceEntryImpl <em>Source Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.source.impl.SourceEntryImpl
	 * @see org.asup.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceEntry()
	 * @generated
	 */
	int SOURCE_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ENTRY__LOCATION = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ENTRY__PARENT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ENTRY__ROOT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ENTRY_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.dk.source.impl.SourceManagerImpl <em>Source Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.dk.source.impl.SourceManagerImpl
	 * @see org.asup.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceManager()
	 * @generated
	 */
	int SOURCE_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Source Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.asup.dk.source.QSourceEntry <em>Source Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Entry</em>'.
	 * @see org.asup.dk.source.QSourceEntry
	 * @generated
	 */
	EClass getSourceEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.dk.source.QSourceEntry#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.asup.dk.source.QSourceEntry#getLocation()
	 * @see #getSourceEntry()
	 * @generated
	 */
	EAttribute getSourceEntry_Location();

	/**
	 * Returns the meta object for the reference '{@link org.asup.dk.source.QSourceEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.asup.dk.source.QSourceEntry#getParent()
	 * @see #getSourceEntry()
	 * @generated
	 */
	EReference getSourceEntry_Parent();

	/**
	 * Returns the meta object for the reference '{@link org.asup.dk.source.QSourceEntry#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.asup.dk.source.QSourceEntry#getRoot()
	 * @see #getSourceEntry()
	 * @generated
	 */
	EReference getSourceEntry_Root();

	/**
	 * Returns the meta object for class '{@link org.asup.dk.source.QSourceManager <em>Source Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Manager</em>'.
	 * @see org.asup.dk.source.QSourceManager
	 * @generated
	 */
	EClass getSourceManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDevelopmentKitSourceFactory getDevelopmentKitSourceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.dk.source.impl.SourceEntryImpl <em>Source Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.source.impl.SourceEntryImpl
		 * @see org.asup.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceEntry()
		 * @generated
		 */
		EClass SOURCE_ENTRY = eINSTANCE.getSourceEntry();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_ENTRY__LOCATION = eINSTANCE.getSourceEntry_Location();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ENTRY__PARENT = eINSTANCE.getSourceEntry_Parent();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ENTRY__ROOT = eINSTANCE.getSourceEntry_Root();

		/**
		 * The meta object literal for the '{@link org.asup.dk.source.impl.SourceManagerImpl <em>Source Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.dk.source.impl.SourceManagerImpl
		 * @see org.asup.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceManager()
		 * @generated
		 */
		EClass SOURCE_MANAGER = eINSTANCE.getSourceManager();

	}

} //DKSourcePackage
