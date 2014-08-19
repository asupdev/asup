/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.il.flow.impl;

import org.asup.il.data.QDataTerm;
import org.asup.il.flow.EvalOperator;
import org.asup.il.flow.PassingType;
import org.asup.il.flow.QBlock;
import org.asup.il.flow.QBreak;
import org.asup.il.flow.QCall;
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
import org.asup.il.flow.QReturn;
import org.asup.il.flow.QRoutine;
import org.asup.il.flow.QRoutineExec;
import org.asup.il.flow.QSQLExec;
import org.asup.il.flow.QSetupSection;
import org.asup.il.flow.QUntil;
import org.asup.il.flow.QWhile;
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
public class IntegratedLanguageFlowFactoryImpl extends EFactoryImpl implements QIntegratedLanguageFlowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageFlowFactory init() {
		try {
			QIntegratedLanguageFlowFactory theIntegratedLanguageFlowFactory = (QIntegratedLanguageFlowFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageFlowPackage.eNS_URI);
			if (theIntegratedLanguageFlowFactory != null) {
				return theIntegratedLanguageFlowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageFlowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageFlowFactoryImpl() {
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
			case QIntegratedLanguageFlowPackage.BLOCK: return (EObject)createBlock();
			case QIntegratedLanguageFlowPackage.BREAK: return (EObject)createBreak();
			case QIntegratedLanguageFlowPackage.CALL: return (EObject)createCall();
			case QIntegratedLanguageFlowPackage.COMMAND_EXEC: return (EObject)createCommandExec();
			case QIntegratedLanguageFlowPackage.CONTINUE: return (EObject)createContinue();
			case QIntegratedLanguageFlowPackage.DATA_SECTION: return (EObject)createDataSection();
			case QIntegratedLanguageFlowPackage.ENTRY: return (EObject)createEntry();
			case QIntegratedLanguageFlowPackage.ENTRY_PARAMETER: return (EObject)createEntryParameter();
			case QIntegratedLanguageFlowPackage.EVAL: return (EObject)createEval();
			case QIntegratedLanguageFlowPackage.FILE_SECTION: return (EObject)createFileSection();
			case QIntegratedLanguageFlowPackage.FLOW_SECTION: return (EObject)createFlowSection();
			case QIntegratedLanguageFlowPackage.FOR: return (EObject)createFor();
			case QIntegratedLanguageFlowPackage.IF: return (EObject)createIf();
			case QIntegratedLanguageFlowPackage.JUMP: return (EObject)createJump();
			case QIntegratedLanguageFlowPackage.LABEL: return (EObject)createLabel();
			case QIntegratedLanguageFlowPackage.METHOD_EXEC: return (EObject)createMethodExec();
			case QIntegratedLanguageFlowPackage.MODULE: return (EObject)createModule();
			case QIntegratedLanguageFlowPackage.MONITOR: return (EObject)createMonitor();
			case QIntegratedLanguageFlowPackage.ON_ERROR: return (EObject)createOnError();
			case QIntegratedLanguageFlowPackage.PARAMETER_LIST: return (EObject)createParameterList();
			case QIntegratedLanguageFlowPackage.PROCEDURE: return (EObject)createProcedure();
			case QIntegratedLanguageFlowPackage.PROCEDURE_EXEC: return (EObject)createProcedureExec();
			case QIntegratedLanguageFlowPackage.PROGRAM: return (EObject)createProgram();
			case QIntegratedLanguageFlowPackage.PROTOTYPE: return (EObject)createPrototype();
			case QIntegratedLanguageFlowPackage.RETURN: return (EObject)createReturn();
			case QIntegratedLanguageFlowPackage.ROUTINE: return (EObject)createRoutine();
			case QIntegratedLanguageFlowPackage.ROUTINE_EXEC: return (EObject)createRoutineExec();
			case QIntegratedLanguageFlowPackage.SETUP_SECTION: return (EObject)createSetupSection();
			case QIntegratedLanguageFlowPackage.SQL_EXEC: return (EObject)createSQLExec();
			case QIntegratedLanguageFlowPackage.UNTIL: return (EObject)createUntil();
			case QIntegratedLanguageFlowPackage.WHILE: return (EObject)createWhile();
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
			case QIntegratedLanguageFlowPackage.EVAL_OPERATOR:
				return createEvalOperatorFromString(eDataType, initialValue);
			case QIntegratedLanguageFlowPackage.PASSING_TYPE:
				return createPassingTypeFromString(eDataType, initialValue);
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
			case QIntegratedLanguageFlowPackage.EVAL_OPERATOR:
				return convertEvalOperatorToString(eDataType, instanceValue);
			case QIntegratedLanguageFlowPackage.PASSING_TYPE:
				return convertPassingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBlock createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBreak createBreak() {
		BreakImpl break_ = new BreakImpl();
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCall createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCommandExec createCommandExec() {
		CommandExecImpl commandExec = new CommandExecImpl();
		return commandExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContinue createContinue() {
		ContinueImpl continue_ = new ContinueImpl();
		return continue_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataSection createDataSection() {
		DataSectionImpl dataSection = new DataSectionImpl();
		return dataSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QEntry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <DT extends QDataTerm<?>> QEntryParameter<DT> createEntryParameter() {
		EntryParameterImpl<DT> entryParameter = new EntryParameterImpl<DT>();
		return entryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QEval createEval() {
		EvalImpl eval = new EvalImpl();
		return eval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFileSection createFileSection() {
		FileSectionImpl fileSection = new FileSectionImpl();
		return fileSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFlowSection createFlowSection() {
		FlowSectionImpl flowSection = new FlowSectionImpl();
		return flowSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIf createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QJump createJump() {
		JumpImpl jump = new JumpImpl();
		return jump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QLabel createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMethodExec createMethodExec() {
		MethodExecImpl methodExec = new MethodExecImpl();
		return methodExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QModule createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMonitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOnError createOnError() {
		OnErrorImpl onError = new OnErrorImpl();
		return onError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QParameterList createParameterList() {
		ParameterListImpl parameterList = new ParameterListImpl();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProcedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProcedureExec createProcedureExec() {
		ProcedureExecImpl procedureExec = new ProcedureExecImpl();
		return procedureExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProgram createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <DT extends QDataTerm<?>> QPrototype<DT> createPrototype() {
		PrototypeImpl<DT> prototype = new PrototypeImpl<DT>();
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QReturn createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRoutine createRoutine() {
		RoutineImpl routine = new RoutineImpl();
		return routine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRoutineExec createRoutineExec() {
		RoutineExecImpl routineExec = new RoutineExecImpl();
		return routineExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSetupSection createSetupSection() {
		SetupSectionImpl setupSection = new SetupSectionImpl();
		return setupSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSQLExec createSQLExec() {
		SQLExecImpl sqlExec = new SQLExecImpl();
		return sqlExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QUntil createUntil() {
		UntilImpl until = new UntilImpl();
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWhile createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvalOperator createEvalOperatorFromString(EDataType eDataType, String initialValue) {
		EvalOperator result = EvalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassingType createPassingTypeFromString(EDataType eDataType, String initialValue) {
		PassingType result = PassingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageFlowPackage getIntegratedLanguageFlowPackage() {
		return (QIntegratedLanguageFlowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFor createFor() {
		ForImpl for_ = new ForImpl();
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageFlowPackage getPackage() {
		return QIntegratedLanguageFlowPackage.eINSTANCE;
	}

} //QIntegratedLanguageFlowFactoryImpl
