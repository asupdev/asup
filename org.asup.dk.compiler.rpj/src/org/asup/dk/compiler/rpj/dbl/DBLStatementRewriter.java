package org.asup.dk.compiler.rpj.dbl;

import java.sql.SQLException;
import java.util.ListIterator;

import org.asup.db.syntax.QBindingParseResult;
import org.asup.db.syntax.QBindingParser;
import org.asup.db.syntax.QBindingStatement;
import org.asup.db.syntax.QQueryParser;
import org.asup.db.syntax.dbl.QCloseStatement;
import org.asup.db.syntax.dbl.QDeclareCursorStatement;
import org.asup.db.syntax.dbl.QDescribeStatement;
import org.asup.db.syntax.dbl.QExecuteStatement;
import org.asup.db.syntax.dbl.QFetchStatement;
import org.asup.db.syntax.dbl.QIntoClause;
import org.asup.db.syntax.dbl.QMultipleRowFetchClause;
import org.asup.db.syntax.dbl.QOpenStatement;
import org.asup.db.syntax.dbl.QPrepareStatement;
import org.asup.db.syntax.dbl.QSetTransactionStatement;
import org.asup.db.syntax.util.DBSyntaxHelper;
import org.asup.dk.compiler.QCompilationUnit;
import org.asup.dk.compiler.rpj.RPJStatementRewriter;
import org.asup.il.esql.CursorType;
import org.asup.il.esql.QCursorTerm;
import org.asup.il.esql.QIntegratedLanguageEmbeddedSQLFactory;
import org.asup.il.esql.QStatementTerm;
import org.asup.il.flow.QBlock;
import org.asup.il.flow.QCallableUnit;
import org.asup.il.flow.QMethodExec;
import org.asup.il.flow.QSQLExec;
import org.asup.il.flow.QStatement;
import org.asup.il.flow.impl.IntegratedLanguageFlowFactoryImpl;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;


public class DBLStatementRewriter extends RPJStatementRewriter {
		
	private QCompilationUnit compilationUnit;	
	private QCallableUnit callableUnit;	
	private QBindingParser bindingParser;
	private QQueryParser queryParser;
	
	
	/*************** Public static methods definitions */
	public static String FETCH_METHOD = "SINGLE_FETCH_METHOD";
	public static String SET_TRANSACTION_METHOD = "SET_TRANSACTION_METHOD";
	public static String PREPARE_METHOD = "PREPARE_METHOD";
	public static String DESCRIBE_METHOD = "DESCRIBE_METHOD";
	
	/*************** Public static parameters definitions */
	
	public static String NONE = "NONE";
	
	public static interface FETCH_POSITION {	    
	    String NEXT = "NEXT";
	    String PRIOR = "PRIOR";
	    String FIRST = "FIRST";
	    String LAST = "LAST";
	    String BEFORE = "BEFORE";
	    String AFTER = "AFTER";
	    String CURRENT = "CURRENT";
	    String RELATIVE = "RELATIVE";
	}
	
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
	
	
	
	

	public DBLStatementRewriter(QCompilationUnit compilationUnit, QCallableUnit callableUnit,
			QBindingParser bindingParser, QQueryParser queryParser, QBlock origin) {
		super(origin);
		
		this.compilationUnit = compilationUnit;
		this.callableUnit = callableUnit;
		this.bindingParser = bindingParser;
		this.queryParser = queryParser;
	}

	@Override
	protected RPJStatementRewriter copy(QBlock block) {

		return new DBLStatementRewriter(compilationUnit, callableUnit, bindingParser, queryParser, block);
	}
	

	@Override
	public boolean visit(QSQLExec statement) {
		
		QStatement rewritedStatement = null;
		
		String dblString = statement.getStatement();
		
		if (DBSyntaxHelper.isDBLStatement(dblString)) {
			
			if (isSelectIntoStatement(dblString)) {
				
				try {
					rewritedStatement = manageSelectIntoStatement(dblString);
				} catch (SQLException e) {
					// TODO TODO Manage parse error
					e.printStackTrace();
				}
				
			} else {
				
				try {
				
					rewritedStatement = manageDBLStametemnt(dblString);
				
				} catch (SQLException e) {
					// TODO Manage parse error
					e.printStackTrace();
				}
				
			}
		}
		
		if (rewritedStatement != null) {
			getTarget().getStatements().add(rewritedStatement);
		} else {
			//TODO: togliere questo else quando il rewriter sarà completo. Se statement null non si aggiunge niente
			getTarget().getStatements().add(cloneStatement(statement));
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
			}  else if (bindingStatement instanceof QCloseStatement) {
				result = manageCloseStatement((QCloseStatement) bindingStatement);
			} 

		} else {
			//TODO: manage parser error
		}				
		
