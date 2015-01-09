/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi 			 - Initial API and implementation 
 *   Giuliano Giancristofaro - Implementation
 */
package org.asup.dk.compiler.rpj.writer;

import java.io.IOException;

import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.asup.dk.compiler.rpj.RPJCallableUnitInfo;
import org.asup.il.data.QDataTerm;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QProcedure;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;

public class JDTProcedureWriter extends JDTCallableUnitWriter {

	public JDTProcedureWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {

		super(root, compilationUnit, compilationSetup, name);
	}

	@SuppressWarnings("unchecked")
	public void writeProcedure(QProcedure procedure) throws IOException {

		// refactoring callable unit
		refactCallableUnit(procedure);

		// analyze callable unit
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(procedure);

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(procedure.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		writeModuleFields(procedure.getSetupSection().getModules(), false);

		if (procedure.getFileSection() != null) {
			writeDataSets(procedure.getFileSection().getDataSets());
			writeKeyLists(procedure.getFileSection().getKeyLists());
		}

		if (procedure.getDataSection() != null)
			writeDataFields(procedure.getDataSection());

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet());

		// main
		if (procedure.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(procedure.getMain());

			writeRoutine(routine);
		}

		// functions
		if (procedure.getFlowSection() != null) {

			// routines
			for (QRoutine routine : procedure.getFlowSection().getRoutines()) {
				writeRoutine(routine);
			}

			// prototype
			for (QPrototype<?> prototype : procedure.getFlowSection().getPrototypes()) {
				writePrototype(prototype);
			}
		}

		if (procedure.getDataSection() != null)
			for (QDataTerm<?> dataTerm : procedure.getDataSection().getDatas())
				writeInnerTerm(dataTerm);
	}

}
