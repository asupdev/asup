package org.asup.db.syntax.ibmi.parser.ddl;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.asup.db.syntax.QDatabaseSyntaxFactory;
import org.asup.db.syntax.QDefinitionParseResult;
import org.asup.db.syntax.QDefinitionStatement;

public class DDLModelBuilder {
	
	
	/**
	 * Parse definition string and convert result in db-syntax model
	 * @param definitionString
	 * @return
	 */
	public QDefinitionParseResult parseDefinition(String definitionString)
	{
		QDefinitionParseResult parserResult = (QDefinitionParseResult) QDatabaseSyntaxFactory.eINSTANCE.createDefinitionParseResult();
		
		DDLLexer lex = new DDLLexer(new ANTLRStringStream(definitionString));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		DDLParser parser = new DDLParser(tokens);
		
		CommonTree tree = null;
		try {
			tree = parser.sql().getTree();
			
			parserResult.setDefinitionStatement(convertModel(tree));
			
		} catch (RecognitionException e) {
			//TODO: gestione errori del parser
		}

		return parserResult;
	}

	private QDefinitionStatement convertModel(CommonTree tree) {
		
		QDefinitionStatement result = null;
		
		switch (tree.getType()) {
		
		case DDLLexer.COMMIT_STATEMENT:
			result = manageCommitStatement(tree);
			break;
		
		case DDLLexer.CONNECT_STATEMENT:
			result = manageConnectStatement(tree);
			break;	
		
		case DDLLexer.CREATE_ALIAS_STATEMENT:
			result = manageCreateAliasStatement(tree);
			break;	
		
		case DDLLexer.CREATE_INDEX_STATEMENT:
			result = manageCreateIndexStatement(tree);
			break;		

		case DDLLexer.CREATE_TABLE_STATEMENT:
			result = manageCreateTableStatement(tree);
			break;		
		
		case DDLLexer.CREATE_VIEW_STATEMENT:
			result = manageCreateViewStatement(tree);
			break;		
		
		case DDLLexer.DROP_ALIAS_STATEMENT:
			result = manageDropAliasStatement(tree);
			break;		
		
		case DDLLexer.DROP_INDEX_STATEMENT:
			result = manageDropIndexStatement(tree);
			break;			
			
		case DDLLexer.DROP_TABLE_STATEMENT:
			result = manageDropTableStatement(tree);
			break;			
			
		case DDLLexer.DROP_VIEW_STATEMENT:
			result = manageDropViewStatement(tree);
			break;			
			
		case DDLLexer.DISCONNECT_STATEMENT:
			result = manageDisconnectStatement(tree);
			break;			
		
		case DDLLexer.LOCK_TABLE_STATEMENT:
			result = manageLockTableStatement(tree);
			break;	
		
		case DDLLexer.PROCEDURE_CALL_STATEMENT:
			result = manageProcedureCallStatement(tree);
			break;			
			
		case DDLLexer.RENAME_INDEX_STATEMENT:
			result = manageRenameIndexStatement(tree);
			break;			
		
		case DDLLexer.RENAME_TABLE_STATEMENT:
			result = manageRenameTableStatement(tree);
			break;				
		
		case DDLLexer.SET_CONNECTION_STATEMENT:
			result = manageSetConnectionStatement(tree);
			break;				
		
		case DDLLexer.SET_TRANSACTION_STATEMENT:
			result = manageSetTransactionStatement(tree);
			break;				
		default:
			break;
		}

		return result;
	}

	private QDefinitionStatement manageSetTransactionStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageSetConnectionStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageRenameTableStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageRenameIndexStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageProcedureCallStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageLockTableStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageDisconnectStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageDropViewStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageDropTableStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageDropIndexStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageDropAliasStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageCreateViewStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageCreateTableStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageCreateIndexStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageCreateAliasStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageConnectStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageCommitStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

}
