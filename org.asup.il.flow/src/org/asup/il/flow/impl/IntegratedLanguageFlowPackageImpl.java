/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow.impl;

import org.asup.il.core.QIntegratedLanguageCorePackage;
import org.asup.il.data.QIntegratedLanguageDataPackage;
import org.asup.il.esql.QIntegratedLanguageEmbeddedSQLPackage;
import org.asup.il.flow.EvalOperator;
import org.asup.il.flow.PassingType;
import org.asup.il.flow.QAnnotationCommand;
import org.asup.il.flow.QBlock;
import org.asup.il.flow.QBreak;
import org.asup.il.flow.QCall;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QCommandExec;
import org.asup.il.flow.QContinue;
import org.asup.il.flow.QDataSection;
import org.asup.il.flow.QEntry;
import org.asup.il.flow.QEntryParameter;
import org.asup.il.flow.QEval;
import org.asup.il.flow.QFileSection;
import org.asup.il.flow.QFlowSection;
import org.asup.il.flow.QFor;
import org.asup.il.flow.QIf;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QIntegratedLanguageFlowPackage;
import org.asup.il.flow.QInvoke;
import org.asup.il.flow.QIteration;
import org.asup.il.flow.QJump;
import org.asup.il.flow.QLabel;
import org.asup.il.flow.QMethodExec;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QMonitor;
import org.asup.il.flow.QOnError;
import org.asup.il.flow.QParameterList;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QProcedureExec;
import org.asup.il.flow.QProgram;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QReset;
import org.asup.il.flow.QReturn;
import org.asup.il.flow.QRoutine;
import org.asup.il.flow.QRoutineExec;
import org.asup.il.flow.QSQLExec;
import org.asup.il.flow.QSetupSection;
import org.asup.il.flow.QStatement;
import org.asup.il.flow.QStatementVisitor;
import org.asup.il.flow.QUnit;
import org.asup.il.flow.QUnitSection;
import org.asup.il.flow.QUntil;
import org.asup.il.flow.QWhile;
import org.asup.il.isam.QIntegratedLanguageIsamPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageFlowPackageImpl extends EPackageImpl implements QIntegratedLanguageFlowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandExecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodExecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureExecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routineExecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setupSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlExecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum passingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEClass = null;

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
	 * @see org.asup.il.flow.QIntegratedLanguageFlowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageFlowPackageImpl() {
		super(eNS_URI, QIntegratedLanguageFlowFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QIntegratedLanguageFlowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageFlowPackage init() {
		if (isInited) return (QIntegratedLanguageFlowPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageFlowPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageFlowPackageImpl theIntegratedLanguageFlowPackage = (IntegratedLanguageFlowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageFlowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageFlowPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageEmbeddedSQLPackage.eINSTANCE.eClass();
		QIntegratedLanguageIsamPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageFlowPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageFlowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageFlowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageFlowPackage.eNS_URI, theIntegratedLanguageFlowPackage);
		return theIntegratedLanguageFlowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationCommand() {
		return annotationCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationCommand_Command() {
		return (EAttribute)annotationCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Statements() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreak() {
		return breakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCall_Program() {
		return (EAttribute)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCall_Parameters() {
		return (EAttribute)callEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallableUnit() {
		return callableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableUnit_DataSection() {
		return (EReference)callableUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableUnit_FileSection() {
		return (EReference)callableUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableUnit_FlowSection() {
		return (EReference)callableUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableUnit_SetupSection() {
		return (EReference)callableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandExec() {
		return commandExecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandExec_Statement() {
		return (EAttribute)commandExecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinue() {
		return continueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSection() {
		return dataSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSection_Datas() {
		return (EReference)dataSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_Parameters() {
		return (EReference)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryParameter() {
		return entryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryParameter_Delegate() {
		return (EReference)entryParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryParameter_Nullable() {
		return (EAttribute)entryParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryParameter_PassingType() {
		return (EAttribute)entryParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEval() {
		return evalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEval_Assignment() {
		return (EAttribute)evalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSection() {
		return fileSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSection_DataSets() {
		return (EReference)fileSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSection_KeyLists() {
		return (EReference)fileSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSection_Cursors() {
		return (EReference)fileSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSection_Statements() {
		return (EReference)fileSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSection_Displays() {
		return (EReference)fileSectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSection_Printers() {
		return (EReference)fileSectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowSection() {
		return flowSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSection_ParameterLists() {
		return (EReference)flowSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSection_Procedures() {
		return (EReference)flowSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSection_Prototypes() {
		return (EReference)flowSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSection_Routines() {
		return (EReference)flowSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIf_Condition() {
		return (EAttribute)ifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Else() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Then() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoke() {
		return invokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteration() {
		return iterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteration_Condition() {
		return (EAttribute)iterationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_Body() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJump() {
		return jumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJump_Label() {
		return (EAttribute)jumpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Name() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodExec() {
		return methodExecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodExec_Object() {
		return (EAttribute)methodExecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodExec_Method() {
		return (EAttribute)methodExecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodExec_Parameters() {
		return (EAttribute)methodExecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitor() {
		return monitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_Body() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_OnErrors() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnError() {
		return onErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnError_Body() {
		return (EReference)onErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnError_Error() {
		return (EAttribute)onErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterList() {
		return parameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterList_Name() {
		return (EAttribute)parameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterList_Parameters() {
		return (EAttribute)parameterListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Entry() {
		return (EReference)procedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_ReturnType() {
		return (EReference)procedureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureExec() {
		return procedureExecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedureExec_Procedure() {
		return (EAttribute)procedureExecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedureExec_Parameters() {
		return (EAttribute)procedureExecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Entry() {
		return (EReference)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_Messages() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrototype() {
		return prototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrototype_Delegate() {
		return (EReference)prototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrototype_Entry() {
		return (EReference)prototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReset() {
		return resetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReset_Object() {
		return (EAttribute)resetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturn_Value() {
		return (EAttribute)returnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutine() {
		return routineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutineExec() {
		return routineExecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutineExec_Routine() {
		return (EAttribute)routineExecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetupSection() {
		return setupSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetupSection_Annotations() {
		return (EReference)setupSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetupSection_Application() {
		return (EAttribute)setupSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetupSection_Encoding() {
		return (EAttribute)setupSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetupSection_ExpressionType() {
		return (EAttribute)setupSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetupSection_Modules() {
		return (EAttribute)setupSectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetupSection_TermSensitive() {
		return (EAttribute)setupSectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLExec() {
		return sqlExecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLExec_Statement() {
		return (EAttribute)sqlExecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementVisitor() {
		return statementVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Name() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Main() {
		return (EReference)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitSection() {
		return unitSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUntil() {
		return untilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvalOperator() {
		return evalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPassingType() {
		return passingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageFlowFactory getIntegratedLanguageFlowFactory() {
		return (QIntegratedLanguageFlowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFor() {
		return forEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_Increment() {
		return (EAttribute)forEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_Initialization() {
		return (EAttribute)forEClass.getEStructuralFeatures().get(1);
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
		annotationCommandEClass = createEClass(ANNOTATION_COMMAND);
		createEAttribute(annotationCommandEClass, ANNOTATION_COMMAND__COMMAND);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STATEMENTS);

		breakEClass = createEClass(BREAK);

		callEClass = createEClass(CALL);
		createEAttribute(callEClass, CALL__PROGRAM);
		createEAttribute(callEClass, CALL__PARAMETERS);

		callableUnitEClass = createEClass(CALLABLE_UNIT);
		createEReference(callableUnitEClass, CALLABLE_UNIT__SETUP_SECTION);
		createEReference(callableUnitEClass, CALLABLE_UNIT__DATA_SECTION);
		createEReference(callableUnitEClass, CALLABLE_UNIT__FILE_SECTION);
		createEReference(callableUnitEClass, CALLABLE_UNIT__FLOW_SECTION);

		commandExecEClass = createEClass(COMMAND_EXEC);
		createEAttribute(commandExecEClass, COMMAND_EXEC__STATEMENT);

		continueEClass = createEClass(CONTINUE);

		dataSectionEClass = createEClass(DATA_SECTION);
		createEReference(dataSectionEClass, DATA_SECTION__DATAS);

		entryEClass = createEClass(ENTRY);
		createEReference(entryEClass, ENTRY__PARAMETERS);

		entryParameterEClass = createEClass(ENTRY_PARAMETER);
		createEReference(entryParameterEClass, ENTRY_PARAMETER__DELEGATE);
		createEAttribute(entryParameterEClass, ENTRY_PARAMETER__NULLABLE);
		createEAttribute(entryParameterEClass, ENTRY_PARAMETER__PASSING_TYPE);

		evalEClass = createEClass(EVAL);
		createEAttribute(evalEClass, EVAL__ASSIGNMENT);

		fileSectionEClass = createEClass(FILE_SECTION);
		createEReference(fileSectionEClass, FILE_SECTION__DATA_SETS);
		createEReference(fileSectionEClass, FILE_SECTION__KEY_LISTS);
		createEReference(fileSectionEClass, FILE_SECTION__CURSORS);
		createEReference(fileSectionEClass, FILE_SECTION__STATEMENTS);
		createEReference(fileSectionEClass, FILE_SECTION__DISPLAYS);
		createEReference(fileSectionEClass, FILE_SECTION__PRINTERS);

		flowSectionEClass = createEClass(FLOW_SECTION);
		createEReference(flowSectionEClass, FLOW_SECTION__PARAMETER_LISTS);
		createEReference(flowSectionEClass, FLOW_SECTION__PROCEDURES);
		createEReference(flowSectionEClass, FLOW_SECTION__PROTOTYPES);
		createEReference(flowSectionEClass, FLOW_SECTION__ROUTINES);

		forEClass = createEClass(FOR);
		createEAttribute(forEClass, FOR__INCREMENT);
		createEAttribute(forEClass, FOR__INITIALIZATION);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__THEN);
		createEReference(ifEClass, IF__ELSE);
		createEAttribute(ifEClass, IF__CONDITION);

		invokeEClass = createEClass(INVOKE);

		iterationEClass = createEClass(ITERATION);
		createEReference(iterationEClass, ITERATION__BODY);
		createEAttribute(iterationEClass, ITERATION__CONDITION);

		jumpEClass = createEClass(JUMP);
		createEAttribute(jumpEClass, JUMP__LABEL);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__NAME);

		methodExecEClass = createEClass(METHOD_EXEC);
		createEAttribute(methodExecEClass, METHOD_EXEC__OBJECT);
		createEAttribute(methodExecEClass, METHOD_EXEC__METHOD);
		createEAttribute(methodExecEClass, METHOD_EXEC__PARAMETERS);

		moduleEClass = createEClass(MODULE);

		monitorEClass = createEClass(MONITOR);
		createEReference(monitorEClass, MONITOR__BODY);
		createEReference(monitorEClass, MONITOR__ON_ERRORS);

		onErrorEClass = createEClass(ON_ERROR);
		createEReference(onErrorEClass, ON_ERROR__BODY);
		createEAttribute(onErrorEClass, ON_ERROR__ERROR);

		parameterListEClass = createEClass(PARAMETER_LIST);
		createEAttribute(parameterListEClass, PARAMETER_LIST__NAME);
		createEAttribute(parameterListEClass, PARAMETER_LIST__PARAMETERS);

		procedureEClass = createEClass(PROCEDURE);
		createEReference(procedureEClass, PROCEDURE__ENTRY);
		createEReference(procedureEClass, PROCEDURE__RETURN_TYPE);

		procedureExecEClass = createEClass(PROCEDURE_EXEC);
		createEAttribute(procedureExecEClass, PROCEDURE_EXEC__PROCEDURE);
		createEAttribute(procedureExecEClass, PROCEDURE_EXEC__PARAMETERS);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__ENTRY);
		createEAttribute(programEClass, PROGRAM__MESSAGES);

		prototypeEClass = createEClass(PROTOTYPE);
		createEReference(prototypeEClass, PROTOTYPE__DELEGATE);
		createEReference(prototypeEClass, PROTOTYPE__ENTRY);

		resetEClass = createEClass(RESET);
		createEAttribute(resetEClass, RESET__OBJECT);

		returnEClass = createEClass(RETURN);
		createEAttribute(returnEClass, RETURN__VALUE);

		routineEClass = createEClass(ROUTINE);

		routineExecEClass = createEClass(ROUTINE_EXEC);
		createEAttribute(routineExecEClass, ROUTINE_EXEC__ROUTINE);

		setupSectionEClass = createEClass(SETUP_SECTION);
		createEReference(setupSectionEClass, SETUP_SECTION__ANNOTATIONS);
		createEAttribute(setupSectionEClass, SETUP_SECTION__APPLICATION);
		createEAttribute(setupSectionEClass, SETUP_SECTION__ENCODING);
		createEAttribute(setupSectionEClass, SETUP_SECTION__EXPRESSION_TYPE);
		createEAttribute(setupSectionEClass, SETUP_SECTION__MODULES);
		createEAttribute(setupSectionEClass, SETUP_SECTION__TERM_SENSITIVE);

		sqlExecEClass = createEClass(SQL_EXEC);
		createEAttribute(sqlExecEClass, SQL_EXEC__STATEMENT);

		statementEClass = createEClass(STATEMENT);

		statementVisitorEClass = createEClass(STATEMENT_VISITOR);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__NAME);
		createEReference(unitEClass, UNIT__MAIN);

		unitSectionEClass = createEClass(UNIT_SECTION);

		untilEClass = createEClass(UNTIL);

		whileEClass = createEClass(WHILE);

		// Create enums
		evalOperatorEEnum = createEEnum(EVAL_OPERATOR);
		passingTypeEEnum = createEEnum(PASSING_TYPE);
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

		// Obtain other dependent packages
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);
		QIntegratedLanguageIsamPackage theIntegratedLanguageIsamPackage = (QIntegratedLanguageIsamPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageIsamPackage.eNS_URI);
		QIntegratedLanguageEmbeddedSQLPackage theIntegratedLanguageEmbeddedSQLPackage = (QIntegratedLanguageEmbeddedSQLPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageEmbeddedSQLPackage.eNS_URI);

		// Create type parameters
		ETypeParameter entryParameterEClass_T = addETypeParameter(entryParameterEClass, "T");
		ETypeParameter prototypeEClass_DT = addETypeParameter(prototypeEClass, "DT");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theIntegratedLanguageCorePackage.getTerm());
		entryParameterEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getDataTerm());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		prototypeEClass_DT.getEBounds().add(g1);

		// Add supertypes to classes
		annotationCommandEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getAnnotation());
		blockEClass.getESuperTypes().add(this.getStatement());
		breakEClass.getESuperTypes().add(this.getStatement());
		callEClass.getESuperTypes().add(this.getInvoke());
		callableUnitEClass.getESuperTypes().add(this.getUnit());
		commandExecEClass.getESuperTypes().add(this.getInvoke());
		continueEClass.getESuperTypes().add(this.getStatement());
		dataSectionEClass.getESuperTypes().add(this.getUnitSection());
		entryEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNode());
		entryParameterEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNamedNode());
		evalEClass.getESuperTypes().add(this.getInvoke());
		fileSectionEClass.getESuperTypes().add(this.getUnitSection());
		flowSectionEClass.getESuperTypes().add(this.getUnitSection());
		forEClass.getESuperTypes().add(this.getIteration());
		ifEClass.getESuperTypes().add(this.getStatement());
		invokeEClass.getESuperTypes().add(this.getStatement());
		iterationEClass.getESuperTypes().add(this.getStatement());
		jumpEClass.getESuperTypes().add(this.getStatement());
		labelEClass.getESuperTypes().add(this.getStatement());
		methodExecEClass.getESuperTypes().add(this.getInvoke());
		moduleEClass.getESuperTypes().add(this.getCallableUnit());
		monitorEClass.getESuperTypes().add(this.getStatement());
		onErrorEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNode());
		parameterListEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNode());
		procedureEClass.getESuperTypes().add(this.getCallableUnit());
		procedureExecEClass.getESuperTypes().add(this.getInvoke());
		programEClass.getESuperTypes().add(this.getCallableUnit());
		prototypeEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getTerm());
		resetEClass.getESuperTypes().add(this.getInvoke());
		returnEClass.getESuperTypes().add(this.getStatement());
		routineEClass.getESuperTypes().add(this.getUnit());
		routineExecEClass.getESuperTypes().add(this.getInvoke());
		setupSectionEClass.getESuperTypes().add(this.getUnitSection());
		sqlExecEClass.getESuperTypes().add(this.getInvoke());
		statementEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNode());
		unitEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getNamedNode());
		untilEClass.getESuperTypes().add(this.getIteration());
		whileEClass.getESuperTypes().add(this.getIteration());

		// Initialize classes and features; add operations and parameters
		initEClass(annotationCommandEClass, QAnnotationCommand.class, "AnnotationCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationCommand_Command(), ecorePackage.getEString(), "command", null, 1, 1, QAnnotationCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, QBlock.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, QBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakEClass, QBreak.class, "Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callEClass, QCall.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCall_Program(), ecorePackage.getEString(), "program", null, 0, 1, QCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCall_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, QCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callableUnitEClass, QCallableUnit.class, "CallableUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallableUnit_SetupSection(), this.getSetupSection(), null, "setupSection", null, 0, 1, QCallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallableUnit_DataSection(), this.getDataSection(), null, "dataSection", null, 0, 1, QCallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallableUnit_FileSection(), this.getFileSection(), null, "fileSection", null, 0, 1, QCallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallableUnit_FlowSection(), this.getFlowSection(), null, "flowSection", null, 0, 1, QCallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandExecEClass, QCommandExec.class, "CommandExec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandExec_Statement(), ecorePackage.getEString(), "statement", null, 1, 1, QCommandExec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continueEClass, QContinue.class, "Continue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSectionEClass, QDataSection.class, "DataSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getDataSection_Datas(), g1, null, "datas", null, 0, -1, QDataSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, QEntry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getEntryParameter());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getEntry_Parameters(), g1, null, "parameters", null, 1, -1, QEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryParameterEClass, QEntryParameter.class, "EntryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(entryParameterEClass_T);
		initEReference(getEntryParameter_Delegate(), g1, null, "delegate", null, 0, 1, QEntryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryParameter_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, QEntryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryParameter_PassingType(), this.getPassingType(), "passingType", "REF", 1, 1, QEntryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evalEClass, QEval.class, "Eval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEval_Assignment(), ecorePackage.getEString(), "assignment", null, 1, 1, QEval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileSectionEClass, QFileSection.class, "FileSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileSection_DataSets(), theIntegratedLanguageIsamPackage.getDataSetTerm(), null, "dataSets", null, 0, -1, QFileSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileSection_KeyLists(), theIntegratedLanguageIsamPackage.getKeyListTerm(), null, "keyLists", null, 0, -1, QFileSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileSection_Cursors(), theIntegratedLanguageEmbeddedSQLPackage.getCursorTerm(), null, "cursors", null, 0, -1, QFileSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileSection_Statements(), theIntegratedLanguageEmbeddedSQLPackage.getStatementTerm(), null, "statements", null, 0, -1, QFileSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileSection_Displays(), theIntegratedLanguageIsamPackage.getDisplayTerm(), null, "displays", null, 0, -1, QFileSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileSection_Printers(), theIntegratedLanguageIsamPackage.getPrintTerm(), null, "printers", null, 0, -1, QFileSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowSectionEClass, QFlowSection.class, "FlowSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowSection_ParameterLists(), this.getParameterList(), null, "parameterLists", null, 0, -1, QFlowSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowSection_Procedures(), this.getProcedure(), null, "procedures", null, 0, -1, QFlowSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getPrototype());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getFlowSection_Prototypes(), g1, null, "prototypes", null, 0, -1, QFlowSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowSection_Routines(), this.getRoutine(), null, "routines", null, 0, -1, QFlowSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEClass, QFor.class, "For", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFor_Increment(), ecorePackage.getEString(), "increment", null, 1, 1, QFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_Initialization(), ecorePackage.getEString(), "initialization", null, 1, 1, QFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, QIf.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Then(), this.getStatement(), null, "then", null, 0, 1, QIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Else(), this.getStatement(), null, "else", null, 0, 1, QIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIf_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, QIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeEClass, QInvoke.class, "Invoke", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterationEClass, QIteration.class, "Iteration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIteration_Body(), this.getStatement(), null, "body", null, 0, 1, QIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIteration_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, QIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jumpEClass, QJump.class, "Jump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJump_Label(), ecorePackage.getEString(), "label", null, 1, 1, QJump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, QLabel.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 1, 1, QLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodExecEClass, QMethodExec.class, "MethodExec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodExec_Object(), ecorePackage.getEString(), "object", null, 0, 1, QMethodExec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodExec_Method(), ecorePackage.getEString(), "method", null, 0, 1, QMethodExec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodExec_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, QMethodExec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, QModule.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monitorEClass, QMonitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitor_Body(), this.getStatement(), null, "body", null, 0, 1, QMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_OnErrors(), this.getOnError(), null, "onErrors", null, 0, -1, QMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onErrorEClass, QOnError.class, "OnError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnError_Body(), this.getStatement(), null, "body", null, 0, 1, QOnError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnError_Error(), ecorePackage.getEString(), "error", null, 0, 1, QOnError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterListEClass, QParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterList_Name(), ecorePackage.getEString(), "name", null, 0, 1, QParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterList_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, QParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureEClass, QProcedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcedure_Entry(), this.getEntry(), null, "entry", null, 0, 1, QProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getProcedure_ReturnType(), g1, null, "returnType", null, 0, 1, QProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureExecEClass, QProcedureExec.class, "ProcedureExec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcedureExec_Procedure(), ecorePackage.getEString(), "procedure", null, 0, 1, QProcedureExec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedureExec_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, QProcedureExec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, QProgram.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Entry(), this.getParameterList(), null, "entry", null, 0, 1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_Messages(), ecorePackage.getEString(), "messages", null, 0, -1, QProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prototypeEClass, QPrototype.class, "Prototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(prototypeEClass_DT);
		initEReference(getPrototype_Delegate(), g1, null, "delegate", null, 0, 1, QPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrototype_Entry(), this.getEntry(), null, "entry", null, 0, 1, QPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetEClass, QReset.class, "Reset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReset_Object(), ecorePackage.getEString(), "object", null, 0, 1, QReset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnEClass, QReturn.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturn_Value(), ecorePackage.getEString(), "value", null, 1, 1, QReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routineEClass, QRoutine.class, "Routine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(routineExecEClass, QRoutineExec.class, "RoutineExec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoutineExec_Routine(), ecorePackage.getEString(), "routine", null, 0, 1, QRoutineExec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setupSectionEClass, QSetupSection.class, "SetupSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetupSection_Annotations(), theIntegratedLanguageCorePackage.getAnnotation(), null, "annotations", null, 0, -1, QSetupSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetupSection_Application(), ecorePackage.getEString(), "application", null, 0, 1, QSetupSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetupSection_Encoding(), ecorePackage.getEString(), "encoding", null, 0, 1, QSetupSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetupSection_ExpressionType(), ecorePackage.getEString(), "expressionType", null, 0, 1, QSetupSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetupSection_Modules(), ecorePackage.getEString(), "modules", null, 0, -1, QSetupSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetupSection_TermSensitive(), ecorePackage.getEBoolean(), "termSensitive", null, 0, 1, QSetupSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlExecEClass, QSQLExec.class, "SQLExec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSQLExec_Statement(), ecorePackage.getEString(), "statement", null, 1, 1, QSQLExec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, QStatement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(statementEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatementVisitor(), "visitor", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statementVisitorEClass, QStatementVisitor.class, "StatementVisitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBlock(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBreak(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCall(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCommandExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContinue(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEval(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFor(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIf(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJump(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLabel(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMethodExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMonitor(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProcedureExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReturn(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoutineExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSQLExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatement(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUntil(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWhile(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBlock(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBreak(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCall(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCommandExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContinue(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEval(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFor(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIf(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJump(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLabel(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMethodExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMonitor(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProcedureExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReturn(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoutineExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSQLExec(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatement(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUntil(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWhile(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReset(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReset(), "statement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unitEClass, QUnit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, QUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Main(), this.getStatement(), null, "main", null, 0, 1, QUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitSectionEClass, QUnitSection.class, "UnitSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(untilEClass, QUntil.class, "Until", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileEClass, QWhile.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(evalOperatorEEnum, EvalOperator.class, "EvalOperator");
		addEEnumLiteral(evalOperatorEEnum, EvalOperator.ASSIGN);
		addEEnumLiteral(evalOperatorEEnum, EvalOperator.PLUS_ASSIGN);
		addEEnumLiteral(evalOperatorEEnum, EvalOperator.MINUS_ASSIGN);
		addEEnumLiteral(evalOperatorEEnum, EvalOperator.TIMES_ASSIGN);
		addEEnumLiteral(evalOperatorEEnum, EvalOperator.DIVIDE_ASSIGN);

		initEEnum(passingTypeEEnum, PassingType.class, "PassingType");
		addEEnumLiteral(passingTypeEEnum, PassingType.BY_NAME);
		addEEnumLiteral(passingTypeEEnum, PassingType.BY_REFERENCE);
		addEEnumLiteral(passingTypeEEnum, PassingType.BY_VALUE);

		// Create resource
		createResource(eNS_URI);
	}

} //ILFlowPackageImpl
