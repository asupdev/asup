package org.asup.db.syntax.ibmi.parser.dbl;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.asup.db.syntax.QBindingParseResult;
import org.asup.db.syntax.QBindingStatement;
import org.asup.db.syntax.QDatabaseSyntaxFactory;
import org.asup.db.syntax.QDefinitionStatement;
import org.asup.db.syntax.dbl.IsolationLevel;
import org.asup.db.syntax.dbl.QSetTransactionStatement;
import org.asup.db.syntax.dbl.RWOperation;
import org.asup.db.syntax.dbl.impl.DblFactoryImpl;



public class DBLModelBuilder {
	
	/**
	 * Parse definition string and convert result in db-syntax model
	 * @param builtinString
	 * @return
	 */
	public QBindingParseResult parseBinding(String builtinString)
	{
		QBindingParseResult parserResult = (QBindingParseResult) QDatabaseSyntaxFactory.eINSTANCE.createBindingParseResult();
		
		String[] queryStrings = null;
		
		if (isDeclareStatementWithSelect(builtinString)) {
			
		}
		
		DBLLexer lex = new DBLLexer(new ANTLRStringStream(builtinString));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		DBLParser parser = new DBLParser(tokens);
		
		CommonTree tree = null;
		try {
			tree = parser.sql().getTree();
			
			parserResult.setBindingStatement(convertModel(tree.getChild(0), queryStrings));
			
		} catch (RecognitionException e) {
			
		}

		return parserResult;
	}

	
	private QBindingStatement convertModel(Tree tree, String[] queryString) {
		
		QBindingStatement result = null;
		
		switch (tree.getType()) {
		
		case DBLLexer.SET_TRANSACTION_STATEMENT:
			result = manageSetTransactionStatement(tree);
			break;
		
		case DBLLexer.EXECUTE_STATEMENT:
			result = manageExecuteStatement(tree);
			break;	

		case DBLLexer.PREPARE_STATEMENT:
			result = managePrepareStatement(tree);
			break;		

		case DBLLexer.DECLARE_CURSOR_STATEMENT:
			result = manageDeclareCursorStatement(tree, queryString);
			break;		
		
		case DBLLexer.DESCRIBE_STATEMENT:
			result = manageDescribeStatement(tree);
			break;		
		
		case DBLLexer.FETCH_STATEMENT:
			result = manageFetchStatement(tree);
			break;		
			
		case DBLLexer.OPEN_STATEMENT:
			result = manageOpenStatement(tree);
			break;			
			
		case DBLLexer.CLOSE_STATEMENT:
			result = manageCloseStatement(tree);
			break;			
			
				default:
			break;
		}

		return result;
	}

	private QBindingStatement manageCloseStatement(Tree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageFetchStatement(Tree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageDescribeStatement(Tree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageDeclareCursorStatement(Tree tree, String[] queryString) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement managePrepareStatement(Tree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageOpenStatement(Tree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageExecuteStatement(Tree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageSetTransactionStatement(Tree tree) {
		QSetTransactionStatement setTransactionStatement = DblFactoryImpl.eINSTANCE.createSetTransactionStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			
			case DBLLexer.ISOLATION_LEVEL:
				
				if (fieldToken.getChildCount() > 0){
					fieldToken = fieldToken.getChild(0);
					
					switch (fieldToken.getType()) {
					case DBLLexer.SERIALIZABLE:
						setTransactionStatement.setIsolationLevel(IsolationLevel.SERIALIZABLE);
						break;
						
					case DBLLexer.NO_COMMIT:
						setTransactionStatement.setIsolationLevel(IsolationLevel.NO_COMMIT);
						break;	
						
					case DBLLexer.READ_UNCOMMITTED:
						setTransactionStatement.setIsolationLevel(IsolationLevel.READ_UNCOMMITTED);
						break;			
					
					case DBLLexer.READ_COMMITTED:
						setTransactionStatement.setIsolationLevel(IsolationLevel.READ_COMMITTED);
						break;				
					
					case DBLLexer.REPEATABLE_READ:
						setTransactionStatement.setIsolationLevel(IsolationLevel.REPEATABLE_READ);
						break;				
					}
					
				}			
				
				break;
			
			case DBLLexer.RW_OPERATION:
				
				if (fieldToken.getChildCount() > 0){
					fieldToken = fieldToken.getChild(0);
					
					switch (fieldToken.getType()) {
					
					case DBLLexer.READ_ONLY:
						setTransactionStatement.setRwOperation(RWOperation.READ_ONLY);
						break;
						
					case DBLLexer.READ_WRITE:
						setTransactionStatement.setRwOperation(RWOperation.READ_WRITE);
						break;
					}
				
				break;
				}
			}
		}
		
		return setTransactionStatement; 

	}

	
	
	// Utility methods
		
	/*
	 * Identity DECLARE CURSOR statements with nested SQL query
	 * For example: 
	 * 
	 * DECLARE c1 CURSOR FOR (SELECT A, B, C FROM FILE)
	 * 
	 */
	private boolean isDeclareStatementWithSelect(String statement) {
		return statement.matches("^[\\s]*[dD][eE][cC][lL][aA][rR][eE][\\s]*[fF][oO][rR][\\s]*[(].*");
	}
}
