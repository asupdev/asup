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
package org.asup.dk.compiler.rpj;

import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QCommandExec;
import org.asup.il.flow.QJump;
import org.asup.il.flow.QLabel;
import org.asup.il.flow.QRoutine;
import org.asup.il.flow.impl.StatementVisitorImpl;

public class RPJCallableUnitAnalyzer extends StatementVisitorImpl {

	private RPJCallableUnitInfo programInfo;

	private RPJCallableUnitAnalyzer(RPJCallableUnitInfo programInfo) {
		this.programInfo = programInfo;
	}

	public static RPJCallableUnitInfo analyzeCallableUnit(QCallableUnit callableUnit) {

		RPJCallableUnitInfo callableUnitInfo = new RPJCallableUnitInfo();
		
		// analyze statement
		RPJCallableUnitAnalyzer callableUnitAnalyzer = new RPJCallableUnitAnalyzer(callableUnitInfo);

		// main
		if (callableUnit.getMain() != null) 
			callableUnit.getMain().accept(callableUnitAnalyzer);

		// flow section
		if (callableUnit.getFlowSection() != null) {

			// routines
			for (QRoutine routine : callableUnit.getFlowSection().getRoutines()) {
				if(routine.getMain() != null)
					routine.getMain().accept(callableUnitAnalyzer);
			}
		}

		if(callableUnit.getFileSection() != null && !callableUnit.getFileSection().getStatements().isEmpty())
			callableUnitInfo.containsSQLStatement(true);

		return callableUnitInfo;
	}

	
	@Override
	public boolean visit(QJump statement) {

		RPJCallableUnitInfo.Label label = programInfo.getLabels().get(statement.getLabel());
		if (label == null) {
			label = new RPJCallableUnitInfo.Label();
			programInfo.getLabels().put(statement.getLabel(), label);
		}
		label.jumpsCount++;

		return super.visit(statement);
	}

	@Override
	public boolean visit(QLabel statement) {

		RPJCallableUnitInfo.Label label = programInfo.getLabels().get(statement.getName());
		if (label == null) {
			label = new RPJCallableUnitInfo.Label();
			programInfo.getLabels().put(statement.getName(), label);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QCommandExec statement) {
		
		programInfo.containsCMDStatement(true);
		
		return super.visit(statement);
	}
}
