package org.asup.db.syntax.ibmi.parser.ddl;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

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
import org.asup.db.core.QTableColumnDef;
import org.asup.db.core.impl.DatabaseCoreFactoryImpl;
import org.asup.db.syntax.QDatabaseSyntaxFactory;
import org.asup.db.syntax.QDefinitionParseResult;
import org.asup.db.syntax.QDefinitionStatement;
import org.asup.db.syntax.ddl.DropRange;
import org.asup.db.syntax.ddl.IsolationLevel;
import org.asup.db.syntax.ddl.QCallStatement;
import org.asup.db.syntax.ddl.QCommitStatement;
import org.asup.db.syntax.ddl.QConnectStatement;
import org.asup.db.syntax.ddl.QCreateAliasStatement;
import org.asup.db.syntax.ddl.QCreateIndexStatement;
import org.asup.db.syntax.ddl.QCreateTableStatement;
import org.asup.db.syntax.ddl.QCreateViewStatement;
import org.asup.db.syntax.ddl.QDisconnectStatement;
import org.asup.db.syntax.ddl.QDropStatement;
import org.asup.db.syntax.ddl.QLockTableStatement;
import org.asup.db.syntax.ddl.QReleaseStatement;
import org.asup.db.syntax.ddl.QRenameStatement;
import org.asup.db.syntax.ddl.QRollbackStatement;
import org.asup.db.syntax.ddl.QSetConnectionStatement;
import org.asup.db.syntax.ddl.QSetTransactionStatement;
import org.asup.db.syntax.ddl.RWOperation;
import org.asup.db.syntax.ddl.ShareMode;
import org.asup.db.syntax.ddl.TargetElement;
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
		
		String[] queryStrings = null;
		if (isCreateViewStatement(definitionString)) {
			String[] parts = splitCreteViewStatement(definitionString);
			definitionString = parts[0];
			queryStrings = new String[]{parts[1]};
		} else if (isCallStatement(definitionString)) {
			queryStrings = getCallParms(definitionString);
			definitionString = removeCallParms(definitionString);
		}
		
		DDLLexer lex = new DDLLexer(new ANTLRStringStream(definitionString));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		DDLParser parser = new DDLParser(tokens);
		
		CommonTree tree = null;
		try {
			tree = parser.sql().getTree();
			
			parserResult.setDefinitionStatement(convertModel(tree, queryStrings));
			
		} catch (RecognitionException e) {
			
		}

		return parserResult;
	}

	
	private QDefinitionStatement convertModel(CommonTree tree, String[] queryString) {
		
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
			result = manageCreateViewStatement(tree, queryString);
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
			result = manageProcedureCallStatement(tree, queryString);
			break;			
			
		case DDLLexer.RENAME_INDEX_STATEMENT:
			result = manageRenameIndexStatement(tree);
			break;			
		
		case DDLLexer.RENAME_TABLE_STATEMENT:
			result = manageRenameTableStatement(tree);
			break;	
		
		case DDLLexer.RELEASE_STATEMENT:
			result = manageReleaseStatement(tree);
			break;		
		
		case DDLLexer.ROLLBACK_STATEMENT:
			result = manageRollbackStatement(tree);
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
		QSetTransactionStatement setTransactionStatement = DdlFactoryImpl.eINSTANCE.createSetTransactionStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			
			case DDLLexer.ISOLATION_LEVEL:
				
				if (fieldToken.getChildCount() > 0){
					fieldToken = fieldToken.getChild(0);
					
					switch (fieldToken.getType()) {
					case DDLLexer.SERIALIZABLE:
						setTransactionStatement.setIsolationLevel(IsolationLevel.SERIALIZABLE);
						break;
						
					case DDLLexer.NO_COMMIT:
						setTransactionStatement.setIsolationLevel(IsolationLevel.NO_COMMIT);
						break;	
						
					case DDLLexer.READ_UNCOMMITTED:
						setTransactionStatement.setIsolationLevel(IsolationLevel.READ_UNCOMMITTED);
						break;			
					
					case DDLLexer.READ_COMMITTED:
						setTransactionStatement.setIsolationLevel(IsolationLevel.READ_COMMITTED);
						break;				
					
					case DDLLexer.REPEATABLE_READ:
						setTransactionStatement.setIsolationLevel(IsolationLevel.REPEATABLE_READ);
						break;				
					}
					
				}			
				
				break;
			
			case DDLLexer.RW_OPERATION:
				
				if (fieldToken.getChildCount() > 0){
					fieldToken = fieldToken.getChild(0);
					
					switch (fieldToken.getType()) {
					
					case DDLLexer.READ_ONLY:
						setTransactionStatement.setRwOperation(RWOperation.READ_ONLY);
						break;
						
					case DDLLexer.READ_WRITE:
						setTransactionStatement.setRwOperation(RWOperation.READ_WRITE);
						break;
					}
				
				break;
				}
			}
		}
		
		return setTransactionStatement; 

	}

	private QDefinitionStatement manageSetConnectionStatement(CommonTree tree) {
		QSetConnectionStatement setConnectionStatement = DdlFactoryImpl.eINSTANCE.createSetConnectionStatement();		
		
		if (tree.getChildCount()>0 && tree.getChild(0).getType() == DDLLexer.DB_NAME) {
			setConnectionStatement.setDatabaseName(tree.getChild(0).getChild(0).getText());
		}
				
		return setConnectionStatement;
	}

	private QDefinitionStatement manageRenameTableStatement(CommonTree tree) {
		QRenameStatement renameTableStatement = DdlFactoryImpl.eINSTANCE.createRenameStatement();
		renameTableStatement.setTarget(TargetElement.TABLE);		
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			case DDLLexer.TABLE_NAME:
				
				QQualifiedName viewQualifiedName = resolveQualified(fieldToken.getChild(0));
				renameTableStatement.setOriginalName(viewQualifiedName);
				
				break;
				
			case DDLLexer.NEW_NAME:
				
				renameTableStatement.setNewName(fieldToken.getChild(0).getText());
				
				break;
			
			case DDLLexer.SYSTEM:
				
				renameTableStatement.setSystem(fieldToken.getChild(0).getText());
				
				break;	
			
			}						
		}

		return renameTableStatement;

	}

	private QDefinitionStatement manageRenameIndexStatement(CommonTree tree) {
		QRenameStatement renameIndexStatement = DdlFactoryImpl.eINSTANCE.createRenameStatement();
		renameIndexStatement.setTarget(TargetElement.INDEX);		
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			case DDLLexer.INDEX_NAME:
				
				QQualifiedName viewQualifiedName = resolveQualified(fieldToken.getChild(0));
				renameIndexStatement.setOriginalName(viewQualifiedName);
				
				break;
				
			case DDLLexer.NEW_NAME:
				
				renameIndexStatement.setNewName(fieldToken.getChild(0).getText());
				
				break;
			
			case DDLLexer.SYSTEM:
				
				renameIndexStatement.setSystem(fieldToken.getChild(0).getText());
				
				break;	
			
			}						
		}

		return renameIndexStatement;

	}
	
	private QDefinitionStatement manageReleaseStatement(CommonTree tree) {
		QReleaseStatement releaseStatement = DdlFactoryImpl.eINSTANCE.createReleaseStatement();
				
		Tree serverName = tree.getChild(0).getChild(0);
		
		if (serverName.getType() == DDLLexer.ALL) {		
			releaseStatement.setServerName(TargetItem.ALL.getLiteral());
		} else if (serverName.getType() == DDLLexer.ALL_SQL) {					
			releaseStatement.setServerName(TargetItem.ALLSQL.getLiteral());
		} if (serverName.getType() == DDLLexer.CURRENT) {
			releaseStatement.setServerName(TargetItem.CURRENT.getLiteral());
		} else {
			releaseStatement.setServerName(serverName.getText());
		}
		
		return releaseStatement;
	}
	
	private QDefinitionStatement manageRollbackStatement(CommonTree tree) {
		QRollbackStatement releaseStatement = DdlFactoryImpl.eINSTANCE.createRollbackStatement();
		releaseStatement.setHold(false);
		
		if (tree.getChildCount()>0 && tree.getChild(0).getType() == DDLLexer.HOLD) {
			releaseStatement.setHold(true);
		}
				
		return releaseStatement;
	}

	private QDefinitionStatement manageProcedureCallStatement(CommonTree tree, String[] queryStrings) {
		
		QCallStatement callStatement = DdlFactoryImpl.eINSTANCE.createCallStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
			
			switch (fieldToken.getType()) {
			case DDLLexer.PROCEDURE_NAME:
				
				QQualifiedName procedureQualifiedName = resolveQualified(fieldToken.getChild(0));
				callStatement.setProcedureName(procedureQualifiedName);
				
				break;
			}			
		}
		
		for (int i = 0; i < queryStrings.length; i++) {
			callStatement.getParms().add(queryStrings[i]);
		}
		
		return callStatement;
	}

	private QDefinitionStatement manageLockTableStatement(CommonTree tree) {
		QLockTableStatement lockTableStatement = DdlFactoryImpl.eINSTANCE.createLockTableStatement();
		lockTableStatement.setShareMode(ShareMode.EXCLUSIVE);
		lockTableStatement.setAllowRead(false);
				
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
		
			switch (fieldToken.getType()) {
			case DDLLexer.TABLE_NAME:
				
				QQualifiedName tableQualifiedName = resolveQualified(fieldToken.getChild(0));
				lockTableStatement.setTableName(tableQualifiedName);
				
				break;
				
			case DDLLexer.SHARE:
				
				lockTableStatement.setShareMode(ShareMode.SHARE);
				
				break;
			
			case DDLLexer.ALLOW_READ:
				
				lockTableStatement.setAllowRead(true);
				
				break;	
			
			}						
		}

		return lockTableStatement;

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
		dropViewStatement.setTarget(TargetElement.VIEW);
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
		dropTableStatement.setTarget(TargetElement.TABLE);
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
		dropIndexStatement.setTarget(TargetElement.INDEX);
		
		Tree indexNameToken = tree.getFirstChildWithType(DDLLexer.INDEX_NAME);
		
		if (indexNameToken != null) {
			QQualifiedName indexQualifiedName = resolveQualified(indexNameToken.getChild(0));
			dropIndexStatement.setTargetName(indexQualifiedName);
		}
		
		return dropIndexStatement;
	}

	private QDefinitionStatement manageDropAliasStatement(CommonTree tree) {
		QDropStatement dropAliasStatement = DdlFactoryImpl.eINSTANCE.createDropStatement();
		dropAliasStatement.setTarget(TargetElement.ALIAS);
		
		Tree aliasNameToken = tree.getFirstChildWithType(DDLLexer.ALIAS_NAME);
		
		if (aliasNameToken != null) {
			QQualifiedName aliasQualifiedName = resolveQualified(aliasNameToken.getChild(0));
			dropAliasStatement.setTargetName(aliasQualifiedName);
		}
		
		return dropAliasStatement;
	}

	private QDefinitionStatement manageCreateViewStatement(CommonTree tree, String[] queryStrings) {
		
		QCreateViewStatement createViewStatement = DdlFactoryImpl.eINSTANCE.createCreateViewStatement();
		
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);
			
			switch (fieldToken.getType()) {			
			
			case DDLLexer.VIEW_NAME:
		
				// Manage name
				QQualifiedName tableName = null;
				
				Tree nameField = fieldToken.getChild(0);
				if (nameField.getType() == DDLLexer.QUALIFIED) {
					tableName = resolveQualified(nameField);					
				} else {
					tableName = DatabaseCoreFactoryImpl.eINSTANCE.createQualifiedName();					
					tableName.getQualifiers().add(nameField.getText());					
				}				
				createViewStatement.setViewName(tableName);
				
				break;
			
			case DDLLexer.COLUMNS_LIST:
				
				// Manage columns def
				Tree fieldDefToken = null;
				QTableColumnDef tableColumnDef = null;
				
				for (int k = 0; k < fieldToken.getChildCount(); k++) {
					
					fieldDefToken = fieldToken.getChild(k);
					tableColumnDef = DatabaseCoreFactoryImpl.eINSTANCE.createTableColumnDef();
					tableColumnDef.setNullable(true);
					tableColumnDef.setDefault(false);
					
					Tree fieldDefParm = null;
					for (int j = 0; j < fieldDefToken.getChildCount(); j++) {
						
						fieldDefParm = fieldDefToken.getChild(j);
						switch (fieldDefParm.getType()) {
						case DDLLexer.COLUMN_NAME:
							
							String name = fieldDefParm.getChild(0).getText();
							tableColumnDef.setName(name);
							
							break;

						}
						
					}			
					createViewStatement.getFields().add(tableColumnDef);
				}
				break;	
			}
		}
		
		createViewStatement.setQuery(queryStrings[0]);
		
		return createViewStatement;
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
					tableName.getQualifiers().add(nameField.getText());					
				}				
				createTableStatement.setTableName(tableName);
				
				break;
			
			case DDLLexer.TABLE_DEF:
				
				// Manage columns def
				Tree fieldDefToken = null;
				QTableColumnDef tableColumnDef = null;
				
				for (int k = 0; k < fieldToken.getChildCount(); k++) {
					
					fieldDefToken = fieldToken.getChild(k);
					tableColumnDef = DatabaseCoreFactoryImpl.eINSTANCE.createTableColumnDef();
					tableColumnDef.setNullable(true);
					tableColumnDef.setDefault(false);
					
					Tree fieldDefParm = null;
					for (int j = 0; j < fieldDefToken.getChildCount(); j++) {
						
						fieldDefParm = fieldDefToken.getChild(j);
						 switch (fieldDefParm.getType()) {
						case DDLLexer.FIELD_NAME:
							/*
							String name = fieldDefParm.getChild(0).getText();
							tableColumnDef.setFieldName(name);
							*/
							break;
						
						case DDLLexer.FOR_COLUMN:
							String columnName = fieldDefParm.getChild(0).getText();
							tableColumnDef.setName(columnName);
							break;	
						
						case DDLLexer.FIELD_TYPE:
							Tree typeToken = fieldDefParm.getChild(0);
							
							switch (typeToken.getType()) {
								
							case DDLLexer.CHAR:
								tableColumnDef.setDataType(DatabaseDataType.CHARACTER);
								break;
							case DDLLexer.VARCHAR:
								tableColumnDef.setDataType(DatabaseDataType.VARCHAR);
								break;	
							case DDLLexer.DECIMAL:
								tableColumnDef.setDataType(DatabaseDataType.DECIMAL);
								break;		
							case DDLLexer.BOOLEAN:
								tableColumnDef.setDataType(DatabaseDataType.BOOLEAN);
								break;			
							case DDLLexer.DATE:
								tableColumnDef.setDataType(DatabaseDataType.DATE);
								break;			
							case DDLLexer.TIME:
								tableColumnDef.setDataType(DatabaseDataType.TIME);
								break;			
							case DDLLexer.TIMESTAMP:
								tableColumnDef.setDataType(DatabaseDataType.TIME_STAMP);
								break;			
							case DDLLexer.INTEGER:
								tableColumnDef.setDataType(DatabaseDataType.INTEGER);
								break;			
							case DDLLexer.FLOAT:
								tableColumnDef.setDataType(DatabaseDataType.FLOAT);
								break;			
							case DDLLexer.TEXT:
								tableColumnDef.setDataType(DatabaseDataType.TEXT);
								break;			
							case DDLLexer.BLOB:
								tableColumnDef.setDataType(DatabaseDataType.BLOB);
								break;				
							}
							
							
							break;	
								
						case DDLLexer.NOT_NULL:
								tableColumnDef.setNullable(false);
							break;	
						
						case DDLLexer.WITH_DEFAULT:
							tableColumnDef.setDefault(true);
							break;	
						}
						
					}			
					createTableStatement.getFields().add(tableColumnDef);
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
					aliasName.getQualifiers().add(nameField.getText());					
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
					tableName.getQualifiers().add(tableField.getText());					
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
			for (int i = 0; i < tree.getChildCount(); i++) {
				qualifiedName.getQualifiers().add(tree.getChild(i).getText());
			}
		}
		
		return qualifiedName;
	}
	
	// Utility methods
	
		
	private boolean isCreateViewStatement(String statement) {
		return statement.matches("^[\\s]*[cC][rR][eE][aA][tT][eE][\\s]*[vV][iI][eE][wW].*");
	}
	
	
	private String[] splitCreteViewStatement(String viewText) {

		String[] tokens = viewText.split("[)\\s][aA][sS][\\s(]", Pattern.CASE_INSENSITIVE);

		String body = viewText.substring(tokens[0].length()).trim();
		body = body.replaceAll("^[)]?[aA][sS]", "");

		/*
		Pattern pattern = Pattern.compile(
				"(.*SELECT.*)[\\s]+?WITH[\\s]+?.*CHECK[\\s]+?OPTION.*", Pattern.CASE_INSENSITIVE | Pattern.DOTALL); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(body);
		if (matcher.matches()) {
			body = matcher.group(1).trim();
		}
		*/

		body = body.trim();
		if (body.startsWith("(")) {
			int pos = this.findMatchParenths(body);
			if (pos == body.length() - 1) {
				body = body.substring(1, body.length() - 1);
			}
		}

		tokens[1] = body;
		return tokens;
	}

	private int findMatchParenths(String body) {
		int pos = -1;
		int matches = 1;
		for (int i = 1; i < body.length(); i++) {
			if (body.charAt(i) == '(') {
				matches++;
			} else if (body.charAt(i) == ')') {
				matches--;
				if (matches == 0) {
					pos = i;
					break;
				}
			}
		}

		return pos;
	}
	
	private boolean isCallStatement(String statement) {
		return statement.matches("^[\\s]*[cC][aA][lL][lL][\\s]*.*");
	}
	
	
	/*
	 * Return parms from CALL statement as array of string
	 */
	private String[] getCallParms(String definitionString) {
		
		String[] parms = null;
		definitionString = definitionString.trim();		
		
		if (definitionString.indexOf("(") != -1 && definitionString.endsWith(")")) {
		
			int openBracePos = definitionString.indexOf("(");
			String parmsString = definitionString.substring(openBracePos, definitionString.length()-1);
			StringTokenizer parmTokenizer = new StringTokenizer(parmsString, ",");
			parms = new String[parmTokenizer.countTokens()];
			int counter = 0;
			
			while(parmTokenizer.hasMoreTokens()) {
				parms[counter] = parmTokenizer.nextToken();
				counter++;
			}
		}
		
		return parms;
		
	}
	
	/**
	 * Remove parms from CALL statement
	 * 
	 * Example:
	 * 
	 * CALL LIB/PROCEDURE (A, B C) -> CALL LIB/PROCEDURE () 
	 *  
	 * @param definitionString
	 * @return
	 */
	private String removeCallParms(String definitionString) {
		
		String result = definitionString;
		
		definitionString = definitionString.trim();		
		
		if (definitionString.indexOf("(") != -1 && definitionString.endsWith(")")) {
		
			int openBracePos = definitionString.indexOf("(");
			result = definitionString.substring(0, openBracePos) + ")";			
		}
		
		return result;

	}

	

}
