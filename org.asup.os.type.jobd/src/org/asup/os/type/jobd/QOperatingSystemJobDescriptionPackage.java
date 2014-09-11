/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.jobd;

import org.asup.os.type.QOperatingSystemTypePackage;
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
 * @see org.asup.os.type.jobd.QOperatingSystemJobDescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemJobDescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type/jobd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type-jobd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemJobDescriptionPackage eINSTANCE = org.asup.os.type.jobd.impl.OperatingSystemJobDescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.jobd.impl.JobDescriptionImpl <em>Job Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.jobd.impl.JobDescriptionImpl
	 * @see org.asup.os.type.jobd.impl.OperatingSystemJobDescriptionPackageImpl#getJobDescription()
	 * @generated
	 */
	int JOB_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__ATTRIBUTE = QOperatingSystemTypePackage.TYPED_OBJECT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__MEMORY_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Job Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__JOB_QUEUE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job Priority On Jobq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__JOB_PRIORITY_ON_JOBQ = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Priority On Outq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__OUTPUT_PRIORITY_ON_OUTQ = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__OUT_QUEUE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__USER = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION__LIBRARIES = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Job Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.asup.os.type.jobd.impl.JobDescriptionManagerImpl <em>Job Description Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.jobd.impl.JobDescriptionManagerImpl
	 * @see org.asup.os.type.jobd.impl.OperatingSystemJobDescriptionPackageImpl#getJobDescriptionManager()
	 * @generated
	 */
	int JOB_DESCRIPTION_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_MANAGER__NAME = QOperatingSystemTypePackage.TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_MANAGER__TEXT = QOperatingSystemTypePackage.TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_MANAGER__VERSION = QOperatingSystemTypePackage.TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_MANAGER__VENDOR = QOperatingSystemTypePackage.TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_MANAGER__CONFIG = QOperatingSystemTypePackage.TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>Job Description Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_DESCRIPTION_MANAGER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_MANAGER_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.jobd.QJobDescription <em>Job Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Description</em>'.
	 * @see org.asup.os.type.jobd.QJobDescription
	 * @generated
	 */
	EClass getJobDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.os.type.jobd.QJobDescription#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Libraries</em>'.
	 * @see org.asup.os.type.jobd.QJobDescription#getLibraries()
	 * @see #getJobDescription()
	 * @generated
	 */
	EAttribute getJobDescription_Libraries();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.jobd.QJobDescription#getJobQueue <em>Job Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Queue</em>'.
	 * @see org.asup.os.type.jobd.QJobDescription#getJobQueue()
	 * @see #getJobDescription()
	 * @generated
	 */
	EReference getJobDescription_JobQueue();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.jobd.QJobDescription#getJobPriorityOnJobq <em>Job Priority On Jobq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Priority On Jobq</em>'.
	 * @see org.asup.os.type.jobd.QJobDescription#getJobPriorityOnJobq()
	 * @see #getJobDescription()
	 * @generated
	 */
	EAttribute getJobDescription_JobPriorityOnJobq();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.jobd.QJobDescription#getOutputPriorityOnOutq <em>Output Priority On Outq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Priority On Outq</em>'.
	 * @see org.asup.os.type.jobd.QJobDescription#getOutputPriorityOnOutq()
	 * @see #getJobDescription()
	 * @generated
	 */
	EAttribute getJobDescription_OutputPriorityOnOutq();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.jobd.QJobDescription#getOutQueue <em>Out Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Queue</em>'.
	 * @see org.asup.os.type.jobd.QJobDescription#getOutQueue()
	 * @see #getJobDescription()
	 * @generated
	 */
	EReference getJobDescription_OutQueue();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.jobd.QJobDescription#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.asup.os.type.jobd.QJobDescription#getUser()
	 * @see #getJobDescription()
	 * @generated
	 */
	EAttribute getJobDescription_User();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.jobd.QJobDescriptionManager <em>Job Description Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Description Manager</em>'.
	 * @see org.asup.os.type.jobd.QJobDescriptionManager
	 * @generated
	 */
	EClass getJobDescriptionManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemJobDescriptionFactory getOperatingSystemJobDescriptionFactory();

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
		 * The meta object literal for the '{@link org.asup.os.type.jobd.impl.JobDescriptionImpl <em>Job Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.jobd.impl.JobDescriptionImpl
		 * @see org.asup.os.type.jobd.impl.OperatingSystemJobDescriptionPackageImpl#getJobDescription()
		 * @generated
		 */
		EClass JOB_DESCRIPTION = eINSTANCE.getJobDescription();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_DESCRIPTION__LIBRARIES = eINSTANCE.getJobDescription_Libraries();

		/**
		 * The meta object literal for the '<em><b>Job Queue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_DESCRIPTION__JOB_QUEUE = eINSTANCE.getJobDescription_JobQueue();

		/**
		 * The meta object literal for the '<em><b>Job Priority On Jobq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_DESCRIPTION__JOB_PRIORITY_ON_JOBQ = eINSTANCE.getJobDescription_JobPriorityOnJobq();

		/**
		 * The meta object literal for the '<em><b>Output Priority On Outq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_DESCRIPTION__OUTPUT_PRIORITY_ON_OUTQ = eINSTANCE.getJobDescription_OutputPriorityOnOutq();

		/**
		 * The meta object literal for the '<em><b>Out Queue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_DESCRIPTION__OUT_QUEUE = eINSTANCE.getJobDescription_OutQueue();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_DESCRIPTION__USER = eINSTANCE.getJobDescription_User();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.jobd.impl.JobDescriptionManagerImpl <em>Job Description Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.jobd.impl.JobDescriptionManagerImpl
		 * @see org.asup.os.type.jobd.impl.OperatingSystemJobDescriptionPackageImpl#getJobDescriptionManager()
		 * @generated
		 */
		EClass JOB_DESCRIPTION_MANAGER = eINSTANCE.getJobDescriptionManager();

	}

} //OSJobDescriptionCorePackage
