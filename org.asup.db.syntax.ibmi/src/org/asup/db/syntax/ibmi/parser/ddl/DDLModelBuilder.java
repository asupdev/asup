package org.asup.db.syntax.ibmi.parser.ddl;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.asup.db.core.DatabaseDataType;
import org.asup.db.core.OrderingType;
import org.asup.db.core.QIndexColumnDef;
import org.asup.db.core.QIndexDef;
import org.asup.db.core.QQualifiedName;
import org.asup.db.core.QTableFieldDef;
import org.asup.db.core.impl.DatabaseCoreFactoryImpl;
import org.asup.db.syntax.QDatabaseSyntaxFactory;
import org.asup.db.syntax.QDefinitionParseResult;
import org.asup.db.syntax.QDefinitionStatement;
import org.asup.db.syntax.ddl.DropRange;
import org.asup.db.syntax.ddl.DropTarget;
import org.asup.db.syntax.ddl.QCommitStatement;
import org.asup.db.syntax.ddl.QConnectStatement;
import org.asup.db.syntax.ddl.QCreateAliasStatement;
import org.asup.db.syntax.ddl.QCreateIndexStatement;
import org.asup.db.syntax.ddl.QCreateTableStatement;
import org.asup.db.syntax.ddl.QDisconnectStatement;
import org.asup.db.syntax.ddl.QDropStatement;
import org.asup.db.syntax.ddl.TargetItem;
import org.asup.db.syntax.ddl.impl.DdlFactoryImpl;

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
		QDisconnectStatement disconnectStatement = DdlFactoryImpl.eINSTANCE.createDisconnectStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
			
			switch (fieldToken.getType()) {

				case DDLLexer.ALL:
					disconnectStatement.setTarget(TargetItem.ALL);
					break;	
					
				case DDLLexer.CURRENT:
					disconnectStatement.setTarget(TargetItem.CURRENT);
					break;	
			}
		}
		
		
		return disconnectStatement;
	}

	private QDefinitionStatement manageDropViewStatement(CommonTree tree) {
		QDropStatement dropViewStatement = DdlFactoryImpl.eINSTANCE.createDropStatement();
		dropViewStatement.setTarget(DropTarget.VIEW);
		dropViewStatement.setRange(DropRange.CASCADE);
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			case DDLLexer.VIEW_NAME:
				
				QQualifiedName viewQualifiedName = resolveQualified(fieldToken.getChild(0));
				dropViewStatement.setTargetName(viewQualifiedName);
				
				break;
				
			case DDLLexer.RESTRICT:
				
				dropViewStatement.setRange(DropRange.RESTRICT);
				
				break;
			
			case DDLLexer.CASCADE:
				
				dropViewStatement.setRange(DropRange.CASCADE);
				
				break;	
			
			}						
		}

		return dropViewStatement;

	}

	private QDefinitionStatement manageDropTableStatement(CommonTree tree) {
		QDropStatement dropTableStatement = DdlFactoryImpl.eINSTANCE.createDropStatement();
		dropTableStatement.setTarget(DropTarget.TABLE);
		dropTableStatement.setRange(DropRange.CASCADE);
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			case DDLLexer.TABLE_NAME:
				
				QQualifiedName tableQualifiedName = resolveQualified(fieldToken.getChild(0));
				dropTableStatement.setTargetName(tableQualifiedName);
				
				break;
				
			case DDLLexer.RESTRICT:
				
				dropTableStatement.setRange(DropRange.RESTRICT);
				
				break;
			
			case DDLLexer.CASCADE:
				
				dropTableStatement.setRange(DropRange.CASCADE);
				
				break;	
			
			}						
		}

		return dropTableStatement;
	}

	private QDefinitionStatement manageDropIndexStatement(CommonTree tree) {
		QDropStatement dropIndexStatement = DdlFactoryImpl.eINSTANCE.createDropStatement();
		dropIndexStatement.setTarget(DropTarget.INDEX);
		
		Tree indexNameToken = tree.getFirstChildWithType(DDLLexer.INDEX_NAME);
		
		if (indexNameToken != null) {
			QQualifiedName indexQualifiedName = resolveQualified(indexNameToken.getChild(0));
			dropIndexStatement.setTargetName(indexQualifiedName);
		}
		
		return dropIndexStatement;
	}

	private QDefinitionStatement manageDropAliasStatement(CommonTree tree) {
		QDropStatement dropAliasStatement = DdlFactoryImpl.eINSTANCE.createDropStatement();
		dropAliasStatement.setTarget(DropTarget.ALIAS);
		
		Tree aliasNameToken = tree.getFirstChildWithType(DDLLexer.ALIAS_NAME);
		
		if (aliasNameToken != null) {
			QQualifiedName aliasQualifiedName = resolveQualified(aliasNameToken.getChild(0));
			dropAliasStatement.setTargetName(aliasQualifiedName);
		}
		
		return dropAliasStatement;
	}

	private QDefinitionStatement manageCreateViewStatement(CommonTree tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private QDefinitionStatement manageCreateTableStatement(CommonTree tree) {
		
		QCreateTableStatement createTableStatement = DdlFactoryImpl.eINSTANCE.createCreateTableStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
			
			switch (fieldToken.getType()) {			
			
			case DDLLexer.TABLE_NAME:
		
				// Manage name
				QQualifiedName tableName = null;
				
				Tree nameField = fieldToken.getChild(0);
				if (nameField.getType() == DDLLexer.QUALIFIED) {
					tableName = resolveQualified(nameField);					
				} else {
					tableName = DatabaseCoreFactoryImpl.eINSTANCE.createQualifiedName();
					tableName.setTable(nameField.getText());
				}				
				createTableStatement.setTableName(tableName);
				
				break;
			
			case DDLLexer.TABLE_DEF:
				
				// Manage columns def
				Tree fieldDefToken = null;
				QTableFieldDef tableFieldDef = null;
				
				for (int k = 0; k < fieldToken.getChildCount(); k++) {
					
					fieldDefToken = fieldToken.getChild(k);
					tableFieldDef = DatabaseCoreFactoryImpl.eINSTANCE.createTableFieldDef();
					tableFieldDef.setNullable(true);
					tableFieldDef.setDefault(false);
					
					Tree fieldDefParm = null;
					for (int j = 0; j < fieldDefToken.getChildCount(); j++) {
						
						fieldDefParm = fieldDefToken.getChild(j);
						 switch (fieldDefParm.getType()) {
						case DDLLexer.FIELD_NAME:
							String name = fieldDefParm.getChild(0).getText();
							tableFieldDef.setFieldName(name);
							break;
						
						case DDLLexer.FOR_COLUMN:
							String columnName = fieldDefParm.getChild(0).getText();
							tableFieldDef.setName(columnName);
							break;	
						
						case DDLLexer.FIELD_TYPE:
							Tree typeToken = fieldDefParm.getChild(0);
							
							switch (typeToken.getType()) {
								
							case DDLLexer.CHAR:
								tableFieldDef.setDataType(DatabaseDataType.CHARACTER);
								break;
							case DDLLexer.VARCHAR:
								tableFieldDef.setDataType(DatabaseDataType.VARCHAR);
								break;	
							case DDLLexer.DECIMAL:
								tableFieldDef.setDataType(DatabaseDataType.DECIMAL);
								break;		
							case DDLLexer.BOOLEAN:
								tableFieldDef.setDataType(DatabaseDataType.BOOLEAN);
								break;			
							case DDLLexer.DATE:
								tableFieldDef.setDataType(DatabaseDataType.DATE);
								break;			
							case DDLLexer.TIME:
								tableFieldDef.setDataType(DatabaseDataType.TIME);
								break;			
							case DDLLexer.TIMESTAMP:
								tableFieldDef.setDataType(DatabaseDataType.TIME_STAMP);
								break;			
							case DDLLexer.INTEGER:
								tableFieldDef.setDataType(DatabaseDataType.INTEGER);
								break;			
							case DDLLexer.FLOAT:
								tableFieldDef.setDataType(DatabaseDataType.FLOAT);
								break;			
							case DDLLexer.TEXT:
								tableFieldDef.setDataType(DatabaseDataType.TEXT);
								break;			
							case DDLLexer.BLOB:
								tableFieldDef.setDataType(DatabaseDataType.BLOB);
								break;				
							}
							
							
							break;	
								
						case DDLLexer.NOT_NULL:
								tableFieldDef.setNullable(false);
							break;	
						
						case DDLLexer.WITH_DEFAULT:
							tableFieldDef.setDefault(true);
							break;	
						}
						
					}			
					createTableStatement.getFields().add(tableFieldDef);
				}
				break;	
			}
		}
		
		return createTableStatement;
	}

	private QDefinitionStatement manageCreateIndexStatement(CommonTree tree) {
		
		QCreateIndexStatement createIndexStatement = DdlFactoryImpl.eINSTANCE.createCreateIndexStatement();
		createIndexStatement.setUnique(false);
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
			
			switch (fieldToken.getType()) {
			case DDLLexer.UNIQUE:
				
				createIndexStatement.setUnique(true);
				
				break;
			
			case DDLLexer.INDEX_NAME:
				
				QQualifiedName qualifiedIndexName = resolveQualified(fieldToken.getChild(0));
				createIndexStatement.setIndexName(qualifiedIndexName);
				
				break;
				
			case DDLLexer.ON:
				
				QQualifiedName qualifiedTableName = resolveQualified(fieldToken.getChild(0));
				createIndexStatement.setOnTable(qualifiedTableName);
				
				break;	
			
			case DDLLexer.SORT_SPECIFIERS:
				
				QIndexDef indexDef = DatabaseCoreFactoryImpl.eINSTANCE.createIndexDef();
				
				//Iterate on SORT_KEY elements
				Tree keyToken = null;
				int counter = 0;
				for (int j = 0; j < fieldToken.getChildCount(); j++) {
					
					keyToken = fieldToken.getChild(j);
					if (keyToken.getType() == DDLLexer.SORT_KEY){
						
						QIndexColumnDef indexColumnDef = DatabaseCoreFactoryImpl.eINSTANCE.createIndexColumnDef();
						indexColumnDef.setSequence(counter++);
						indexColumnDef.setOrdering(OrderingType.ASCEND);
						
						Tree keyTokenField = null;
						for (int j2 = 0; j2 < keyToken.getChildCount(); j2++) {
							keyTokenField = keyToken.getChild(j2);
														
							switch (keyTokenField.getType()) {
							case DDLLexer.FIELD_NAME:
								
								indexColumnDef.setName(keyTokenField.getChild(0).getText());
								
								break;
							
							case DDLLexer.ORDER:
								
								if (keyTokenField.getChild(0).getType() == DDLLexer.DESC) {
									indexColumnDef.setOrdering(OrderingType.DESCEND);
								}
								
								break;	
							}							
						}
						
						indexDef.getColumns().add(indexColumnDef);
					}
				}
				
				createIndexStatement.setSortBy(indexDef);
				
				break;
			}			
		}
		
		return createIndexStatement;
	}

	private QDefinitionStatement manageCreateAliasStatement(CommonTree tree) {
		QCreateAliasStatement createAliasStatement = DdlFactoryImpl.eINSTANCE.createCreateAliasStatement();
				
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
			
			switch (fieldToken.getType()) {
			case DDLLexer.ALIAS_NAME:
				
				QQualifiedName aliasName = null;
				
				Tree nameField = fieldToken.getChild(0);
				if (nameField.getType() == DDLLexer.QUALIFIED) {
					aliasName = resolveQualified(nameField);					
				} else {
					aliasName = DatabaseCoreFactoryImpl.eINSTANCE.createQualifiedName();
					aliasName.setTable(nameField.getText());
				}
				
				createAliasStatement.setAliasName(aliasName);
				
				break;
			
			case DDLLexer.TABLE_NAME:
				
				QQualifiedName tableName = null;
				
				Tree tableField = fieldToken.getChild(0);
				if (tableField.getType() == DDLLexer.QUALIFIED) {
					tableName = resolveQualified(tableField);
				} else {
					tableName = DatabaseCoreFactoryImpl.eINSTANCE.createQualifiedName();
					tableName.setTable(tableField.getText());
				}
				
				createAliasStatement.setTableName(tableName);

				
				break;	
			}
		}
		return createAliasStatement;
	}

	private QDefinitionStatement manageConnectStatement(CommonTree tree) {
		QConnectStatement connectStatement = DdlFactoryImpl.eINSTANCE.createConnectStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
			
			switch (fieldToken.getType()) {
			case DDLLexer.TO:
				connectStatement.setTo(fieldToken.getChild(0).getText());
				break;
			
			case DDLLexer.USER:
				connectStatement.setUser(fieldToken.getChild(0).getText());
				break;	
			
			case DDLLexer.USING:
				connectStatement.setPwd(fieldToken.getChild(0).getText());
				break;	
				
			case DDLLexer.RESET:
				connectStatement.setReset(true);
				break;	

			default:
				break;
			}
		}
		
		
		return connectStatement;
	}

	private QDefinitionStatement manageCommitStatement(CommonTree tree) {
		
		QCommitStatement commitStatement = DdlFactoryImpl.eINSTANCE.createCommitStatement();
		
		if (tree.getChildCount() > 0) {
			commitStatement.setHold(true);
		}
		
		return commitStatement;
	}
	
	private QQualifiedName resolveQualified(Tree tree) {
				
		QQualifiedName qualifiedName = DatabaseCoreFactoryImpl.eINSTANCE.createQualifiedName();
		
		if (tree.getType() == DDLLexer.QUALIFIED) {
			qualifiedName.setSchema(tree.getChild(0).getText());
			qualifiedName.setTable(tree.getChild(1).getText());
			if (tree.getChild(2) != null) {
				qualifiedName.setMember(tree.getChild(1).getText());
			}
		}
		
		return qualifiedName;
	}

}
