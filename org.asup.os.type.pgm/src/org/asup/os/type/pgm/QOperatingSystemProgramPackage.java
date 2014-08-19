/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.pgm;

import org.asup.fw.core.QFrameworkCorePackage;
import org.asup.os.core.QOperatingSystemCorePackage;
import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.asup.os.type.pgm.QOperatingSystemProgramFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemProgramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pgm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type/pgm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type-pgm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemProgramPackage eINSTANCE = org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.impl.ActivationGroupImpl <em>Activation Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.ActivationGroupImpl
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getActivationGroup()
	 * @generated
	 */
	int ACTIVATION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Framework Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP__FRAMEWORK_CONTEXT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP__NAME = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP__PROGRAMS = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.impl.ActivationGroupManagerImpl <em>Activation Group Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.ActivationGroupManagerImpl
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getActivationGroupManager()
	 * @generated
	 */
	int ACTIVATION_GROUP_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP_MANAGER__CONFIG = QFrameworkCorePackage.SERVICE__CONFIG;

	/**
	 * The number of structural features of the '<em>Activation Group Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GROUP_MANAGER_FEATURE_COUNT = QFrameworkCorePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.ProgramImpl
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 4;

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.impl.CallableProgramImpl <em>Callable Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.CallableProgramImpl
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getCallableProgram()
	 * @generated
	 */
	int CALLABLE_PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>QActivation Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM__QACTIVATION_GROUP = QOperatingSystemCorePackage.CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QEntry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM__QENTRY = QOperatingSystemCorePackage.CALLABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>QProgram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM__QPROGRAM = QOperatingSystemCorePackage.CALLABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Callable Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM_FEATURE_COUNT = QOperatingSystemCorePackage.CALLABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.QCallableProgramDelegator <em>Callable Program Delegator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.QCallableProgramDelegator
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getCallableProgramDelegator()
	 * @generated
	 */
	int CALLABLE_PROGRAM_DELEGATOR = 3;

	/**
	 * The number of structural features of the '<em>Callable Program Delegator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_PROGRAM_DELEGATOR_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ATTRIBUTE = QOperatingSystemTypePackage.TYPED_OBJECT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__MEMORY_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Activation Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ACTIVATION_GROUP = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ADDRESS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CREATION_PARAMS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SOURCE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.impl.ProgramContainerImpl <em>Program Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.ProgramContainerImpl
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramContainer()
	 * @generated
	 */
	int PROGRAM_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__CONTENTS = QOperatingSystemTypePackage.TYPED_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__NAME = QOperatingSystemTypePackage.TYPED_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__TEXT = QOperatingSystemTypePackage.TYPED_CONTAINER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__VERSION = QOperatingSystemTypePackage.TYPED_CONTAINER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__VENDOR = QOperatingSystemTypePackage.TYPED_CONTAINER__VENDOR;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__BASE_PACKAGE = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scan Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER__SCAN_PACKAGE = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONTAINER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.impl.ProgramManagerImpl <em>Program Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.ProgramManagerImpl
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramManager()
	 * @generated
	 */
	int PROGRAM_MANAGER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGER__NAME = QOperatingSystemTypePackage.TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGER__TEXT = QOperatingSystemTypePackage.TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGER__VERSION = QOperatingSystemTypePackage.TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGER__VENDOR = QOperatingSystemTypePackage.TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGER__CONFIG = QOperatingSystemTypePackage.TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>Program Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_MANAGER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.impl.ProgramSourceImpl <em>Program Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.ProgramSourceImpl
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramSource()
	 * @generated
	 */
	int PROGRAM_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SOURCE__TYPE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SOURCE__CONTENT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SOURCE_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.impl.ProgramStackImpl <em>Program Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.ProgramStackImpl
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStack()
	 * @generated
	 */
	int PROGRAM_STACK = 8;

	/**
	 * The feature id for the '<em><b>Date Enter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STACK__DATE_ENTER = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STACK__DATE_EXIT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STACK_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.pgm.impl.ProgramStatusImpl <em>Program Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.ProgramStatusImpl
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStatus()
	 * @generated
	 */
	int PROGRAM_STATUS = 9;

	/**
	 * The feature id for the '<em><b>Callable Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATUS__CALLABLE_PROGRAM = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATUS_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Parameter List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 10;

	/**
	 * The meta object id for the '<em>Operating System Runtime Program Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.pgm.OperatingSystemRuntimeProgramException
	 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getOperatingSystemRuntimeProgramException()
	 * @generated
	 */
	int OPERATING_SYSTEM_RUNTIME_PROGRAM_EXCEPTION = 11;


	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Group</em>'.
	 * @see org.asup.os.type.pgm.QActivationGroup
	 * @generated
	 */
	EClass getActivationGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.pgm.QActivationGroup#getFrameworkContext <em>Framework Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Framework Context</em>'.
	 * @see org.asup.os.type.pgm.QActivationGroup#getFrameworkContext()
	 * @see #getActivationGroup()
	 * @generated
	 */
	EReference getActivationGroup_FrameworkContext();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QActivationGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.type.pgm.QActivationGroup#getName()
	 * @see #getActivationGroup()
	 * @generated
	 */
	EAttribute getActivationGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.type.pgm.QActivationGroup#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see org.asup.os.type.pgm.QActivationGroup#getPrograms()
	 * @see #getActivationGroup()
	 * @generated
	 */
	EReference getActivationGroup_Programs();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QActivationGroupManager <em>Activation Group Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Group Manager</em>'.
	 * @see org.asup.os.type.pgm.QActivationGroupManager
	 * @generated
	 */
	EClass getActivationGroupManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.asup.os.type.pgm.QProgram
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QProgram#getActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Group</em>'.
	 * @see org.asup.os.type.pgm.QProgram#getActivationGroup()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_ActivationGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QProgram#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.asup.os.type.pgm.QProgram#getAddress()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Address();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.os.type.pgm.QProgram#getCreationParams <em>Creation Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Creation Params</em>'.
	 * @see org.asup.os.type.pgm.QProgram#getCreationParams()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_CreationParams();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.pgm.QProgram#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.asup.os.type.pgm.QProgram#getSource()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Source();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QCallableProgram <em>Callable Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Program</em>'.
	 * @see org.asup.os.type.pgm.QCallableProgram
	 * @generated
	 */
	EClass getCallableProgram();

	/**
	 * Returns the meta object for the container reference '{@link org.asup.os.type.pgm.QCallableProgram#getQActivationGroup <em>QActivation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>QActivation Group</em>'.
	 * @see org.asup.os.type.pgm.QCallableProgram#getQActivationGroup()
	 * @see #getCallableProgram()
	 * @generated
	 */
	EReference getCallableProgram_QActivationGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QCallableProgram#getQEntry <em>QEntry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QEntry</em>'.
	 * @see org.asup.os.type.pgm.QCallableProgram#getQEntry()
	 * @see #getCallableProgram()
	 * @generated
	 */
	EAttribute getCallableProgram_QEntry();

	/**
	 * Returns the meta object for the reference '{@link org.asup.os.type.pgm.QCallableProgram#getQProgram <em>QProgram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>QProgram</em>'.
	 * @see org.asup.os.type.pgm.QCallableProgram#getQProgram()
	 * @see #getCallableProgram()
	 * @generated
	 */
	EReference getCallableProgram_QProgram();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QCallableProgramDelegator <em>Callable Program Delegator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Program Delegator</em>'.
	 * @see org.asup.os.type.pgm.QCallableProgramDelegator
	 * @generated
	 */
	EClass getCallableProgramDelegator();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QProgramContainer <em>Program Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Container</em>'.
	 * @see org.asup.os.type.pgm.QProgramContainer
	 * @generated
	 */
	EClass getProgramContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QProgramContainer#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.asup.os.type.pgm.QProgramContainer#getBasePackage()
	 * @see #getProgramContainer()
	 * @generated
	 */
	EAttribute getProgramContainer_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QProgramContainer#isScanPackage <em>Scan Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan Package</em>'.
	 * @see org.asup.os.type.pgm.QProgramContainer#isScanPackage()
	 * @see #getProgramContainer()
	 * @generated
	 */
	EAttribute getProgramContainer_ScanPackage();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QProgramManager <em>Program Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Manager</em>'.
	 * @see org.asup.os.type.pgm.QProgramManager
	 * @generated
	 */
	EClass getProgramManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QProgramSource <em>Program Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Source</em>'.
	 * @see org.asup.os.type.pgm.QProgramSource
	 * @generated
	 */
	EClass getProgramSource();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QProgramSource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.os.type.pgm.QProgramSource#getType()
	 * @see #getProgramSource()
	 * @generated
	 */
	EAttribute getProgramSource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QProgramSource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.asup.os.type.pgm.QProgramSource#getContent()
	 * @see #getProgramSource()
	 * @generated
	 */
	EAttribute getProgramSource_Content();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QProgramStack <em>Program Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Stack</em>'.
	 * @see org.asup.os.type.pgm.QProgramStack
	 * @generated
	 */
	EClass getProgramStack();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QProgramStack#getDateEnter <em>Date Enter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Enter</em>'.
	 * @see org.asup.os.type.pgm.QProgramStack#getDateEnter()
	 * @see #getProgramStack()
	 * @generated
	 */
	EAttribute getProgramStack_DateEnter();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.pgm.QProgramStack#getDateExit <em>Date Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Exit</em>'.
	 * @see org.asup.os.type.pgm.QProgramStack#getDateExit()
	 * @see #getProgramStack()
	 * @generated
	 */
	EAttribute getProgramStack_DateExit();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.pgm.QProgramStatus <em>Program Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Status</em>'.
	 * @see org.asup.os.type.pgm.QProgramStatus
	 * @generated
	 */
	EClass getProgramStatus();

	/**
	 * Returns the meta object for the reference '{@link org.asup.os.type.pgm.QProgramStatus#getCallableProgram <em>Callable Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callable Program</em>'.
	 * @see org.asup.os.type.pgm.QProgramStatus#getCallableProgram()
	 * @see #getProgramStatus()
	 * @generated
	 */
	EReference getProgramStatus_CallableProgram();

	/**
	 * Returns the meta object for data type '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parameter List</em>'.
	 * @model instanceClass="org.asup.il.data.QData[]"
	 * @generated
	 */
	EDataType getParameterList();

	/**
	 * Returns the meta object for data type '{@link org.asup.os.type.pgm.OperatingSystemRuntimeProgramException <em>Operating System Runtime Program Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operating System Runtime Program Exception</em>'.
	 * @see org.asup.os.type.pgm.OperatingSystemRuntimeProgramException
	 * @model instanceClass="org.asup.os.type.pgm.OperatingSystemRuntimeProgramException" serializeable="false"
	 * @generated
	 */
	EDataType getOperatingSystemRuntimeProgramException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemProgramFactory getOperatingSystemProgramFactory();

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
		 * The meta object literal for the '{@link org.asup.os.type.pgm.impl.ActivationGroupImpl <em>Activation Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.ActivationGroupImpl
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getActivationGroup()
		 * @generated
		 */
		EClass ACTIVATION_GROUP = eINSTANCE.getActivationGroup();

		/**
		 * The meta object literal for the '<em><b>Framework Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_GROUP__FRAMEWORK_CONTEXT = eINSTANCE.getActivationGroup_FrameworkContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_GROUP__NAME = eINSTANCE.getActivationGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_GROUP__PROGRAMS = eINSTANCE.getActivationGroup_Programs();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.pgm.impl.ActivationGroupManagerImpl <em>Activation Group Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.ActivationGroupManagerImpl
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getActivationGroupManager()
		 * @generated
		 */
		EClass ACTIVATION_GROUP_MANAGER = eINSTANCE.getActivationGroupManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.pgm.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.ProgramImpl
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Activation Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__ACTIVATION_GROUP = eINSTANCE.getProgram_ActivationGroup();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__ADDRESS = eINSTANCE.getProgram_Address();

		/**
		 * The meta object literal for the '<em><b>Creation Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__CREATION_PARAMS = eINSTANCE.getProgram_CreationParams();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SOURCE = eINSTANCE.getProgram_Source();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.pgm.impl.CallableProgramImpl <em>Callable Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.CallableProgramImpl
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getCallableProgram()
		 * @generated
		 */
		EClass CALLABLE_PROGRAM = eINSTANCE.getCallableProgram();

		/**
		 * The meta object literal for the '<em><b>QActivation Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_PROGRAM__QACTIVATION_GROUP = eINSTANCE.getCallableProgram_QActivationGroup();

		/**
		 * The meta object literal for the '<em><b>QEntry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_PROGRAM__QENTRY = eINSTANCE.getCallableProgram_QEntry();

		/**
		 * The meta object literal for the '<em><b>QProgram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_PROGRAM__QPROGRAM = eINSTANCE.getCallableProgram_QProgram();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.pgm.QCallableProgramDelegator <em>Callable Program Delegator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.QCallableProgramDelegator
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getCallableProgramDelegator()
		 * @generated
		 */
		EClass CALLABLE_PROGRAM_DELEGATOR = eINSTANCE.getCallableProgramDelegator();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.pgm.impl.ProgramContainerImpl <em>Program Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.ProgramContainerImpl
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramContainer()
		 * @generated
		 */
		EClass PROGRAM_CONTAINER = eINSTANCE.getProgramContainer();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_CONTAINER__BASE_PACKAGE = eINSTANCE.getProgramContainer_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Scan Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_CONTAINER__SCAN_PACKAGE = eINSTANCE.getProgramContainer_ScanPackage();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.pgm.impl.ProgramManagerImpl <em>Program Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.ProgramManagerImpl
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramManager()
		 * @generated
		 */
		EClass PROGRAM_MANAGER = eINSTANCE.getProgramManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.pgm.impl.ProgramSourceImpl <em>Program Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.ProgramSourceImpl
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramSource()
		 * @generated
		 */
		EClass PROGRAM_SOURCE = eINSTANCE.getProgramSource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_SOURCE__TYPE = eINSTANCE.getProgramSource_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_SOURCE__CONTENT = eINSTANCE.getProgramSource_Content();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.pgm.impl.ProgramStackImpl <em>Program Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.ProgramStackImpl
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStack()
		 * @generated
		 */
		EClass PROGRAM_STACK = eINSTANCE.getProgramStack();

		/**
		 * The meta object literal for the '<em><b>Date Enter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_STACK__DATE_ENTER = eINSTANCE.getProgramStack_DateEnter();

		/**
		 * The meta object literal for the '<em><b>Date Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_STACK__DATE_EXIT = eINSTANCE.getProgramStack_DateExit();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.pgm.impl.ProgramStatusImpl <em>Program Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.ProgramStatusImpl
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getProgramStatus()
		 * @generated
		 */
		EClass PROGRAM_STATUS = eINSTANCE.getProgramStatus();

		/**
		 * The meta object literal for the '<em><b>Callable Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_STATUS__CALLABLE_PROGRAM = eINSTANCE.getProgramStatus_CallableProgram();

		/**
		 * The meta object literal for the '<em>Parameter List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getParameterList()
		 * @generated
		 */
		EDataType PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '<em>Operating System Runtime Program Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.pgm.OperatingSystemRuntimeProgramException
		 * @see org.asup.os.type.pgm.impl.OperatingSystemProgramPackageImpl#getOperatingSystemRuntimeProgramException()
		 * @generated
		 */
		EDataType OPERATING_SYSTEM_RUNTIME_PROGRAM_EXCEPTION = eINSTANCE.getOperatingSystemRuntimeProgramException();

	}

} //OSProgramCorePackage
