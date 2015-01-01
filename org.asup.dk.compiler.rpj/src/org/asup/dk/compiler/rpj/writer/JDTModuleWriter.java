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

import org.asup.dk.compiler.QCompilationSetup;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.asup.dk.compiler.rpj.RPJCallableUnitInfo;
import org.asup.il.data.QData;
import org.asup.il.data.QDataTerm;
import org.asup.il.data.annotation.ModuleDef;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QModule;
import org.asup.il.flow.QPrototype;
import org.asup.il.flow.QRoutine;
import org.asup.os.type.pgm.rpj.RPJProgramSupport;
import org.asup.os.type.pgm.rpj.RPJServiceSupport;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class JDTModuleWriter extends JDTCallableUnitWriter {

	public JDTModuleWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);
	}

	@SuppressWarnings("unchecked")
	public void writeModule(QModule module) throws IOException {

		// refactoring callable unit
		refactCallableUnit(module);

		// analyze callable unit
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(module);

		// modules
		for (String childModule : module.getSetupSection().getModules()) {
			writeImport(childModule);
		}

		writeSupportFields(callableUnitInfo);
		// TODO
		if(module.getName().equals("£JAX")){
			writeImport(QData.class);
			writeImport(RPJProgramSupport.class);

			VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
			FieldDeclaration field = getAST().newFieldDeclaration(variable);
			writeAnnotation(field, ModuleDef.class, "name", "*JAX");
			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			field.setType(getAST().newSimpleType(getAST().newName(RPJServiceSupport.class.getSimpleName())));
			variable.setName(getAST().newSimpleName("qJAX"));
			getTarget().bodyDeclarations().add(field);
		}


		writeModuleFields(module.getSetupSection().getModules());

		if (module.getFileSection() != null)
			writeDataSets(module.getFileSection().getDataSets());

		if (module.getDataSection() != null)
			writeDataFields(module.getDataSection());

		if (module.getFileSection() != null)
			writeKeyLists(module.getFileSection().getKeyLists());

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet());

		// main
		if (module.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(module.getMain());

			writeRoutine(routine);
		}

		// functions
		if (module.getFlowSection() != null) {

			// routines
			for (QRoutine routine : module.getFlowSection().getRoutines()) {
				writeRoutine(routine);
			}

			// prototype
			for (QPrototype<?> prototype : module.getFlowSection().getPrototypes()) {
				writePrototype(prototype);
			}
		}

		if (module.getDataSection() != null)
			for (QDataTerm<?> dataTerm : module.getDataSection().getDatas())
				writeInnerTerm(dataTerm);
	}
}