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
package org.asup.dk.compiler.rpj.dbl;

import java.sql.SQLException;

import org.asup.db.syntax.QBindingParseResult;
import org.asup.db.syntax.QBindingParser;
import org.asup.db.syntax.QBindingStatement;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.dbl.QCloseStatement;
import org.asup.db.syntax.dbl.QDeclareCursorStatement;
import org.asup.db.syntax.dbl.QDescribeStatement;
import org.asup.db.syntax.dbl.QExecuteImmediateStatement;
import org.asup.db.syntax.dbl.QExecuteStatement;
import org.asup.db.syntax.dbl.QFetchStatement;
import org.asup.db.syntax.dbl.QIntoClause;
import org.asup.db.syntax.dbl.QMultipleRowFetchClause;
import org.asup.db.syntax.dbl.QOpenStatement;
import org.asup.db.syntax.dbl.QPrepareStatement;
import org.asup.db.syntax.dbl.QSetTransactionStatement;
import org.asup.db.syntax.dml.QExtendedQuerySelect;
import org.asup.db.syntax.util.DBSyntaxHelper;
import org.asup.dk.compiler.rpj.RPJStatementRewriter;
import org.asup.il.esql.CursorType;
import org.asup.il.esql.QCursorTerm;
import org.asup.il.esql.QIntegratedLanguageEmbeddedSQLFactory;
import org.asup.il.esql.QStatementTerm;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QFileSection;
import org.asup.il.flow.QIntegratedLanguageFlowFactory;
import org.asup.il.flow.QMethodExec;
import org.asup.il.flow.QSQLExec;
import org.asup.il.flow.QStatement;
import org.asup.il.flow.impl.IntegratedLanguageFlowFactoryImpl;
import org.eclipse.datatools.modelbase.sql.query.QueryExpressionBody;
import org.eclipse.datatools.modelbase.sql.query.QuerySelectStatement;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionVariable;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatement;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class DBLStatementRewriter extends RPJStatementRewriter {
	
	private QCallableUnit callableUnit;
	private QBindingParser bindingParser;
	private QQueryParser queryParser;

	public static interface STATEMENT_METHOD {
		String PREPARE = "prepare";
		String EXECUTE = "execute";
	}

	public static interface CURSOR_METHOD {
		String NEXT = "next";
		String PRIOR = "prior";
		String FIRST = "first";
		String LAST = "last";
		String BEFORE = "before";
		String AFTER = "after";
		String CURRENT = "current";
		String RELATIVE = "realative";
	}

	public static final String SET_TRANSACTION_METHOD = "SET_TRANSACTION_METHOD";
	public static final String DESCRIBE_METHOD = "DESCRIBE_METHOD";

	public static final String EXECUTE_IMMEDIATE_METHOD = "%execute";
	public static final String SELECT_METHOD = "%select";
	
	/*************** Public static parameters definitions */

	public static final String NONE = "*OMIT";

	public static interface ISOLATION_LEVEL {
		String SERIALIZABLE = "SERIALIZABLE";
		String NO_COMMIT = "NO_COMMIT";
		String READ_UNCOMMITTED = "READ_UNCOMMITTED";
		String READ_COMMITTED = "READ_COMMITTED";
		String REPEATABLE_READ = "REPEATABLE_READ";
	}

	public static interface READ_OPERATION {
		String READ_ONLY = "READ_ONLY";
		String READ_WRITE = "READ_WRITE";
	}

	public static interface USING {
		String NAMES = "NAMES";
		String LABELS = "LABELS";
		String ANY = "ANY";
		String BOTH = "BOTH";
		String ALL = "ALL";
		String SYSTEM_NAMES = "SYSTEM_NAMES";
	}

	public DBLStatementRewriter(QCallableUnit callableUnit, QBindingParser bindingParser, QQueryParser queryParser) {
		super();

		this.callableUnit = callableUnit;
		this.bindingParser = bindingParser;
		this.queryParser = queryParser;
	}

	@Override
	protected RPJStatementRewriter copy() {
		return new DBLStatementRewriter(callableUnit, bindingParser, queryParser);
	}

	@Override
	public boolean visit(QSQLExec statement) {

		String dblString = statement.getStatement();

		if (DBSyntaxHelper.isDBLStatement(dblString)) {

			QStatement rewritedStatement = null;

			try {

				if (isSelectIntoStatement(dblString))
					rewritedStatement = manageSelectIntoStatement(dblString);
				else
					rewritedStatement = manageDBLStametemnt(dblString);

			} catch (SQLException e) {
				// TODO TODO Manage parse error
				e.printStackTrace();
			}

			if (rewritedStatement != null)
				write(rewritedStatement);

		} else {
			System.err.println(statement);
			write((QStatement) EcoreUtil.copy((EObject) statement));
		}

		return false;
	}

	private QStatement manageDBLStametemnt(String dblString) throws SQLException {

		QStatement result = null;

		QBindingParseResult parseBindingResult = bindingParser.parseBinding(dblString);

		if (parseBindingResult != null) {

			QBindingStatement bindingStatement = parseBindingResult.getBindingStatement();

			if (bindingStatement instanceof QSetTransactionStatement) {
				result = manageSetTransactionStatement((QSetTransactionStatement) bindingStatement);

			} else if (bindingStatement instanceof QExecuteStatement) {
				result = manageExecuteStatement((QExecuteStatement) bindingStatement);

			} else if (bindingStatement instanceof QExecuteImmediateStatement) {
				result = manageExecuteImmediateStatement((QExecuteImmediateStatement) bindingStatement);
			} else if (bindingStatement instanceof QOpenStatement) {
				result = manageOpenStatement((QOpenStatement) bindingStatement);

			} else if (bindingStatement instanceof QPrepareStatement) {
				result = managePrepareStatement((QPrepareStatement) bindingStatement);

			} else if (bindingStatement instanceof QDeclareCursorStatement) {
				result = manageDeclareCursorStatement((QDeclareCursorStatement) bindingStatement);

			} else if (bindingStatement instanceof QDescribeStatement) {
				result = manageDescribeStatement((QDescribeStatement) bindingStatement);

			} else if (bindingStatement instanceof QFetchStatement) {
				result = manageFetchStatement((QFetchStatement) bindingStatement);

			} else if (bindingStatement instanceof QCloseStatement) {
				result = manageCloseStatement((QCloseStatement) bindingStatement);
			}

		} else {
			// TODO: manage parser error
		}

		return result;
	}

	private QStatement manageDeclareCursorStatement(QDeclareCursorStatement bindingStatement) {

		QCursorTerm cursorTerm = QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE.createCursorTerm();
		cursorTerm.setName(bindingStatement.getCursorName());
		switch (bindingStatement.getCursorType()) {
		case DYNSCROLL:
			cursorTerm.setCursorType(CursorType.DYNAMIC_SCROLL);
			break;
		case NOTSCROLL:
			cursorTerm.setCursorType(CursorType.NOT_SCROLLABLE);
			break;
		case SCROLL:
			cursorTerm.setCursorType(CursorType.SCROLLABLE);
			break;
		default:
			break;
		}
		cursorTerm.setHold(bindingStatement.isHold());
		cursorTerm.setSql(bindingStatement.getForQuery());

		QFileSection fileSection = this.callableUnit.getFileSection();
		if (fileSection == null) {
			fileSection = QIntegratedLanguageFlowFactory.eINSTANCE.createFileSection();
			this.callableUnit.setFileSection(fileSection);
		}

		fileSection.getCursors().add(cursorTerm);

		return null;
	}

	private QStatement manageOpenStatement(QOpenStatement bindingStatement) {

		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getCursor());
		methodExec.setMethod("open");

		return methodExec;
	}

	private QStatement manageCloseStatement(QCloseStatement bindingStatement) {

		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getCursor());
		methodExec.setMethod("close");

		return methodExec;
	}

	private QStatement managePrepareStatement(QPrepareStatement bindingStatement) {

		QStatementTerm statementTerm = getStatementTerm(bindingStatement.getStatementName());
		if (statementTerm == null) {
			statementTerm = QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE.createStatementTerm();
			statementTerm.setName(bindingStatement.getStatementName());

			QFileSection fileSection = this.callableUnit.getFileSection();
			if (fileSection == null) {
				fileSection = QIntegratedLanguageFlowFactory.eINSTANCE.createFileSection();
				this.callableUnit.setFileSection(fileSection);
			}

			fileSection.getStatements().add(statementTerm);
		}

		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();

		methodExec.setObject(bindingStatement.getStatementName());
		methodExec.setMethod(STATEMENT_METHOD.PREPARE);
		methodExec.getParameters().add(bindingStatement.getFrom().substring(1));

		// Par 2 and 3
		if (bindingStatement.getInto() != null) {
			// Par 2
			QIntoClause intoClause = bindingStatement.getInto();
			methodExec.getParameters().add(intoClause.getDescriptorName());

			// Par 3
			if (intoClause.getUsing() != null) {
				switch (intoClause.getUsing()) {
				case ALL:
					methodExec.getParameters().add(USING.ALL);
					break;
				case ANY:
					methodExec.getParameters().add(USING.ANY);
					break;
				case BOTH:
					methodExec.getParameters().add(USING.BOTH);
					break;
				case LABELS:
					methodExec.getParameters().add(USING.LABELS);
					break;
				case NAMES:
					methodExec.getParameters().add(USING.NAMES);
					break;
				case NONE:
					methodExec.getParameters().add(NONE);
					break;
				case SYSTEM_NAMES:
					methodExec.getParameters().add(USING.SYSTEM_NAMES);
					break;
				default:
					methodExec.getParameters().add(NONE);
					break;
				}
			}

		}

		return methodExec;
	}

	private QStatement manageFetchStatement(QFetchStatement bindingStatement) {

		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getCursorName());

		if (bindingStatement.getPosition() != null) {

			switch (bindingStatement.getPosition()) {
			case AFTER:
				methodExec.setMethod(CURSOR_METHOD.AFTER);
				break;
			case BEFORE:
				methodExec.setMethod(CURSOR_METHOD.BEFORE);
				break;
			case CURRENT:
				methodExec.setMethod(CURSOR_METHOD.CURRENT);
				break;
			case FIRST:
				methodExec.setMethod(CURSOR_METHOD.FIRST);
				break;
			case LAST:
				methodExec.setMethod(CURSOR_METHOD.LAST);
				break;
			case NEXT:
				methodExec.setMethod(CURSOR_METHOD.NEXT);
				break;
			case PRIOR:
				methodExec.setMethod(CURSOR_METHOD.PRIOR);
				break;
			case RELATIVE:
				methodExec.setMethod(CURSOR_METHOD.RELATIVE);
				if (bindingStatement.getRelativePosition() != null)
					methodExec.getParameters().add(bindingStatement.getRelativePosition());
				break;
			}
		} else
			methodExec.setMethod(CURSOR_METHOD.NEXT);

		if (bindingStatement.getInto() != null) {

			// Single fetch or Multiple Row Fetch?
			if (bindingStatement.getMultipleRowClause() != null) {

				// Into
				methodExec.getParameters().add(bindingStatement.getInto());

				QMultipleRowFetchClause multipleRowClause = bindingStatement.getMultipleRowClause();

				// Rows number
				methodExec.getParameters().add(multipleRowClause.getRowsNumber());

				if (multipleRowClause.getDescriptor() != null)
					methodExec.getParameters().add(multipleRowClause.getDescriptor());
			}
			// Single row fetch
			else {

				// Into
				methodExec.getParameters().add(bindingStatement.getInto().substring(1));
			}

		}

		return methodExec;
	}

	private QStatement manageExecuteStatement(QExecuteStatement bindingStatement) {

		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getStatementName());
		methodExec.setMethod(STATEMENT_METHOD.EXECUTE);

		return methodExec;
	}

	private QStatement manageExecuteImmediateStatement(QExecuteImmediateStatement bindingStatement) {

		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		methodExec.setObject("*SQL");
		methodExec.setMethod(EXECUTE_IMMEDIATE_METHOD);
		methodExec.getParameters().add(bindingStatement.getVariable());

		return methodExec;
	}

	private QStatement manageDescribeStatement(QDescribeStatement bindingStatement) {
		System.out.println("Manage DESCRIBE");

		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();

		methodExec.setMethod(DESCRIBE_METHOD);
		methodExec.setObject(null); // TODO: null?

		/*
		 * PREPARE_METHOD parameter list: 1) Statement name 2) Into variable 3)
		 * Using
		 */

		// Par 1
		methodExec.getParameters().add(bindingStatement.getStatementName());

		// Par 2
		QIntoClause intoClause = bindingStatement.getInto();
		methodExec.getParameters().add(intoClause.getDescriptorName());

		// Par 3
		if (intoClause.getUsing() != null) {
			switch (intoClause.getUsing()) {
			case ALL:
				methodExec.getParameters().add(USING.ALL);
				break;
			case ANY:
				methodExec.getParameters().add(USING.ANY);
				break;
			case BOTH:
				methodExec.getParameters().add(USING.BOTH);
				break;
			case LABELS:
				methodExec.getParameters().add(USING.LABELS);
				break;
			case NAMES:
				methodExec.getParameters().add(USING.NAMES);
				break;
			case NONE:
				methodExec.getParameters().add(NONE);
				break;
			case SYSTEM_NAMES:
				methodExec.getParameters().add(USING.SYSTEM_NAMES);
				break;
			default:
				methodExec.getParameters().add(NONE);
				break;
			}
		} else {
			methodExec.getParameters().add(NONE);
		}

		return methodExec;
	}

	private QStatement manageSetTransactionStatement(QSetTransactionStatement bindingStatement) {
		System.out.println("Manage SET TRANSACTION");

		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();

		methodExec.setMethod(SET_TRANSACTION_METHOD);
		methodExec.setObject(null);

		/*
		 * SET_TRANSACTION parameter list: 1) Isolation level 2) Read operation
		 */

		switch (bindingStatement.getIsolationLevel()) {
		case NONE:
			methodExec.getParameters().add(NONE);
			break;
		case NO_COMMIT:
			methodExec.getParameters().add(ISOLATION_LEVEL.NO_COMMIT);
			break;
		case READ_COMMITTED:
			methodExec.getParameters().add(ISOLATION_LEVEL.READ_COMMITTED);
			break;
		case READ_UNCOMMITTED:
			methodExec.getParameters().add(ISOLATION_LEVEL.READ_UNCOMMITTED);
			break;
		case REPEATABLE_READ:
			methodExec.getParameters().add(ISOLATION_LEVEL.REPEATABLE_READ);
			break;
		case SERIALIZABLE:
			methodExec.getParameters().add(ISOLATION_LEVEL.SERIALIZABLE);
			break;
		}

		if (bindingStatement.getRwOperation() != null) {

			switch (bindingStatement.getRwOperation()) {
			case READ_ONLY:
				methodExec.getParameters().add(READ_OPERATION.READ_ONLY);
				break;
			case READ_WRITE:
				methodExec.getParameters().add(READ_OPERATION.READ_WRITE);
				break;
			default:
				methodExec.getParameters().add(NONE);
				break;
			}

		} else {
			methodExec.getParameters().add(NONE);
		}

		return methodExec;
	}

	private QStatement manageSelectIntoStatement(String dblString) throws SQLException {

		// Extract into values
		SQLQueryParseResult parseQueryResult = queryParser.parseQuery(dblString);

		String[] into = null;

		if (parseQueryResult != null) {

			SQLStatement sqlStatement = parseQueryResult.getSQLStatement();
			if (sqlStatement instanceof QuerySelectStatement) {
				QuerySelectStatement selectStatement = (QuerySelectStatement) sqlStatement;

				QueryExpressionBody query = selectStatement.getQueryExpr().getQuery();
				if (query instanceof QExtendedQuerySelect) {
					QExtendedQuerySelect extendedQuery = (QExtendedQuerySelect) query;

					if (extendedQuery.getIntoClause().size() > 0) {
						into = new String[extendedQuery.getIntoClause().size()];

						for (int i = 0; i < extendedQuery.getIntoClause().size(); i++) {

							ValueExpressionVariable elem = (ValueExpressionVariable) extendedQuery.getIntoClause().get(i);
							into[i] = elem.getName();
						}
					}
				}

			}

		}

		// Create method call
		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		methodExec.setObject("*SQL");
		methodExec.setMethod(SELECT_METHOD);

		methodExec.getParameters().add(dblString);
		
		String intoValue = new String();
		for (String value : into)
			intoValue += value + " ";
		methodExec.getParameters().add(intoValue);

		return methodExec;
	}

	private QStatementTerm getStatementTerm(String name) {

		if (this.callableUnit.getFileSection() == null)
			return null;

		for (QStatementTerm statementTerm : this.callableUnit.getFileSection().getStatements()) {
			if (statementTerm.getName().equalsIgnoreCase(name))
				return statementTerm;
		}

		return null;
	}

	private boolean isSelectIntoStatement(String statement) {

		boolean result = false;

		if (statement.matches("^[\\s]*[sS][eE][lL][eE][cC][tT].*[iI][nN][tT][oO][\\s]*.*")) {
			result = true;
		}

		return result;
	}
}
