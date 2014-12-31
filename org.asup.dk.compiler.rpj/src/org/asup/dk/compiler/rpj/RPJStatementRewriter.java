/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation 
 *   Mattia Rocchi - Implementation
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class RPJStatementRewriter extends StatementVisitorImpl {

	private QStatement target = null;

	public RPJStatementRewriter() {
	}

	protected abstract RPJStatementRewriter copy();

	public QStatement getTarget() {
		return this.target;
	} 

	@Override
	public boolean visit(QBlock statement) {

		RPJStatementRewriter newRewriter = copy();
		for (QStatement child : statement.getStatements()) {
			child.accept(newRewriter);
		}
		
		write(newRewriter.getTarget());

		return false;
	}

	@Override
	public boolean visit(QFor statement) {

		QFor newFor = (QFor) EcoreUtil.copy((EObject) statement);

		if(statement.getBody() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getBody().accept(newRewriter);
			newFor.setBody(newRewriter.getTarget());
		}

		write(newFor);

		return false;
	}

	@Override
	public boolean visit(QUntil statement) {

		QUntil newUntil =  (QUntil) EcoreUtil.copy((EObject) statement);

		if(statement.getBody() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getBody().accept(newRewriter);
			newUntil.setBody(newRewriter.getTarget());
		}

		write(newUntil);
		
		return false;
	}

	@Override
	public boolean visit(QWhile statement) {

		QWhile newWhile =  (QWhile) EcoreUtil.copy((EObject) statement);
		
		if(statement.getBody() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getBody().accept(newRewriter);
			newWhile.setBody(newRewriter.getTarget());
		}
		
		write(newWhile);
		
		return false;
	}

	@Override
	public boolean visit(QIf statement) {

		QIf newIf = (QIf) EcoreUtil.copy((EObject) statement);
		
		if(statement.getThen() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getThen().accept(newRewriter);
			newIf.setThen(newRewriter.getTarget());
		}		
		
		if(newIf.getElse() != null) {
			RPJStatementRewriter newRewriter = copy();
			newIf.getElse().accept(newRewriter);
			newIf.setElse(newRewriter.getTarget());
		}

		write(newIf);

		return false;
	}

	@Override
	public boolean visit(QMonitor statement) {

		QMonitor newMonitor = (QMonitor) EcoreUtil.copy((EObject) statement);

		if(statement.getBody() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getBody().accept(newRewriter);
			newMonitor.setBody(newRewriter.getTarget());
		}
		
		for (QOnError onError : statement.getOnErrors()) {
			QOnError newOnError = (QOnError) EcoreUtil.copy((EObject) onError);

			RPJStatementRewriter newRewriter = copy();
			onError.getBody().accept(newRewriter);
			newOnError.setBody(newRewriter.getTarget());
		}

		write(newMonitor);

		return false;
	}

	@Override
	public boolean visit(QBreak statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QCall statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QCommandExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QContinue statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QEval statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QProcedureExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QJump statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QLabel statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QMethodExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QReturn statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QRoutineExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QSQLExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	protected void write(QStatement statement) {

		// append statement
		if (this.target instanceof QBlock) {
			QBlock blockTarget = (QBlock) this.target;
			blockTarget.getStatements().add(statement);
		} 
		// switch statement to block
		else if (this.target != null) {
			QBlock newBlock = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
			newBlock.getStatements().add(this.target);
			newBlock.getStatements().add(statement);
			this.target = newBlock;
		}
		// write statement
		else
			this.target = statement;
	}
}