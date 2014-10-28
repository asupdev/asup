package org.asup.dk.compiler.rpj.visitor;

import org.asup.il.flow.QBlock;
import org.asup.il.flow.QBreak;
import org.asup.il.flow.QCall;
import org.asup.il.flow.QCommandExec;
import org.asup.il.flow.QContinue;
import org.asup.il.flow.QEval;
import org.asup.il.flow.QFor;
import org.asup.il.flow.QIf;
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

public class RPJStatementRefactor extends StatementVisitorImpl {

	private QStatement statement;
	
	protected QStatement getStatement() {
		return this.statement;
	}

	@Override
	public boolean visit(QBlock statement) {
		// TODO Auto-generated method stub
		return super.visit(statement);
	}

	@Override
	public boolean visit(QBreak statement) {
		// TODO Auto-generated method stub
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
