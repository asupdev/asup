package org.asup.db.syntax.ibmi.parser.dbl;

import java.sql.SQLException;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.asup.db.syntax.QBindingParseResult;
import org.asup.db.syntax.QBindingStatement;
import org.asup.db.syntax.QDatabaseSyntaxFactory;
import org.asup.db.syntax.dbl.CursorType;
import org.asup.db.syntax.dbl.FetchPosition;
import org.asup.db.syntax.dbl.IsolationLevel;
import org.asup.db.syntax.dbl.OpenType;
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
import org.asup.db.syntax.dbl.RWOperation;
import org.asup.db.syntax.dbl.UsingType;
import org.asup.db.syntax.dbl.impl.DblFactoryImpl;



public class DBLModelBuilder {
	
	/**
	 * Parse definition string and convert result in db-syntax model
	 * @param builtinString
	 * @return
	 * @throws SQLException 
	 */
	public QBindingParseResult parseBinding(String builtinString) throws SQLException
	{
		QBindingParseResult parserResult = (QBindingParseResult) QDatabaseSyntaxFactory.eINSTANCE.createBindingParseResult();
		
		String[] queryStrings = null;
		
		if (isDeclareStatementWithSelect(builtinString)) {
			
			String[] parts = splitDeclareViewStatement(builtinString);
			
			builtinString = parts[0];
			queryStrings = new String[]{parts[1]};
		}  else if (isExecuteImmediateStatementWithSelect(builtinString)) {
			
			String[] parts = splitExecuteImmediateStatement(builtinString);
			
			builtinString = parts[0];
			queryStrings = new String[]{parts[1]};
		}  
		
		DBLLexer lex = new DBLLexer(new ANTLRStringStream(builtinString));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		DBLParser parser = new DBLParser(tokens);
		
		CommonTree tree = null;
		try {
			tree = parser.sql().getTree();
			
			parserResult.setBindingStatement(convertModel(tree.getChild(0), queryStrings));
			
		} catch (RecognitionException e) {
			throw new SQLException(e);
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
		
		case DBLLexer.EXECUTE_IMMEDIATE_STATEMENT:
			result = manageExecuteImmediateStatement(tree, queryString);
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
		QCloseStatement closeStatement =  DblFactoryImpl.eINSTANCE.createCloseStatement();
		
		Tree cursorToken = tree.getChild(0);
		
		if (cursorToken != null && cursorToken.getType()==DBLLexer.STATEMENT) { 				
			closeStatement.setCursor(cursorToken.getChild(0).getText());
		}
		
		return closeStatement;
	}


	private QBindingStatement manageFetchStatement(Tree tree) {
		QFetchStatement fetchStatement =  DblFactoryImpl.eINSTANCE.createFetchStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			
			case DBLLexer.CURSOR:
				
				fetchStatement.setCursorName(fieldToken.getChild(0).getText());
				
				break;
			
			case DBLLexer.FETCH_POSITION:
				
				switch (fieldToken.getChild(0).getType()) {
				
				case DBLLexer.NEXT:
					
					fetchStatement.setPosition(FetchPosition.NEXT);
					
					break;
					
				case DBLLexer.PRIOR:
					
					fetchStatement.setPosition(FetchPosition.PRIOR);
					
					break;	
				
				case DBLLexer.FIRST:
					
					fetchStatement.setPosition(FetchPosition.FIRST);
					
					break;	
					
				case DBLLexer.LAST:
					
					fetchStatement.setPosition(FetchPosition.LAST);
					
					break;	
					
				case DBLLexer.BEFORE:
					
					fetchStatement.setPosition(FetchPosition.BEFORE);
					
					break;	
				
				case DBLLexer.AFTER:
					
					fetchStatement.setPosition(FetchPosition.AFTER);
					
					break;	
					
				case DBLLexer.CURRENT:
					
					fetchStatement.setPosition(FetchPosition.CURRENT);
					
					break;	
				
				case DBLLexer.RELATIVE:
					
					fetchStatement.setPosition(FetchPosition.RELATIVE);
					
					Tree relativeNumberToken = fieldToken.getChild(0).getChild(0);
					
					if (relativeNumberToken != null 
							&& 
						(relativeNumberToken.getType() == DBLLexer.NUMBER || relativeNumberToken.getType() == DBLLexer.VARIABLE)) {
						
						fetchStatement.setRelativePosition(relativeNumberToken.getText());
					}
					
					break;	
				}
				
				
				break;	
				
			case DBLLexer.SINGLE_FETCH:
				
				Tree intoToken = fieldToken.getChild(0);
				
				if (intoToken != null && intoToken.getType() == DBLLexer.INTO) {
					
					Tree variableToken = intoToken.getChild(0);
					
					if (variableToken != null && variableToken.getType() == DBLLexer.VARIABLE) {
						fetchStatement.setInto(variableToken.getChild(0).getText());
					}					
				}
				
				break;
				
			case DBLLexer.MULTIPLE_ROW_FETCH:
				
				QMultipleRowFetchClause multipleRowClause = DblFactoryImpl.eINSTANCE.createMultipleRowFetchClause();
				multipleRowClause.setUsingDescriptor(false);
					
				Tree multipleRowChildToken = fieldToken.getChild(0); 
				switch (multipleRowChildToken.getType()) {
				
				case DBLLexer.FOR:
					
					Tree forNumberToken = fieldToken.getChild(0);
					
					if (forNumberToken != null 
							&& 
						(forNumberToken.getType() == DBLLexer.NUMBER || forNumberToken.getType() == DBLLexer.VARIABLE)) {
						
						multipleRowClause.setRowsNumber(forNumberToken.getText());
					}
					
					
					break;
					
				case DBLLexer.DESCRIPTOR:
					
					multipleRowClause.setUsingDescriptor(true);
					
					Tree varToken = multipleRowChildToken.getChild(0);
					
					if (varToken != null && varToken.getType() == DBLLexer.VARIABLE) {
						multipleRowClause.setDescriptor(varToken.getChild(0).getText());
					}
					
					break;
					
				case DBLLexer.INTO:
					
					Tree variableToken = multipleRowChildToken.getChild(0);
					
					if (variableToken != null && variableToken.getType() == DBLLexer.VARIABLE) {
						fetchStatement.setInto(variableToken.getChild(0).getText());
					}						
					
					break;	
					
				}
				
				fetchStatement.setMultipleRowClause(multipleRowClause);
				
				break;
				
			}
		}
		
