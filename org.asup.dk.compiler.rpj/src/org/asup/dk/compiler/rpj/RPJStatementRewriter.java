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
import org.asup.il.flow.QOnError;
import org.asup.il.flow.QProcedureExec;
import org.asup.il.flow.QReturn;
import org.asup.il.flow.QRoutineExec;
import org.asup.il.flow.QSQLExec;
import org.asup.il.flow.QStatement;
import org.asup.il.flow.QUntil;
import org.asup.il.flow.QWhile;
import org.asup.il.flow.impl.StatementVisitorImpl;

public abstract class RPJStatementRewriter extends StatementVisitorImpl {
	
	private QBlock target;
	
	public RPJStatementRewriter(QBlock target) {
		this.target = target;
	}	

	protected abstract RPJStatementRewriter copy(QBlock block);
	
	public QBlock getTarget() {
		return target;
	}

	protected void write(QStatement statement) {
		this.target.getStatements().add(statement);
	}
	
	@Override
	public boolean visit(QBlock statement) {
		
		QBlock newBlock = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
		
		RPJStatementRewriter newRewriter = copy(newBlock);
		statement.accept(newRewriter);
		
		write(newBlock);
		
		return false;
	}
	
	@Override
	public boolean visit(QFor statement) {
		
		QFor newFor = QIntegratedLanguageFlowFactory.eINSTANCE.createFor();
		newFor.setInitialization(statement.getInitialization());
		newFor.setCondition(statement.getCondition());
		newFor.setIncrement(statement.getIncrement());
		
		QBlock newBody = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
		newFor.setBody(newBody);
		
		RPJStatementRewriter newRewriter = copy(newBody);
		statement.accept(newRewriter);
		
		write(newFor);
		
		return false;
	}
	
	@Override
	public boolean visit(QUntil statement) {
		
		QUntil newUntil = QIntegratedLanguageFlowFactory.eINSTANCE.createUntil();
		newUntil.setCondition(statement.getCondition());
		
		QBlock newBody = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
		newUntil.setBody(newBody);
		
		RPJStatementRewriter newRewriter = copy(newBody);
		statement.accept(newRewriter);
		
		write(newUntil);
		
		return false;
	}

	@Override
	public boolean visit(QWhile statement) {
		
		QWhile newWhile = QIntegratedLanguageFlowFactory.eINSTANCE.createWhile();
		newWhile.setCondition(statement.getCondition());
		
		QBlock newBody = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
		newWhile.setBody(newBody);
		
		RPJStatementRewriter newRewriter = copy(newBody);
		statement.accept(newRewriter);
		
		write(newWhile);
		
		return false;
	}
	
	@Override
	public boolean visit(QIf statement) {
	
		QIf newIf = QIntegratedLanguageFlowFactory.eINSTANCE.createIf();
		newIf.setCondition(statement.getCondition());
		
		QBlock thenBlock = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
		newIf.setThen(thenBlock);
		
		RPJStatementRewriter newRewriter = copy(thenBlock);
		statement.getThen().accept(newRewriter);
				
		if(statement.getElse() != null) {
			QBlock elseBlock = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
			newIf.setElse(elseBlock);
			
			newRewriter = copy(elseBlock);
			statement.getElse().accept(newRewriter);
		}
		
		write(newIf);

		return false;
	}
	
	@Override
	public boolean visit(QMonitor statement) {
		
		QMonitor newMonitor = QIntegratedLanguageFlowFactory.eINSTANCE.createMonitor();

		QBlock newBody = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
		newMonitor.setBody(newBody);
		
		RPJStatementRewriter newRewriter = copy(newBody);
		statement.accept(newRewriter);
		
		for(QOnError onError: statement.getOnErrors()) {

			QOnError newOnError = QIntegratedLanguageFlowFactory.eINSTANCE.createOnError();
			newOnError.setError(onError.getError());
			
			QBlock newErrorBody = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
			newOnError.setBody(newErrorBody);
			
			newRewriter = copy(newErrorBody);
			onError.getBody().accept(newRewriter);			
			
		}
				
		write(newMonitor);

		return false;
	}

	
	
	@Override
	public boolean visit(QBreak statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QCall statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QCommandExec statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QContinue statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QEval statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QProcedureExec statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QJump statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QLabel statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QMethodExec statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QReturn statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QRoutineExec statement) {
		
		write(statement);

		return false;
	}

	@Override
	public boolean visit(QSQLExec statement) {
		
		write(statement);

		return false;
	}

}