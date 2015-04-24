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

public class JDTProgramTestWriter extends JDTCallableUnitWriter {

	public JDTProgramTestWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		writeImport(Program.class);
		writeImport(OperatingSystemRuntimeException.class);
	}
	
	public void writeProgramTest(QProgram programTest) throws IOException {
		System.out.println(programTest);

		refactCallableUnit(programTest);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(programTest);

		// modules
		List<String> modules = new ArrayList<>();
		if (programTest.getSetupSection() != null) {
			for (String module : programTest.getSetupSection().getModules())
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
		writeProgramAnnotation(programTest);

		writeSupportFields(callableUnitInfo);

		writeSupportProgramTestFields(callableUnitInfo);

		writeModuleFields(modules, false);

		if (programTest.getDataSection() != null)
			writeDataFields(programTest.getDataSection());

		if (programTest.getFileSection() != null) {
			writeDataSets(programTest.getFileSection().getDataSets());
			writeKeyLists(programTest.getFileSection().getKeyLists());
			writeCursors(programTest.getFileSection().getCursors());
			writeStatements(programTest.getFileSection().getStatements());
			writeDisplays(programTest.getFileSection().getDisplays());
			writePrinters(programTest.getFileSection().getPrinters());

		}

		writeInit();

		writeEntry(programTest, modules);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet());

		// main
		if (programTest.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(programTest.getMain());
			writeRoutine(routine);
		}

		// functions
		if (programTest.getFlowSection() != null) {

			// routines
			for (QRoutine routine : programTest.getFlowSection().getRoutines()) {
				System.out.println("\t" + routine);
				writeRoutine(routine);
			}

			// prototype
			for (QPrototype<?> prototype : programTest.getFlowSection().getPrototypes()) {
				writePrototype(prototype);
			}
		}

		if (programTest.getDataSection() != null) {
			for (QDataTerm<?> dataTerm : programTest.getDataSection().getDatas()) {
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