		return fetchStatement;
	}


	private QBindingStatement manageDescribeStatement(Tree tree) {
		
		QDescribeStatement describeStatement = DblFactoryImpl.eINSTANCE.createDescribeStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			
			case DBLLexer.STATEMENT:
				
				describeStatement.setStatementName(fieldToken.getChild(0).getText());
				
				break;
			
			case DBLLexer.INTO:
				
				QIntoClause intoClause = DblFactoryImpl.eINSTANCE.createIntoClause();
				
				Tree intoToken = null;
				
				for (int i2 = 0; i2 < fieldToken.getChildCount(); i2++) {
					
					intoToken = fieldToken.getChild(i);
				
					switch (intoToken.getType()) {
					
					case DBLLexer.VARIABLE:
												
						intoClause.setDescriptorName(intoToken.getChild(0).getText());
						
						break;
					
					case DBLLexer.USING:
						
						switch (intoToken.getChild(0).getType()) {
						
						case DBLLexer.NAMES:
							
							intoClause.setUsing(UsingType.NAMES);;
							break;
						
						case DBLLexer.LABELS:
							
							intoClause.setUsing(UsingType.LABELS);;
							break;	
						
						case DBLLexer.ANY:
							
							intoClause.setUsing(UsingType.ANY);;
							break;	
							
						case DBLLexer.BOTH:
							
							intoClause.setUsing(UsingType.BOTH);;
							break;	
						
						case DBLLexer.ALL:
							
							intoClause.setUsing(UsingType.ALL);;
							break;	
						
						case DBLLexer.SYSTEM_NAMES:
							
							intoClause.setUsing(UsingType.SYSTEM_NAMES);;
							break;
						}
						
						break;
					
					}
				}
				
				describeStatement.setInto(intoClause);
				
				break;	
			}
			
		}

		return null;
	}


	private QBindingStatement manageDeclareCursorStatement(Tree tree, String[] queryString) {
		QDeclareCursorStatement declareCursorStatement =  DblFactoryImpl.eINSTANCE.createDeclareCursorStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			
			case DBLLexer.CURSOR:
				
				declareCursorStatement.setCursorName(fieldToken.getChild(0).getText());
				
				break;
			
			case DBLLexer.SCROLL:
				
				declareCursorStatement.setCursorType(CursorType.SCROLL);
				
				break;
			
			case DBLLexer.NO_SCROLL:
				
				declareCursorStatement.setCursorType(CursorType.NOTSCROLL);
				
				break;
			
			case DBLLexer.DYNAMIC:
				
				declareCursorStatement.setCursorType(CursorType.DYNSCROLL);
				
				break;	

			case DBLLexer.WITH_HOLD:
				
				declareCursorStatement.setHold(true);
				
				break;
			
			case DBLLexer.WITHOUT_HOLD:
				
				declareCursorStatement.setHold(false);
				
				break;
				
			case DBLLexer.FOR:
				
				Tree statementToken = fieldToken.getChild(0);
				
				if (statementToken != null && statementToken.getType()==DBLLexer.STATEMENT) { 				
					declareCursorStatement.setForStatementName(statementToken.getChild(0).getText());
				}
				
				break;
				
			}
		}
		
		// Manage query in field FOR
		if (queryString.length > 0) {
			declareCursorStatement.setForStatementName("");
			declareCursorStatement.setForQuery(queryString[0]);
		}
		
		return declareCursorStatement;
	}


	private QBindingStatement managePrepareStatement(Tree tree) {
		QPrepareStatement prepareStatement = DblFactoryImpl.eINSTANCE.createPrepareStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			
			case DBLLexer.STATEMENT:
				
				prepareStatement.setStatementName(fieldToken.getChild(0).getText());
				
				break;
			
			case DBLLexer.INTO:
				
				QIntoClause intoClause = DblFactoryImpl.eINSTANCE.createIntoClause();
				
				Tree intoToken = null;
				
				for (int i2 = 0; i2 < fieldToken.getChildCount(); i2++) {
					
					intoToken = fieldToken.getChild(i);
				
					switch (intoToken.getType()) {
					
					case DBLLexer.VARIABLE:
												
						intoClause.setDescriptorName(intoToken.getChild(0).getText());
						
						break;
					
					case DBLLexer.USING:
						
						switch (intoToken.getChild(0).getType()) {
						
						case DBLLexer.NAMES:
							
							intoClause.setUsing(UsingType.NAMES);;
							break;
						
						case DBLLexer.LABELS:
							
							intoClause.setUsing(UsingType.LABELS);;
							break;	
						
						case DBLLexer.ANY:
							
							intoClause.setUsing(UsingType.ANY);;
							break;	
							
						case DBLLexer.BOTH:
							
							intoClause.setUsing(UsingType.BOTH);;
							break;	
						
						case DBLLexer.ALL:
							
							intoClause.setUsing(UsingType.ALL);;
							break;	
						
						case DBLLexer.SYSTEM_NAMES:
							
							intoClause.setUsing(UsingType.SYSTEM_NAMES);;
							break;
						}
						
						break;
					
					}
				}
				
				prepareStatement.setInto(intoClause);
				
				break;	
				
			case DBLLexer.FROM:
				
				Tree variableToken = fieldToken.getChild(0);
				
				if (variableToken != null && variableToken.getType()==DBLLexer.VARIABLE) { 				
					prepareStatement.setFrom(variableToken.getChild(0).getText());
				}
				
				break;	
				
			}
			
		}
		
		return prepareStatement;
	}


	private QBindingStatement manageOpenStatement(Tree tree) {
		QOpenStatement openStatement = DblFactoryImpl.eINSTANCE.createOpenStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			
			case DBLLexer.CURSOR:
				
				openStatement.setCursor(fieldToken.getChild(0).getText());
				
				break;
			
			case DBLLexer.USING:
				openStatement.setUsingType(OpenType.VARIABLE);
				
				Tree variableToken = fieldToken.getChild(0);
				
				if (variableToken != null && variableToken.getType()==DBLLexer.VARIABLE) {
					openStatement.setUsing(variableToken.getChild(0).getText());
				}
				
				break;
			
			case DBLLexer.USING_DESCRIPTOR:
				openStatement.setUsingType(OpenType.DESCRIPTOR);
				
				Tree childToken = fieldToken.getChild(0);
				
				if ((childToken != null && (childToken.getType()==DBLLexer.VARIABLE || childToken.getType()==DBLLexer.DESCRIPTOR))) {
					openStatement.setUsing(childToken.getChild(0).getText());
				}
				
				break;	
			}
		}

		return openStatement;
		
	}

	private QBindingStatement manageExecuteImmediateStatement(Tree tree, String[] queryString) {
		QExecuteImmediateStatement executeImmediateStatement = DblFactoryImpl.eINSTANCE.createExecuteImmediateStatement();
		
		Tree statementToken = tree.getChild(0);
		
		if (statementToken != null && statementToken.getType() == DBLLexer.VARIABLE) {
			executeImmediateStatement.setVariable(statementToken.getChild(0).getText());
		}
		
		// Manage query in field FOR
		if (queryString.length > 0) {
			executeImmediateStatement.setVariable("");
			executeImmediateStatement.setQuery(queryString[0]);
		}

		return executeImmediateStatement;

	}

	private QBindingStatement manageExecuteStatement(Tree tree) {

		QExecuteStatement executeStatement = DblFactoryImpl.eINSTANCE.createExecuteStatement();
		
		Tree statementToken = tree.getChild(0);
		
		if (statementToken != null && statementToken.getType() == DBLLexer.STATEMENT) {
			executeStatement.setStatement(statementToken.getChild(0).getText());
		}

		return executeStatement;
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
		return statement.matches("^[\\s]*[dD][eE][cC][lL][aA][rR][eE].*[fF][oO][rR][\\s]*[(].*");
	}
	
	
	/**
	 * Example:
	 * 
	 * Input: DECLARE c1 CURSOR FOR (SELECT A, B, C FROM FILE)
	 * 
	 * Output: [DECLARE c1 CURSOR FOR s1 , SELECT A, B, C FROM FILE]
	 * 
	 * @param viewText
	 * @return
	 */
	private String[] splitDeclareViewStatement(String viewText) {

		String[] response = new String[2];
		String[] tokens = viewText.split("[\\s]*[fF][oO][rR][\\s]*[(]", Pattern.CASE_INSENSITIVE);

		response[0] = tokens[0] + " FOR s1";
		response[1] = tokens[1].substring(0, tokens[1].length()-1);
			

		return response;
	}
	
	// Utility methods
	
		/*
		 * Identity EXECUTE IMMEDIATE statements with nested SQL query
		 * For example: 
		 * 
		 *  EXECUTE IMMEDIATE (INSERT INTO WORK_TABLE SELECT * FROM EMPROJACT)
		 * 
		 */
		private boolean isExecuteImmediateStatementWithSelect(String statement) {
			return statement.matches("^[\\s]*[eE][xX][eE][cC][uU][tT][eE][\\s]*[iI][mM][mM][eE][dD][iI][aA][tT][eE][\\s]*[(].*[)]");
		}
		
		
		/**
		 * Example:
		 * 
		 * Input: EXECUTE IMMEDIATE (INSERT INTO WORK_TABLE SELECT * FROM EMPROJACT)
		 * 
		 * Output: [EXECUTE IMMEDIATE :v1 , INSERT INTO WORK_TABLE SELECT * FROM EMPROJACT]
		 * 
		 * @param viewText
		 * @return
		 */
		private String[] splitExecuteImmediateStatement(String viewText) {

			String[] response = new String[2];
			String[] tokens = viewText.split("[\\s]*[iI][mM][mM][eE][dD][iI][aA][tT][eE][\\s]*[(]", Pattern.CASE_INSENSITIVE);

			response[0] = tokens[0] + " IMMEDIATE :v1";
			response[1] = tokens[1].substring(0, tokens[1].length()-1);
				

			return response;
		}
	
	
	public static void main(String[] args) {
		DBLModelBuilder builder = new DBLModelBuilder();
		
		String test = "DECLARE c1 CURSOR FOR (SELECT A, B, C FROM FILE)";
		
		System.out.println("Test: " + test);
		if (builder.isDeclareStatementWithSelect(test)) {
			System.out.println("Stetement identified");
			String[] parts = builder.splitDeclareViewStatement(test);
			for (int i = 0; i < parts.length; i++) {
				System.out.println(parts[i]);
			}
		}
		
		test = "EXECUTE IMMEDIATE (INSERT INTO WORK_TABLE SELECT * FROM EMPROJACT)";
		System.out.println("Test: " + test);
		if (builder.isExecuteImmediateStatementWithSelect(test)) {
			System.out.println("Stetement identified");
			String[] parts = builder.splitExecuteImmediateStatement(test);
			for (int i = 0; i < parts.length; i++) {
				System.out.println(parts[i]);
			}
		}
	}

}
