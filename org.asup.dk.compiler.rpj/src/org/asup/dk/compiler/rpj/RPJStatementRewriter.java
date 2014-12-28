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
			statement.getBody().accept(newRewriter);
			newFor.setBody(newRewriter.getTarget());
		} else {
			newFor.setBody(cloneStatement(statement.getBody()));
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
			statement.getBody().accept(newRewriter);
			newUntil.setBody(newRewriter.getTarget());
		} else {
			newUntil.setBody(cloneStatement(statement.getBody()));
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
			statement.getBody().accept(newRewriter);
			newWhile.setBody(newRewriter.getTarget());
		} else {
			newWhile.setBody(cloneStatement(statement.getBody()));
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
			statement.getThen().accept(newRewriter);
			newIf.setThen(newRewriter.getTarget());
		} else {
			newIf.setThen(cloneStatement(statement.getThen()));
		}
				
		if(statement.getElse() != null) {
			
			if (statement.getElse() instanceof QBlock) {
				
				RPJStatementRewriter newRewriter = copy((QBlock)statement.getElse());
				statement.getElse().accept(newRewriter);
				newIf.setElse(newRewriter.getTarget());
			} else {
				newIf.setElse(cloneStatement(statement.getElse()));
			}
		}
		
		write(newIf);

		return false;
	}
	
	@Override
	public boolean visit(QMonitor statement) {
		
		QMonitor newMonitor = QIntegratedLanguageFlowFactory.eINSTANCE.createMonitor();
			
		RPJStatementRewriter newRewriter = copy(statement.getBody());
		statement.getBody().accept(newRewriter);
		newMonitor.setBody(newRewriter.getTarget());		
		
		for(QOnError onError: statement.getOnErrors()) {

			QOnError newOnError = QIntegratedLanguageFlowFactory.eINSTANCE.createOnError();
			newOnError.setError(onError.getError());
	
			newRewriter = copy(onError.getBody());
			onError.getBody().accept(newRewriter);
			newOnError.setBody(newRewriter.getTarget());
			
		}
				
		write(newMonitor);

		return false;
	}

	
	
	@Override
	public boolean visit(QBreak statement) {
		
		write(cloneStatement(statement));
		
		return false;
	}

	@Override
	public boolean visit(QCall statement) {
		
		write(cloneStatement(statement));

		return false;
	}

	@Override
	public boolean visit(QCommandExec statement) {
		
		write(cloneStatement(statement));
		return false;
	}

	@Override
	public boolean visit(QContinue statement) {
		
		write(cloneStatement(statement));

		return false;
	}

	@Override
	public boolean visit(QEval statement) {
		
		write(cloneStatement(statement));

		return false;
	}

	@Override
	public boolean visit(QProcedureExec statement) {
		
		write(cloneStatement(statement));

		return false;
	}

	@Override
	public boolean visit(QJump statement) {
		
		write(cloneStatement(statement));

		return false;
	}

	@Override
	public boolean visit(QLabel statement) {
		
		write(cloneStatement(statement));

		return false;
	}

	@Override
	public boolean visit(QMethodExec statement) {
		
		write(cloneStatement(statement));
		
		return false;
	}

	@Override
	public boolean visit(QReturn statement) {
		
		write(cloneStatement(statement));

		return false;
	}

	@Override
	public boolean visit(QRoutineExec statement) {
		
		write(cloneStatement(statement));
		
		return false;
	}

	@Override
	public boolean visit(QSQLExec statement) {
		
		write(cloneStatement(statement));

		return false;
	}
	
	/* Utility methods*/
	
	protected QStatement cloneStatement(QStatement statement) {

		if (statement instanceof QBreak) {
			
			return QIntegratedLanguageFlowFactory.eINSTANCE.createBreak();

		} else if (statement instanceof QCall) {
			
			QCall newCall = (QCall)QIntegratedLanguageFlowFactory.eINSTANCE.createCall();		
			newCall.setProgram(((QCall)statement).getProgram());			
			return newCall;
		} else if (statement instanceof QCommandExec) {
			
			QCommandExec newCommandExec = QIntegratedLanguageFlowFactory.eINSTANCE.createCommandExec();		
			newCommandExec.setStatement(((QCommandExec)statement).getStatement());
			return newCommandExec;
		} else if (statement instanceof QContinue) {
			
			QContinue newContinue = QIntegratedLanguageFlowFactory.eINSTANCE.createContinue();
			return newContinue;
		} else if (statement instanceof QEval) {
			
			QEval newEval = QIntegratedLanguageFlowFactory.eINSTANCE.createEval();
			newEval.setAssignment(((QEval)statement).getAssignment());
			return newEval;
		} else if (statement instanceof QProcedureExec) {
			
			QProcedureExec newProcedureExec = QIntegratedLanguageFlowFactory.eINSTANCE.createProcedureExec();
			newProcedureExec.setProcedure(((QProcedureExec)statement).getProcedure());
			return newProcedureExec;
		} else if (statement instanceof QJump) {
			
			QJump newJump = QIntegratedLanguageFlowFactory.eINSTANCE.createJump();
			newJump.setLabel(((QJump)statement).getLabel());
			return newJump;
		} else if (statement instanceof QLabel) {
			
			QLabel newLabel = QIntegratedLanguageFlowFactory.eINSTANCE.createLabel();
			newLabel.setName(((QLabel)statement).getName());
			return newLabel;
		} else if (statement instanceof QMethodExec) {
			
			QMethodExec newMethodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
			newMethodExec.setMethod(((QMethodExec)statement).getMethod());
			newMethodExec.setObject(((QMethodExec)statement).getObject());
			return newMethodExec;
		} else if (statement instanceof QReturn) {
			
			QReturn newReturn = QIntegratedLanguageFlowFactory.eINSTANCE.createReturn();
			newReturn.setValue(((QReturn)statement).getValue());
			return newReturn;
		} else if (statement instanceof QRoutineExec) {
			
			QRoutineExec newRoutineExec = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutineExec();
			newRoutineExec.setRoutine(((QRoutineExec)statement).getRoutine());
			return newRoutineExec;
		} else if (statement instanceof QSQLExec) {
			
			QSQLExec newSQLExec = QIntegratedLanguageFlowFactory.eINSTANCE.createSQLExec();
			newSQLExec.setStatement(((QSQLExec)statement).getStatement());
			return newSQLExec;
		}
		return null;
	}
		
		
	

}