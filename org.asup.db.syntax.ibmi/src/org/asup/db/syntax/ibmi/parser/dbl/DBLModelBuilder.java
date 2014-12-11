package org.asup.db.syntax.ibmi.parser.dbl;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.asup.db.syntax.QBindingParseResult;
import org.asup.db.syntax.QBindingStatement;
import org.asup.db.syntax.QDatabaseSyntaxFactory;


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
			
			parserResult.setBindingStatement(convertModel(tree, queryStrings));
			
		} catch (RecognitionException e) {
			
		}

		return parserResult;
	}

	
	private QBindingStatement convertModel(CommonTree tree, String[] queryString) {
		
		QBindingStatement result = null;
		
		switch (tree.getType()) {
		
		case DBLLexer.SET_TRANSACTION_STATEMENT:
			result = manageSetTransaction(tree);
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

	private QBindingStatement manageCloseStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageFetchStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageDescribeStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageDeclareCursorStatement(CommonTree tree, String[] queryString) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement managePrepareStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageOpenStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageExecuteStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}


	private QBindingStatement manageSetTransaction(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
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
