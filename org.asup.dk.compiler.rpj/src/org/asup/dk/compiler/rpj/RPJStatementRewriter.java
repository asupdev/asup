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

import org.asup.il.flow.QBlock;
import org.asup.il.flow.QBreak;
import org.asup.il.flow.QCall;
import org.asup.il.flow.QCommandExec;
import org.asup.il.flow.QContinue;
import org.asup.il.flow.QEval;
import org.asup.il.flow.QFor;
import org.asup.il.flow.QIf;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QJump;
import org.asup.il.flow.QLabel;
import org.asup.il.flow.QMethodExec;
import org.asup.il.flow.QMonitor;
import org.asup.il.flow.QProcedureExec;
import org.asup.il.flow.QReturn;
import org.asup.il.flow.QRoutineExec;
import org.asup.il.flow.QSQLExec;
import org.asup.il.flow.QStatement;
import org.asup.il.flow.QUntil;
import org.asup.il.flow.QWhile;
import org.asup.il.flow.impl.StatementVisitorImpl;

public class RPJStatementRewriter extends StatementVisitorImpl {

	
	private QBlock target;
	
	public RPJStatementRewriter(QBlock target) {
		this.target = target;
	}

	@Override
	public boolean visit(QBlock statement) {
		
		QBlock newBlock = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
		
		RPJStatementRewriter newRewriter = new RPJStatementRewriter(newBlock);
		statement.accept(newRewriter);
		
		this.target.getStatements().add(newBlock);
		
		return super.visit(statement);
	}

	@Override
	public boolean visit(QBreak statement) {
		
		this.target.getStatements().add(statement);

		return super.visit(statement);
	}

	@Override
	public boolean visit(QCall statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QCommandExec statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QContinue statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QEval statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QFor statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QProcedureExec statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QStatement statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QUntil statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QWhile statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QIf statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QJump statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QLabel statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QMethodExec statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QMonitor statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QReturn statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QRoutineExec statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QSQLExec statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

}
