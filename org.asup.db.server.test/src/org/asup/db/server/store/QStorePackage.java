/**
 */
package org.asup.db.server.store;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.db.server.store.QStoreFactory
 * @model kind="package"
 * @generated
 */
public interface QStorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "store";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/store";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "store";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QStorePackage eINSTANCE = org.asup.db.server.store.impl.StorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.db.server.store.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.server.store.impl.UserImpl
	 * @see org.asup.db.server.store.impl.StorePackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Workstation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__WORKSTATION = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.server.store.impl.WorkstationImpl <em>Workstation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.server.store.impl.WorkstationImpl
	 * @see org.asup.db.server.store.impl.StorePackageImpl#getWorkstation()
	 * @generated
	 */
	int WORKSTATION = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__OPERATING_SYSTEM = 1;

	/**
	 * The number of structural features of the '<em>Workstation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Workstation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.db.server.store.OperatingSystem <em>Operating System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.db.server.store.OperatingSystem
	 * @see org.asup.db.server.store.impl.StorePackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 2;


	/**
	 * Returns the meta object for class '{@link org.asup.db.server.store.QUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.asup.db.server.store.QUser
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.server.store.QUser#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.db.server.store.QUser#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.server.store.QUser#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.asup.db.server.store.QUser#getText()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.db.server.store.QUser#getWorkstation <em>Workstation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workstation</em>'.
	 * @see org.asup.db.server.store.QUser#getWorkstation()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Workstation();

	/**
	 * Returns the meta object for class '{@link org.asup.db.server.store.QWorkstation <em>Workstation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstation</em>'.
	 * @see org.asup.db.server.store.QWorkstation
	 * @generated
	 */
	EClass getWorkstation();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.server.store.QWorkstation#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.asup.db.server.store.QWorkstation#getModel()
	 * @see #getWorkstation()
	 * @generated
	 */
	EAttribute getWorkstation_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.db.server.store.QWorkstation#getOperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating System</em>'.
	 * @see org.asup.db.server.store.QWorkstation#getOperatingSystem()
	 * @see #getWorkstation()
	 * @generated
	 */
	EAttribute getWorkstation_OperatingSystem();

	/**
	 * Returns the meta object for enum '{@link org.asup.db.server.store.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operating System</em>'.
	 * @see org.asup.db.server.store.OperatingSystem
	 * @generated
	 */
	EEnum getOperatingSystem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QStoreFactory getStoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asup.db.server.store.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.server.store.impl.UserImpl
		 * @see org.asup.db.server.store.impl.StorePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__TEXT = eINSTANCE.getUser_Text();

		/**
		 * The meta object literal for the '<em><b>Workstation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__WORKSTATION = eINSTANCE.getUser_Workstation();

		/**
		 * The meta object literal for the '{@link org.asup.db.server.store.impl.WorkstationImpl <em>Workstation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.server.store.impl.WorkstationImpl
		 * @see org.asup.db.server.store.impl.StorePackageImpl#getWorkstation()
		 * @generated
		 */
		EClass WORKSTATION = eINSTANCE.getWorkstation();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTATION__MODEL = eINSTANCE.getWorkstation_Model();

		/**
		 * The meta object literal for the '<em><b>Operating System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSTATION__OPERATING_SYSTEM = eINSTANCE.getWorkstation_OperatingSystem();

		/**
		 * The meta object literal for the '{@link org.asup.db.server.store.OperatingSystem <em>Operating System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.db.server.store.OperatingSystem
		 * @see org.asup.db.server.store.impl.StorePackageImpl#getOperatingSystem()
		 * @generated
		 */
		EEnum OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

	}

} //QStorePackage
