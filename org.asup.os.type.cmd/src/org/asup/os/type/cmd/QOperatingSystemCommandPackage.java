/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.type.cmd;

import org.asup.os.omac.QOperatingSystemOmacPackage;
import org.asup.os.type.QOperatingSystemTypePackage;
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
 * @see org.asup.os.type.cmd.QOperatingSystemCommandFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemCommandPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cmd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/os/type/cmd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-type-cmd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemCommandPackage eINSTANCE = org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.os.type.cmd.impl.CallableCommandImpl <em>Callable Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.cmd.impl.CallableCommandImpl
	 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCallableCommand()
	 * @generated
	 */
	int CALLABLE_COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND__COMMAND = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND__COMMAND_STRING = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND__VARIABLES = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND__DATA_CONTEXT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Callable Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_COMMAND_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.asup.os.type.cmd.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.cmd.impl.CommandImpl
	 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ATTRIBUTE = QOperatingSystemTypePackage.TYPED_OBJECT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Memory Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__MEMORY_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__MEMORY_INFO;

	/**
	 * The feature id for the '<em><b>Allow Batch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ALLOW_BATCH = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PARAMETERS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PROGRAM = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__SOURCE = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__STATUS = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.asup.os.type.cmd.impl.CommandContainerImpl <em>Command Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.cmd.impl.CommandContainerImpl
	 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandContainer()
	 * @generated
	 */
	int COMMAND_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER__CONTENTS = QOperatingSystemTypePackage.TYPED_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER__NAME = QOperatingSystemTypePackage.TYPED_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER__TEXT = QOperatingSystemTypePackage.TYPED_CONTAINER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER__VERSION = QOperatingSystemTypePackage.TYPED_CONTAINER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER__VENDOR = QOperatingSystemTypePackage.TYPED_CONTAINER__VENDOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER__TYPE = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.os.type.cmd.impl.CommandManagerImpl <em>Command Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.cmd.impl.CommandManagerImpl
	 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandManager()
	 * @generated
	 */
	int COMMAND_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER__NAME = QOperatingSystemTypePackage.TYPED_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER__TEXT = QOperatingSystemTypePackage.TYPED_MANAGER__TEXT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER__VERSION = QOperatingSystemTypePackage.TYPED_MANAGER__VERSION;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER__VENDOR = QOperatingSystemTypePackage.TYPED_MANAGER__VENDOR;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER__CONFIG = QOperatingSystemTypePackage.TYPED_MANAGER__CONFIG;

	/**
	 * The number of structural features of the '<em>Command Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MANAGER_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.os.type.cmd.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.cmd.impl.CommandParameterImpl
	 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandParameter()
	 * @generated
	 */
	int COMMAND_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Allow Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__ALLOW_VARIABLE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__DATA_TERM = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__NAME = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__POSITION = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__STATUS = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER__HIDDEN = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Command Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.asup.os.type.cmd.impl.CommandSourceImpl <em>Command Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.cmd.impl.CommandSourceImpl
	 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandSource()
	 * @generated
	 */
	int COMMAND_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SOURCE__TYPE = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SOURCE__CONTENT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SOURCE_FEATURE_COUNT = QOperatingSystemOmacPackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.os.type.cmd.CommandStatus <em>Command Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.cmd.CommandStatus
	 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandStatus()
	 * @generated
	 */
	int COMMAND_STATUS = 6;


	/**
	 * The meta object id for the '{@link org.asup.os.type.cmd.CommandParameterOrder <em>Command Parameter Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.cmd.CommandParameterOrder
	 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandParameterOrder()
	 * @generated
	 */
	int COMMAND_PARAMETER_ORDER = 7;


	/**
	 * The meta object id for the '{@link org.asup.os.type.cmd.CommandOrder <em>Command Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.os.type.cmd.CommandOrder
	 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandOrder()
	 * @generated
	 */
	int COMMAND_ORDER = 8;


	/**
	 * Returns the meta object for class '{@link org.asup.os.type.cmd.QCallableCommand <em>Callable Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Command</em>'.
	 * @see org.asup.os.type.cmd.QCallableCommand
	 * @generated
	 */
	EClass getCallableCommand();

	/**
	 * Returns the meta object for the reference '{@link org.asup.os.type.cmd.QCallableCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see org.asup.os.type.cmd.QCallableCommand#getCommand()
	 * @see #getCallableCommand()
	 * @generated
	 */
	EReference getCallableCommand_Command();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCallableCommand#getCommandString <em>Command String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command String</em>'.
	 * @see org.asup.os.type.cmd.QCallableCommand#getCommandString()
	 * @see #getCallableCommand()
	 * @generated
	 */
	EAttribute getCallableCommand_CommandString();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCallableCommand#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variables</em>'.
	 * @see org.asup.os.type.cmd.QCallableCommand#getVariables()
	 * @see #getCallableCommand()
	 * @generated
	 */
	EAttribute getCallableCommand_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.cmd.QCallableCommand#getDataContext <em>Data Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Context</em>'.
	 * @see org.asup.os.type.cmd.QCallableCommand#getDataContext()
	 * @see #getCallableCommand()
	 * @generated
	 */
	EReference getCallableCommand_DataContext();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.cmd.QCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see org.asup.os.type.cmd.QCommand
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommand#isAllowBatch <em>Allow Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Batch</em>'.
	 * @see org.asup.os.type.cmd.QCommand#isAllowBatch()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_AllowBatch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.os.type.cmd.QCommand#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.asup.os.type.cmd.QCommand#getParameters()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommand#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see org.asup.os.type.cmd.QCommand#getProgram()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.cmd.QCommand#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.asup.os.type.cmd.QCommand#getSource()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommand#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.asup.os.type.cmd.QCommand#getStatus()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Status();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.cmd.QCommandContainer <em>Command Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Container</em>'.
	 * @see org.asup.os.type.cmd.QCommandContainer
	 * @generated
	 */
	EClass getCommandContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommandContainer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.os.type.cmd.QCommandContainer#getType()
	 * @see #getCommandContainer()
	 * @generated
	 */
	EAttribute getCommandContainer_Type();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.cmd.QCommandManager <em>Command Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Manager</em>'.
	 * @see org.asup.os.type.cmd.QCommandManager
	 * @generated
	 */
	EClass getCommandManager();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.cmd.QCommandParameter <em>Command Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Parameter</em>'.
	 * @see org.asup.os.type.cmd.QCommandParameter
	 * @generated
	 */
	EClass getCommandParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommandParameter#isAllowVariable <em>Allow Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Variable</em>'.
	 * @see org.asup.os.type.cmd.QCommandParameter#isAllowVariable()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_AllowVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.os.type.cmd.QCommandParameter#getDataTerm <em>Data Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Term</em>'.
	 * @see org.asup.os.type.cmd.QCommandParameter#getDataTerm()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EReference getCommandParameter_DataTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommandParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.os.type.cmd.QCommandParameter#getName()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommandParameter#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.asup.os.type.cmd.QCommandParameter#getPosition()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommandParameter#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.asup.os.type.cmd.QCommandParameter#getStatus()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommandParameter#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.asup.os.type.cmd.QCommandParameter#isHidden()
	 * @see #getCommandParameter()
	 * @generated
	 */
	EAttribute getCommandParameter_Hidden();

	/**
	 * Returns the meta object for class '{@link org.asup.os.type.cmd.QCommandSource <em>Command Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Source</em>'.
	 * @see org.asup.os.type.cmd.QCommandSource
	 * @generated
	 */
	EClass getCommandSource();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommandSource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.asup.os.type.cmd.QCommandSource#getType()
	 * @see #getCommandSource()
	 * @generated
	 */
	EAttribute getCommandSource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.os.type.cmd.QCommandSource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.asup.os.type.cmd.QCommandSource#getContent()
	 * @see #getCommandSource()
	 * @generated
	 */
	EAttribute getCommandSource_Content();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.type.cmd.CommandStatus <em>Command Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Status</em>'.
	 * @see org.asup.os.type.cmd.CommandStatus
	 * @generated
	 */
	EEnum getCommandStatus();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.type.cmd.CommandParameterOrder <em>Command Parameter Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Parameter Order</em>'.
	 * @see org.asup.os.type.cmd.CommandParameterOrder
	 * @generated
	 */
	EEnum getCommandParameterOrder();

	/**
	 * Returns the meta object for enum '{@link org.asup.os.type.cmd.CommandOrder <em>Command Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Order</em>'.
	 * @see org.asup.os.type.cmd.CommandOrder
	 * @generated
	 */
	EEnum getCommandOrder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemCommandFactory getOperatingSystemCommandFactory();

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
		 * The meta object literal for the '{@link org.asup.os.type.cmd.impl.CallableCommandImpl <em>Callable Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.cmd.impl.CallableCommandImpl
		 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCallableCommand()
		 * @generated
		 */
		EClass CALLABLE_COMMAND = eINSTANCE.getCallableCommand();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_COMMAND__COMMAND = eINSTANCE.getCallableCommand_Command();

		/**
		 * The meta object literal for the '<em><b>Command String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_COMMAND__COMMAND_STRING = eINSTANCE.getCallableCommand_CommandString();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_COMMAND__VARIABLES = eINSTANCE.getCallableCommand_Variables();

		/**
		 * The meta object literal for the '<em><b>Data Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_COMMAND__DATA_CONTEXT = eINSTANCE.getCallableCommand_DataContext();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.cmd.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.cmd.impl.CommandImpl
		 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Allow Batch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__ALLOW_BATCH = eINSTANCE.getCommand_AllowBatch();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__PARAMETERS = eINSTANCE.getCommand_Parameters();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__PROGRAM = eINSTANCE.getCommand_Program();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__SOURCE = eINSTANCE.getCommand_Source();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__STATUS = eINSTANCE.getCommand_Status();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.cmd.impl.CommandContainerImpl <em>Command Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.cmd.impl.CommandContainerImpl
		 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandContainer()
		 * @generated
		 */
		EClass COMMAND_CONTAINER = eINSTANCE.getCommandContainer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_CONTAINER__TYPE = eINSTANCE.getCommandContainer_Type();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.cmd.impl.CommandManagerImpl <em>Command Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.cmd.impl.CommandManagerImpl
		 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandManager()
		 * @generated
		 */
		EClass COMMAND_MANAGER = eINSTANCE.getCommandManager();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.cmd.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.cmd.impl.CommandParameterImpl
		 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandParameter()
		 * @generated
		 */
		EClass COMMAND_PARAMETER = eINSTANCE.getCommandParameter();

		/**
		 * The meta object literal for the '<em><b>Allow Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__ALLOW_VARIABLE = eINSTANCE.getCommandParameter_AllowVariable();

		/**
		 * The meta object literal for the '<em><b>Data Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PARAMETER__DATA_TERM = eINSTANCE.getCommandParameter_DataTerm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__NAME = eINSTANCE.getCommandParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__POSITION = eINSTANCE.getCommandParameter_Position();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__STATUS = eINSTANCE.getCommandParameter_Status();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER__HIDDEN = eINSTANCE.getCommandParameter_Hidden();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.cmd.impl.CommandSourceImpl <em>Command Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.cmd.impl.CommandSourceImpl
		 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandSource()
		 * @generated
		 */
		EClass COMMAND_SOURCE = eINSTANCE.getCommandSource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_SOURCE__TYPE = eINSTANCE.getCommandSource_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_SOURCE__CONTENT = eINSTANCE.getCommandSource_Content();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.cmd.CommandStatus <em>Command Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.cmd.CommandStatus
		 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandStatus()
		 * @generated
		 */
		EEnum COMMAND_STATUS = eINSTANCE.getCommandStatus();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.cmd.CommandParameterOrder <em>Command Parameter Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.cmd.CommandParameterOrder
		 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandParameterOrder()
		 * @generated
		 */
		EEnum COMMAND_PARAMETER_ORDER = eINSTANCE.getCommandParameterOrder();

		/**
		 * The meta object literal for the '{@link org.asup.os.type.cmd.CommandOrder <em>Command Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.os.type.cmd.CommandOrder
		 * @see org.asup.os.type.cmd.impl.OperatingSystemCommandPackageImpl#getCommandOrder()
		 * @generated
		 */
		EEnum COMMAND_ORDER = eINSTANCE.getCommandOrder();

	}

} //QOperatingSystemCommandPackage
