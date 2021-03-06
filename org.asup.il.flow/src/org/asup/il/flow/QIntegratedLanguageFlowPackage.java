/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow;

import org.asup.il.core.QIntegratedLanguageCorePackage;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.asup.il.flow.QIntegratedLanguageFlowFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageFlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.asup.org/il/flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageFlowPackage eINSTANCE = org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.AnnotationCommandImpl <em>Annotation Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.AnnotationCommandImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getAnnotationCommand()
	 * @generated
	 */
	int ANNOTATION_COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_COMMAND__COMMAND = QIntegratedLanguageCorePackage.ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_COMMAND_FEATURE_COUNT = QIntegratedLanguageCorePackage.ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.StatementImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 34;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__FACETS = QIntegratedLanguageCorePackage.NODE__FACETS;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.BlockImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__FACETS = STATEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.BreakImpl <em>Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.BreakImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getBreak()
	 * @generated
	 */
	int BREAK = 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__FACETS = STATEMENT__FACETS;

	/**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.UnitImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 36;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.CallableUnitImpl <em>Callable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.CallableUnitImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getCallableUnit()
	 * @generated
	 */
	int CALLABLE_UNIT = 4;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.CommandExecImpl <em>Command Exec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.CommandExecImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getCommandExec()
	 * @generated
	 */
	int COMMAND_EXEC = 5;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.ContinueImpl <em>Continue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.ContinueImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getContinue()
	 * @generated
	 */
	int CONTINUE = 6;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.IterationImpl <em>Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.IterationImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getIteration()
	 * @generated
	 */
	int ITERATION = 16;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.EvalImpl <em>Eval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.EvalImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getEval()
	 * @generated
	 */
	int EVAL = 10;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.IfImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getIf()
	 * @generated
	 */
	int IF = 14;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.InvokeImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 15;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FACETS = STATEMENT__FACETS;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.JumpImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 17;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.LabelImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 18;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.MonitorImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 21;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.ProgramImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 26;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.ReturnImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 29;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.WhileImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 39;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.ForImpl <em>For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.ForImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getFor()
	 * @generated
	 */
	int FOR = 13;

	/**
	 * The number of structural features of the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.CallImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 3;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__FACETS = INVOKE__FACETS;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PROGRAM = INVOKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PARAMETERS = INVOKE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = INVOKE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__FACETS = QIntegratedLanguageCorePackage.NAMED_NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = QIntegratedLanguageCorePackage.NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__MAIN = QIntegratedLanguageCorePackage.NAMED_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = QIntegratedLanguageCorePackage.NAMED_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__FACETS = UNIT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__MAIN = UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Setup Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__SETUP_SECTION = UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__DATA_SECTION = UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__FILE_SECTION = UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flow Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__FLOW_SECTION = UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Callable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXEC__FACETS = INVOKE__FACETS;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXEC__STATEMENT = INVOKE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Exec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXEC_FEATURE_COUNT = INVOKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE__FACETS = STATEMENT__FACETS;

	/**
	 * The number of structural features of the '<em>Continue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.UnitSectionImpl <em>Unit Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.UnitSectionImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getUnitSection()
	 * @generated
	 */
	int UNIT_SECTION = 37;

	/**
	 * The number of structural features of the '<em>Unit Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SECTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.DataSectionImpl <em>Data Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.DataSectionImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getDataSection()
	 * @generated
	 */
	int DATA_SECTION = 7;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SECTION__DATAS = UNIT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SECTION_FEATURE_COUNT = UNIT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.EntryImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__FACETS = QIntegratedLanguageCorePackage.NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PARAMETERS = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.EntryParameterImpl <em>Entry Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.EntryParameterImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getEntryParameter()
	 * @generated
	 */
	int ENTRY_PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_PARAMETER__FACETS = QIntegratedLanguageCorePackage.NAMED_NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_PARAMETER__DELEGATE = QIntegratedLanguageCorePackage.NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_PARAMETER__NULLABLE = QIntegratedLanguageCorePackage.NAMED_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Passing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_PARAMETER__PASSING_TYPE = QIntegratedLanguageCorePackage.NAMED_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entry Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_PARAMETER_FEATURE_COUNT = QIntegratedLanguageCorePackage.NAMED_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL__FACETS = INVOKE__FACETS;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL__ASSIGNMENT = INVOKE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_FEATURE_COUNT = INVOKE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.FileSectionImpl <em>File Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.FileSectionImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getFileSection()
	 * @generated
	 */
	int FILE_SECTION = 11;

	/**
	 * The feature id for the '<em><b>Data Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__DATA_SETS = UNIT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__KEY_LISTS = UNIT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cursors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__CURSORS = UNIT_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__STATEMENTS = UNIT_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Displays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__DISPLAYS = UNIT_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Printers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION__PRINTERS = UNIT_SECTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>File Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SECTION_FEATURE_COUNT = UNIT_SECTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.FlowSectionImpl <em>Flow Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.FlowSectionImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getFlowSection()
	 * @generated
	 */
	int FLOW_SECTION = 12;

	/**
	 * The feature id for the '<em><b>Parameter Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SECTION__PARAMETER_LISTS = UNIT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SECTION__PROCEDURES = UNIT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SECTION__PROTOTYPES = UNIT_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Routines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SECTION__ROUTINES = UNIT_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SECTION_FEATURE_COUNT = UNIT_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__FACETS = STATEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__CONDITION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__FACETS = ITERATION__FACETS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__BODY = ITERATION__BODY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__CONDITION = ITERATION__CONDITION;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__INCREMENT = ITERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__INITIALIZATION = ITERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__FACETS = STATEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__FACETS = STATEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__LABEL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FACETS = STATEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.MethodExecImpl <em>Method Exec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.MethodExecImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getMethodExec()
	 * @generated
	 */
	int METHOD_EXEC = 19;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXEC__FACETS = INVOKE__FACETS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXEC__OBJECT = INVOKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXEC__METHOD = INVOKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXEC__PARAMETERS = INVOKE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Exec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXEC_FEATURE_COUNT = INVOKE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.ModuleImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 20;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FACETS = CALLABLE_UNIT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = CALLABLE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MAIN = CALLABLE_UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Setup Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SETUP_SECTION = CALLABLE_UNIT__SETUP_SECTION;

	/**
	 * The feature id for the '<em><b>Data Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DATA_SECTION = CALLABLE_UNIT__DATA_SECTION;

	/**
	 * The feature id for the '<em><b>File Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FILE_SECTION = CALLABLE_UNIT__FILE_SECTION;

	/**
	 * The feature id for the '<em><b>Flow Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FLOW_SECTION = CALLABLE_UNIT__FLOW_SECTION;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = CALLABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__FACETS = STATEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__ON_ERRORS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.OnErrorImpl <em>On Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.OnErrorImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getOnError()
	 * @generated
	 */
	int ON_ERROR = 22;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ERROR__FACETS = QIntegratedLanguageCorePackage.NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ERROR__BODY = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ERROR__ERROR = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ERROR_FEATURE_COUNT = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.ParameterListImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 23;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__FACETS = QIntegratedLanguageCorePackage.NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__NAME = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__PARAMETERS = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = QIntegratedLanguageCorePackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.ProcedureImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 24;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__FACETS = CALLABLE_UNIT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = CALLABLE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MAIN = CALLABLE_UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Setup Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SETUP_SECTION = CALLABLE_UNIT__SETUP_SECTION;

	/**
	 * The feature id for the '<em><b>Data Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__DATA_SECTION = CALLABLE_UNIT__DATA_SECTION;

	/**
	 * The feature id for the '<em><b>File Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__FILE_SECTION = CALLABLE_UNIT__FILE_SECTION;

	/**
	 * The feature id for the '<em><b>Flow Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__FLOW_SECTION = CALLABLE_UNIT__FLOW_SECTION;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ENTRY = CALLABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__RETURN_TYPE = CALLABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = CALLABLE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.ProcedureExecImpl <em>Procedure Exec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.ProcedureExecImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getProcedureExec()
	 * @generated
	 */
	int PROCEDURE_EXEC = 25;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_EXEC__FACETS = INVOKE__FACETS;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_EXEC__PROCEDURE = INVOKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_EXEC__PARAMETERS = INVOKE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Procedure Exec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_EXEC_FEATURE_COUNT = INVOKE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FACETS = CALLABLE_UNIT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = CALLABLE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__MAIN = CALLABLE_UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Setup Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SETUP_SECTION = CALLABLE_UNIT__SETUP_SECTION;

	/**
	 * The feature id for the '<em><b>Data Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__DATA_SECTION = CALLABLE_UNIT__DATA_SECTION;

	/**
	 * The feature id for the '<em><b>File Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FILE_SECTION = CALLABLE_UNIT__FILE_SECTION;

	/**
	 * The feature id for the '<em><b>Flow Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FLOW_SECTION = CALLABLE_UNIT__FLOW_SECTION;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ENTRY = CALLABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__MESSAGES = CALLABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = CALLABLE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.PrototypeImpl <em>Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.PrototypeImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getPrototype()
	 * @generated
	 */
	int PROTOTYPE = 27;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOTYPE__FACETS = QIntegratedLanguageCorePackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOTYPE__DELEGATE = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOTYPE__ENTRY = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOTYPE_FEATURE_COUNT = QIntegratedLanguageCorePackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.ResetImpl <em>Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.ResetImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getReset()
	 * @generated
	 */
	int RESET = 28;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__FACETS = INVOKE__FACETS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__OBJECT = INVOKE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_FEATURE_COUNT = INVOKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__FACETS = STATEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.RoutineImpl <em>Routine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.RoutineImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getRoutine()
	 * @generated
	 */
	int ROUTINE = 30;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__FACETS = UNIT__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE__MAIN = UNIT__MAIN;

	/**
	 * The number of structural features of the '<em>Routine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.RoutineExecImpl <em>Routine Exec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.RoutineExecImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getRoutineExec()
	 * @generated
	 */
	int ROUTINE_EXEC = 31;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_EXEC__FACETS = INVOKE__FACETS;

	/**
	 * The feature id for the '<em><b>Routine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_EXEC__ROUTINE = INVOKE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Routine Exec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_EXEC_FEATURE_COUNT = INVOKE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.SetupSectionImpl <em>Setup Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.SetupSectionImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getSetupSection()
	 * @generated
	 */
	int SETUP_SECTION = 32;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_SECTION__ANNOTATIONS = UNIT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_SECTION__APPLICATION = UNIT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_SECTION__ENCODING = UNIT_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_SECTION__EXPRESSION_TYPE = UNIT_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_SECTION__MODULES = UNIT_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_SECTION__TERM_SENSITIVE = UNIT_SECTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Setup Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_SECTION_FEATURE_COUNT = UNIT_SECTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.SQLExecImpl <em>SQL Exec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.SQLExecImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getSQLExec()
	 * @generated
	 */
	int SQL_EXEC = 33;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_EXEC__FACETS = INVOKE__FACETS;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_EXEC__STATEMENT = INVOKE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SQL Exec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_EXEC_FEATURE_COUNT = INVOKE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.StatementVisitorImpl <em>Statement Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.StatementVisitorImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getStatementVisitor()
	 * @generated
	 */
	int STATEMENT_VISITOR = 35;

	/**
	 * The number of structural features of the '<em>Statement Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asup.il.flow.impl.UntilImpl <em>Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.impl.UntilImpl
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getUntil()
	 * @generated
	 */
	int UNTIL = 38;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__FACETS = ITERATION__FACETS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__BODY = ITERATION__BODY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL__CONDITION = ITERATION__CONDITION;

	/**
	 * The number of structural features of the '<em>Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__FACETS = ITERATION__FACETS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BODY = ITERATION__BODY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = ITERATION__CONDITION;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.asup.il.flow.EvalOperator <em>Eval Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.EvalOperator
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getEvalOperator()
	 * @generated
	 */
	int EVAL_OPERATOR = 40;


	/**
	 * The meta object id for the '{@link org.asup.il.flow.PassingType <em>Passing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asup.il.flow.PassingType
	 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getPassingType()
	 * @generated
	 */
	int PASSING_TYPE = 41;


	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QAnnotationCommand <em>Annotation Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Command</em>'.
	 * @see org.asup.il.flow.QAnnotationCommand
	 * @generated
	 */
	EClass getAnnotationCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QAnnotationCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.asup.il.flow.QAnnotationCommand#getCommand()
	 * @see #getAnnotationCommand()
	 * @generated
	 */
	EAttribute getAnnotationCommand_Command();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.asup.il.flow.QBlock
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QBlock#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.asup.il.flow.QBlock#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QBreak <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break</em>'.
	 * @see org.asup.il.flow.QBreak
	 * @generated
	 */
	EClass getBreak();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.asup.il.flow.QCall
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QCall#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see org.asup.il.flow.QCall#getProgram()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_Program();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.il.flow.QCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.asup.il.flow.QCall#getParameters()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_Parameters();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QCallableUnit <em>Callable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Unit</em>'.
	 * @see org.asup.il.flow.QCallableUnit
	 * @generated
	 */
	EClass getCallableUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QCallableUnit#getDataSection <em>Data Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Section</em>'.
	 * @see org.asup.il.flow.QCallableUnit#getDataSection()
	 * @see #getCallableUnit()
	 * @generated
	 */
	EReference getCallableUnit_DataSection();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QCallableUnit#getFileSection <em>File Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Section</em>'.
	 * @see org.asup.il.flow.QCallableUnit#getFileSection()
	 * @see #getCallableUnit()
	 * @generated
	 */
	EReference getCallableUnit_FileSection();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QCallableUnit#getFlowSection <em>Flow Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow Section</em>'.
	 * @see org.asup.il.flow.QCallableUnit#getFlowSection()
	 * @see #getCallableUnit()
	 * @generated
	 */
	EReference getCallableUnit_FlowSection();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QCallableUnit#getSetupSection <em>Setup Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setup Section</em>'.
	 * @see org.asup.il.flow.QCallableUnit#getSetupSection()
	 * @see #getCallableUnit()
	 * @generated
	 */
	EReference getCallableUnit_SetupSection();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QCommandExec <em>Command Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Exec</em>'.
	 * @see org.asup.il.flow.QCommandExec
	 * @generated
	 */
	EClass getCommandExec();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QCommandExec#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see org.asup.il.flow.QCommandExec#getStatement()
	 * @see #getCommandExec()
	 * @generated
	 */
	EAttribute getCommandExec_Statement();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QContinue <em>Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue</em>'.
	 * @see org.asup.il.flow.QContinue
	 * @generated
	 */
	EClass getContinue();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QDataSection <em>Data Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Section</em>'.
	 * @see org.asup.il.flow.QDataSection
	 * @generated
	 */
	EClass getDataSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QDataSection#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datas</em>'.
	 * @see org.asup.il.flow.QDataSection#getDatas()
	 * @see #getDataSection()
	 * @generated
	 */
	EReference getDataSection_Datas();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.asup.il.flow.QEntry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QEntry#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.asup.il.flow.QEntry#getParameters()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Parameters();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QEntryParameter <em>Entry Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Parameter</em>'.
	 * @see org.asup.il.flow.QEntryParameter
	 * @generated
	 */
	EClass getEntryParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QEntryParameter#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see org.asup.il.flow.QEntryParameter#getDelegate()
	 * @see #getEntryParameter()
	 * @generated
	 */
	EReference getEntryParameter_Delegate();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QEntryParameter#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.asup.il.flow.QEntryParameter#isNullable()
	 * @see #getEntryParameter()
	 * @generated
	 */
	EAttribute getEntryParameter_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QEntryParameter#getPassingType <em>Passing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passing Type</em>'.
	 * @see org.asup.il.flow.QEntryParameter#getPassingType()
	 * @see #getEntryParameter()
	 * @generated
	 */
	EAttribute getEntryParameter_PassingType();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QEval <em>Eval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eval</em>'.
	 * @see org.asup.il.flow.QEval
	 * @generated
	 */
	EClass getEval();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QEval#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment</em>'.
	 * @see org.asup.il.flow.QEval#getAssignment()
	 * @see #getEval()
	 * @generated
	 */
	EAttribute getEval_Assignment();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QFileSection <em>File Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Section</em>'.
	 * @see org.asup.il.flow.QFileSection
	 * @generated
	 */
	EClass getFileSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFileSection#getDataSets <em>Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Sets</em>'.
	 * @see org.asup.il.flow.QFileSection#getDataSets()
	 * @see #getFileSection()
	 * @generated
	 */
	EReference getFileSection_DataSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFileSection#getKeyLists <em>Key Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Lists</em>'.
	 * @see org.asup.il.flow.QFileSection#getKeyLists()
	 * @see #getFileSection()
	 * @generated
	 */
	EReference getFileSection_KeyLists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFileSection#getCursors <em>Cursors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cursors</em>'.
	 * @see org.asup.il.flow.QFileSection#getCursors()
	 * @see #getFileSection()
	 * @generated
	 */
	EReference getFileSection_Cursors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFileSection#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.asup.il.flow.QFileSection#getStatements()
	 * @see #getFileSection()
	 * @generated
	 */
	EReference getFileSection_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFileSection#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Displays</em>'.
	 * @see org.asup.il.flow.QFileSection#getDisplays()
	 * @see #getFileSection()
	 * @generated
	 */
	EReference getFileSection_Displays();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFileSection#getPrinters <em>Printers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Printers</em>'.
	 * @see org.asup.il.flow.QFileSection#getPrinters()
	 * @see #getFileSection()
	 * @generated
	 */
	EReference getFileSection_Printers();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QFlowSection <em>Flow Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Section</em>'.
	 * @see org.asup.il.flow.QFlowSection
	 * @generated
	 */
	EClass getFlowSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFlowSection#getParameterLists <em>Parameter Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Lists</em>'.
	 * @see org.asup.il.flow.QFlowSection#getParameterLists()
	 * @see #getFlowSection()
	 * @generated
	 */
	EReference getFlowSection_ParameterLists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFlowSection#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedures</em>'.
	 * @see org.asup.il.flow.QFlowSection#getProcedures()
	 * @see #getFlowSection()
	 * @generated
	 */
	EReference getFlowSection_Procedures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFlowSection#getPrototypes <em>Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prototypes</em>'.
	 * @see org.asup.il.flow.QFlowSection#getPrototypes()
	 * @see #getFlowSection()
	 * @generated
	 */
	EReference getFlowSection_Prototypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QFlowSection#getRoutines <em>Routines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routines</em>'.
	 * @see org.asup.il.flow.QFlowSection#getRoutines()
	 * @see #getFlowSection()
	 * @generated
	 */
	EReference getFlowSection_Routines();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.asup.il.flow.QIf
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.asup.il.flow.QIf#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QIf#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.asup.il.flow.QIf#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QIf#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.asup.il.flow.QIf#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke</em>'.
	 * @see org.asup.il.flow.QInvoke
	 * @generated
	 */
	EClass getInvoke();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration</em>'.
	 * @see org.asup.il.flow.QIteration
	 * @generated
	 */
	EClass getIteration();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QIteration#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.asup.il.flow.QIteration#getCondition()
	 * @see #getIteration()
	 * @generated
	 */
	EAttribute getIteration_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QIteration#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.asup.il.flow.QIteration#getBody()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_Body();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QJump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see org.asup.il.flow.QJump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QJump#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.asup.il.flow.QJump#getLabel()
	 * @see #getJump()
	 * @generated
	 */
	EAttribute getJump_Label();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.asup.il.flow.QLabel
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QLabel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.flow.QLabel#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QMethodExec <em>Method Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Exec</em>'.
	 * @see org.asup.il.flow.QMethodExec
	 * @generated
	 */
	EClass getMethodExec();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QMethodExec#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.asup.il.flow.QMethodExec#getObject()
	 * @see #getMethodExec()
	 * @generated
	 */
	EAttribute getMethodExec_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QMethodExec#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.asup.il.flow.QMethodExec#getMethod()
	 * @see #getMethodExec()
	 * @generated
	 */
	EAttribute getMethodExec_Method();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.il.flow.QMethodExec#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.asup.il.flow.QMethodExec#getParameters()
	 * @see #getMethodExec()
	 * @generated
	 */
	EAttribute getMethodExec_Parameters();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.asup.il.flow.QModule
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see org.asup.il.flow.QMonitor
	 * @generated
	 */
	EClass getMonitor();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QMonitor#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.asup.il.flow.QMonitor#getBody()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QMonitor#getOnErrors <em>On Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Errors</em>'.
	 * @see org.asup.il.flow.QMonitor#getOnErrors()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_OnErrors();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QOnError <em>On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Error</em>'.
	 * @see org.asup.il.flow.QOnError
	 * @generated
	 */
	EClass getOnError();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QOnError#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.asup.il.flow.QOnError#getBody()
	 * @see #getOnError()
	 * @generated
	 */
	EReference getOnError_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QOnError#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see org.asup.il.flow.QOnError#getError()
	 * @see #getOnError()
	 * @generated
	 */
	EAttribute getOnError_Error();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List</em>'.
	 * @see org.asup.il.flow.QParameterList
	 * @generated
	 */
	EClass getParameterList();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QParameterList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.flow.QParameterList#getName()
	 * @see #getParameterList()
	 * @generated
	 */
	EAttribute getParameterList_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.il.flow.QParameterList#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.asup.il.flow.QParameterList#getParameters()
	 * @see #getParameterList()
	 * @generated
	 */
	EAttribute getParameterList_Parameters();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.asup.il.flow.QProcedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QProcedure#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.asup.il.flow.QProcedure#getEntry()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QProcedure#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.asup.il.flow.QProcedure#getReturnType()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QProcedureExec <em>Procedure Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Exec</em>'.
	 * @see org.asup.il.flow.QProcedureExec
	 * @generated
	 */
	EClass getProcedureExec();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QProcedureExec#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure</em>'.
	 * @see org.asup.il.flow.QProcedureExec#getProcedure()
	 * @see #getProcedureExec()
	 * @generated
	 */
	EAttribute getProcedureExec_Procedure();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.il.flow.QProcedureExec#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.asup.il.flow.QProcedureExec#getParameters()
	 * @see #getProcedureExec()
	 * @generated
	 */
	EAttribute getProcedureExec_Parameters();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.asup.il.flow.QProgram
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QProgram#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.asup.il.flow.QProgram#getEntry()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Entry();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.il.flow.QProgram#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Messages</em>'.
	 * @see org.asup.il.flow.QProgram#getMessages()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Messages();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prototype</em>'.
	 * @see org.asup.il.flow.QPrototype
	 * @generated
	 */
	EClass getPrototype();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QPrototype#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see org.asup.il.flow.QPrototype#getDelegate()
	 * @see #getPrototype()
	 * @generated
	 */
	EReference getPrototype_Delegate();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QPrototype#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.asup.il.flow.QPrototype#getEntry()
	 * @see #getPrototype()
	 * @generated
	 */
	EReference getPrototype_Entry();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset</em>'.
	 * @see org.asup.il.flow.QReset
	 * @generated
	 */
	EClass getReset();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QReset#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.asup.il.flow.QReset#getObject()
	 * @see #getReset()
	 * @generated
	 */
	EAttribute getReset_Object();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see org.asup.il.flow.QReturn
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QReturn#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.asup.il.flow.QReturn#getValue()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Value();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QRoutine <em>Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routine</em>'.
	 * @see org.asup.il.flow.QRoutine
	 * @generated
	 */
	EClass getRoutine();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QRoutineExec <em>Routine Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routine Exec</em>'.
	 * @see org.asup.il.flow.QRoutineExec
	 * @generated
	 */
	EClass getRoutineExec();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QRoutineExec#getRoutine <em>Routine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routine</em>'.
	 * @see org.asup.il.flow.QRoutineExec#getRoutine()
	 * @see #getRoutineExec()
	 * @generated
	 */
	EAttribute getRoutineExec_Routine();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QSetupSection <em>Setup Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setup Section</em>'.
	 * @see org.asup.il.flow.QSetupSection
	 * @generated
	 */
	EClass getSetupSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.asup.il.flow.QSetupSection#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.asup.il.flow.QSetupSection#getAnnotations()
	 * @see #getSetupSection()
	 * @generated
	 */
	EReference getSetupSection_Annotations();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QSetupSection#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see org.asup.il.flow.QSetupSection#getApplication()
	 * @see #getSetupSection()
	 * @generated
	 */
	EAttribute getSetupSection_Application();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QSetupSection#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.asup.il.flow.QSetupSection#getEncoding()
	 * @see #getSetupSection()
	 * @generated
	 */
	EAttribute getSetupSection_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QSetupSection#getExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Type</em>'.
	 * @see org.asup.il.flow.QSetupSection#getExpressionType()
	 * @see #getSetupSection()
	 * @generated
	 */
	EAttribute getSetupSection_ExpressionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.asup.il.flow.QSetupSection#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modules</em>'.
	 * @see org.asup.il.flow.QSetupSection#getModules()
	 * @see #getSetupSection()
	 * @generated
	 */
	EAttribute getSetupSection_Modules();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QSetupSection#isTermSensitive <em>Term Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Sensitive</em>'.
	 * @see org.asup.il.flow.QSetupSection#isTermSensitive()
	 * @see #getSetupSection()
	 * @generated
	 */
	EAttribute getSetupSection_TermSensitive();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QSQLExec <em>SQL Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Exec</em>'.
	 * @see org.asup.il.flow.QSQLExec
	 * @generated
	 */
	EClass getSQLExec();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QSQLExec#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see org.asup.il.flow.QSQLExec#getStatement()
	 * @see #getSQLExec()
	 * @generated
	 */
	EAttribute getSQLExec_Statement();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.asup.il.flow.QStatement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QStatementVisitor <em>Statement Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Visitor</em>'.
	 * @see org.asup.il.flow.QStatementVisitor
	 * @generated
	 */
	EClass getStatementVisitor();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.asup.il.flow.QUnit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.asup.il.flow.QUnit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.asup.il.flow.QUnit#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main</em>'.
	 * @see org.asup.il.flow.QUnit#getMain()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Main();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QUnitSection <em>Unit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Section</em>'.
	 * @see org.asup.il.flow.QUnitSection
	 * @generated
	 */
	EClass getUnitSection();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Until</em>'.
	 * @see org.asup.il.flow.QUntil
	 * @generated
	 */
	EClass getUntil();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see org.asup.il.flow.QWhile
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.flow.EvalOperator <em>Eval Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eval Operator</em>'.
	 * @see org.asup.il.flow.EvalOperator
	 * @generated
	 */
	EEnum getEvalOperator();

	/**
	 * Returns the meta object for enum '{@link org.asup.il.flow.PassingType <em>Passing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Passing Type</em>'.
	 * @see org.asup.il.flow.PassingType
	 * @generated
	 */
	EEnum getPassingType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageFlowFactory getIntegratedLanguageFlowFactory();

	/**
	 * Returns the meta object for class '{@link org.asup.il.flow.QFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For</em>'.
	 * @see org.asup.il.flow.QFor
	 * @generated
	 */
	EClass getFor();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QFor#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment</em>'.
	 * @see org.asup.il.flow.QFor#getIncrement()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_Increment();

	/**
	 * Returns the meta object for the attribute '{@link org.asup.il.flow.QFor#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialization</em>'.
	 * @see org.asup.il.flow.QFor#getInitialization()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_Initialization();

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
		 * The meta object literal for the '{@link org.asup.il.flow.impl.AnnotationCommandImpl <em>Annotation Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.AnnotationCommandImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getAnnotationCommand()
		 * @generated
		 */
		EClass ANNOTATION_COMMAND = eINSTANCE.getAnnotationCommand();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_COMMAND__COMMAND = eINSTANCE.getAnnotationCommand_Command();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.BlockImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.BreakImpl <em>Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.BreakImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getBreak()
		 * @generated
		 */
		EClass BREAK = eINSTANCE.getBreak();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.CallImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__PROGRAM = eINSTANCE.getCall_Program();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__PARAMETERS = eINSTANCE.getCall_Parameters();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.CallableUnitImpl <em>Callable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.CallableUnitImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getCallableUnit()
		 * @generated
		 */
		EClass CALLABLE_UNIT = eINSTANCE.getCallableUnit();

		/**
		 * The meta object literal for the '<em><b>Data Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_UNIT__DATA_SECTION = eINSTANCE.getCallableUnit_DataSection();

		/**
		 * The meta object literal for the '<em><b>File Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_UNIT__FILE_SECTION = eINSTANCE.getCallableUnit_FileSection();

		/**
		 * The meta object literal for the '<em><b>Flow Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_UNIT__FLOW_SECTION = eINSTANCE.getCallableUnit_FlowSection();

		/**
		 * The meta object literal for the '<em><b>Setup Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_UNIT__SETUP_SECTION = eINSTANCE.getCallableUnit_SetupSection();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.CommandExecImpl <em>Command Exec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.CommandExecImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getCommandExec()
		 * @generated
		 */
		EClass COMMAND_EXEC = eINSTANCE.getCommandExec();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_EXEC__STATEMENT = eINSTANCE.getCommandExec_Statement();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.ContinueImpl <em>Continue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.ContinueImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getContinue()
		 * @generated
		 */
		EClass CONTINUE = eINSTANCE.getContinue();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.DataSectionImpl <em>Data Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.DataSectionImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getDataSection()
		 * @generated
		 */
		EClass DATA_SECTION = eINSTANCE.getDataSection();

		/**
		 * The meta object literal for the '<em><b>Datas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SECTION__DATAS = eINSTANCE.getDataSection_Datas();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.EntryImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__PARAMETERS = eINSTANCE.getEntry_Parameters();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.EntryParameterImpl <em>Entry Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.EntryParameterImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getEntryParameter()
		 * @generated
		 */
		EClass ENTRY_PARAMETER = eINSTANCE.getEntryParameter();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_PARAMETER__DELEGATE = eINSTANCE.getEntryParameter_Delegate();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_PARAMETER__NULLABLE = eINSTANCE.getEntryParameter_Nullable();

		/**
		 * The meta object literal for the '<em><b>Passing Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_PARAMETER__PASSING_TYPE = eINSTANCE.getEntryParameter_PassingType();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.EvalImpl <em>Eval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.EvalImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getEval()
		 * @generated
		 */
		EClass EVAL = eINSTANCE.getEval();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVAL__ASSIGNMENT = eINSTANCE.getEval_Assignment();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.FileSectionImpl <em>File Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.FileSectionImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getFileSection()
		 * @generated
		 */
		EClass FILE_SECTION = eINSTANCE.getFileSection();

		/**
		 * The meta object literal for the '<em><b>Data Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SECTION__DATA_SETS = eINSTANCE.getFileSection_DataSets();

		/**
		 * The meta object literal for the '<em><b>Key Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SECTION__KEY_LISTS = eINSTANCE.getFileSection_KeyLists();

		/**
		 * The meta object literal for the '<em><b>Cursors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SECTION__CURSORS = eINSTANCE.getFileSection_Cursors();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SECTION__STATEMENTS = eINSTANCE.getFileSection_Statements();

		/**
		 * The meta object literal for the '<em><b>Displays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SECTION__DISPLAYS = eINSTANCE.getFileSection_Displays();

		/**
		 * The meta object literal for the '<em><b>Printers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SECTION__PRINTERS = eINSTANCE.getFileSection_Printers();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.FlowSectionImpl <em>Flow Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.FlowSectionImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getFlowSection()
		 * @generated
		 */
		EClass FLOW_SECTION = eINSTANCE.getFlowSection();

		/**
		 * The meta object literal for the '<em><b>Parameter Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SECTION__PARAMETER_LISTS = eINSTANCE.getFlowSection_ParameterLists();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SECTION__PROCEDURES = eINSTANCE.getFlowSection_Procedures();

		/**
		 * The meta object literal for the '<em><b>Prototypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SECTION__PROTOTYPES = eINSTANCE.getFlowSection_Prototypes();

		/**
		 * The meta object literal for the '<em><b>Routines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SECTION__ROUTINES = eINSTANCE.getFlowSection_Routines();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.IfImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN = eINSTANCE.getIf_Then();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.InvokeImpl <em>Invoke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.InvokeImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getInvoke()
		 * @generated
		 */
		EClass INVOKE = eINSTANCE.getInvoke();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.IterationImpl <em>Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.IterationImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getIteration()
		 * @generated
		 */
		EClass ITERATION = eINSTANCE.getIteration();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION__CONDITION = eINSTANCE.getIteration_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__BODY = eINSTANCE.getIteration_Body();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.JumpImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getJump()
		 * @generated
		 */
		EClass JUMP = eINSTANCE.getJump();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP__LABEL = eINSTANCE.getJump_Label();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.LabelImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.MethodExecImpl <em>Method Exec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.MethodExecImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getMethodExec()
		 * @generated
		 */
		EClass METHOD_EXEC = eINSTANCE.getMethodExec();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_EXEC__OBJECT = eINSTANCE.getMethodExec_Object();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_EXEC__METHOD = eINSTANCE.getMethodExec_Method();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_EXEC__PARAMETERS = eINSTANCE.getMethodExec_Parameters();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.ModuleImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.MonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.MonitorImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getMonitor()
		 * @generated
		 */
		EClass MONITOR = eINSTANCE.getMonitor();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__BODY = eINSTANCE.getMonitor_Body();

		/**
		 * The meta object literal for the '<em><b>On Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__ON_ERRORS = eINSTANCE.getMonitor_OnErrors();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.OnErrorImpl <em>On Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.OnErrorImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getOnError()
		 * @generated
		 */
		EClass ON_ERROR = eINSTANCE.getOnError();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ERROR__BODY = eINSTANCE.getOnError_Body();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_ERROR__ERROR = eINSTANCE.getOnError_Error();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.ParameterListImpl <em>Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.ParameterListImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getParameterList()
		 * @generated
		 */
		EClass PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_LIST__NAME = eINSTANCE.getParameterList_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_LIST__PARAMETERS = eINSTANCE.getParameterList_Parameters();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.ProcedureImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__ENTRY = eINSTANCE.getProcedure_Entry();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__RETURN_TYPE = eINSTANCE.getProcedure_ReturnType();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.ProcedureExecImpl <em>Procedure Exec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.ProcedureExecImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getProcedureExec()
		 * @generated
		 */
		EClass PROCEDURE_EXEC = eINSTANCE.getProcedureExec();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_EXEC__PROCEDURE = eINSTANCE.getProcedureExec_Procedure();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_EXEC__PARAMETERS = eINSTANCE.getProcedureExec_Parameters();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.ProgramImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ENTRY = eINSTANCE.getProgram_Entry();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__MESSAGES = eINSTANCE.getProgram_Messages();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.PrototypeImpl <em>Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.PrototypeImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getPrototype()
		 * @generated
		 */
		EClass PROTOTYPE = eINSTANCE.getPrototype();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOTYPE__DELEGATE = eINSTANCE.getPrototype_Delegate();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOTYPE__ENTRY = eINSTANCE.getPrototype_Entry();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.ResetImpl <em>Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.ResetImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getReset()
		 * @generated
		 */
		EClass RESET = eINSTANCE.getReset();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESET__OBJECT = eINSTANCE.getReset_Object();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.ReturnImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN__VALUE = eINSTANCE.getReturn_Value();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.RoutineImpl <em>Routine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.RoutineImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getRoutine()
		 * @generated
		 */
		EClass ROUTINE = eINSTANCE.getRoutine();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.RoutineExecImpl <em>Routine Exec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.RoutineExecImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getRoutineExec()
		 * @generated
		 */
		EClass ROUTINE_EXEC = eINSTANCE.getRoutineExec();

		/**
		 * The meta object literal for the '<em><b>Routine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTINE_EXEC__ROUTINE = eINSTANCE.getRoutineExec_Routine();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.SetupSectionImpl <em>Setup Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.SetupSectionImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getSetupSection()
		 * @generated
		 */
		EClass SETUP_SECTION = eINSTANCE.getSetupSection();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP_SECTION__ANNOTATIONS = eINSTANCE.getSetupSection_Annotations();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETUP_SECTION__APPLICATION = eINSTANCE.getSetupSection_Application();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETUP_SECTION__ENCODING = eINSTANCE.getSetupSection_Encoding();

		/**
		 * The meta object literal for the '<em><b>Expression Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETUP_SECTION__EXPRESSION_TYPE = eINSTANCE.getSetupSection_ExpressionType();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETUP_SECTION__MODULES = eINSTANCE.getSetupSection_Modules();

		/**
		 * The meta object literal for the '<em><b>Term Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETUP_SECTION__TERM_SENSITIVE = eINSTANCE.getSetupSection_TermSensitive();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.SQLExecImpl <em>SQL Exec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.SQLExecImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getSQLExec()
		 * @generated
		 */
		EClass SQL_EXEC = eINSTANCE.getSQLExec();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_EXEC__STATEMENT = eINSTANCE.getSQLExec_Statement();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.StatementImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.StatementVisitorImpl <em>Statement Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.StatementVisitorImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getStatementVisitor()
		 * @generated
		 */
		EClass STATEMENT_VISITOR = eINSTANCE.getStatementVisitor();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.UnitImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__MAIN = eINSTANCE.getUnit_Main();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.UnitSectionImpl <em>Unit Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.UnitSectionImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getUnitSection()
		 * @generated
		 */
		EClass UNIT_SECTION = eINSTANCE.getUnitSection();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.UntilImpl <em>Until</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.UntilImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getUntil()
		 * @generated
		 */
		EClass UNTIL = eINSTANCE.getUntil();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.WhileImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.EvalOperator <em>Eval Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.EvalOperator
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getEvalOperator()
		 * @generated
		 */
		EEnum EVAL_OPERATOR = eINSTANCE.getEvalOperator();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.PassingType <em>Passing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.PassingType
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getPassingType()
		 * @generated
		 */
		EEnum PASSING_TYPE = eINSTANCE.getPassingType();

		/**
		 * The meta object literal for the '{@link org.asup.il.flow.impl.ForImpl <em>For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asup.il.flow.impl.ForImpl
		 * @see org.asup.il.flow.impl.IntegratedLanguageFlowPackageImpl#getFor()
		 * @generated
		 */
		EClass FOR = eINSTANCE.getFor();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__INCREMENT = eINSTANCE.getFor_Increment();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__INITIALIZATION = eINSTANCE.getFor_Initialization();

	}

} //ILFlowPackage