		return result;
	}
	
	

	// DBL statement mamge methods
	
	
	private QStatement manageExecuteStatement(QExecuteStatement bindingStatement) {
		System.out.println("Manage EXECUTE");
		
		return null;		
	}

	private QStatement manageOpenStatement(QOpenStatement bindingStatement) {
		System.out.println("Manage OPEN");

		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		
		String cursorName = bindingStatement.getCursor();
		
		if (lookupCursor(cursorName) != null) {
		
			methodExec.setMethod("open");
			methodExec.setObject(cursorName);
		}	
		
		return methodExec;
	}

	private QStatement managePrepareStatement(QPrepareStatement bindingStatement) {
		System.out.println("Manage PREPARE");
				
		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		
		methodExec.setMethod(PREPARE_METHOD);
		
		//TODO: statementName is correct as method object?
		String statementName = bindingStatement.getStatementName();
		if (lookupStatement(statementName) != null){
			methodExec.setObject(statementName); 
		} else {
			methodExec.setObject(null);
		}
		
		/*
		 * PREPARE_METHOD parameter list:
		 * 1) Statement name
		 * 2) Into
		 * 3) Using 
		 * 4) From 
		 *  
		 */
		
		// Par 1
		methodExec.getParameters().add(bindingStatement.getStatementName());
		
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
			} else {
				methodExec.getParameters().add(NONE);
			}
			
		} else {
			methodExec.getParameters().add(NONE);
			methodExec.getParameters().add(NONE);
		}
		
		// Par 4
		methodExec.getParameters().add(bindingStatement.getFrom());
		
		return methodExec;
	}

	private QStatement manageDeclareCursorStatement(QDeclareCursorStatement bindingStatement) {
		System.out.println("Manage DECLARE CURSOR");
		
		QCursorTerm cursorTerm = QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE.createCursorTerm();
		
		// Name
		cursorTerm.setName(bindingStatement.getCursorName());
		
		// Cursor type
		switch(bindingStatement.getCursorType()) {
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
		
		// Hold
		cursorTerm.setHold(bindingStatement.isHold());
		
		// SQL
		cursorTerm.setSql(bindingStatement.getForQuery());
				
		// Register cursor
		callableUnit.getFileSection().getCursors().add(cursorTerm);
		
		return null;
	}

	private QStatement manageDescribeStatement(QDescribeStatement bindingStatement) {
		System.out.println("Manage DESCRIBE");
		
QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		
		methodExec.setMethod(DESCRIBE_METHOD);
		methodExec.setObject(null); //TODO: null?
		
		/*
		 * PREPARE_METHOD parameter list:
		 * 1) Statement name
		 * 2) Into variable
		 * 3) Using  
		 *  
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

	private QStatement manageFetchStatement(QFetchStatement bindingStatement) {
		System.out.println("Manage FETCH");
		
		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		
		methodExec.setMethod(FETCH_METHOD);
		
		/*
		 * FETCH_METHOD parameter list:
		 * 1) CursorName
		 * 2) FetchPosition
		 * 3) RelativePosition 
		 * 4) Into variable
		 * 5) For rows 
		 * 6) Descriptor
		 *  
		 */
		
		String cursorName = bindingStatement.getCursorName();
		
		if (lookupCursor(cursorName) != null) {	
			methodExec.setObject(cursorName);
		}

		String relativePosition = DBLStatementRewriter.NONE;
		
		if (bindingStatement.getPosition() != null) {
			
			switch (bindingStatement.getPosition()) {
			case AFTER:
				methodExec.getParameters().add(FETCH_POSITION.AFTER);
				break;
			case BEFORE:
				methodExec.getParameters().add(FETCH_POSITION.BEFORE);
				break;
			case CURRENT:
				methodExec.getParameters().add(FETCH_POSITION.CURRENT);
				break;
			case FIRST:
				methodExec.getParameters().add(FETCH_POSITION.FIRST);
				break;
			case LAST:
				methodExec.getParameters().add(FETCH_POSITION.LAST);
				break;
			case NEXT:
				methodExec.getParameters().add(FETCH_POSITION.NEXT);
				break;
			case PRIOR:
				methodExec.getParameters().add(FETCH_POSITION.PRIOR);
				break;
			case RELATIVE:
				methodExec.getParameters().add(FETCH_POSITION.RELATIVE);
				if (bindingStatement.getRelativePosition() != null) {
					relativePosition = bindingStatement.getRelativePosition();
				}
				break;
			default:
				methodExec.getParameters().add(NONE);
				break;
			
			}
			
			methodExec.getParameters().add(relativePosition);
			
		}
		
		
		if (bindingStatement.getInto() != null) {
			
			// Single fetch or Multiple Row Fetch?
			if (bindingStatement.getMultipleRowClause() != null) {
				// Multiple row fetch
				
				
				
				// Into
				methodExec.getParameters().add(bindingStatement.getInto());
				
				QMultipleRowFetchClause multipleRowClause = bindingStatement.getMultipleRowClause();
				
				// Rows number
				methodExec.getParameters().add(multipleRowClause.getRowsNumber());
				
				// Descriptor
				if (multipleRowClause.getDescriptor() != null) {
					methodExec.getParameters().add(multipleRowClause.getDescriptor());
				} else {
					methodExec.getParameters().add(NONE);
				}
			} else {
				// Single row fetch
				
				// Into
				methodExec.getParameters().add(bindingStatement.getInto());
				
				// Rows number & descriptor
				methodExec.getParameters().add(NONE);
				methodExec.getParameters().add(NONE);
			}
			
		} else {
			// Into not defined			
			methodExec.getParameters().add(NONE);
			methodExec.getParameters().add(NONE);
			methodExec.getParameters().add(NONE);
			
		}
		
		return methodExec;
	}

	private QStatement manageCloseStatement(QCloseStatement bindingStatement) {
		System.out.println("Manage CLOSE");
		
		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		
		String cursorName = bindingStatement.getCursor();
		
		if (lookupCursor(cursorName) != null) {
		
			methodExec.setMethod("close");
			methodExec.setObject(cursorName);
		}	
		
		return methodExec;
	}

	private QStatement manageSetTransactionStatement(QSetTransactionStatement bindingStatement) {
		System.out.println("Manage SET TRANSACTION");
		
		QMethodExec methodExec = IntegratedLanguageFlowFactoryImpl.eINSTANCE.createMethodExec();
		
		methodExec.setMethod(SET_TRANSACTION_METHOD);
		methodExec.setObject(null);
		
		/*
		 * SET_TRANSACTION parameter list:
		 * 1) Isolation level
		 * 2) Read operation 
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
		default:
			methodExec.getParameters().add(NONE);
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
		
		System.out.println("Manage SELECT INTO");
		
		SQLQueryParseResult parseQueryResult = queryParser.parseQuery(dblString);
		
		if (parseQueryResult != null) {
			
		} else {
			//TODO: manage parser error
		}
		
		return null;
	}


	// Utility methods
	
	private QCursorTerm lookupCursor(String cursorName) {		
		
		QCursorTerm result = null;
		ListIterator<QCursorTerm> listIterator = callableUnit.getFileSection().getCursors().listIterator();
		QCursorTerm cursorTerm = null;
		while (listIterator.hasNext()) {
			cursorTerm = listIterator.next();
			if (cursorTerm.getName().equalsIgnoreCase(cursorName)) {
				result = cursorTerm;
				break;
			}
		}	
		return result;
	}
	
	private QStatementTerm lookupStatement(String StatementName) {		
		
		QStatementTerm result = null;
		ListIterator<QStatementTerm> listIterator = callableUnit.getFileSection().getStatements().listIterator();
		QStatementTerm statementTerm = null;
		while (listIterator.hasNext()) {
			statementTerm = listIterator.next();
			if (statementTerm.getName().equalsIgnoreCase(StatementName)) {
				result = statementTerm;
				break;
			}
		}	
		return result;
	}
	
	
	
	private boolean isSelectIntoStatement(String statement) {
		
		boolean result = false;

		if (statement.matches("^[\\s]*[sS][eE][lL][eE][cC][tT].*[iI][nN][tT][oO][\\s]*.*")) {
			result = true;
		}

		return result;
	}
}
