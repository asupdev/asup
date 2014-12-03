// $ANTLR 3.5.1 DDL.g 2014-12-03 11:31:57

package org.asup.db.syntax.ibmi.parser.ddl;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@SuppressWarnings("all")
public class DDLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ALIAS", "ALIAS_NAME", "ALL", 
		"ALLOW", "ALLOW_READ", "AND", "AS", "ASC", "ASSIGN", "AS_EXPRESSION", 
		"B", "BAD", "BIGINT", "BINARY", "BIT", "BLOB", "BOOL", "BOOLEAN", "BY", 
		"BYTEA", "C", "CALL", "CASCADE", "CASE", "CHAR", "CHARACTER", "COALESCE", 
		"COLUMN", "COLUMNS_LIST", "COLUMN_NAME", "COMMA", "COMMENT", "COMMIT", 
		"COMMITTED", "COMMIT_STATEMENT", "CONNECT", "CONNECTION", "CONNECT_STATEMENT", 
		"COUNT", "COUNT_ROWS", "COUNT_VAL", "CREATE", "CREATE_ALIAS_STATEMENT", 
		"CREATE_INDEX_STATEMENT", "CREATE_TABLE_STATEMENT", "CREATE_VIEW_STATEMENT", 
		"CROSS", "CUBE", "CURRENT", "Character_String_Literal", "Control_Characters", 
		"D", "DATE", "DB_NAME", "DEC", "DECIMAL", "DEFAULT", "DESC", "DESC_TABLE", 
		"DISCONNECT", "DISCONNECT_STATEMENT", "DISTINCT", "DIVIDE", "DOT", "DOUBLE", 
		"DROP", "DROP_ALIAS_STATEMENT", "DROP_INDEX_STATEMENT", "DROP_TABLE_STATEMENT", 
		"DROP_VIEW_STATEMENT", "Digit", "Double_Quote", "E", "ELSE", "EMPTY_GROUPING_SET", 
		"END", "EQUAL", "ESC_SEQ", "EXCEPT", "EXCLUSIVE", "EXPONENT", "EXTERNAL", 
		"Extended_Control_Characters", "F", "FALSE", "FIELD_DEF", "FIELD_NAME", 
		"FIELD_TYPE", "FIRST", "FLOAT", "FLOAT4", "FLOAT8", "FOR", "FORMAT", "FOR_COLUMN", 
		"FROM", "FULL", "FUNCTION", "FUNC_ARGS", "G", "GEQ", "GROUP", "GROUP_BY", 
		"GTH", "H", "HAVING", "HEX_DIGIT", "HOLD", "I", "IN", "INDEX", "INDEX_NAME", 
		"INET4", "INNER", "INSERT", "INT", "INT1", "INT2", "INT4", "INT8", "INTEGER", 
		"INTERSECT", "INTO", "IS", "ISOLATION", "ISOLATION_LEVEL", "Identifier", 
		"J", "JOIN", "K", "L", "LAST", "LEFT", "LEFT_PAREN", "LEQ", "LEVEL", "LIKE", 
		"LIMIT", "LOCATION", "LOCK", "LOCK_TABLE_STATEMENT", "LTH", "M", "MEMBER", 
		"MINUS", "MODE", "MODULAR", "MULTIPLY", "N", "NAME", "NATIONAL", "NATURAL", 
		"NCHAR", "NEW_NAME", "NO", "NOT", "NOT_EQUAL", "NOT_NULL", "NO_COMMIT", 
		"NULL", "NULLIF", "NULL_ORDER", "NUMBER", "NUMERIC", "NVARCHAR", "O", 
		"OCTAL_ESC", "ON", "ONLY", "OR", "ORDER", "ORDER_BY", "OR_REPLACE", "OUTER", 
		"P", "PARAM", "PARAMS", "PLUS", "PRECISION", "PROCEDURE_ARGS", "PROCEDURE_CALL_STATEMENT", 
		"PROCEDURE_NAME", "Q", "QUALIFIED", "Quote", "R", "READ", "READ_COMMITTED", 
		"READ_ONLY", "READ_UNCOMMITTED", "READ_WRITE", "REAL", "REAL_NUMBER", 
		"RELEASE", "RELEASE_STATEMENT", "RENAME", "RENAME_INDEX_STATEMENT", "RENAME_TABLE_STATEMENT", 
		"REPEATABLE", "REPEATABLE_READ", "REPLACE", "RESET", "RESTRICT", "RIGHT", 
		"RIGHT_PAREN", "ROLLBACK", "ROLLBACK_STATEMENT", "ROLLUP", "RW_OPERATION", 
		"S", "SELECT", "SEL_LIST", "SEMI_COLON", "SERIALIZABLE", "SET", "SET_CONNECTION_STATEMENT", 
		"SET_QUALIFIER", "SET_TRANSACTION_STATEMENT", "SHARE", "SHOW_FUNCTION", 
		"SHOW_TABLE", "SMALLINT", "SORT_KEY", "SORT_SPECIFIERS", "STORE", "STORE_TYPE", 
		"SYSTEM", "Space", "T", "TABLE", "TABLE_DEF", "TABLE_NAME", "TARGET_FIELDS", 
		"TEXT", "THEN", "TIME", "TIMESTAMP", "TIMESTAMPTZ", "TIMETZ", "TINYINT", 
		"TO", "TRANSACTION", "TRUE", "U", "UNCOMMITTED", "UNICODE_ESC", "UNION", 
		"UNIQUE", "UNKNOWN", "USER", "USING", "V", "VALUES", "VARBINARY", "VARBIT", 
		"VARCHAR", "VARYING", "VIEW", "VIEW_NAME", "W", "WHEN", "WHERE", "WITH", 
		"WITH_DEFAULT", "WORK", "WRITE", "White_Space", "X", "Y", "Z", "ZONE", 
		"'into'", "'values'"
	};
	public static final int EOF=-1;
	public static final int T__276=276;
	public static final int T__277=277;
	public static final int A=4;
	public static final int ALIAS=5;
	public static final int ALIAS_NAME=6;
	public static final int ALL=7;
	public static final int ALLOW=8;
	public static final int ALLOW_READ=9;
	public static final int AND=10;
	public static final int AS=11;
	public static final int ASC=12;
	public static final int ASSIGN=13;
	public static final int AS_EXPRESSION=14;
	public static final int B=15;
	public static final int BAD=16;
	public static final int BIGINT=17;
	public static final int BINARY=18;
	public static final int BIT=19;
	public static final int BLOB=20;
	public static final int BOOL=21;
	public static final int BOOLEAN=22;
	public static final int BY=23;
	public static final int BYTEA=24;
	public static final int C=25;
	public static final int CALL=26;
	public static final int CASCADE=27;
	public static final int CASE=28;
	public static final int CHAR=29;
	public static final int CHARACTER=30;
	public static final int COALESCE=31;
	public static final int COLUMN=32;
	public static final int COLUMNS_LIST=33;
	public static final int COLUMN_NAME=34;
	public static final int COMMA=35;
	public static final int COMMENT=36;
	public static final int COMMIT=37;
	public static final int COMMITTED=38;
	public static final int COMMIT_STATEMENT=39;
	public static final int CONNECT=40;
	public static final int CONNECTION=41;
	public static final int CONNECT_STATEMENT=42;
	public static final int COUNT=43;
	public static final int COUNT_ROWS=44;
	public static final int COUNT_VAL=45;
	public static final int CREATE=46;
	public static final int CREATE_ALIAS_STATEMENT=47;
	public static final int CREATE_INDEX_STATEMENT=48;
	public static final int CREATE_TABLE_STATEMENT=49;
	public static final int CREATE_VIEW_STATEMENT=50;
	public static final int CROSS=51;
	public static final int CUBE=52;
	public static final int CURRENT=53;
	public static final int Character_String_Literal=54;
	public static final int Control_Characters=55;
	public static final int D=56;
	public static final int DATE=57;
	public static final int DB_NAME=58;
	public static final int DEC=59;
	public static final int DECIMAL=60;
	public static final int DEFAULT=61;
	public static final int DESC=62;
	public static final int DESC_TABLE=63;
	public static final int DISCONNECT=64;
	public static final int DISCONNECT_STATEMENT=65;
	public static final int DISTINCT=66;
	public static final int DIVIDE=67;
	public static final int DOT=68;
	public static final int DOUBLE=69;
	public static final int DROP=70;
	public static final int DROP_ALIAS_STATEMENT=71;
	public static final int DROP_INDEX_STATEMENT=72;
	public static final int DROP_TABLE_STATEMENT=73;
	public static final int DROP_VIEW_STATEMENT=74;
	public static final int Digit=75;
	public static final int Double_Quote=76;
	public static final int E=77;
	public static final int ELSE=78;
	public static final int EMPTY_GROUPING_SET=79;
	public static final int END=80;
	public static final int EQUAL=81;
	public static final int ESC_SEQ=82;
	public static final int EXCEPT=83;
	public static final int EXCLUSIVE=84;
	public static final int EXPONENT=85;
	public static final int EXTERNAL=86;
	public static final int Extended_Control_Characters=87;
	public static final int F=88;
	public static final int FALSE=89;
	public static final int FIELD_DEF=90;
	public static final int FIELD_NAME=91;
	public static final int FIELD_TYPE=92;
	public static final int FIRST=93;
	public static final int FLOAT=94;
	public static final int FLOAT4=95;
	public static final int FLOAT8=96;
	public static final int FOR=97;
	public static final int FORMAT=98;
	public static final int FOR_COLUMN=99;
	public static final int FROM=100;
	public static final int FULL=101;
	public static final int FUNCTION=102;
	public static final int FUNC_ARGS=103;
	public static final int G=104;
	public static final int GEQ=105;
	public static final int GROUP=106;
	public static final int GROUP_BY=107;
	public static final int GTH=108;
	public static final int H=109;
	public static final int HAVING=110;
	public static final int HEX_DIGIT=111;
	public static final int HOLD=112;
	public static final int I=113;
	public static final int IN=114;
	public static final int INDEX=115;
	public static final int INDEX_NAME=116;
	public static final int INET4=117;
	public static final int INNER=118;
	public static final int INSERT=119;
	public static final int INT=120;
	public static final int INT1=121;
	public static final int INT2=122;
	public static final int INT4=123;
	public static final int INT8=124;
	public static final int INTEGER=125;
	public static final int INTERSECT=126;
	public static final int INTO=127;
	public static final int IS=128;
	public static final int ISOLATION=129;
	public static final int ISOLATION_LEVEL=130;
	public static final int Identifier=131;
	public static final int J=132;
	public static final int JOIN=133;
	public static final int K=134;
	public static final int L=135;
	public static final int LAST=136;
	public static final int LEFT=137;
	public static final int LEFT_PAREN=138;
	public static final int LEQ=139;
	public static final int LEVEL=140;
	public static final int LIKE=141;
	public static final int LIMIT=142;
	public static final int LOCATION=143;
	public static final int LOCK=144;
	public static final int LOCK_TABLE_STATEMENT=145;
	public static final int LTH=146;
	public static final int M=147;
	public static final int MEMBER=148;
	public static final int MINUS=149;
	public static final int MODE=150;
	public static final int MODULAR=151;
	public static final int MULTIPLY=152;
	public static final int N=153;
	public static final int NAME=154;
	public static final int NATIONAL=155;
	public static final int NATURAL=156;
	public static final int NCHAR=157;
	public static final int NEW_NAME=158;
	public static final int NO=159;
	public static final int NOT=160;
	public static final int NOT_EQUAL=161;
	public static final int NOT_NULL=162;
	public static final int NO_COMMIT=163;
	public static final int NULL=164;
	public static final int NULLIF=165;
	public static final int NULL_ORDER=166;
	public static final int NUMBER=167;
	public static final int NUMERIC=168;
	public static final int NVARCHAR=169;
	public static final int O=170;
	public static final int OCTAL_ESC=171;
	public static final int ON=172;
	public static final int ONLY=173;
	public static final int OR=174;
	public static final int ORDER=175;
	public static final int ORDER_BY=176;
	public static final int OR_REPLACE=177;
	public static final int OUTER=178;
	public static final int P=179;
	public static final int PARAM=180;
	public static final int PARAMS=181;
	public static final int PLUS=182;
	public static final int PRECISION=183;
	public static final int PROCEDURE_ARGS=184;
	public static final int PROCEDURE_CALL_STATEMENT=185;
	public static final int PROCEDURE_NAME=186;
	public static final int Q=187;
	public static final int QUALIFIED=188;
	public static final int Quote=189;
	public static final int R=190;
	public static final int READ=191;
	public static final int READ_COMMITTED=192;
	public static final int READ_ONLY=193;
	public static final int READ_UNCOMMITTED=194;
	public static final int READ_WRITE=195;
	public static final int REAL=196;
	public static final int REAL_NUMBER=197;
	public static final int RELEASE=198;
	public static final int RELEASE_STATEMENT=199;
	public static final int RENAME=200;
	public static final int RENAME_INDEX_STATEMENT=201;
	public static final int RENAME_TABLE_STATEMENT=202;
	public static final int REPEATABLE=203;
	public static final int REPEATABLE_READ=204;
	public static final int REPLACE=205;
	public static final int RESET=206;
	public static final int RESTRICT=207;
	public static final int RIGHT=208;
	public static final int RIGHT_PAREN=209;
	public static final int ROLLBACK=210;
	public static final int ROLLBACK_STATEMENT=211;
	public static final int ROLLUP=212;
	public static final int RW_OPERATION=213;
	public static final int S=214;
	public static final int SELECT=215;
	public static final int SEL_LIST=216;
	public static final int SEMI_COLON=217;
	public static final int SERIALIZABLE=218;
	public static final int SET=219;
	public static final int SET_CONNECTION_STATEMENT=220;
	public static final int SET_QUALIFIER=221;
	public static final int SET_TRANSACTION_STATEMENT=222;
	public static final int SHARE=223;
	public static final int SHOW_FUNCTION=224;
	public static final int SHOW_TABLE=225;
	public static final int SMALLINT=226;
	public static final int SORT_KEY=227;
	public static final int SORT_SPECIFIERS=228;
	public static final int STORE=229;
	public static final int STORE_TYPE=230;
	public static final int SYSTEM=231;
	public static final int Space=232;
	public static final int T=233;
	public static final int TABLE=234;
	public static final int TABLE_DEF=235;
	public static final int TABLE_NAME=236;
	public static final int TARGET_FIELDS=237;
	public static final int TEXT=238;
	public static final int THEN=239;
	public static final int TIME=240;
	public static final int TIMESTAMP=241;
	public static final int TIMESTAMPTZ=242;
	public static final int TIMETZ=243;
	public static final int TINYINT=244;
	public static final int TO=245;
	public static final int TRANSACTION=246;
	public static final int TRUE=247;
	public static final int U=248;
	public static final int UNCOMMITTED=249;
	public static final int UNICODE_ESC=250;
	public static final int UNION=251;
	public static final int UNIQUE=252;
	public static final int UNKNOWN=253;
	public static final int USER=254;
	public static final int USING=255;
	public static final int V=256;
	public static final int VALUES=257;
	public static final int VARBINARY=258;
	public static final int VARBIT=259;
	public static final int VARCHAR=260;
	public static final int VARYING=261;
	public static final int VIEW=262;
	public static final int VIEW_NAME=263;
	public static final int W=264;
	public static final int WHEN=265;
	public static final int WHERE=266;
	public static final int WITH=267;
	public static final int WITH_DEFAULT=268;
	public static final int WORK=269;
	public static final int WRITE=270;
	public static final int White_Space=271;
	public static final int X=272;
	public static final int Y=273;
	public static final int Z=274;
	public static final int ZONE=275;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DDLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DDLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[387+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DDLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "DDL.g"; }


	   @Override
	   public void reportError(RecognitionException e) {
	     throw new Error(e);
	   }
	   @Override
	   public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	     String hdr = getErrorHeader(e);
	     String msg = getErrorMessage(e, tokenNames);
	     throw new Error(e);
	   }


	public static class data_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "data_type"
	// DDL.g:351:1: data_type : ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type );
	public final DDLParser.data_type_return data_type() throws RecognitionException {
		DDLParser.data_type_return retval = new DDLParser.data_type_return();
		retval.start = input.LT(1);
		int data_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INET47=null;
		ParserRuleReturnScope boolean_type1 =null;
		ParserRuleReturnScope bit_type2 =null;
		ParserRuleReturnScope varbit_type3 =null;
		ParserRuleReturnScope binary_type4 =null;
		ParserRuleReturnScope varbinary_type5 =null;
		ParserRuleReturnScope blob_type6 =null;
		ParserRuleReturnScope character_string_type8 =null;
		ParserRuleReturnScope datetime_type9 =null;
		ParserRuleReturnScope numeric_type10 =null;

		CommonTree INET47_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// DDL.g:352:3: ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type )
			int alt1=10;
			switch ( input.LA(1) ) {
			case BOOL:
			case BOOLEAN:
				{
				alt1=1;
				}
				break;
			case BIT:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==VARYING) ) {
					alt1=3;
				}
				else if ( (LA1_2==EOF||LA1_2==COMMA||LA1_2==LEFT_PAREN||LA1_2==NOT||LA1_2==RIGHT_PAREN||LA1_2==WITH) ) {
					alt1=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARBIT:
				{
				alt1=3;
				}
				break;
			case BINARY:
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4==VARYING) ) {
					alt1=5;
				}
				else if ( (LA1_4==EOF||LA1_4==COMMA||LA1_4==LEFT_PAREN||LA1_4==NOT||LA1_4==RIGHT_PAREN||LA1_4==WITH) ) {
					alt1=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARBINARY:
				{
				alt1=5;
				}
				break;
			case BLOB:
			case BYTEA:
				{
				alt1=6;
				}
				break;
			case INET4:
				{
				alt1=7;
				}
				break;
			case CHAR:
			case CHARACTER:
			case NATIONAL:
			case NCHAR:
			case NVARCHAR:
			case TEXT:
			case VARCHAR:
				{
				alt1=8;
				}
				break;
			case DATE:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TIMETZ:
				{
				alt1=9;
				}
				break;
			case BIGINT:
			case DEC:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case FLOAT4:
			case FLOAT8:
			case INT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case INTEGER:
			case NUMERIC:
			case REAL:
			case SMALLINT:
			case TINYINT:
				{
				alt1=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// DDL.g:352:5: boolean_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_type_in_data_type3136);
					boolean_type1=boolean_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_type1.getTree());

					}
					break;
				case 2 :
					// DDL.g:353:5: bit_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bit_type_in_data_type3142);
					bit_type2=bit_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bit_type2.getTree());

					}
					break;
				case 3 :
					// DDL.g:354:5: varbit_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varbit_type_in_data_type3148);
					varbit_type3=varbit_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varbit_type3.getTree());

					}
					break;
				case 4 :
					// DDL.g:355:5: binary_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_binary_type_in_data_type3154);
					binary_type4=binary_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_type4.getTree());

					}
					break;
				case 5 :
					// DDL.g:356:5: varbinary_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varbinary_type_in_data_type3160);
					varbinary_type5=varbinary_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varbinary_type5.getTree());

					}
					break;
				case 6 :
					// DDL.g:357:5: blob_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_blob_type_in_data_type3166);
					blob_type6=blob_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blob_type6.getTree());

					}
					break;
				case 7 :
					// DDL.g:358:5: INET4
					{
					root_0 = (CommonTree)adaptor.nil();


					INET47=(Token)match(input,INET4,FOLLOW_INET4_in_data_type3172); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INET47_tree = (CommonTree)adaptor.create(INET47);
					adaptor.addChild(root_0, INET47_tree);
					}

					}
					break;
				case 8 :
					// DDL.g:359:5: character_string_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_character_string_type_in_data_type3178);
					character_string_type8=character_string_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, character_string_type8.getTree());

					}
					break;
				case 9 :
					// DDL.g:360:5: datetime_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_datetime_type_in_data_type3184);
					datetime_type9=datetime_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_type9.getTree());

					}
					break;
				case 10 :
					// DDL.g:361:5: numeric_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_type_in_data_type3190);
					numeric_type10=numeric_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_type10.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, data_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "data_type"


	public static class character_string_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "character_string_type"
	// DDL.g:363:1: character_string_type : ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT );
	public final DDLParser.character_string_type_return character_string_type() throws RecognitionException {
		DDLParser.character_string_type_return retval = new DDLParser.character_string_type_return();
		retval.start = input.LT(1);
		int character_string_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TEXT15=null;
		ParserRuleReturnScope char_type11 =null;
		ParserRuleReturnScope varchar_type12 =null;
		ParserRuleReturnScope nchar_type13 =null;
		ParserRuleReturnScope nvarchar_type14 =null;

		CommonTree TEXT15_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// DDL.g:364:3: ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT )
			int alt2=5;
			switch ( input.LA(1) ) {
			case CHAR:
				{
				alt2=1;
				}
				break;
			case CHARACTER:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VARYING) ) {
					alt2=2;
				}
				else if ( (LA2_2==EOF||LA2_2==COMMA||LA2_2==LEFT_PAREN||LA2_2==NOT||LA2_2==RIGHT_PAREN||LA2_2==WITH) ) {
					alt2=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARCHAR:
				{
				alt2=2;
				}
				break;
			case NCHAR:
				{
				alt2=3;
				}
				break;
			case NATIONAL:
				{
				int LA2_5 = input.LA(2);
				if ( (LA2_5==CHARACTER) ) {
					int LA2_8 = input.LA(3);
					if ( (LA2_8==VARYING) ) {
						alt2=4;
					}
					else if ( (LA2_8==EOF||LA2_8==COMMA||LA2_8==LEFT_PAREN||LA2_8==NOT||LA2_8==RIGHT_PAREN||LA2_8==WITH) ) {
						alt2=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NVARCHAR:
				{
				alt2=4;
				}
				break;
			case TEXT:
				{
				alt2=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// DDL.g:364:5: char_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_char_type_in_character_string_type3202);
					char_type11=char_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, char_type11.getTree());

					}
					break;
				case 2 :
					// DDL.g:365:5: varchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varchar_type_in_character_string_type3208);
					varchar_type12=varchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varchar_type12.getTree());

					}
					break;
				case 3 :
					// DDL.g:366:5: nchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nchar_type_in_character_string_type3214);
					nchar_type13=nchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nchar_type13.getTree());

					}
					break;
				case 4 :
					// DDL.g:367:5: nvarchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nvarchar_type_in_character_string_type3220);
					nvarchar_type14=nvarchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nvarchar_type14.getTree());

					}
					break;
				case 5 :
					// DDL.g:368:5: TEXT
					{
					root_0 = (CommonTree)adaptor.nil();


					TEXT15=(Token)match(input,TEXT,FOLLOW_TEXT_in_character_string_type3226); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TEXT15_tree = (CommonTree)adaptor.create(TEXT15);
					adaptor.addChild(root_0, TEXT15_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, character_string_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "character_string_type"


	public static class numeric_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "numeric_type"
	// DDL.g:370:1: numeric_type : ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type );
	public final DDLParser.numeric_type_return numeric_type() throws RecognitionException {
		DDLParser.numeric_type_return retval = new DDLParser.numeric_type_return();
		retval.start = input.LT(1);
		int numeric_type_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope int1_type16 =null;
		ParserRuleReturnScope int2_type17 =null;
		ParserRuleReturnScope int4_type18 =null;
		ParserRuleReturnScope int8_type19 =null;
		ParserRuleReturnScope float4_type20 =null;
		ParserRuleReturnScope float_type21 =null;
		ParserRuleReturnScope float8_type22 =null;
		ParserRuleReturnScope number_type23 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// DDL.g:371:3: ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type )
			int alt3=8;
			switch ( input.LA(1) ) {
			case INT1:
			case TINYINT:
				{
				alt3=1;
				}
				break;
			case INT2:
			case SMALLINT:
				{
				alt3=2;
				}
				break;
			case INT:
			case INT4:
			case INTEGER:
				{
				alt3=3;
				}
				break;
			case BIGINT:
			case INT8:
				{
				alt3=4;
				}
				break;
			case FLOAT4:
			case REAL:
				{
				alt3=5;
				}
				break;
			case FLOAT:
				{
				alt3=6;
				}
				break;
			case DOUBLE:
			case FLOAT8:
				{
				alt3=7;
				}
				break;
			case DEC:
			case DECIMAL:
			case NUMERIC:
				{
				alt3=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// DDL.g:371:5: int1_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int1_type_in_numeric_type3238);
					int1_type16=int1_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int1_type16.getTree());

					}
					break;
				case 2 :
					// DDL.g:372:5: int2_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int2_type_in_numeric_type3244);
					int2_type17=int2_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int2_type17.getTree());

					}
					break;
				case 3 :
					// DDL.g:373:5: int4_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int4_type_in_numeric_type3250);
					int4_type18=int4_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int4_type18.getTree());

					}
					break;
				case 4 :
					// DDL.g:374:5: int8_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int8_type_in_numeric_type3256);
					int8_type19=int8_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int8_type19.getTree());

					}
					break;
				case 5 :
					// DDL.g:375:5: float4_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float4_type_in_numeric_type3262);
					float4_type20=float4_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float4_type20.getTree());

					}
					break;
				case 6 :
					// DDL.g:376:5: float_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_type_in_numeric_type3268);
					float_type21=float_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float_type21.getTree());

					}
					break;
				case 7 :
					// DDL.g:377:5: float8_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float8_type_in_numeric_type3274);
					float8_type22=float8_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float8_type22.getTree());

					}
					break;
				case 8 :
					// DDL.g:378:5: number_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_number_type_in_numeric_type3280);
					number_type23=number_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number_type23.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, numeric_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "numeric_type"


	public static class datetime_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "datetime_type"
	// DDL.g:380:1: datetime_type : ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type );
	public final DDLParser.datetime_type_return datetime_type() throws RecognitionException {
		DDLParser.datetime_type_return retval = new DDLParser.datetime_type_return();
		retval.start = input.LT(1);
		int datetime_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DATE24=null;
		Token TIME25=null;
		Token TIMESTAMP27=null;
		ParserRuleReturnScope timetz_type26 =null;
		ParserRuleReturnScope timestamptz_type28 =null;

		CommonTree DATE24_tree=null;
		CommonTree TIME25_tree=null;
		CommonTree TIMESTAMP27_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// DDL.g:381:3: ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type )
			int alt4=5;
			switch ( input.LA(1) ) {
			case DATE:
				{
				alt4=1;
				}
				break;
			case TIME:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==WITH) ) {
					int LA4_6 = input.LA(3);
					if ( (LA4_6==TIME) ) {
						alt4=3;
					}
					else if ( (LA4_6==DEFAULT) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_2==EOF||LA4_2==COMMA||LA4_2==NOT||LA4_2==RIGHT_PAREN) ) {
					alt4=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TIMETZ:
				{
				alt4=3;
				}
				break;
			case TIMESTAMP:
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4==WITH) ) {
					int LA4_8 = input.LA(3);
					if ( (LA4_8==TIME) ) {
						alt4=5;
					}
					else if ( (LA4_8==DEFAULT) ) {
						alt4=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_4==EOF||LA4_4==COMMA||LA4_4==NOT||LA4_4==RIGHT_PAREN) ) {
					alt4=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TIMESTAMPTZ:
				{
				alt4=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// DDL.g:381:5: DATE
					{
					root_0 = (CommonTree)adaptor.nil();


					DATE24=(Token)match(input,DATE,FOLLOW_DATE_in_datetime_type3292); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DATE24_tree = (CommonTree)adaptor.create(DATE24);
					adaptor.addChild(root_0, DATE24_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:382:5: TIME
					{
					root_0 = (CommonTree)adaptor.nil();


					TIME25=(Token)match(input,TIME,FOLLOW_TIME_in_datetime_type3298); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIME25_tree = (CommonTree)adaptor.create(TIME25);
					adaptor.addChild(root_0, TIME25_tree);
					}

					}
					break;
				case 3 :
					// DDL.g:383:5: timetz_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timetz_type_in_datetime_type3304);
					timetz_type26=timetz_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timetz_type26.getTree());

					}
					break;
				case 4 :
					// DDL.g:384:5: TIMESTAMP
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMESTAMP27=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_datetime_type3310); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMESTAMP27_tree = (CommonTree)adaptor.create(TIMESTAMP27);
					adaptor.addChild(root_0, TIMESTAMP27_tree);
					}

					}
					break;
				case 5 :
					// DDL.g:385:5: timestamptz_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timestamptz_type_in_datetime_type3316);
					timestamptz_type28=timestamptz_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamptz_type28.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, datetime_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "datetime_type"


	public static class precision_param_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precision_param"
	// DDL.g:387:1: precision_param : ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !);
	public final DDLParser.precision_param_return precision_param() throws RecognitionException {
		DDLParser.precision_param_return retval = new DDLParser.precision_param_return();
		retval.start = input.LT(1);
		int precision_param_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN29=null;
		Token NUMBER30=null;
		Token RIGHT_PAREN31=null;
		Token LEFT_PAREN32=null;
		Token NUMBER33=null;
		Token COMMA34=null;
		Token NUMBER35=null;
		Token RIGHT_PAREN36=null;

		CommonTree LEFT_PAREN29_tree=null;
		CommonTree NUMBER30_tree=null;
		CommonTree RIGHT_PAREN31_tree=null;
		CommonTree LEFT_PAREN32_tree=null;
		CommonTree NUMBER33_tree=null;
		CommonTree COMMA34_tree=null;
		CommonTree NUMBER35_tree=null;
		CommonTree RIGHT_PAREN36_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// DDL.g:388:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LEFT_PAREN) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==NUMBER) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==RIGHT_PAREN) ) {
						alt5=1;
					}
					else if ( (LA5_2==COMMA) ) {
						alt5=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// DDL.g:388:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN29=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_param3328); if (state.failed) return retval;
					NUMBER30=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param3331); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER30_tree = (CommonTree)adaptor.create(NUMBER30);
					adaptor.addChild(root_0, NUMBER30_tree);
					}

					RIGHT_PAREN31=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_param3333); if (state.failed) return retval;
					}
					break;
				case 2 :
					// DDL.g:389:5: LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN32=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_param3340); if (state.failed) return retval;
					NUMBER33=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param3343); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER33_tree = (CommonTree)adaptor.create(NUMBER33);
					adaptor.addChild(root_0, NUMBER33_tree);
					}

					COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_precision_param3345); if (state.failed) return retval;
					NUMBER35=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param3348); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER35_tree = (CommonTree)adaptor.create(NUMBER35);
					adaptor.addChild(root_0, NUMBER35_tree);
					}

					RIGHT_PAREN36=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_param3350); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, precision_param_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "precision_param"


	public static class type_length_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_length"
	// DDL.g:391:1: type_length : LEFT_PAREN ! NUMBER RIGHT_PAREN !;
	public final DDLParser.type_length_return type_length() throws RecognitionException {
		DDLParser.type_length_return retval = new DDLParser.type_length_return();
		retval.start = input.LT(1);
		int type_length_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN37=null;
		Token NUMBER38=null;
		Token RIGHT_PAREN39=null;

		CommonTree LEFT_PAREN37_tree=null;
		CommonTree NUMBER38_tree=null;
		CommonTree RIGHT_PAREN39_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// DDL.g:392:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !)
			// DDL.g:392:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			LEFT_PAREN37=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_type_length3363); if (state.failed) return retval;
			NUMBER38=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_type_length3366); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NUMBER38_tree = (CommonTree)adaptor.create(NUMBER38);
			adaptor.addChild(root_0, NUMBER38_tree);
			}

			RIGHT_PAREN39=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_type_length3368); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, type_length_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "type_length"


	public static class boolean_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_type"
	// DDL.g:394:1: boolean_type : ( BOOLEAN | BOOL -> BOOLEAN );
	public final DDLParser.boolean_type_return boolean_type() throws RecognitionException {
		DDLParser.boolean_type_return retval = new DDLParser.boolean_type_return();
		retval.start = input.LT(1);
		int boolean_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BOOLEAN40=null;
		Token BOOL41=null;

		CommonTree BOOLEAN40_tree=null;
		CommonTree BOOL41_tree=null;
		RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// DDL.g:395:3: ( BOOLEAN | BOOL -> BOOLEAN )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==BOOLEAN) ) {
				alt6=1;
			}
			else if ( (LA6_0==BOOL) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// DDL.g:395:5: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN40=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type3381); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN40_tree = (CommonTree)adaptor.create(BOOLEAN40);
					adaptor.addChild(root_0, BOOLEAN40_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:396:5: BOOL
					{
					BOOL41=(Token)match(input,BOOL,FOLLOW_BOOL_in_boolean_type3387); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BOOL.add(BOOL41);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 396:10: -> BOOLEAN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(BOOLEAN, "BOOLEAN"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, boolean_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_type"


	public static class bit_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bit_type"
	// DDL.g:398:1: bit_type : BIT ( type_length )? -> BIT ;
	public final DDLParser.bit_type_return bit_type() throws RecognitionException {
		DDLParser.bit_type_return retval = new DDLParser.bit_type_return();
		retval.start = input.LT(1);
		int bit_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BIT42=null;
		ParserRuleReturnScope type_length43 =null;

		CommonTree BIT42_tree=null;
		RewriteRuleTokenStream stream_BIT=new RewriteRuleTokenStream(adaptor,"token BIT");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// DDL.g:399:3: ( BIT ( type_length )? -> BIT )
			// DDL.g:399:5: BIT ( type_length )?
			{
			BIT42=(Token)match(input,BIT,FOLLOW_BIT_in_bit_type3403); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BIT.add(BIT42);

			// DDL.g:399:9: ( type_length )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LEFT_PAREN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// DDL.g:399:9: type_length
					{
					pushFollow(FOLLOW_type_length_in_bit_type3405);
					type_length43=type_length();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_length.add(type_length43.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: BIT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 399:22: -> BIT
			{
				adaptor.addChild(root_0, stream_BIT.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, bit_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bit_type"


	public static class varbit_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varbit_type"
	// DDL.g:401:1: varbit_type : ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT );
	public final DDLParser.varbit_type_return varbit_type() throws RecognitionException {
		DDLParser.varbit_type_return retval = new DDLParser.varbit_type_return();
		retval.start = input.LT(1);
		int varbit_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VARBIT44=null;
		Token BIT46=null;
		Token VARYING47=null;
		ParserRuleReturnScope type_length45 =null;
		ParserRuleReturnScope type_length48 =null;

		CommonTree VARBIT44_tree=null;
		CommonTree BIT46_tree=null;
		CommonTree VARYING47_tree=null;
		RewriteRuleTokenStream stream_VARBIT=new RewriteRuleTokenStream(adaptor,"token VARBIT");
		RewriteRuleTokenStream stream_BIT=new RewriteRuleTokenStream(adaptor,"token BIT");
		RewriteRuleTokenStream stream_VARYING=new RewriteRuleTokenStream(adaptor,"token VARYING");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// DDL.g:402:3: ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VARBIT) ) {
				alt10=1;
			}
			else if ( (LA10_0==BIT) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// DDL.g:402:5: VARBIT ( type_length )?
					{
					VARBIT44=(Token)match(input,VARBIT,FOLLOW_VARBIT_in_varbit_type3422); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARBIT.add(VARBIT44);

					// DDL.g:402:12: ( type_length )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LEFT_PAREN) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// DDL.g:402:12: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbit_type3424);
							type_length45=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length45.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: VARBIT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 402:25: -> VARBIT
					{
						adaptor.addChild(root_0, stream_VARBIT.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:403:5: BIT VARYING ( type_length )?
					{
					BIT46=(Token)match(input,BIT,FOLLOW_BIT_in_varbit_type3435); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BIT.add(BIT46);

					VARYING47=(Token)match(input,VARYING,FOLLOW_VARYING_in_varbit_type3437); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING47);

					// DDL.g:403:17: ( type_length )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==LEFT_PAREN) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// DDL.g:403:17: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbit_type3439);
							type_length48=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length48.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 403:30: -> VARBIT
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(VARBIT, "VARBIT"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, varbit_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varbit_type"


	public static class int1_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "int1_type"
	// DDL.g:405:1: int1_type : ( INT1 | TINYINT -> INT1 );
	public final DDLParser.int1_type_return int1_type() throws RecognitionException {
		DDLParser.int1_type_return retval = new DDLParser.int1_type_return();
		retval.start = input.LT(1);
		int int1_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INT149=null;
		Token TINYINT50=null;

		CommonTree INT149_tree=null;
		CommonTree TINYINT50_tree=null;
		RewriteRuleTokenStream stream_TINYINT=new RewriteRuleTokenStream(adaptor,"token TINYINT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// DDL.g:406:3: ( INT1 | TINYINT -> INT1 )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INT1) ) {
				alt11=1;
			}
			else if ( (LA11_0==TINYINT) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// DDL.g:406:5: INT1
					{
					root_0 = (CommonTree)adaptor.nil();


					INT149=(Token)match(input,INT1,FOLLOW_INT1_in_int1_type3456); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT149_tree = (CommonTree)adaptor.create(INT149);
					adaptor.addChild(root_0, INT149_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:407:5: TINYINT
					{
					TINYINT50=(Token)match(input,TINYINT,FOLLOW_TINYINT_in_int1_type3462); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TINYINT.add(TINYINT50);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 407:13: -> INT1
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT1, "INT1"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, int1_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "int1_type"


	public static class int2_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "int2_type"
	// DDL.g:409:1: int2_type : ( INT2 | SMALLINT -> INT2 );
	public final DDLParser.int2_type_return int2_type() throws RecognitionException {
		DDLParser.int2_type_return retval = new DDLParser.int2_type_return();
		retval.start = input.LT(1);
		int int2_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INT251=null;
		Token SMALLINT52=null;

		CommonTree INT251_tree=null;
		CommonTree SMALLINT52_tree=null;
		RewriteRuleTokenStream stream_SMALLINT=new RewriteRuleTokenStream(adaptor,"token SMALLINT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// DDL.g:410:3: ( INT2 | SMALLINT -> INT2 )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INT2) ) {
				alt12=1;
			}
			else if ( (LA12_0==SMALLINT) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// DDL.g:410:5: INT2
					{
					root_0 = (CommonTree)adaptor.nil();


					INT251=(Token)match(input,INT2,FOLLOW_INT2_in_int2_type3478); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT251_tree = (CommonTree)adaptor.create(INT251);
					adaptor.addChild(root_0, INT251_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:411:5: SMALLINT
					{
					SMALLINT52=(Token)match(input,SMALLINT,FOLLOW_SMALLINT_in_int2_type3484); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SMALLINT.add(SMALLINT52);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 411:14: -> INT2
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT2, "INT2"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, int2_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "int2_type"


	public static class int4_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "int4_type"
	// DDL.g:413:1: int4_type : ( INT4 | INT -> INT4 | INTEGER -> INT4 );
	public final DDLParser.int4_type_return int4_type() throws RecognitionException {
		DDLParser.int4_type_return retval = new DDLParser.int4_type_return();
		retval.start = input.LT(1);
		int int4_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INT453=null;
		Token INT54=null;
		Token INTEGER55=null;

		CommonTree INT453_tree=null;
		CommonTree INT54_tree=null;
		CommonTree INTEGER55_tree=null;
		RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// DDL.g:414:3: ( INT4 | INT -> INT4 | INTEGER -> INT4 )
			int alt13=3;
			switch ( input.LA(1) ) {
			case INT4:
				{
				alt13=1;
				}
				break;
			case INT:
				{
				alt13=2;
				}
				break;
			case INTEGER:
				{
				alt13=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// DDL.g:414:5: INT4
					{
					root_0 = (CommonTree)adaptor.nil();


					INT453=(Token)match(input,INT4,FOLLOW_INT4_in_int4_type3500); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT453_tree = (CommonTree)adaptor.create(INT453);
					adaptor.addChild(root_0, INT453_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:415:5: INT
					{
					INT54=(Token)match(input,INT,FOLLOW_INT_in_int4_type3506); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT54);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 415:9: -> INT4
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT4, "INT4"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DDL.g:416:5: INTEGER
					{
					INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_int4_type3516); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTEGER.add(INTEGER55);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 416:13: -> INT4
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT4, "INT4"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, int4_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "int4_type"


	public static class int8_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "int8_type"
	// DDL.g:418:1: int8_type : ( INT8 | BIGINT -> INT8 );
	public final DDLParser.int8_type_return int8_type() throws RecognitionException {
		DDLParser.int8_type_return retval = new DDLParser.int8_type_return();
		retval.start = input.LT(1);
		int int8_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INT856=null;
		Token BIGINT57=null;

		CommonTree INT856_tree=null;
		CommonTree BIGINT57_tree=null;
		RewriteRuleTokenStream stream_BIGINT=new RewriteRuleTokenStream(adaptor,"token BIGINT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// DDL.g:419:3: ( INT8 | BIGINT -> INT8 )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==INT8) ) {
				alt14=1;
			}
			else if ( (LA14_0==BIGINT) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// DDL.g:419:5: INT8
					{
					root_0 = (CommonTree)adaptor.nil();


					INT856=(Token)match(input,INT8,FOLLOW_INT8_in_int8_type3532); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT856_tree = (CommonTree)adaptor.create(INT856);
					adaptor.addChild(root_0, INT856_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:420:5: BIGINT
					{
					BIGINT57=(Token)match(input,BIGINT,FOLLOW_BIGINT_in_int8_type3538); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BIGINT.add(BIGINT57);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 420:12: -> INT8
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT8, "INT8"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, int8_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "int8_type"


	public static class float4_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "float4_type"
	// DDL.g:422:1: float4_type : ( FLOAT4 | REAL -> FLOAT4 );
	public final DDLParser.float4_type_return float4_type() throws RecognitionException {
		DDLParser.float4_type_return retval = new DDLParser.float4_type_return();
		retval.start = input.LT(1);
		int float4_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FLOAT458=null;
		Token REAL59=null;

		CommonTree FLOAT458_tree=null;
		CommonTree REAL59_tree=null;
		RewriteRuleTokenStream stream_REAL=new RewriteRuleTokenStream(adaptor,"token REAL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// DDL.g:423:3: ( FLOAT4 | REAL -> FLOAT4 )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==FLOAT4) ) {
				alt15=1;
			}
			else if ( (LA15_0==REAL) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// DDL.g:423:5: FLOAT4
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT458=(Token)match(input,FLOAT4,FOLLOW_FLOAT4_in_float4_type3554); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT458_tree = (CommonTree)adaptor.create(FLOAT458);
					adaptor.addChild(root_0, FLOAT458_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:424:5: REAL
					{
					REAL59=(Token)match(input,REAL,FOLLOW_REAL_in_float4_type3560); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REAL.add(REAL59);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 424:10: -> FLOAT4
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT4, "FLOAT4"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, float4_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "float4_type"


	public static class float_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "float_type"
	// DDL.g:426:1: float_type : FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) ;
	public final DDLParser.float_type_return float_type() throws RecognitionException {
		DDLParser.float_type_return retval = new DDLParser.float_type_return();
		retval.start = input.LT(1);
		int float_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FLOAT60=null;
		ParserRuleReturnScope type_length61 =null;

		CommonTree FLOAT60_tree=null;
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// DDL.g:426:12: ( FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) )
			// DDL.g:426:14: FLOAT ( type_length )?
			{
			FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_float_type3574); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT60);

			// DDL.g:426:20: ( type_length )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LEFT_PAREN) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// DDL.g:426:20: type_length
					{
					pushFollow(FOLLOW_type_length_in_float_type3576);
					type_length61=type_length();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_length.add(type_length61.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: FLOAT, type_length
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 426:33: -> ^( FLOAT ( type_length )? )
			{
				// DDL.g:426:36: ^( FLOAT ( type_length )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_FLOAT.nextNode(), root_1);
				// DDL.g:426:44: ( type_length )?
				if ( stream_type_length.hasNext() ) {
					adaptor.addChild(root_1, stream_type_length.nextTree());
				}
				stream_type_length.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, float_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "float_type"


	public static class float8_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "float8_type"
	// DDL.g:427:1: float8_type : ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 );
	public final DDLParser.float8_type_return float8_type() throws RecognitionException {
		DDLParser.float8_type_return retval = new DDLParser.float8_type_return();
		retval.start = input.LT(1);
		int float8_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FLOAT862=null;
		Token DOUBLE63=null;
		Token DOUBLE64=null;
		Token PRECISION65=null;

		CommonTree FLOAT862_tree=null;
		CommonTree DOUBLE63_tree=null;
		CommonTree DOUBLE64_tree=null;
		CommonTree PRECISION65_tree=null;
		RewriteRuleTokenStream stream_DOUBLE=new RewriteRuleTokenStream(adaptor,"token DOUBLE");
		RewriteRuleTokenStream stream_PRECISION=new RewriteRuleTokenStream(adaptor,"token PRECISION");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// DDL.g:428:3: ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 )
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==FLOAT8) ) {
				alt17=1;
			}
			else if ( (LA17_0==DOUBLE) ) {
				int LA17_2 = input.LA(2);
				if ( (LA17_2==PRECISION) ) {
					alt17=3;
				}
				else if ( (LA17_2==EOF||LA17_2==COMMA||LA17_2==NOT||LA17_2==RIGHT_PAREN||LA17_2==WITH) ) {
					alt17=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// DDL.g:428:5: FLOAT8
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT862=(Token)match(input,FLOAT8,FOLLOW_FLOAT8_in_float8_type3595); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT862_tree = (CommonTree)adaptor.create(FLOAT862);
					adaptor.addChild(root_0, FLOAT862_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:429:5: DOUBLE
					{
					DOUBLE63=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_float8_type3601); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE.add(DOUBLE63);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 429:12: -> FLOAT8
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT8, "FLOAT8"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DDL.g:430:5: DOUBLE PRECISION
					{
					DOUBLE64=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_float8_type3611); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE.add(DOUBLE64);

					PRECISION65=(Token)match(input,PRECISION,FOLLOW_PRECISION_in_float8_type3613); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PRECISION.add(PRECISION65);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 430:22: -> FLOAT8
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT8, "FLOAT8"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, float8_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "float8_type"


	public static class number_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "number_type"
	// DDL.g:432:1: number_type : ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) );
	public final DDLParser.number_type_return number_type() throws RecognitionException {
		DDLParser.number_type_return retval = new DDLParser.number_type_return();
		retval.start = input.LT(1);
		int number_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NUMERIC66=null;
		Token DECIMAL68=null;
		Token DEC70=null;
		ParserRuleReturnScope precision_param67 =null;
		ParserRuleReturnScope precision_param69 =null;
		ParserRuleReturnScope precision_param71 =null;

		CommonTree NUMERIC66_tree=null;
		CommonTree DECIMAL68_tree=null;
		CommonTree DEC70_tree=null;
		RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
		RewriteRuleTokenStream stream_DECIMAL=new RewriteRuleTokenStream(adaptor,"token DECIMAL");
		RewriteRuleTokenStream stream_NUMERIC=new RewriteRuleTokenStream(adaptor,"token NUMERIC");
		RewriteRuleSubtreeStream stream_precision_param=new RewriteRuleSubtreeStream(adaptor,"rule precision_param");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// DDL.g:433:3: ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) )
			int alt21=3;
			switch ( input.LA(1) ) {
			case NUMERIC:
				{
				alt21=1;
				}
				break;
			case DECIMAL:
				{
				alt21=2;
				}
				break;
			case DEC:
				{
				alt21=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// DDL.g:433:5: NUMERIC ( precision_param )?
					{
					NUMERIC66=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_number_type3629); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMERIC.add(NUMERIC66);

					// DDL.g:433:13: ( precision_param )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==LEFT_PAREN) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// DDL.g:433:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type3632);
							precision_param67=precision_param();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_precision_param.add(precision_param67.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: precision_param, NUMERIC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 433:32: -> ^( NUMERIC precision_param )
					{
						// DDL.g:433:35: ^( NUMERIC precision_param )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_NUMERIC.nextNode(), root_1);
						adaptor.addChild(root_1, stream_precision_param.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:434:5: DECIMAL ( precision_param )?
					{
					DECIMAL68=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_number_type3648); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DECIMAL.add(DECIMAL68);

					// DDL.g:434:13: ( precision_param )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LEFT_PAREN) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// DDL.g:434:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type3651);
							precision_param69=precision_param();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_precision_param.add(precision_param69.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: precision_param
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 434:32: -> ^( NUMERIC precision_param )
					{
						// DDL.g:434:35: ^( NUMERIC precision_param )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUMERIC, "NUMERIC"), root_1);
						adaptor.addChild(root_1, stream_precision_param.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DDL.g:435:5: DEC ( precision_param )?
					{
					DEC70=(Token)match(input,DEC,FOLLOW_DEC_in_number_type3669); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEC.add(DEC70);

					// DDL.g:435:13: ( precision_param )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LEFT_PAREN) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// DDL.g:435:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type3676);
							precision_param71=precision_param();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_precision_param.add(precision_param71.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: precision_param
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 435:32: -> ^( NUMERIC precision_param )
					{
						// DDL.g:435:35: ^( NUMERIC precision_param )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUMERIC, "NUMERIC"), root_1);
						adaptor.addChild(root_1, stream_precision_param.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, number_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "number_type"


	public static class char_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "char_type"
	// DDL.g:437:1: char_type : ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR );
	public final DDLParser.char_type_return char_type() throws RecognitionException {
		DDLParser.char_type_return retval = new DDLParser.char_type_return();
		retval.start = input.LT(1);
		int char_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CHAR72=null;
		Token CHARACTER74=null;
		ParserRuleReturnScope type_length73 =null;
		ParserRuleReturnScope type_length75 =null;

		CommonTree CHAR72_tree=null;
		CommonTree CHARACTER74_tree=null;
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// DDL.g:438:3: ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==CHAR) ) {
				alt24=1;
			}
			else if ( (LA24_0==CHARACTER) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// DDL.g:438:5: CHAR ( type_length )?
					{
					CHAR72=(Token)match(input,CHAR,FOLLOW_CHAR_in_char_type3700); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHAR.add(CHAR72);

					// DDL.g:438:10: ( type_length )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==LEFT_PAREN) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// DDL.g:438:10: type_length
							{
							pushFollow(FOLLOW_type_length_in_char_type3702);
							type_length73=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length73.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: CHAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 438:23: -> CHAR
					{
						adaptor.addChild(root_0, stream_CHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:439:5: CHARACTER ( type_length )?
					{
					CHARACTER74=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_char_type3713); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER74);

					// DDL.g:439:15: ( type_length )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LEFT_PAREN) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// DDL.g:439:15: type_length
							{
							pushFollow(FOLLOW_type_length_in_char_type3715);
							type_length75=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length75.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 439:28: -> CHAR
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(CHAR, "CHAR"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, char_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "char_type"


	public static class varchar_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varchar_type"
	// DDL.g:441:1: varchar_type : ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR );
	public final DDLParser.varchar_type_return varchar_type() throws RecognitionException {
		DDLParser.varchar_type_return retval = new DDLParser.varchar_type_return();
		retval.start = input.LT(1);
		int varchar_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VARCHAR76=null;
		Token CHARACTER78=null;
		Token VARYING79=null;
		ParserRuleReturnScope type_length77 =null;
		ParserRuleReturnScope type_length80 =null;

		CommonTree VARCHAR76_tree=null;
		CommonTree CHARACTER78_tree=null;
		CommonTree VARYING79_tree=null;
		RewriteRuleTokenStream stream_VARCHAR=new RewriteRuleTokenStream(adaptor,"token VARCHAR");
		RewriteRuleTokenStream stream_VARYING=new RewriteRuleTokenStream(adaptor,"token VARYING");
		RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// DDL.g:442:3: ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==VARCHAR) ) {
				alt27=1;
			}
			else if ( (LA27_0==CHARACTER) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// DDL.g:442:5: VARCHAR ( type_length )?
					{
					VARCHAR76=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_varchar_type3732); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARCHAR.add(VARCHAR76);

					// DDL.g:442:13: ( type_length )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==LEFT_PAREN) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// DDL.g:442:13: type_length
							{
							pushFollow(FOLLOW_type_length_in_varchar_type3734);
							type_length77=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length77.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: VARCHAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 442:26: -> VARCHAR
					{
						adaptor.addChild(root_0, stream_VARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:443:5: CHARACTER VARYING ( type_length )?
					{
					CHARACTER78=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_varchar_type3745); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER78);

					VARYING79=(Token)match(input,VARYING,FOLLOW_VARYING_in_varchar_type3747); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING79);

					// DDL.g:443:23: ( type_length )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==LEFT_PAREN) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// DDL.g:443:23: type_length
							{
							pushFollow(FOLLOW_type_length_in_varchar_type3749);
							type_length80=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length80.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 443:36: -> VARCHAR
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(VARCHAR, "VARCHAR"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, varchar_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varchar_type"


	public static class nchar_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nchar_type"
	// DDL.g:445:1: nchar_type : ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR );
	public final DDLParser.nchar_type_return nchar_type() throws RecognitionException {
		DDLParser.nchar_type_return retval = new DDLParser.nchar_type_return();
		retval.start = input.LT(1);
		int nchar_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NCHAR81=null;
		Token NATIONAL83=null;
		Token CHARACTER84=null;
		ParserRuleReturnScope type_length82 =null;
		ParserRuleReturnScope type_length85 =null;

		CommonTree NCHAR81_tree=null;
		CommonTree NATIONAL83_tree=null;
		CommonTree CHARACTER84_tree=null;
		RewriteRuleTokenStream stream_NCHAR=new RewriteRuleTokenStream(adaptor,"token NCHAR");
		RewriteRuleTokenStream stream_NATIONAL=new RewriteRuleTokenStream(adaptor,"token NATIONAL");
		RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// DDL.g:446:3: ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==NCHAR) ) {
				alt30=1;
			}
			else if ( (LA30_0==NATIONAL) ) {
				alt30=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// DDL.g:446:5: NCHAR ( type_length )?
					{
					NCHAR81=(Token)match(input,NCHAR,FOLLOW_NCHAR_in_nchar_type3766); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCHAR.add(NCHAR81);

					// DDL.g:446:11: ( type_length )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LEFT_PAREN) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// DDL.g:446:11: type_length
							{
							pushFollow(FOLLOW_type_length_in_nchar_type3768);
							type_length82=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length82.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: NCHAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 446:24: -> NCHAR
					{
						adaptor.addChild(root_0, stream_NCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:447:5: NATIONAL CHARACTER ( type_length )?
					{
					NATIONAL83=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nchar_type3779); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL83);

					CHARACTER84=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nchar_type3781); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER84);

					// DDL.g:447:24: ( type_length )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==LEFT_PAREN) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// DDL.g:447:24: type_length
							{
							pushFollow(FOLLOW_type_length_in_nchar_type3783);
							type_length85=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length85.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 447:37: -> NCHAR
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(NCHAR, "NCHAR"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, nchar_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nchar_type"


	public static class nvarchar_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nvarchar_type"
	// DDL.g:449:1: nvarchar_type : ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR );
	public final DDLParser.nvarchar_type_return nvarchar_type() throws RecognitionException {
		DDLParser.nvarchar_type_return retval = new DDLParser.nvarchar_type_return();
		retval.start = input.LT(1);
		int nvarchar_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NVARCHAR86=null;
		Token NATIONAL88=null;
		Token CHARACTER89=null;
		Token VARYING90=null;
		ParserRuleReturnScope type_length87 =null;
		ParserRuleReturnScope type_length91 =null;

		CommonTree NVARCHAR86_tree=null;
		CommonTree NATIONAL88_tree=null;
		CommonTree CHARACTER89_tree=null;
		CommonTree VARYING90_tree=null;
		RewriteRuleTokenStream stream_NVARCHAR=new RewriteRuleTokenStream(adaptor,"token NVARCHAR");
		RewriteRuleTokenStream stream_VARYING=new RewriteRuleTokenStream(adaptor,"token VARYING");
		RewriteRuleTokenStream stream_NATIONAL=new RewriteRuleTokenStream(adaptor,"token NATIONAL");
		RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
		RewriteRuleSubtreeStream stream_type_length=new RewriteRuleSubtreeStream(adaptor,"rule type_length");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// DDL.g:450:3: ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==NVARCHAR) ) {
				alt33=1;
			}
			else if ( (LA33_0==NATIONAL) ) {
				alt33=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// DDL.g:450:5: NVARCHAR ( type_length )?
					{
					NVARCHAR86=(Token)match(input,NVARCHAR,FOLLOW_NVARCHAR_in_nvarchar_type3800); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NVARCHAR.add(NVARCHAR86);

					// DDL.g:450:14: ( type_length )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==LEFT_PAREN) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// DDL.g:450:14: type_length
							{
							pushFollow(FOLLOW_type_length_in_nvarchar_type3802);
							type_length87=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length87.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: NVARCHAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 450:27: -> NVARCHAR
					{
						adaptor.addChild(root_0, stream_NVARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:451:5: NATIONAL CHARACTER VARYING ( type_length )?
					{
					NATIONAL88=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nvarchar_type3813); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL88);

					CHARACTER89=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nvarchar_type3815); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER89);

					VARYING90=(Token)match(input,VARYING,FOLLOW_VARYING_in_nvarchar_type3817); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING90);

					// DDL.g:451:32: ( type_length )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==LEFT_PAREN) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// DDL.g:451:32: type_length
							{
							pushFollow(FOLLOW_type_length_in_nvarchar_type3819);
							type_length91=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_length.add(type_length91.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 451:45: -> NVARCHAR
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(NVARCHAR, "NVARCHAR"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, nvarchar_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nvarchar_type"


	public static class timetz_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "timetz_type"
	// DDL.g:453:1: timetz_type : ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ );
	public final DDLParser.timetz_type_return timetz_type() throws RecognitionException {
		DDLParser.timetz_type_return retval = new DDLParser.timetz_type_return();
		retval.start = input.LT(1);
		int timetz_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TIMETZ92=null;
		Token TIME93=null;
		Token WITH94=null;
		Token TIME95=null;
		Token ZONE96=null;

		CommonTree TIMETZ92_tree=null;
		CommonTree TIME93_tree=null;
		CommonTree WITH94_tree=null;
		CommonTree TIME95_tree=null;
		CommonTree ZONE96_tree=null;
		RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
		RewriteRuleTokenStream stream_ZONE=new RewriteRuleTokenStream(adaptor,"token ZONE");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// DDL.g:454:3: ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==TIMETZ) ) {
				alt34=1;
			}
			else if ( (LA34_0==TIME) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// DDL.g:454:5: TIMETZ
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMETZ92=(Token)match(input,TIMETZ,FOLLOW_TIMETZ_in_timetz_type3836); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMETZ92_tree = (CommonTree)adaptor.create(TIMETZ92);
					adaptor.addChild(root_0, TIMETZ92_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:455:5: TIME WITH TIME ZONE
					{
					TIME93=(Token)match(input,TIME,FOLLOW_TIME_in_timetz_type3842); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME93);

					WITH94=(Token)match(input,WITH,FOLLOW_WITH_in_timetz_type3844); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH94);

					TIME95=(Token)match(input,TIME,FOLLOW_TIME_in_timetz_type3846); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME95);

					ZONE96=(Token)match(input,ZONE,FOLLOW_ZONE_in_timetz_type3848); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ZONE.add(ZONE96);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 455:25: -> TIMETZ
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TIMETZ, "TIMETZ"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, timetz_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "timetz_type"


	public static class timestamptz_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "timestamptz_type"
	// DDL.g:457:1: timestamptz_type : ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ );
	public final DDLParser.timestamptz_type_return timestamptz_type() throws RecognitionException {
		DDLParser.timestamptz_type_return retval = new DDLParser.timestamptz_type_return();
		retval.start = input.LT(1);
		int timestamptz_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TIMESTAMPTZ97=null;
		Token TIMESTAMP98=null;
		Token WITH99=null;
		Token TIME100=null;
		Token ZONE101=null;

		CommonTree TIMESTAMPTZ97_tree=null;
		CommonTree TIMESTAMP98_tree=null;
		CommonTree WITH99_tree=null;
		CommonTree TIME100_tree=null;
		CommonTree ZONE101_tree=null;
		RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
		RewriteRuleTokenStream stream_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token TIMESTAMP");
		RewriteRuleTokenStream stream_ZONE=new RewriteRuleTokenStream(adaptor,"token ZONE");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// DDL.g:458:3: ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==TIMESTAMPTZ) ) {
				alt35=1;
			}
			else if ( (LA35_0==TIMESTAMP) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// DDL.g:458:5: TIMESTAMPTZ
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMESTAMPTZ97=(Token)match(input,TIMESTAMPTZ,FOLLOW_TIMESTAMPTZ_in_timestamptz_type3864); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMESTAMPTZ97_tree = (CommonTree)adaptor.create(TIMESTAMPTZ97);
					adaptor.addChild(root_0, TIMESTAMPTZ97_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:459:5: TIMESTAMP WITH TIME ZONE
					{
					TIMESTAMP98=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamptz_type3870); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMESTAMP.add(TIMESTAMP98);

					WITH99=(Token)match(input,WITH,FOLLOW_WITH_in_timestamptz_type3872); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH99);

					TIME100=(Token)match(input,TIME,FOLLOW_TIME_in_timestamptz_type3874); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME100);

					ZONE101=(Token)match(input,ZONE,FOLLOW_ZONE_in_timestamptz_type3876); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ZONE.add(ZONE101);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 459:30: -> TIMESTAMPTZ
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TIMESTAMPTZ, "TIMESTAMPTZ"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, timestamptz_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "timestamptz_type"


	public static class binary_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binary_type"
	// DDL.g:461:1: binary_type : BINARY ( type_length )? ;
	public final DDLParser.binary_type_return binary_type() throws RecognitionException {
		DDLParser.binary_type_return retval = new DDLParser.binary_type_return();
		retval.start = input.LT(1);
		int binary_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BINARY102=null;
		ParserRuleReturnScope type_length103 =null;

		CommonTree BINARY102_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// DDL.g:462:3: ( BINARY ( type_length )? )
			// DDL.g:462:5: BINARY ( type_length )?
			{
			root_0 = (CommonTree)adaptor.nil();


			BINARY102=(Token)match(input,BINARY,FOLLOW_BINARY_in_binary_type3892); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BINARY102_tree = (CommonTree)adaptor.create(BINARY102);
			adaptor.addChild(root_0, BINARY102_tree);
			}

			// DDL.g:462:12: ( type_length )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==LEFT_PAREN) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// DDL.g:462:12: type_length
					{
					pushFollow(FOLLOW_type_length_in_binary_type3894);
					type_length103=type_length();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_length103.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, binary_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "binary_type"


	public static class varbinary_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varbinary_type"
	// DDL.g:464:1: varbinary_type : ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? );
	public final DDLParser.varbinary_type_return varbinary_type() throws RecognitionException {
		DDLParser.varbinary_type_return retval = new DDLParser.varbinary_type_return();
		retval.start = input.LT(1);
		int varbinary_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VARBINARY104=null;
		Token BINARY106=null;
		Token VARYING107=null;
		ParserRuleReturnScope type_length105 =null;
		ParserRuleReturnScope type_length108 =null;

		CommonTree VARBINARY104_tree=null;
		CommonTree BINARY106_tree=null;
		CommonTree VARYING107_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// DDL.g:465:3: ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==VARBINARY) ) {
				alt39=1;
			}
			else if ( (LA39_0==BINARY) ) {
				alt39=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// DDL.g:465:5: VARBINARY ( type_length )?
					{
					root_0 = (CommonTree)adaptor.nil();


					VARBINARY104=(Token)match(input,VARBINARY,FOLLOW_VARBINARY_in_varbinary_type3907); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARBINARY104_tree = (CommonTree)adaptor.create(VARBINARY104);
					adaptor.addChild(root_0, VARBINARY104_tree);
					}

					// DDL.g:465:15: ( type_length )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==LEFT_PAREN) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// DDL.g:465:15: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbinary_type3909);
							type_length105=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type_length105.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// DDL.g:466:5: BINARY VARYING ( type_length )?
					{
					root_0 = (CommonTree)adaptor.nil();


					BINARY106=(Token)match(input,BINARY,FOLLOW_BINARY_in_varbinary_type3916); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BINARY106_tree = (CommonTree)adaptor.create(BINARY106);
					adaptor.addChild(root_0, BINARY106_tree);
					}

					VARYING107=(Token)match(input,VARYING,FOLLOW_VARYING_in_varbinary_type3918); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARYING107_tree = (CommonTree)adaptor.create(VARYING107);
					adaptor.addChild(root_0, VARYING107_tree);
					}

					// DDL.g:466:20: ( type_length )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==LEFT_PAREN) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// DDL.g:466:20: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbinary_type3920);
							type_length108=type_length();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type_length108.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, varbinary_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varbinary_type"


	public static class blob_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "blob_type"
	// DDL.g:468:1: blob_type : ( BLOB | BYTEA -> BLOB );
	public final DDLParser.blob_type_return blob_type() throws RecognitionException {
		DDLParser.blob_type_return retval = new DDLParser.blob_type_return();
		retval.start = input.LT(1);
		int blob_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BLOB109=null;
		Token BYTEA110=null;

		CommonTree BLOB109_tree=null;
		CommonTree BYTEA110_tree=null;
		RewriteRuleTokenStream stream_BYTEA=new RewriteRuleTokenStream(adaptor,"token BYTEA");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// DDL.g:469:3: ( BLOB | BYTEA -> BLOB )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==BLOB) ) {
				alt40=1;
			}
			else if ( (LA40_0==BYTEA) ) {
				alt40=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// DDL.g:469:5: BLOB
					{
					root_0 = (CommonTree)adaptor.nil();


					BLOB109=(Token)match(input,BLOB,FOLLOW_BLOB_in_blob_type3933); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BLOB109_tree = (CommonTree)adaptor.create(BLOB109);
					adaptor.addChild(root_0, BLOB109_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:470:5: BYTEA
					{
					BYTEA110=(Token)match(input,BYTEA,FOLLOW_BYTEA_in_blob_type3939); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BYTEA.add(BYTEA110);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 470:11: -> BLOB
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(BLOB, "BLOB"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, blob_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "blob_type"


	public static class sql_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sql"
	// DDL.g:477:1: sql : statement EOF ;
	public final DDLParser.sql_return sql() throws RecognitionException {
		DDLParser.sql_return retval = new DDLParser.sql_return();
		retval.start = input.LT(1);
		int sql_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EOF112=null;
		ParserRuleReturnScope statement111 =null;

		CommonTree EOF112_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// DDL.g:478:3: ( statement EOF )
			// DDL.g:478:5: statement EOF
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_statement_in_sql3957);
			statement111=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement111.getTree());

			EOF112=(Token)match(input,EOF,FOLLOW_EOF_in_sql3959); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EOF112_tree = (CommonTree)adaptor.create(EOF112);
			adaptor.addChild(root_0, EOF112_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, sql_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sql"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// DDL.g:480:1: statement : (| schema_statement | index_statement | transaction_statement | control_statement | connection_statement );
	public final DDLParser.statement_return statement() throws RecognitionException {
		DDLParser.statement_return retval = new DDLParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope schema_statement113 =null;
		ParserRuleReturnScope index_statement114 =null;
		ParserRuleReturnScope transaction_statement115 =null;
		ParserRuleReturnScope control_statement116 =null;
		ParserRuleReturnScope connection_statement117 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// DDL.g:481:3: (| schema_statement | index_statement | transaction_statement | control_statement | connection_statement )
			int alt41=6;
			switch ( input.LA(1) ) {
			case EOF:
				{
				alt41=1;
				}
				break;
			case CREATE:
				{
				int LA41_2 = input.LA(2);
				if ( (LA41_2==ALIAS||LA41_2==EXTERNAL||LA41_2==OR||LA41_2==TABLE||LA41_2==VIEW) ) {
					alt41=2;
				}
				else if ( (LA41_2==INDEX||LA41_2==UNIQUE) ) {
					alt41=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DROP:
				{
				int LA41_3 = input.LA(2);
				if ( (LA41_3==ALIAS||LA41_3==TABLE||LA41_3==VIEW) ) {
					alt41=2;
				}
				else if ( (LA41_3==INDEX) ) {
					alt41=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RENAME:
				{
				int LA41_4 = input.LA(2);
				if ( (LA41_4==TABLE) ) {
					alt41=2;
				}
				else if ( (LA41_4==INDEX) ) {
					alt41=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COMMIT:
			case LOCK:
			case RELEASE:
			case ROLLBACK:
				{
				alt41=4;
				}
				break;
			case SET:
				{
				int LA41_6 = input.LA(2);
				if ( (LA41_6==TRANSACTION) ) {
					alt41=4;
				}
				else if ( (LA41_6==CONNECTION) ) {
					alt41=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CALL:
				{
				alt41=5;
				}
				break;
			case CONNECT:
			case DISCONNECT:
				{
				alt41=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// DDL.g:482:3: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;
				case 2 :
					// DDL.g:482:5: schema_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_schema_statement_in_statement3976);
					schema_statement113=schema_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, schema_statement113.getTree());

					}
					break;
				case 3 :
					// DDL.g:483:5: index_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_index_statement_in_statement3982);
					index_statement114=index_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, index_statement114.getTree());

					}
					break;
				case 4 :
					// DDL.g:484:5: transaction_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_transaction_statement_in_statement3988);
					transaction_statement115=transaction_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, transaction_statement115.getTree());

					}
					break;
				case 5 :
					// DDL.g:485:5: control_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_control_statement_in_statement3994);
					control_statement116=control_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, control_statement116.getTree());

					}
					break;
				case 6 :
					// DDL.g:486:5: connection_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_connection_statement_in_statement4000);
					connection_statement117=connection_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, connection_statement117.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class schema_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "schema_statement"
	// DDL.g:502:1: schema_statement : ( create_table_statement | create_view_statement | create_alias_statement | drop_alias_statement | drop_table_statement | drop_view_statement | rename_table_statement );
	public final DDLParser.schema_statement_return schema_statement() throws RecognitionException {
		DDLParser.schema_statement_return retval = new DDLParser.schema_statement_return();
		retval.start = input.LT(1);
		int schema_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope create_table_statement118 =null;
		ParserRuleReturnScope create_view_statement119 =null;
		ParserRuleReturnScope create_alias_statement120 =null;
		ParserRuleReturnScope drop_alias_statement121 =null;
		ParserRuleReturnScope drop_table_statement122 =null;
		ParserRuleReturnScope drop_view_statement123 =null;
		ParserRuleReturnScope rename_table_statement124 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// DDL.g:503:3: ( create_table_statement | create_view_statement | create_alias_statement | drop_alias_statement | drop_table_statement | drop_view_statement | rename_table_statement )
			int alt42=7;
			switch ( input.LA(1) ) {
			case CREATE:
				{
				switch ( input.LA(2) ) {
				case EXTERNAL:
				case TABLE:
					{
					alt42=1;
					}
					break;
				case VIEW:
					{
					alt42=2;
					}
					break;
				case ALIAS:
				case OR:
					{
					alt42=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case DROP:
				{
				switch ( input.LA(2) ) {
				case ALIAS:
					{
					alt42=4;
					}
					break;
				case TABLE:
					{
					alt42=5;
					}
					break;
				case VIEW:
					{
					alt42=6;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RENAME:
				{
				alt42=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// DDL.g:503:5: create_table_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_create_table_statement_in_schema_statement4025);
					create_table_statement118=create_table_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, create_table_statement118.getTree());

					}
					break;
				case 2 :
					// DDL.g:504:5: create_view_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_create_view_statement_in_schema_statement4031);
					create_view_statement119=create_view_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, create_view_statement119.getTree());

					}
					break;
				case 3 :
					// DDL.g:505:5: create_alias_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_create_alias_statement_in_schema_statement4037);
					create_alias_statement120=create_alias_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, create_alias_statement120.getTree());

					}
					break;
				case 4 :
					// DDL.g:506:5: drop_alias_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_drop_alias_statement_in_schema_statement4043);
					drop_alias_statement121=drop_alias_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_alias_statement121.getTree());

					}
					break;
				case 5 :
					// DDL.g:507:5: drop_table_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_drop_table_statement_in_schema_statement4049);
					drop_table_statement122=drop_table_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_table_statement122.getTree());

					}
					break;
				case 6 :
					// DDL.g:508:5: drop_view_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_drop_view_statement_in_schema_statement4055);
					drop_view_statement123=drop_view_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_view_statement123.getTree());

					}
					break;
				case 7 :
					// DDL.g:509:5: rename_table_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rename_table_statement_in_schema_statement4062);
					rename_table_statement124=rename_table_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rename_table_statement124.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, schema_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "schema_statement"


	public static class index_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "index_statement"
	// DDL.g:512:1: index_statement : ( create_index_statement | drop_index_statement | rename_index_statement );
	public final DDLParser.index_statement_return index_statement() throws RecognitionException {
		DDLParser.index_statement_return retval = new DDLParser.index_statement_return();
		retval.start = input.LT(1);
		int index_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope create_index_statement125 =null;
		ParserRuleReturnScope drop_index_statement126 =null;
		ParserRuleReturnScope rename_index_statement127 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// DDL.g:513:3: ( create_index_statement | drop_index_statement | rename_index_statement )
			int alt43=3;
			switch ( input.LA(1) ) {
			case CREATE:
				{
				alt43=1;
				}
				break;
			case DROP:
				{
				alt43=2;
				}
				break;
			case RENAME:
				{
				alt43=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// DDL.g:514:3: create_index_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_create_index_statement_in_index_statement4080);
					create_index_statement125=create_index_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, create_index_statement125.getTree());

					}
					break;
				case 2 :
					// DDL.g:516:3: drop_index_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_drop_index_statement_in_index_statement4088);
					drop_index_statement126=drop_index_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_index_statement126.getTree());

					}
					break;
				case 3 :
					// DDL.g:518:3: rename_index_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rename_index_statement_in_index_statement4098);
					rename_index_statement127=rename_index_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rename_index_statement127.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, index_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "index_statement"


	public static class transaction_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "transaction_statement"
	// DDL.g:521:1: transaction_statement : ( commit_statement | lock_statement | release_statement | rollback_statement | set_transaction_statement );
	public final DDLParser.transaction_statement_return transaction_statement() throws RecognitionException {
		DDLParser.transaction_statement_return retval = new DDLParser.transaction_statement_return();
		retval.start = input.LT(1);
		int transaction_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope commit_statement128 =null;
		ParserRuleReturnScope lock_statement129 =null;
		ParserRuleReturnScope release_statement130 =null;
		ParserRuleReturnScope rollback_statement131 =null;
		ParserRuleReturnScope set_transaction_statement132 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// DDL.g:522:2: ( commit_statement | lock_statement | release_statement | rollback_statement | set_transaction_statement )
			int alt44=5;
			switch ( input.LA(1) ) {
			case COMMIT:
				{
				alt44=1;
				}
				break;
			case LOCK:
				{
				alt44=2;
				}
				break;
			case RELEASE:
				{
				alt44=3;
				}
				break;
			case ROLLBACK:
				{
				alt44=4;
				}
				break;
			case SET:
				{
				alt44=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// DDL.g:523:2: commit_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_commit_statement_in_transaction_statement4113);
					commit_statement128=commit_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commit_statement128.getTree());

					}
					break;
				case 2 :
					// DDL.g:525:2: lock_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_lock_statement_in_transaction_statement4122);
					lock_statement129=lock_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lock_statement129.getTree());

					}
					break;
				case 3 :
					// DDL.g:527:2: release_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_release_statement_in_transaction_statement4128);
					release_statement130=release_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, release_statement130.getTree());

					}
					break;
				case 4 :
					// DDL.g:529:2: rollback_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rollback_statement_in_transaction_statement4134);
					rollback_statement131=rollback_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rollback_statement131.getTree());

					}
					break;
				case 5 :
					// DDL.g:531:2: set_transaction_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_transaction_statement_in_transaction_statement4141);
					set_transaction_statement132=set_transaction_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_transaction_statement132.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, transaction_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "transaction_statement"


	public static class connection_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "connection_statement"
	// DDL.g:534:1: connection_statement : ( connect_statement | disconnect_statement | set_connection_statement );
	public final DDLParser.connection_statement_return connection_statement() throws RecognitionException {
		DDLParser.connection_statement_return retval = new DDLParser.connection_statement_return();
		retval.start = input.LT(1);
		int connection_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope connect_statement133 =null;
		ParserRuleReturnScope disconnect_statement134 =null;
		ParserRuleReturnScope set_connection_statement135 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// DDL.g:535:2: ( connect_statement | disconnect_statement | set_connection_statement )
			int alt45=3;
			switch ( input.LA(1) ) {
			case CONNECT:
				{
				alt45=1;
				}
				break;
			case DISCONNECT:
				{
				alt45=2;
				}
				break;
			case SET:
				{
				alt45=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// DDL.g:536:2: connect_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_connect_statement_in_connection_statement4153);
					connect_statement133=connect_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, connect_statement133.getTree());

					}
					break;
				case 2 :
					// DDL.g:538:2: disconnect_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_disconnect_statement_in_connection_statement4159);
					disconnect_statement134=disconnect_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, disconnect_statement134.getTree());

					}
					break;
				case 3 :
					// DDL.g:540:2: set_connection_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_connection_statement_in_connection_statement4165);
					set_connection_statement135=set_connection_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_connection_statement135.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, connection_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "connection_statement"


	public static class control_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "control_statement"
	// DDL.g:543:1: control_statement : call_procedure ;
	public final DDLParser.control_statement_return control_statement() throws RecognitionException {
		DDLParser.control_statement_return retval = new DDLParser.control_statement_return();
		retval.start = input.LT(1);
		int control_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope call_procedure136 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// DDL.g:544:2: ( call_procedure )
			// DDL.g:545:2: call_procedure
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_call_procedure_in_control_statement4178);
			call_procedure136=call_procedure();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, call_procedure136.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, control_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "control_statement"


	public static class create_index_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "create_index_statement"
	// DDL.g:549:1: create_index_statement : CREATE (u= UNIQUE )? INDEX n= qualified_identifier ON t= table (m= method_specifier )? LEFT_PAREN s= sort_specifier_list RIGHT_PAREN (p= param_clause )? -> ^( CREATE_INDEX_STATEMENT ( $u)? ( ^( INDEX_NAME $n) )? ^( ON $t) ( $p)? $s) ;
	public final DDLParser.create_index_statement_return create_index_statement() throws RecognitionException {
		DDLParser.create_index_statement_return retval = new DDLParser.create_index_statement_return();
		retval.start = input.LT(1);
		int create_index_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token u=null;
		Token CREATE137=null;
		Token INDEX138=null;
		Token ON139=null;
		Token LEFT_PAREN140=null;
		Token RIGHT_PAREN141=null;
		ParserRuleReturnScope n =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope m =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope p =null;

		CommonTree u_tree=null;
		CommonTree CREATE137_tree=null;
		CommonTree INDEX138_tree=null;
		CommonTree ON139_tree=null;
		CommonTree LEFT_PAREN140_tree=null;
		CommonTree RIGHT_PAREN141_tree=null;
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
		RewriteRuleSubtreeStream stream_qualified_identifier=new RewriteRuleSubtreeStream(adaptor,"rule qualified_identifier");
		RewriteRuleSubtreeStream stream_method_specifier=new RewriteRuleSubtreeStream(adaptor,"rule method_specifier");
		RewriteRuleSubtreeStream stream_sort_specifier_list=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier_list");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
		RewriteRuleSubtreeStream stream_param_clause=new RewriteRuleSubtreeStream(adaptor,"rule param_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// DDL.g:550:2: ( CREATE (u= UNIQUE )? INDEX n= qualified_identifier ON t= table (m= method_specifier )? LEFT_PAREN s= sort_specifier_list RIGHT_PAREN (p= param_clause )? -> ^( CREATE_INDEX_STATEMENT ( $u)? ( ^( INDEX_NAME $n) )? ^( ON $t) ( $p)? $s) )
			// DDL.g:551:2: CREATE (u= UNIQUE )? INDEX n= qualified_identifier ON t= table (m= method_specifier )? LEFT_PAREN s= sort_specifier_list RIGHT_PAREN (p= param_clause )?
			{
			CREATE137=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_statement4197); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CREATE.add(CREATE137);

			// DDL.g:551:9: (u= UNIQUE )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==UNIQUE) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// DDL.g:551:10: u= UNIQUE
					{
					u=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_statement4202); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UNIQUE.add(u);

					}
					break;

			}

			INDEX138=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_statement4206); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INDEX.add(INDEX138);

			pushFollow(FOLLOW_qualified_identifier_in_create_index_statement4210);
			n=qualified_identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_qualified_identifier.add(n.getTree());
			ON139=(Token)match(input,ON,FOLLOW_ON_in_create_index_statement4212); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ON.add(ON139);

			pushFollow(FOLLOW_table_in_create_index_statement4216);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			// DDL.g:551:61: (m= method_specifier )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==USING) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// DDL.g:551:62: m= method_specifier
					{
					pushFollow(FOLLOW_method_specifier_in_create_index_statement4221);
					m=method_specifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_method_specifier.add(m.getTree());
					}
					break;

			}

			LEFT_PAREN140=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_create_index_statement4229); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN140);

			pushFollow(FOLLOW_sort_specifier_list_in_create_index_statement4233);
			s=sort_specifier_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier_list.add(s.getTree());
			RIGHT_PAREN141=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_create_index_statement4235); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN141);

			// DDL.g:552:51: (p= param_clause )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==WITH) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// DDL.g:552:51: p= param_clause
					{
					pushFollow(FOLLOW_param_clause_in_create_index_statement4239);
					p=param_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_param_clause.add(p.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: t, ON, p, u, s, n
			// token labels: u
			// rule labels: retval, t, s, p, n
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_u=new RewriteRuleTokenStream(adaptor,"token u",u);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
			RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.getTree():null);
			RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n",n!=null?n.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 553:5: -> ^( CREATE_INDEX_STATEMENT ( $u)? ( ^( INDEX_NAME $n) )? ^( ON $t) ( $p)? $s)
			{
				// DDL.g:553:8: ^( CREATE_INDEX_STATEMENT ( $u)? ( ^( INDEX_NAME $n) )? ^( ON $t) ( $p)? $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_INDEX_STATEMENT, "CREATE_INDEX_STATEMENT"), root_1);
				// DDL.g:553:34: ( $u)?
				if ( stream_u.hasNext() ) {
					adaptor.addChild(root_1, stream_u.nextNode());
				}
				stream_u.reset();

				// DDL.g:553:37: ( ^( INDEX_NAME $n) )?
				if ( stream_n.hasNext() ) {
					// DDL.g:553:37: ^( INDEX_NAME $n)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX_NAME, "INDEX_NAME"), root_2);
					adaptor.addChild(root_2, stream_n.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_n.reset();

				// DDL.g:553:55: ^( ON $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_ON.nextNode(), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:553:65: ( $p)?
				if ( stream_p.hasNext() ) {
					adaptor.addChild(root_1, stream_p.nextTree());
				}
				stream_p.reset();

				adaptor.addChild(root_1, stream_s.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, create_index_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "create_index_statement"


	public static class drop_index_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "drop_index_statement"
	// DDL.g:556:1: drop_index_statement : DROP INDEX i= table -> ^( DROP_INDEX_STATEMENT ^( INDEX_NAME $i) ) ;
	public final DDLParser.drop_index_statement_return drop_index_statement() throws RecognitionException {
		DDLParser.drop_index_statement_return retval = new DDLParser.drop_index_statement_return();
		retval.start = input.LT(1);
		int drop_index_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DROP142=null;
		Token INDEX143=null;
		ParserRuleReturnScope i =null;

		CommonTree DROP142_tree=null;
		CommonTree INDEX143_tree=null;
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// DDL.g:557:2: ( DROP INDEX i= table -> ^( DROP_INDEX_STATEMENT ^( INDEX_NAME $i) ) )
			// DDL.g:558:2: DROP INDEX i= table
			{
			DROP142=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_statement4292); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DROP.add(DROP142);

			INDEX143=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_statement4294); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INDEX.add(INDEX143);

			pushFollow(FOLLOW_table_in_drop_index_statement4298);
			i=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(i.getTree());
			// AST REWRITE
			// elements: i
			// token labels: 
			// rule labels: retval, i
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 558:21: -> ^( DROP_INDEX_STATEMENT ^( INDEX_NAME $i) )
			{
				// DDL.g:558:24: ^( DROP_INDEX_STATEMENT ^( INDEX_NAME $i) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_INDEX_STATEMENT, "DROP_INDEX_STATEMENT"), root_1);
				// DDL.g:558:47: ^( INDEX_NAME $i)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX_NAME, "INDEX_NAME"), root_2);
				adaptor.addChild(root_2, stream_i.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, drop_index_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "drop_index_statement"


	public static class create_table_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "create_table_statement"
	// DDL.g:562:1: create_table_statement : ( CREATE EXTERNAL TABLE t= table def= table_elements USING f= Identifier (p= param_clause )? ( LOCATION path= Character_String_Literal ) -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) EXTERNAL ^( TABLE_DEF $def) ^( USING $f) ( $p)? ^( LOCATION $path) ) | CREATE TABLE t= table (def= table_elements )? ( USING s= Identifier )? (p= param_clause )? ( AS q= query_expression )? -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) ( ^( TABLE_DEF $def) )? ( ^( USING $s) )? ( $p)? ( ^( AS $q) )? ) );
	public final DDLParser.create_table_statement_return create_table_statement() throws RecognitionException {
		DDLParser.create_table_statement_return retval = new DDLParser.create_table_statement_return();
		retval.start = input.LT(1);
		int create_table_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token f=null;
		Token path=null;
		Token s=null;
		Token CREATE144=null;
		Token EXTERNAL145=null;
		Token TABLE146=null;
		Token USING147=null;
		Token LOCATION148=null;
		Token CREATE149=null;
		Token TABLE150=null;
		Token USING151=null;
		Token AS152=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope def =null;
		ParserRuleReturnScope p =null;
		ParserRuleReturnScope q =null;

		CommonTree f_tree=null;
		CommonTree path_tree=null;
		CommonTree s_tree=null;
		CommonTree CREATE144_tree=null;
		CommonTree EXTERNAL145_tree=null;
		CommonTree TABLE146_tree=null;
		CommonTree USING147_tree=null;
		CommonTree LOCATION148_tree=null;
		CommonTree CREATE149_tree=null;
		CommonTree TABLE150_tree=null;
		CommonTree USING151_tree=null;
		CommonTree AS152_tree=null;
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
		RewriteRuleTokenStream stream_LOCATION=new RewriteRuleTokenStream(adaptor,"token LOCATION");
		RewriteRuleTokenStream stream_EXTERNAL=new RewriteRuleTokenStream(adaptor,"token EXTERNAL");
		RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_query_expression=new RewriteRuleSubtreeStream(adaptor,"rule query_expression");
		RewriteRuleSubtreeStream stream_table_elements=new RewriteRuleSubtreeStream(adaptor,"rule table_elements");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
		RewriteRuleSubtreeStream stream_param_clause=new RewriteRuleSubtreeStream(adaptor,"rule param_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// DDL.g:563:3: ( CREATE EXTERNAL TABLE t= table def= table_elements USING f= Identifier (p= param_clause )? ( LOCATION path= Character_String_Literal ) -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) EXTERNAL ^( TABLE_DEF $def) ^( USING $f) ( $p)? ^( LOCATION $path) ) | CREATE TABLE t= table (def= table_elements )? ( USING s= Identifier )? (p= param_clause )? ( AS q= query_expression )? -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) ( ^( TABLE_DEF $def) )? ( ^( USING $s) )? ( $p)? ( ^( AS $q) )? ) )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==CREATE) ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1==EXTERNAL) ) {
					alt54=1;
				}
				else if ( (LA54_1==TABLE) ) {
					alt54=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// DDL.g:563:5: CREATE EXTERNAL TABLE t= table def= table_elements USING f= Identifier (p= param_clause )? ( LOCATION path= Character_String_Literal )
					{
					CREATE144=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_statement4327); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CREATE.add(CREATE144);

					EXTERNAL145=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_create_table_statement4329); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EXTERNAL.add(EXTERNAL145);

					TABLE146=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_statement4331); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE146);

					pushFollow(FOLLOW_table_in_create_table_statement4335);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					pushFollow(FOLLOW_table_elements_in_create_table_statement4339);
					def=table_elements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table_elements.add(def.getTree());
					USING147=(Token)match(input,USING,FOLLOW_USING_in_create_table_statement4341); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING147);

					f=(Token)match(input,Identifier,FOLLOW_Identifier_in_create_table_statement4345); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(f);

					// DDL.g:564:6: (p= param_clause )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==WITH) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// DDL.g:564:6: p= param_clause
							{
							pushFollow(FOLLOW_param_clause_in_create_table_statement4353);
							p=param_clause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_param_clause.add(p.getTree());
							}
							break;

					}

					// DDL.g:564:21: ( LOCATION path= Character_String_Literal )
					// DDL.g:564:22: LOCATION path= Character_String_Literal
					{
					LOCATION148=(Token)match(input,LOCATION,FOLLOW_LOCATION_in_create_table_statement4357); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOCATION.add(LOCATION148);

					path=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_create_table_statement4361); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Character_String_Literal.add(path);

					}

					// AST REWRITE
					// elements: EXTERNAL, f, path, def, t, USING, p, LOCATION
					// token labels: f, path
					// rule labels: retval, t, def, p
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
					RewriteRuleTokenStream stream_path=new RewriteRuleTokenStream(adaptor,"token path",path);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_def=new RewriteRuleSubtreeStream(adaptor,"rule def",def!=null?def.getTree():null);
					RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 565:7: -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) EXTERNAL ^( TABLE_DEF $def) ^( USING $f) ( $p)? ^( LOCATION $path) )
					{
						// DDL.g:565:10: ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) EXTERNAL ^( TABLE_DEF $def) ^( USING $f) ( $p)? ^( LOCATION $path) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_TABLE_STATEMENT, "CREATE_TABLE_STATEMENT"), root_1);
						// DDL.g:565:35: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_EXTERNAL.nextNode());
						// DDL.g:565:61: ^( TABLE_DEF $def)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_DEF, "TABLE_DEF"), root_2);
						adaptor.addChild(root_2, stream_def.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// DDL.g:565:79: ^( USING $f)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
						adaptor.addChild(root_2, stream_f.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						// DDL.g:565:92: ( $p)?
						if ( stream_p.hasNext() ) {
							adaptor.addChild(root_1, stream_p.nextTree());
						}
						stream_p.reset();

						// DDL.g:566:10: ^( LOCATION $path)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_LOCATION.nextNode(), root_2);
						adaptor.addChild(root_2, stream_path.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:567:5: CREATE TABLE t= table (def= table_elements )? ( USING s= Identifier )? (p= param_clause )? ( AS q= query_expression )?
					{
					CREATE149=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_statement4423); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CREATE.add(CREATE149);

					TABLE150=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_statement4425); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE150);

					pushFollow(FOLLOW_table_in_create_table_statement4429);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					// DDL.g:567:26: (def= table_elements )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==LEFT_PAREN) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// DDL.g:567:27: def= table_elements
							{
							pushFollow(FOLLOW_table_elements_in_create_table_statement4434);
							def=table_elements();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_table_elements.add(def.getTree());
							}
							break;

					}

					// DDL.g:567:48: ( USING s= Identifier )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==USING) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// DDL.g:567:49: USING s= Identifier
							{
							USING151=(Token)match(input,USING,FOLLOW_USING_in_create_table_statement4439); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_USING.add(USING151);

							s=(Token)match(input,Identifier,FOLLOW_Identifier_in_create_table_statement4443); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(s);

							}
							break;

					}

					// DDL.g:568:5: (p= param_clause )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==WITH) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// DDL.g:568:6: p= param_clause
							{
							pushFollow(FOLLOW_param_clause_in_create_table_statement4454);
							p=param_clause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_param_clause.add(p.getTree());
							}
							break;

					}

					// DDL.g:568:23: ( AS q= query_expression )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==AS) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// DDL.g:568:24: AS q= query_expression
							{
							AS152=(Token)match(input,AS,FOLLOW_AS_in_create_table_statement4459); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AS.add(AS152);

							pushFollow(FOLLOW_query_expression_in_create_table_statement4463);
							q=query_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_query_expression.add(q.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: def, s, USING, q, p, t, AS
					// token labels: s
					// rule labels: retval, t, def, q, p
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_def=new RewriteRuleSubtreeStream(adaptor,"rule def",def!=null?def.getTree():null);
					RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.getTree():null);
					RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 569:7: -> ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) ( ^( TABLE_DEF $def) )? ( ^( USING $s) )? ( $p)? ( ^( AS $q) )? )
					{
						// DDL.g:569:10: ^( CREATE_TABLE_STATEMENT ^( TABLE_NAME $t) ( ^( TABLE_DEF $def) )? ( ^( USING $s) )? ( $p)? ( ^( AS $q) )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_TABLE_STATEMENT, "CREATE_TABLE_STATEMENT"), root_1);
						// DDL.g:569:35: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// DDL.g:569:52: ( ^( TABLE_DEF $def) )?
						if ( stream_def.hasNext() ) {
							// DDL.g:569:52: ^( TABLE_DEF $def)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_DEF, "TABLE_DEF"), root_2);
							adaptor.addChild(root_2, stream_def.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_def.reset();

						// DDL.g:569:71: ( ^( USING $s) )?
						if ( stream_s.hasNext()||stream_USING.hasNext() ) {
							// DDL.g:569:71: ^( USING $s)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
							adaptor.addChild(root_2, stream_s.nextNode());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_s.reset();
						stream_USING.reset();

						// DDL.g:569:85: ( $p)?
						if ( stream_p.hasNext() ) {
							adaptor.addChild(root_1, stream_p.nextTree());
						}
						stream_p.reset();

						// DDL.g:569:88: ( ^( AS $q) )?
						if ( stream_q.hasNext()||stream_AS.hasNext() ) {
							// DDL.g:569:88: ^( AS $q)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_AS.nextNode(), root_2);
							adaptor.addChild(root_2, stream_q.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_q.reset();
						stream_AS.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, create_table_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "create_table_statement"


	public static class table_elements_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_elements"
	// DDL.g:571:1: table_elements : LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ ;
	public final DDLParser.table_elements_return table_elements() throws RecognitionException {
		DDLParser.table_elements_return retval = new DDLParser.table_elements_return();
		retval.start = input.LT(1);
		int table_elements_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN153=null;
		Token COMMA155=null;
		Token RIGHT_PAREN157=null;
		ParserRuleReturnScope field_element154 =null;
		ParserRuleReturnScope field_element156 =null;

		CommonTree LEFT_PAREN153_tree=null;
		CommonTree COMMA155_tree=null;
		CommonTree RIGHT_PAREN157_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_field_element=new RewriteRuleSubtreeStream(adaptor,"rule field_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// DDL.g:572:3: ( LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ )
			// DDL.g:572:5: LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN
			{
			LEFT_PAREN153=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_elements4524); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN153);

			pushFollow(FOLLOW_field_element_in_table_elements4526);
			field_element154=field_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_element.add(field_element154.getTree());
			// DDL.g:572:30: ( COMMA field_element )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==COMMA) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// DDL.g:572:31: COMMA field_element
					{
					COMMA155=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_elements4529); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA155);

					pushFollow(FOLLOW_field_element_in_table_elements4531);
					field_element156=field_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_field_element.add(field_element156.getTree());
					}
					break;

				default :
					break loop55;
				}
			}

			RIGHT_PAREN157=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_elements4535); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN157);

			// AST REWRITE
			// elements: field_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 573:5: -> ( field_element )+
			{
				if ( !(stream_field_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_field_element.hasNext() ) {
					adaptor.addChild(root_0, stream_field_element.nextTree());
				}
				stream_field_element.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, table_elements_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table_elements"


	public static class field_element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_element"
	// DDL.g:576:1: field_element : Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) ;
	public final DDLParser.field_element_return field_element() throws RecognitionException {
		DDLParser.field_element_return retval = new DDLParser.field_element_return();
		retval.start = input.LT(1);
		int field_element_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token Identifier158=null;
		Token FOR159=null;
		Token COLUMN160=null;
		ParserRuleReturnScope field_type161 =null;
		ParserRuleReturnScope not_null162 =null;
		ParserRuleReturnScope with_default163 =null;

		CommonTree c_tree=null;
		CommonTree Identifier158_tree=null;
		CommonTree FOR159_tree=null;
		CommonTree COLUMN160_tree=null;
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
		RewriteRuleSubtreeStream stream_not_null=new RewriteRuleSubtreeStream(adaptor,"rule not_null");
		RewriteRuleSubtreeStream stream_with_default=new RewriteRuleSubtreeStream(adaptor,"rule with_default");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// DDL.g:577:3: ( Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) )
			// DDL.g:577:5: Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )?
			{
			Identifier158=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element4559); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier158);

			// DDL.g:577:16: ( FOR COLUMN c= Identifier )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==FOR) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// DDL.g:577:17: FOR COLUMN c= Identifier
					{
					FOR159=(Token)match(input,FOR,FOLLOW_FOR_in_field_element4562); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOR.add(FOR159);

					COLUMN160=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_field_element4564); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN160);

					c=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element4568); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(c);

					}
					break;

			}

			pushFollow(FOLLOW_field_type_in_field_element4572);
			field_type161=field_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_type.add(field_type161.getTree());
			// DDL.g:577:54: ( not_null )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==NOT) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// DDL.g:577:55: not_null
					{
					pushFollow(FOLLOW_not_null_in_field_element4575);
					not_null162=not_null();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_not_null.add(not_null162.getTree());
					}
					break;

			}

			// DDL.g:577:66: ( with_default )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==WITH) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// DDL.g:577:67: with_default
					{
					pushFollow(FOLLOW_with_default_in_field_element4580);
					with_default163=with_default();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_with_default.add(with_default163.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: field_type, with_default, not_null, c, Identifier
			// token labels: c
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 577:81: -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
			{
				// DDL.g:577:84: ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_DEF, "FIELD_DEF"), root_1);
				// DDL.g:577:96: ^( FIELD_NAME Identifier )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_NAME, "FIELD_NAME"), root_2);
				adaptor.addChild(root_2, stream_Identifier.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:577:121: ( ^( FOR_COLUMN $c) )?
				if ( stream_c.hasNext() ) {
					// DDL.g:577:121: ^( FOR_COLUMN $c)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_COLUMN, "FOR_COLUMN"), root_2);
					adaptor.addChild(root_2, stream_c.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_c.reset();

				// DDL.g:577:139: ^( FIELD_TYPE field_type )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_TYPE, "FIELD_TYPE"), root_2);
				adaptor.addChild(root_2, stream_field_type.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:577:164: ( not_null )?
				if ( stream_not_null.hasNext() ) {
					adaptor.addChild(root_1, stream_not_null.nextTree());
				}
				stream_not_null.reset();

				// DDL.g:577:176: ( with_default )?
				if ( stream_with_default.hasNext() ) {
					adaptor.addChild(root_1, stream_with_default.nextTree());
				}
				stream_with_default.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, field_element_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "field_element"


	public static class not_null_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "not_null"
	// DDL.g:580:1: not_null : NOT NULL -> ^( NOT_NULL ) ;
	public final DDLParser.not_null_return not_null() throws RecognitionException {
		DDLParser.not_null_return retval = new DDLParser.not_null_return();
		retval.start = input.LT(1);
		int not_null_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT164=null;
		Token NULL165=null;

		CommonTree NOT164_tree=null;
		CommonTree NULL165_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// DDL.g:580:9: ( NOT NULL -> ^( NOT_NULL ) )
			// DDL.g:581:2: NOT NULL
			{
			NOT164=(Token)match(input,NOT,FOLLOW_NOT_in_not_null4630); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NOT.add(NOT164);

			NULL165=(Token)match(input,NULL,FOLLOW_NULL_in_not_null4632); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL165);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 581:11: -> ^( NOT_NULL )
			{
				// DDL.g:581:14: ^( NOT_NULL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, not_null_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "not_null"


	public static class with_default_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "with_default"
	// DDL.g:584:1: with_default : WITH DEFAULT -> ^( WITH_DEFAULT ) ;
	public final DDLParser.with_default_return with_default() throws RecognitionException {
		DDLParser.with_default_return retval = new DDLParser.with_default_return();
		retval.start = input.LT(1);
		int with_default_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH166=null;
		Token DEFAULT167=null;

		CommonTree WITH166_tree=null;
		CommonTree DEFAULT167_tree=null;
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// DDL.g:584:13: ( WITH DEFAULT -> ^( WITH_DEFAULT ) )
			// DDL.g:585:2: WITH DEFAULT
			{
			WITH166=(Token)match(input,WITH,FOLLOW_WITH_in_with_default4653); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH166);

			DEFAULT167=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_with_default4655); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT167);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 585:15: -> ^( WITH_DEFAULT )
			{
				// DDL.g:585:18: ^( WITH_DEFAULT )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH_DEFAULT, "WITH_DEFAULT"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, with_default_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "with_default"


	public static class field_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_type"
	// DDL.g:588:1: field_type : data_type ;
	public final DDLParser.field_type_return field_type() throws RecognitionException {
		DDLParser.field_type_return retval = new DDLParser.field_type_return();
		retval.start = input.LT(1);
		int field_type_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope data_type168 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// DDL.g:589:3: ( data_type )
			// DDL.g:589:5: data_type
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_data_type_in_field_type4681);
			data_type168=data_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, data_type168.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, field_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "field_type"


	public static class create_view_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "create_view_statement"
	// DDL.g:592:1: create_view_statement : CREATE VIEW t= table (col= ordinary_grouping_set )? -> ^( CREATE_VIEW_STATEMENT ^( VIEW_NAME $t) ( ^( COLUMNS_LIST $col) )? ) ;
	public final DDLParser.create_view_statement_return create_view_statement() throws RecognitionException {
		DDLParser.create_view_statement_return retval = new DDLParser.create_view_statement_return();
		retval.start = input.LT(1);
		int create_view_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CREATE169=null;
		Token VIEW170=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope col =null;

		CommonTree CREATE169_tree=null;
		CommonTree VIEW170_tree=null;
		RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
		RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// DDL.g:593:3: ( CREATE VIEW t= table (col= ordinary_grouping_set )? -> ^( CREATE_VIEW_STATEMENT ^( VIEW_NAME $t) ( ^( COLUMNS_LIST $col) )? ) )
			// DDL.g:594:3: CREATE VIEW t= table (col= ordinary_grouping_set )?
			{
			CREATE169=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_statement4697); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CREATE.add(CREATE169);

			VIEW170=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_statement4699); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VIEW.add(VIEW170);

			pushFollow(FOLLOW_table_in_create_view_statement4703);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			// DDL.g:594:23: (col= ordinary_grouping_set )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==Identifier||LA59_0==LEFT_PAREN) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// DDL.g:594:24: col= ordinary_grouping_set
					{
					pushFollow(FOLLOW_ordinary_grouping_set_in_create_view_statement4708);
					col=ordinary_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(col.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: col, t
			// token labels: 
			// rule labels: retval, col, t
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_col=new RewriteRuleSubtreeStream(adaptor,"rule col",col!=null?col.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 594:78: -> ^( CREATE_VIEW_STATEMENT ^( VIEW_NAME $t) ( ^( COLUMNS_LIST $col) )? )
			{
				// DDL.g:594:81: ^( CREATE_VIEW_STATEMENT ^( VIEW_NAME $t) ( ^( COLUMNS_LIST $col) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_VIEW_STATEMENT, "CREATE_VIEW_STATEMENT"), root_1);
				// DDL.g:594:105: ^( VIEW_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIEW_NAME, "VIEW_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:594:121: ( ^( COLUMNS_LIST $col) )?
				if ( stream_col.hasNext() ) {
					// DDL.g:594:121: ^( COLUMNS_LIST $col)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMNS_LIST, "COLUMNS_LIST"), root_2);
					adaptor.addChild(root_2, stream_col.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_col.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, create_view_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "create_view_statement"


	public static class create_alias_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "create_alias_statement"
	// DDL.g:597:1: create_alias_statement : CREATE ( or_replace )? ALIAS t= table FOR m= table -> ^( CREATE_ALIAS_STATEMENT ( or_replace )? ^( ALIAS_NAME $t) ^( TABLE_NAME $m) ) ;
	public final DDLParser.create_alias_statement_return create_alias_statement() throws RecognitionException {
		DDLParser.create_alias_statement_return retval = new DDLParser.create_alias_statement_return();
		retval.start = input.LT(1);
		int create_alias_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CREATE171=null;
		Token ALIAS173=null;
		Token FOR174=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope m =null;
		ParserRuleReturnScope or_replace172 =null;

		CommonTree CREATE171_tree=null;
		CommonTree ALIAS173_tree=null;
		CommonTree FOR174_tree=null;
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
		RewriteRuleTokenStream stream_ALIAS=new RewriteRuleTokenStream(adaptor,"token ALIAS");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
		RewriteRuleSubtreeStream stream_or_replace=new RewriteRuleSubtreeStream(adaptor,"rule or_replace");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// DDL.g:598:2: ( CREATE ( or_replace )? ALIAS t= table FOR m= table -> ^( CREATE_ALIAS_STATEMENT ( or_replace )? ^( ALIAS_NAME $t) ^( TABLE_NAME $m) ) )
			// DDL.g:598:4: CREATE ( or_replace )? ALIAS t= table FOR m= table
			{
			CREATE171=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_alias_statement4756); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CREATE.add(CREATE171);

			// DDL.g:598:11: ( or_replace )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==OR) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// DDL.g:598:12: or_replace
					{
					pushFollow(FOLLOW_or_replace_in_create_alias_statement4759);
					or_replace172=or_replace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_or_replace.add(or_replace172.getTree());
					}
					break;

			}

			ALIAS173=(Token)match(input,ALIAS,FOLLOW_ALIAS_in_create_alias_statement4763); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ALIAS.add(ALIAS173);

			pushFollow(FOLLOW_table_in_create_alias_statement4767);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			FOR174=(Token)match(input,FOR,FOLLOW_FOR_in_create_alias_statement4769); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR174);

			pushFollow(FOLLOW_table_in_create_alias_statement4773);
			m=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(m.getTree());
			// AST REWRITE
			// elements: m, or_replace, t
			// token labels: 
			// rule labels: retval, t, m
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 598:51: -> ^( CREATE_ALIAS_STATEMENT ( or_replace )? ^( ALIAS_NAME $t) ^( TABLE_NAME $m) )
			{
				// DDL.g:598:54: ^( CREATE_ALIAS_STATEMENT ( or_replace )? ^( ALIAS_NAME $t) ^( TABLE_NAME $m) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CREATE_ALIAS_STATEMENT, "CREATE_ALIAS_STATEMENT"), root_1);
				// DDL.g:598:79: ( or_replace )?
				if ( stream_or_replace.hasNext() ) {
					adaptor.addChild(root_1, stream_or_replace.nextTree());
				}
				stream_or_replace.reset();

				// DDL.g:598:93: ^( ALIAS_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALIAS_NAME, "ALIAS_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:598:110: ^( TABLE_NAME $m)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
				adaptor.addChild(root_2, stream_m.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, create_alias_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "create_alias_statement"


	public static class or_replace_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "or_replace"
	// DDL.g:602:1: or_replace : OR REPLACE -> ^( OR_REPLACE ) ;
	public final DDLParser.or_replace_return or_replace() throws RecognitionException {
		DDLParser.or_replace_return retval = new DDLParser.or_replace_return();
		retval.start = input.LT(1);
		int or_replace_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OR175=null;
		Token REPLACE176=null;

		CommonTree OR175_tree=null;
		CommonTree REPLACE176_tree=null;
		RewriteRuleTokenStream stream_REPLACE=new RewriteRuleTokenStream(adaptor,"token REPLACE");
		RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// DDL.g:603:2: ( OR REPLACE -> ^( OR_REPLACE ) )
			// DDL.g:604:2: OR REPLACE
			{
			OR175=(Token)match(input,OR,FOLLOW_OR_in_or_replace4816); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OR.add(OR175);

			REPLACE176=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_or_replace4818); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REPLACE.add(REPLACE176);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 604:13: -> ^( OR_REPLACE )
			{
				// DDL.g:604:16: ^( OR_REPLACE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OR_REPLACE, "OR_REPLACE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, or_replace_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "or_replace"


	public static class drop_alias_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "drop_alias_statement"
	// DDL.g:607:1: drop_alias_statement : DROP ALIAS t= table -> ^( DROP_ALIAS_STATEMENT ^( ALIAS_NAME $t) ) ;
	public final DDLParser.drop_alias_statement_return drop_alias_statement() throws RecognitionException {
		DDLParser.drop_alias_statement_return retval = new DDLParser.drop_alias_statement_return();
		retval.start = input.LT(1);
		int drop_alias_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DROP177=null;
		Token ALIAS178=null;
		ParserRuleReturnScope t =null;

		CommonTree DROP177_tree=null;
		CommonTree ALIAS178_tree=null;
		RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
		RewriteRuleTokenStream stream_ALIAS=new RewriteRuleTokenStream(adaptor,"token ALIAS");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// DDL.g:608:2: ( DROP ALIAS t= table -> ^( DROP_ALIAS_STATEMENT ^( ALIAS_NAME $t) ) )
			// DDL.g:609:2: DROP ALIAS t= table
			{
			DROP177=(Token)match(input,DROP,FOLLOW_DROP_in_drop_alias_statement4837); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DROP.add(DROP177);

			ALIAS178=(Token)match(input,ALIAS,FOLLOW_ALIAS_in_drop_alias_statement4839); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ALIAS.add(ALIAS178);

			pushFollow(FOLLOW_table_in_drop_alias_statement4843);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			// AST REWRITE
			// elements: t
			// token labels: 
			// rule labels: retval, t
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 609:21: -> ^( DROP_ALIAS_STATEMENT ^( ALIAS_NAME $t) )
			{
				// DDL.g:609:24: ^( DROP_ALIAS_STATEMENT ^( ALIAS_NAME $t) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_ALIAS_STATEMENT, "DROP_ALIAS_STATEMENT"), root_1);
				// DDL.g:609:47: ^( ALIAS_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALIAS_NAME, "ALIAS_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, drop_alias_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "drop_alias_statement"


	public static class commit_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "commit_statement"
	// DDL.g:612:1: commit_statement : COMMIT ( WORK )? (h= HOLD )? -> ^( COMMIT_STATEMENT ( $h)? ) ;
	public final DDLParser.commit_statement_return commit_statement() throws RecognitionException {
		DDLParser.commit_statement_return retval = new DDLParser.commit_statement_return();
		retval.start = input.LT(1);
		int commit_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token h=null;
		Token COMMIT179=null;
		Token WORK180=null;

		CommonTree h_tree=null;
		CommonTree COMMIT179_tree=null;
		CommonTree WORK180_tree=null;
		RewriteRuleTokenStream stream_COMMIT=new RewriteRuleTokenStream(adaptor,"token COMMIT");
		RewriteRuleTokenStream stream_HOLD=new RewriteRuleTokenStream(adaptor,"token HOLD");
		RewriteRuleTokenStream stream_WORK=new RewriteRuleTokenStream(adaptor,"token WORK");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// DDL.g:613:2: ( COMMIT ( WORK )? (h= HOLD )? -> ^( COMMIT_STATEMENT ( $h)? ) )
			// DDL.g:614:2: COMMIT ( WORK )? (h= HOLD )?
			{
			COMMIT179=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_commit_statement4870); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMIT.add(COMMIT179);

			// DDL.g:614:10: ( WORK )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==WORK) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// DDL.g:614:11: WORK
					{
					WORK180=(Token)match(input,WORK,FOLLOW_WORK_in_commit_statement4874); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WORK.add(WORK180);

					}
					break;

			}

			// DDL.g:614:18: (h= HOLD )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==HOLD) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// DDL.g:614:19: h= HOLD
					{
					h=(Token)match(input,HOLD,FOLLOW_HOLD_in_commit_statement4881); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HOLD.add(h);

					}
					break;

			}

			// AST REWRITE
			// elements: h
			// token labels: h
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_h=new RewriteRuleTokenStream(adaptor,"token h",h);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 614:28: -> ^( COMMIT_STATEMENT ( $h)? )
			{
				// DDL.g:614:31: ^( COMMIT_STATEMENT ( $h)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMIT_STATEMENT, "COMMIT_STATEMENT"), root_1);
				// DDL.g:614:51: ( $h)?
				if ( stream_h.hasNext() ) {
					adaptor.addChild(root_1, stream_h.nextNode());
				}
				stream_h.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, commit_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "commit_statement"


	public static class connect_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "connect_statement"
	// DDL.g:616:1: connect_statement : ( CONNECT ( TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal ) )? -> ^( CONNECT_STATEMENT ( ^( TO $s) ^( USER $u) ^( USING $p) )? ) | CONNECT RESET -> ^( CONNECT_STATEMENT RESET ) );
	public final DDLParser.connect_statement_return connect_statement() throws RecognitionException {
		DDLParser.connect_statement_return retval = new DDLParser.connect_statement_return();
		retval.start = input.LT(1);
		int connect_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token u=null;
		Token p=null;
		Token CONNECT181=null;
		Token TO182=null;
		Token USER183=null;
		Token USING184=null;
		Token CONNECT185=null;
		Token RESET186=null;

		CommonTree s_tree=null;
		CommonTree u_tree=null;
		CommonTree p_tree=null;
		CommonTree CONNECT181_tree=null;
		CommonTree TO182_tree=null;
		CommonTree USER183_tree=null;
		CommonTree USING184_tree=null;
		CommonTree CONNECT185_tree=null;
		CommonTree RESET186_tree=null;
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_RESET=new RewriteRuleTokenStream(adaptor,"token RESET");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_USER=new RewriteRuleTokenStream(adaptor,"token USER");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// DDL.g:617:2: ( CONNECT ( TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal ) )? -> ^( CONNECT_STATEMENT ( ^( TO $s) ^( USER $u) ^( USING $p) )? ) | CONNECT RESET -> ^( CONNECT_STATEMENT RESET ) )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==CONNECT) ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1==RESET) ) {
					alt64=2;
				}
				else if ( (LA64_1==EOF||LA64_1==TO) ) {
					alt64=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// DDL.g:617:4: CONNECT ( TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal ) )?
					{
					CONNECT181=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connect_statement4905); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT181);

					// DDL.g:617:12: ( TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal ) )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==TO) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// DDL.g:617:13: TO s= Identifier ( USER u= Identifier USING p= Character_String_Literal )
							{
							TO182=(Token)match(input,TO,FOLLOW_TO_in_connect_statement4908); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TO.add(TO182);

							s=(Token)match(input,Identifier,FOLLOW_Identifier_in_connect_statement4913); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(s);

							// DDL.g:617:30: ( USER u= Identifier USING p= Character_String_Literal )
							// DDL.g:617:31: USER u= Identifier USING p= Character_String_Literal
							{
							USER183=(Token)match(input,USER,FOLLOW_USER_in_connect_statement4916); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_USER.add(USER183);

							u=(Token)match(input,Identifier,FOLLOW_Identifier_in_connect_statement4920); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(u);

							USING184=(Token)match(input,USING,FOLLOW_USING_in_connect_statement4922); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_USING.add(USING184);

							p=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_connect_statement4926); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Character_String_Literal.add(p);

							}

							}
							break;

					}

					// AST REWRITE
					// elements: s, p, USING, USER, TO, u
					// token labels: u, s, p
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_u=new RewriteRuleTokenStream(adaptor,"token u",u);
					RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
					RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 617:85: -> ^( CONNECT_STATEMENT ( ^( TO $s) ^( USER $u) ^( USING $p) )? )
					{
						// DDL.g:617:88: ^( CONNECT_STATEMENT ( ^( TO $s) ^( USER $u) ^( USING $p) )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONNECT_STATEMENT, "CONNECT_STATEMENT"), root_1);
						// DDL.g:617:108: ( ^( TO $s) ^( USER $u) ^( USING $p) )?
						if ( stream_s.hasNext()||stream_p.hasNext()||stream_USING.hasNext()||stream_USER.hasNext()||stream_TO.hasNext()||stream_u.hasNext() ) {
							// DDL.g:617:109: ^( TO $s)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_TO.nextNode(), root_2);
							adaptor.addChild(root_2, stream_s.nextNode());
							adaptor.addChild(root_1, root_2);
							}

							// DDL.g:617:118: ^( USER $u)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_USER.nextNode(), root_2);
							adaptor.addChild(root_2, stream_u.nextNode());
							adaptor.addChild(root_1, root_2);
							}

							// DDL.g:617:129: ^( USING $p)
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
							adaptor.addChild(root_2, stream_p.nextNode());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_s.reset();
						stream_p.reset();
						stream_USING.reset();
						stream_USER.reset();
						stream_TO.reset();
						stream_u.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:619:5: CONNECT RESET
					{
					CONNECT185=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connect_statement4971); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT185);

					RESET186=(Token)match(input,RESET,FOLLOW_RESET_in_connect_statement4973); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RESET.add(RESET186);

					// AST REWRITE
					// elements: RESET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 619:19: -> ^( CONNECT_STATEMENT RESET )
					{
						// DDL.g:619:22: ^( CONNECT_STATEMENT RESET )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONNECT_STATEMENT, "CONNECT_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_RESET.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, connect_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "connect_statement"


	public static class disconnect_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "disconnect_statement"
	// DDL.g:622:1: disconnect_statement : ( DISCONNECT -> ^( DISCONNECT_STATEMENT ) | DISCONNECT ALL -> ^( DISCONNECT_STATEMENT ALL ) | DISCONNECT CURRENT -> ^( DISCONNECT_STATEMENT CURRENT ) );
	public final DDLParser.disconnect_statement_return disconnect_statement() throws RecognitionException {
		DDLParser.disconnect_statement_return retval = new DDLParser.disconnect_statement_return();
		retval.start = input.LT(1);
		int disconnect_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DISCONNECT187=null;
		Token DISCONNECT188=null;
		Token ALL189=null;
		Token DISCONNECT190=null;
		Token CURRENT191=null;

		CommonTree DISCONNECT187_tree=null;
		CommonTree DISCONNECT188_tree=null;
		CommonTree ALL189_tree=null;
		CommonTree DISCONNECT190_tree=null;
		CommonTree CURRENT191_tree=null;
		RewriteRuleTokenStream stream_CURRENT=new RewriteRuleTokenStream(adaptor,"token CURRENT");
		RewriteRuleTokenStream stream_DISCONNECT=new RewriteRuleTokenStream(adaptor,"token DISCONNECT");
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// DDL.g:623:2: ( DISCONNECT -> ^( DISCONNECT_STATEMENT ) | DISCONNECT ALL -> ^( DISCONNECT_STATEMENT ALL ) | DISCONNECT CURRENT -> ^( DISCONNECT_STATEMENT CURRENT ) )
			int alt65=3;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==DISCONNECT) ) {
				switch ( input.LA(2) ) {
				case ALL:
					{
					alt65=2;
					}
					break;
				case CURRENT:
					{
					alt65=3;
					}
					break;
				case EOF:
					{
					alt65=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// DDL.g:623:4: DISCONNECT
					{
					DISCONNECT187=(Token)match(input,DISCONNECT,FOLLOW_DISCONNECT_in_disconnect_statement4993); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISCONNECT.add(DISCONNECT187);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 623:15: -> ^( DISCONNECT_STATEMENT )
					{
						// DDL.g:623:18: ^( DISCONNECT_STATEMENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISCONNECT_STATEMENT, "DISCONNECT_STATEMENT"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:625:4: DISCONNECT ALL
					{
					DISCONNECT188=(Token)match(input,DISCONNECT,FOLLOW_DISCONNECT_in_disconnect_statement5009); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISCONNECT.add(DISCONNECT188);

					ALL189=(Token)match(input,ALL,FOLLOW_ALL_in_disconnect_statement5011); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL189);

					// AST REWRITE
					// elements: ALL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 625:19: -> ^( DISCONNECT_STATEMENT ALL )
					{
						// DDL.g:625:22: ^( DISCONNECT_STATEMENT ALL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISCONNECT_STATEMENT, "DISCONNECT_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_ALL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DDL.g:627:4: DISCONNECT CURRENT
					{
					DISCONNECT190=(Token)match(input,DISCONNECT,FOLLOW_DISCONNECT_in_disconnect_statement5029); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISCONNECT.add(DISCONNECT190);

					CURRENT191=(Token)match(input,CURRENT,FOLLOW_CURRENT_in_disconnect_statement5031); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CURRENT.add(CURRENT191);

					// AST REWRITE
					// elements: CURRENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 627:23: -> ^( DISCONNECT_STATEMENT CURRENT )
					{
						// DDL.g:627:26: ^( DISCONNECT_STATEMENT CURRENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISCONNECT_STATEMENT, "DISCONNECT_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_CURRENT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, disconnect_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "disconnect_statement"


	public static class drop_table_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "drop_table_statement"
	// DDL.g:630:1: drop_table_statement : ( DROP TABLE t= table -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) ) | DROP TABLE t= table restrict -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) restrict ) | DROP TABLE t= table cascade -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) cascade ) );
	public final DDLParser.drop_table_statement_return drop_table_statement() throws RecognitionException {
		DDLParser.drop_table_statement_return retval = new DDLParser.drop_table_statement_return();
		retval.start = input.LT(1);
		int drop_table_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DROP192=null;
		Token TABLE193=null;
		Token DROP194=null;
		Token TABLE195=null;
		Token DROP197=null;
		Token TABLE198=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope restrict196 =null;
		ParserRuleReturnScope cascade199 =null;

		CommonTree DROP192_tree=null;
		CommonTree TABLE193_tree=null;
		CommonTree DROP194_tree=null;
		CommonTree TABLE195_tree=null;
		CommonTree DROP197_tree=null;
		CommonTree TABLE198_tree=null;
		RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
		RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
		RewriteRuleSubtreeStream stream_cascade=new RewriteRuleSubtreeStream(adaptor,"rule cascade");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
		RewriteRuleSubtreeStream stream_restrict=new RewriteRuleSubtreeStream(adaptor,"rule restrict");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// DDL.g:631:3: ( DROP TABLE t= table -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) ) | DROP TABLE t= table restrict -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) restrict ) | DROP TABLE t= table cascade -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) cascade ) )
			int alt66=3;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==DROP) ) {
				int LA66_1 = input.LA(2);
				if ( (LA66_1==TABLE) ) {
					int LA66_2 = input.LA(3);
					if ( (LA66_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case DIVIDE:
							{
							int LA66_4 = input.LA(5);
							if ( (LA66_4==Identifier) ) {
								switch ( input.LA(6) ) {
								case LEFT_PAREN:
									{
									int LA66_9 = input.LA(7);
									if ( (LA66_9==Identifier) ) {
										int LA66_10 = input.LA(8);
										if ( (LA66_10==RIGHT_PAREN) ) {
											switch ( input.LA(9) ) {
											case EOF:
												{
												alt66=1;
												}
												break;
											case RESTRICT:
												{
												alt66=2;
												}
												break;
											case CASCADE:
												{
												alt66=3;
												}
												break;
											default:
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 66, 11, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 66, 10, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 66, 9, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

									}
									break;
								case EOF:
									{
									alt66=1;
									}
									break;
								case RESTRICT:
									{
									alt66=2;
									}
									break;
								case CASCADE:
									{
									alt66=3;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 66, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 66, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case EOF:
							{
							alt66=1;
							}
							break;
						case RESTRICT:
							{
							alt66=2;
							}
							break;
						case CASCADE:
							{
							alt66=3;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 66, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 66, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 66, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// DDL.g:632:2: DROP TABLE t= table
					{
					DROP192=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_statement5055); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP192);

					TABLE193=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_statement5057); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE193);

					pushFollow(FOLLOW_table_in_drop_table_statement5061);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					// AST REWRITE
					// elements: t
					// token labels: 
					// rule labels: retval, t
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 632:22: -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) )
					{
						// DDL.g:632:25: ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_TABLE_STATEMENT, "DROP_TABLE_STATEMENT"), root_1);
						// DDL.g:632:48: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:634:2: DROP TABLE t= table restrict
					{
					DROP194=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_statement5081); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP194);

					TABLE195=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_statement5083); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE195);

					pushFollow(FOLLOW_table_in_drop_table_statement5087);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					pushFollow(FOLLOW_restrict_in_drop_table_statement5089);
					restrict196=restrict();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_restrict.add(restrict196.getTree());
					// AST REWRITE
					// elements: t, restrict
					// token labels: 
					// rule labels: retval, t
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 634:30: -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) restrict )
					{
						// DDL.g:634:33: ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) restrict )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_TABLE_STATEMENT, "DROP_TABLE_STATEMENT"), root_1);
						// DDL.g:634:56: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_restrict.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DDL.g:636:2: DROP TABLE t= table cascade
					{
					DROP197=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_statement5110); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP197);

					TABLE198=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_statement5112); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE198);

					pushFollow(FOLLOW_table_in_drop_table_statement5116);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					pushFollow(FOLLOW_cascade_in_drop_table_statement5118);
					cascade199=cascade();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cascade.add(cascade199.getTree());
					// AST REWRITE
					// elements: cascade, t
					// token labels: 
					// rule labels: retval, t
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 636:29: -> ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) cascade )
					{
						// DDL.g:636:32: ^( DROP_TABLE_STATEMENT ^( TABLE_NAME $t) cascade )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_TABLE_STATEMENT, "DROP_TABLE_STATEMENT"), root_1);
						// DDL.g:636:55: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_cascade.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, drop_table_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "drop_table_statement"


	public static class drop_view_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "drop_view_statement"
	// DDL.g:641:1: drop_view_statement : ( DROP VIEW v= table -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) ) | DROP VIEW v= table restrict -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) restrict ) | DROP VIEW v= table cascade -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) cascade ) );
	public final DDLParser.drop_view_statement_return drop_view_statement() throws RecognitionException {
		DDLParser.drop_view_statement_return retval = new DDLParser.drop_view_statement_return();
		retval.start = input.LT(1);
		int drop_view_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DROP200=null;
		Token VIEW201=null;
		Token DROP202=null;
		Token VIEW203=null;
		Token DROP205=null;
		Token VIEW206=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope restrict204 =null;
		ParserRuleReturnScope cascade207 =null;

		CommonTree DROP200_tree=null;
		CommonTree VIEW201_tree=null;
		CommonTree DROP202_tree=null;
		CommonTree VIEW203_tree=null;
		CommonTree DROP205_tree=null;
		CommonTree VIEW206_tree=null;
		RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
		RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
		RewriteRuleSubtreeStream stream_cascade=new RewriteRuleSubtreeStream(adaptor,"rule cascade");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
		RewriteRuleSubtreeStream stream_restrict=new RewriteRuleSubtreeStream(adaptor,"rule restrict");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// DDL.g:642:3: ( DROP VIEW v= table -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) ) | DROP VIEW v= table restrict -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) restrict ) | DROP VIEW v= table cascade -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) cascade ) )
			int alt67=3;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==DROP) ) {
				int LA67_1 = input.LA(2);
				if ( (LA67_1==VIEW) ) {
					int LA67_2 = input.LA(3);
					if ( (LA67_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case DIVIDE:
							{
							int LA67_4 = input.LA(5);
							if ( (LA67_4==Identifier) ) {
								switch ( input.LA(6) ) {
								case LEFT_PAREN:
									{
									int LA67_9 = input.LA(7);
									if ( (LA67_9==Identifier) ) {
										int LA67_10 = input.LA(8);
										if ( (LA67_10==RIGHT_PAREN) ) {
											switch ( input.LA(9) ) {
											case EOF:
												{
												alt67=1;
												}
												break;
											case RESTRICT:
												{
												alt67=2;
												}
												break;
											case CASCADE:
												{
												alt67=3;
												}
												break;
											default:
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 67, 11, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 67, 10, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 67, 9, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

									}
									break;
								case EOF:
									{
									alt67=1;
									}
									break;
								case RESTRICT:
									{
									alt67=2;
									}
									break;
								case CASCADE:
									{
									alt67=3;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 67, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 67, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case EOF:
							{
							alt67=1;
							}
							break;
						case RESTRICT:
							{
							alt67=2;
							}
							break;
						case CASCADE:
							{
							alt67=3;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 67, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 67, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// DDL.g:643:2: DROP VIEW v= table
					{
					DROP200=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_statement5152); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP200);

					VIEW201=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_statement5154); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VIEW.add(VIEW201);

					pushFollow(FOLLOW_table_in_drop_view_statement5158);
					v=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(v.getTree());
					// AST REWRITE
					// elements: v
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 643:21: -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) )
					{
						// DDL.g:643:24: ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_VIEW_STATEMENT, "DROP_VIEW_STATEMENT"), root_1);
						// DDL.g:643:46: ^( VIEW_NAME $v)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIEW_NAME, "VIEW_NAME"), root_2);
						adaptor.addChild(root_2, stream_v.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:645:2: DROP VIEW v= table restrict
					{
					DROP202=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_statement5178); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP202);

					VIEW203=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_statement5180); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VIEW.add(VIEW203);

					pushFollow(FOLLOW_table_in_drop_view_statement5184);
					v=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(v.getTree());
					pushFollow(FOLLOW_restrict_in_drop_view_statement5186);
					restrict204=restrict();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_restrict.add(restrict204.getTree());
					// AST REWRITE
					// elements: restrict, v
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 645:29: -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) restrict )
					{
						// DDL.g:645:32: ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) restrict )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_VIEW_STATEMENT, "DROP_VIEW_STATEMENT"), root_1);
						// DDL.g:645:54: ^( VIEW_NAME $v)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIEW_NAME, "VIEW_NAME"), root_2);
						adaptor.addChild(root_2, stream_v.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_restrict.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DDL.g:647:2: DROP VIEW v= table cascade
					{
					DROP205=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_statement5207); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DROP.add(DROP205);

					VIEW206=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_statement5209); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VIEW.add(VIEW206);

					pushFollow(FOLLOW_table_in_drop_view_statement5213);
					v=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(v.getTree());
					pushFollow(FOLLOW_cascade_in_drop_view_statement5215);
					cascade207=cascade();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cascade.add(cascade207.getTree());
					// AST REWRITE
					// elements: v, cascade
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 647:28: -> ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) cascade )
					{
						// DDL.g:647:31: ^( DROP_VIEW_STATEMENT ^( VIEW_NAME $v) cascade )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DROP_VIEW_STATEMENT, "DROP_VIEW_STATEMENT"), root_1);
						// DDL.g:647:53: ^( VIEW_NAME $v)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIEW_NAME, "VIEW_NAME"), root_2);
						adaptor.addChild(root_2, stream_v.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_cascade.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, drop_view_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "drop_view_statement"


	public static class restrict_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "restrict"
	// DDL.g:651:1: restrict : RESTRICT -> ^( RESTRICT ) ;
	public final DDLParser.restrict_return restrict() throws RecognitionException {
		DDLParser.restrict_return retval = new DDLParser.restrict_return();
		retval.start = input.LT(1);
		int restrict_StartIndex = input.index();

		CommonTree root_0 = null;

		Token RESTRICT208=null;

		CommonTree RESTRICT208_tree=null;
		RewriteRuleTokenStream stream_RESTRICT=new RewriteRuleTokenStream(adaptor,"token RESTRICT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// DDL.g:651:9: ( RESTRICT -> ^( RESTRICT ) )
			// DDL.g:652:2: RESTRICT
			{
			RESTRICT208=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_restrict5252); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RESTRICT.add(RESTRICT208);

			// AST REWRITE
			// elements: RESTRICT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 652:11: -> ^( RESTRICT )
			{
				// DDL.g:652:14: ^( RESTRICT )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_RESTRICT.nextNode(), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, restrict_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "restrict"


	public static class cascade_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cascade"
	// DDL.g:655:1: cascade : CASCADE -> ^( CASCADE ) ;
	public final DDLParser.cascade_return cascade() throws RecognitionException {
		DDLParser.cascade_return retval = new DDLParser.cascade_return();
		retval.start = input.LT(1);
		int cascade_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASCADE209=null;

		CommonTree CASCADE209_tree=null;
		RewriteRuleTokenStream stream_CASCADE=new RewriteRuleTokenStream(adaptor,"token CASCADE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// DDL.g:655:8: ( CASCADE -> ^( CASCADE ) )
			// DDL.g:656:2: CASCADE
			{
			CASCADE209=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_cascade5271); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CASCADE.add(CASCADE209);

			// AST REWRITE
			// elements: CASCADE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 656:11: -> ^( CASCADE )
			{
				// DDL.g:656:14: ^( CASCADE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_CASCADE.nextNode(), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, cascade_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cascade"


	public static class lock_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lock_statement"
	// DDL.g:659:1: lock_statement : ( LOCK TABLE t= table IN SHARE MODE -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( SHARE ) ) | LOCK TABLE t= table IN EXCLUSIVE MODE ( allow_read )? -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( EXCLUSIVE ) ( allow_read )? ) );
	public final DDLParser.lock_statement_return lock_statement() throws RecognitionException {
		DDLParser.lock_statement_return retval = new DDLParser.lock_statement_return();
		retval.start = input.LT(1);
		int lock_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LOCK210=null;
		Token TABLE211=null;
		Token IN212=null;
		Token SHARE213=null;
		Token MODE214=null;
		Token LOCK215=null;
		Token TABLE216=null;
		Token IN217=null;
		Token EXCLUSIVE218=null;
		Token MODE219=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope allow_read220 =null;

		CommonTree LOCK210_tree=null;
		CommonTree TABLE211_tree=null;
		CommonTree IN212_tree=null;
		CommonTree SHARE213_tree=null;
		CommonTree MODE214_tree=null;
		CommonTree LOCK215_tree=null;
		CommonTree TABLE216_tree=null;
		CommonTree IN217_tree=null;
		CommonTree EXCLUSIVE218_tree=null;
		CommonTree MODE219_tree=null;
		RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
		RewriteRuleTokenStream stream_SHARE=new RewriteRuleTokenStream(adaptor,"token SHARE");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_EXCLUSIVE=new RewriteRuleTokenStream(adaptor,"token EXCLUSIVE");
		RewriteRuleTokenStream stream_MODE=new RewriteRuleTokenStream(adaptor,"token MODE");
		RewriteRuleTokenStream stream_LOCK=new RewriteRuleTokenStream(adaptor,"token LOCK");
		RewriteRuleSubtreeStream stream_allow_read=new RewriteRuleSubtreeStream(adaptor,"rule allow_read");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// DDL.g:660:2: ( LOCK TABLE t= table IN SHARE MODE -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( SHARE ) ) | LOCK TABLE t= table IN EXCLUSIVE MODE ( allow_read )? -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( EXCLUSIVE ) ( allow_read )? ) )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==LOCK) ) {
				int LA69_1 = input.LA(2);
				if ( (LA69_1==TABLE) ) {
					int LA69_2 = input.LA(3);
					if ( (LA69_2==Identifier) ) {
						int LA69_3 = input.LA(4);
						if ( (LA69_3==DIVIDE) ) {
							int LA69_4 = input.LA(5);
							if ( (LA69_4==Identifier) ) {
								int LA69_6 = input.LA(6);
								if ( (LA69_6==LEFT_PAREN) ) {
									int LA69_9 = input.LA(7);
									if ( (LA69_9==Identifier) ) {
										int LA69_10 = input.LA(8);
										if ( (LA69_10==RIGHT_PAREN) ) {
											int LA69_11 = input.LA(9);
											if ( (LA69_11==IN) ) {
												int LA69_5 = input.LA(10);
												if ( (LA69_5==SHARE) ) {
													alt69=1;
												}
												else if ( (LA69_5==EXCLUSIVE) ) {
													alt69=2;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 69, 5, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 69, 11, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 69, 10, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 69, 9, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA69_6==IN) ) {
									int LA69_5 = input.LA(7);
									if ( (LA69_5==SHARE) ) {
										alt69=1;
									}
									else if ( (LA69_5==EXCLUSIVE) ) {
										alt69=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 69, 5, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 69, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 69, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA69_3==IN) ) {
							int LA69_5 = input.LA(5);
							if ( (LA69_5==SHARE) ) {
								alt69=1;
							}
							else if ( (LA69_5==EXCLUSIVE) ) {
								alt69=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 69, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 69, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 69, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 69, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// DDL.g:661:2: LOCK TABLE t= table IN SHARE MODE
					{
					LOCK210=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_statement5290); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOCK.add(LOCK210);

					TABLE211=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_statement5292); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE211);

					pushFollow(FOLLOW_table_in_lock_statement5296);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					IN212=(Token)match(input,IN,FOLLOW_IN_in_lock_statement5298); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN212);

					SHARE213=(Token)match(input,SHARE,FOLLOW_SHARE_in_lock_statement5300); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SHARE.add(SHARE213);

					MODE214=(Token)match(input,MODE,FOLLOW_MODE_in_lock_statement5302); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MODE.add(MODE214);

					// AST REWRITE
					// elements: t, SHARE
					// token labels: 
					// rule labels: retval, t
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 661:35: -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( SHARE ) )
					{
						// DDL.g:661:38: ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( SHARE ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCK_TABLE_STATEMENT, "LOCK_TABLE_STATEMENT"), root_1);
						// DDL.g:661:61: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// DDL.g:661:78: ^( SHARE )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_SHARE.nextNode(), root_2);
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:663:2: LOCK TABLE t= table IN EXCLUSIVE MODE ( allow_read )?
					{
					LOCK215=(Token)match(input,LOCK,FOLLOW_LOCK_in_lock_statement5326); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOCK.add(LOCK215);

					TABLE216=(Token)match(input,TABLE,FOLLOW_TABLE_in_lock_statement5328); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TABLE.add(TABLE216);

					pushFollow(FOLLOW_table_in_lock_statement5332);
					t=table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table.add(t.getTree());
					IN217=(Token)match(input,IN,FOLLOW_IN_in_lock_statement5334); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN217);

					EXCLUSIVE218=(Token)match(input,EXCLUSIVE,FOLLOW_EXCLUSIVE_in_lock_statement5336); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EXCLUSIVE.add(EXCLUSIVE218);

					MODE219=(Token)match(input,MODE,FOLLOW_MODE_in_lock_statement5338); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MODE.add(MODE219);

					// DDL.g:663:39: ( allow_read )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==ALLOW) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// DDL.g:663:40: allow_read
							{
							pushFollow(FOLLOW_allow_read_in_lock_statement5341);
							allow_read220=allow_read();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_allow_read.add(allow_read220.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: EXCLUSIVE, t, allow_read
					// token labels: 
					// rule labels: retval, t
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 663:53: -> ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( EXCLUSIVE ) ( allow_read )? )
					{
						// DDL.g:663:56: ^( LOCK_TABLE_STATEMENT ^( TABLE_NAME $t) ^( EXCLUSIVE ) ( allow_read )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCK_TABLE_STATEMENT, "LOCK_TABLE_STATEMENT"), root_1);
						// DDL.g:663:79: ^( TABLE_NAME $t)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
						adaptor.addChild(root_2, stream_t.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// DDL.g:663:96: ^( EXCLUSIVE )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_EXCLUSIVE.nextNode(), root_2);
						adaptor.addChild(root_1, root_2);
						}

						// DDL.g:663:109: ( allow_read )?
						if ( stream_allow_read.hasNext() ) {
							adaptor.addChild(root_1, stream_allow_read.nextTree());
						}
						stream_allow_read.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, lock_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "lock_statement"


	public static class allow_read_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "allow_read"
	// DDL.g:666:1: allow_read : ALLOW READ -> ^( ALLOW_READ ) ;
	public final DDLParser.allow_read_return allow_read() throws RecognitionException {
		DDLParser.allow_read_return retval = new DDLParser.allow_read_return();
		retval.start = input.LT(1);
		int allow_read_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ALLOW221=null;
		Token READ222=null;

		CommonTree ALLOW221_tree=null;
		CommonTree READ222_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_ALLOW=new RewriteRuleTokenStream(adaptor,"token ALLOW");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// DDL.g:667:2: ( ALLOW READ -> ^( ALLOW_READ ) )
			// DDL.g:668:2: ALLOW READ
			{
			ALLOW221=(Token)match(input,ALLOW,FOLLOW_ALLOW_in_allow_read5379); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ALLOW.add(ALLOW221);

			READ222=(Token)match(input,READ,FOLLOW_READ_in_allow_read5381); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ222);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 668:13: -> ^( ALLOW_READ )
			{
				// DDL.g:668:16: ^( ALLOW_READ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALLOW_READ, "ALLOW_READ"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, allow_read_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allow_read"


	public static class rename_table_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rename_table_statement"
	// DDL.g:671:1: rename_table_statement : RENAME TABLE t= table TO n= Identifier FOR SYSTEM NAME s= Identifier -> ^( RENAME_TABLE_STATEMENT ^( TABLE_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) ) ;
	public final DDLParser.rename_table_statement_return rename_table_statement() throws RecognitionException {
		DDLParser.rename_table_statement_return retval = new DDLParser.rename_table_statement_return();
		retval.start = input.LT(1);
		int rename_table_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token s=null;
		Token RENAME223=null;
		Token TABLE224=null;
		Token TO225=null;
		Token FOR226=null;
		Token SYSTEM227=null;
		Token NAME228=null;
		ParserRuleReturnScope t =null;

		CommonTree n_tree=null;
		CommonTree s_tree=null;
		CommonTree RENAME223_tree=null;
		CommonTree TABLE224_tree=null;
		CommonTree TO225_tree=null;
		CommonTree FOR226_tree=null;
		CommonTree SYSTEM227_tree=null;
		CommonTree NAME228_tree=null;
		RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleTokenStream stream_SYSTEM=new RewriteRuleTokenStream(adaptor,"token SYSTEM");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_RENAME=new RewriteRuleTokenStream(adaptor,"token RENAME");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// DDL.g:672:2: ( RENAME TABLE t= table TO n= Identifier FOR SYSTEM NAME s= Identifier -> ^( RENAME_TABLE_STATEMENT ^( TABLE_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) ) )
			// DDL.g:673:2: RENAME TABLE t= table TO n= Identifier FOR SYSTEM NAME s= Identifier
			{
			RENAME223=(Token)match(input,RENAME,FOLLOW_RENAME_in_rename_table_statement5400); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RENAME.add(RENAME223);

			TABLE224=(Token)match(input,TABLE,FOLLOW_TABLE_in_rename_table_statement5402); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TABLE.add(TABLE224);

			pushFollow(FOLLOW_table_in_rename_table_statement5406);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			TO225=(Token)match(input,TO,FOLLOW_TO_in_rename_table_statement5408); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TO.add(TO225);

			n=(Token)match(input,Identifier,FOLLOW_Identifier_in_rename_table_statement5412); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(n);

			FOR226=(Token)match(input,FOR,FOLLOW_FOR_in_rename_table_statement5414); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR226);

			SYSTEM227=(Token)match(input,SYSTEM,FOLLOW_SYSTEM_in_rename_table_statement5416); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYSTEM.add(SYSTEM227);

			NAME228=(Token)match(input,NAME,FOLLOW_NAME_in_rename_table_statement5418); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME228);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_rename_table_statement5422); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// AST REWRITE
			// elements: SYSTEM, n, s, t
			// token labels: s, n
			// rule labels: retval, t
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 673:68: -> ^( RENAME_TABLE_STATEMENT ^( TABLE_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) )
			{
				// DDL.g:673:71: ^( RENAME_TABLE_STATEMENT ^( TABLE_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RENAME_TABLE_STATEMENT, "RENAME_TABLE_STATEMENT"), root_1);
				// DDL.g:673:96: ^( TABLE_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE_NAME, "TABLE_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:673:113: ^( NEW_NAME $n)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW_NAME, "NEW_NAME"), root_2);
				adaptor.addChild(root_2, stream_n.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:673:128: ^( SYSTEM $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_SYSTEM.nextNode(), root_2);
				adaptor.addChild(root_2, stream_s.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, rename_table_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "rename_table_statement"


	public static class rename_index_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rename_index_statement"
	// DDL.g:676:1: rename_index_statement : RENAME INDEX t= table TO n= Identifier FOR SYSTEM NAME s= Identifier -> ^( RENAME_INDEX_STATEMENT ^( INDEX_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) ) ;
	public final DDLParser.rename_index_statement_return rename_index_statement() throws RecognitionException {
		DDLParser.rename_index_statement_return retval = new DDLParser.rename_index_statement_return();
		retval.start = input.LT(1);
		int rename_index_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token s=null;
		Token RENAME229=null;
		Token INDEX230=null;
		Token TO231=null;
		Token FOR232=null;
		Token SYSTEM233=null;
		Token NAME234=null;
		ParserRuleReturnScope t =null;

		CommonTree n_tree=null;
		CommonTree s_tree=null;
		CommonTree RENAME229_tree=null;
		CommonTree INDEX230_tree=null;
		CommonTree TO231_tree=null;
		CommonTree FOR232_tree=null;
		CommonTree SYSTEM233_tree=null;
		CommonTree NAME234_tree=null;
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleTokenStream stream_SYSTEM=new RewriteRuleTokenStream(adaptor,"token SYSTEM");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_RENAME=new RewriteRuleTokenStream(adaptor,"token RENAME");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// DDL.g:677:2: ( RENAME INDEX t= table TO n= Identifier FOR SYSTEM NAME s= Identifier -> ^( RENAME_INDEX_STATEMENT ^( INDEX_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) ) )
			// DDL.g:678:2: RENAME INDEX t= table TO n= Identifier FOR SYSTEM NAME s= Identifier
			{
			RENAME229=(Token)match(input,RENAME,FOLLOW_RENAME_in_rename_index_statement5462); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RENAME.add(RENAME229);

			INDEX230=(Token)match(input,INDEX,FOLLOW_INDEX_in_rename_index_statement5464); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INDEX.add(INDEX230);

			pushFollow(FOLLOW_table_in_rename_index_statement5468);
			t=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(t.getTree());
			TO231=(Token)match(input,TO,FOLLOW_TO_in_rename_index_statement5470); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TO.add(TO231);

			n=(Token)match(input,Identifier,FOLLOW_Identifier_in_rename_index_statement5474); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(n);

			FOR232=(Token)match(input,FOR,FOLLOW_FOR_in_rename_index_statement5476); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR232);

			SYSTEM233=(Token)match(input,SYSTEM,FOLLOW_SYSTEM_in_rename_index_statement5478); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYSTEM.add(SYSTEM233);

			NAME234=(Token)match(input,NAME,FOLLOW_NAME_in_rename_index_statement5480); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME234);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_rename_index_statement5484); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// AST REWRITE
			// elements: SYSTEM, s, n, t
			// token labels: s, n
			// rule labels: retval, t
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 678:68: -> ^( RENAME_INDEX_STATEMENT ^( INDEX_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) )
			{
				// DDL.g:678:71: ^( RENAME_INDEX_STATEMENT ^( INDEX_NAME $t) ^( NEW_NAME $n) ^( SYSTEM $s) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RENAME_INDEX_STATEMENT, "RENAME_INDEX_STATEMENT"), root_1);
				// DDL.g:678:96: ^( INDEX_NAME $t)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX_NAME, "INDEX_NAME"), root_2);
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:678:113: ^( NEW_NAME $n)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW_NAME, "NEW_NAME"), root_2);
				adaptor.addChild(root_2, stream_n.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:678:128: ^( SYSTEM $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_SYSTEM.nextNode(), root_2);
				adaptor.addChild(root_2, stream_s.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, rename_index_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "rename_index_statement"


	public static class release_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "release_statement"
	// DDL.g:681:1: release_statement : ( RELEASE -> ^( RELEASE_STATEMENT ) | RELEASE ALL -> ^( RELEASE_STATEMENT ALL ) | RELEASE CURRENT -> ^( RELEASE_STATEMENT CURRENT ) );
	public final DDLParser.release_statement_return release_statement() throws RecognitionException {
		DDLParser.release_statement_return retval = new DDLParser.release_statement_return();
		retval.start = input.LT(1);
		int release_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token RELEASE235=null;
		Token RELEASE236=null;
		Token ALL237=null;
		Token RELEASE238=null;
		Token CURRENT239=null;

		CommonTree RELEASE235_tree=null;
		CommonTree RELEASE236_tree=null;
		CommonTree ALL237_tree=null;
		CommonTree RELEASE238_tree=null;
		CommonTree CURRENT239_tree=null;
		RewriteRuleTokenStream stream_RELEASE=new RewriteRuleTokenStream(adaptor,"token RELEASE");
		RewriteRuleTokenStream stream_CURRENT=new RewriteRuleTokenStream(adaptor,"token CURRENT");
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// DDL.g:682:2: ( RELEASE -> ^( RELEASE_STATEMENT ) | RELEASE ALL -> ^( RELEASE_STATEMENT ALL ) | RELEASE CURRENT -> ^( RELEASE_STATEMENT CURRENT ) )
			int alt70=3;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==RELEASE) ) {
				switch ( input.LA(2) ) {
				case ALL:
					{
					alt70=2;
					}
					break;
				case CURRENT:
					{
					alt70=3;
					}
					break;
				case EOF:
					{
					alt70=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// DDL.g:682:4: RELEASE
					{
					RELEASE235=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_statement5525); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELEASE.add(RELEASE235);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 682:12: -> ^( RELEASE_STATEMENT )
					{
						// DDL.g:682:15: ^( RELEASE_STATEMENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELEASE_STATEMENT, "RELEASE_STATEMENT"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:684:4: RELEASE ALL
					{
					RELEASE236=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_statement5541); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELEASE.add(RELEASE236);

					ALL237=(Token)match(input,ALL,FOLLOW_ALL_in_release_statement5543); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL237);

					// AST REWRITE
					// elements: ALL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 684:16: -> ^( RELEASE_STATEMENT ALL )
					{
						// DDL.g:684:19: ^( RELEASE_STATEMENT ALL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELEASE_STATEMENT, "RELEASE_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_ALL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DDL.g:686:4: RELEASE CURRENT
					{
					RELEASE238=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_statement5561); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELEASE.add(RELEASE238);

					CURRENT239=(Token)match(input,CURRENT,FOLLOW_CURRENT_in_release_statement5563); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CURRENT.add(CURRENT239);

					// AST REWRITE
					// elements: CURRENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 686:20: -> ^( RELEASE_STATEMENT CURRENT )
					{
						// DDL.g:686:23: ^( RELEASE_STATEMENT CURRENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELEASE_STATEMENT, "RELEASE_STATEMENT"), root_1);
						adaptor.addChild(root_1, stream_CURRENT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, release_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "release_statement"


	public static class rollback_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rollback_statement"
	// DDL.g:689:1: rollback_statement : ROLLBACK (h= HOLD )? -> ^( ROLLBACK_STATEMENT ( $h)? ) ;
	public final DDLParser.rollback_statement_return rollback_statement() throws RecognitionException {
		DDLParser.rollback_statement_return retval = new DDLParser.rollback_statement_return();
		retval.start = input.LT(1);
		int rollback_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token h=null;
		Token ROLLBACK240=null;

		CommonTree h_tree=null;
		CommonTree ROLLBACK240_tree=null;
		RewriteRuleTokenStream stream_HOLD=new RewriteRuleTokenStream(adaptor,"token HOLD");
		RewriteRuleTokenStream stream_ROLLBACK=new RewriteRuleTokenStream(adaptor,"token ROLLBACK");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// DDL.g:690:2: ( ROLLBACK (h= HOLD )? -> ^( ROLLBACK_STATEMENT ( $h)? ) )
			// DDL.g:691:2: ROLLBACK (h= HOLD )?
			{
			ROLLBACK240=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_statement5585); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROLLBACK.add(ROLLBACK240);

			// DDL.g:691:11: (h= HOLD )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==HOLD) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// DDL.g:691:12: h= HOLD
					{
					h=(Token)match(input,HOLD,FOLLOW_HOLD_in_rollback_statement5590); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HOLD.add(h);

					}
					break;

			}

			// AST REWRITE
			// elements: h
			// token labels: h
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_h=new RewriteRuleTokenStream(adaptor,"token h",h);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 691:21: -> ^( ROLLBACK_STATEMENT ( $h)? )
			{
				// DDL.g:691:24: ^( ROLLBACK_STATEMENT ( $h)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROLLBACK_STATEMENT, "ROLLBACK_STATEMENT"), root_1);
				// DDL.g:691:45: ( $h)?
				if ( stream_h.hasNext() ) {
					adaptor.addChild(root_1, stream_h.nextNode());
				}
				stream_h.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, rollback_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "rollback_statement"


	public static class set_connection_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_connection_statement"
	// DDL.g:694:1: set_connection_statement : SET CONNECTION d= Identifier -> ^( SET_CONNECTION_STATEMENT ^( DB_NAME $d) ) ;
	public final DDLParser.set_connection_statement_return set_connection_statement() throws RecognitionException {
		DDLParser.set_connection_statement_return retval = new DDLParser.set_connection_statement_return();
		retval.start = input.LT(1);
		int set_connection_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token d=null;
		Token SET241=null;
		Token CONNECTION242=null;

		CommonTree d_tree=null;
		CommonTree SET241_tree=null;
		CommonTree CONNECTION242_tree=null;
		RewriteRuleTokenStream stream_CONNECTION=new RewriteRuleTokenStream(adaptor,"token CONNECTION");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// DDL.g:695:2: ( SET CONNECTION d= Identifier -> ^( SET_CONNECTION_STATEMENT ^( DB_NAME $d) ) )
			// DDL.g:696:2: SET CONNECTION d= Identifier
			{
			SET241=(Token)match(input,SET,FOLLOW_SET_in_set_connection_statement5617); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SET.add(SET241);

			CONNECTION242=(Token)match(input,CONNECTION,FOLLOW_CONNECTION_in_set_connection_statement5619); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CONNECTION.add(CONNECTION242);

			d=(Token)match(input,Identifier,FOLLOW_Identifier_in_set_connection_statement5623); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(d);

			// AST REWRITE
			// elements: d
			// token labels: d
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 696:30: -> ^( SET_CONNECTION_STATEMENT ^( DB_NAME $d) )
			{
				// DDL.g:696:33: ^( SET_CONNECTION_STATEMENT ^( DB_NAME $d) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_CONNECTION_STATEMENT, "SET_CONNECTION_STATEMENT"), root_1);
				// DDL.g:696:60: ^( DB_NAME $d)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DB_NAME, "DB_NAME"), root_2);
				adaptor.addChild(root_2, stream_d.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, set_connection_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set_connection_statement"


	public static class set_transaction_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_transaction_statement"
	// DDL.g:699:1: set_transaction_statement : SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) ;
	public final DDLParser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
		DDLParser.set_transaction_statement_return retval = new DDLParser.set_transaction_statement_return();
		retval.start = input.LT(1);
		int set_transaction_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SET243=null;
		Token TRANSACTION244=null;
		Token ISOLATION245=null;
		Token LEVEL246=null;
		Token COMMA247=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope r =null;

		CommonTree SET243_tree=null;
		CommonTree TRANSACTION244_tree=null;
		CommonTree ISOLATION245_tree=null;
		CommonTree LEVEL246_tree=null;
		CommonTree COMMA247_tree=null;
		RewriteRuleTokenStream stream_ISOLATION=new RewriteRuleTokenStream(adaptor,"token ISOLATION");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_LEVEL=new RewriteRuleTokenStream(adaptor,"token LEVEL");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_TRANSACTION=new RewriteRuleTokenStream(adaptor,"token TRANSACTION");
		RewriteRuleSubtreeStream stream_isolation_level=new RewriteRuleSubtreeStream(adaptor,"rule isolation_level");
		RewriteRuleSubtreeStream stream_read_operation=new RewriteRuleSubtreeStream(adaptor,"rule read_operation");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// DDL.g:700:2: ( SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) )
			// DDL.g:701:2: SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )?
			{
			SET243=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement5649); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SET.add(SET243);

			TRANSACTION244=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement5651); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TRANSACTION.add(TRANSACTION244);

			ISOLATION245=(Token)match(input,ISOLATION,FOLLOW_ISOLATION_in_set_transaction_statement5653); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ISOLATION.add(ISOLATION245);

			LEVEL246=(Token)match(input,LEVEL,FOLLOW_LEVEL_in_set_transaction_statement5655); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEVEL.add(LEVEL246);

			pushFollow(FOLLOW_isolation_level_in_set_transaction_statement5659);
			i=isolation_level();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_isolation_level.add(i.getTree());
			// DDL.g:701:52: ( COMMA r= read_operation )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==COMMA) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// DDL.g:701:53: COMMA r= read_operation
					{
					COMMA247=(Token)match(input,COMMA,FOLLOW_COMMA_in_set_transaction_statement5662); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA247);

					pushFollow(FOLLOW_read_operation_in_set_transaction_statement5666);
					r=read_operation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_read_operation.add(r.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: r, i
			// token labels: 
			// rule labels: retval, r, i
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 701:78: -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
			{
				// DDL.g:703:2: ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_TRANSACTION_STATEMENT, "SET_TRANSACTION_STATEMENT"), root_1);
				// DDL.g:703:30: ^( ISOLATION_LEVEL $i)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ISOLATION_LEVEL, "ISOLATION_LEVEL"), root_2);
				adaptor.addChild(root_2, stream_i.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:703:52: ( ^( RW_OPERATION $r) )?
				if ( stream_r.hasNext() ) {
					// DDL.g:703:53: ^( RW_OPERATION $r)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RW_OPERATION, "RW_OPERATION"), root_2);
					adaptor.addChild(root_2, stream_r.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_r.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, set_transaction_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set_transaction_statement"


	public static class isolation_level_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "isolation_level"
	// DDL.g:706:1: isolation_level : ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read );
	public final DDLParser.isolation_level_return isolation_level() throws RecognitionException {
		DDLParser.isolation_level_return retval = new DDLParser.isolation_level_return();
		retval.start = input.LT(1);
		int isolation_level_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SERIALIZABLE248=null;
		ParserRuleReturnScope no_commit249 =null;
		ParserRuleReturnScope read_uncommitted250 =null;
		ParserRuleReturnScope read_committed251 =null;
		ParserRuleReturnScope repeatable_read252 =null;

		CommonTree SERIALIZABLE248_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// DDL.g:707:2: ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read )
			int alt73=5;
			switch ( input.LA(1) ) {
			case SERIALIZABLE:
				{
				alt73=1;
				}
				break;
			case NO:
				{
				alt73=2;
				}
				break;
			case READ:
				{
				int LA73_3 = input.LA(2);
				if ( (LA73_3==UNCOMMITTED) ) {
					alt73=3;
				}
				else if ( (LA73_3==COMMITTED) ) {
					alt73=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case REPEATABLE:
				{
				alt73=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// DDL.g:708:2: SERIALIZABLE
					{
					root_0 = (CommonTree)adaptor.nil();


					SERIALIZABLE248=(Token)match(input,SERIALIZABLE,FOLLOW_SERIALIZABLE_in_isolation_level5707); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SERIALIZABLE248_tree = (CommonTree)adaptor.create(SERIALIZABLE248);
					adaptor.addChild(root_0, SERIALIZABLE248_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:710:2: no_commit
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_no_commit_in_isolation_level5713);
					no_commit249=no_commit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, no_commit249.getTree());

					}
					break;
				case 3 :
					// DDL.g:712:2: read_uncommitted
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_uncommitted_in_isolation_level5719);
					read_uncommitted250=read_uncommitted();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_uncommitted250.getTree());

					}
					break;
				case 4 :
					// DDL.g:714:2: read_committed
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_committed_in_isolation_level5725);
					read_committed251=read_committed();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_committed251.getTree());

					}
					break;
				case 5 :
					// DDL.g:716:2: repeatable_read
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_repeatable_read_in_isolation_level5731);
					repeatable_read252=repeatable_read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatable_read252.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, isolation_level_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "isolation_level"


	public static class no_commit_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "no_commit"
	// DDL.g:719:1: no_commit : NO COMMIT -> ^( NO_COMMIT ) ;
	public final DDLParser.no_commit_return no_commit() throws RecognitionException {
		DDLParser.no_commit_return retval = new DDLParser.no_commit_return();
		retval.start = input.LT(1);
		int no_commit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NO253=null;
		Token COMMIT254=null;

		CommonTree NO253_tree=null;
		CommonTree COMMIT254_tree=null;
		RewriteRuleTokenStream stream_COMMIT=new RewriteRuleTokenStream(adaptor,"token COMMIT");
		RewriteRuleTokenStream stream_NO=new RewriteRuleTokenStream(adaptor,"token NO");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// DDL.g:720:2: ( NO COMMIT -> ^( NO_COMMIT ) )
			// DDL.g:721:2: NO COMMIT
			{
			NO253=(Token)match(input,NO,FOLLOW_NO_in_no_commit5745); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NO.add(NO253);

			COMMIT254=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_no_commit5747); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMIT.add(COMMIT254);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 721:12: -> ^( NO_COMMIT )
			{
				// DDL.g:721:15: ^( NO_COMMIT )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NO_COMMIT, "NO_COMMIT"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, no_commit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "no_commit"


	public static class read_uncommitted_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_uncommitted"
	// DDL.g:724:1: read_uncommitted : READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) ;
	public final DDLParser.read_uncommitted_return read_uncommitted() throws RecognitionException {
		DDLParser.read_uncommitted_return retval = new DDLParser.read_uncommitted_return();
		retval.start = input.LT(1);
		int read_uncommitted_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ255=null;
		Token UNCOMMITTED256=null;

		CommonTree READ255_tree=null;
		CommonTree UNCOMMITTED256_tree=null;
		RewriteRuleTokenStream stream_UNCOMMITTED=new RewriteRuleTokenStream(adaptor,"token UNCOMMITTED");
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// DDL.g:725:2: ( READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) )
			// DDL.g:726:2: READ UNCOMMITTED
			{
			READ255=(Token)match(input,READ,FOLLOW_READ_in_read_uncommitted5770); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ255);

			UNCOMMITTED256=(Token)match(input,UNCOMMITTED,FOLLOW_UNCOMMITTED_in_read_uncommitted5772); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNCOMMITTED.add(UNCOMMITTED256);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 726:19: -> ^( READ_UNCOMMITTED )
			{
				// DDL.g:726:22: ^( READ_UNCOMMITTED )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ_UNCOMMITTED, "READ_UNCOMMITTED"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, read_uncommitted_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_uncommitted"


	public static class read_committed_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_committed"
	// DDL.g:729:1: read_committed : READ COMMITTED -> ^( READ_COMMITTED ) ;
	public final DDLParser.read_committed_return read_committed() throws RecognitionException {
		DDLParser.read_committed_return retval = new DDLParser.read_committed_return();
		retval.start = input.LT(1);
		int read_committed_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ257=null;
		Token COMMITTED258=null;

		CommonTree READ257_tree=null;
		CommonTree COMMITTED258_tree=null;
		RewriteRuleTokenStream stream_COMMITTED=new RewriteRuleTokenStream(adaptor,"token COMMITTED");
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// DDL.g:730:2: ( READ COMMITTED -> ^( READ_COMMITTED ) )
			// DDL.g:731:2: READ COMMITTED
			{
			READ257=(Token)match(input,READ,FOLLOW_READ_in_read_committed5791); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ257);

			COMMITTED258=(Token)match(input,COMMITTED,FOLLOW_COMMITTED_in_read_committed5793); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMITTED.add(COMMITTED258);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 731:17: -> ^( READ_COMMITTED )
			{
				// DDL.g:731:20: ^( READ_COMMITTED )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ_COMMITTED, "READ_COMMITTED"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, read_committed_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_committed"


	public static class repeatable_read_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "repeatable_read"
	// DDL.g:734:1: repeatable_read : REPEATABLE READ -> ^( REPEATABLE_READ ) ;
	public final DDLParser.repeatable_read_return repeatable_read() throws RecognitionException {
		DDLParser.repeatable_read_return retval = new DDLParser.repeatable_read_return();
		retval.start = input.LT(1);
		int repeatable_read_StartIndex = input.index();

		CommonTree root_0 = null;

		Token REPEATABLE259=null;
		Token READ260=null;

		CommonTree REPEATABLE259_tree=null;
		CommonTree READ260_tree=null;
		RewriteRuleTokenStream stream_REPEATABLE=new RewriteRuleTokenStream(adaptor,"token REPEATABLE");
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// DDL.g:735:2: ( REPEATABLE READ -> ^( REPEATABLE_READ ) )
			// DDL.g:736:2: REPEATABLE READ
			{
			REPEATABLE259=(Token)match(input,REPEATABLE,FOLLOW_REPEATABLE_in_repeatable_read5814); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REPEATABLE.add(REPEATABLE259);

			READ260=(Token)match(input,READ,FOLLOW_READ_in_repeatable_read5816); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ260);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 736:18: -> ^( REPEATABLE_READ )
			{
				// DDL.g:736:21: ^( REPEATABLE_READ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPEATABLE_READ, "REPEATABLE_READ"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, repeatable_read_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "repeatable_read"


	public static class read_operation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_operation"
	// DDL.g:739:1: read_operation : ( read_only | read_write );
	public final DDLParser.read_operation_return read_operation() throws RecognitionException {
		DDLParser.read_operation_return retval = new DDLParser.read_operation_return();
		retval.start = input.LT(1);
		int read_operation_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope read_only261 =null;
		ParserRuleReturnScope read_write262 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// DDL.g:740:2: ( read_only | read_write )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==READ) ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1==ONLY) ) {
					alt74=1;
				}
				else if ( (LA74_1==WRITE) ) {
					alt74=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// DDL.g:741:2: read_only
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_only_in_read_operation5835);
					read_only261=read_only();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_only261.getTree());

					}
					break;
				case 2 :
					// DDL.g:743:2: read_write
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_write_in_read_operation5841);
					read_write262=read_write();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_write262.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, read_operation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_operation"


	public static class read_only_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_only"
	// DDL.g:746:1: read_only : READ ONLY -> ^( READ_ONLY ) ;
	public final DDLParser.read_only_return read_only() throws RecognitionException {
		DDLParser.read_only_return retval = new DDLParser.read_only_return();
		retval.start = input.LT(1);
		int read_only_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ263=null;
		Token ONLY264=null;

		CommonTree READ263_tree=null;
		CommonTree ONLY264_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_ONLY=new RewriteRuleTokenStream(adaptor,"token ONLY");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// DDL.g:747:2: ( READ ONLY -> ^( READ_ONLY ) )
			// DDL.g:748:2: READ ONLY
			{
			READ263=(Token)match(input,READ,FOLLOW_READ_in_read_only5854); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ263);

			ONLY264=(Token)match(input,ONLY,FOLLOW_ONLY_in_read_only5856); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ONLY.add(ONLY264);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 748:12: -> ^( READ_ONLY )
			{
				// DDL.g:748:15: ^( READ_ONLY )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ_ONLY, "READ_ONLY"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, read_only_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_only"


	public static class read_write_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "read_write"
	// DDL.g:751:1: read_write : READ WRITE -> ^( READ_WRITE ) ;
	public final DDLParser.read_write_return read_write() throws RecognitionException {
		DDLParser.read_write_return retval = new DDLParser.read_write_return();
		retval.start = input.LT(1);
		int read_write_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ265=null;
		Token WRITE266=null;

		CommonTree READ265_tree=null;
		CommonTree WRITE266_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// DDL.g:752:2: ( READ WRITE -> ^( READ_WRITE ) )
			// DDL.g:753:2: READ WRITE
			{
			READ265=(Token)match(input,READ,FOLLOW_READ_in_read_write5876); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ265);

			WRITE266=(Token)match(input,WRITE,FOLLOW_WRITE_in_read_write5878); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WRITE.add(WRITE266);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 753:13: -> ^( READ_WRITE )
			{
				// DDL.g:753:16: ^( READ_WRITE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ_WRITE, "READ_WRITE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, read_write_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_write"


	public static class call_procedure_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "call_procedure"
	// DDL.g:757:1: call_procedure : CALL i= qualified_identifier ( LEFT_PAREN ( funcArgs )? RIGHT_PAREN ) -> ^( PROCEDURE_CALL_STATEMENT ^( PROCEDURE_NAME $i) ^( PROCEDURE_ARGS ( funcArgs )? ) ) ;
	public final DDLParser.call_procedure_return call_procedure() throws RecognitionException {
		DDLParser.call_procedure_return retval = new DDLParser.call_procedure_return();
		retval.start = input.LT(1);
		int call_procedure_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CALL267=null;
		Token LEFT_PAREN268=null;
		Token RIGHT_PAREN270=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope funcArgs269 =null;

		CommonTree CALL267_tree=null;
		CommonTree LEFT_PAREN268_tree=null;
		CommonTree RIGHT_PAREN270_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_CALL=new RewriteRuleTokenStream(adaptor,"token CALL");
		RewriteRuleSubtreeStream stream_funcArgs=new RewriteRuleSubtreeStream(adaptor,"rule funcArgs");
		RewriteRuleSubtreeStream stream_qualified_identifier=new RewriteRuleSubtreeStream(adaptor,"rule qualified_identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// DDL.g:758:2: ( CALL i= qualified_identifier ( LEFT_PAREN ( funcArgs )? RIGHT_PAREN ) -> ^( PROCEDURE_CALL_STATEMENT ^( PROCEDURE_NAME $i) ^( PROCEDURE_ARGS ( funcArgs )? ) ) )
			// DDL.g:759:2: CALL i= qualified_identifier ( LEFT_PAREN ( funcArgs )? RIGHT_PAREN )
			{
			CALL267=(Token)match(input,CALL,FOLLOW_CALL_in_call_procedure5901); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CALL.add(CALL267);

			pushFollow(FOLLOW_qualified_identifier_in_call_procedure5905);
			i=qualified_identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_qualified_identifier.add(i.getTree());
			// DDL.g:759:30: ( LEFT_PAREN ( funcArgs )? RIGHT_PAREN )
			// DDL.g:759:31: LEFT_PAREN ( funcArgs )? RIGHT_PAREN
			{
			LEFT_PAREN268=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_call_procedure5908); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN268);

			// DDL.g:759:42: ( funcArgs )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==CASE||LA75_0==COUNT||LA75_0==Character_String_Literal||LA75_0==Identifier||LA75_0==LEFT_PAREN||LA75_0==MINUS||LA75_0==NOT||LA75_0==NULL||LA75_0==NUMBER||LA75_0==PLUS||LA75_0==REAL_NUMBER) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// DDL.g:759:42: funcArgs
					{
					pushFollow(FOLLOW_funcArgs_in_call_procedure5910);
					funcArgs269=funcArgs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs269.getTree());
					}
					break;

			}

			RIGHT_PAREN270=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_call_procedure5913); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN270);

			}

			// AST REWRITE
			// elements: i, funcArgs
			// token labels: 
			// rule labels: retval, i
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 759:65: -> ^( PROCEDURE_CALL_STATEMENT ^( PROCEDURE_NAME $i) ^( PROCEDURE_ARGS ( funcArgs )? ) )
			{
				// DDL.g:759:68: ^( PROCEDURE_CALL_STATEMENT ^( PROCEDURE_NAME $i) ^( PROCEDURE_ARGS ( funcArgs )? ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_CALL_STATEMENT, "PROCEDURE_CALL_STATEMENT"), root_1);
				// DDL.g:759:95: ^( PROCEDURE_NAME $i)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_NAME, "PROCEDURE_NAME"), root_2);
				adaptor.addChild(root_2, stream_i.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:759:116: ^( PROCEDURE_ARGS ( funcArgs )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_ARGS, "PROCEDURE_ARGS"), root_2);
				// DDL.g:759:133: ( funcArgs )?
				if ( stream_funcArgs.hasNext() ) {
					adaptor.addChild(root_2, stream_funcArgs.nextTree());
				}
				stream_funcArgs.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, call_procedure_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call_procedure"


	public static class insert_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insert_statement"
	// DDL.g:763:1: insert_statement : INSERT 'into' table ( LEFT_PAREN column_reference_list RIGHT_PAREN )? 'values' array -> ^( INSERT ^( TABLE table ) ^( VALUES array ) ( ^( TARGET_FIELDS column_reference_list ) )? ) ;
	public final DDLParser.insert_statement_return insert_statement() throws RecognitionException {
		DDLParser.insert_statement_return retval = new DDLParser.insert_statement_return();
		retval.start = input.LT(1);
		int insert_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INSERT271=null;
		Token string_literal272=null;
		Token LEFT_PAREN274=null;
		Token RIGHT_PAREN276=null;
		Token string_literal277=null;
		ParserRuleReturnScope table273 =null;
		ParserRuleReturnScope column_reference_list275 =null;
		ParserRuleReturnScope array278 =null;

		CommonTree INSERT271_tree=null;
		CommonTree string_literal272_tree=null;
		CommonTree LEFT_PAREN274_tree=null;
		CommonTree RIGHT_PAREN276_tree=null;
		CommonTree string_literal277_tree=null;
		RewriteRuleTokenStream stream_276=new RewriteRuleTokenStream(adaptor,"token 276");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_277=new RewriteRuleTokenStream(adaptor,"token 277");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
		RewriteRuleSubtreeStream stream_column_reference_list=new RewriteRuleSubtreeStream(adaptor,"rule column_reference_list");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
		RewriteRuleSubtreeStream stream_array=new RewriteRuleSubtreeStream(adaptor,"rule array");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// DDL.g:764:3: ( INSERT 'into' table ( LEFT_PAREN column_reference_list RIGHT_PAREN )? 'values' array -> ^( INSERT ^( TABLE table ) ^( VALUES array ) ( ^( TARGET_FIELDS column_reference_list ) )? ) )
			// DDL.g:764:5: INSERT 'into' table ( LEFT_PAREN column_reference_list RIGHT_PAREN )? 'values' array
			{
			INSERT271=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement5947); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INSERT.add(INSERT271);

			string_literal272=(Token)match(input,276,FOLLOW_276_in_insert_statement5949); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_276.add(string_literal272);

			pushFollow(FOLLOW_table_in_insert_statement5951);
			table273=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(table273.getTree());
			// DDL.g:764:25: ( LEFT_PAREN column_reference_list RIGHT_PAREN )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==LEFT_PAREN) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// DDL.g:764:26: LEFT_PAREN column_reference_list RIGHT_PAREN
					{
					LEFT_PAREN274=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_insert_statement5954); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN274);

					pushFollow(FOLLOW_column_reference_list_in_insert_statement5956);
					column_reference_list275=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_column_reference_list.add(column_reference_list275.getTree());
					RIGHT_PAREN276=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_insert_statement5958); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN276);

					}
					break;

			}

			string_literal277=(Token)match(input,277,FOLLOW_277_in_insert_statement5962); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_277.add(string_literal277);

			pushFollow(FOLLOW_array_in_insert_statement5964);
			array278=array();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_array.add(array278.getTree());
			// AST REWRITE
			// elements: array, column_reference_list, table, INSERT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 765:3: -> ^( INSERT ^( TABLE table ) ^( VALUES array ) ( ^( TARGET_FIELDS column_reference_list ) )? )
			{
				// DDL.g:765:6: ^( INSERT ^( TABLE table ) ^( VALUES array ) ( ^( TARGET_FIELDS column_reference_list ) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INSERT.nextNode(), root_1);
				// DDL.g:765:15: ^( TABLE table )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE, "TABLE"), root_2);
				adaptor.addChild(root_2, stream_table.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:765:30: ^( VALUES array )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUES, "VALUES"), root_2);
				adaptor.addChild(root_2, stream_array.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DDL.g:765:46: ( ^( TARGET_FIELDS column_reference_list ) )?
				if ( stream_column_reference_list.hasNext() ) {
					// DDL.g:765:46: ^( TARGET_FIELDS column_reference_list )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TARGET_FIELDS, "TARGET_FIELDS"), root_2);
					adaptor.addChild(root_2, stream_column_reference_list.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_column_reference_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, insert_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "insert_statement"


	public static class query_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_expression"
	// DDL.g:779:1: query_expression : query_expression_body ;
	public final DDLParser.query_expression_return query_expression() throws RecognitionException {
		DDLParser.query_expression_return retval = new DDLParser.query_expression_return();
		retval.start = input.LT(1);
		int query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_expression_body279 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// DDL.g:780:3: ( query_expression_body )
			// DDL.g:780:5: query_expression_body
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_expression_body_in_query_expression6011);
			query_expression_body279=query_expression_body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_expression_body279.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, query_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_expression"


	public static class query_expression_body_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_expression_body"
	// DDL.g:782:1: query_expression_body : ( non_join_query_expression | joined_table );
	public final DDLParser.query_expression_body_return query_expression_body() throws RecognitionException {
		DDLParser.query_expression_body_return retval = new DDLParser.query_expression_body_return();
		retval.start = input.LT(1);
		int query_expression_body_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_expression280 =null;
		ParserRuleReturnScope joined_table281 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// DDL.g:783:3: ( non_join_query_expression | joined_table )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==LEFT_PAREN||LA77_0==SELECT) ) {
				alt77=1;
			}
			else if ( (LA77_0==Identifier) ) {
				int LA77_3 = input.LA(2);
				if ( (synpred121_DDL()) ) {
					alt77=1;
				}
				else if ( (true) ) {
					alt77=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// DDL.g:783:5: non_join_query_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_expression_in_query_expression_body6023);
					non_join_query_expression280=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression280.getTree());

					}
					break;
				case 2 :
					// DDL.g:784:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_expression_body6029);
					joined_table281=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table281.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, query_expression_body_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_expression_body"


	public static class non_join_query_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "non_join_query_expression"
	// DDL.g:786:1: non_join_query_expression : ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* ;
	public final DDLParser.non_join_query_expression_return non_join_query_expression() throws RecognitionException {
		DDLParser.non_join_query_expression_return retval = new DDLParser.non_join_query_expression_return();
		retval.start = input.LT(1);
		int non_join_query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set284=null;
		Token set285=null;
		Token set287=null;
		Token set288=null;
		ParserRuleReturnScope non_join_query_term282 =null;
		ParserRuleReturnScope joined_table283 =null;
		ParserRuleReturnScope query_term286 =null;
		ParserRuleReturnScope query_term289 =null;

		CommonTree set284_tree=null;
		CommonTree set285_tree=null;
		CommonTree set287_tree=null;
		CommonTree set288_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// DDL.g:787:3: ( ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* )
			// DDL.g:787:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// DDL.g:787:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==LEFT_PAREN||LA79_0==SELECT) ) {
				alt79=1;
			}
			else if ( (LA79_0==Identifier) ) {
				int LA79_3 = input.LA(2);
				if ( (synpred122_DDL()) ) {
					alt79=1;
				}
				else if ( (true) ) {
					alt79=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// DDL.g:787:6: non_join_query_term
					{
					pushFollow(FOLLOW_non_join_query_term_in_non_join_query_expression6042);
					non_join_query_term282=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term282.getTree());

					}
					break;
				case 2 :
					// DDL.g:787:28: joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_expression6046);
					joined_table283=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table283.getTree());

					set284=input.LT(1);
					set284=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set284), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// DDL.g:787:59: ( ALL | DISTINCT )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==ALL||LA78_0==DISTINCT) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// DDL.g:
							{
							set285=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set285));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_query_term_in_non_join_query_expression6064);
					query_term286=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term286.getTree());

					}
					break;

			}

			// DDL.g:788:5: ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==EXCEPT||LA81_0==UNION) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// DDL.g:788:6: ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					set287=input.LT(1);
					set287=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set287), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// DDL.g:788:24: ( ALL | DISTINCT )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==ALL||LA80_0==DISTINCT) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// DDL.g:
							{
							set288=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set288));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_query_term_in_non_join_query_expression6088);
					query_term289=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term289.getTree());

					}
					break;

				default :
					break loop81;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, non_join_query_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "non_join_query_expression"


	public static class query_term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_term"
	// DDL.g:790:1: query_term : ( non_join_query_term | joined_table );
	public final DDLParser.query_term_return query_term() throws RecognitionException {
		DDLParser.query_term_return retval = new DDLParser.query_term_return();
		retval.start = input.LT(1);
		int query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_term290 =null;
		ParserRuleReturnScope joined_table291 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// DDL.g:791:3: ( non_join_query_term | joined_table )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==LEFT_PAREN||LA82_0==SELECT) ) {
				alt82=1;
			}
			else if ( (LA82_0==Identifier) ) {
				int LA82_3 = input.LA(2);
				if ( (synpred130_DDL()) ) {
					alt82=1;
				}
				else if ( (true) ) {
					alt82=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// DDL.g:791:5: non_join_query_term
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_term_in_query_term6102);
					non_join_query_term290=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term290.getTree());

					}
					break;
				case 2 :
					// DDL.g:792:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_term6108);
					joined_table291=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table291.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, query_term_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_term"


	public static class non_join_query_term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "non_join_query_term"
	// DDL.g:794:1: non_join_query_term : ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* ;
	public final DDLParser.non_join_query_term_return non_join_query_term() throws RecognitionException {
		DDLParser.non_join_query_term_return retval = new DDLParser.non_join_query_term_return();
		retval.start = input.LT(1);
		int non_join_query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INTERSECT294=null;
		Token set295=null;
		Token INTERSECT297=null;
		Token set298=null;
		ParserRuleReturnScope non_join_query_primary292 =null;
		ParserRuleReturnScope joined_table293 =null;
		ParserRuleReturnScope query_primary296 =null;
		ParserRuleReturnScope query_primary299 =null;

		CommonTree INTERSECT294_tree=null;
		CommonTree set295_tree=null;
		CommonTree INTERSECT297_tree=null;
		CommonTree set298_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// DDL.g:795:3: ( ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* )
			// DDL.g:795:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// DDL.g:795:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary )
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==LEFT_PAREN||LA84_0==SELECT) ) {
				alt84=1;
			}
			else if ( (LA84_0==Identifier) ) {
				alt84=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}

			switch (alt84) {
				case 1 :
					// DDL.g:795:7: non_join_query_primary
					{
					pushFollow(FOLLOW_non_join_query_primary_in_non_join_query_term6122);
					non_join_query_primary292=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary292.getTree());

					}
					break;
				case 2 :
					// DDL.g:795:32: joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_term6126);
					joined_table293=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table293.getTree());

					INTERSECT294=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term6128); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT294_tree = (CommonTree)adaptor.create(INTERSECT294);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT294_tree, root_0);
					}

					// DDL.g:795:56: ( ALL | DISTINCT )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==ALL||LA83_0==DISTINCT) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// DDL.g:
							{
							set295=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set295));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_query_primary_in_non_join_query_term6138);
					query_primary296=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary296.getTree());

					}
					break;

			}

			// DDL.g:796:5: ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==INTERSECT) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// DDL.g:796:6: INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					INTERSECT297=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term6146); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT297_tree = (CommonTree)adaptor.create(INTERSECT297);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT297_tree, root_0);
					}

					// DDL.g:796:17: ( ALL | DISTINCT )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==ALL||LA85_0==DISTINCT) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// DDL.g:
							{
							set298=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set298));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_query_primary_in_non_join_query_term6156);
					query_primary299=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary299.getTree());

					}
					break;

				default :
					break loop86;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, non_join_query_term_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "non_join_query_term"


	public static class query_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_primary"
	// DDL.g:798:1: query_primary : ( non_join_query_primary | joined_table );
	public final DDLParser.query_primary_return query_primary() throws RecognitionException {
		DDLParser.query_primary_return retval = new DDLParser.query_primary_return();
		retval.start = input.LT(1);
		int query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_primary300 =null;
		ParserRuleReturnScope joined_table301 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// DDL.g:799:3: ( non_join_query_primary | joined_table )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==LEFT_PAREN||LA87_0==SELECT) ) {
				alt87=1;
			}
			else if ( (LA87_0==Identifier) ) {
				alt87=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}

			switch (alt87) {
				case 1 :
					// DDL.g:799:5: non_join_query_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_primary_in_query_primary6170);
					non_join_query_primary300=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary300.getTree());

					}
					break;
				case 2 :
					// DDL.g:800:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_primary6176);
					joined_table301=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table301.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, query_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_primary"


	public static class non_join_query_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "non_join_query_primary"
	// DDL.g:802:1: non_join_query_primary : ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN );
	public final DDLParser.non_join_query_primary_return non_join_query_primary() throws RecognitionException {
		DDLParser.non_join_query_primary_return retval = new DDLParser.non_join_query_primary_return();
		retval.start = input.LT(1);
		int non_join_query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN303=null;
		Token RIGHT_PAREN305=null;
		ParserRuleReturnScope simple_table302 =null;
		ParserRuleReturnScope non_join_query_expression304 =null;

		CommonTree LEFT_PAREN303_tree=null;
		CommonTree RIGHT_PAREN305_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// DDL.g:803:3: ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==SELECT) ) {
				alt88=1;
			}
			else if ( (LA88_0==LEFT_PAREN) ) {
				alt88=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// DDL.g:803:5: simple_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_table_in_non_join_query_primary6188);
					simple_table302=simple_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_table302.getTree());

					}
					break;
				case 2 :
					// DDL.g:804:5: LEFT_PAREN non_join_query_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN303=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_non_join_query_primary6194); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN303_tree = (CommonTree)adaptor.create(LEFT_PAREN303);
					adaptor.addChild(root_0, LEFT_PAREN303_tree);
					}

					pushFollow(FOLLOW_non_join_query_expression_in_non_join_query_primary6196);
					non_join_query_expression304=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression304.getTree());

					RIGHT_PAREN305=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_non_join_query_primary6198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN305_tree = (CommonTree)adaptor.create(RIGHT_PAREN305);
					adaptor.addChild(root_0, RIGHT_PAREN305_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, non_join_query_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "non_join_query_primary"


	public static class simple_table_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_table"
	// DDL.g:806:1: simple_table options {k=1; } : query_specification ;
	public final DDLParser.simple_table_return simple_table() throws RecognitionException {
		DDLParser.simple_table_return retval = new DDLParser.simple_table_return();
		retval.start = input.LT(1);
		int simple_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_specification306 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// DDL.g:808:3: ( query_specification )
			// DDL.g:808:5: query_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_specification_in_simple_table6219);
			query_specification306=query_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_specification306.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, simple_table_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simple_table"


	public static class query_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_specification"
	// DDL.g:810:1: query_specification : SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) ;
	public final DDLParser.query_specification_return query_specification() throws RecognitionException {
		DDLParser.query_specification_return retval = new DDLParser.query_specification_return();
		retval.start = input.LT(1);
		int query_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SELECT307=null;
		ParserRuleReturnScope set_qualifier308 =null;
		ParserRuleReturnScope select_list309 =null;
		ParserRuleReturnScope from_clause310 =null;
		ParserRuleReturnScope where_clause311 =null;
		ParserRuleReturnScope groupby_clause312 =null;
		ParserRuleReturnScope having_clause313 =null;
		ParserRuleReturnScope orderby_clause314 =null;
		ParserRuleReturnScope limit_clause315 =null;

		CommonTree SELECT307_tree=null;
		RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
		RewriteRuleSubtreeStream stream_groupby_clause=new RewriteRuleSubtreeStream(adaptor,"rule groupby_clause");
		RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
		RewriteRuleSubtreeStream stream_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule from_clause");
		RewriteRuleSubtreeStream stream_having_clause=new RewriteRuleSubtreeStream(adaptor,"rule having_clause");
		RewriteRuleSubtreeStream stream_limit_clause=new RewriteRuleSubtreeStream(adaptor,"rule limit_clause");
		RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
		RewriteRuleSubtreeStream stream_orderby_clause=new RewriteRuleSubtreeStream(adaptor,"rule orderby_clause");
		RewriteRuleSubtreeStream stream_set_qualifier=new RewriteRuleSubtreeStream(adaptor,"rule set_qualifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// DDL.g:811:3: ( SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) )
			// DDL.g:811:5: SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )?
			{
			SELECT307=(Token)match(input,SELECT,FOLLOW_SELECT_in_query_specification6231); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SELECT.add(SELECT307);

			// DDL.g:811:12: ( set_qualifier )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==ALL||LA89_0==DISTINCT) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// DDL.g:811:12: set_qualifier
					{
					pushFollow(FOLLOW_set_qualifier_in_query_specification6233);
					set_qualifier308=set_qualifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_set_qualifier.add(set_qualifier308.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_select_list_in_query_specification6236);
			select_list309=select_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_select_list.add(select_list309.getTree());
			// DDL.g:811:39: ( from_clause )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==FROM) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// DDL.g:811:39: from_clause
					{
					pushFollow(FOLLOW_from_clause_in_query_specification6238);
					from_clause310=from_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_from_clause.add(from_clause310.getTree());
					}
					break;

			}

			// DDL.g:811:52: ( where_clause )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==WHERE) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// DDL.g:811:52: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_query_specification6241);
					where_clause311=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause311.getTree());
					}
					break;

			}

			// DDL.g:811:66: ( groupby_clause )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==GROUP) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// DDL.g:811:66: groupby_clause
					{
					pushFollow(FOLLOW_groupby_clause_in_query_specification6244);
					groupby_clause312=groupby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_clause.add(groupby_clause312.getTree());
					}
					break;

			}

			// DDL.g:811:82: ( having_clause )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==HAVING) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// DDL.g:811:82: having_clause
					{
					pushFollow(FOLLOW_having_clause_in_query_specification6247);
					having_clause313=having_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_having_clause.add(having_clause313.getTree());
					}
					break;

			}

			// DDL.g:812:5: ( orderby_clause )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==ORDER) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// DDL.g:812:5: orderby_clause
					{
					pushFollow(FOLLOW_orderby_clause_in_query_specification6254);
					orderby_clause314=orderby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_clause.add(orderby_clause314.getTree());
					}
					break;

			}

			// DDL.g:812:21: ( limit_clause )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==LIMIT) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// DDL.g:812:21: limit_clause
					{
					pushFollow(FOLLOW_limit_clause_in_query_specification6257);
					limit_clause315=limit_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_limit_clause.add(limit_clause315.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: from_clause, select_list, where_clause, groupby_clause, having_clause, limit_clause, orderby_clause, set_qualifier, SELECT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 813:5: -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
			{
				// DDL.g:813:8: ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SELECT.nextNode(), root_1);
				// DDL.g:813:17: ( from_clause )?
				if ( stream_from_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_from_clause.nextTree());
				}
				stream_from_clause.reset();

				// DDL.g:813:30: ( set_qualifier )?
				if ( stream_set_qualifier.hasNext() ) {
					adaptor.addChild(root_1, stream_set_qualifier.nextTree());
				}
				stream_set_qualifier.reset();

				adaptor.addChild(root_1, stream_select_list.nextTree());
				// DDL.g:813:57: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				// DDL.g:813:71: ( groupby_clause )?
				if ( stream_groupby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_clause.nextTree());
				}
				stream_groupby_clause.reset();

				// DDL.g:814:5: ( having_clause )?
				if ( stream_having_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_having_clause.nextTree());
				}
				stream_having_clause.reset();

				// DDL.g:814:20: ( orderby_clause )?
				if ( stream_orderby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_orderby_clause.nextTree());
				}
				stream_orderby_clause.reset();

				// DDL.g:814:36: ( limit_clause )?
				if ( stream_limit_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_limit_clause.nextTree());
				}
				stream_limit_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, query_specification_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "query_specification"


	public static class select_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "select_list"
	// DDL.g:816:1: select_list : ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) );
	public final DDLParser.select_list_return select_list() throws RecognitionException {
		DDLParser.select_list_return retval = new DDLParser.select_list_return();
		retval.start = input.LT(1);
		int select_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token MULTIPLY316=null;
		Token COMMA318=null;
		ParserRuleReturnScope derived_column317 =null;
		ParserRuleReturnScope derived_column319 =null;

		CommonTree MULTIPLY316_tree=null;
		CommonTree COMMA318_tree=null;
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_derived_column=new RewriteRuleSubtreeStream(adaptor,"rule derived_column");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// DDL.g:817:3: ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==MULTIPLY) ) {
				alt97=1;
			}
			else if ( (LA97_0==CASE||LA97_0==COUNT||LA97_0==Character_String_Literal||LA97_0==Identifier||LA97_0==LEFT_PAREN||LA97_0==MINUS||LA97_0==NOT||LA97_0==NULL||LA97_0==NUMBER||LA97_0==PLUS||LA97_0==REAL_NUMBER) ) {
				alt97=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// DDL.g:817:5: MULTIPLY
					{
					MULTIPLY316=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_select_list6307); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY316);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 817:14: -> ^( SEL_LIST ALL )
					{
						// DDL.g:817:17: ^( SEL_LIST ALL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEL_LIST, "SEL_LIST"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ALL, "ALL"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:818:5: derived_column ( COMMA derived_column )*
					{
					pushFollow(FOLLOW_derived_column_in_select_list6321);
					derived_column317=derived_column();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_derived_column.add(derived_column317.getTree());
					// DDL.g:818:20: ( COMMA derived_column )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==COMMA) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// DDL.g:818:21: COMMA derived_column
							{
							COMMA318=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list6324); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA318);

							pushFollow(FOLLOW_derived_column_in_select_list6326);
							derived_column319=derived_column();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_derived_column.add(derived_column319.getTree());
							}
							break;

						default :
							break loop96;
						}
					}

					// AST REWRITE
					// elements: derived_column
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 818:44: -> ^( SEL_LIST ( derived_column )+ )
					{
						// DDL.g:818:47: ^( SEL_LIST ( derived_column )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEL_LIST, "SEL_LIST"), root_1);
						if ( !(stream_derived_column.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_derived_column.hasNext() ) {
							adaptor.addChild(root_1, stream_derived_column.nextTree());
						}
						stream_derived_column.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, select_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "select_list"


	public static class set_qualifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_qualifier"
	// DDL.g:820:1: set_qualifier : ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) );
	public final DDLParser.set_qualifier_return set_qualifier() throws RecognitionException {
		DDLParser.set_qualifier_return retval = new DDLParser.set_qualifier_return();
		retval.start = input.LT(1);
		int set_qualifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DISTINCT320=null;
		Token ALL321=null;

		CommonTree DISTINCT320_tree=null;
		CommonTree ALL321_tree=null;
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// DDL.g:821:3: ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==DISTINCT) ) {
				alt98=1;
			}
			else if ( (LA98_0==ALL) ) {
				alt98=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// DDL.g:821:5: DISTINCT
					{
					DISTINCT320=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_set_qualifier6349); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT320);

					// AST REWRITE
					// elements: DISTINCT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 821:14: -> ^( SET_QUALIFIER DISTINCT )
					{
						// DDL.g:821:17: ^( SET_QUALIFIER DISTINCT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_QUALIFIER, "SET_QUALIFIER"), root_1);
						adaptor.addChild(root_1, stream_DISTINCT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:822:5: ALL
					{
					ALL321=(Token)match(input,ALL,FOLLOW_ALL_in_set_qualifier6363); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL321);

					// AST REWRITE
					// elements: ALL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 822:9: -> ^( SET_QUALIFIER ALL )
					{
						// DDL.g:822:12: ^( SET_QUALIFIER ALL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_QUALIFIER, "SET_QUALIFIER"), root_1);
						adaptor.addChild(root_1, stream_ALL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, set_qualifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set_qualifier"


	public static class derived_column_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "derived_column"
	// DDL.g:824:1: derived_column : boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) ;
	public final DDLParser.derived_column_return derived_column() throws RecognitionException {
		DDLParser.derived_column_return retval = new DDLParser.derived_column_return();
		retval.start = input.LT(1);
		int derived_column_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression322 =null;
		ParserRuleReturnScope as_clause323 =null;

		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");
		RewriteRuleSubtreeStream stream_as_clause=new RewriteRuleSubtreeStream(adaptor,"rule as_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// DDL.g:825:3: ( boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) )
			// DDL.g:825:5: boolean_value_expression ( as_clause )?
			{
			pushFollow(FOLLOW_boolean_value_expression_in_derived_column6383);
			boolean_value_expression322=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression322.getTree());
			// DDL.g:825:30: ( as_clause )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==AS||LA99_0==Identifier) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// DDL.g:825:30: as_clause
					{
					pushFollow(FOLLOW_as_clause_in_derived_column6385);
					as_clause323=as_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_as_clause.add(as_clause323.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: boolean_value_expression, as_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 825:41: -> ^( COLUMN boolean_value_expression ( as_clause )? )
			{
				// DDL.g:825:44: ^( COLUMN boolean_value_expression ( as_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN, "COLUMN"), root_1);
				adaptor.addChild(root_1, stream_boolean_value_expression.nextTree());
				// DDL.g:825:78: ( as_clause )?
				if ( stream_as_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_as_clause.nextTree());
				}
				stream_as_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, derived_column_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "derived_column"


	public static class column_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "column_reference"
	// DDL.g:828:1: column_reference : c= Identifier -> ^( COLUMN_NAME $c) ;
	public final DDLParser.column_reference_return column_reference() throws RecognitionException {
		DDLParser.column_reference_return retval = new DDLParser.column_reference_return();
		retval.start = input.LT(1);
		int column_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;

		CommonTree c_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// DDL.g:829:2: (c= Identifier -> ^( COLUMN_NAME $c) )
			// DDL.g:829:4: c= Identifier
			{
			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_column_reference6413); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// AST REWRITE
			// elements: c
			// token labels: c
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 829:17: -> ^( COLUMN_NAME $c)
			{
				// DDL.g:829:20: ^( COLUMN_NAME $c)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN_NAME, "COLUMN_NAME"), root_1);
				adaptor.addChild(root_1, stream_c.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, column_reference_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "column_reference"


	public static class as_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "as_clause"
	// DDL.g:832:1: as_clause : ( AS )? column_reference ;
	public final DDLParser.as_clause_return as_clause() throws RecognitionException {
		DDLParser.as_clause_return retval = new DDLParser.as_clause_return();
		retval.start = input.LT(1);
		int as_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AS324=null;
		ParserRuleReturnScope column_reference325 =null;

		CommonTree AS324_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// DDL.g:833:3: ( ( AS )? column_reference )
			// DDL.g:833:5: ( AS )? column_reference
			{
			root_0 = (CommonTree)adaptor.nil();


			// DDL.g:833:5: ( AS )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==AS) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// DDL.g:833:6: AS
					{
					AS324=(Token)match(input,AS,FOLLOW_AS_in_as_clause6436); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AS324_tree = (CommonTree)adaptor.create(AS324);
					adaptor.addChild(root_0, AS324_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_column_reference_in_as_clause6440);
			column_reference325=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference325.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, as_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "as_clause"


	public static class column_reference_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "column_reference_list"
	// DDL.g:835:1: column_reference_list : column_reference ( COMMA column_reference )* -> ( column_reference )+ ;
	public final DDLParser.column_reference_list_return column_reference_list() throws RecognitionException {
		DDLParser.column_reference_list_return retval = new DDLParser.column_reference_list_return();
		retval.start = input.LT(1);
		int column_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA327=null;
		ParserRuleReturnScope column_reference326 =null;
		ParserRuleReturnScope column_reference328 =null;

		CommonTree COMMA327_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// DDL.g:836:2: ( column_reference ( COMMA column_reference )* -> ( column_reference )+ )
			// DDL.g:836:4: column_reference ( COMMA column_reference )*
			{
			pushFollow(FOLLOW_column_reference_in_column_reference_list6451);
			column_reference326=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(column_reference326.getTree());
			// DDL.g:836:21: ( COMMA column_reference )*
			loop101:
			while (true) {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==COMMA) ) {
					int LA101_2 = input.LA(2);
					if ( (LA101_2==Identifier) ) {
						int LA101_3 = input.LA(3);
						if ( (synpred151_DDL()) ) {
							alt101=1;
						}

					}

				}

				switch (alt101) {
				case 1 :
					// DDL.g:836:22: COMMA column_reference
					{
					COMMA327=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_reference_list6454); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA327);

					pushFollow(FOLLOW_column_reference_in_column_reference_list6456);
					column_reference328=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_column_reference.add(column_reference328.getTree());
					}
					break;

				default :
					break loop101;
				}
			}

			// AST REWRITE
			// elements: column_reference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 836:47: -> ( column_reference )+
			{
				if ( !(stream_column_reference.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_column_reference.hasNext() ) {
					adaptor.addChild(root_0, stream_column_reference.nextTree());
				}
				stream_column_reference.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, column_reference_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "column_reference_list"


	public static class table_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table"
	// DDL.g:838:1: table : ( Identifier | qualified_identifier );
	public final DDLParser.table_return table() throws RecognitionException {
		DDLParser.table_return retval = new DDLParser.table_return();
		retval.start = input.LT(1);
		int table_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier329=null;
		ParserRuleReturnScope qualified_identifier330 =null;

		CommonTree Identifier329_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// DDL.g:839:3: ( Identifier | qualified_identifier )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==Identifier) ) {
				int LA102_1 = input.LA(2);
				if ( (LA102_1==DIVIDE) ) {
					alt102=2;
				}
				else if ( (LA102_1==EOF||LA102_1==AS||LA102_1==CASCADE||LA102_1==COMMA||LA102_1==CROSS||LA102_1==EXCEPT||LA102_1==FOR||LA102_1==FULL||LA102_1==GROUP||LA102_1==HAVING||LA102_1==IN||LA102_1==INNER||LA102_1==INTERSECT||LA102_1==Identifier||LA102_1==JOIN||(LA102_1 >= LEFT && LA102_1 <= LEFT_PAREN)||LA102_1==LIMIT||LA102_1==NATURAL||LA102_1==ON||LA102_1==ORDER||(LA102_1 >= RESTRICT && LA102_1 <= RIGHT_PAREN)||LA102_1==TO||LA102_1==UNION||LA102_1==USING||(LA102_1 >= WHERE && LA102_1 <= WITH)||LA102_1==277) ) {
					alt102=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// DDL.g:839:5: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier329=(Token)match(input,Identifier,FOLLOW_Identifier_in_table6474); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier329_tree = (CommonTree)adaptor.create(Identifier329);
					adaptor.addChild(root_0, Identifier329_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:841:5: qualified_identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_identifier_in_table6486);
					qualified_identifier330=qualified_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_identifier330.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, table_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table"


	public static class qualified_identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualified_identifier"
	// DDL.g:844:1: qualified_identifier : l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )? -> ^( QUALIFIED $l $f ( $m)? ) ;
	public final DDLParser.qualified_identifier_return qualified_identifier() throws RecognitionException {
		DDLParser.qualified_identifier_return retval = new DDLParser.qualified_identifier_return();
		retval.start = input.LT(1);
		int qualified_identifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE331=null;
		Token LEFT_PAREN332=null;
		Token RIGHT_PAREN333=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE331_tree=null;
		CommonTree LEFT_PAREN332_tree=null;
		CommonTree RIGHT_PAREN333_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// DDL.g:845:3: (l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )? -> ^( QUALIFIED $l $f ( $m)? ) )
			// DDL.g:845:5: l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )?
			{
			l=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6501); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(l);

			DIVIDE331=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_qualified_identifier6503); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE331);

			f=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6507); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(f);

			// DDL.g:845:38: ( LEFT_PAREN m= Identifier RIGHT_PAREN )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==LEFT_PAREN) ) {
				int LA103_1 = input.LA(2);
				if ( (LA103_1==Identifier) ) {
					int LA103_3 = input.LA(3);
					if ( (LA103_3==RIGHT_PAREN) ) {
						int LA103_4 = input.LA(4);
						if ( (synpred153_DDL()) ) {
							alt103=1;
						}
					}
				}
			}
			switch (alt103) {
				case 1 :
					// DDL.g:845:39: LEFT_PAREN m= Identifier RIGHT_PAREN
					{
					LEFT_PAREN332=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_qualified_identifier6510); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN332);

					m=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6514); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(m);

					RIGHT_PAREN333=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_qualified_identifier6516); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN333);

					}
					break;

			}

			// AST REWRITE
			// elements: l, m, f
			// token labels: f, l, m
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
			RewriteRuleTokenStream stream_l=new RewriteRuleTokenStream(adaptor,"token l",l);
			RewriteRuleTokenStream stream_m=new RewriteRuleTokenStream(adaptor,"token m",m);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 845:77: -> ^( QUALIFIED $l $f ( $m)? )
			{
				// DDL.g:845:80: ^( QUALIFIED $l $f ( $m)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED, "QUALIFIED"), root_1);
				adaptor.addChild(root_1, stream_l.nextNode());
				adaptor.addChild(root_1, stream_f.nextNode());
				// DDL.g:845:99: ( $m)?
				if ( stream_m.hasNext() ) {
					adaptor.addChild(root_1, stream_m.nextNode());
				}
				stream_m.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, qualified_identifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualified_identifier"


	public static class member_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "member"
	// DDL.g:848:1: member : l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) ;
	public final DDLParser.member_return member() throws RecognitionException {
		DDLParser.member_return retval = new DDLParser.member_return();
		retval.start = input.LT(1);
		int member_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE334=null;
		Token LEFT_PAREN335=null;
		Token RIGHT_PAREN336=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE334_tree=null;
		CommonTree LEFT_PAREN335_tree=null;
		CommonTree RIGHT_PAREN336_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// DDL.g:848:8: (l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) )
			// DDL.g:849:2: l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN
			{
			l=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6551); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(l);

			DIVIDE334=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_member6553); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE334);

			f=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6557); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(f);

			LEFT_PAREN335=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_member6559); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN335);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6563); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(m);

			RIGHT_PAREN336=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_member6565); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN336);

			// AST REWRITE
			// elements: l, m, f
			// token labels: f, l, m
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
			RewriteRuleTokenStream stream_l=new RewriteRuleTokenStream(adaptor,"token l",l);
			RewriteRuleTokenStream stream_m=new RewriteRuleTokenStream(adaptor,"token m",m);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 849:71: -> ^( MEMBER $l $f $m)
			{
				// DDL.g:849:74: ^( MEMBER $l $f $m)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMBER, "MEMBER"), root_1);
				adaptor.addChild(root_1, stream_l.nextNode());
				adaptor.addChild(root_1, stream_f.nextNode());
				adaptor.addChild(root_1, stream_m.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, member_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "member"


	public static class from_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "from_clause"
	// DDL.g:852:1: from_clause : FROM ^ table_reference_list ;
	public final DDLParser.from_clause_return from_clause() throws RecognitionException {
		DDLParser.from_clause_return retval = new DDLParser.from_clause_return();
		retval.start = input.LT(1);
		int from_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FROM337=null;
		ParserRuleReturnScope table_reference_list338 =null;

		CommonTree FROM337_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// DDL.g:853:3: ( FROM ^ table_reference_list )
			// DDL.g:853:5: FROM ^ table_reference_list
			{
			root_0 = (CommonTree)adaptor.nil();


			FROM337=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause6600); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FROM337_tree = (CommonTree)adaptor.create(FROM337);
			root_0 = (CommonTree)adaptor.becomeRoot(FROM337_tree, root_0);
			}

			pushFollow(FOLLOW_table_reference_list_in_from_clause6603);
			table_reference_list338=table_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_reference_list338.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, from_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "from_clause"


	public static class table_reference_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_reference_list"
	// DDL.g:855:1: table_reference_list : table_reference ( COMMA table_reference )* -> ( table_reference )+ ;
	public final DDLParser.table_reference_list_return table_reference_list() throws RecognitionException {
		DDLParser.table_reference_list_return retval = new DDLParser.table_reference_list_return();
		retval.start = input.LT(1);
		int table_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA340=null;
		ParserRuleReturnScope table_reference339 =null;
		ParserRuleReturnScope table_reference341 =null;

		CommonTree COMMA340_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_table_reference=new RewriteRuleSubtreeStream(adaptor,"rule table_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// DDL.g:856:3: ( table_reference ( COMMA table_reference )* -> ( table_reference )+ )
			// DDL.g:856:4: table_reference ( COMMA table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_reference_list6614);
			table_reference339=table_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_reference.add(table_reference339.getTree());
			// DDL.g:856:20: ( COMMA table_reference )*
			loop104:
			while (true) {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( (LA104_0==COMMA) ) {
					alt104=1;
				}

				switch (alt104) {
				case 1 :
					// DDL.g:856:21: COMMA table_reference
					{
					COMMA340=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_reference_list6617); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA340);

					pushFollow(FOLLOW_table_reference_in_table_reference_list6619);
					table_reference341=table_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table_reference.add(table_reference341.getTree());
					}
					break;

				default :
					break loop104;
				}
			}

			// AST REWRITE
			// elements: table_reference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 856:45: -> ( table_reference )+
			{
				if ( !(stream_table_reference.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_table_reference.hasNext() ) {
					adaptor.addChild(root_0, stream_table_reference.nextTree());
				}
				stream_table_reference.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, table_reference_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table_reference_list"


	public static class table_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_reference"
	// DDL.g:858:1: table_reference : ( table_primary | joined_table );
	public final DDLParser.table_reference_return table_reference() throws RecognitionException {
		DDLParser.table_reference_return retval = new DDLParser.table_reference_return();
		retval.start = input.LT(1);
		int table_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary342 =null;
		ParserRuleReturnScope joined_table343 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// DDL.g:859:3: ( table_primary | joined_table )
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case DIVIDE:
					{
					int LA105_2 = input.LA(3);
					if ( (LA105_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case LEFT_PAREN:
							{
							int LA105_9 = input.LA(5);
							if ( (LA105_9==Identifier) ) {
								int LA105_10 = input.LA(6);
								if ( (LA105_10==RIGHT_PAREN) ) {
									switch ( input.LA(7) ) {
									case AS:
										{
										int LA105_3 = input.LA(8);
										if ( (LA105_3==Identifier) ) {
											switch ( input.LA(9) ) {
											case EOF:
											case COMMA:
											case EXCEPT:
											case GROUP:
											case HAVING:
											case INTERSECT:
											case LIMIT:
											case ORDER:
											case RIGHT_PAREN:
											case WHERE:
												{
												alt105=1;
												}
												break;
											case UNION:
												{
												int LA105_6 = input.LA(10);
												if ( (LA105_6==JOIN) ) {
													alt105=2;
												}
												else if ( (LA105_6==ALL||LA105_6==DISTINCT||LA105_6==Identifier||LA105_6==LEFT_PAREN||LA105_6==SELECT) ) {
													alt105=1;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 105, 6, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

												}
												break;
											case CROSS:
											case FULL:
											case INNER:
											case JOIN:
											case LEFT:
											case NATURAL:
											case RIGHT:
												{
												alt105=2;
												}
												break;
											default:
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 105, 4, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 105, 3, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

										}
										break;
									case Identifier:
										{
										switch ( input.LA(8) ) {
										case EOF:
										case COMMA:
										case EXCEPT:
										case GROUP:
										case HAVING:
										case INTERSECT:
										case LIMIT:
										case ORDER:
										case RIGHT_PAREN:
										case WHERE:
											{
											alt105=1;
											}
											break;
										case UNION:
											{
											int LA105_6 = input.LA(9);
											if ( (LA105_6==JOIN) ) {
												alt105=2;
											}
											else if ( (LA105_6==ALL||LA105_6==DISTINCT||LA105_6==Identifier||LA105_6==LEFT_PAREN||LA105_6==SELECT) ) {
												alt105=1;
											}

											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 105, 6, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

											}
											break;
										case CROSS:
										case FULL:
										case INNER:
										case JOIN:
										case LEFT:
										case NATURAL:
										case RIGHT:
											{
											alt105=2;
											}
											break;
										default:
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 105, 4, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case EOF:
									case COMMA:
									case EXCEPT:
									case GROUP:
									case HAVING:
									case INTERSECT:
									case LIMIT:
									case ORDER:
									case RIGHT_PAREN:
									case WHERE:
										{
										alt105=1;
										}
										break;
									case UNION:
										{
										int LA105_6 = input.LA(8);
										if ( (LA105_6==JOIN) ) {
											alt105=2;
										}
										else if ( (LA105_6==ALL||LA105_6==DISTINCT||LA105_6==Identifier||LA105_6==LEFT_PAREN||LA105_6==SELECT) ) {
											alt105=1;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 105, 6, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

										}
										break;
									case CROSS:
									case FULL:
									case INNER:
									case JOIN:
									case LEFT:
									case NATURAL:
									case RIGHT:
										{
										alt105=2;
										}
										break;
									default:
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 105, 11, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 105, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 105, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case AS:
							{
							int LA105_3 = input.LA(5);
							if ( (LA105_3==Identifier) ) {
								switch ( input.LA(6) ) {
								case EOF:
								case COMMA:
								case EXCEPT:
								case GROUP:
								case HAVING:
								case INTERSECT:
								case LIMIT:
								case ORDER:
								case RIGHT_PAREN:
								case WHERE:
									{
									alt105=1;
									}
									break;
								case UNION:
									{
									int LA105_6 = input.LA(7);
									if ( (LA105_6==JOIN) ) {
										alt105=2;
									}
									else if ( (LA105_6==ALL||LA105_6==DISTINCT||LA105_6==Identifier||LA105_6==LEFT_PAREN||LA105_6==SELECT) ) {
										alt105=1;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 105, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

									}
									break;
								case CROSS:
								case FULL:
								case INNER:
								case JOIN:
								case LEFT:
								case NATURAL:
								case RIGHT:
									{
									alt105=2;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 105, 4, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 105, 3, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case Identifier:
							{
							switch ( input.LA(5) ) {
							case EOF:
							case COMMA:
							case EXCEPT:
							case GROUP:
							case HAVING:
							case INTERSECT:
							case LIMIT:
							case ORDER:
							case RIGHT_PAREN:
							case WHERE:
								{
								alt105=1;
								}
								break;
							case UNION:
								{
								int LA105_6 = input.LA(6);
								if ( (LA105_6==JOIN) ) {
									alt105=2;
								}
								else if ( (LA105_6==ALL||LA105_6==DISTINCT||LA105_6==Identifier||LA105_6==LEFT_PAREN||LA105_6==SELECT) ) {
									alt105=1;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 105, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case CROSS:
							case FULL:
							case INNER:
							case JOIN:
							case LEFT:
							case NATURAL:
							case RIGHT:
								{
								alt105=2;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 105, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case EOF:
						case COMMA:
						case EXCEPT:
						case GROUP:
						case HAVING:
						case INTERSECT:
						case LIMIT:
						case ORDER:
						case RIGHT_PAREN:
						case WHERE:
							{
							alt105=1;
							}
							break;
						case UNION:
							{
							int LA105_6 = input.LA(5);
							if ( (LA105_6==JOIN) ) {
								alt105=2;
							}
							else if ( (LA105_6==ALL||LA105_6==DISTINCT||LA105_6==Identifier||LA105_6==LEFT_PAREN||LA105_6==SELECT) ) {
								alt105=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 105, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case CROSS:
						case FULL:
						case INNER:
						case JOIN:
						case LEFT:
						case NATURAL:
						case RIGHT:
							{
							alt105=2;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 105, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 105, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case AS:
					{
					int LA105_3 = input.LA(3);
					if ( (LA105_3==Identifier) ) {
						switch ( input.LA(4) ) {
						case EOF:
						case COMMA:
						case EXCEPT:
						case GROUP:
						case HAVING:
						case INTERSECT:
						case LIMIT:
						case ORDER:
						case RIGHT_PAREN:
						case WHERE:
							{
							alt105=1;
							}
							break;
						case UNION:
							{
							int LA105_6 = input.LA(5);
							if ( (LA105_6==JOIN) ) {
								alt105=2;
							}
							else if ( (LA105_6==ALL||LA105_6==DISTINCT||LA105_6==Identifier||LA105_6==LEFT_PAREN||LA105_6==SELECT) ) {
								alt105=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 105, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case CROSS:
						case FULL:
						case INNER:
						case JOIN:
						case LEFT:
						case NATURAL:
						case RIGHT:
							{
							alt105=2;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 105, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 105, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case Identifier:
					{
					switch ( input.LA(3) ) {
					case EOF:
					case COMMA:
					case EXCEPT:
					case GROUP:
					case HAVING:
					case INTERSECT:
					case LIMIT:
					case ORDER:
					case RIGHT_PAREN:
					case WHERE:
						{
						alt105=1;
						}
						break;
					case UNION:
						{
						int LA105_6 = input.LA(4);
						if ( (LA105_6==JOIN) ) {
							alt105=2;
						}
						else if ( (LA105_6==ALL||LA105_6==DISTINCT||LA105_6==Identifier||LA105_6==LEFT_PAREN||LA105_6==SELECT) ) {
							alt105=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 105, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case CROSS:
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case NATURAL:
					case RIGHT:
						{
						alt105=2;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 105, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case EOF:
				case COMMA:
				case EXCEPT:
				case GROUP:
				case HAVING:
				case INTERSECT:
				case LIMIT:
				case ORDER:
				case RIGHT_PAREN:
				case WHERE:
					{
					alt105=1;
					}
					break;
				case UNION:
					{
					int LA105_6 = input.LA(3);
					if ( (LA105_6==JOIN) ) {
						alt105=2;
					}
					else if ( (LA105_6==ALL||LA105_6==DISTINCT||LA105_6==Identifier||LA105_6==LEFT_PAREN||LA105_6==SELECT) ) {
						alt105=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 105, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case CROSS:
				case FULL:
				case INNER:
				case JOIN:
				case LEFT:
				case NATURAL:
				case RIGHT:
					{
					alt105=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}

			switch (alt105) {
				case 1 :
					// DDL.g:859:5: table_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_table_primary_in_table_reference6638);
					table_primary342=table_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary342.getTree());

					}
					break;
				case 2 :
					// DDL.g:860:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_table_reference6644);
					joined_table343=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table343.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, table_reference_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table_reference"


	public static class joined_table_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "joined_table"
	// DDL.g:862:1: joined_table : table_primary ( cross_join | qualified_join | natural_join | union_join )+ ;
	public final DDLParser.joined_table_return joined_table() throws RecognitionException {
		DDLParser.joined_table_return retval = new DDLParser.joined_table_return();
		retval.start = input.LT(1);
		int joined_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary344 =null;
		ParserRuleReturnScope cross_join345 =null;
		ParserRuleReturnScope qualified_join346 =null;
		ParserRuleReturnScope natural_join347 =null;
		ParserRuleReturnScope union_join348 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// DDL.g:863:3: ( table_primary ( cross_join | qualified_join | natural_join | union_join )+ )
			// DDL.g:863:5: table_primary ( cross_join | qualified_join | natural_join | union_join )+
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_table_primary_in_joined_table6656);
			table_primary344=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary344.getTree());

			// DDL.g:863:19: ( cross_join | qualified_join | natural_join | union_join )+
			int cnt106=0;
			loop106:
			while (true) {
				int alt106=5;
				switch ( input.LA(1) ) {
				case UNION:
					{
					int LA106_2 = input.LA(2);
					if ( (LA106_2==JOIN) ) {
						alt106=4;
					}

					}
					break;
				case CROSS:
					{
					alt106=1;
					}
					break;
				case FULL:
				case INNER:
				case JOIN:
				case LEFT:
				case RIGHT:
					{
					alt106=2;
					}
					break;
				case NATURAL:
					{
					alt106=3;
					}
					break;
				}
				switch (alt106) {
				case 1 :
					// DDL.g:863:20: cross_join
					{
					pushFollow(FOLLOW_cross_join_in_joined_table6659);
					cross_join345=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join345.getTree());

					}
					break;
				case 2 :
					// DDL.g:863:33: qualified_join
					{
					pushFollow(FOLLOW_qualified_join_in_joined_table6663);
					qualified_join346=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join346.getTree());

					}
					break;
				case 3 :
					// DDL.g:863:50: natural_join
					{
					pushFollow(FOLLOW_natural_join_in_joined_table6667);
					natural_join347=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join347.getTree());

					}
					break;
				case 4 :
					// DDL.g:863:65: union_join
					{
					pushFollow(FOLLOW_union_join_in_joined_table6671);
					union_join348=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join348.getTree());

					}
					break;

				default :
					if ( cnt106 >= 1 ) break loop106;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(106, input);
					throw eee;
				}
				cnt106++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, joined_table_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "joined_table"


	public static class joined_table_prim_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "joined_table_prim"
	// DDL.g:865:1: joined_table_prim : ( cross_join | qualified_join | natural_join | union_join );
	public final DDLParser.joined_table_prim_return joined_table_prim() throws RecognitionException {
		DDLParser.joined_table_prim_return retval = new DDLParser.joined_table_prim_return();
		retval.start = input.LT(1);
		int joined_table_prim_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope cross_join349 =null;
		ParserRuleReturnScope qualified_join350 =null;
		ParserRuleReturnScope natural_join351 =null;
		ParserRuleReturnScope union_join352 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// DDL.g:866:3: ( cross_join | qualified_join | natural_join | union_join )
			int alt107=4;
			switch ( input.LA(1) ) {
			case CROSS:
				{
				alt107=1;
				}
				break;
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
				{
				alt107=2;
				}
				break;
			case NATURAL:
				{
				alt107=3;
				}
				break;
			case UNION:
				{
				alt107=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// DDL.g:866:5: cross_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cross_join_in_joined_table_prim6685);
					cross_join349=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join349.getTree());

					}
					break;
				case 2 :
					// DDL.g:867:5: qualified_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_join_in_joined_table_prim6691);
					qualified_join350=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join350.getTree());

					}
					break;
				case 3 :
					// DDL.g:868:5: natural_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_natural_join_in_joined_table_prim6697);
					natural_join351=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join351.getTree());

					}
					break;
				case 4 :
					// DDL.g:869:5: union_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_union_join_in_joined_table_prim6703);
					union_join352=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join352.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, joined_table_prim_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "joined_table_prim"


	public static class cross_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cross_join"
	// DDL.g:871:1: cross_join : CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) ;
	public final DDLParser.cross_join_return cross_join() throws RecognitionException {
		DDLParser.cross_join_return retval = new DDLParser.cross_join_return();
		retval.start = input.LT(1);
		int cross_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CROSS353=null;
		Token JOIN354=null;
		ParserRuleReturnScope r =null;

		CommonTree CROSS353_tree=null;
		CommonTree JOIN354_tree=null;
		RewriteRuleTokenStream stream_CROSS=new RewriteRuleTokenStream(adaptor,"token CROSS");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// DDL.g:872:3: ( CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) )
			// DDL.g:872:5: CROSS JOIN r= table_primary
			{
			CROSS353=(Token)match(input,CROSS,FOLLOW_CROSS_in_cross_join6715); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CROSS.add(CROSS353);

			JOIN354=(Token)match(input,JOIN,FOLLOW_JOIN_in_cross_join6717); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN354);

			pushFollow(FOLLOW_table_primary_in_cross_join6721);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: CROSS, r, JOIN
			// token labels: 
			// rule labels: retval, r
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 872:32: -> ^( JOIN CROSS $r)
			{
				// DDL.g:872:35: ^( JOIN CROSS $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_CROSS.nextNode());
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, cross_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cross_join"


	public static class qualified_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualified_join"
	// DDL.g:874:1: qualified_join : (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) ;
	public final DDLParser.qualified_join_return qualified_join() throws RecognitionException {
		DDLParser.qualified_join_return retval = new DDLParser.qualified_join_return();
		retval.start = input.LT(1);
		int qualified_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token JOIN355=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope s =null;

		CommonTree JOIN355_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_specification=new RewriteRuleSubtreeStream(adaptor,"rule join_specification");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// DDL.g:875:3: ( (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) )
			// DDL.g:875:5: (t= join_type )? JOIN r= table_primary s= join_specification
			{
			// DDL.g:875:5: (t= join_type )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==FULL||LA108_0==INNER||LA108_0==LEFT||LA108_0==RIGHT) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// DDL.g:875:6: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_qualified_join6747);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN355=(Token)match(input,JOIN,FOLLOW_JOIN_in_qualified_join6751); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN355);

			pushFollow(FOLLOW_table_primary_in_qualified_join6755);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			pushFollow(FOLLOW_join_specification_in_qualified_join6759);
			s=join_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_join_specification.add(s.getTree());
			// AST REWRITE
			// elements: JOIN, s, t, r
			// token labels: 
			// rule labels: retval, t, s, r
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 875:62: -> ^( JOIN ( $t)? $r $s)
			{
				// DDL.g:875:65: ^( JOIN ( $t)? $r $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				// DDL.g:875:73: ( $t)?
				if ( stream_t.hasNext() ) {
					adaptor.addChild(root_1, stream_t.nextTree());
				}
				stream_t.reset();

				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_1, stream_s.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, qualified_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "qualified_join"


	public static class natural_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "natural_join"
	// DDL.g:877:1: natural_join : NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) ;
	public final DDLParser.natural_join_return natural_join() throws RecognitionException {
		DDLParser.natural_join_return retval = new DDLParser.natural_join_return();
		retval.start = input.LT(1);
		int natural_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NATURAL356=null;
		Token JOIN357=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;

		CommonTree NATURAL356_tree=null;
		CommonTree JOIN357_tree=null;
		RewriteRuleTokenStream stream_NATURAL=new RewriteRuleTokenStream(adaptor,"token NATURAL");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// DDL.g:878:3: ( NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) )
			// DDL.g:878:5: NATURAL (t= join_type )? JOIN r= table_primary
			{
			NATURAL356=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_natural_join6787); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NATURAL.add(NATURAL356);

			// DDL.g:878:13: (t= join_type )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==FULL||LA109_0==INNER||LA109_0==LEFT||LA109_0==RIGHT) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// DDL.g:878:14: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_natural_join6792);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN357=(Token)match(input,JOIN,FOLLOW_JOIN_in_natural_join6796); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN357);

			pushFollow(FOLLOW_table_primary_in_natural_join6800);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: t, JOIN, r, NATURAL
			// token labels: 
			// rule labels: retval, t, r
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 878:49: -> ^( JOIN NATURAL ( $t)? $r)
			{
				// DDL.g:878:52: ^( JOIN NATURAL ( $t)? $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_NATURAL.nextNode());
				// DDL.g:878:68: ( $t)?
				if ( stream_t.hasNext() ) {
					adaptor.addChild(root_1, stream_t.nextTree());
				}
				stream_t.reset();

				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, natural_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "natural_join"


	public static class union_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "union_join"
	// DDL.g:880:1: union_join : UNION JOIN r= table_primary -> ^( JOIN UNION $r) ;
	public final DDLParser.union_join_return union_join() throws RecognitionException {
		DDLParser.union_join_return retval = new DDLParser.union_join_return();
		retval.start = input.LT(1);
		int union_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token UNION358=null;
		Token JOIN359=null;
		ParserRuleReturnScope r =null;

		CommonTree UNION358_tree=null;
		CommonTree JOIN359_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// DDL.g:881:3: ( UNION JOIN r= table_primary -> ^( JOIN UNION $r) )
			// DDL.g:881:5: UNION JOIN r= table_primary
			{
			UNION358=(Token)match(input,UNION,FOLLOW_UNION_in_union_join6827); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNION.add(UNION358);

			JOIN359=(Token)match(input,JOIN,FOLLOW_JOIN_in_union_join6829); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN359);

			pushFollow(FOLLOW_table_primary_in_union_join6833);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: r, UNION, JOIN
			// token labels: 
			// rule labels: retval, r
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 881:32: -> ^( JOIN UNION $r)
			{
				// DDL.g:881:35: ^( JOIN UNION $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_UNION.nextNode());
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, union_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "union_join"


	public static class join_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "join_type"
	// DDL.g:883:1: join_type : ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) );
	public final DDLParser.join_type_return join_type() throws RecognitionException {
		DDLParser.join_type_return retval = new DDLParser.join_type_return();
		retval.start = input.LT(1);
		int join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INNER360=null;
		Token OUTER361=null;
		ParserRuleReturnScope t =null;

		CommonTree INNER360_tree=null;
		CommonTree OUTER361_tree=null;
		RewriteRuleTokenStream stream_OUTER=new RewriteRuleTokenStream(adaptor,"token OUTER");
		RewriteRuleSubtreeStream stream_outer_join_type=new RewriteRuleSubtreeStream(adaptor,"rule outer_join_type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// DDL.g:884:3: ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) )
			int alt110=3;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==INNER) ) {
				alt110=1;
			}
			else if ( (LA110_0==FULL||LA110_0==LEFT||LA110_0==RIGHT) ) {
				int LA110_2 = input.LA(2);
				if ( (LA110_2==OUTER) ) {
					alt110=2;
				}
				else if ( (LA110_2==EOF||LA110_2==JOIN) ) {
					alt110=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 110, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}

			switch (alt110) {
				case 1 :
					// DDL.g:884:5: INNER
					{
					root_0 = (CommonTree)adaptor.nil();


					INNER360=(Token)match(input,INNER,FOLLOW_INNER_in_join_type6856); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INNER360_tree = (CommonTree)adaptor.create(INNER360);
					adaptor.addChild(root_0, INNER360_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:885:5: t= outer_join_type OUTER
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type6864);
					t=outer_join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_outer_join_type.add(t.getTree());
					OUTER361=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_type6866); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OUTER.add(OUTER361);

					// AST REWRITE
					// elements: t, OUTER
					// token labels: 
					// rule labels: retval, t
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 885:29: -> ^( OUTER $t)
					{
						// DDL.g:885:32: ^( OUTER $t)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_OUTER.nextNode(), root_1);
						adaptor.addChild(root_1, stream_t.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DDL.g:886:5: t= outer_join_type
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type6883);
					t=outer_join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_outer_join_type.add(t.getTree());
					// AST REWRITE
					// elements: t
					// token labels: 
					// rule labels: retval, t
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 886:23: -> ^( OUTER $t)
					{
						// DDL.g:886:26: ^( OUTER $t)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OUTER, "OUTER"), root_1);
						adaptor.addChild(root_1, stream_t.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, join_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "join_type"


	public static class outer_join_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "outer_join_type"
	// DDL.g:888:1: outer_join_type : ( LEFT | RIGHT | FULL );
	public final DDLParser.outer_join_type_return outer_join_type() throws RecognitionException {
		DDLParser.outer_join_type_return retval = new DDLParser.outer_join_type_return();
		retval.start = input.LT(1);
		int outer_join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set362=null;

		CommonTree set362_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// DDL.g:889:3: ( LEFT | RIGHT | FULL )
			// DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set362=input.LT(1);
			if ( input.LA(1)==FULL||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set362));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, outer_join_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "outer_join_type"


	public static class join_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "join_specification"
	// DDL.g:893:1: join_specification : ( join_condition | named_columns_join );
	public final DDLParser.join_specification_return join_specification() throws RecognitionException {
		DDLParser.join_specification_return retval = new DDLParser.join_specification_return();
		retval.start = input.LT(1);
		int join_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope join_condition363 =null;
		ParserRuleReturnScope named_columns_join364 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// DDL.g:894:3: ( join_condition | named_columns_join )
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==ON) ) {
				alt111=1;
			}
			else if ( (LA111_0==USING) ) {
				alt111=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}

			switch (alt111) {
				case 1 :
					// DDL.g:894:5: join_condition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_join_condition_in_join_specification6928);
					join_condition363=join_condition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, join_condition363.getTree());

					}
					break;
				case 2 :
					// DDL.g:895:5: named_columns_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_named_columns_join_in_join_specification6934);
					named_columns_join364=named_columns_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, named_columns_join364.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, join_specification_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "join_specification"


	public static class join_condition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "join_condition"
	// DDL.g:897:1: join_condition : ON ^ search_condition ;
	public final DDLParser.join_condition_return join_condition() throws RecognitionException {
		DDLParser.join_condition_return retval = new DDLParser.join_condition_return();
		retval.start = input.LT(1);
		int join_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ON365=null;
		ParserRuleReturnScope search_condition366 =null;

		CommonTree ON365_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// DDL.g:898:3: ( ON ^ search_condition )
			// DDL.g:898:5: ON ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			ON365=(Token)match(input,ON,FOLLOW_ON_in_join_condition6946); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ON365_tree = (CommonTree)adaptor.create(ON365);
			root_0 = (CommonTree)adaptor.becomeRoot(ON365_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_join_condition6949);
			search_condition366=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition366.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, join_condition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "join_condition"


	public static class named_columns_join_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "named_columns_join"
	// DDL.g:900:1: named_columns_join : USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) ;
	public final DDLParser.named_columns_join_return named_columns_join() throws RecognitionException {
		DDLParser.named_columns_join_return retval = new DDLParser.named_columns_join_return();
		retval.start = input.LT(1);
		int named_columns_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token USING367=null;
		Token LEFT_PAREN368=null;
		Token RIGHT_PAREN369=null;
		ParserRuleReturnScope f =null;

		CommonTree USING367_tree=null;
		CommonTree LEFT_PAREN368_tree=null;
		CommonTree RIGHT_PAREN369_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleSubtreeStream stream_column_reference_list=new RewriteRuleSubtreeStream(adaptor,"rule column_reference_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// DDL.g:901:3: ( USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) )
			// DDL.g:901:5: USING LEFT_PAREN f= column_reference_list RIGHT_PAREN
			{
			USING367=(Token)match(input,USING,FOLLOW_USING_in_named_columns_join6961); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING367);

			LEFT_PAREN368=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_named_columns_join6963); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN368);

			pushFollow(FOLLOW_column_reference_list_in_named_columns_join6967);
			f=column_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference_list.add(f.getTree());
			RIGHT_PAREN369=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_named_columns_join6969); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN369);

			// AST REWRITE
			// elements: f, USING
			// token labels: 
			// rule labels: f, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 901:58: -> ^( USING $f)
			{
				// DDL.g:901:61: ^( USING $f)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_1);
				adaptor.addChild(root_1, stream_f.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, named_columns_join_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "named_columns_join"


	public static class table_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_primary"
	// DDL.g:903:1: table_primary : table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) ;
	public final DDLParser.table_primary_return table_primary() throws RecognitionException {
		DDLParser.table_primary_return retval = new DDLParser.table_primary_return();
		retval.start = input.LT(1);
		int table_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token a=null;
		Token AS371=null;
		ParserRuleReturnScope table370 =null;

		CommonTree a_tree=null;
		CommonTree AS371_tree=null;
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// DDL.g:904:3: ( table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) )
			// DDL.g:904:5: table ( ( AS )? a= Identifier )?
			{
			pushFollow(FOLLOW_table_in_table_primary6990);
			table370=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(table370.getTree());
			// DDL.g:904:11: ( ( AS )? a= Identifier )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==AS||LA113_0==Identifier) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// DDL.g:904:12: ( AS )? a= Identifier
					{
					// DDL.g:904:12: ( AS )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==AS) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// DDL.g:904:13: AS
							{
							AS371=(Token)match(input,AS,FOLLOW_AS_in_table_primary6994); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AS.add(AS371);

							}
							break;

					}

					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_table_primary7000); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(a);

					}
					break;

			}

			// AST REWRITE
			// elements: table, a
			// token labels: a
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 904:33: -> ^( TABLE table ( $a)? )
			{
				// DDL.g:904:36: ^( TABLE table ( $a)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE, "TABLE"), root_1);
				adaptor.addChild(root_1, stream_table.nextTree());
				// DDL.g:904:50: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextNode());
				}
				stream_a.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, table_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "table_primary"


	public static class where_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "where_clause"
	// DDL.g:906:1: where_clause : WHERE ^ search_condition ;
	public final DDLParser.where_clause_return where_clause() throws RecognitionException {
		DDLParser.where_clause_return retval = new DDLParser.where_clause_return();
		retval.start = input.LT(1);
		int where_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHERE372=null;
		ParserRuleReturnScope search_condition373 =null;

		CommonTree WHERE372_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// DDL.g:907:3: ( WHERE ^ search_condition )
			// DDL.g:907:5: WHERE ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			WHERE372=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause7028); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHERE372_tree = (CommonTree)adaptor.create(WHERE372);
			root_0 = (CommonTree)adaptor.becomeRoot(WHERE372_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_where_clause7031);
			search_condition373=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition373.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, where_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "where_clause"


	public static class routine_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "routine_invocation"
	// DDL.g:915:1: routine_invocation : ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) );
	public final DDLParser.routine_invocation_return routine_invocation() throws RecognitionException {
		DDLParser.routine_invocation_return retval = new DDLParser.routine_invocation_return();
		retval.start = input.LT(1);
		int routine_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier374=null;
		Token LEFT_PAREN375=null;
		Token RIGHT_PAREN377=null;
		Token COUNT378=null;
		Token LEFT_PAREN379=null;
		Token RIGHT_PAREN381=null;
		Token COUNT382=null;
		Token LEFT_PAREN383=null;
		Token MULTIPLY384=null;
		Token RIGHT_PAREN385=null;
		ParserRuleReturnScope funcArgs376 =null;
		ParserRuleReturnScope funcArgs380 =null;

		CommonTree Identifier374_tree=null;
		CommonTree LEFT_PAREN375_tree=null;
		CommonTree RIGHT_PAREN377_tree=null;
		CommonTree COUNT378_tree=null;
		CommonTree LEFT_PAREN379_tree=null;
		CommonTree RIGHT_PAREN381_tree=null;
		CommonTree COUNT382_tree=null;
		CommonTree LEFT_PAREN383_tree=null;
		CommonTree MULTIPLY384_tree=null;
		CommonTree RIGHT_PAREN385_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_funcArgs=new RewriteRuleSubtreeStream(adaptor,"rule funcArgs");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// DDL.g:916:2: ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) )
			int alt115=3;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==Identifier) ) {
				alt115=1;
			}
			else if ( (LA115_0==COUNT) ) {
				int LA115_2 = input.LA(2);
				if ( (LA115_2==LEFT_PAREN) ) {
					int LA115_3 = input.LA(3);
					if ( (LA115_3==MULTIPLY) ) {
						alt115=3;
					}
					else if ( (LA115_3==CASE||LA115_3==COUNT||LA115_3==Character_String_Literal||LA115_3==Identifier||LA115_3==LEFT_PAREN||LA115_3==MINUS||LA115_3==NOT||LA115_3==NULL||LA115_3==NUMBER||LA115_3==PLUS||LA115_3==REAL_NUMBER) ) {
						alt115=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 115, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 115, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 115, 0, input);
				throw nvae;
			}

			switch (alt115) {
				case 1 :
					// DDL.g:916:4: Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN
					{
					Identifier374=(Token)match(input,Identifier,FOLLOW_Identifier_in_routine_invocation7044); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier374);

					LEFT_PAREN375=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7046); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN375);

					// DDL.g:916:26: ( funcArgs )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==CASE||LA114_0==COUNT||LA114_0==Character_String_Literal||LA114_0==Identifier||LA114_0==LEFT_PAREN||LA114_0==MINUS||LA114_0==NOT||LA114_0==NULL||LA114_0==NUMBER||LA114_0==PLUS||LA114_0==REAL_NUMBER) ) {
						alt114=1;
					}
					switch (alt114) {
						case 1 :
							// DDL.g:916:26: funcArgs
							{
							pushFollow(FOLLOW_funcArgs_in_routine_invocation7048);
							funcArgs376=funcArgs();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs376.getTree());
							}
							break;

					}

					RIGHT_PAREN377=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7051); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN377);

					// AST REWRITE
					// elements: funcArgs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 916:48: -> ^( FUNCTION[$Identifier.text] ( funcArgs )? )
					{
						// DDL.g:916:51: ^( FUNCTION[$Identifier.text] ( funcArgs )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, (Identifier374!=null?Identifier374.getText():null)), root_1);
						// DDL.g:916:80: ( funcArgs )?
						if ( stream_funcArgs.hasNext() ) {
							adaptor.addChild(root_1, stream_funcArgs.nextTree());
						}
						stream_funcArgs.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:917:4: COUNT LEFT_PAREN funcArgs RIGHT_PAREN
					{
					COUNT378=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation7066); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT378);

					LEFT_PAREN379=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7068); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN379);

					pushFollow(FOLLOW_funcArgs_in_routine_invocation7070);
					funcArgs380=funcArgs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs380.getTree());
					RIGHT_PAREN381=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7072); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN381);

					// AST REWRITE
					// elements: funcArgs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 917:42: -> ^( COUNT_VAL funcArgs )
					{
						// DDL.g:917:45: ^( COUNT_VAL funcArgs )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COUNT_VAL, "COUNT_VAL"), root_1);
						adaptor.addChild(root_1, stream_funcArgs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DDL.g:918:4: COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN
					{
					COUNT382=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation7085); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT382);

					LEFT_PAREN383=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7087); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN383);

					MULTIPLY384=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_routine_invocation7089); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY384);

					RIGHT_PAREN385=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7091); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN385);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 918:42: -> ^( COUNT_ROWS )
					{
						// DDL.g:918:45: ^( COUNT_ROWS )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COUNT_ROWS, "COUNT_ROWS"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 105, routine_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "routine_invocation"


	public static class funcArgs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "funcArgs"
	// DDL.g:920:1: funcArgs : boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ ;
	public final DDLParser.funcArgs_return funcArgs() throws RecognitionException {
		DDLParser.funcArgs_return retval = new DDLParser.funcArgs_return();
		retval.start = input.LT(1);
		int funcArgs_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA387=null;
		ParserRuleReturnScope boolean_value_expression386 =null;
		ParserRuleReturnScope boolean_value_expression388 =null;

		CommonTree COMMA387_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// DDL.g:921:3: ( boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ )
			// DDL.g:921:5: boolean_value_expression ( COMMA boolean_value_expression )*
			{
			pushFollow(FOLLOW_boolean_value_expression_in_funcArgs7108);
			boolean_value_expression386=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression386.getTree());
			// DDL.g:921:30: ( COMMA boolean_value_expression )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==COMMA) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// DDL.g:921:31: COMMA boolean_value_expression
					{
					COMMA387=(Token)match(input,COMMA,FOLLOW_COMMA_in_funcArgs7111); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA387);

					pushFollow(FOLLOW_boolean_value_expression_in_funcArgs7113);
					boolean_value_expression388=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression388.getTree());
					}
					break;

				default :
					break loop116;
				}
			}

			// AST REWRITE
			// elements: boolean_value_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 921:64: -> ( boolean_value_expression )+
			{
				if ( !(stream_boolean_value_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_boolean_value_expression.hasNext() ) {
					adaptor.addChild(root_0, stream_boolean_value_expression.nextTree());
				}
				stream_boolean_value_expression.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 106, funcArgs_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "funcArgs"


	public static class groupby_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "groupby_clause"
	// DDL.g:928:1: groupby_clause : GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) ;
	public final DDLParser.groupby_clause_return groupby_clause() throws RecognitionException {
		DDLParser.groupby_clause_return retval = new DDLParser.groupby_clause_return();
		retval.start = input.LT(1);
		int groupby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token GROUP389=null;
		Token BY390=null;
		ParserRuleReturnScope g =null;

		CommonTree GROUP389_tree=null;
		CommonTree BY390_tree=null;
		RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleSubtreeStream stream_grouping_element_list=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// DDL.g:929:3: ( GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) )
			// DDL.g:929:5: GROUP BY g= grouping_element_list
			{
			GROUP389=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupby_clause7134); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_GROUP.add(GROUP389);

			BY390=(Token)match(input,BY,FOLLOW_BY_in_groupby_clause7136); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY390);

			pushFollow(FOLLOW_grouping_element_list_in_groupby_clause7140);
			g=grouping_element_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_grouping_element_list.add(g.getTree());
			// AST REWRITE
			// elements: g
			// token labels: 
			// rule labels: g, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_g=new RewriteRuleSubtreeStream(adaptor,"rule g",g!=null?g.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 929:38: -> ^( GROUP_BY $g)
			{
				// DDL.g:929:41: ^( GROUP_BY $g)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GROUP_BY, "GROUP_BY"), root_1);
				adaptor.addChild(root_1, stream_g.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, groupby_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "groupby_clause"


	public static class grouping_element_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "grouping_element_list"
	// DDL.g:931:1: grouping_element_list : grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ ;
	public final DDLParser.grouping_element_list_return grouping_element_list() throws RecognitionException {
		DDLParser.grouping_element_list_return retval = new DDLParser.grouping_element_list_return();
		retval.start = input.LT(1);
		int grouping_element_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA392=null;
		ParserRuleReturnScope grouping_element391 =null;
		ParserRuleReturnScope grouping_element393 =null;

		CommonTree COMMA392_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_grouping_element=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// DDL.g:932:3: ( grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ )
			// DDL.g:932:5: grouping_element ( COMMA grouping_element )*
			{
			pushFollow(FOLLOW_grouping_element_in_grouping_element_list7161);
			grouping_element391=grouping_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element391.getTree());
			// DDL.g:932:22: ( COMMA grouping_element )*
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==COMMA) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// DDL.g:932:23: COMMA grouping_element
					{
					COMMA392=(Token)match(input,COMMA,FOLLOW_COMMA_in_grouping_element_list7164); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA392);

					pushFollow(FOLLOW_grouping_element_in_grouping_element_list7166);
					grouping_element393=grouping_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element393.getTree());
					}
					break;

				default :
					break loop117;
				}
			}

			// AST REWRITE
			// elements: grouping_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 932:48: -> ( grouping_element )+
			{
				if ( !(stream_grouping_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_grouping_element.hasNext() ) {
					adaptor.addChild(root_0, stream_grouping_element.nextTree());
				}
				stream_grouping_element.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, grouping_element_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "grouping_element_list"


	public static class grouping_element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "grouping_element"
	// DDL.g:934:1: grouping_element : ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set );
	public final DDLParser.grouping_element_return grouping_element() throws RecognitionException {
		DDLParser.grouping_element_return retval = new DDLParser.grouping_element_return();
		retval.start = input.LT(1);
		int grouping_element_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ordinary_grouping_set394 =null;
		ParserRuleReturnScope rollup_list395 =null;
		ParserRuleReturnScope cube_list396 =null;
		ParserRuleReturnScope empty_grouping_set397 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// DDL.g:935:3: ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set )
			int alt118=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt118=1;
				}
				break;
			case LEFT_PAREN:
				{
				int LA118_2 = input.LA(2);
				if ( (LA118_2==RIGHT_PAREN) ) {
					alt118=4;
				}
				else if ( (LA118_2==Identifier) ) {
					alt118=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 118, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ROLLUP:
				{
				alt118=2;
				}
				break;
			case CUBE:
				{
				alt118=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}
			switch (alt118) {
				case 1 :
					// DDL.g:935:5: ordinary_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ordinary_grouping_set_in_grouping_element7185);
					ordinary_grouping_set394=ordinary_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ordinary_grouping_set394.getTree());

					}
					break;
				case 2 :
					// DDL.g:936:5: rollup_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rollup_list_in_grouping_element7191);
					rollup_list395=rollup_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rollup_list395.getTree());

					}
					break;
				case 3 :
					// DDL.g:937:5: cube_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cube_list_in_grouping_element7197);
					cube_list396=cube_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cube_list396.getTree());

					}
					break;
				case 4 :
					// DDL.g:938:5: empty_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_empty_grouping_set_in_grouping_element7203);
					empty_grouping_set397=empty_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, empty_grouping_set397.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 109, grouping_element_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "grouping_element"


	public static class ordinary_grouping_set_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ordinary_grouping_set"
	// DDL.g:940:1: ordinary_grouping_set : ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !);
	public final DDLParser.ordinary_grouping_set_return ordinary_grouping_set() throws RecognitionException {
		DDLParser.ordinary_grouping_set_return retval = new DDLParser.ordinary_grouping_set_return();
		retval.start = input.LT(1);
		int ordinary_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN399=null;
		Token RIGHT_PAREN401=null;
		ParserRuleReturnScope column_reference_list398 =null;
		ParserRuleReturnScope column_reference_list400 =null;

		CommonTree LEFT_PAREN399_tree=null;
		CommonTree RIGHT_PAREN401_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// DDL.g:941:3: ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !)
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==Identifier) ) {
				alt119=1;
			}
			else if ( (LA119_0==LEFT_PAREN) ) {
				alt119=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}

			switch (alt119) {
				case 1 :
					// DDL.g:941:5: column_reference_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set7215);
					column_reference_list398=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list398.getTree());

					}
					break;
				case 2 :
					// DDL.g:942:5: LEFT_PAREN ! column_reference_list RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN399=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_ordinary_grouping_set7221); if (state.failed) return retval;
					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set7224);
					column_reference_list400=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list400.getTree());

					RIGHT_PAREN401=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set7226); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 110, ordinary_grouping_set_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ordinary_grouping_set"


	public static class rollup_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rollup_list"
	// DDL.g:944:1: rollup_list : ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) ;
	public final DDLParser.rollup_list_return rollup_list() throws RecognitionException {
		DDLParser.rollup_list_return retval = new DDLParser.rollup_list_return();
		retval.start = input.LT(1);
		int rollup_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ROLLUP402=null;
		Token LEFT_PAREN403=null;
		Token RIGHT_PAREN404=null;
		ParserRuleReturnScope c =null;

		CommonTree ROLLUP402_tree=null;
		CommonTree LEFT_PAREN403_tree=null;
		CommonTree RIGHT_PAREN404_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_ROLLUP=new RewriteRuleTokenStream(adaptor,"token ROLLUP");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// DDL.g:945:3: ( ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) )
			// DDL.g:945:5: ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			ROLLUP402=(Token)match(input,ROLLUP,FOLLOW_ROLLUP_in_rollup_list7239); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROLLUP.add(ROLLUP402);

			LEFT_PAREN403=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_rollup_list7241); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN403);

			pushFollow(FOLLOW_ordinary_grouping_set_in_rollup_list7245);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN404=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_rollup_list7247); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN404);

			// AST REWRITE
			// elements: c, ROLLUP
			// token labels: 
			// rule labels: retval, c
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 945:59: -> ^( ROLLUP $c)
			{
				// DDL.g:945:62: ^( ROLLUP $c)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ROLLUP.nextNode(), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 111, rollup_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "rollup_list"


	public static class cube_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cube_list"
	// DDL.g:947:1: cube_list : CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) ;
	public final DDLParser.cube_list_return cube_list() throws RecognitionException {
		DDLParser.cube_list_return retval = new DDLParser.cube_list_return();
		retval.start = input.LT(1);
		int cube_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CUBE405=null;
		Token LEFT_PAREN406=null;
		Token RIGHT_PAREN407=null;
		ParserRuleReturnScope c =null;

		CommonTree CUBE405_tree=null;
		CommonTree LEFT_PAREN406_tree=null;
		CommonTree RIGHT_PAREN407_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_CUBE=new RewriteRuleTokenStream(adaptor,"token CUBE");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// DDL.g:948:3: ( CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) )
			// DDL.g:948:5: CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			CUBE405=(Token)match(input,CUBE,FOLLOW_CUBE_in_cube_list7268); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CUBE.add(CUBE405);

			LEFT_PAREN406=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cube_list7270); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN406);

			pushFollow(FOLLOW_ordinary_grouping_set_in_cube_list7274);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN407=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cube_list7276); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN407);

			// AST REWRITE
			// elements: c, CUBE
			// token labels: 
			// rule labels: retval, c
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 948:57: -> ^( CUBE $c)
			{
				// DDL.g:948:60: ^( CUBE $c)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_CUBE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 112, cube_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cube_list"


	public static class empty_grouping_set_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "empty_grouping_set"
	// DDL.g:950:1: empty_grouping_set : LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) ;
	public final DDLParser.empty_grouping_set_return empty_grouping_set() throws RecognitionException {
		DDLParser.empty_grouping_set_return retval = new DDLParser.empty_grouping_set_return();
		retval.start = input.LT(1);
		int empty_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN408=null;
		Token RIGHT_PAREN409=null;

		CommonTree LEFT_PAREN408_tree=null;
		CommonTree RIGHT_PAREN409_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

			// DDL.g:951:3: ( LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) )
			// DDL.g:951:5: LEFT_PAREN RIGHT_PAREN
			{
			LEFT_PAREN408=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_empty_grouping_set7297); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN408);

			RIGHT_PAREN409=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_empty_grouping_set7299); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN409);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 951:28: -> ^( EMPTY_GROUPING_SET )
			{
				// DDL.g:951:31: ^( EMPTY_GROUPING_SET )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EMPTY_GROUPING_SET, "EMPTY_GROUPING_SET"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 113, empty_grouping_set_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "empty_grouping_set"


	public static class having_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "having_clause"
	// DDL.g:953:1: having_clause : HAVING ^ boolean_value_expression ;
	public final DDLParser.having_clause_return having_clause() throws RecognitionException {
		DDLParser.having_clause_return retval = new DDLParser.having_clause_return();
		retval.start = input.LT(1);
		int having_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token HAVING410=null;
		ParserRuleReturnScope boolean_value_expression411 =null;

		CommonTree HAVING410_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

			// DDL.g:954:3: ( HAVING ^ boolean_value_expression )
			// DDL.g:954:5: HAVING ^ boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			HAVING410=(Token)match(input,HAVING,FOLLOW_HAVING_in_having_clause7317); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			HAVING410_tree = (CommonTree)adaptor.create(HAVING410);
			root_0 = (CommonTree)adaptor.becomeRoot(HAVING410_tree, root_0);
			}

			pushFollow(FOLLOW_boolean_value_expression_in_having_clause7320);
			boolean_value_expression411=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression411.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 114, having_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "having_clause"


	public static class orderby_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "orderby_clause"
	// DDL.g:962:1: orderby_clause : ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) ;
	public final DDLParser.orderby_clause_return orderby_clause() throws RecognitionException {
		DDLParser.orderby_clause_return retval = new DDLParser.orderby_clause_return();
		retval.start = input.LT(1);
		int orderby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ORDER412=null;
		Token BY413=null;
		ParserRuleReturnScope sort_specifier_list414 =null;

		CommonTree ORDER412_tree=null;
		CommonTree BY413_tree=null;
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
		RewriteRuleSubtreeStream stream_sort_specifier_list=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

			// DDL.g:963:3: ( ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) )
			// DDL.g:963:5: ORDER BY sort_specifier_list
			{
			ORDER412=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderby_clause7334); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ORDER.add(ORDER412);

			BY413=(Token)match(input,BY,FOLLOW_BY_in_orderby_clause7336); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY413);

			pushFollow(FOLLOW_sort_specifier_list_in_orderby_clause7338);
			sort_specifier_list414=sort_specifier_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier_list.add(sort_specifier_list414.getTree());
			// AST REWRITE
			// elements: sort_specifier_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 963:34: -> ^( ORDER_BY sort_specifier_list )
			{
				// DDL.g:963:37: ^( ORDER_BY sort_specifier_list )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ORDER_BY, "ORDER_BY"), root_1);
				adaptor.addChild(root_1, stream_sort_specifier_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 115, orderby_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "orderby_clause"


	public static class sort_specifier_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sort_specifier_list"
	// DDL.g:965:1: sort_specifier_list : sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) ;
	public final DDLParser.sort_specifier_list_return sort_specifier_list() throws RecognitionException {
		DDLParser.sort_specifier_list_return retval = new DDLParser.sort_specifier_list_return();
		retval.start = input.LT(1);
		int sort_specifier_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA416=null;
		ParserRuleReturnScope sort_specifier415 =null;
		ParserRuleReturnScope sort_specifier417 =null;

		CommonTree COMMA416_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_sort_specifier=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

			// DDL.g:966:3: ( sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) )
			// DDL.g:966:5: sort_specifier ( COMMA sort_specifier )*
			{
			pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list7358);
			sort_specifier415=sort_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier415.getTree());
			// DDL.g:966:20: ( COMMA sort_specifier )*
			loop120:
			while (true) {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==COMMA) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// DDL.g:966:21: COMMA sort_specifier
					{
					COMMA416=(Token)match(input,COMMA,FOLLOW_COMMA_in_sort_specifier_list7361); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA416);

					pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list7363);
					sort_specifier417=sort_specifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier417.getTree());
					}
					break;

				default :
					break loop120;
				}
			}

			// AST REWRITE
			// elements: sort_specifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 966:44: -> ^( SORT_SPECIFIERS ( sort_specifier )+ )
			{
				// DDL.g:966:47: ^( SORT_SPECIFIERS ( sort_specifier )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SORT_SPECIFIERS, "SORT_SPECIFIERS"), root_1);
				if ( !(stream_sort_specifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_sort_specifier.hasNext() ) {
					adaptor.addChild(root_1, stream_sort_specifier.nextTree());
				}
				stream_sort_specifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 116, sort_specifier_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sort_specifier_list"


	public static class sort_specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sort_specifier"
	// DDL.g:968:1: sort_specifier : fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) ;
	public final DDLParser.sort_specifier_return sort_specifier() throws RecognitionException {
		DDLParser.sort_specifier_return retval = new DDLParser.sort_specifier_return();
		retval.start = input.LT(1);
		int sort_specifier_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope fn =null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope o =null;

		RewriteRuleSubtreeStream stream_order_specification=new RewriteRuleSubtreeStream(adaptor,"rule order_specification");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");
		RewriteRuleSubtreeStream stream_null_ordering=new RewriteRuleSubtreeStream(adaptor,"rule null_ordering");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

			// DDL.g:969:3: (fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) )
			// DDL.g:969:5: fn= column_reference (a= order_specification )? (o= null_ordering )?
			{
			pushFollow(FOLLOW_column_reference_in_sort_specifier7388);
			fn=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(fn.getTree());
			// DDL.g:969:26: (a= order_specification )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==ASC||LA121_0==DESC) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// DDL.g:969:26: a= order_specification
					{
					pushFollow(FOLLOW_order_specification_in_sort_specifier7392);
					a=order_specification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_order_specification.add(a.getTree());
					}
					break;

			}

			// DDL.g:969:49: (o= null_ordering )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==NULL) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// DDL.g:969:49: o= null_ordering
					{
					pushFollow(FOLLOW_null_ordering_in_sort_specifier7397);
					o=null_ordering();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_null_ordering.add(o.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: a, o, fn
			// token labels: 
			// rule labels: retval, a, o, fn
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.getTree():null);
			RewriteRuleSubtreeStream stream_fn=new RewriteRuleSubtreeStream(adaptor,"rule fn",fn!=null?fn.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 969:65: -> ^( SORT_KEY $fn ( $a)? ( $o)? )
			{
				// DDL.g:969:68: ^( SORT_KEY $fn ( $a)? ( $o)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SORT_KEY, "SORT_KEY"), root_1);
				adaptor.addChild(root_1, stream_fn.nextTree());
				// DDL.g:969:84: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// DDL.g:969:88: ( $o)?
				if ( stream_o.hasNext() ) {
					adaptor.addChild(root_1, stream_o.nextTree());
				}
				stream_o.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 117, sort_specifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sort_specifier"


	public static class order_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "order_specification"
	// DDL.g:971:1: order_specification : ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) );
	public final DDLParser.order_specification_return order_specification() throws RecognitionException {
		DDLParser.order_specification_return retval = new DDLParser.order_specification_return();
		retval.start = input.LT(1);
		int order_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ASC418=null;
		Token DESC419=null;

		CommonTree ASC418_tree=null;
		CommonTree DESC419_tree=null;
		RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
		RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

			// DDL.g:972:3: ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) )
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==ASC) ) {
				alt123=1;
			}
			else if ( (LA123_0==DESC) ) {
				alt123=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}

			switch (alt123) {
				case 1 :
					// DDL.g:972:5: ASC
					{
					ASC418=(Token)match(input,ASC,FOLLOW_ASC_in_order_specification7427); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASC.add(ASC418);

					// AST REWRITE
					// elements: ASC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 972:9: -> ^( ORDER ASC )
					{
						// DDL.g:972:12: ^( ORDER ASC )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ORDER, "ORDER"), root_1);
						adaptor.addChild(root_1, stream_ASC.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:973:5: DESC
					{
					DESC419=(Token)match(input,DESC,FOLLOW_DESC_in_order_specification7441); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESC.add(DESC419);

					// AST REWRITE
					// elements: DESC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 973:10: -> ^( ORDER DESC )
					{
						// DDL.g:973:13: ^( ORDER DESC )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ORDER, "ORDER"), root_1);
						adaptor.addChild(root_1, stream_DESC.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 118, order_specification_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "order_specification"


	public static class limit_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "limit_clause"
	// DDL.g:975:1: limit_clause : LIMIT e= numeric_value_expression -> ^( LIMIT $e) ;
	public final DDLParser.limit_clause_return limit_clause() throws RecognitionException {
		DDLParser.limit_clause_return retval = new DDLParser.limit_clause_return();
		retval.start = input.LT(1);
		int limit_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LIMIT420=null;
		ParserRuleReturnScope e =null;

		CommonTree LIMIT420_tree=null;
		RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

			// DDL.g:976:3: ( LIMIT e= numeric_value_expression -> ^( LIMIT $e) )
			// DDL.g:976:5: LIMIT e= numeric_value_expression
			{
			LIMIT420=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limit_clause7461); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIMIT.add(LIMIT420);

			pushFollow(FOLLOW_numeric_value_expression_in_limit_clause7465);
			e=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(e.getTree());
			// AST REWRITE
			// elements: e, LIMIT
			// token labels: 
			// rule labels: retval, e
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 976:38: -> ^( LIMIT $e)
			{
				// DDL.g:976:41: ^( LIMIT $e)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_1);
				adaptor.addChild(root_1, stream_e.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 119, limit_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "limit_clause"


	public static class null_ordering_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "null_ordering"
	// DDL.g:978:1: null_ordering : ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) );
	public final DDLParser.null_ordering_return null_ordering() throws RecognitionException {
		DDLParser.null_ordering_return retval = new DDLParser.null_ordering_return();
		retval.start = input.LT(1);
		int null_ordering_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL421=null;
		Token FIRST422=null;
		Token NULL423=null;
		Token LAST424=null;

		CommonTree NULL421_tree=null;
		CommonTree FIRST422_tree=null;
		CommonTree NULL423_tree=null;
		CommonTree LAST424_tree=null;
		RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

			// DDL.g:979:3: ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) )
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==NULL) ) {
				int LA124_1 = input.LA(2);
				if ( (LA124_1==FIRST) ) {
					alt124=1;
				}
				else if ( (LA124_1==LAST) ) {
					alt124=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 124, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}

			switch (alt124) {
				case 1 :
					// DDL.g:979:5: NULL FIRST
					{
					NULL421=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering7486); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL421);

					FIRST422=(Token)match(input,FIRST,FOLLOW_FIRST_in_null_ordering7488); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIRST.add(FIRST422);

					// AST REWRITE
					// elements: FIRST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 979:16: -> ^( NULL_ORDER FIRST )
					{
						// DDL.g:979:19: ^( NULL_ORDER FIRST )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NULL_ORDER, "NULL_ORDER"), root_1);
						adaptor.addChild(root_1, stream_FIRST.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DDL.g:980:5: NULL LAST
					{
					NULL423=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering7502); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL423);

					LAST424=(Token)match(input,LAST,FOLLOW_LAST_in_null_ordering7504); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LAST.add(LAST424);

					// AST REWRITE
					// elements: LAST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 980:15: -> ^( NULL_ORDER LAST )
					{
						// DDL.g:980:18: ^( NULL_ORDER LAST )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NULL_ORDER, "NULL_ORDER"), root_1);
						adaptor.addChild(root_1, stream_LAST.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 120, null_ordering_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "null_ordering"


	public static class search_condition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "search_condition"
	// DDL.g:989:1: search_condition : boolean_value_expression ;
	public final DDLParser.search_condition_return search_condition() throws RecognitionException {
		DDLParser.search_condition_return retval = new DDLParser.search_condition_return();
		retval.start = input.LT(1);
		int search_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression425 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

			// DDL.g:990:2: ( boolean_value_expression )
			// DDL.g:990:4: boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_value_expression_in_search_condition7526);
			boolean_value_expression425=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression425.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 121, search_condition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "search_condition"


	public static class param_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param_clause"
	// DDL.g:992:1: param_clause : WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) ;
	public final DDLParser.param_clause_return param_clause() throws RecognitionException {
		DDLParser.param_clause_return retval = new DDLParser.param_clause_return();
		retval.start = input.LT(1);
		int param_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH426=null;
		Token LEFT_PAREN427=null;
		Token COMMA429=null;
		Token RIGHT_PAREN431=null;
		ParserRuleReturnScope param428 =null;
		ParserRuleReturnScope param430 =null;

		CommonTree WITH426_tree=null;
		CommonTree LEFT_PAREN427_tree=null;
		CommonTree COMMA429_tree=null;
		CommonTree RIGHT_PAREN431_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

			// DDL.g:993:3: ( WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) )
			// DDL.g:993:5: WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN
			{
			WITH426=(Token)match(input,WITH,FOLLOW_WITH_in_param_clause7537); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH426);

			LEFT_PAREN427=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_param_clause7539); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN427);

			pushFollow(FOLLOW_param_in_param_clause7541);
			param428=param();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_param.add(param428.getTree());
			// DDL.g:993:27: ( COMMA param )*
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==COMMA) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// DDL.g:993:28: COMMA param
					{
					COMMA429=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_clause7544); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA429);

					pushFollow(FOLLOW_param_in_param_clause7546);
					param430=param();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_param.add(param430.getTree());
					}
					break;

				default :
					break loop125;
				}
			}

			RIGHT_PAREN431=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_param_clause7550); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN431);

			// AST REWRITE
			// elements: param
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 993:54: -> ^( PARAMS ( param )+ )
			{
				// DDL.g:993:57: ^( PARAMS ( param )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMS, "PARAMS"), root_1);
				if ( !(stream_param.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_param.hasNext() ) {
					adaptor.addChild(root_1, stream_param.nextTree());
				}
				stream_param.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 122, param_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "param_clause"


	public static class param_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param"
	// DDL.g:995:1: param : k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) ;
	public final DDLParser.param_return param() throws RecognitionException {
		DDLParser.param_return retval = new DDLParser.param_return();
		retval.start = input.LT(1);
		int param_StartIndex = input.index();

		CommonTree root_0 = null;

		Token k=null;
		Token EQUAL432=null;
		ParserRuleReturnScope v =null;

		CommonTree k_tree=null;
		CommonTree EQUAL432_tree=null;
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

			// DDL.g:996:3: (k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) )
			// DDL.g:996:5: k= Character_String_Literal EQUAL v= numeric_value_expression
			{
			k=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_param7573); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_String_Literal.add(k);

			EQUAL432=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_param7575); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL432);

			pushFollow(FOLLOW_numeric_value_expression_in_param7579);
			v=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(v.getTree());
			// AST REWRITE
			// elements: v, k
			// token labels: k
			// rule labels: v, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 996:65: -> ^( PARAM $k $v)
			{
				// DDL.g:996:68: ^( PARAM $k $v)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);
				adaptor.addChild(root_1, stream_k.nextNode());
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 123, param_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "param"


	public static class method_specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "method_specifier"
	// DDL.g:998:1: method_specifier : USING m= Identifier -> ^( USING[$m.text] ) ;
	public final DDLParser.method_specifier_return method_specifier() throws RecognitionException {
		DDLParser.method_specifier_return retval = new DDLParser.method_specifier_return();
		retval.start = input.LT(1);
		int method_specifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token m=null;
		Token USING433=null;

		CommonTree m_tree=null;
		CommonTree USING433_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

			// DDL.g:999:3: ( USING m= Identifier -> ^( USING[$m.text] ) )
			// DDL.g:999:5: USING m= Identifier
			{
			USING433=(Token)match(input,USING,FOLLOW_USING_in_method_specifier7603); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING433);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_method_specifier7607); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(m);

			// AST REWRITE
			// elements: USING
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 999:24: -> ^( USING[$m.text] )
			{
				// DDL.g:999:27: ^( USING[$m.text] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USING, (m!=null?m.getText():null)), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 124, method_specifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "method_specifier"


	public static class boolean_value_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_value_expression"
	// DDL.g:1006:1: boolean_value_expression : and_predicate ( OR ^ and_predicate )* ;
	public final DDLParser.boolean_value_expression_return boolean_value_expression() throws RecognitionException {
		DDLParser.boolean_value_expression_return retval = new DDLParser.boolean_value_expression_return();
		retval.start = input.LT(1);
		int boolean_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OR435=null;
		ParserRuleReturnScope and_predicate434 =null;
		ParserRuleReturnScope and_predicate436 =null;

		CommonTree OR435_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

			// DDL.g:1007:2: ( and_predicate ( OR ^ and_predicate )* )
			// DDL.g:1007:4: and_predicate ( OR ^ and_predicate )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_and_predicate_in_boolean_value_expression7627);
			and_predicate434=and_predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate434.getTree());

			// DDL.g:1007:18: ( OR ^ and_predicate )*
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==OR) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// DDL.g:1007:19: OR ^ and_predicate
					{
					OR435=(Token)match(input,OR,FOLLOW_OR_in_boolean_value_expression7630); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR435_tree = (CommonTree)adaptor.create(OR435);
					root_0 = (CommonTree)adaptor.becomeRoot(OR435_tree, root_0);
					}

					pushFollow(FOLLOW_and_predicate_in_boolean_value_expression7633);
					and_predicate436=and_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate436.getTree());

					}
					break;

				default :
					break loop126;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 125, boolean_value_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_value_expression"


	public static class and_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "and_predicate"
	// DDL.g:1009:1: and_predicate : boolean_factor ( AND ^ boolean_factor )* ;
	public final DDLParser.and_predicate_return and_predicate() throws RecognitionException {
		DDLParser.and_predicate_return retval = new DDLParser.and_predicate_return();
		retval.start = input.LT(1);
		int and_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AND438=null;
		ParserRuleReturnScope boolean_factor437 =null;
		ParserRuleReturnScope boolean_factor439 =null;

		CommonTree AND438_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

			// DDL.g:1010:3: ( boolean_factor ( AND ^ boolean_factor )* )
			// DDL.g:1010:5: boolean_factor ( AND ^ boolean_factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_factor_in_and_predicate7646);
			boolean_factor437=boolean_factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor437.getTree());

			// DDL.g:1010:20: ( AND ^ boolean_factor )*
			loop127:
			while (true) {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==AND) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// DDL.g:1010:21: AND ^ boolean_factor
					{
					AND438=(Token)match(input,AND,FOLLOW_AND_in_and_predicate7649); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND438_tree = (CommonTree)adaptor.create(AND438);
					root_0 = (CommonTree)adaptor.becomeRoot(AND438_tree, root_0);
					}

					pushFollow(FOLLOW_boolean_factor_in_and_predicate7652);
					boolean_factor439=boolean_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor439.getTree());

					}
					break;

				default :
					break loop127;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 126, and_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "and_predicate"


	public static class boolean_factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_factor"
	// DDL.g:1012:1: boolean_factor : ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) );
	public final DDLParser.boolean_factor_return boolean_factor() throws RecognitionException {
		DDLParser.boolean_factor_return retval = new DDLParser.boolean_factor_return();
		retval.start = input.LT(1);
		int boolean_factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT441=null;
		ParserRuleReturnScope boolean_test440 =null;
		ParserRuleReturnScope boolean_test442 =null;

		CommonTree NOT441_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleSubtreeStream stream_boolean_test=new RewriteRuleSubtreeStream(adaptor,"rule boolean_test");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

			// DDL.g:1013:3: ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) )
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==CASE||LA128_0==COUNT||LA128_0==Character_String_Literal||LA128_0==Identifier||LA128_0==LEFT_PAREN||LA128_0==MINUS||LA128_0==NULL||LA128_0==NUMBER||LA128_0==PLUS||LA128_0==REAL_NUMBER) ) {
				alt128=1;
			}
			else if ( (LA128_0==NOT) ) {
				alt128=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}

			switch (alt128) {
				case 1 :
					// DDL.g:1013:5: boolean_test
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_test_in_boolean_factor7665);
					boolean_test440=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_test440.getTree());

					}
					break;
				case 2 :
					// DDL.g:1014:5: NOT boolean_test
					{
					NOT441=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_factor7671); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT441);

					pushFollow(FOLLOW_boolean_test_in_boolean_factor7673);
					boolean_test442=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_test.add(boolean_test442.getTree());
					// AST REWRITE
					// elements: NOT, boolean_test
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 1014:22: -> ^( NOT boolean_test )
					{
						// DDL.g:1014:25: ^( NOT boolean_test )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_boolean_test.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 127, boolean_factor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_factor"


	public static class boolean_test_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_test"
	// DDL.g:1016:1: boolean_test : boolean_primary ( is_clause )? ;
	public final DDLParser.boolean_test_return boolean_test() throws RecognitionException {
		DDLParser.boolean_test_return retval = new DDLParser.boolean_test_return();
		retval.start = input.LT(1);
		int boolean_test_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_primary443 =null;
		ParserRuleReturnScope is_clause444 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

			// DDL.g:1017:3: ( boolean_primary ( is_clause )? )
			// DDL.g:1017:5: boolean_primary ( is_clause )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_primary_in_boolean_test7693);
			boolean_primary443=boolean_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_primary443.getTree());

			// DDL.g:1017:21: ( is_clause )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==IS) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// DDL.g:1017:21: is_clause
					{
					pushFollow(FOLLOW_is_clause_in_boolean_test7695);
					is_clause444=is_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, is_clause444.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 128, boolean_test_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_test"


	public static class is_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "is_clause"
	// DDL.g:1019:1: is_clause : IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) ;
	public final DDLParser.is_clause_return is_clause() throws RecognitionException {
		DDLParser.is_clause_return retval = new DDLParser.is_clause_return();
		retval.start = input.LT(1);
		int is_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IS445=null;
		Token NOT446=null;
		ParserRuleReturnScope t =null;

		CommonTree IS445_tree=null;
		CommonTree NOT446_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleSubtreeStream stream_truth_value=new RewriteRuleSubtreeStream(adaptor,"rule truth_value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

			// DDL.g:1020:3: ( IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) )
			// DDL.g:1020:5: IS ( NOT )? t= truth_value
			{
			IS445=(Token)match(input,IS,FOLLOW_IS_in_is_clause7708); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS445);

			// DDL.g:1020:8: ( NOT )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==NOT) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// DDL.g:1020:8: NOT
					{
					NOT446=(Token)match(input,NOT,FOLLOW_NOT_in_is_clause7710); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT446);

					}
					break;

			}

			pushFollow(FOLLOW_truth_value_in_is_clause7715);
			t=truth_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_truth_value.add(t.getTree());
			// AST REWRITE
			// elements: t, NOT, IS
			// token labels: 
			// rule labels: retval, t
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1020:27: -> ^( IS ( NOT )? $t)
			{
				// DDL.g:1020:30: ^( IS ( NOT )? $t)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				// DDL.g:1020:35: ( NOT )?
				if ( stream_NOT.hasNext() ) {
					adaptor.addChild(root_1, stream_NOT.nextNode());
				}
				stream_NOT.reset();

				adaptor.addChild(root_1, stream_t.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 129, is_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "is_clause"


	public static class truth_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "truth_value"
	// DDL.g:1022:1: truth_value : ( TRUE | FALSE | UNKNOWN );
	public final DDLParser.truth_value_return truth_value() throws RecognitionException {
		DDLParser.truth_value_return retval = new DDLParser.truth_value_return();
		retval.start = input.LT(1);
		int truth_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set447=null;

		CommonTree set447_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }

			// DDL.g:1023:3: ( TRUE | FALSE | UNKNOWN )
			// DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set447=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE||input.LA(1)==UNKNOWN ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set447));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 130, truth_value_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "truth_value"


	public static class boolean_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_primary"
	// DDL.g:1025:1: boolean_primary : ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression );
	public final DDLParser.boolean_primary_return boolean_primary() throws RecognitionException {
		DDLParser.boolean_primary_return retval = new DDLParser.boolean_primary_return();
		retval.start = input.LT(1);
		int boolean_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN450=null;
		Token RIGHT_PAREN452=null;
		ParserRuleReturnScope predicate448 =null;
		ParserRuleReturnScope numeric_value_expression449 =null;
		ParserRuleReturnScope boolean_value_expression451 =null;
		ParserRuleReturnScope case_expression453 =null;

		CommonTree LEFT_PAREN450_tree=null;
		CommonTree RIGHT_PAREN452_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

			// DDL.g:1026:3: ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression )
			int alt131=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA131_1 = input.LA(2);
				if ( (synpred194_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred195_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA131_2 = input.LA(2);
				if ( (synpred194_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred195_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NUMBER:
			case REAL_NUMBER:
				{
				int LA131_3 = input.LA(2);
				if ( (synpred194_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred195_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NULL:
				{
				int LA131_4 = input.LA(2);
				if ( (synpred194_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred195_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA131_5 = input.LA(2);
				if ( (synpred194_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred195_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA131_6 = input.LA(2);
				if ( (synpred194_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred195_DDL()) ) {
					alt131=2;
				}
				else if ( (synpred196_DDL()) ) {
					alt131=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COUNT:
				{
				int LA131_7 = input.LA(2);
				if ( (synpred194_DDL()) ) {
					alt131=1;
				}
				else if ( (synpred195_DDL()) ) {
					alt131=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CASE:
				{
				alt131=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}
			switch (alt131) {
				case 1 :
					// DDL.g:1026:5: predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_boolean_primary7759);
					predicate448=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate448.getTree());

					}
					break;
				case 2 :
					// DDL.g:1027:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_boolean_primary7765);
					numeric_value_expression449=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression449.getTree());

					}
					break;
				case 3 :
					// DDL.g:1028:5: LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN450=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_boolean_primary7771); if (state.failed) return retval;
					pushFollow(FOLLOW_boolean_value_expression_in_boolean_primary7774);
					boolean_value_expression451=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression451.getTree());

					RIGHT_PAREN452=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_boolean_primary7776); if (state.failed) return retval;
					}
					break;
				case 4 :
					// DDL.g:1029:5: case_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_boolean_primary7783);
					case_expression453=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression453.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 131, boolean_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "boolean_primary"


	public static class predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// DDL.g:1036:1: predicate : ( comparison_predicate | in_predicate | like_predicate | null_predicate );
	public final DDLParser.predicate_return predicate() throws RecognitionException {
		DDLParser.predicate_return retval = new DDLParser.predicate_return();
		retval.start = input.LT(1);
		int predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison_predicate454 =null;
		ParserRuleReturnScope in_predicate455 =null;
		ParserRuleReturnScope like_predicate456 =null;
		ParserRuleReturnScope null_predicate457 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }

			// DDL.g:1037:3: ( comparison_predicate | in_predicate | like_predicate | null_predicate )
			int alt132=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA132_1 = input.LA(2);
				if ( (synpred197_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred198_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA132_2 = input.LA(2);
				if ( (synpred197_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred198_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case NUMBER:
			case REAL_NUMBER:
				{
				int LA132_3 = input.LA(2);
				if ( (synpred197_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred198_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case NULL:
				{
				int LA132_4 = input.LA(2);
				if ( (synpred197_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred198_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case Identifier:
				{
				int LA132_5 = input.LA(2);
				if ( (synpred197_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred198_DDL()) ) {
					alt132=2;
				}
				else if ( (synpred199_DDL()) ) {
					alt132=3;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA132_6 = input.LA(2);
				if ( (synpred197_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred198_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			case COUNT:
				{
				int LA132_7 = input.LA(2);
				if ( (synpred197_DDL()) ) {
					alt132=1;
				}
				else if ( (synpred198_DDL()) ) {
					alt132=2;
				}
				else if ( (true) ) {
					alt132=4;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}
			switch (alt132) {
				case 1 :
					// DDL.g:1037:5: comparison_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_comparison_predicate_in_predicate7797);
					comparison_predicate454=comparison_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_predicate454.getTree());

					}
					break;
				case 2 :
					// DDL.g:1038:5: in_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_in_predicate_in_predicate7803);
					in_predicate455=in_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in_predicate455.getTree());

					}
					break;
				case 3 :
					// DDL.g:1039:5: like_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_like_predicate_in_predicate7809);
					like_predicate456=like_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, like_predicate456.getTree());

					}
					break;
				case 4 :
					// DDL.g:1040:5: null_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_null_predicate_in_predicate7815);
					null_predicate457=null_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, null_predicate457.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 132, predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class comparison_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comparison_predicate"
	// DDL.g:1048:1: comparison_predicate options {k=1; } : l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) ;
	public final DDLParser.comparison_predicate_return comparison_predicate() throws RecognitionException {
		DDLParser.comparison_predicate_return retval = new DDLParser.comparison_predicate_return();
		retval.start = input.LT(1);
		int comparison_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope l =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope r =null;

		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");
		RewriteRuleSubtreeStream stream_comp_op=new RewriteRuleSubtreeStream(adaptor,"rule comp_op");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }

			// DDL.g:1050:2: (l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) )
			// DDL.g:1050:4: l= numeric_value_expression c= comp_op r= numeric_value_expression
			{
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate7839);
			l=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(l.getTree());
			pushFollow(FOLLOW_comp_op_in_comparison_predicate7843);
			c=comp_op();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_comp_op.add(c.getTree());
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate7847);
			r=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(r.getTree());
			// AST REWRITE
			// elements: r, c, l
			// token labels: 
			// rule labels: retval, c, r, l
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1050:68: -> ^( $c $l $r)
			{
				// DDL.g:1050:71: ^( $c $l $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_c.nextNode(), root_1);
				adaptor.addChild(root_1, stream_l.nextTree());
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 133, comparison_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison_predicate"


	public static class comp_op_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comp_op"
	// DDL.g:1052:1: comp_op : ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ );
	public final DDLParser.comp_op_return comp_op() throws RecognitionException {
		DDLParser.comp_op_return retval = new DDLParser.comp_op_return();
		retval.start = input.LT(1);
		int comp_op_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set458=null;

		CommonTree set458_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }

			// DDL.g:1053:3: ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ )
			// DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set458=input.LT(1);
			if ( input.LA(1)==EQUAL||input.LA(1)==GEQ||input.LA(1)==GTH||input.LA(1)==LEQ||input.LA(1)==LTH||input.LA(1)==NOT_EQUAL ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set458));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 134, comp_op_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comp_op"


	public static class in_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "in_predicate"
	// DDL.g:1066:1: in_predicate : v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) ;
	public final DDLParser.in_predicate_return in_predicate() throws RecognitionException {
		DDLParser.in_predicate_return retval = new DDLParser.in_predicate_return();
		retval.start = input.LT(1);
		int in_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT459=null;
		Token IN460=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope a =null;

		CommonTree NOT459_tree=null;
		CommonTree IN460_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleSubtreeStream stream_in_predicate_value=new RewriteRuleSubtreeStream(adaptor,"rule in_predicate_value");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }

			// DDL.g:1066:14: (v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) )
			// DDL.g:1066:16: v= numeric_value_expression ( NOT )? IN a= in_predicate_value
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_predicate7915);
			v=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(v.getTree());
			// DDL.g:1066:44: ( NOT )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==NOT) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// DDL.g:1066:44: NOT
					{
					NOT459=(Token)match(input,NOT,FOLLOW_NOT_in_in_predicate7918); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT459);

					}
					break;

			}

			IN460=(Token)match(input,IN,FOLLOW_IN_in_in_predicate7921); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IN.add(IN460);

			pushFollow(FOLLOW_in_predicate_value_in_in_predicate7925);
			a=in_predicate_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_in_predicate_value.add(a.getTree());
			// AST REWRITE
			// elements: v, a, NOT, IN
			// token labels: 
			// rule labels: v, retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1066:73: -> ^( IN $v $a ( NOT )? )
			{
				// DDL.g:1066:76: ^( IN $v $a ( NOT )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_a.nextTree());
				// DDL.g:1066:87: ( NOT )?
				if ( stream_NOT.hasNext() ) {
					adaptor.addChild(root_1, stream_NOT.nextNode());
				}
				stream_NOT.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 135, in_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "in_predicate"


	public static class in_predicate_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "in_predicate_value"
	// DDL.g:1067:1: in_predicate_value : LEFT_PAREN ! in_value_list RIGHT_PAREN !;
	public final DDLParser.in_predicate_value_return in_predicate_value() throws RecognitionException {
		DDLParser.in_predicate_value_return retval = new DDLParser.in_predicate_value_return();
		retval.start = input.LT(1);
		int in_predicate_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN461=null;
		Token RIGHT_PAREN463=null;
		ParserRuleReturnScope in_value_list462 =null;

		CommonTree LEFT_PAREN461_tree=null;
		CommonTree RIGHT_PAREN463_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }

			// DDL.g:1068:3: ( LEFT_PAREN ! in_value_list RIGHT_PAREN !)
			// DDL.g:1068:5: LEFT_PAREN ! in_value_list RIGHT_PAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			LEFT_PAREN461=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_in_predicate_value7949); if (state.failed) return retval;
			pushFollow(FOLLOW_in_value_list_in_in_predicate_value7952);
			in_value_list462=in_value_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, in_value_list462.getTree());

			RIGHT_PAREN463=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_in_predicate_value7955); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 136, in_predicate_value_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "in_predicate_value"


	public static class in_value_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "in_value_list"
	// DDL.g:1070:1: in_value_list : numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ ;
	public final DDLParser.in_value_list_return in_value_list() throws RecognitionException {
		DDLParser.in_value_list_return retval = new DDLParser.in_value_list_return();
		retval.start = input.LT(1);
		int in_value_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA465=null;
		ParserRuleReturnScope numeric_value_expression464 =null;
		ParserRuleReturnScope numeric_value_expression466 =null;

		CommonTree COMMA465_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }

			// DDL.g:1071:3: ( numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ )
			// DDL.g:1071:5: numeric_value_expression ( COMMA numeric_value_expression )*
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_value_list7967);
			numeric_value_expression464=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression464.getTree());
			// DDL.g:1071:31: ( COMMA numeric_value_expression )*
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==COMMA) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// DDL.g:1071:33: COMMA numeric_value_expression
					{
					COMMA465=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_value_list7972); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA465);

					pushFollow(FOLLOW_numeric_value_expression_in_in_value_list7974);
					numeric_value_expression466=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression466.getTree());
					}
					break;

				default :
					break loop134;
				}
			}

			// AST REWRITE
			// elements: numeric_value_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1071:68: -> ( numeric_value_expression )+
			{
				if ( !(stream_numeric_value_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_numeric_value_expression.hasNext() ) {
					adaptor.addChild(root_0, stream_numeric_value_expression.nextTree());
				}
				stream_numeric_value_expression.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 137, in_value_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "in_value_list"


	public static class like_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "like_predicate"
	// DDL.g:1078:1: like_predicate : f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) ;
	public final DDLParser.like_predicate_return like_predicate() throws RecognitionException {
		DDLParser.like_predicate_return retval = new DDLParser.like_predicate_return();
		retval.start = input.LT(1);
		int like_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token NOT467=null;
		Token LIKE468=null;
		ParserRuleReturnScope f =null;

		CommonTree s_tree=null;
		CommonTree NOT467_tree=null;
		CommonTree LIKE468_tree=null;
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }

			// DDL.g:1079:3: (f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) )
			// DDL.g:1079:5: f= column_reference ( NOT )? LIKE s= Character_String_Literal
			{
			pushFollow(FOLLOW_column_reference_in_like_predicate7996);
			f=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(f.getTree());
			// DDL.g:1079:24: ( NOT )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==NOT) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// DDL.g:1079:24: NOT
					{
					NOT467=(Token)match(input,NOT,FOLLOW_NOT_in_like_predicate7998); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT467);

					}
					break;

			}

			LIKE468=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_predicate8001); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIKE.add(LIKE468);

			s=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_like_predicate8005); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_String_Literal.add(s);

			// AST REWRITE
			// elements: s, NOT, f, LIKE
			// token labels: s
			// rule labels: f, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1079:61: -> ^( LIKE ( NOT )? $f $s)
			{
				// DDL.g:1079:64: ^( LIKE ( NOT )? $f $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_LIKE.nextNode(), root_1);
				// DDL.g:1079:71: ( NOT )?
				if ( stream_NOT.hasNext() ) {
					adaptor.addChild(root_1, stream_NOT.nextNode());
				}
				stream_NOT.reset();

				adaptor.addChild(root_1, stream_f.nextTree());
				adaptor.addChild(root_1, stream_s.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 138, like_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "like_predicate"


	public static class null_predicate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "null_predicate"
	// DDL.g:1087:1: null_predicate : f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) ;
	public final DDLParser.null_predicate_return null_predicate() throws RecognitionException {
		DDLParser.null_predicate_return retval = new DDLParser.null_predicate_return();
		retval.start = input.LT(1);
		int null_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token IS469=null;
		Token NULL470=null;
		ParserRuleReturnScope f =null;

		CommonTree n_tree=null;
		CommonTree IS469_tree=null;
		CommonTree NULL470_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }

			// DDL.g:1088:3: (f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) )
			// DDL.g:1088:5: f= numeric_value_expression IS (n= NOT )? NULL
			{
			pushFollow(FOLLOW_numeric_value_expression_in_null_predicate8036);
			f=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(f.getTree());
			IS469=(Token)match(input,IS,FOLLOW_IS_in_null_predicate8038); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS469);

			// DDL.g:1088:35: (n= NOT )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==NOT) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// DDL.g:1088:36: n= NOT
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_null_predicate8043); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(n);

					}
					break;

			}

			NULL470=(Token)match(input,NULL,FOLLOW_NULL_in_null_predicate8047); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL470);

			// AST REWRITE
			// elements: NULL, f, n, IS
			// token labels: n
			// rule labels: f, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1088:49: -> ^( IS $f NULL ( $n)? )
			{
				// DDL.g:1088:52: ^( IS $f NULL ( $n)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				adaptor.addChild(root_1, stream_f.nextTree());
				adaptor.addChild(root_1, stream_NULL.nextNode());
				// DDL.g:1088:66: ( $n)?
				if ( stream_n.hasNext() ) {
					adaptor.addChild(root_1, stream_n.nextNode());
				}
				stream_n.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 139, null_predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "null_predicate"


	public static class numeric_value_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "numeric_value_expression"
	// DDL.g:1096:1: numeric_value_expression : term ( ( PLUS | MINUS ) ^ term )* ;
	public final DDLParser.numeric_value_expression_return numeric_value_expression() throws RecognitionException {
		DDLParser.numeric_value_expression_return retval = new DDLParser.numeric_value_expression_return();
		retval.start = input.LT(1);
		int numeric_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set472=null;
		ParserRuleReturnScope term471 =null;
		ParserRuleReturnScope term473 =null;

		CommonTree set472_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }

			// DDL.g:1097:2: ( term ( ( PLUS | MINUS ) ^ term )* )
			// DDL.g:1097:4: term ( ( PLUS | MINUS ) ^ term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_term_in_numeric_value_expression8075);
			term471=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term471.getTree());

			// DDL.g:1097:9: ( ( PLUS | MINUS ) ^ term )*
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==MINUS||LA137_0==PLUS) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// DDL.g:1097:10: ( PLUS | MINUS ) ^ term
					{
					set472=input.LT(1);
					set472=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set472), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_numeric_value_expression8085);
					term473=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term473.getTree());

					}
					break;

				default :
					break loop137;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 140, numeric_value_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "numeric_value_expression"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// DDL.g:1099:1: term : numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* ;
	public final DDLParser.term_return term() throws RecognitionException {
		DDLParser.term_return retval = new DDLParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set475=null;
		ParserRuleReturnScope numeric_primary474 =null;
		ParserRuleReturnScope numeric_primary476 =null;

		CommonTree set475_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }

			// DDL.g:1100:3: ( numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* )
			// DDL.g:1100:5: numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_numeric_primary_in_term8098);
			numeric_primary474=numeric_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary474.getTree());

			// DDL.g:1100:21: ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==DIVIDE||(LA138_0 >= MODULAR && LA138_0 <= MULTIPLY)) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// DDL.g:1100:22: ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary
					{
					set475=input.LT(1);
					set475=input.LT(1);
					if ( input.LA(1)==DIVIDE||(input.LA(1) >= MODULAR && input.LA(1) <= MULTIPLY) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set475), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numeric_primary_in_term8110);
					numeric_primary476=numeric_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary476.getTree());

					}
					break;

				default :
					break loop138;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 141, term_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "term"


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array"
	// DDL.g:1102:1: array : LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ ;
	public final DDLParser.array_return array() throws RecognitionException {
		DDLParser.array_return retval = new DDLParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN477=null;
		Token COMMA479=null;
		Token RIGHT_PAREN481=null;
		ParserRuleReturnScope literal478 =null;
		ParserRuleReturnScope literal480 =null;

		CommonTree LEFT_PAREN477_tree=null;
		CommonTree COMMA479_tree=null;
		CommonTree RIGHT_PAREN481_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }

			// DDL.g:1103:3: ( LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ )
			// DDL.g:1103:5: LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN
			{
			LEFT_PAREN477=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_array8123); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN477);

			pushFollow(FOLLOW_literal_in_array8125);
			literal478=literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_literal.add(literal478.getTree());
			// DDL.g:1103:24: ( COMMA literal )*
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==COMMA) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// DDL.g:1103:25: COMMA literal
					{
					COMMA479=(Token)match(input,COMMA,FOLLOW_COMMA_in_array8128); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA479);

					pushFollow(FOLLOW_literal_in_array8130);
					literal480=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literal.add(literal480.getTree());
					}
					break;

				default :
					break loop139;
				}
			}

			RIGHT_PAREN481=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_array8135); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN481);

			// AST REWRITE
			// elements: literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1103:54: -> ( literal )+
			{
				if ( !(stream_literal.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_literal.hasNext() ) {
					adaptor.addChild(root_0, stream_literal.nextTree());
				}
				stream_literal.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 142, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class numeric_primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "numeric_primary"
	// DDL.g:1105:1: numeric_primary : ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation );
	public final DDLParser.numeric_primary_return numeric_primary() throws RecognitionException {
		DDLParser.numeric_primary_return retval = new DDLParser.numeric_primary_return();
		retval.start = input.LT(1);
		int numeric_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN484=null;
		Token RIGHT_PAREN486=null;
		ParserRuleReturnScope literal482 =null;
		ParserRuleReturnScope column_reference483 =null;
		ParserRuleReturnScope numeric_value_expression485 =null;
		ParserRuleReturnScope routine_invocation487 =null;

		CommonTree LEFT_PAREN484_tree=null;
		CommonTree RIGHT_PAREN486_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }

			// DDL.g:1106:3: ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation )
			int alt140=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
			case MINUS:
			case NULL:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt140=1;
				}
				break;
			case Identifier:
				{
				int LA140_2 = input.LA(2);
				if ( (LA140_2==LEFT_PAREN) ) {
					alt140=4;
				}
				else if ( (LA140_2==EOF||(LA140_2 >= AND && LA140_2 <= AS)||LA140_2==COMMA||LA140_2==CROSS||LA140_2==DIVIDE||LA140_2==ELSE||(LA140_2 >= END && LA140_2 <= EQUAL)||LA140_2==EXCEPT||(LA140_2 >= FROM && LA140_2 <= FULL)||(LA140_2 >= GEQ && LA140_2 <= GROUP)||LA140_2==GTH||LA140_2==HAVING||LA140_2==IN||LA140_2==INNER||LA140_2==INTERSECT||LA140_2==IS||LA140_2==Identifier||LA140_2==JOIN||LA140_2==LEFT||LA140_2==LEQ||LA140_2==LIMIT||LA140_2==LTH||LA140_2==MINUS||(LA140_2 >= MODULAR && LA140_2 <= MULTIPLY)||LA140_2==NATURAL||(LA140_2 >= NOT && LA140_2 <= NOT_EQUAL)||(LA140_2 >= OR && LA140_2 <= ORDER)||LA140_2==PLUS||(LA140_2 >= RIGHT && LA140_2 <= RIGHT_PAREN)||LA140_2==THEN||LA140_2==UNION||(LA140_2 >= WHEN && LA140_2 <= WHERE)) ) {
					alt140=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 140, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFT_PAREN:
				{
				alt140=3;
				}
				break;
			case COUNT:
				{
				alt140=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}
			switch (alt140) {
				case 1 :
					// DDL.g:1106:5: literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_literal_in_numeric_primary8152);
					literal482=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal482.getTree());

					}
					break;
				case 2 :
					// DDL.g:1107:4: column_reference
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_in_numeric_primary8157);
					column_reference483=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference483.getTree());

					}
					break;
				case 3 :
					// DDL.g:1108:4: LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN484=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_numeric_primary8162); if (state.failed) return retval;
					pushFollow(FOLLOW_numeric_value_expression_in_numeric_primary8165);
					numeric_value_expression485=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression485.getTree());

					RIGHT_PAREN486=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_numeric_primary8167); if (state.failed) return retval;
					}
					break;
				case 4 :
					// DDL.g:1109:4: routine_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_routine_invocation_in_numeric_primary8173);
					routine_invocation487=routine_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, routine_invocation487.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 143, numeric_primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "numeric_primary"


	public static class literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// DDL.g:1111:1: literal : ( string_value_expr | signed_numerical_literal | NULL );
	public final DDLParser.literal_return literal() throws RecognitionException {
		DDLParser.literal_return retval = new DDLParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL490=null;
		ParserRuleReturnScope string_value_expr488 =null;
		ParserRuleReturnScope signed_numerical_literal489 =null;

		CommonTree NULL490_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }

			// DDL.g:1112:3: ( string_value_expr | signed_numerical_literal | NULL )
			int alt141=3;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				alt141=1;
				}
				break;
			case MINUS:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt141=2;
				}
				break;
			case NULL:
				{
				alt141=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 141, 0, input);
				throw nvae;
			}
			switch (alt141) {
				case 1 :
					// DDL.g:1112:5: string_value_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_value_expr_in_literal8184);
					string_value_expr488=string_value_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value_expr488.getTree());

					}
					break;
				case 2 :
					// DDL.g:1113:5: signed_numerical_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_signed_numerical_literal_in_literal8190);
					signed_numerical_literal489=signed_numerical_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, signed_numerical_literal489.getTree());

					}
					break;
				case 3 :
					// DDL.g:1114:5: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL490=(Token)match(input,NULL,FOLLOW_NULL_in_literal8196); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL490_tree = (CommonTree)adaptor.create(NULL490);
					adaptor.addChild(root_0, NULL490_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 144, literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class string_value_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "string_value_expr"
	// DDL.g:1116:1: string_value_expr : Character_String_Literal ;
	public final DDLParser.string_value_expr_return string_value_expr() throws RecognitionException {
		DDLParser.string_value_expr_return retval = new DDLParser.string_value_expr_return();
		retval.start = input.LT(1);
		int string_value_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Character_String_Literal491=null;

		CommonTree Character_String_Literal491_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }

			// DDL.g:1117:3: ( Character_String_Literal )
			// DDL.g:1117:5: Character_String_Literal
			{
			root_0 = (CommonTree)adaptor.nil();


			Character_String_Literal491=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_string_value_expr8208); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Character_String_Literal491_tree = (CommonTree)adaptor.create(Character_String_Literal491);
			adaptor.addChild(root_0, Character_String_Literal491_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 145, string_value_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "string_value_expr"


	public static class signed_numerical_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "signed_numerical_literal"
	// DDL.g:1119:1: signed_numerical_literal : ( sign )? unsigned_numerical_literal ;
	public final DDLParser.signed_numerical_literal_return signed_numerical_literal() throws RecognitionException {
		DDLParser.signed_numerical_literal_return retval = new DDLParser.signed_numerical_literal_return();
		retval.start = input.LT(1);
		int signed_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope sign492 =null;
		ParserRuleReturnScope unsigned_numerical_literal493 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }

			// DDL.g:1120:3: ( ( sign )? unsigned_numerical_literal )
			// DDL.g:1120:5: ( sign )? unsigned_numerical_literal
			{
			root_0 = (CommonTree)adaptor.nil();


			// DDL.g:1120:5: ( sign )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==MINUS||LA142_0==PLUS) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// DDL.g:1120:5: sign
					{
					pushFollow(FOLLOW_sign_in_signed_numerical_literal8220);
					sign492=sign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sign492.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal8223);
			unsigned_numerical_literal493=unsigned_numerical_literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unsigned_numerical_literal493.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 146, signed_numerical_literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "signed_numerical_literal"


	public static class unsigned_numerical_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unsigned_numerical_literal"
	// DDL.g:1122:1: unsigned_numerical_literal : ( NUMBER | REAL_NUMBER );
	public final DDLParser.unsigned_numerical_literal_return unsigned_numerical_literal() throws RecognitionException {
		DDLParser.unsigned_numerical_literal_return retval = new DDLParser.unsigned_numerical_literal_return();
		retval.start = input.LT(1);
		int unsigned_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set494=null;

		CommonTree set494_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }

			// DDL.g:1123:3: ( NUMBER | REAL_NUMBER )
			// DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set494=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==REAL_NUMBER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set494));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 147, unsigned_numerical_literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unsigned_numerical_literal"


	public static class sign_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sign"
	// DDL.g:1126:1: sign : ( PLUS | MINUS );
	public final DDLParser.sign_return sign() throws RecognitionException {
		DDLParser.sign_return retval = new DDLParser.sign_return();
		retval.start = input.LT(1);
		int sign_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set495=null;

		CommonTree set495_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return retval; }

			// DDL.g:1127:3: ( PLUS | MINUS )
			// DDL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set495=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set495));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 148, sign_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sign"


	public static class case_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "case_expression"
	// DDL.g:1134:1: case_expression : case_specification ;
	public final DDLParser.case_expression_return case_expression() throws RecognitionException {
		DDLParser.case_expression_return retval = new DDLParser.case_expression_return();
		retval.start = input.LT(1);
		int case_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope case_specification496 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return retval; }

			// DDL.g:1135:3: ( case_specification )
			// DDL.g:1135:5: case_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_case_specification_in_case_expression8271);
			case_specification496=case_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, case_specification496.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 149, case_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "case_expression"


	public static class case_abbreviation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "case_abbreviation"
	// DDL.g:1137:1: case_abbreviation : ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN );
	public final DDLParser.case_abbreviation_return case_abbreviation() throws RecognitionException {
		DDLParser.case_abbreviation_return retval = new DDLParser.case_abbreviation_return();
		retval.start = input.LT(1);
		int case_abbreviation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULLIF497=null;
		Token LEFT_PAREN498=null;
		Token COMMA500=null;
		Token RIGHT_PAREN502=null;
		Token COALESCE503=null;
		Token LEFT_PAREN504=null;
		Token COMMA506=null;
		Token RIGHT_PAREN508=null;
		ParserRuleReturnScope numeric_value_expression499 =null;
		ParserRuleReturnScope boolean_value_expression501 =null;
		ParserRuleReturnScope numeric_value_expression505 =null;
		ParserRuleReturnScope boolean_value_expression507 =null;

		CommonTree NULLIF497_tree=null;
		CommonTree LEFT_PAREN498_tree=null;
		CommonTree COMMA500_tree=null;
		CommonTree RIGHT_PAREN502_tree=null;
		CommonTree COALESCE503_tree=null;
		CommonTree LEFT_PAREN504_tree=null;
		CommonTree COMMA506_tree=null;
		CommonTree RIGHT_PAREN508_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return retval; }

			// DDL.g:1138:3: ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN )
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==NULLIF) ) {
				alt144=1;
			}
			else if ( (LA144_0==COALESCE) ) {
				alt144=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}

			switch (alt144) {
				case 1 :
					// DDL.g:1138:5: NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					NULLIF497=(Token)match(input,NULLIF,FOLLOW_NULLIF_in_case_abbreviation8283); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULLIF497_tree = (CommonTree)adaptor.create(NULLIF497);
					adaptor.addChild(root_0, NULLIF497_tree);
					}

					LEFT_PAREN498=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation8285); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN498_tree = (CommonTree)adaptor.create(LEFT_PAREN498);
					adaptor.addChild(root_0, LEFT_PAREN498_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation8287);
					numeric_value_expression499=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression499.getTree());

					COMMA500=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation8289); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA500_tree = (CommonTree)adaptor.create(COMMA500);
					adaptor.addChild(root_0, COMMA500_tree);
					}

					pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation8291);
					boolean_value_expression501=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression501.getTree());

					RIGHT_PAREN502=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation8294); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN502_tree = (CommonTree)adaptor.create(RIGHT_PAREN502);
					adaptor.addChild(root_0, RIGHT_PAREN502_tree);
					}

					}
					break;
				case 2 :
					// DDL.g:1139:5: COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					COALESCE503=(Token)match(input,COALESCE,FOLLOW_COALESCE_in_case_abbreviation8300); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COALESCE503_tree = (CommonTree)adaptor.create(COALESCE503);
					adaptor.addChild(root_0, COALESCE503_tree);
					}

					LEFT_PAREN504=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation8302); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN504_tree = (CommonTree)adaptor.create(LEFT_PAREN504);
					adaptor.addChild(root_0, LEFT_PAREN504_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation8304);
					numeric_value_expression505=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression505.getTree());

					// DDL.g:1139:50: ( COMMA boolean_value_expression )+
					int cnt143=0;
					loop143:
					while (true) {
						int alt143=2;
						int LA143_0 = input.LA(1);
						if ( (LA143_0==COMMA) ) {
							alt143=1;
						}

						switch (alt143) {
						case 1 :
							// DDL.g:1139:52: COMMA boolean_value_expression
							{
							COMMA506=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation8308); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA506_tree = (CommonTree)adaptor.create(COMMA506);
							adaptor.addChild(root_0, COMMA506_tree);
							}

							pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation8310);
							boolean_value_expression507=boolean_value_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression507.getTree());

							}
							break;

						default :
							if ( cnt143 >= 1 ) break loop143;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(143, input);
							throw eee;
						}
						cnt143++;
					}

					RIGHT_PAREN508=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation8316); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN508_tree = (CommonTree)adaptor.create(RIGHT_PAREN508);
					adaptor.addChild(root_0, RIGHT_PAREN508_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 150, case_abbreviation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "case_abbreviation"


	public static class case_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "case_specification"
	// DDL.g:1141:1: case_specification : ( simple_case | searched_case );
	public final DDLParser.case_specification_return case_specification() throws RecognitionException {
		DDLParser.case_specification_return retval = new DDLParser.case_specification_return();
		retval.start = input.LT(1);
		int case_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope simple_case509 =null;
		ParserRuleReturnScope searched_case510 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return retval; }

			// DDL.g:1142:3: ( simple_case | searched_case )
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==CASE) ) {
				int LA145_1 = input.LA(2);
				if ( (LA145_1==COUNT||LA145_1==Character_String_Literal||LA145_1==Identifier||LA145_1==LEFT_PAREN||LA145_1==MINUS||LA145_1==NULL||LA145_1==NUMBER||LA145_1==PLUS||LA145_1==REAL_NUMBER) ) {
					alt145=1;
				}
				else if ( (LA145_1==WHEN) ) {
					alt145=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}

			switch (alt145) {
				case 1 :
					// DDL.g:1142:5: simple_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_case_in_case_specification8328);
					simple_case509=simple_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_case509.getTree());

					}
					break;
				case 2 :
					// DDL.g:1143:5: searched_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_searched_case_in_case_specification8334);
					searched_case510=searched_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_case510.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 151, case_specification_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "case_specification"


	public static class simple_case_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_case"
	// DDL.g:1145:1: simple_case : CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END ;
	public final DDLParser.simple_case_return simple_case() throws RecognitionException {
		DDLParser.simple_case_return retval = new DDLParser.simple_case_return();
		retval.start = input.LT(1);
		int simple_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE511=null;
		Token END515=null;
		ParserRuleReturnScope numeric_value_expression512 =null;
		ParserRuleReturnScope simple_when_clause513 =null;
		ParserRuleReturnScope else_clause514 =null;

		CommonTree CASE511_tree=null;
		CommonTree END515_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return retval; }

			// DDL.g:1146:3: ( CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END )
			// DDL.g:1146:5: CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE511=(Token)match(input,CASE,FOLLOW_CASE_in_simple_case8346); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE511_tree = (CommonTree)adaptor.create(CASE511);
			adaptor.addChild(root_0, CASE511_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_case8348);
			numeric_value_expression512=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression512.getTree());

			// DDL.g:1146:35: ( simple_when_clause )+
			int cnt146=0;
			loop146:
			while (true) {
				int alt146=2;
				int LA146_0 = input.LA(1);
				if ( (LA146_0==WHEN) ) {
					alt146=1;
				}

				switch (alt146) {
				case 1 :
					// DDL.g:1146:37: simple_when_clause
					{
					pushFollow(FOLLOW_simple_when_clause_in_simple_case8352);
					simple_when_clause513=simple_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_when_clause513.getTree());

					}
					break;

				default :
					if ( cnt146 >= 1 ) break loop146;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(146, input);
					throw eee;
				}
				cnt146++;
			}

			// DDL.g:1146:59: ( else_clause )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==ELSE) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// DDL.g:1146:61: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_simple_case8359);
					else_clause514=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause514.getTree());

					}
					break;

			}

			END515=(Token)match(input,END,FOLLOW_END_in_simple_case8365); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END515_tree = (CommonTree)adaptor.create(END515);
			adaptor.addChild(root_0, END515_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 152, simple_case_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simple_case"


	public static class searched_case_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "searched_case"
	// DDL.g:1148:1: searched_case : CASE ^ ( searched_when_clause )+ ( else_clause )? END !;
	public final DDLParser.searched_case_return searched_case() throws RecognitionException {
		DDLParser.searched_case_return retval = new DDLParser.searched_case_return();
		retval.start = input.LT(1);
		int searched_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE516=null;
		Token END519=null;
		ParserRuleReturnScope searched_when_clause517 =null;
		ParserRuleReturnScope else_clause518 =null;

		CommonTree CASE516_tree=null;
		CommonTree END519_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return retval; }

			// DDL.g:1149:3: ( CASE ^ ( searched_when_clause )+ ( else_clause )? END !)
			// DDL.g:1149:5: CASE ^ ( searched_when_clause )+ ( else_clause )? END !
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE516=(Token)match(input,CASE,FOLLOW_CASE_in_searched_case8377); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE516_tree = (CommonTree)adaptor.create(CASE516);
			root_0 = (CommonTree)adaptor.becomeRoot(CASE516_tree, root_0);
			}

			// DDL.g:1149:11: ( searched_when_clause )+
			int cnt148=0;
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==WHEN) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// DDL.g:1149:12: searched_when_clause
					{
					pushFollow(FOLLOW_searched_when_clause_in_searched_case8381);
					searched_when_clause517=searched_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_when_clause517.getTree());

					}
					break;

				default :
					if ( cnt148 >= 1 ) break loop148;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(148, input);
					throw eee;
				}
				cnt148++;
			}

			// DDL.g:1149:35: ( else_clause )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==ELSE) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// DDL.g:1149:36: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_searched_case8386);
					else_clause518=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause518.getTree());

					}
					break;

			}

			END519=(Token)match(input,END,FOLLOW_END_in_searched_case8390); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 153, searched_case_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "searched_case"


	public static class simple_when_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_when_clause"
	// DDL.g:1151:1: simple_when_clause : WHEN numeric_value_expression THEN result ;
	public final DDLParser.simple_when_clause_return simple_when_clause() throws RecognitionException {
		DDLParser.simple_when_clause_return retval = new DDLParser.simple_when_clause_return();
		retval.start = input.LT(1);
		int simple_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN520=null;
		Token THEN522=null;
		ParserRuleReturnScope numeric_value_expression521 =null;
		ParserRuleReturnScope result523 =null;

		CommonTree WHEN520_tree=null;
		CommonTree THEN522_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return retval; }

			// DDL.g:1151:20: ( WHEN numeric_value_expression THEN result )
			// DDL.g:1151:22: WHEN numeric_value_expression THEN result
			{
			root_0 = (CommonTree)adaptor.nil();


			WHEN520=(Token)match(input,WHEN,FOLLOW_WHEN_in_simple_when_clause8401); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHEN520_tree = (CommonTree)adaptor.create(WHEN520);
			adaptor.addChild(root_0, WHEN520_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_when_clause8403);
			numeric_value_expression521=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression521.getTree());

			THEN522=(Token)match(input,THEN,FOLLOW_THEN_in_simple_when_clause8405); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			THEN522_tree = (CommonTree)adaptor.create(THEN522);
			adaptor.addChild(root_0, THEN522_tree);
			}

			pushFollow(FOLLOW_result_in_simple_when_clause8407);
			result523=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, result523.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 154, simple_when_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simple_when_clause"


	public static class searched_when_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "searched_when_clause"
	// DDL.g:1152:1: searched_when_clause : WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) ;
	public final DDLParser.searched_when_clause_return searched_when_clause() throws RecognitionException {
		DDLParser.searched_when_clause_return retval = new DDLParser.searched_when_clause_return();
		retval.start = input.LT(1);
		int searched_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN524=null;
		Token THEN525=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope r =null;

		CommonTree WHEN524_tree=null;
		CommonTree THEN525_tree=null;
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");
		RewriteRuleSubtreeStream stream_search_condition=new RewriteRuleSubtreeStream(adaptor,"rule search_condition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return retval; }

			// DDL.g:1153:3: ( WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) )
			// DDL.g:1153:5: WHEN c= search_condition THEN r= result
			{
			WHEN524=(Token)match(input,WHEN,FOLLOW_WHEN_in_searched_when_clause8417); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHEN.add(WHEN524);

			pushFollow(FOLLOW_search_condition_in_searched_when_clause8421);
			c=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_search_condition.add(c.getTree());
			THEN525=(Token)match(input,THEN,FOLLOW_THEN_in_searched_when_clause8423); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_THEN.add(THEN525);

			pushFollow(FOLLOW_result_in_searched_when_clause8427);
			r=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_result.add(r.getTree());
			// AST REWRITE
			// elements: c, WHEN, r
			// token labels: 
			// rule labels: retval, r, c
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1153:43: -> ^( WHEN $c $r)
			{
				// DDL.g:1153:46: ^( WHEN $c $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_WHEN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 155, searched_when_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "searched_when_clause"


	public static class else_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "else_clause"
	// DDL.g:1155:1: else_clause : ELSE r= result -> ^( ELSE $r) ;
	public final DDLParser.else_clause_return else_clause() throws RecognitionException {
		DDLParser.else_clause_return retval = new DDLParser.else_clause_return();
		retval.start = input.LT(1);
		int else_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ELSE526=null;
		ParserRuleReturnScope r =null;

		CommonTree ELSE526_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return retval; }

			// DDL.g:1156:3: ( ELSE r= result -> ^( ELSE $r) )
			// DDL.g:1156:5: ELSE r= result
			{
			ELSE526=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_clause8451); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ELSE.add(ELSE526);

			pushFollow(FOLLOW_result_in_else_clause8455);
			r=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_result.add(r.getTree());
			// AST REWRITE
			// elements: r, ELSE
			// token labels: 
			// rule labels: retval, r
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1156:19: -> ^( ELSE $r)
			{
				// DDL.g:1156:22: ^( ELSE $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_r.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 156, else_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "else_clause"


	public static class result_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "result"
	// DDL.g:1158:1: result : ( numeric_value_expression | NULL );
	public final DDLParser.result_return result() throws RecognitionException {
		DDLParser.result_return retval = new DDLParser.result_return();
		retval.start = input.LT(1);
		int result_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL528=null;
		ParserRuleReturnScope numeric_value_expression527 =null;

		CommonTree NULL528_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 157) ) { return retval; }

			// DDL.g:1159:3: ( numeric_value_expression | NULL )
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==COUNT||LA150_0==Character_String_Literal||LA150_0==Identifier||LA150_0==LEFT_PAREN||LA150_0==MINUS||LA150_0==NUMBER||LA150_0==PLUS||LA150_0==REAL_NUMBER) ) {
				alt150=1;
			}
			else if ( (LA150_0==NULL) ) {
				int LA150_2 = input.LA(2);
				if ( (synpred230_DDL()) ) {
					alt150=1;
				}
				else if ( (true) ) {
					alt150=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}

			switch (alt150) {
				case 1 :
					// DDL.g:1159:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_result8476);
					numeric_value_expression527=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression527.getTree());

					}
					break;
				case 2 :
					// DDL.g:1159:32: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL528=(Token)match(input,NULL,FOLLOW_NULL_in_result8480); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL528_tree = (CommonTree)adaptor.create(NULL528);
					adaptor.addChild(root_0, NULL528_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 157, result_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "result"

	// $ANTLR start synpred121_DDL
	public final void synpred121_DDL_fragment() throws RecognitionException {
		// DDL.g:783:5: ( non_join_query_expression )
		// DDL.g:783:5: non_join_query_expression
		{
		pushFollow(FOLLOW_non_join_query_expression_in_synpred121_DDL6023);
		non_join_query_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred121_DDL

	// $ANTLR start synpred122_DDL
	public final void synpred122_DDL_fragment() throws RecognitionException {
		// DDL.g:787:6: ( non_join_query_term )
		// DDL.g:787:6: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred122_DDL6042);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred122_DDL

	// $ANTLR start synpred130_DDL
	public final void synpred130_DDL_fragment() throws RecognitionException {
		// DDL.g:791:5: ( non_join_query_term )
		// DDL.g:791:5: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred130_DDL6102);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred130_DDL

	// $ANTLR start synpred151_DDL
	public final void synpred151_DDL_fragment() throws RecognitionException {
		// DDL.g:836:22: ( COMMA column_reference )
		// DDL.g:836:22: COMMA column_reference
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred151_DDL6454); if (state.failed) return;

		pushFollow(FOLLOW_column_reference_in_synpred151_DDL6456);
		column_reference();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred151_DDL

	// $ANTLR start synpred153_DDL
	public final void synpred153_DDL_fragment() throws RecognitionException {
		Token m=null;


		// DDL.g:845:39: ( LEFT_PAREN m= Identifier RIGHT_PAREN )
		// DDL.g:845:39: LEFT_PAREN m= Identifier RIGHT_PAREN
		{
		match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred153_DDL6510); if (state.failed) return;

		m=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred153_DDL6514); if (state.failed) return;

		match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred153_DDL6516); if (state.failed) return;

		}

	}
	// $ANTLR end synpred153_DDL

	// $ANTLR start synpred194_DDL
	public final void synpred194_DDL_fragment() throws RecognitionException {
		// DDL.g:1026:5: ( predicate )
		// DDL.g:1026:5: predicate
		{
		pushFollow(FOLLOW_predicate_in_synpred194_DDL7759);
		predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred194_DDL

	// $ANTLR start synpred195_DDL
	public final void synpred195_DDL_fragment() throws RecognitionException {
		// DDL.g:1027:5: ( numeric_value_expression )
		// DDL.g:1027:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred195_DDL7765);
		numeric_value_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred195_DDL

	// $ANTLR start synpred196_DDL
	public final void synpred196_DDL_fragment() throws RecognitionException {
		// DDL.g:1028:5: ( LEFT_PAREN boolean_value_expression RIGHT_PAREN )
		// DDL.g:1028:5: LEFT_PAREN boolean_value_expression RIGHT_PAREN
		{
		match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred196_DDL7771); if (state.failed) return;

		pushFollow(FOLLOW_boolean_value_expression_in_synpred196_DDL7774);
		boolean_value_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred196_DDL7776); if (state.failed) return;

		}

	}
	// $ANTLR end synpred196_DDL

	// $ANTLR start synpred197_DDL
	public final void synpred197_DDL_fragment() throws RecognitionException {
		// DDL.g:1037:5: ( comparison_predicate )
		// DDL.g:1037:5: comparison_predicate
		{
		pushFollow(FOLLOW_comparison_predicate_in_synpred197_DDL7797);
		comparison_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred197_DDL

	// $ANTLR start synpred198_DDL
	public final void synpred198_DDL_fragment() throws RecognitionException {
		// DDL.g:1038:5: ( in_predicate )
		// DDL.g:1038:5: in_predicate
		{
		pushFollow(FOLLOW_in_predicate_in_synpred198_DDL7803);
		in_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred198_DDL

	// $ANTLR start synpred199_DDL
	public final void synpred199_DDL_fragment() throws RecognitionException {
		// DDL.g:1039:5: ( like_predicate )
		// DDL.g:1039:5: like_predicate
		{
		pushFollow(FOLLOW_like_predicate_in_synpred199_DDL7809);
		like_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred199_DDL

	// $ANTLR start synpred230_DDL
	public final void synpred230_DDL_fragment() throws RecognitionException {
		// DDL.g:1159:5: ( numeric_value_expression )
		// DDL.g:1159:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred230_DDL8476);
		numeric_value_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred230_DDL

	// Delegated rules

	public final boolean synpred153_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred153_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred196_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred196_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred151_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred151_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred195_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred195_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred230_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred230_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred130_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred130_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred121_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred121_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred197_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred197_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred122_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred122_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred194_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred194_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred198_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred198_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred199_DDL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred199_DDL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_boolean_type_in_data_type3136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bit_type_in_data_type3142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varbit_type_in_data_type3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_type_in_data_type3154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varbinary_type_in_data_type3160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blob_type_in_data_type3166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INET4_in_data_type3172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_string_type_in_data_type3178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_type_in_data_type3184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_type_in_data_type3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_type_in_character_string_type3202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varchar_type_in_character_string_type3208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nchar_type_in_character_string_type3214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nvarchar_type_in_character_string_type3220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_character_string_type3226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int1_type_in_numeric_type3238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int2_type_in_numeric_type3244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int4_type_in_numeric_type3250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int8_type_in_numeric_type3256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float4_type_in_numeric_type3262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_type_in_numeric_type3268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float8_type_in_numeric_type3274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_type_in_numeric_type3280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_datetime_type3292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_datetime_type3298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timetz_type_in_datetime_type3304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_datetime_type3310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timestamptz_type_in_datetime_type3316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param3328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param3333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param3340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3343 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_COMMA_in_precision_param3345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param3350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_type_length3363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_NUMBER_in_type_length3366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_type_length3368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_boolean_type3381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_boolean_type3387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_bit_type3403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_bit_type3405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBIT_in_varbit_type3422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_varbit_type3424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_varbit_type3435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VARYING_in_varbit_type3437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_varbit_type3439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT1_in_int1_type3456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TINYINT_in_int1_type3462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT2_in_int2_type3478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMALLINT_in_int2_type3484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT4_in_int4_type3500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_int4_type3506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_int4_type3516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT8_in_int8_type3532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIGINT_in_int8_type3538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT4_in_float4_type3554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_float4_type3560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_float_type3574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_float_type3576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT8_in_float8_type3595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type3601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type3611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_PRECISION_in_float8_type3613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERIC_in_number_type3629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_precision_param_in_number_type3632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_number_type3648 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_precision_param_in_number_type3651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_number_type3669 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_precision_param_in_number_type3676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_char_type3700 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_char_type3702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_char_type3713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_char_type3715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARCHAR_in_varchar_type3732 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_varchar_type3734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_varchar_type3745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VARYING_in_varchar_type3747 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_varchar_type3749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCHAR_in_nchar_type3766 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_nchar_type3768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nchar_type3779 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nchar_type3781 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_nchar_type3783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NVARCHAR_in_nvarchar_type3800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type3802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nvarchar_type3813 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nvarchar_type3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VARYING_in_nvarchar_type3817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type3819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMETZ_in_timetz_type3836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timetz_type3842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_WITH_in_timetz_type3844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_TIME_in_timetz_type3846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ZONE_in_timetz_type3848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMPTZ_in_timestamptz_type3864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_timestamptz_type3870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_WITH_in_timestamptz_type3872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_TIME_in_timestamptz_type3874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ZONE_in_timestamptz_type3876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_binary_type3892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_binary_type3894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBINARY_in_varbinary_type3907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_varbinary_type3909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_varbinary_type3916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VARYING_in_varbinary_type3918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_length_in_varbinary_type3920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOB_in_blob_type3933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTEA_in_blob_type3939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_sql3957 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_sql3959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_statement_in_statement3976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_statement_in_statement3982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transaction_statement_in_statement3988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_control_statement_in_statement3994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_connection_statement_in_statement4000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_table_statement_in_schema_statement4025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_view_statement_in_schema_statement4031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_alias_statement_in_schema_statement4037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_alias_statement_in_schema_statement4043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_table_statement_in_schema_statement4049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_view_statement_in_schema_statement4055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rename_table_statement_in_schema_statement4062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_index_statement_in_index_statement4080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_index_statement_in_index_statement4088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rename_index_statement_in_index_statement4098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commit_statement_in_transaction_statement4113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lock_statement_in_transaction_statement4122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_release_statement_in_transaction_statement4128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rollback_statement_in_transaction_statement4134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_transaction_statement_in_transaction_statement4141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_connect_statement_in_connection_statement4153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disconnect_statement_in_connection_statement4159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_connection_statement_in_connection_statement4165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_procedure_in_control_statement4178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_index_statement4197 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_UNIQUE_in_create_index_statement4202 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_INDEX_in_create_index_statement4206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_qualified_identifier_in_create_index_statement4210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_ON_in_create_index_statement4212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_create_index_statement4216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x8000000000000000L});
	public static final BitSet FOLLOW_method_specifier_in_create_index_statement4221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_create_index_statement4229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_sort_specifier_list_in_create_index_statement4233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_create_index_statement4235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_param_clause_in_create_index_statement4239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_index_statement4292 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_INDEX_in_drop_index_statement4294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_drop_index_statement4298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_table_statement4327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_EXTERNAL_in_create_table_statement4329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_TABLE_in_create_table_statement4331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_create_table_statement4335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_table_elements_in_create_table_statement4339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_USING_in_create_table_statement4341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_create_table_statement4345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_param_clause_in_create_table_statement4353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LOCATION_in_create_table_statement4357 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Character_String_Literal_in_create_table_statement4361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_table_statement4423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_TABLE_in_create_table_statement4425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_create_table_statement4429 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000000000000400L,0x8000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_table_elements_in_create_table_statement4434 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_USING_in_create_table_statement4439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_create_table_statement4443 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_param_clause_in_create_table_statement4454 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_AS_in_create_table_statement4459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000408L,0x0000000000800000L});
	public static final BitSet FOLLOW_query_expression_in_create_table_statement4463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_table_elements4524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_field_element_in_table_elements4526 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_COMMA_in_table_elements4529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_field_element_in_table_elements4531 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_table_elements4535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_field_element4559 = new BitSet(new long[]{0x1A000000617E0000L,0x3F200003C0000020L,0x0000030028000000L,0x001F400400000010L,0x000000000000001CL});
	public static final BitSet FOLLOW_FOR_in_field_element4562 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_COLUMN_in_field_element4564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_field_element4568 = new BitSet(new long[]{0x1A000000617E0000L,0x3F200001C0000020L,0x0000030028000000L,0x001F400400000010L,0x000000000000001CL});
	public static final BitSet FOLLOW_field_type_in_field_element4572 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_not_null_in_field_element4575 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_with_default_in_field_element4580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_not_null4630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_NULL_in_not_null4632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_with_default4653 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_DEFAULT_in_with_default4655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_type_in_field_type4681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_view_statement4697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VIEW_in_create_view_statement4699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_create_view_statement4703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_create_view_statement4708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create_alias_statement4756 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_or_replace_in_create_alias_statement4759 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALIAS_in_create_alias_statement4763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_create_alias_statement4767 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_FOR_in_create_alias_statement4769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_create_alias_statement4773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_or_replace4816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_REPLACE_in_or_replace4818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_alias_statement4837 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALIAS_in_drop_alias_statement4839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_drop_alias_statement4843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMIT_in_commit_statement4870 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_WORK_in_commit_statement4874 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_HOLD_in_commit_statement4881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONNECT_in_connect_statement4905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_TO_in_connect_statement4908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_connect_statement4913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_USER_in_connect_statement4916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_connect_statement4920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_USING_in_connect_statement4922 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Character_String_Literal_in_connect_statement4926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONNECT_in_connect_statement4971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RESET_in_connect_statement4973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISCONNECT_in_disconnect_statement4993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISCONNECT_in_disconnect_statement5009 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ALL_in_disconnect_statement5011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISCONNECT_in_disconnect_statement5029 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_CURRENT_in_disconnect_statement5031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_table_statement5055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_TABLE_in_drop_table_statement5057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_drop_table_statement5061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_table_statement5081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_TABLE_in_drop_table_statement5083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_drop_table_statement5087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_restrict_in_drop_table_statement5089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_table_statement5110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_TABLE_in_drop_table_statement5112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_drop_table_statement5116 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_cascade_in_drop_table_statement5118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_view_statement5152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VIEW_in_drop_view_statement5154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_drop_view_statement5158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_view_statement5178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VIEW_in_drop_view_statement5180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_drop_view_statement5184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_restrict_in_drop_view_statement5186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop_view_statement5207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VIEW_in_drop_view_statement5209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_drop_view_statement5213 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_cascade_in_drop_view_statement5215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESTRICT_in_restrict5252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASCADE_in_cascade5271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCK_in_lock_statement5290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_TABLE_in_lock_statement5292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_lock_statement5296 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_IN_in_lock_statement5298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_SHARE_in_lock_statement5300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_MODE_in_lock_statement5302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCK_in_lock_statement5326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_TABLE_in_lock_statement5328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_lock_statement5332 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_IN_in_lock_statement5334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_EXCLUSIVE_in_lock_statement5336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_MODE_in_lock_statement5338 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_allow_read_in_lock_statement5341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALLOW_in_allow_read5379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_READ_in_allow_read5381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RENAME_in_rename_table_statement5400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_TABLE_in_rename_table_statement5402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_rename_table_statement5406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_TO_in_rename_table_statement5408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_rename_table_statement5412 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_FOR_in_rename_table_statement5414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_SYSTEM_in_rename_table_statement5416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_NAME_in_rename_table_statement5418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_rename_table_statement5422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RENAME_in_rename_index_statement5462 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_INDEX_in_rename_index_statement5464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_rename_index_statement5468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_TO_in_rename_index_statement5470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_rename_index_statement5474 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_FOR_in_rename_index_statement5476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_SYSTEM_in_rename_index_statement5478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_NAME_in_rename_index_statement5480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_rename_index_statement5484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELEASE_in_release_statement5525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELEASE_in_release_statement5541 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ALL_in_release_statement5543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELEASE_in_release_statement5561 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_CURRENT_in_release_statement5563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROLLBACK_in_rollback_statement5585 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_HOLD_in_rollback_statement5590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_connection_statement5617 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_CONNECTION_in_set_connection_statement5619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_set_connection_statement5623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_transaction_statement5649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement5651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ISOLATION_in_set_transaction_statement5653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LEVEL_in_set_transaction_statement5655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000080000000L,0x0000000004000800L});
	public static final BitSet FOLLOW_isolation_level_in_set_transaction_statement5659 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_COMMA_in_set_transaction_statement5662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_read_operation_in_set_transaction_statement5666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SERIALIZABLE_in_isolation_level5707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_no_commit_in_isolation_level5713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_uncommitted_in_isolation_level5719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_committed_in_isolation_level5725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatable_read_in_isolation_level5731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NO_in_no_commit5745 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_COMMIT_in_no_commit5747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_uncommitted5770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_UNCOMMITTED_in_read_uncommitted5772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_committed5791 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_COMMITTED_in_read_committed5793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEATABLE_in_repeatable_read5814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_READ_in_repeatable_read5816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_only_in_read_operation5835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_write_in_read_operation5841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_only5854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_ONLY_in_read_only5856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_write5876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_WRITE_in_read_write5878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CALL_in_call_procedure5901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_qualified_identifier_in_call_procedure5905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_call_procedure5908 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000020020L});
	public static final BitSet FOLLOW_funcArgs_in_call_procedure5910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_call_procedure5913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert_statement5947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_276_in_insert_statement5949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_in_insert_statement5951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_insert_statement5954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_column_reference_list_in_insert_statement5956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_insert_statement5958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_277_in_insert_statement5962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_array_in_insert_statement5964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_expression_body_in_query_expression6011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_query_expression_body6023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_expression_body6029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_non_join_query_expression6042 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_expression6046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression6048 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000004L,0x0000000000000408L,0x0000000000800000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression6064 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression6072 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000004L,0x0000000000000408L,0x0000000000800000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression6088 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_non_join_query_term_in_query_term6102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_term6108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_primary_in_non_join_query_term6122 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_term6126 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term6128 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000004L,0x0000000000000408L,0x0000000000800000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term6138 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term6146 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000004L,0x0000000000000408L,0x0000000000800000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term6156 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
	public static final BitSet FOLLOW_non_join_query_primary_in_query_primary6170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_primary6176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_table_in_non_join_query_primary6188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_non_join_query_primary6194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000408L,0x0000000000800000L});
	public static final BitSet FOLLOW_non_join_query_expression_in_non_join_query_primary6196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_non_join_query_primary6198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_specification_in_simple_table6219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_query_specification6231 = new BitSet(new long[]{0x0040080010000080L,0x0000000000000004L,0x0040009101200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_set_qualifier_in_query_specification6233 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009101200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_select_list_in_query_specification6236 = new BitSet(new long[]{0x0000000000000002L,0x0000441000000000L,0x0000800000004000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_from_clause_in_query_specification6238 = new BitSet(new long[]{0x0000000000000002L,0x0000440000000000L,0x0000800000004000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_where_clause_in_query_specification6241 = new BitSet(new long[]{0x0000000000000002L,0x0000440000000000L,0x0000800000004000L});
	public static final BitSet FOLLOW_groupby_clause_in_query_specification6244 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L,0x0000800000004000L});
	public static final BitSet FOLLOW_having_clause_in_query_specification6247 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000004000L});
	public static final BitSet FOLLOW_orderby_clause_in_query_specification6254 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_limit_clause_in_query_specification6257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTIPLY_in_select_list6307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derived_column_in_select_list6321 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_COMMA_in_select_list6324 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_derived_column_in_select_list6326 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_DISTINCT_in_set_qualifier6349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_set_qualifier6363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_derived_column6383 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_as_clause_in_derived_column6385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_column_reference6413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_as_clause6436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_column_reference_in_as_clause6440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list6451 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_COMMA_in_column_reference_list6454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list6456 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_Identifier_in_table6474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_identifier_in_table6486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_qualified_identifier6503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6507 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_qualified_identifier6510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_qualified_identifier6516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_member6551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_member6553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_member6557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_member6559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_member6563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_member6565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from_clause6600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_reference_list_in_from_clause6603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list6614 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_COMMA_in_table_reference_list6617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list6619 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_table_primary_in_table_reference6638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_table_reference6644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_primary_in_joined_table6656 = new BitSet(new long[]{0x0008000000000000L,0x0040002000000000L,0x0000000010000220L,0x0800000000010000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table6659 = new BitSet(new long[]{0x0008000000000002L,0x0040002000000000L,0x0000000010000220L,0x0800000000010000L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table6663 = new BitSet(new long[]{0x0008000000000002L,0x0040002000000000L,0x0000000010000220L,0x0800000000010000L});
	public static final BitSet FOLLOW_natural_join_in_joined_table6667 = new BitSet(new long[]{0x0008000000000002L,0x0040002000000000L,0x0000000010000220L,0x0800000000010000L});
	public static final BitSet FOLLOW_union_join_in_joined_table6671 = new BitSet(new long[]{0x0008000000000002L,0x0040002000000000L,0x0000000010000220L,0x0800000000010000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table_prim6685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table_prim6691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_natural_join_in_joined_table_prim6697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_union_join_in_joined_table_prim6703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CROSS_in_cross_join6715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_JOIN_in_cross_join6717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_primary_in_cross_join6721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_type_in_qualified_join6747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_JOIN_in_qualified_join6751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_primary_in_qualified_join6755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_join_specification_in_qualified_join6759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATURAL_in_natural_join6787 = new BitSet(new long[]{0x0000000000000000L,0x0040002000000000L,0x0000000000000220L,0x0000000000010000L});
	public static final BitSet FOLLOW_join_type_in_natural_join6792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_JOIN_in_natural_join6796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_primary_in_natural_join6800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNION_in_union_join6827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_JOIN_in_union_join6829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_table_primary_in_union_join6833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNER_in_join_type6856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type6864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_OUTER_in_join_type6866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type6883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_condition_in_join_specification6928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_named_columns_join_in_join_specification6934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_condition6946 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_search_condition_in_join_condition6949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_named_columns_join6961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_named_columns_join6963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_column_reference_list_in_named_columns_join6967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_named_columns_join6969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_in_table_primary6990 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_AS_in_table_primary6994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_table_primary7000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause7028 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_search_condition_in_where_clause7031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_routine_invocation7044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7046 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000020020L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation7048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation7066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7068 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation7070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation7085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_MULTIPLY_in_routine_invocation7089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs7108 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_COMMA_in_funcArgs7111 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs7113 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_GROUP_in_groupby_clause7134 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_BY_in_groupby_clause7136 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000000408L,0x0000000000100000L});
	public static final BitSet FOLLOW_grouping_element_list_in_groupby_clause7140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list7161 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_COMMA_in_grouping_element_list7164 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000000408L,0x0000000000100000L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list7166 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_grouping_element7185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rollup_list_in_grouping_element7191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cube_list_in_grouping_element7197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_grouping_set_in_grouping_element7203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set7215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_ordinary_grouping_set7221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set7224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set7226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROLLUP_in_rollup_list7239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_rollup_list7241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_rollup_list7245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_rollup_list7247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CUBE_in_cube_list7268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_cube_list7270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_cube_list7274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_cube_list7276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_empty_grouping_set7297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_empty_grouping_set7299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HAVING_in_having_clause7317 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_boolean_value_expression_in_having_clause7320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_orderby_clause7334 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_BY_in_orderby_clause7336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_sort_specifier_list_in_orderby_clause7338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list7358 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_COMMA_in_sort_specifier_list7361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list7363 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_column_reference_in_sort_specifier7388 = new BitSet(new long[]{0x4000000000001002L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_order_specification_in_sort_specifier7392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_null_ordering_in_sort_specifier7397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASC_in_order_specification7427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESC_in_order_specification7441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIMIT_in_limit_clause7461 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_value_expression_in_limit_clause7465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering7486 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_FIRST_in_null_ordering7488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering7502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LAST_in_null_ordering7504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_search_condition7526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_param_clause7537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_param_clause7539 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause7541 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_COMMA_in_param_clause7544 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause7546 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_param_clause7550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_param7573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_EQUAL_in_param7575 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_value_expression_in_param7579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_method_specifier7603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_method_specifier7607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression7627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_OR_in_boolean_value_expression7630 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression7633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate7646 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AND_in_and_predicate7649 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate7652 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor7665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_boolean_factor7671 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor7673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_primary_in_boolean_test7693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_is_clause_in_boolean_test7695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_in_is_clause7708 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000100000000L,0x2080000000000000L});
	public static final BitSet FOLLOW_NOT_in_is_clause7710 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x2080000000000000L});
	public static final BitSet FOLLOW_truth_value_in_is_clause7715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_boolean_primary7759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_boolean_primary7765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_boolean_primary7771 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_boolean_value_expression_in_boolean_primary7774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_boolean_primary7776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_boolean_primary7783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_predicate7797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_predicate7803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_predicate7809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_predicate_in_predicate7815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate7839 = new BitSet(new long[]{0x0000000000000000L,0x0000120000020000L,0x0000000200040800L});
	public static final BitSet FOLLOW_comp_op_in_comparison_predicate7843 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate7847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_predicate7915 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_NOT_in_in_predicate7918 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_IN_in_in_predicate7921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_in_predicate_value_in_in_predicate7925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_in_predicate_value7949 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_in_value_list_in_in_predicate_value7952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_in_predicate_value7955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list7967 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_COMMA_in_in_value_list7972 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list7974 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_column_reference_in_like_predicate7996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100002000L});
	public static final BitSet FOLLOW_NOT_in_like_predicate7998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LIKE_in_like_predicate8001 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Character_String_Literal_in_like_predicate8005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_null_predicate8036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_IS_in_null_predicate8038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001100000000L});
	public static final BitSet FOLLOW_NOT_in_null_predicate8043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_NULL_in_null_predicate8047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression8075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000200000L});
	public static final BitSet FOLLOW_set_in_numeric_value_expression8078 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression8085 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000200000L});
	public static final BitSet FOLLOW_numeric_primary_in_term8098 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L,0x0000000001800000L});
	public static final BitSet FOLLOW_set_in_term8101 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_primary_in_term8110 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L,0x0000000001800000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_array8123 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0040009000200000L,0x0000000000000020L});
	public static final BitSet FOLLOW_literal_in_array8125 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_COMMA_in_array8128 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0040009000200000L,0x0000000000000020L});
	public static final BitSet FOLLOW_literal_in_array8130 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_array8135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_numeric_primary8152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_numeric_primary8157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_numeric_primary8162 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_value_expression_in_numeric_primary8165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_numeric_primary8167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_routine_invocation_in_numeric_primary8173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_value_expr_in_literal8184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signed_numerical_literal_in_literal8190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_literal8196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_string_value_expr8208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sign_in_signed_numerical_literal8220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal8223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_specification_in_case_expression8271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULLIF_in_case_abbreviation8283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation8285 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation8287 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation8289 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation8291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation8294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COALESCE_in_case_abbreviation8300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation8302 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation8304 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation8308 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation8310 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation8316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_case_in_case_specification8328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_searched_case_in_case_specification8334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_simple_case8346 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_case8348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_simple_when_clause_in_simple_case8352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000014000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_else_clause_in_simple_case8359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_simple_case8365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_searched_case8377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_searched_when_clause_in_searched_case8381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000014000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_else_clause_in_searched_case8386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_searched_case8390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_simple_when_clause8401 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_when_clause8403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_THEN_in_simple_when_clause8405 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_result_in_simple_when_clause8407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_searched_when_clause8417 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_search_condition_in_searched_when_clause8421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_THEN_in_searched_when_clause8423 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_result_in_searched_when_clause8427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_clause8451 = new BitSet(new long[]{0x0040080000000000L,0x0000000000000000L,0x0040009000200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_result_in_else_clause8455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_result8476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_result8480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_synpred121_DDL6023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred122_DDL6042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred130_DDL6102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred151_DDL6454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_column_reference_in_synpred151_DDL6456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_synpred153_DDL6510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_synpred153_DDL6514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred153_DDL6516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred194_DDL7759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred195_DDL7765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_synpred196_DDL7771 = new BitSet(new long[]{0x0040080010000000L,0x0000000000000000L,0x0040009100200408L,0x0000000000000020L});
	public static final BitSet FOLLOW_boolean_value_expression_in_synpred196_DDL7774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred196_DDL7776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_synpred197_DDL7797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_synpred198_DDL7803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_synpred199_DDL7809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred230_DDL8476 = new BitSet(new long[]{0x0000000000000002L});
}
