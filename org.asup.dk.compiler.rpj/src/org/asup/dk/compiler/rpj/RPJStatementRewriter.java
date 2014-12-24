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
	
	private QBlock origin;
	private QBlock target;	
	
	public RPJStatementRewriter(QBlock origin) {
		this.origin = origin;
		this.target = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();		
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
		
		if (statement !=  origin) {
			
			RPJStatementRewriter newRewriter = copy(statement);			
			statement.accept(newRewriter);
			QBlock newBlock = newRewriter.getTarget();
			write(newBlock);
			return false;
		} else {
			//statement.accept(this);
			return true;
		}		
	}
	
	@Override
	public boolean visit(QFor statement) {
		
		QFor newFor = QIntegratedLanguageFlowFactory.eINSTANCE.createFor();
		newFor.setInitialization(statement.getInitialization());
		newFor.setCondition(statement.getCondition());
		newFor.setIncrement(statement.getIncrement());
		
		if (statement.getBody() instanceof QBlock) {
		
			RPJStatementRewriter newRewriter = copy((QBlock)statement.getBody());
			statement.accept(newRewriter);
			newFor.setBody(newRewriter.getTarget());
		} else {
			newFor.setBody(statement.getBody());
		}
		
		write(newFor);
		
		return false;
	}
	
	@Override
	public boolean visit(QUntil statement) {
		
		QUntil newUntil = QIntegratedLanguageFlowFactory.eINSTANCE.createUntil();
		newUntil.setCondition(statement.getCondition());
		
		if (statement.getBody() instanceof QBlock) {
			
			RPJStatementRewriter newRewriter = copy((QBlock)statement.getBody());
			statement.accept(newRewriter);
			newUntil.setBody(newRewriter.getTarget());
		} else {
			newUntil.setBody(statement.getBody());
		}
		
		write(newUntil);
		
		return false;
	}

	@Override
	public boolean visit(QWhile statement) {
		
		QWhile newWhile = QIntegratedLanguageFlowFactory.eINSTANCE.createWhile();
		newWhile.setCondition(statement.getCondition());
		
		if (statement.getBody() instanceof QBlock) {
			
			RPJStatementRewriter newRewriter = copy((QBlock)statement.getBody());
			statement.accept(newRewriter);
			newWhile.setBody(newRewriter.getTarget());
		} else {
			newWhile.setBody(statement.getBody());
		}
		
		write(newWhile);
		
		return false;
	}
	
	@Override
	public boolean visit(QIf statement) {
	
		QIf newIf = QIntegratedLanguageFlowFactory.eINSTANCE.createIf();
		newIf.setCondition(statement.getCondition());
		
		if (statement.getThen() instanceof QBlock) {
			
			RPJStatementRewriter newRewriter = copy((QBlock)statement.getThen());
			statement.accept(newRewriter);
			newIf.setThen(newRewriter.getTarget());
		} else {
			newIf.setThen(statement.getThen());
		}
				
		if(statement.getElse() != null) {
			
			if (statement.getElse() instanceof QBlock) {
				
				RPJStatementRewriter newRewriter = copy((QBlock)statement.getElse());
				statement.accept(newRewriter);
				newIf.setElse(newRewriter.getTarget());
			} else {
				newIf.setElse(statement.getElse());
			}
		}
		
		write(newIf);

		return false;
	}
	
	@Override
	public boolean visit(QMonitor statement) {
		
		QMonitor newMonitor = QIntegratedLanguageFlowFactory.eINSTANCE.createMonitor();

		if (statement.getBody() instanceof QBlock) {
			
			RPJStatementRewriter newRewriter = copy((QBlock)statement.getBody());
			statement.accept(newRewriter);
			newMonitor.setBody(newRewriter.getTarget());
		} else {
			newMonitor.setBody(statement.getBody());
		}
		
		for(QOnError onError: statement.getOnErrors()) {

			QOnError newOnError = QIntegratedLanguageFlowFactory.eINSTANCE.createOnError();
			newOnError.setError(onError.getError());
			
			if (onError.getBody() instanceof QBlock) {
				
				RPJStatementRewriter newRewriter = copy((QBlock)onError.getBody());
				onError.getBody().accept(newRewriter);
				newOnError.setBody(newRewriter.getTarget());
			} else {
				newOnError.setBody(statement.getBody());
			}
		}
				
		write(newMonitor);

		return false;
	}

	
	
	@Override
	public boolean visit(QBreak statement) {
		
		QBreak newBreak = QIntegratedLanguageFlowFactory.eINSTANCE.createBreak();

		write(newBreak);

		return false;
	}

	@Override
	public boolean visit(QCall statement) {
		
		QCall newCall = QIntegratedLanguageFlowFactory.eINSTANCE.createCall();		
		newCall.setProgram(statement.getProgram());
		
		write(newCall);

		return false;
	}

	@Override
	public boolean visit(QCommandExec statement) {
		
		QCommandExec newCommandRxec = QIntegratedLanguageFlowFactory.eINSTANCE.createCommandExec();		
		newCommandRxec.setStatement(statement.getStatement());
		
		write(newCommandRxec);

		return false;
	}

	@Override
	public boolean visit(QContinue statement) {
		
		QContinue newContinue = QIntegratedLanguageFlowFactory.eINSTANCE.createContinue();
		
		write(newContinue);

		return false;
	}

	@Override
	public boolean visit(QEval statement) {
		
		QEval newEval = QIntegratedLanguageFlowFactory.eINSTANCE.createEval();
		newEval.setAssignment(statement.getAssignment());
		
		write(newEval);

		return false;
	}

	@Override
	public boolean visit(QProcedureExec statement) {
		
		QProcedureExec newProcedureExec = QIntegratedLanguageFlowFactory.eINSTANCE.createProcedureExec();
		newProcedureExec.setProcedure(statement.getProcedure());
		
		write(newProcedureExec);

		return false;
	}

	@Override
	public boolean visit(QJump statement) {
		
		QJump newJump = QIntegratedLanguageFlowFactory.eINSTANCE.createJump();
		newJump.setLabel(statement.getLabel());
		
		write(newJump);

		return false;
	}

	@Override
	public boolean visit(QLabel statement) {
		
		QLabel newLabel = QIntegratedLanguageFlowFactory.eINSTANCE.createLabel();
		newLabel.setName(statement.getName());
		
		write(newLabel);

		return false;
	}

	@Override
	public boolean visit(QMethodExec statement) {
		
		QMethodExec newMethodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		newMethodExec.setMethod(statement.getMethod());
		newMethodExec.setObject(statement.getObject());
		
		write(newMethodExec);

		return false;
	}

	@Override
	public boolean visit(QReturn statement) {
		
		QReturn newReturn = QIntegratedLanguageFlowFactory.eINSTANCE.createReturn();
		newReturn.setValue(statement.getValue());
		
		write(newReturn);

		return false;
	}

	@Override
	public boolean visit(QRoutineExec statement) {
		
		QRoutineExec newRoutineExec = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutineExec();
		newRoutineExec.setRoutine(statement.getRoutine());
		
		write(newRoutineExec);

		return false;
	}

	@Override
	public boolean visit(QSQLExec statement) {
		
		QSQLExec newSQLExec = QIntegratedLanguageFlowFactory.eINSTANCE.createSQLExec();
		newSQLExec.setStatement(statement.getStatement());
		
		write(newSQLExec);

		return false;
	}

}