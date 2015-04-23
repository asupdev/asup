/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi				- Initial API and implementation 
 */
package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.QCompilerLinker;
import org.asup.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.asup.dk.compiler.rpj.RPJCallableUnitInfo;
import org.asup.fw.core.annotation.Supported;
import org.asup.fw.core.annotation.ToDo;
import org.asup.fw.core.annotation.Unsupported;
import org.asup.il.core.QConversion;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.annotation.Program;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QParameterList;
import org.asup.il.flow.QProgram;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.os.core.OperatingSystemRuntimeException;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;

public class JDTProgramWriter extends JDTCallableUnitWriter {

	public JDTProgramWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		writeImport(Program.class);
		writeImport(OperatingSystemRuntimeException.class);
	}

	public void writeProgram(QProgram program) throws IOException {

		System.out.println(program);

		refactCallableUnit(program);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(program);

		// modules
		List<String> modules = new ArrayList<>();
		if (program.getSetupSection() != null) {
			for (String module : program.getSetupSection().getModules())
				loadModules(modules, module);

			for (String module : modules) {

				QModule flowModule = getCompilationUnit().getModule(module, true);
				if (flowModule == null)
					throw new IOException("Invalid module: " + module);

				QCompilerLinker compilerLinker = flowModule.getFacet(QCompilerLinker.class);
				if (compilerLinker != null)
					writeImport(compilerLinker.getLinkedClass());
				else
					writeImport(module);
			}
		}

		// Program annotation
		writeProgramAnnotation(program);

		writeSupportFields(callableUnitInfo);

		writeModuleFields(modules, false);

		if (program.getDataSection() != null)
			writeDataFields(program.getDataSection());

		if (program.getFileSection() != null) {
			writeDataSets(program.getFileSection().getDataSets());
			writeKeyLists(program.getFileSection().getKeyLists());
			writeCursors(program.getFileSection().getCursors());
			writeStatements(program.getFileSection().getStatements());
			writeDisplays(program.getFileSection().getDisplays());
			writePrinters(program.getFileSection().getPrinters());

		}

		writeInit();

		writeEntry(program, modules);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet());

		// main
		if (program.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(program.getMain());
			writeRoutine(routine);
		}

		// functions
		if (program.getFlowSection() != null) {

			// routines
			for (QRoutine routine : program.getFlowSection().getRoutines()) {
				System.out.println("\t" + routine);
				writeRoutine(routine);
			}

			// prototype
			for (QPrototype<?> prototype : program.getFlowSection().getPrototypes()) {
				writePrototype(prototype);
			}
		}

		if (program.getDataSection() != null) {
			for (QDataTerm<?> dataTerm : program.getDataSection().getDatas()) {
				writeInnerTerm(dataTerm);
			}
		}
	}
	
	public void writeUnitTest(QProgram unitTest) throws IOException {
		System.out.println(unitTest);

		refactCallableUnit(unitTest);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(unitTest);

		// modules
		List<String> modules = new ArrayList<>();
		if (unitTest.getSetupSection() != null) {
			for (String module : unitTest.getSetupSection().getModules())
				loadModules(modules, module);

			for (String module : modules) {

				QModule flowModule = getCompilationUnit().getModule(module, true);
				if (flowModule == null)
					throw new IOException("Invalid module: " + module);

				QCompilerLinker compilerLinker = flowModule.getFacet(QCompilerLinker.class);
				if (compilerLinker != null)
					writeImport(compilerLinker.getLinkedClass());
				else
					writeImport(module);
			}
		}

		// Program annotation
		writeProgramAnnotation(unitTest);

		writeSupportFields(callableUnitInfo);

		writeSupportUnitTestFields(callableUnitInfo);

		writeModuleFields(modules, false);

		if (unitTest.getDataSection() != null)
			writeDataFields(unitTest.getDataSection());

		if (unitTest.getFileSection() != null) {
			writeDataSets(unitTest.getFileSection().getDataSets());
			writeKeyLists(unitTest.getFileSection().getKeyLists());
			writeCursors(unitTest.getFileSection().getCursors());
			writeStatements(unitTest.getFileSection().getStatements());
			writeDisplays(unitTest.getFileSection().getDisplays());
			writePrinters(unitTest.getFileSection().getPrinters());

		}

		writeInit();

		writeEntry(unitTest, modules);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet());

		// main
		if (unitTest.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(unitTest.getMain());
			writeRoutine(routine);
		}

		// functions
		if (unitTest.getFlowSection() != null) {

			// routines
			for (QRoutine routine : unitTest.getFlowSection().getRoutines()) {
				System.out.println("\t" + routine);
				writeRoutine(routine);
			}

			// prototype
			for (QPrototype<?> prototype : unitTest.getFlowSection().getPrototypes()) {
				writePrototype(prototype);
			}
		}

		if (unitTest.getDataSection() != null) {
			for (QDataTerm<?> dataTerm : unitTest.getDataSection().getDatas()) {
				writeInnerTerm(dataTerm);
			}
		}
		
	}


	public void writeEntry(QProgram program, List<String> modules) throws IOException {

		if (program.getEntry() != null) {
			writeEntry(program.getEntry(), "qEntry");
		} else {
			for (String module : modules) {

				QModule flowModule = getCompilationUnit().getModule(module, true);
				if (flowModule == null)
					throw new IOException("Invalid module: " + module);

				QParameterList parameterList = null;
				for (QParameterList pl : flowModule.getFlowSection().getParameterLists()) {
					if (pl.getName().equals("*ENTRY")) {
						parameterList = pl;
						break;
					}
				}

				if (parameterList != null) {
					writeEntry(parameterList, "qEntry");
					break;
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void writeProgramAnnotation(QProgram program) {
		QConversion conversion = program.getFacet(QConversion.class);
		if (conversion != null) {
			MarkerAnnotation conversionAnnotation = getAST().newMarkerAnnotation();

			switch (conversion.getStatus()) {
			case POSSIBLE:
				break;
			case SUPPORTED:
				writeImport(Supported.class);
				conversionAnnotation.setTypeName(getAST().newSimpleName(Supported.class.getSimpleName()));
				getTarget().modifiers().add(conversionAnnotation);
				break;
			case TODO:
				writeImport(ToDo.class);
				conversionAnnotation.setTypeName(getAST().newSimpleName(ToDo.class.getSimpleName()));
				getTarget().modifiers().add(conversionAnnotation);
				break;
			case UNSUPPORTED:
				writeImport(Unsupported.class);
				conversionAnnotation.setTypeName(getAST().newSimpleName(Unsupported.class.getSimpleName()));
				getTarget().modifiers().add(conversionAnnotation);
				break;
			}
		}

		// @Program(name=)
		NormalAnnotation programAnnotation = getAST().newNormalAnnotation();
		programAnnotation.setTypeName(getAST().newSimpleName(Program.class.getSimpleName()));
		MemberValuePair memberValuePair = getAST().newMemberValuePair();
		memberValuePair.setName(getAST().newSimpleName("name"));
		StringLiteral stringLiteral = getAST().newStringLiteral();
		stringLiteral.setLiteralValue(program.getName());
		memberValuePair.setValue(stringLiteral);
		programAnnotation.values().add(memberValuePair);

		getTarget().modifiers().add(0, programAnnotation);
	}

	private void loadModules(Collection<String> modules, String module) {

		if (!modules.contains(module))
			modules.add(module);

		QModule qModule = getCompilationUnit().getModule(module, true);
		for (String moduleName : qModule.getSetupSection().getModules())
			loadModules(modules, moduleName);
	}
}