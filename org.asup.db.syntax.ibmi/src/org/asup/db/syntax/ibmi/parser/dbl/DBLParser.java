// $ANTLR 3.5.1 DBL.g 2014-12-12 16:02:29

package org.asup.db.syntax.ibmi.parser.dbl;
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
public class DBLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AFTER", "ALIAS", "ALIAS_NAME", 
		"ALL", "ALLOW", "ALLOW_READ", "ALL_SQL", "AND", "ANY", "AS", "ASC", "ASSIGN", 
		"AS_EXPRESSION", "B", "BAD", "BEFORE", "BIGINT", "BINARY", "BIT", "BLOB", 
		"BOOL", "BOOLEAN", "BOTH", "BY", "BYTEA", "C", "CALL", "CASCADE", "CASE", 
		"CHAR", "CHARACTER", "CLOSE", "CLOSE_STATEMENT", "COALESCE", "COLUMN", 
		"COLUMNS_LIST", "COLUMN_NAME", "COMMA", "COMMENT", "COMMIT", "COMMITTED", 
		"CONNECT", "CONNECTION", "COUNT", "COUNT_ROWS", "COUNT_VAL", "CREATE", 
		"CROSS", "CUBE", "CURRENT", "CURSOR", "Character_String_Literal", "Control_Characters", 
		"D", "DATE", "DB_NAME", "DEC", "DECIMAL", "DECLARE", "DECLARE_CURSOR_STATEMENT", 
		"DEFAULT", "DESC", "DESCRIBE", "DESCRIBE_STATEMENT", "DESCRIPTOR", "DISCONNECT", 
		"DISTINCT", "DIVIDE", "DOT", "DOUBLE", "DROP", "DYNAMIC", "Digit", "Double_Quote", 
		"E", "ELSE", "EMPTY_GROUPING_SET", "END", "EQUAL", "ESC_SEQ", "EXCEPT", 
		"EXCLUSIVE", "EXECUTE", "EXECUTE_IMMEDIATE_STATEMENT", "EXECUTE_STATEMENT", 
		"EXPONENT", "EXTERNAL", "Extended_Control_Characters", "F", "FALSE", "FETCH", 
		"FETCH_POSITION", "FETCH_STATEMENT", "FIELD_DEF", "FIELD_NAME", "FIELD_TYPE", 
		"FIRST", "FLOAT", "FLOAT4", "FLOAT8", "FOR", "FORMAT", "FOR_COLUMN", "FROM", 
		"FULL", "FUNCTION", "FUNC_ARGS", "G", "GEQ", "GROUP", "GROUP_BY", "GTH", 
		"H", "HAVING", "HEX_DIGIT", "HOLD", "I", "IMMEDIATE", "IN", "INDEX", "INDEX_NAME", 
		"INET4", "INNER", "INSERT", "INT", "INT1", "INT2", "INT4", "INT8", "INTEGER", 
		"INTERSECT", "INTO", "IS", "ISOLATION", "ISOLATION_LEVEL", "Identifier", 
		"J", "JOIN", "K", "L", "LABELS", "LAST", "LEFT", "LEFT_PAREN", "LEQ", 
		"LEVEL", "LIKE", "LIMIT", "LOCATION", "LOCK", "LTH", "M", "MEMBER", "MINUS", 
		"MODE", "MODULAR", "MULTIPLE_ROW_FETCH", "MULTIPLY", "N", "NAME", "NAMES", 
		"NATIONAL", "NATURAL", "NCHAR", "NEW_NAME", "NEXT", "NO", "NOT", "NOT_EQUAL", 
		"NOT_NULL", "NO_COMMIT", "NULL", "NULLIF", "NULL_ORDER", "NUMBER", "NUMERIC", 
		"NVARCHAR", "O", "OCTAL_ESC", "ON", "ONLY", "OPEN", "OPEN_STATEMENT", 
		"OR", "ORDER", "ORDER_BY", "OR_REPLACE", "OUTER", "P", "PARAM", "PARAMS", 
		"PLUS", "PRECISION", "PREPARE", "PREPARE_STATEMENT", "PRIOR", "PROCEDURE_ARGS", 
		"PROCEDURE_NAME", "Q", "QUALIFIED", "Quote", "R", "READ", "READ_COMMITTED", 
		"READ_ONLY", "READ_UNCOMMITTED", "READ_WRITE", "REAL", "REAL_NUMBER", 
		"RELATIVE", "RELEASE", "RELEASE_STATEMENT", "RENAME", "REPEATABLE", "REPEATABLE_READ", 
		"REPLACE", "RESET", "RESTRICT", "RIGHT", "RIGHT_PAREN", "ROLLBACK", "ROLLBACK_STATEMENT", 
		"ROLLUP", "ROWS", "RW_OPERATION", "S", "SCROLL", "SELECT", "SEL_LIST", 
		"SEMI_COLON", "SERIALIZABLE", "SERVER_NAME", "SET", "SET_QUALIFIER", "SET_TRANSACTION_STATEMENT", 
		"SHARE", "SHOW_FUNCTION", "SHOW_TABLE", "SINGLE_FETCH", "SMALLINT", "SORT_KEY", 
		"SORT_SPECIFIERS", "SQL", "STATEMENT", "STORE", "STORE_TYPE", "SYSTEM", 
		"SYSTEM_NAMES", "Space", "T", "TABLE", "TABLE_DEF", "TABLE_NAME", "TARGET_FIELDS", 
		"TEXT", "THEN", "TIME", "TIMESTAMP", "TIMESTAMPTZ", "TIMETZ", "TINYINT", 
		"TO", "TRANSACTION", "TRUE", "U", "UNCOMMITTED", "UNICODE_ESC", "UNION", 
		"UNIQUE", "UNKNOWN", "USER", "USING", "USING_DESCRIPTOR", "V", "VALUES", 
		"VARBINARY", "VARBIT", "VARCHAR", "VARIABLE", "VARYING", "VIEW", "VIEW_NAME", 
		"Variable", "W", "WHEN", "WHERE", "WITH", "WITHOUT", "WITH_DEFAULT", "WORK", 
		"WRITE", "White_Space", "X", "Y", "Z", "ZONE"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int AFTER=5;
	public static final int ALIAS=6;
	public static final int ALIAS_NAME=7;
	public static final int ALL=8;
	public static final int ALLOW=9;
	public static final int ALLOW_READ=10;
	public static final int ALL_SQL=11;
	public static final int AND=12;
	public static final int ANY=13;
	public static final int AS=14;
	public static final int ASC=15;
	public static final int ASSIGN=16;
	public static final int AS_EXPRESSION=17;
	public static final int B=18;
	public static final int BAD=19;
	public static final int BEFORE=20;
	public static final int BIGINT=21;
	public static final int BINARY=22;
	public static final int BIT=23;
	public static final int BLOB=24;
	public static final int BOOL=25;
	public static final int BOOLEAN=26;
	public static final int BOTH=27;
	public static final int BY=28;
	public static final int BYTEA=29;
	public static final int C=30;
	public static final int CALL=31;
	public static final int CASCADE=32;
	public static final int CASE=33;
	public static final int CHAR=34;
	public static final int CHARACTER=35;
	public static final int CLOSE=36;
	public static final int CLOSE_STATEMENT=37;
	public static final int COALESCE=38;
	public static final int COLUMN=39;
	public static final int COLUMNS_LIST=40;
	public static final int COLUMN_NAME=41;
	public static final int COMMA=42;
	public static final int COMMENT=43;
	public static final int COMMIT=44;
	public static final int COMMITTED=45;
	public static final int CONNECT=46;
	public static final int CONNECTION=47;
	public static final int COUNT=48;
	public static final int COUNT_ROWS=49;
	public static final int COUNT_VAL=50;
	public static final int CREATE=51;
	public static final int CROSS=52;
	public static final int CUBE=53;
	public static final int CURRENT=54;
	public static final int CURSOR=55;
	public static final int Character_String_Literal=56;
	public static final int Control_Characters=57;
	public static final int D=58;
	public static final int DATE=59;
	public static final int DB_NAME=60;
	public static final int DEC=61;
	public static final int DECIMAL=62;
	public static final int DECLARE=63;
	public static final int DECLARE_CURSOR_STATEMENT=64;
	public static final int DEFAULT=65;
	public static final int DESC=66;
	public static final int DESCRIBE=67;
	public static final int DESCRIBE_STATEMENT=68;
	public static final int DESCRIPTOR=69;
	public static final int DISCONNECT=70;
	public static final int DISTINCT=71;
	public static final int DIVIDE=72;
	public static final int DOT=73;
	public static final int DOUBLE=74;
	public static final int DROP=75;
	public static final int DYNAMIC=76;
	public static final int Digit=77;
	public static final int Double_Quote=78;
	public static final int E=79;
	public static final int ELSE=80;
	public static final int EMPTY_GROUPING_SET=81;
	public static final int END=82;
	public static final int EQUAL=83;
	public static final int ESC_SEQ=84;
	public static final int EXCEPT=85;
	public static final int EXCLUSIVE=86;
	public static final int EXECUTE=87;
	public static final int EXECUTE_IMMEDIATE_STATEMENT=88;
	public static final int EXECUTE_STATEMENT=89;
	public static final int EXPONENT=90;
	public static final int EXTERNAL=91;
	public static final int Extended_Control_Characters=92;
	public static final int F=93;
	public static final int FALSE=94;
	public static final int FETCH=95;
	public static final int FETCH_POSITION=96;
	public static final int FETCH_STATEMENT=97;
	public static final int FIELD_DEF=98;
	public static final int FIELD_NAME=99;
	public static final int FIELD_TYPE=100;
	public static final int FIRST=101;
	public static final int FLOAT=102;
	public static final int FLOAT4=103;
	public static final int FLOAT8=104;
	public static final int FOR=105;
	public static final int FORMAT=106;
	public static final int FOR_COLUMN=107;
	public static final int FROM=108;
	public static final int FULL=109;
	public static final int FUNCTION=110;
	public static final int FUNC_ARGS=111;
	public static final int G=112;
	public static final int GEQ=113;
	public static final int GROUP=114;
	public static final int GROUP_BY=115;
	public static final int GTH=116;
	public static final int H=117;
	public static final int HAVING=118;
	public static final int HEX_DIGIT=119;
	public static final int HOLD=120;
	public static final int I=121;
	public static final int IMMEDIATE=122;
	public static final int IN=123;
	public static final int INDEX=124;
	public static final int INDEX_NAME=125;
	public static final int INET4=126;
	public static final int INNER=127;
	public static final int INSERT=128;
	public static final int INT=129;
	public static final int INT1=130;
	public static final int INT2=131;
	public static final int INT4=132;
	public static final int INT8=133;
	public static final int INTEGER=134;
	public static final int INTERSECT=135;
	public static final int INTO=136;
	public static final int IS=137;
	public static final int ISOLATION=138;
	public static final int ISOLATION_LEVEL=139;
	public static final int Identifier=140;
	public static final int J=141;
	public static final int JOIN=142;
	public static final int K=143;
	public static final int L=144;
	public static final int LABELS=145;
	public static final int LAST=146;
	public static final int LEFT=147;
	public static final int LEFT_PAREN=148;
	public static final int LEQ=149;
	public static final int LEVEL=150;
	public static final int LIKE=151;
	public static final int LIMIT=152;
	public static final int LOCATION=153;
	public static final int LOCK=154;
	public static final int LTH=155;
	public static final int M=156;
	public static final int MEMBER=157;
	public static final int MINUS=158;
	public static final int MODE=159;
	public static final int MODULAR=160;
	public static final int MULTIPLE_ROW_FETCH=161;
	public static final int MULTIPLY=162;
	public static final int N=163;
	public static final int NAME=164;
	public static final int NAMES=165;
	public static final int NATIONAL=166;
	public static final int NATURAL=167;
	public static final int NCHAR=168;
	public static final int NEW_NAME=169;
	public static final int NEXT=170;
	public static final int NO=171;
	public static final int NOT=172;
	public static final int NOT_EQUAL=173;
	public static final int NOT_NULL=174;
	public static final int NO_COMMIT=175;
	public static final int NULL=176;
	public static final int NULLIF=177;
	public static final int NULL_ORDER=178;
	public static final int NUMBER=179;
	public static final int NUMERIC=180;
	public static final int NVARCHAR=181;
	public static final int O=182;
	public static final int OCTAL_ESC=183;
	public static final int ON=184;
	public static final int ONLY=185;
	public static final int OPEN=186;
	public static final int OPEN_STATEMENT=187;
	public static final int OR=188;
	public static final int ORDER=189;
	public static final int ORDER_BY=190;
	public static final int OR_REPLACE=191;
	public static final int OUTER=192;
	public static final int P=193;
	public static final int PARAM=194;
	public static final int PARAMS=195;
	public static final int PLUS=196;
	public static final int PRECISION=197;
	public static final int PREPARE=198;
	public static final int PREPARE_STATEMENT=199;
	public static final int PRIOR=200;
	public static final int PROCEDURE_ARGS=201;
	public static final int PROCEDURE_NAME=202;
	public static final int Q=203;
	public static final int QUALIFIED=204;
	public static final int Quote=205;
	public static final int R=206;
	public static final int READ=207;
	public static final int READ_COMMITTED=208;
	public static final int READ_ONLY=209;
	public static final int READ_UNCOMMITTED=210;
	public static final int READ_WRITE=211;
	public static final int REAL=212;
	public static final int REAL_NUMBER=213;
	public static final int RELATIVE=214;
	public static final int RELEASE=215;
	public static final int RELEASE_STATEMENT=216;
	public static final int RENAME=217;
	public static final int REPEATABLE=218;
	public static final int REPEATABLE_READ=219;
	public static final int REPLACE=220;
	public static final int RESET=221;
	public static final int RESTRICT=222;
	public static final int RIGHT=223;
	public static final int RIGHT_PAREN=224;
	public static final int ROLLBACK=225;
	public static final int ROLLBACK_STATEMENT=226;
	public static final int ROLLUP=227;
	public static final int ROWS=228;
	public static final int RW_OPERATION=229;
	public static final int S=230;
	public static final int SCROLL=231;
	public static final int SELECT=232;
	public static final int SEL_LIST=233;
	public static final int SEMI_COLON=234;
	public static final int SERIALIZABLE=235;
	public static final int SERVER_NAME=236;
	public static final int SET=237;
	public static final int SET_QUALIFIER=238;
	public static final int SET_TRANSACTION_STATEMENT=239;
	public static final int SHARE=240;
	public static final int SHOW_FUNCTION=241;
	public static final int SHOW_TABLE=242;
	public static final int SINGLE_FETCH=243;
	public static final int SMALLINT=244;
	public static final int SORT_KEY=245;
	public static final int SORT_SPECIFIERS=246;
	public static final int SQL=247;
	public static final int STATEMENT=248;
	public static final int STORE=249;
	public static final int STORE_TYPE=250;
	public static final int SYSTEM=251;
	public static final int SYSTEM_NAMES=252;
	public static final int Space=253;
	public static final int T=254;
	public static final int TABLE=255;
	public static final int TABLE_DEF=256;
	public static final int TABLE_NAME=257;
	public static final int TARGET_FIELDS=258;
	public static final int TEXT=259;
	public static final int THEN=260;
	public static final int TIME=261;
	public static final int TIMESTAMP=262;
	public static final int TIMESTAMPTZ=263;
	public static final int TIMETZ=264;
	public static final int TINYINT=265;
	public static final int TO=266;
	public static final int TRANSACTION=267;
	public static final int TRUE=268;
	public static final int U=269;
	public static final int UNCOMMITTED=270;
	public static final int UNICODE_ESC=271;
	public static final int UNION=272;
	public static final int UNIQUE=273;
	public static final int UNKNOWN=274;
	public static final int USER=275;
	public static final int USING=276;
	public static final int USING_DESCRIPTOR=277;
	public static final int V=278;
	public static final int VALUES=279;
	public static final int VARBINARY=280;
	public static final int VARBIT=281;
	public static final int VARCHAR=282;
	public static final int VARIABLE=283;
	public static final int VARYING=284;
	public static final int VIEW=285;
	public static final int VIEW_NAME=286;
	public static final int Variable=287;
	public static final int W=288;
	public static final int WHEN=289;
	public static final int WHERE=290;
	public static final int WITH=291;
	public static final int WITHOUT=292;
	public static final int WITH_DEFAULT=293;
	public static final int WORK=294;
	public static final int WRITE=295;
	public static final int White_Space=296;
	public static final int X=297;
	public static final int Y=298;
	public static final int Z=299;
	public static final int ZONE=300;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DBLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DBLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[366+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DBLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "DBL.g"; }


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
	// DBL.g:380:1: data_type : ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type );
	public final DBLParser.data_type_return data_type() throws RecognitionException {
		DBLParser.data_type_return retval = new DBLParser.data_type_return();
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

			// DBL.g:381:3: ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type )
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
					// DBL.g:381:5: boolean_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_type_in_data_type3569);
					boolean_type1=boolean_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_type1.getTree());

					}
					break;
				case 2 :
					// DBL.g:382:5: bit_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bit_type_in_data_type3575);
					bit_type2=bit_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bit_type2.getTree());

					}
					break;
				case 3 :
					// DBL.g:383:5: varbit_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varbit_type_in_data_type3581);
					varbit_type3=varbit_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varbit_type3.getTree());

					}
					break;
				case 4 :
					// DBL.g:384:5: binary_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_binary_type_in_data_type3587);
					binary_type4=binary_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_type4.getTree());

					}
					break;
				case 5 :
					// DBL.g:385:5: varbinary_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varbinary_type_in_data_type3593);
					varbinary_type5=varbinary_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varbinary_type5.getTree());

					}
					break;
				case 6 :
					// DBL.g:386:5: blob_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_blob_type_in_data_type3599);
					blob_type6=blob_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blob_type6.getTree());

					}
					break;
				case 7 :
					// DBL.g:387:5: INET4
					{
					root_0 = (CommonTree)adaptor.nil();


					INET47=(Token)match(input,INET4,FOLLOW_INET4_in_data_type3605); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INET47_tree = (CommonTree)adaptor.create(INET47);
					adaptor.addChild(root_0, INET47_tree);
					}

					}
					break;
				case 8 :
					// DBL.g:388:5: character_string_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_character_string_type_in_data_type3611);
					character_string_type8=character_string_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, character_string_type8.getTree());

					}
					break;
				case 9 :
					// DBL.g:389:5: datetime_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_datetime_type_in_data_type3617);
					datetime_type9=datetime_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_type9.getTree());

					}
					break;
				case 10 :
					// DBL.g:390:5: numeric_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_type_in_data_type3623);
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
	// DBL.g:392:1: character_string_type : ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT );
	public final DBLParser.character_string_type_return character_string_type() throws RecognitionException {
		DBLParser.character_string_type_return retval = new DBLParser.character_string_type_return();
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

			// DBL.g:393:3: ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT )
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
					// DBL.g:393:5: char_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_char_type_in_character_string_type3635);
					char_type11=char_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, char_type11.getTree());

					}
					break;
				case 2 :
					// DBL.g:394:5: varchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varchar_type_in_character_string_type3641);
					varchar_type12=varchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varchar_type12.getTree());

					}
					break;
				case 3 :
					// DBL.g:395:5: nchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nchar_type_in_character_string_type3647);
					nchar_type13=nchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nchar_type13.getTree());

					}
					break;
				case 4 :
					// DBL.g:396:5: nvarchar_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nvarchar_type_in_character_string_type3653);
					nvarchar_type14=nvarchar_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nvarchar_type14.getTree());

					}
					break;
				case 5 :
					// DBL.g:397:5: TEXT
					{
					root_0 = (CommonTree)adaptor.nil();


					TEXT15=(Token)match(input,TEXT,FOLLOW_TEXT_in_character_string_type3659); if (state.failed) return retval;
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
	// DBL.g:399:1: numeric_type : ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type );
	public final DBLParser.numeric_type_return numeric_type() throws RecognitionException {
		DBLParser.numeric_type_return retval = new DBLParser.numeric_type_return();
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

			// DBL.g:400:3: ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type )
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
					// DBL.g:400:5: int1_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int1_type_in_numeric_type3671);
					int1_type16=int1_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int1_type16.getTree());

					}
					break;
				case 2 :
					// DBL.g:401:5: int2_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int2_type_in_numeric_type3677);
					int2_type17=int2_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int2_type17.getTree());

					}
					break;
				case 3 :
					// DBL.g:402:5: int4_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int4_type_in_numeric_type3683);
					int4_type18=int4_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int4_type18.getTree());

					}
					break;
				case 4 :
					// DBL.g:403:5: int8_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_int8_type_in_numeric_type3689);
					int8_type19=int8_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int8_type19.getTree());

					}
					break;
				case 5 :
					// DBL.g:404:5: float4_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float4_type_in_numeric_type3695);
					float4_type20=float4_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float4_type20.getTree());

					}
					break;
				case 6 :
					// DBL.g:405:5: float_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_type_in_numeric_type3701);
					float_type21=float_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float_type21.getTree());

					}
					break;
				case 7 :
					// DBL.g:406:5: float8_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float8_type_in_numeric_type3707);
					float8_type22=float8_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float8_type22.getTree());

					}
					break;
				case 8 :
					// DBL.g:407:5: number_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_number_type_in_numeric_type3713);
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
	// DBL.g:409:1: datetime_type : ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type );
	public final DBLParser.datetime_type_return datetime_type() throws RecognitionException {
		DBLParser.datetime_type_return retval = new DBLParser.datetime_type_return();
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

			// DBL.g:410:3: ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type )
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
					// DBL.g:410:5: DATE
					{
					root_0 = (CommonTree)adaptor.nil();


					DATE24=(Token)match(input,DATE,FOLLOW_DATE_in_datetime_type3725); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DATE24_tree = (CommonTree)adaptor.create(DATE24);
					adaptor.addChild(root_0, DATE24_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:411:5: TIME
					{
					root_0 = (CommonTree)adaptor.nil();


					TIME25=(Token)match(input,TIME,FOLLOW_TIME_in_datetime_type3731); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIME25_tree = (CommonTree)adaptor.create(TIME25);
					adaptor.addChild(root_0, TIME25_tree);
					}

					}
					break;
				case 3 :
					// DBL.g:412:5: timetz_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timetz_type_in_datetime_type3737);
					timetz_type26=timetz_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timetz_type26.getTree());

					}
					break;
				case 4 :
					// DBL.g:413:5: TIMESTAMP
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMESTAMP27=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_datetime_type3743); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMESTAMP27_tree = (CommonTree)adaptor.create(TIMESTAMP27);
					adaptor.addChild(root_0, TIMESTAMP27_tree);
					}

					}
					break;
				case 5 :
					// DBL.g:414:5: timestamptz_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timestamptz_type_in_datetime_type3749);
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
	// DBL.g:416:1: precision_param : ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !);
	public final DBLParser.precision_param_return precision_param() throws RecognitionException {
		DBLParser.precision_param_return retval = new DBLParser.precision_param_return();
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

			// DBL.g:417:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !)
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
					// DBL.g:417:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN29=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_param3761); if (state.failed) return retval;
					NUMBER30=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param3764); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER30_tree = (CommonTree)adaptor.create(NUMBER30);
					adaptor.addChild(root_0, NUMBER30_tree);
					}

					RIGHT_PAREN31=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_param3766); if (state.failed) return retval;
					}
					break;
				case 2 :
					// DBL.g:418:5: LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN32=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_param3773); if (state.failed) return retval;
					NUMBER33=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param3776); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER33_tree = (CommonTree)adaptor.create(NUMBER33);
					adaptor.addChild(root_0, NUMBER33_tree);
					}

					COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_precision_param3778); if (state.failed) return retval;
					NUMBER35=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_precision_param3781); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER35_tree = (CommonTree)adaptor.create(NUMBER35);
					adaptor.addChild(root_0, NUMBER35_tree);
					}

					RIGHT_PAREN36=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_param3783); if (state.failed) return retval;
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
	// DBL.g:420:1: type_length : LEFT_PAREN ! NUMBER RIGHT_PAREN !;
	public final DBLParser.type_length_return type_length() throws RecognitionException {
		DBLParser.type_length_return retval = new DBLParser.type_length_return();
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

			// DBL.g:421:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !)
			// DBL.g:421:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			LEFT_PAREN37=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_type_length3796); if (state.failed) return retval;
			NUMBER38=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_type_length3799); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NUMBER38_tree = (CommonTree)adaptor.create(NUMBER38);
			adaptor.addChild(root_0, NUMBER38_tree);
			}

			RIGHT_PAREN39=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_type_length3801); if (state.failed) return retval;
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
	// DBL.g:423:1: boolean_type : ( BOOLEAN | BOOL -> BOOLEAN );
	public final DBLParser.boolean_type_return boolean_type() throws RecognitionException {
		DBLParser.boolean_type_return retval = new DBLParser.boolean_type_return();
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

			// DBL.g:424:3: ( BOOLEAN | BOOL -> BOOLEAN )
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
					// DBL.g:424:5: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN40=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type3814); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN40_tree = (CommonTree)adaptor.create(BOOLEAN40);
					adaptor.addChild(root_0, BOOLEAN40_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:425:5: BOOL
					{
					BOOL41=(Token)match(input,BOOL,FOLLOW_BOOL_in_boolean_type3820); if (state.failed) return retval; 
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
					// 425:10: -> BOOLEAN
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
	// DBL.g:427:1: bit_type : BIT ( type_length )? -> BIT ;
	public final DBLParser.bit_type_return bit_type() throws RecognitionException {
		DBLParser.bit_type_return retval = new DBLParser.bit_type_return();
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

			// DBL.g:428:3: ( BIT ( type_length )? -> BIT )
			// DBL.g:428:5: BIT ( type_length )?
			{
			BIT42=(Token)match(input,BIT,FOLLOW_BIT_in_bit_type3836); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BIT.add(BIT42);

			// DBL.g:428:9: ( type_length )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LEFT_PAREN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// DBL.g:428:9: type_length
					{
					pushFollow(FOLLOW_type_length_in_bit_type3838);
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
			// 428:22: -> BIT
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
	// DBL.g:430:1: varbit_type : ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT );
	public final DBLParser.varbit_type_return varbit_type() throws RecognitionException {
		DBLParser.varbit_type_return retval = new DBLParser.varbit_type_return();
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

			// DBL.g:431:3: ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT )
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
					// DBL.g:431:5: VARBIT ( type_length )?
					{
					VARBIT44=(Token)match(input,VARBIT,FOLLOW_VARBIT_in_varbit_type3855); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARBIT.add(VARBIT44);

					// DBL.g:431:12: ( type_length )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LEFT_PAREN) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// DBL.g:431:12: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbit_type3857);
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
					// 431:25: -> VARBIT
					{
						adaptor.addChild(root_0, stream_VARBIT.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:432:5: BIT VARYING ( type_length )?
					{
					BIT46=(Token)match(input,BIT,FOLLOW_BIT_in_varbit_type3868); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BIT.add(BIT46);

					VARYING47=(Token)match(input,VARYING,FOLLOW_VARYING_in_varbit_type3870); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING47);

					// DBL.g:432:17: ( type_length )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==LEFT_PAREN) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// DBL.g:432:17: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbit_type3872);
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
					// 432:30: -> VARBIT
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
	// DBL.g:434:1: int1_type : ( INT1 | TINYINT -> INT1 );
	public final DBLParser.int1_type_return int1_type() throws RecognitionException {
		DBLParser.int1_type_return retval = new DBLParser.int1_type_return();
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

			// DBL.g:435:3: ( INT1 | TINYINT -> INT1 )
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
					// DBL.g:435:5: INT1
					{
					root_0 = (CommonTree)adaptor.nil();


					INT149=(Token)match(input,INT1,FOLLOW_INT1_in_int1_type3889); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT149_tree = (CommonTree)adaptor.create(INT149);
					adaptor.addChild(root_0, INT149_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:436:5: TINYINT
					{
					TINYINT50=(Token)match(input,TINYINT,FOLLOW_TINYINT_in_int1_type3895); if (state.failed) return retval; 
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
					// 436:13: -> INT1
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
	// DBL.g:438:1: int2_type : ( INT2 | SMALLINT -> INT2 );
	public final DBLParser.int2_type_return int2_type() throws RecognitionException {
		DBLParser.int2_type_return retval = new DBLParser.int2_type_return();
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

			// DBL.g:439:3: ( INT2 | SMALLINT -> INT2 )
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
					// DBL.g:439:5: INT2
					{
					root_0 = (CommonTree)adaptor.nil();


					INT251=(Token)match(input,INT2,FOLLOW_INT2_in_int2_type3911); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT251_tree = (CommonTree)adaptor.create(INT251);
					adaptor.addChild(root_0, INT251_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:440:5: SMALLINT
					{
					SMALLINT52=(Token)match(input,SMALLINT,FOLLOW_SMALLINT_in_int2_type3917); if (state.failed) return retval; 
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
					// 440:14: -> INT2
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
	// DBL.g:442:1: int4_type : ( INT4 | INT -> INT4 | INTEGER -> INT4 );
	public final DBLParser.int4_type_return int4_type() throws RecognitionException {
		DBLParser.int4_type_return retval = new DBLParser.int4_type_return();
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

			// DBL.g:443:3: ( INT4 | INT -> INT4 | INTEGER -> INT4 )
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
					// DBL.g:443:5: INT4
					{
					root_0 = (CommonTree)adaptor.nil();


					INT453=(Token)match(input,INT4,FOLLOW_INT4_in_int4_type3933); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT453_tree = (CommonTree)adaptor.create(INT453);
					adaptor.addChild(root_0, INT453_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:444:5: INT
					{
					INT54=(Token)match(input,INT,FOLLOW_INT_in_int4_type3939); if (state.failed) return retval; 
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
					// 444:9: -> INT4
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT4, "INT4"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DBL.g:445:5: INTEGER
					{
					INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_int4_type3949); if (state.failed) return retval; 
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
					// 445:13: -> INT4
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
	// DBL.g:447:1: int8_type : ( INT8 | BIGINT -> INT8 );
	public final DBLParser.int8_type_return int8_type() throws RecognitionException {
		DBLParser.int8_type_return retval = new DBLParser.int8_type_return();
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

			// DBL.g:448:3: ( INT8 | BIGINT -> INT8 )
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
					// DBL.g:448:5: INT8
					{
					root_0 = (CommonTree)adaptor.nil();


					INT856=(Token)match(input,INT8,FOLLOW_INT8_in_int8_type3965); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT856_tree = (CommonTree)adaptor.create(INT856);
					adaptor.addChild(root_0, INT856_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:449:5: BIGINT
					{
					BIGINT57=(Token)match(input,BIGINT,FOLLOW_BIGINT_in_int8_type3971); if (state.failed) return retval; 
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
					// 449:12: -> INT8
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
	// DBL.g:451:1: float4_type : ( FLOAT4 | REAL -> FLOAT4 );
	public final DBLParser.float4_type_return float4_type() throws RecognitionException {
		DBLParser.float4_type_return retval = new DBLParser.float4_type_return();
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

			// DBL.g:452:3: ( FLOAT4 | REAL -> FLOAT4 )
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
					// DBL.g:452:5: FLOAT4
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT458=(Token)match(input,FLOAT4,FOLLOW_FLOAT4_in_float4_type3987); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT458_tree = (CommonTree)adaptor.create(FLOAT458);
					adaptor.addChild(root_0, FLOAT458_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:453:5: REAL
					{
					REAL59=(Token)match(input,REAL,FOLLOW_REAL_in_float4_type3993); if (state.failed) return retval; 
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
					// 453:10: -> FLOAT4
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
	// DBL.g:455:1: float_type : FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) ;
	public final DBLParser.float_type_return float_type() throws RecognitionException {
		DBLParser.float_type_return retval = new DBLParser.float_type_return();
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

			// DBL.g:455:12: ( FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) )
			// DBL.g:455:14: FLOAT ( type_length )?
			{
			FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_float_type4007); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT60);

			// DBL.g:455:20: ( type_length )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LEFT_PAREN) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// DBL.g:455:20: type_length
					{
					pushFollow(FOLLOW_type_length_in_float_type4009);
					type_length61=type_length();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_length.add(type_length61.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: type_length, FLOAT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 455:33: -> ^( FLOAT ( type_length )? )
			{
				// DBL.g:455:36: ^( FLOAT ( type_length )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_FLOAT.nextNode(), root_1);
				// DBL.g:455:44: ( type_length )?
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
	// DBL.g:456:1: float8_type : ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 );
	public final DBLParser.float8_type_return float8_type() throws RecognitionException {
		DBLParser.float8_type_return retval = new DBLParser.float8_type_return();
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

			// DBL.g:457:3: ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 )
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
					// DBL.g:457:5: FLOAT8
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT862=(Token)match(input,FLOAT8,FOLLOW_FLOAT8_in_float8_type4028); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT862_tree = (CommonTree)adaptor.create(FLOAT862);
					adaptor.addChild(root_0, FLOAT862_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:458:5: DOUBLE
					{
					DOUBLE63=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_float8_type4034); if (state.failed) return retval; 
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
					// 458:12: -> FLOAT8
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT8, "FLOAT8"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DBL.g:459:5: DOUBLE PRECISION
					{
					DOUBLE64=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_float8_type4044); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE.add(DOUBLE64);

					PRECISION65=(Token)match(input,PRECISION,FOLLOW_PRECISION_in_float8_type4046); if (state.failed) return retval; 
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
					// 459:22: -> FLOAT8
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
	// DBL.g:461:1: number_type : ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) );
	public final DBLParser.number_type_return number_type() throws RecognitionException {
		DBLParser.number_type_return retval = new DBLParser.number_type_return();
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

			// DBL.g:462:3: ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) )
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
					// DBL.g:462:5: NUMERIC ( precision_param )?
					{
					NUMERIC66=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_number_type4062); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMERIC.add(NUMERIC66);

					// DBL.g:462:13: ( precision_param )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==LEFT_PAREN) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// DBL.g:462:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type4065);
							precision_param67=precision_param();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_precision_param.add(precision_param67.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: NUMERIC, precision_param
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 462:32: -> ^( NUMERIC precision_param )
					{
						// DBL.g:462:35: ^( NUMERIC precision_param )
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
					// DBL.g:463:5: DECIMAL ( precision_param )?
					{
					DECIMAL68=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_number_type4081); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DECIMAL.add(DECIMAL68);

					// DBL.g:463:13: ( precision_param )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LEFT_PAREN) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// DBL.g:463:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type4084);
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
					// 463:32: -> ^( NUMERIC precision_param )
					{
						// DBL.g:463:35: ^( NUMERIC precision_param )
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
					// DBL.g:464:5: DEC ( precision_param )?
					{
					DEC70=(Token)match(input,DEC,FOLLOW_DEC_in_number_type4102); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEC.add(DEC70);

					// DBL.g:464:13: ( precision_param )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LEFT_PAREN) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// DBL.g:464:14: precision_param
							{
							pushFollow(FOLLOW_precision_param_in_number_type4109);
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
					// 464:32: -> ^( NUMERIC precision_param )
					{
						// DBL.g:464:35: ^( NUMERIC precision_param )
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
	// DBL.g:466:1: char_type : ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR );
	public final DBLParser.char_type_return char_type() throws RecognitionException {
		DBLParser.char_type_return retval = new DBLParser.char_type_return();
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

			// DBL.g:467:3: ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR )
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
					// DBL.g:467:5: CHAR ( type_length )?
					{
					CHAR72=(Token)match(input,CHAR,FOLLOW_CHAR_in_char_type4133); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHAR.add(CHAR72);

					// DBL.g:467:10: ( type_length )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==LEFT_PAREN) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// DBL.g:467:10: type_length
							{
							pushFollow(FOLLOW_type_length_in_char_type4135);
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
					// 467:23: -> CHAR
					{
						adaptor.addChild(root_0, stream_CHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:468:5: CHARACTER ( type_length )?
					{
					CHARACTER74=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_char_type4146); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER74);

					// DBL.g:468:15: ( type_length )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LEFT_PAREN) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// DBL.g:468:15: type_length
							{
							pushFollow(FOLLOW_type_length_in_char_type4148);
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
					// 468:28: -> CHAR
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
	// DBL.g:470:1: varchar_type : ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR );
	public final DBLParser.varchar_type_return varchar_type() throws RecognitionException {
		DBLParser.varchar_type_return retval = new DBLParser.varchar_type_return();
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

			// DBL.g:471:3: ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR )
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
					// DBL.g:471:5: VARCHAR ( type_length )?
					{
					VARCHAR76=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_varchar_type4165); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARCHAR.add(VARCHAR76);

					// DBL.g:471:13: ( type_length )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==LEFT_PAREN) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// DBL.g:471:13: type_length
							{
							pushFollow(FOLLOW_type_length_in_varchar_type4167);
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
					// 471:26: -> VARCHAR
					{
						adaptor.addChild(root_0, stream_VARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:472:5: CHARACTER VARYING ( type_length )?
					{
					CHARACTER78=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_varchar_type4178); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER78);

					VARYING79=(Token)match(input,VARYING,FOLLOW_VARYING_in_varchar_type4180); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING79);

					// DBL.g:472:23: ( type_length )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==LEFT_PAREN) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// DBL.g:472:23: type_length
							{
							pushFollow(FOLLOW_type_length_in_varchar_type4182);
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
					// 472:36: -> VARCHAR
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
	// DBL.g:474:1: nchar_type : ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR );
	public final DBLParser.nchar_type_return nchar_type() throws RecognitionException {
		DBLParser.nchar_type_return retval = new DBLParser.nchar_type_return();
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

			// DBL.g:475:3: ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR )
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
					// DBL.g:475:5: NCHAR ( type_length )?
					{
					NCHAR81=(Token)match(input,NCHAR,FOLLOW_NCHAR_in_nchar_type4199); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCHAR.add(NCHAR81);

					// DBL.g:475:11: ( type_length )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LEFT_PAREN) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// DBL.g:475:11: type_length
							{
							pushFollow(FOLLOW_type_length_in_nchar_type4201);
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
					// 475:24: -> NCHAR
					{
						adaptor.addChild(root_0, stream_NCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:476:5: NATIONAL CHARACTER ( type_length )?
					{
					NATIONAL83=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nchar_type4212); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL83);

					CHARACTER84=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nchar_type4214); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER84);

					// DBL.g:476:24: ( type_length )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==LEFT_PAREN) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// DBL.g:476:24: type_length
							{
							pushFollow(FOLLOW_type_length_in_nchar_type4216);
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
					// 476:37: -> NCHAR
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
	// DBL.g:478:1: nvarchar_type : ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR );
	public final DBLParser.nvarchar_type_return nvarchar_type() throws RecognitionException {
		DBLParser.nvarchar_type_return retval = new DBLParser.nvarchar_type_return();
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

			// DBL.g:479:3: ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR )
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
					// DBL.g:479:5: NVARCHAR ( type_length )?
					{
					NVARCHAR86=(Token)match(input,NVARCHAR,FOLLOW_NVARCHAR_in_nvarchar_type4233); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NVARCHAR.add(NVARCHAR86);

					// DBL.g:479:14: ( type_length )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==LEFT_PAREN) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// DBL.g:479:14: type_length
							{
							pushFollow(FOLLOW_type_length_in_nvarchar_type4235);
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
					// 479:27: -> NVARCHAR
					{
						adaptor.addChild(root_0, stream_NVARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:480:5: NATIONAL CHARACTER VARYING ( type_length )?
					{
					NATIONAL88=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nvarchar_type4246); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL88);

					CHARACTER89=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nvarchar_type4248); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER89);

					VARYING90=(Token)match(input,VARYING,FOLLOW_VARYING_in_nvarchar_type4250); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING90);

					// DBL.g:480:32: ( type_length )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==LEFT_PAREN) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// DBL.g:480:32: type_length
							{
							pushFollow(FOLLOW_type_length_in_nvarchar_type4252);
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
					// 480:45: -> NVARCHAR
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
	// DBL.g:482:1: timetz_type : ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ );
	public final DBLParser.timetz_type_return timetz_type() throws RecognitionException {
		DBLParser.timetz_type_return retval = new DBLParser.timetz_type_return();
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

			// DBL.g:483:3: ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ )
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
					// DBL.g:483:5: TIMETZ
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMETZ92=(Token)match(input,TIMETZ,FOLLOW_TIMETZ_in_timetz_type4269); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMETZ92_tree = (CommonTree)adaptor.create(TIMETZ92);
					adaptor.addChild(root_0, TIMETZ92_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:484:5: TIME WITH TIME ZONE
					{
					TIME93=(Token)match(input,TIME,FOLLOW_TIME_in_timetz_type4275); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME93);

					WITH94=(Token)match(input,WITH,FOLLOW_WITH_in_timetz_type4277); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH94);

					TIME95=(Token)match(input,TIME,FOLLOW_TIME_in_timetz_type4279); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME95);

					ZONE96=(Token)match(input,ZONE,FOLLOW_ZONE_in_timetz_type4281); if (state.failed) return retval; 
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
					// 484:25: -> TIMETZ
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
	// DBL.g:486:1: timestamptz_type : ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ );
	public final DBLParser.timestamptz_type_return timestamptz_type() throws RecognitionException {
		DBLParser.timestamptz_type_return retval = new DBLParser.timestamptz_type_return();
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

			// DBL.g:487:3: ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ )
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
					// DBL.g:487:5: TIMESTAMPTZ
					{
					root_0 = (CommonTree)adaptor.nil();


					TIMESTAMPTZ97=(Token)match(input,TIMESTAMPTZ,FOLLOW_TIMESTAMPTZ_in_timestamptz_type4297); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMESTAMPTZ97_tree = (CommonTree)adaptor.create(TIMESTAMPTZ97);
					adaptor.addChild(root_0, TIMESTAMPTZ97_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:488:5: TIMESTAMP WITH TIME ZONE
					{
					TIMESTAMP98=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamptz_type4303); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMESTAMP.add(TIMESTAMP98);

					WITH99=(Token)match(input,WITH,FOLLOW_WITH_in_timestamptz_type4305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH99);

					TIME100=(Token)match(input,TIME,FOLLOW_TIME_in_timestamptz_type4307); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIME.add(TIME100);

					ZONE101=(Token)match(input,ZONE,FOLLOW_ZONE_in_timestamptz_type4309); if (state.failed) return retval; 
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
					// 488:30: -> TIMESTAMPTZ
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
	// DBL.g:490:1: binary_type : BINARY ( type_length )? ;
	public final DBLParser.binary_type_return binary_type() throws RecognitionException {
		DBLParser.binary_type_return retval = new DBLParser.binary_type_return();
		retval.start = input.LT(1);
		int binary_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BINARY102=null;
		ParserRuleReturnScope type_length103 =null;

		CommonTree BINARY102_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// DBL.g:491:3: ( BINARY ( type_length )? )
			// DBL.g:491:5: BINARY ( type_length )?
			{
			root_0 = (CommonTree)adaptor.nil();


			BINARY102=(Token)match(input,BINARY,FOLLOW_BINARY_in_binary_type4325); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BINARY102_tree = (CommonTree)adaptor.create(BINARY102);
			adaptor.addChild(root_0, BINARY102_tree);
			}

			// DBL.g:491:12: ( type_length )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==LEFT_PAREN) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// DBL.g:491:12: type_length
					{
					pushFollow(FOLLOW_type_length_in_binary_type4327);
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
	// DBL.g:493:1: varbinary_type : ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? );
	public final DBLParser.varbinary_type_return varbinary_type() throws RecognitionException {
		DBLParser.varbinary_type_return retval = new DBLParser.varbinary_type_return();
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

			// DBL.g:494:3: ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? )
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
					// DBL.g:494:5: VARBINARY ( type_length )?
					{
					root_0 = (CommonTree)adaptor.nil();


					VARBINARY104=(Token)match(input,VARBINARY,FOLLOW_VARBINARY_in_varbinary_type4340); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARBINARY104_tree = (CommonTree)adaptor.create(VARBINARY104);
					adaptor.addChild(root_0, VARBINARY104_tree);
					}

					// DBL.g:494:15: ( type_length )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==LEFT_PAREN) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// DBL.g:494:15: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbinary_type4342);
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
					// DBL.g:495:5: BINARY VARYING ( type_length )?
					{
					root_0 = (CommonTree)adaptor.nil();


					BINARY106=(Token)match(input,BINARY,FOLLOW_BINARY_in_varbinary_type4349); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BINARY106_tree = (CommonTree)adaptor.create(BINARY106);
					adaptor.addChild(root_0, BINARY106_tree);
					}

					VARYING107=(Token)match(input,VARYING,FOLLOW_VARYING_in_varbinary_type4351); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARYING107_tree = (CommonTree)adaptor.create(VARYING107);
					adaptor.addChild(root_0, VARYING107_tree);
					}

					// DBL.g:495:20: ( type_length )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==LEFT_PAREN) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// DBL.g:495:20: type_length
							{
							pushFollow(FOLLOW_type_length_in_varbinary_type4353);
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
	// DBL.g:497:1: blob_type : ( BLOB | BYTEA -> BLOB );
	public final DBLParser.blob_type_return blob_type() throws RecognitionException {
		DBLParser.blob_type_return retval = new DBLParser.blob_type_return();
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

			// DBL.g:498:3: ( BLOB | BYTEA -> BLOB )
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
					// DBL.g:498:5: BLOB
					{
					root_0 = (CommonTree)adaptor.nil();


					BLOB109=(Token)match(input,BLOB,FOLLOW_BLOB_in_blob_type4366); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BLOB109_tree = (CommonTree)adaptor.create(BLOB109);
					adaptor.addChild(root_0, BLOB109_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:499:5: BYTEA
					{
					BYTEA110=(Token)match(input,BYTEA,FOLLOW_BYTEA_in_blob_type4372); if (state.failed) return retval; 
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
					// 499:11: -> BLOB
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
	// DBL.g:506:1: sql : statement EOF ;
	public final DBLParser.sql_return sql() throws RecognitionException {
		DBLParser.sql_return retval = new DBLParser.sql_return();
		retval.start = input.LT(1);
		int sql_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EOF112=null;
		ParserRuleReturnScope statement111 =null;

		CommonTree EOF112_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// DBL.g:507:3: ( statement EOF )
			// DBL.g:507:5: statement EOF
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_statement_in_sql4390);
			statement111=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement111.getTree());

			EOF112=(Token)match(input,EOF,FOLLOW_EOF_in_sql4392); if (state.failed) return retval;
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
	// DBL.g:510:1: statement : ( set_transaction_statement | execute_statement | execute_immediate_statement | open_statement | prepare_statement | declare_cursor_statement | describe_statement | fetch_statement | open_statement | close_statement );
	public final DBLParser.statement_return statement() throws RecognitionException {
		DBLParser.statement_return retval = new DBLParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope set_transaction_statement113 =null;
		ParserRuleReturnScope execute_statement114 =null;
		ParserRuleReturnScope execute_immediate_statement115 =null;
		ParserRuleReturnScope open_statement116 =null;
		ParserRuleReturnScope prepare_statement117 =null;
		ParserRuleReturnScope declare_cursor_statement118 =null;
		ParserRuleReturnScope describe_statement119 =null;
		ParserRuleReturnScope fetch_statement120 =null;
		ParserRuleReturnScope open_statement121 =null;
		ParserRuleReturnScope close_statement122 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// DBL.g:511:3: ( set_transaction_statement | execute_statement | execute_immediate_statement | open_statement | prepare_statement | declare_cursor_statement | describe_statement | fetch_statement | open_statement | close_statement )
			int alt41=10;
			switch ( input.LA(1) ) {
			case SET:
				{
				alt41=1;
				}
				break;
			case EXECUTE:
				{
				int LA41_2 = input.LA(2);
				if ( (LA41_2==Identifier) ) {
					alt41=2;
				}
				else if ( (LA41_2==IMMEDIATE) ) {
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
			case OPEN:
				{
				int LA41_3 = input.LA(2);
				if ( (LA41_3==Identifier) ) {
					int LA41_11 = input.LA(3);
					if ( (synpred67_DBL()) ) {
						alt41=4;
					}
					else if ( (synpred72_DBL()) ) {
						alt41=9;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 11, input);
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
							new NoViableAltException("", 41, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PREPARE:
				{
				alt41=5;
				}
				break;
			case DECLARE:
				{
				alt41=6;
				}
				break;
			case DESCRIBE:
				{
				alt41=7;
				}
				break;
			case FETCH:
				{
				alt41=8;
				}
				break;
			case CLOSE:
				{
				alt41=10;
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
					// DBL.g:512:3: set_transaction_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_transaction_statement_in_statement4410);
					set_transaction_statement113=set_transaction_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_transaction_statement113.getTree());

					}
					break;
				case 2 :
					// DBL.g:514:3: execute_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_execute_statement_in_statement4418);
					execute_statement114=execute_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, execute_statement114.getTree());

					}
					break;
				case 3 :
					// DBL.g:516:3: execute_immediate_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_execute_immediate_statement_in_statement4426);
					execute_immediate_statement115=execute_immediate_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, execute_immediate_statement115.getTree());

					}
					break;
				case 4 :
					// DBL.g:518:3: open_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_open_statement_in_statement4434);
					open_statement116=open_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, open_statement116.getTree());

					}
					break;
				case 5 :
					// DBL.g:520:3: prepare_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_prepare_statement_in_statement4442);
					prepare_statement117=prepare_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prepare_statement117.getTree());

					}
					break;
				case 6 :
					// DBL.g:522:3: declare_cursor_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_declare_cursor_statement_in_statement4450);
					declare_cursor_statement118=declare_cursor_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declare_cursor_statement118.getTree());

					}
					break;
				case 7 :
					// DBL.g:524:3: describe_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_describe_statement_in_statement4458);
					describe_statement119=describe_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, describe_statement119.getTree());

					}
					break;
				case 8 :
					// DBL.g:526:3: fetch_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fetch_statement_in_statement4466);
					fetch_statement120=fetch_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fetch_statement120.getTree());

					}
					break;
				case 9 :
					// DBL.g:528:3: open_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_open_statement_in_statement4474);
					open_statement121=open_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, open_statement121.getTree());

					}
					break;
				case 10 :
					// DBL.g:530:3: close_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_close_statement_in_statement4482);
					close_statement122=close_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, close_statement122.getTree());

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


	public static class set_transaction_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_transaction_statement"
	// DBL.g:534:2: set_transaction_statement : SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) ;
	public final DBLParser.set_transaction_statement_return set_transaction_statement() throws RecognitionException {
		DBLParser.set_transaction_statement_return retval = new DBLParser.set_transaction_statement_return();
		retval.start = input.LT(1);
		int set_transaction_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SET123=null;
		Token TRANSACTION124=null;
		Token ISOLATION125=null;
		Token LEVEL126=null;
		Token COMMA127=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope r =null;

		CommonTree SET123_tree=null;
		CommonTree TRANSACTION124_tree=null;
		CommonTree ISOLATION125_tree=null;
		CommonTree LEVEL126_tree=null;
		CommonTree COMMA127_tree=null;
		RewriteRuleTokenStream stream_ISOLATION=new RewriteRuleTokenStream(adaptor,"token ISOLATION");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_LEVEL=new RewriteRuleTokenStream(adaptor,"token LEVEL");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_TRANSACTION=new RewriteRuleTokenStream(adaptor,"token TRANSACTION");
		RewriteRuleSubtreeStream stream_isolation_level=new RewriteRuleSubtreeStream(adaptor,"rule isolation_level");
		RewriteRuleSubtreeStream stream_read_operation=new RewriteRuleSubtreeStream(adaptor,"rule read_operation");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// DBL.g:535:2: ( SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) )
			// DBL.g:536:2: SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )?
			{
			SET123=(Token)match(input,SET,FOLLOW_SET_in_set_transaction_statement4504); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SET.add(SET123);

			TRANSACTION124=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_set_transaction_statement4506); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TRANSACTION.add(TRANSACTION124);

			ISOLATION125=(Token)match(input,ISOLATION,FOLLOW_ISOLATION_in_set_transaction_statement4508); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ISOLATION.add(ISOLATION125);

			LEVEL126=(Token)match(input,LEVEL,FOLLOW_LEVEL_in_set_transaction_statement4510); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEVEL.add(LEVEL126);

			pushFollow(FOLLOW_isolation_level_in_set_transaction_statement4514);
			i=isolation_level();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_isolation_level.add(i.getTree());
			// DBL.g:536:52: ( COMMA r= read_operation )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==COMMA) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// DBL.g:536:53: COMMA r= read_operation
					{
					COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_set_transaction_statement4517); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA127);

					pushFollow(FOLLOW_read_operation_in_set_transaction_statement4521);
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
			// 536:78: -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
			{
				// DBL.g:538:2: ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_TRANSACTION_STATEMENT, "SET_TRANSACTION_STATEMENT"), root_1);
				// DBL.g:538:30: ^( ISOLATION_LEVEL $i)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ISOLATION_LEVEL, "ISOLATION_LEVEL"), root_2);
				adaptor.addChild(root_2, stream_i.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:538:52: ( ^( RW_OPERATION $r) )?
				if ( stream_r.hasNext() ) {
					// DBL.g:538:53: ^( RW_OPERATION $r)
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
			if ( state.backtracking>0 ) { memoize(input, 29, set_transaction_statement_StartIndex); }

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
	// DBL.g:541:1: isolation_level : ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read );
	public final DBLParser.isolation_level_return isolation_level() throws RecognitionException {
		DBLParser.isolation_level_return retval = new DBLParser.isolation_level_return();
		retval.start = input.LT(1);
		int isolation_level_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SERIALIZABLE128=null;
		ParserRuleReturnScope no_commit129 =null;
		ParserRuleReturnScope read_uncommitted130 =null;
		ParserRuleReturnScope read_committed131 =null;
		ParserRuleReturnScope repeatable_read132 =null;

		CommonTree SERIALIZABLE128_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// DBL.g:542:2: ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read )
			int alt43=5;
			switch ( input.LA(1) ) {
			case SERIALIZABLE:
				{
				alt43=1;
				}
				break;
			case NO:
				{
				alt43=2;
				}
				break;
			case READ:
				{
				int LA43_3 = input.LA(2);
				if ( (LA43_3==UNCOMMITTED) ) {
					alt43=3;
				}
				else if ( (LA43_3==COMMITTED) ) {
					alt43=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case REPEATABLE:
				{
				alt43=5;
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
					// DBL.g:543:2: SERIALIZABLE
					{
					root_0 = (CommonTree)adaptor.nil();


					SERIALIZABLE128=(Token)match(input,SERIALIZABLE,FOLLOW_SERIALIZABLE_in_isolation_level4562); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SERIALIZABLE128_tree = (CommonTree)adaptor.create(SERIALIZABLE128);
					adaptor.addChild(root_0, SERIALIZABLE128_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:545:2: no_commit
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_no_commit_in_isolation_level4568);
					no_commit129=no_commit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, no_commit129.getTree());

					}
					break;
				case 3 :
					// DBL.g:547:2: read_uncommitted
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_uncommitted_in_isolation_level4574);
					read_uncommitted130=read_uncommitted();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_uncommitted130.getTree());

					}
					break;
				case 4 :
					// DBL.g:549:2: read_committed
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_committed_in_isolation_level4580);
					read_committed131=read_committed();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_committed131.getTree());

					}
					break;
				case 5 :
					// DBL.g:551:2: repeatable_read
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_repeatable_read_in_isolation_level4586);
					repeatable_read132=repeatable_read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatable_read132.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 30, isolation_level_StartIndex); }

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
	// DBL.g:554:1: no_commit : NO COMMIT -> ^( NO_COMMIT ) ;
	public final DBLParser.no_commit_return no_commit() throws RecognitionException {
		DBLParser.no_commit_return retval = new DBLParser.no_commit_return();
		retval.start = input.LT(1);
		int no_commit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NO133=null;
		Token COMMIT134=null;

		CommonTree NO133_tree=null;
		CommonTree COMMIT134_tree=null;
		RewriteRuleTokenStream stream_COMMIT=new RewriteRuleTokenStream(adaptor,"token COMMIT");
		RewriteRuleTokenStream stream_NO=new RewriteRuleTokenStream(adaptor,"token NO");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// DBL.g:555:2: ( NO COMMIT -> ^( NO_COMMIT ) )
			// DBL.g:556:2: NO COMMIT
			{
			NO133=(Token)match(input,NO,FOLLOW_NO_in_no_commit4600); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NO.add(NO133);

			COMMIT134=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_no_commit4602); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMIT.add(COMMIT134);

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
			// 556:12: -> ^( NO_COMMIT )
			{
				// DBL.g:556:15: ^( NO_COMMIT )
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
			if ( state.backtracking>0 ) { memoize(input, 31, no_commit_StartIndex); }

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
	// DBL.g:559:1: read_uncommitted : READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) ;
	public final DBLParser.read_uncommitted_return read_uncommitted() throws RecognitionException {
		DBLParser.read_uncommitted_return retval = new DBLParser.read_uncommitted_return();
		retval.start = input.LT(1);
		int read_uncommitted_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ135=null;
		Token UNCOMMITTED136=null;

		CommonTree READ135_tree=null;
		CommonTree UNCOMMITTED136_tree=null;
		RewriteRuleTokenStream stream_UNCOMMITTED=new RewriteRuleTokenStream(adaptor,"token UNCOMMITTED");
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// DBL.g:560:2: ( READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) )
			// DBL.g:561:2: READ UNCOMMITTED
			{
			READ135=(Token)match(input,READ,FOLLOW_READ_in_read_uncommitted4625); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ135);

			UNCOMMITTED136=(Token)match(input,UNCOMMITTED,FOLLOW_UNCOMMITTED_in_read_uncommitted4627); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNCOMMITTED.add(UNCOMMITTED136);

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
			// 561:19: -> ^( READ_UNCOMMITTED )
			{
				// DBL.g:561:22: ^( READ_UNCOMMITTED )
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
			if ( state.backtracking>0 ) { memoize(input, 32, read_uncommitted_StartIndex); }

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
	// DBL.g:564:1: read_committed : READ COMMITTED -> ^( READ_COMMITTED ) ;
	public final DBLParser.read_committed_return read_committed() throws RecognitionException {
		DBLParser.read_committed_return retval = new DBLParser.read_committed_return();
		retval.start = input.LT(1);
		int read_committed_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ137=null;
		Token COMMITTED138=null;

		CommonTree READ137_tree=null;
		CommonTree COMMITTED138_tree=null;
		RewriteRuleTokenStream stream_COMMITTED=new RewriteRuleTokenStream(adaptor,"token COMMITTED");
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// DBL.g:565:2: ( READ COMMITTED -> ^( READ_COMMITTED ) )
			// DBL.g:566:2: READ COMMITTED
			{
			READ137=(Token)match(input,READ,FOLLOW_READ_in_read_committed4646); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ137);

			COMMITTED138=(Token)match(input,COMMITTED,FOLLOW_COMMITTED_in_read_committed4648); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMITTED.add(COMMITTED138);

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
			// 566:17: -> ^( READ_COMMITTED )
			{
				// DBL.g:566:20: ^( READ_COMMITTED )
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
			if ( state.backtracking>0 ) { memoize(input, 33, read_committed_StartIndex); }

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
	// DBL.g:569:1: repeatable_read : REPEATABLE READ -> ^( REPEATABLE_READ ) ;
	public final DBLParser.repeatable_read_return repeatable_read() throws RecognitionException {
		DBLParser.repeatable_read_return retval = new DBLParser.repeatable_read_return();
		retval.start = input.LT(1);
		int repeatable_read_StartIndex = input.index();

		CommonTree root_0 = null;

		Token REPEATABLE139=null;
		Token READ140=null;

		CommonTree REPEATABLE139_tree=null;
		CommonTree READ140_tree=null;
		RewriteRuleTokenStream stream_REPEATABLE=new RewriteRuleTokenStream(adaptor,"token REPEATABLE");
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// DBL.g:570:2: ( REPEATABLE READ -> ^( REPEATABLE_READ ) )
			// DBL.g:571:2: REPEATABLE READ
			{
			REPEATABLE139=(Token)match(input,REPEATABLE,FOLLOW_REPEATABLE_in_repeatable_read4669); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REPEATABLE.add(REPEATABLE139);

			READ140=(Token)match(input,READ,FOLLOW_READ_in_repeatable_read4671); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ140);

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
			// 571:18: -> ^( REPEATABLE_READ )
			{
				// DBL.g:571:21: ^( REPEATABLE_READ )
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
			if ( state.backtracking>0 ) { memoize(input, 34, repeatable_read_StartIndex); }

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
	// DBL.g:574:1: read_operation : ( read_only | read_write );
	public final DBLParser.read_operation_return read_operation() throws RecognitionException {
		DBLParser.read_operation_return retval = new DBLParser.read_operation_return();
		retval.start = input.LT(1);
		int read_operation_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope read_only141 =null;
		ParserRuleReturnScope read_write142 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// DBL.g:575:2: ( read_only | read_write )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==READ) ) {
				int LA44_1 = input.LA(2);
				if ( (LA44_1==ONLY) ) {
					alt44=1;
				}
				else if ( (LA44_1==WRITE) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// DBL.g:576:2: read_only
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_only_in_read_operation4690);
					read_only141=read_only();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_only141.getTree());

					}
					break;
				case 2 :
					// DBL.g:578:2: read_write
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_read_write_in_read_operation4696);
					read_write142=read_write();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read_write142.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 35, read_operation_StartIndex); }

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
	// DBL.g:581:1: read_only : READ ONLY -> ^( READ_ONLY ) ;
	public final DBLParser.read_only_return read_only() throws RecognitionException {
		DBLParser.read_only_return retval = new DBLParser.read_only_return();
		retval.start = input.LT(1);
		int read_only_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ143=null;
		Token ONLY144=null;

		CommonTree READ143_tree=null;
		CommonTree ONLY144_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_ONLY=new RewriteRuleTokenStream(adaptor,"token ONLY");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// DBL.g:582:2: ( READ ONLY -> ^( READ_ONLY ) )
			// DBL.g:583:2: READ ONLY
			{
			READ143=(Token)match(input,READ,FOLLOW_READ_in_read_only4709); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ143);

			ONLY144=(Token)match(input,ONLY,FOLLOW_ONLY_in_read_only4711); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ONLY.add(ONLY144);

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
			// 583:12: -> ^( READ_ONLY )
			{
				// DBL.g:583:15: ^( READ_ONLY )
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
			if ( state.backtracking>0 ) { memoize(input, 36, read_only_StartIndex); }

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
	// DBL.g:586:1: read_write : READ WRITE -> ^( READ_WRITE ) ;
	public final DBLParser.read_write_return read_write() throws RecognitionException {
		DBLParser.read_write_return retval = new DBLParser.read_write_return();
		retval.start = input.LT(1);
		int read_write_StartIndex = input.index();

		CommonTree root_0 = null;

		Token READ145=null;
		Token WRITE146=null;

		CommonTree READ145_tree=null;
		CommonTree WRITE146_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// DBL.g:587:2: ( READ WRITE -> ^( READ_WRITE ) )
			// DBL.g:588:2: READ WRITE
			{
			READ145=(Token)match(input,READ,FOLLOW_READ_in_read_write4731); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_READ.add(READ145);

			WRITE146=(Token)match(input,WRITE,FOLLOW_WRITE_in_read_write4733); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WRITE.add(WRITE146);

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
			// 588:13: -> ^( READ_WRITE )
			{
				// DBL.g:588:16: ^( READ_WRITE )
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
			if ( state.backtracking>0 ) { memoize(input, 37, read_write_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "read_write"


	public static class execute_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "execute_statement"
	// DBL.g:594:2: execute_statement : EXECUTE s= Identifier -> ^( EXECUTE_STATEMENT ^( STATEMENT $s) ) ;
	public final DBLParser.execute_statement_return execute_statement() throws RecognitionException {
		DBLParser.execute_statement_return retval = new DBLParser.execute_statement_return();
		retval.start = input.LT(1);
		int execute_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token EXECUTE147=null;

		CommonTree s_tree=null;
		CommonTree EXECUTE147_tree=null;
		RewriteRuleTokenStream stream_EXECUTE=new RewriteRuleTokenStream(adaptor,"token EXECUTE");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// DBL.g:595:3: ( EXECUTE s= Identifier -> ^( EXECUTE_STATEMENT ^( STATEMENT $s) ) )
			// DBL.g:596:3: EXECUTE s= Identifier
			{
			EXECUTE147=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_statement4764); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXECUTE.add(EXECUTE147);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_execute_statement4768); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// AST REWRITE
			// elements: s
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 596:24: -> ^( EXECUTE_STATEMENT ^( STATEMENT $s) )
			{
				// DBL.g:596:27: ^( EXECUTE_STATEMENT ^( STATEMENT $s) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE_STATEMENT, "EXECUTE_STATEMENT"), root_1);
				// DBL.g:596:47: ^( STATEMENT $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENT, "STATEMENT"), root_2);
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
			if ( state.backtracking>0 ) { memoize(input, 38, execute_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "execute_statement"


	public static class execute_immediate_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "execute_immediate_statement"
	// DBL.g:599:1: execute_immediate_statement : EXECUTE IMMEDIATE v= Variable -> ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) ) ;
	public final DBLParser.execute_immediate_statement_return execute_immediate_statement() throws RecognitionException {
		DBLParser.execute_immediate_statement_return retval = new DBLParser.execute_immediate_statement_return();
		retval.start = input.LT(1);
		int execute_immediate_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token v=null;
		Token EXECUTE148=null;
		Token IMMEDIATE149=null;

		CommonTree v_tree=null;
		CommonTree EXECUTE148_tree=null;
		CommonTree IMMEDIATE149_tree=null;
		RewriteRuleTokenStream stream_IMMEDIATE=new RewriteRuleTokenStream(adaptor,"token IMMEDIATE");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_EXECUTE=new RewriteRuleTokenStream(adaptor,"token EXECUTE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// DBL.g:600:3: ( EXECUTE IMMEDIATE v= Variable -> ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) ) )
			// DBL.g:601:3: EXECUTE IMMEDIATE v= Variable
			{
			EXECUTE148=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute_immediate_statement4807); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXECUTE.add(EXECUTE148);

			IMMEDIATE149=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_execute_immediate_statement4809); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IMMEDIATE.add(IMMEDIATE149);

			v=(Token)match(input,Variable,FOLLOW_Variable_in_execute_immediate_statement4813); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(v);

			// AST REWRITE
			// elements: v
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 601:32: -> ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) )
			{
				// DBL.g:601:35: ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE_IMMEDIATE_STATEMENT, "EXECUTE_IMMEDIATE_STATEMENT"), root_1);
				// DBL.g:601:65: ^( VARIABLE $v)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_2);
				adaptor.addChild(root_2, stream_v.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 39, execute_immediate_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "execute_immediate_statement"


	public static class open_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "open_statement"
	// DBL.g:606:2: open_statement : OPEN c= Identifier ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )? -> {$v1 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) ) -> {$v2 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) ) -> {$d != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) ) -> ^( OPEN_STATEMENT ^( CURSOR $c) ) ;
	public final DBLParser.open_statement_return open_statement() throws RecognitionException {
		DBLParser.open_statement_return retval = new DBLParser.open_statement_return();
		retval.start = input.LT(1);
		int open_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token v1=null;
		Token v2=null;
		Token d=null;
		Token OPEN150=null;
		Token USING151=null;
		Token USING152=null;
		Token DESCRIPTOR153=null;

		CommonTree c_tree=null;
		CommonTree v1_tree=null;
		CommonTree v2_tree=null;
		CommonTree d_tree=null;
		CommonTree OPEN150_tree=null;
		CommonTree USING151_tree=null;
		CommonTree USING152_tree=null;
		CommonTree DESCRIPTOR153_tree=null;
		RewriteRuleTokenStream stream_OPEN=new RewriteRuleTokenStream(adaptor,"token OPEN");
		RewriteRuleTokenStream stream_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token DESCRIPTOR");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// DBL.g:607:3: ( OPEN c= Identifier ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )? -> {$v1 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) ) -> {$v2 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) ) -> {$d != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) ) -> ^( OPEN_STATEMENT ^( CURSOR $c) ) )
			// DBL.g:608:3: OPEN c= Identifier ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )?
			{
			OPEN150=(Token)match(input,OPEN,FOLLOW_OPEN_in_open_statement4848); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OPEN.add(OPEN150);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_open_statement4852); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// DBL.g:608:21: ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )?
			int alt46=3;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==USING) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==Variable) ) {
					alt46=1;
				}
				else if ( (LA46_1==DESCRIPTOR) ) {
					alt46=2;
				}
			}
			switch (alt46) {
				case 1 :
					// DBL.g:608:22: ( USING v1= Variable )
					{
					// DBL.g:608:22: ( USING v1= Variable )
					// DBL.g:608:23: USING v1= Variable
					{
					USING151=(Token)match(input,USING,FOLLOW_USING_in_open_statement4856); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING151);

					v1=(Token)match(input,Variable,FOLLOW_Variable_in_open_statement4860); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v1);

					}

					}
					break;
				case 2 :
					// DBL.g:608:42: ( USING DESCRIPTOR (v2= Variable |d= Identifier ) )
					{
					// DBL.g:608:42: ( USING DESCRIPTOR (v2= Variable |d= Identifier ) )
					// DBL.g:608:43: USING DESCRIPTOR (v2= Variable |d= Identifier )
					{
					USING152=(Token)match(input,USING,FOLLOW_USING_in_open_statement4864); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING152);

					DESCRIPTOR153=(Token)match(input,DESCRIPTOR,FOLLOW_DESCRIPTOR_in_open_statement4866); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESCRIPTOR.add(DESCRIPTOR153);

					// DBL.g:608:60: (v2= Variable |d= Identifier )
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==Variable) ) {
						alt45=1;
					}
					else if ( (LA45_0==Identifier) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 45, 0, input);
						throw nvae;
					}

					switch (alt45) {
						case 1 :
							// DBL.g:608:61: v2= Variable
							{
							v2=(Token)match(input,Variable,FOLLOW_Variable_in_open_statement4871); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v2);

							}
							break;
						case 2 :
							// DBL.g:608:73: d= Identifier
							{
							d=(Token)match(input,Identifier,FOLLOW_Identifier_in_open_statement4875); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(d);

							}
							break;

					}

					}

					}
					break;

			}

			// AST REWRITE
			// elements: USING, c, DESCRIPTOR, v1, d, v2, c, c, c
			// token labels: v1, d, c, v2
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v1=new RewriteRuleTokenStream(adaptor,"token v1",v1);
			RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleTokenStream stream_v2=new RewriteRuleTokenStream(adaptor,"token v2",v2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 608:91: -> {$v1 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) )
			if (v1 != null) {
				// DBL.g:608:109: ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// DBL.g:608:126: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:608:139: ^( USING ^( VARIABLE $v1) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
				// DBL.g:608:147: ^( VARIABLE $v1)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v1.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 609:14: -> {$v2 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) )
			if (v2 != null) {
				// DBL.g:609:32: ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// DBL.g:609:49: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:609:62: ^( USING_DESCRIPTOR ^( VARIABLE $v2) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USING_DESCRIPTOR, "USING_DESCRIPTOR"), root_2);
				// DBL.g:609:81: ^( VARIABLE $v2)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v2.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 610:14: -> {$d != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) )
			if (d != null) {
				// DBL.g:610:31: ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// DBL.g:610:48: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:610:62: ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USING_DESCRIPTOR, "USING_DESCRIPTOR"), root_2);
				// DBL.g:610:81: ^( DESCRIPTOR $d)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot(stream_DESCRIPTOR.nextNode(), root_3);
				adaptor.addChild(root_3, stream_d.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 611:14: -> ^( OPEN_STATEMENT ^( CURSOR $c) )
			{
				// DBL.g:611:17: ^( OPEN_STATEMENT ^( CURSOR $c) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// DBL.g:611:34: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 40, open_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "open_statement"


	public static class prepare_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prepare_statement"
	// DBL.g:616:2: prepare_statement : PREPARE s= Identifier ( into_clause )? FROM v= Variable -> ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) ) ;
	public final DBLParser.prepare_statement_return prepare_statement() throws RecognitionException {
		DBLParser.prepare_statement_return retval = new DBLParser.prepare_statement_return();
		retval.start = input.LT(1);
		int prepare_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token v=null;
		Token PREPARE154=null;
		Token FROM156=null;
		ParserRuleReturnScope into_clause155 =null;

		CommonTree s_tree=null;
		CommonTree v_tree=null;
		CommonTree PREPARE154_tree=null;
		CommonTree FROM156_tree=null;
		RewriteRuleTokenStream stream_PREPARE=new RewriteRuleTokenStream(adaptor,"token PREPARE");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_into_clause=new RewriteRuleSubtreeStream(adaptor,"rule into_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// DBL.g:617:3: ( PREPARE s= Identifier ( into_clause )? FROM v= Variable -> ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) ) )
			// DBL.g:618:3: PREPARE s= Identifier ( into_clause )? FROM v= Variable
			{
			PREPARE154=(Token)match(input,PREPARE,FOLLOW_PREPARE_in_prepare_statement5046); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PREPARE.add(PREPARE154);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_prepare_statement5050); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// DBL.g:618:24: ( into_clause )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==INTO) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// DBL.g:618:25: into_clause
					{
					pushFollow(FOLLOW_into_clause_in_prepare_statement5053);
					into_clause155=into_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_into_clause.add(into_clause155.getTree());
					}
					break;

			}

			FROM156=(Token)match(input,FROM,FOLLOW_FROM_in_prepare_statement5057); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FROM.add(FROM156);

			v=(Token)match(input,Variable,FOLLOW_Variable_in_prepare_statement5061); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(v);

			// AST REWRITE
			// elements: v, FROM, s, into_clause
			// token labels: v, s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 618:55: -> ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) )
			{
				// DBL.g:618:58: ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PREPARE_STATEMENT, "PREPARE_STATEMENT"), root_1);
				// DBL.g:618:78: ^( STATEMENT $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENT, "STATEMENT"), root_2);
				adaptor.addChild(root_2, stream_s.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:618:94: ( into_clause )?
				if ( stream_into_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_into_clause.nextTree());
				}
				stream_into_clause.reset();

				// DBL.g:618:109: ^( FROM ^( VARIABLE $v) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);
				// DBL.g:618:116: ^( VARIABLE $v)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v.nextNode());
				adaptor.addChild(root_2, root_3);
				}

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
			if ( state.backtracking>0 ) { memoize(input, 41, prepare_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prepare_statement"


	public static class declare_cursor_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declare_cursor_statement"
	// DBL.g:622:2: declare_cursor_statement : DECLARE c= Identifier (d= DYNAMIC )? (sc= ( SCROLL | ( NO SCROLL ) )? CURSOR (h= ( WITH HOLD ) | ( WITHOUT HOLD ) ) )? FOR s= Identifier -> ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) ) ;
	public final DBLParser.declare_cursor_statement_return declare_cursor_statement() throws RecognitionException {
		DBLParser.declare_cursor_statement_return retval = new DBLParser.declare_cursor_statement_return();
		retval.start = input.LT(1);
		int declare_cursor_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token d=null;
		Token sc=null;
		Token h=null;
		Token s=null;
		Token DECLARE157=null;
		Token CURSOR158=null;
		Token WITHOUT159=null;
		Token HOLD160=null;
		Token FOR161=null;

		CommonTree c_tree=null;
		CommonTree d_tree=null;
		CommonTree sc_tree=null;
		CommonTree h_tree=null;
		CommonTree s_tree=null;
		CommonTree DECLARE157_tree=null;
		CommonTree CURSOR158_tree=null;
		CommonTree WITHOUT159_tree=null;
		CommonTree HOLD160_tree=null;
		CommonTree FOR161_tree=null;
		RewriteRuleTokenStream stream_DECLARE=new RewriteRuleTokenStream(adaptor,"token DECLARE");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_HOLD=new RewriteRuleTokenStream(adaptor,"token HOLD");
		RewriteRuleTokenStream stream_SCROLL=new RewriteRuleTokenStream(adaptor,"token SCROLL");
		RewriteRuleTokenStream stream_CURSOR=new RewriteRuleTokenStream(adaptor,"token CURSOR");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DYNAMIC=new RewriteRuleTokenStream(adaptor,"token DYNAMIC");
		RewriteRuleTokenStream stream_WITHOUT=new RewriteRuleTokenStream(adaptor,"token WITHOUT");
		RewriteRuleTokenStream stream_NO=new RewriteRuleTokenStream(adaptor,"token NO");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// DBL.g:623:3: ( DECLARE c= Identifier (d= DYNAMIC )? (sc= ( SCROLL | ( NO SCROLL ) )? CURSOR (h= ( WITH HOLD ) | ( WITHOUT HOLD ) ) )? FOR s= Identifier -> ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) ) )
			// DBL.g:624:3: DECLARE c= Identifier (d= DYNAMIC )? (sc= ( SCROLL | ( NO SCROLL ) )? CURSOR (h= ( WITH HOLD ) | ( WITHOUT HOLD ) ) )? FOR s= Identifier
			{
			DECLARE157=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_declare_cursor_statement5111); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DECLARE.add(DECLARE157);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_declare_cursor_statement5115); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// DBL.g:624:24: (d= DYNAMIC )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==DYNAMIC) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// DBL.g:624:25: d= DYNAMIC
					{
					d=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declare_cursor_statement5120); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DYNAMIC.add(d);

					}
					break;

			}

			// DBL.g:624:37: (sc= ( SCROLL | ( NO SCROLL ) )? CURSOR (h= ( WITH HOLD ) | ( WITHOUT HOLD ) ) )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==CURSOR||LA51_0==NO||LA51_0==SCROLL) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// DBL.g:624:38: sc= ( SCROLL | ( NO SCROLL ) )? CURSOR (h= ( WITH HOLD ) | ( WITHOUT HOLD ) )
					{
					// DBL.g:624:41: ( SCROLL | ( NO SCROLL ) )?
					int alt49=3;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==SCROLL) ) {
						alt49=1;
					}
					else if ( (LA49_0==NO) ) {
						alt49=2;
					}
					switch (alt49) {
						case 1 :
							// DBL.g:624:42: SCROLL
							{
							sc=(Token)match(input,SCROLL,FOLLOW_SCROLL_in_declare_cursor_statement5128); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SCROLL.add(sc);

							}
							break;
						case 2 :
							// DBL.g:624:49: ( NO SCROLL )
							{
							// DBL.g:624:49: ( NO SCROLL )
							// DBL.g:624:50: NO SCROLL
							{
							sc=(Token)match(input,NO,FOLLOW_NO_in_declare_cursor_statement5131); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NO.add(sc);

							sc=(Token)match(input,SCROLL,FOLLOW_SCROLL_in_declare_cursor_statement5133); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SCROLL.add(sc);

							}

							}
							break;

					}

					CURSOR158=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_declare_cursor_statement5138); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CURSOR.add(CURSOR158);

					// DBL.g:624:70: (h= ( WITH HOLD ) | ( WITHOUT HOLD ) )
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==WITH) ) {
						alt50=1;
					}
					else if ( (LA50_0==WITHOUT) ) {
						alt50=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}

					switch (alt50) {
						case 1 :
							// DBL.g:624:71: h= ( WITH HOLD )
							{
							// DBL.g:624:73: ( WITH HOLD )
							// DBL.g:624:74: WITH HOLD
							{
							h=(Token)match(input,WITH,FOLLOW_WITH_in_declare_cursor_statement5144); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WITH.add(h);

							h=(Token)match(input,HOLD,FOLLOW_HOLD_in_declare_cursor_statement5146); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_HOLD.add(h);

							}

							}
							break;
						case 2 :
							// DBL.g:624:85: ( WITHOUT HOLD )
							{
							// DBL.g:624:85: ( WITHOUT HOLD )
							// DBL.g:624:86: WITHOUT HOLD
							{
							WITHOUT159=(Token)match(input,WITHOUT,FOLLOW_WITHOUT_in_declare_cursor_statement5150); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WITHOUT.add(WITHOUT159);

							HOLD160=(Token)match(input,HOLD,FOLLOW_HOLD_in_declare_cursor_statement5152); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_HOLD.add(HOLD160);

							}

							}
							break;

					}

					}
					break;

			}

			FOR161=(Token)match(input,FOR,FOLLOW_FOR_in_declare_cursor_statement5158); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR161);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_declare_cursor_statement5162); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// AST REWRITE
			// elements: FOR, s, sc, CURSOR, h, d, c
			// token labels: d, s, c, sc, h
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleTokenStream stream_sc=new RewriteRuleTokenStream(adaptor,"token sc",sc);
			RewriteRuleTokenStream stream_h=new RewriteRuleTokenStream(adaptor,"token h",h);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 625:3: -> ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) )
			{
				// DBL.g:625:6: ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_CURSOR_STATEMENT, "DECLARE_CURSOR_STATEMENT"), root_1);
				// DBL.g:625:33: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_CURSOR.nextNode(), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:625:46: ( $d)?
				if ( stream_d.hasNext() ) {
					adaptor.addChild(root_1, stream_d.nextNode());
				}
				stream_d.reset();

				// DBL.g:625:52: ( $sc)?
				if ( stream_sc.hasNext() ) {
					adaptor.addChild(root_1, stream_sc.nextNode());
				}
				stream_sc.reset();

				// DBL.g:625:59: ( $h)?
				if ( stream_h.hasNext() ) {
					adaptor.addChild(root_1, stream_h.nextNode());
				}
				stream_h.reset();

				// DBL.g:625:65: ^( FOR ^( STATEMENT $s) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_2);
				// DBL.g:625:71: ^( STATEMENT $s)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENT, "STATEMENT"), root_3);
				adaptor.addChild(root_3, stream_s.nextNode());
				adaptor.addChild(root_2, root_3);
				}

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
			if ( state.backtracking>0 ) { memoize(input, 42, declare_cursor_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "declare_cursor_statement"


	public static class describe_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "describe_statement"
	// DBL.g:628:2: describe_statement : DESCRIBE s= Identifier into_clause -> ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause ) ;
	public final DBLParser.describe_statement_return describe_statement() throws RecognitionException {
		DBLParser.describe_statement_return retval = new DBLParser.describe_statement_return();
		retval.start = input.LT(1);
		int describe_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token DESCRIBE162=null;
		ParserRuleReturnScope into_clause163 =null;

		CommonTree s_tree=null;
		CommonTree DESCRIBE162_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
		RewriteRuleSubtreeStream stream_into_clause=new RewriteRuleSubtreeStream(adaptor,"rule into_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// DBL.g:629:3: ( DESCRIBE s= Identifier into_clause -> ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause ) )
			// DBL.g:630:3: DESCRIBE s= Identifier into_clause
			{
			DESCRIBE162=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describe_statement5227); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE162);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_describe_statement5231); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			pushFollow(FOLLOW_into_clause_in_describe_statement5233);
			into_clause163=into_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_into_clause.add(into_clause163.getTree());
			// AST REWRITE
			// elements: s, into_clause
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 630:37: -> ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause )
			{
				// DBL.g:630:39: ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DESCRIBE_STATEMENT, "DESCRIBE_STATEMENT"), root_1);
				// DBL.g:630:60: ^( STATEMENT $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENT, "STATEMENT"), root_2);
				adaptor.addChild(root_2, stream_s.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_into_clause.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 43, describe_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "describe_statement"


	public static class fetch_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fetch_statement"
	// DBL.g:633:2: fetch_statement : FETCH ( fetch_position )? FROM c= Identifier ( fetch_into )? -> ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? ) ;
	public final DBLParser.fetch_statement_return fetch_statement() throws RecognitionException {
		DBLParser.fetch_statement_return retval = new DBLParser.fetch_statement_return();
		retval.start = input.LT(1);
		int fetch_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token FETCH164=null;
		Token FROM166=null;
		ParserRuleReturnScope fetch_position165 =null;
		ParserRuleReturnScope fetch_into167 =null;

		CommonTree c_tree=null;
		CommonTree FETCH164_tree=null;
		CommonTree FROM166_tree=null;
		RewriteRuleTokenStream stream_FETCH=new RewriteRuleTokenStream(adaptor,"token FETCH");
		RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_fetch_position=new RewriteRuleSubtreeStream(adaptor,"rule fetch_position");
		RewriteRuleSubtreeStream stream_fetch_into=new RewriteRuleSubtreeStream(adaptor,"rule fetch_into");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// DBL.g:634:3: ( FETCH ( fetch_position )? FROM c= Identifier ( fetch_into )? -> ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? ) )
			// DBL.g:635:3: FETCH ( fetch_position )? FROM c= Identifier ( fetch_into )?
			{
			FETCH164=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_statement5265); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FETCH.add(FETCH164);

			// DBL.g:635:9: ( fetch_position )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==AFTER||LA52_0==BEFORE||LA52_0==CURRENT||LA52_0==FIRST||LA52_0==LAST||LA52_0==NEXT||LA52_0==PRIOR||LA52_0==RELATIVE) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// DBL.g:635:10: fetch_position
					{
					pushFollow(FOLLOW_fetch_position_in_fetch_statement5268);
					fetch_position165=fetch_position();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fetch_position.add(fetch_position165.getTree());
					}
					break;

			}

			FROM166=(Token)match(input,FROM,FOLLOW_FROM_in_fetch_statement5272); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FROM.add(FROM166);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_fetch_statement5276); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// DBL.g:635:45: ( fetch_into )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==FOR||LA53_0==INTO) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// DBL.g:635:46: fetch_into
					{
					pushFollow(FOLLOW_fetch_into_in_fetch_statement5279);
					fetch_into167=fetch_into();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fetch_into.add(fetch_into167.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: fetch_into, c, fetch_position
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
			// 635:59: -> ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? )
			{
				// DBL.g:635:62: ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_STATEMENT, "FETCH_STATEMENT"), root_1);
				// DBL.g:635:80: ( fetch_position )?
				if ( stream_fetch_position.hasNext() ) {
					adaptor.addChild(root_1, stream_fetch_position.nextTree());
				}
				stream_fetch_position.reset();

				// DBL.g:635:98: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:635:111: ( fetch_into )?
				if ( stream_fetch_into.hasNext() ) {
					adaptor.addChild(root_1, stream_fetch_into.nextTree());
				}
				stream_fetch_into.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 44, fetch_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fetch_statement"


	public static class fetch_position_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fetch_position"
	// DBL.g:638:2: fetch_position : (p= ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT ) -> ^( FETCH_POSITION $p) | RELATIVE (v= Variable |i= NUMBER ) -> {$v != null}? ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) ) -> ^( FETCH_POSITION ^( RELATIVE NUMBER ) ) );
	public final DBLParser.fetch_position_return fetch_position() throws RecognitionException {
		DBLParser.fetch_position_return retval = new DBLParser.fetch_position_return();
		retval.start = input.LT(1);
		int fetch_position_StartIndex = input.index();

		CommonTree root_0 = null;

		Token p=null;
		Token v=null;
		Token i=null;
		Token RELATIVE168=null;

		CommonTree p_tree=null;
		CommonTree v_tree=null;
		CommonTree i_tree=null;
		CommonTree RELATIVE168_tree=null;
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
		RewriteRuleTokenStream stream_RELATIVE=new RewriteRuleTokenStream(adaptor,"token RELATIVE");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
		RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
		RewriteRuleTokenStream stream_CURRENT=new RewriteRuleTokenStream(adaptor,"token CURRENT");
		RewriteRuleTokenStream stream_PRIOR=new RewriteRuleTokenStream(adaptor,"token PRIOR");
		RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// DBL.g:639:3: (p= ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT ) -> ^( FETCH_POSITION $p) | RELATIVE (v= Variable |i= NUMBER ) -> {$v != null}? ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) ) -> ^( FETCH_POSITION ^( RELATIVE NUMBER ) ) )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==AFTER||LA56_0==BEFORE||LA56_0==CURRENT||LA56_0==FIRST||LA56_0==LAST||LA56_0==NEXT||LA56_0==PRIOR) ) {
				alt56=1;
			}
			else if ( (LA56_0==RELATIVE) ) {
				alt56=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// DBL.g:639:5: p= ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT )
					{
					// DBL.g:639:8: ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT )
					int alt54=7;
					switch ( input.LA(1) ) {
					case NEXT:
						{
						alt54=1;
						}
						break;
					case PRIOR:
						{
						alt54=2;
						}
						break;
					case FIRST:
						{
						alt54=3;
						}
						break;
					case LAST:
						{
						alt54=4;
						}
						break;
					case BEFORE:
						{
						alt54=5;
						}
						break;
					case AFTER:
						{
						alt54=6;
						}
						break;
					case CURRENT:
						{
						alt54=7;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 54, 0, input);
						throw nvae;
					}
					switch (alt54) {
						case 1 :
							// DBL.g:639:9: NEXT
							{
							p=(Token)match(input,NEXT,FOLLOW_NEXT_in_fetch_position5324); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NEXT.add(p);

							}
							break;
						case 2 :
							// DBL.g:639:14: PRIOR
							{
							p=(Token)match(input,PRIOR,FOLLOW_PRIOR_in_fetch_position5326); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_PRIOR.add(p);

							}
							break;
						case 3 :
							// DBL.g:639:20: FIRST
							{
							p=(Token)match(input,FIRST,FOLLOW_FIRST_in_fetch_position5328); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FIRST.add(p);

							}
							break;
						case 4 :
							// DBL.g:639:26: LAST
							{
							p=(Token)match(input,LAST,FOLLOW_LAST_in_fetch_position5330); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LAST.add(p);

							}
							break;
						case 5 :
							// DBL.g:639:31: BEFORE
							{
							p=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_fetch_position5332); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_BEFORE.add(p);

							}
							break;
						case 6 :
							// DBL.g:639:38: AFTER
							{
							p=(Token)match(input,AFTER,FOLLOW_AFTER_in_fetch_position5334); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AFTER.add(p);

							}
							break;
						case 7 :
							// DBL.g:639:44: CURRENT
							{
							p=(Token)match(input,CURRENT,FOLLOW_CURRENT_in_fetch_position5336); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_CURRENT.add(p);

							}
							break;

					}

					// AST REWRITE
					// elements: p
					// token labels: p
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 639:53: -> ^( FETCH_POSITION $p)
					{
						// DBL.g:639:56: ^( FETCH_POSITION $p)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_POSITION, "FETCH_POSITION"), root_1);
						adaptor.addChild(root_1, stream_p.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:641:4: RELATIVE (v= Variable |i= NUMBER )
					{
					RELATIVE168=(Token)match(input,RELATIVE,FOLLOW_RELATIVE_in_fetch_position5356); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELATIVE.add(RELATIVE168);

					// DBL.g:641:13: (v= Variable |i= NUMBER )
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==Variable) ) {
						alt55=1;
					}
					else if ( (LA55_0==NUMBER) ) {
						alt55=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 55, 0, input);
						throw nvae;
					}

					switch (alt55) {
						case 1 :
							// DBL.g:641:14: v= Variable
							{
							v=(Token)match(input,Variable,FOLLOW_Variable_in_fetch_position5361); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v);

							}
							break;
						case 2 :
							// DBL.g:641:25: i= NUMBER
							{
							i=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_fetch_position5365); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NUMBER.add(i);

							}
							break;

					}

					// AST REWRITE
					// elements: RELATIVE, RELATIVE, NUMBER, v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 641:35: -> {$v != null}? ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) )
					if (v != null) {
						// DBL.g:641:51: ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_POSITION, "FETCH_POSITION"), root_1);
						// DBL.g:641:68: ^( RELATIVE ^( VARIABLE $v) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_RELATIVE.nextNode(), root_2);
						// DBL.g:641:79: ^( VARIABLE $v)
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
						adaptor.addChild(root_3, stream_v.nextNode());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 642:14: -> ^( FETCH_POSITION ^( RELATIVE NUMBER ) )
					{
						// DBL.g:642:25: ^( FETCH_POSITION ^( RELATIVE NUMBER ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_POSITION, "FETCH_POSITION"), root_1);
						// DBL.g:642:42: ^( RELATIVE NUMBER )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_RELATIVE.nextNode(), root_2);
						adaptor.addChild(root_2, stream_NUMBER.nextNode());
						adaptor.addChild(root_1, root_2);
						}

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
			if ( state.backtracking>0 ) { memoize(input, 45, fetch_position_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fetch_position"


	public static class fetch_into_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fetch_into"
	// DBL.g:645:2: fetch_into : ( single_fetch | multiple_row_fetch );
	public final DBLParser.fetch_into_return fetch_into() throws RecognitionException {
		DBLParser.fetch_into_return retval = new DBLParser.fetch_into_return();
		retval.start = input.LT(1);
		int fetch_into_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope single_fetch169 =null;
		ParserRuleReturnScope multiple_row_fetch170 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// DBL.g:646:3: ( single_fetch | multiple_row_fetch )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==INTO) ) {
				alt57=1;
			}
			else if ( (LA57_0==FOR) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// DBL.g:647:3: single_fetch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_single_fetch_in_fetch_into5435);
					single_fetch169=single_fetch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_fetch169.getTree());

					}
					break;
				case 2 :
					// DBL.g:649:3: multiple_row_fetch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_multiple_row_fetch_in_fetch_into5443);
					multiple_row_fetch170=multiple_row_fetch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiple_row_fetch170.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 46, fetch_into_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fetch_into"


	public static class single_fetch_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "single_fetch"
	// DBL.g:652:2: single_fetch : INTO v= Variable -> ^( SINGLE_FETCH ^( INTO ^( VARIABLE $v) ) ) ;
	public final DBLParser.single_fetch_return single_fetch() throws RecognitionException {
		DBLParser.single_fetch_return retval = new DBLParser.single_fetch_return();
		retval.start = input.LT(1);
		int single_fetch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token v=null;
		Token INTO171=null;

		CommonTree v_tree=null;
		CommonTree INTO171_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// DBL.g:653:3: ( INTO v= Variable -> ^( SINGLE_FETCH ^( INTO ^( VARIABLE $v) ) ) )
			// DBL.g:654:3: INTO v= Variable
			{
			INTO171=(Token)match(input,INTO,FOLLOW_INTO_in_single_fetch5462); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTO.add(INTO171);

			v=(Token)match(input,Variable,FOLLOW_Variable_in_single_fetch5467); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(v);

			// AST REWRITE
			// elements: INTO, v
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 654:20: -> ^( SINGLE_FETCH ^( INTO ^( VARIABLE $v) ) )
			{
				// DBL.g:654:23: ^( SINGLE_FETCH ^( INTO ^( VARIABLE $v) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SINGLE_FETCH, "SINGLE_FETCH"), root_1);
				// DBL.g:654:38: ^( INTO ^( VARIABLE $v) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_2);
				// DBL.g:654:45: ^( VARIABLE $v)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v.nextNode());
				adaptor.addChild(root_2, root_3);
				}

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
			if ( state.backtracking>0 ) { memoize(input, 47, single_fetch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "single_fetch"


	public static class multiple_row_fetch_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiple_row_fetch"
	// DBL.g:658:2: multiple_row_fetch : FOR (v= Variable | NUMBER ) ROWS mi= multiple_row_into -> {$v != null}? ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) $mi) -> ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) $mi) ;
	public final DBLParser.multiple_row_fetch_return multiple_row_fetch() throws RecognitionException {
		DBLParser.multiple_row_fetch_return retval = new DBLParser.multiple_row_fetch_return();
		retval.start = input.LT(1);
		int multiple_row_fetch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token v=null;
		Token FOR172=null;
		Token NUMBER173=null;
		Token ROWS174=null;
		ParserRuleReturnScope mi =null;

		CommonTree v_tree=null;
		CommonTree FOR172_tree=null;
		CommonTree NUMBER173_tree=null;
		CommonTree ROWS174_tree=null;
		RewriteRuleTokenStream stream_ROWS=new RewriteRuleTokenStream(adaptor,"token ROWS");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleSubtreeStream stream_multiple_row_into=new RewriteRuleSubtreeStream(adaptor,"rule multiple_row_into");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// DBL.g:659:3: ( FOR (v= Variable | NUMBER ) ROWS mi= multiple_row_into -> {$v != null}? ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) $mi) -> ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) $mi) )
			// DBL.g:660:3: FOR (v= Variable | NUMBER ) ROWS mi= multiple_row_into
			{
			FOR172=(Token)match(input,FOR,FOLLOW_FOR_in_multiple_row_fetch5506); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR172);

			// DBL.g:660:7: (v= Variable | NUMBER )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==Variable) ) {
				alt58=1;
			}
			else if ( (LA58_0==NUMBER) ) {
				alt58=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// DBL.g:660:8: v= Variable
					{
					v=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row_fetch5511); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v);

					}
					break;
				case 2 :
					// DBL.g:660:19: NUMBER
					{
					NUMBER173=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_multiple_row_fetch5513); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER173);

					}
					break;

			}

			ROWS174=(Token)match(input,ROWS,FOLLOW_ROWS_in_multiple_row_fetch5516); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROWS.add(ROWS174);

			pushFollow(FOLLOW_multiple_row_into_in_multiple_row_fetch5521);
			mi=multiple_row_into();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_multiple_row_into.add(mi.getTree());
			// AST REWRITE
			// elements: FOR, mi, FOR, NUMBER, mi, v
			// token labels: v
			// rule labels: retval, mi
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_mi=new RewriteRuleSubtreeStream(adaptor,"rule mi",mi!=null?mi.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 660:54: -> {$v != null}? ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) $mi)
			if (v != null) {
				// DBL.g:660:70: ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) $mi)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULTIPLE_ROW_FETCH, "MULTIPLE_ROW_FETCH"), root_1);
				// DBL.g:660:91: ^( FOR ^( VARIABLE $v) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_2);
				// DBL.g:660:97: ^( VARIABLE $v)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_mi.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 661:10: -> ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) $mi)
			{
				// DBL.g:661:14: ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) $mi)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULTIPLE_ROW_FETCH, "MULTIPLE_ROW_FETCH"), root_1);
				// DBL.g:661:35: ^( FOR NUMBER )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_2);
				adaptor.addChild(root_2, stream_NUMBER.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_mi.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 48, multiple_row_fetch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiple_row_fetch"


	public static class multiple_row_into_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiple_row_into"
	// DBL.g:664:2: multiple_row_into : ( INTO ds= Variable -> ^( INTO ^( VARIABLE $ds) ) | USING DESCRIPTOR d= Variable INTO ds= Variable -> ^( DESCRIPTOR ^( VARIABLE $d) ^( INTO ^( VARIABLE $ds) ) ) );
	public final DBLParser.multiple_row_into_return multiple_row_into() throws RecognitionException {
		DBLParser.multiple_row_into_return retval = new DBLParser.multiple_row_into_return();
		retval.start = input.LT(1);
		int multiple_row_into_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ds=null;
		Token d=null;
		Token INTO175=null;
		Token USING176=null;
		Token DESCRIPTOR177=null;
		Token INTO178=null;

		CommonTree ds_tree=null;
		CommonTree d_tree=null;
		CommonTree INTO175_tree=null;
		CommonTree USING176_tree=null;
		CommonTree DESCRIPTOR177_tree=null;
		CommonTree INTO178_tree=null;
		RewriteRuleTokenStream stream_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token DESCRIPTOR");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// DBL.g:665:3: ( INTO ds= Variable -> ^( INTO ^( VARIABLE $ds) ) | USING DESCRIPTOR d= Variable INTO ds= Variable -> ^( DESCRIPTOR ^( VARIABLE $d) ^( INTO ^( VARIABLE $ds) ) ) )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==INTO) ) {
				alt59=1;
			}
			else if ( (LA59_0==USING) ) {
				alt59=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// DBL.g:666:3: INTO ds= Variable
					{
					INTO175=(Token)match(input,INTO,FOLLOW_INTO_in_multiple_row_into5589); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTO.add(INTO175);

					ds=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row_into5593); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(ds);

					// AST REWRITE
					// elements: ds, INTO
					// token labels: ds
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_ds=new RewriteRuleTokenStream(adaptor,"token ds",ds);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 666:20: -> ^( INTO ^( VARIABLE $ds) )
					{
						// DBL.g:666:23: ^( INTO ^( VARIABLE $ds) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_1);
						// DBL.g:666:30: ^( VARIABLE $ds)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_2);
						adaptor.addChild(root_2, stream_ds.nextNode());
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
					// DBL.g:668:3: USING DESCRIPTOR d= Variable INTO ds= Variable
					{
					USING176=(Token)match(input,USING,FOLLOW_USING_in_multiple_row_into5614); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING176);

					DESCRIPTOR177=(Token)match(input,DESCRIPTOR,FOLLOW_DESCRIPTOR_in_multiple_row_into5616); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESCRIPTOR.add(DESCRIPTOR177);

					d=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row_into5620); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(d);

					INTO178=(Token)match(input,INTO,FOLLOW_INTO_in_multiple_row_into5622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTO.add(INTO178);

					ds=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row_into5626); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(ds);

					// AST REWRITE
					// elements: DESCRIPTOR, ds, d, INTO
					// token labels: d, ds
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
					RewriteRuleTokenStream stream_ds=new RewriteRuleTokenStream(adaptor,"token ds",ds);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 668:48: -> ^( DESCRIPTOR ^( VARIABLE $d) ^( INTO ^( VARIABLE $ds) ) )
					{
						// DBL.g:668:50: ^( DESCRIPTOR ^( VARIABLE $d) ^( INTO ^( VARIABLE $ds) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_DESCRIPTOR.nextNode(), root_1);
						// DBL.g:668:63: ^( VARIABLE $d)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_2);
						adaptor.addChild(root_2, stream_d.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						// DBL.g:668:78: ^( INTO ^( VARIABLE $ds) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_2);
						// DBL.g:668:85: ^( VARIABLE $ds)
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
						adaptor.addChild(root_3, stream_ds.nextNode());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

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
			if ( state.backtracking>0 ) { memoize(input, 49, multiple_row_into_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiple_row_into"


	public static class close_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "close_statement"
	// DBL.g:673:2: close_statement : CLOSE c= Identifier -> ^( CLOSE_STATEMENT ^( CURSOR $c) ) ;
	public final DBLParser.close_statement_return close_statement() throws RecognitionException {
		DBLParser.close_statement_return retval = new DBLParser.close_statement_return();
		retval.start = input.LT(1);
		int close_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token CLOSE179=null;

		CommonTree c_tree=null;
		CommonTree CLOSE179_tree=null;
		RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// DBL.g:674:3: ( CLOSE c= Identifier -> ^( CLOSE_STATEMENT ^( CURSOR $c) ) )
			// DBL.g:675:3: CLOSE c= Identifier
			{
			CLOSE179=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_close_statement5674); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE.add(CLOSE179);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_close_statement5678); if (state.failed) return retval; 
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
			// 675:22: -> ^( CLOSE_STATEMENT ^( CURSOR $c) )
			{
				// DBL.g:675:25: ^( CLOSE_STATEMENT ^( CURSOR $c) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLOSE_STATEMENT, "CLOSE_STATEMENT"), root_1);
				// DBL.g:675:43: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 50, close_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "close_statement"


	public static class into_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "into_clause"
	// DBL.g:680:2: into_clause : INTO (d= Identifier |v= Variable ) ( USING t= using_target )? -> {$d!=null}? ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? ) -> ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? ) ;
	public final DBLParser.into_clause_return into_clause() throws RecognitionException {
		DBLParser.into_clause_return retval = new DBLParser.into_clause_return();
		retval.start = input.LT(1);
		int into_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token d=null;
		Token v=null;
		Token INTO180=null;
		Token USING181=null;
		ParserRuleReturnScope t =null;

		CommonTree d_tree=null;
		CommonTree v_tree=null;
		CommonTree INTO180_tree=null;
		CommonTree USING181_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_using_target=new RewriteRuleSubtreeStream(adaptor,"rule using_target");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// DBL.g:681:3: ( INTO (d= Identifier |v= Variable ) ( USING t= using_target )? -> {$d!=null}? ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? ) -> ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? ) )
			// DBL.g:682:3: INTO (d= Identifier |v= Variable ) ( USING t= using_target )?
			{
			INTO180=(Token)match(input,INTO,FOLLOW_INTO_in_into_clause5719); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTO.add(INTO180);

			// DBL.g:682:8: (d= Identifier |v= Variable )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==Identifier) ) {
				alt60=1;
			}
			else if ( (LA60_0==Variable) ) {
				alt60=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// DBL.g:682:9: d= Identifier
					{
					d=(Token)match(input,Identifier,FOLLOW_Identifier_in_into_clause5724); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(d);

					}
					break;
				case 2 :
					// DBL.g:682:22: v= Variable
					{
					v=(Token)match(input,Variable,FOLLOW_Variable_in_into_clause5728); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v);

					}
					break;

			}

			// DBL.g:682:34: ( USING t= using_target )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==USING) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// DBL.g:682:35: USING t= using_target
					{
					USING181=(Token)match(input,USING,FOLLOW_USING_in_into_clause5732); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING181);

					pushFollow(FOLLOW_using_target_in_into_clause5736);
					t=using_target();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_using_target.add(t.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: USING, d, INTO, t, t, v, USING, INTO
			// token labels: v, d
			// rule labels: retval, t
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 682:59: -> {$d!=null}? ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? )
			if (d!=null) {
				// DBL.g:682:74: ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_1);
				// DBL.g:682:81: ^( DESCRIPTOR $d)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DESCRIPTOR, "DESCRIPTOR"), root_2);
				adaptor.addChild(root_2, stream_d.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:682:98: ( ^( USING $t) )?
				if ( stream_t.hasNext()||stream_USING.hasNext() ) {
					// DBL.g:682:98: ^( USING $t)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
					adaptor.addChild(root_2, stream_t.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_t.reset();
				stream_USING.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 683:9: -> ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? )
			{
				// DBL.g:683:14: ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_1);
				// DBL.g:683:21: ^( VARIABLE $v)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_2);
				adaptor.addChild(root_2, stream_v.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:683:36: ( ^( USING $t) )?
				if ( stream_USING.hasNext()||stream_t.hasNext() ) {
					// DBL.g:683:36: ^( USING $t)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
					adaptor.addChild(root_2, stream_t.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_USING.reset();
				stream_t.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 51, into_clause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "into_clause"


	public static class using_target_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "using_target"
	// DBL.g:686:2: using_target : ( NAMES | LABELS | ANY | BOTH | ALL | system_names );
	public final DBLParser.using_target_return using_target() throws RecognitionException {
		DBLParser.using_target_return retval = new DBLParser.using_target_return();
		retval.start = input.LT(1);
		int using_target_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NAMES182=null;
		Token LABELS183=null;
		Token ANY184=null;
		Token BOTH185=null;
		Token ALL186=null;
		ParserRuleReturnScope system_names187 =null;

		CommonTree NAMES182_tree=null;
		CommonTree LABELS183_tree=null;
		CommonTree ANY184_tree=null;
		CommonTree BOTH185_tree=null;
		CommonTree ALL186_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// DBL.g:687:2: ( NAMES | LABELS | ANY | BOTH | ALL | system_names )
			int alt62=6;
			switch ( input.LA(1) ) {
			case NAMES:
				{
				alt62=1;
				}
				break;
			case LABELS:
				{
				alt62=2;
				}
				break;
			case ANY:
				{
				alt62=3;
				}
				break;
			case BOTH:
				{
				alt62=4;
				}
				break;
			case ALL:
				{
				alt62=5;
				}
				break;
			case SYSTEM:
				{
				alt62=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// DBL.g:688:2: NAMES
					{
					root_0 = (CommonTree)adaptor.nil();


					NAMES182=(Token)match(input,NAMES,FOLLOW_NAMES_in_using_target5812); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NAMES182_tree = (CommonTree)adaptor.create(NAMES182);
					adaptor.addChild(root_0, NAMES182_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:688:8: LABELS
					{
					root_0 = (CommonTree)adaptor.nil();


					LABELS183=(Token)match(input,LABELS,FOLLOW_LABELS_in_using_target5814); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LABELS183_tree = (CommonTree)adaptor.create(LABELS183);
					adaptor.addChild(root_0, LABELS183_tree);
					}

					}
					break;
				case 3 :
					// DBL.g:688:15: ANY
					{
					root_0 = (CommonTree)adaptor.nil();


					ANY184=(Token)match(input,ANY,FOLLOW_ANY_in_using_target5816); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ANY184_tree = (CommonTree)adaptor.create(ANY184);
					adaptor.addChild(root_0, ANY184_tree);
					}

					}
					break;
				case 4 :
					// DBL.g:688:19: BOTH
					{
					root_0 = (CommonTree)adaptor.nil();


					BOTH185=(Token)match(input,BOTH,FOLLOW_BOTH_in_using_target5818); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOTH185_tree = (CommonTree)adaptor.create(BOTH185);
					adaptor.addChild(root_0, BOTH185_tree);
					}

					}
					break;
				case 5 :
					// DBL.g:688:24: ALL
					{
					root_0 = (CommonTree)adaptor.nil();


					ALL186=(Token)match(input,ALL,FOLLOW_ALL_in_using_target5820); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ALL186_tree = (CommonTree)adaptor.create(ALL186);
					adaptor.addChild(root_0, ALL186_tree);
					}

					}
					break;
				case 6 :
					// DBL.g:688:28: system_names
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_system_names_in_using_target5822);
					system_names187=system_names();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, system_names187.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 52, using_target_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "using_target"


	public static class system_names_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "system_names"
	// DBL.g:691:1: system_names : SYSTEM NAMES -> ^( SYSTEM_NAMES ) ;
	public final DBLParser.system_names_return system_names() throws RecognitionException {
		DBLParser.system_names_return retval = new DBLParser.system_names_return();
		retval.start = input.LT(1);
		int system_names_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SYSTEM188=null;
		Token NAMES189=null;

		CommonTree SYSTEM188_tree=null;
		CommonTree NAMES189_tree=null;
		RewriteRuleTokenStream stream_SYSTEM=new RewriteRuleTokenStream(adaptor,"token SYSTEM");
		RewriteRuleTokenStream stream_NAMES=new RewriteRuleTokenStream(adaptor,"token NAMES");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// DBL.g:692:2: ( SYSTEM NAMES -> ^( SYSTEM_NAMES ) )
			// DBL.g:693:2: SYSTEM NAMES
			{
			SYSTEM188=(Token)match(input,SYSTEM,FOLLOW_SYSTEM_in_system_names5835); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYSTEM.add(SYSTEM188);

			NAMES189=(Token)match(input,NAMES,FOLLOW_NAMES_in_system_names5837); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAMES.add(NAMES189);

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
			// 693:15: -> ^( SYSTEM_NAMES )
			{
				// DBL.g:693:18: ^( SYSTEM_NAMES )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYSTEM_NAMES, "SYSTEM_NAMES"), root_1);
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
			if ( state.backtracking>0 ) { memoize(input, 53, system_names_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "system_names"


	public static class table_elements_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_elements"
	// DBL.g:699:1: table_elements : LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ ;
	public final DBLParser.table_elements_return table_elements() throws RecognitionException {
		DBLParser.table_elements_return retval = new DBLParser.table_elements_return();
		retval.start = input.LT(1);
		int table_elements_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN190=null;
		Token COMMA192=null;
		Token RIGHT_PAREN194=null;
		ParserRuleReturnScope field_element191 =null;
		ParserRuleReturnScope field_element193 =null;

		CommonTree LEFT_PAREN190_tree=null;
		CommonTree COMMA192_tree=null;
		CommonTree RIGHT_PAREN194_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_field_element=new RewriteRuleSubtreeStream(adaptor,"rule field_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// DBL.g:700:3: ( LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ )
			// DBL.g:700:5: LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN
			{
			LEFT_PAREN190=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_elements5860); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN190);

			pushFollow(FOLLOW_field_element_in_table_elements5862);
			field_element191=field_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_element.add(field_element191.getTree());
			// DBL.g:700:30: ( COMMA field_element )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==COMMA) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// DBL.g:700:31: COMMA field_element
					{
					COMMA192=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_elements5865); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA192);

					pushFollow(FOLLOW_field_element_in_table_elements5867);
					field_element193=field_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_field_element.add(field_element193.getTree());
					}
					break;

				default :
					break loop63;
				}
			}

			RIGHT_PAREN194=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_elements5871); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN194);

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
			// 701:5: -> ( field_element )+
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
			if ( state.backtracking>0 ) { memoize(input, 54, table_elements_StartIndex); }

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
	// DBL.g:704:1: field_element : Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) ;
	public final DBLParser.field_element_return field_element() throws RecognitionException {
		DBLParser.field_element_return retval = new DBLParser.field_element_return();
		retval.start = input.LT(1);
		int field_element_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token Identifier195=null;
		Token FOR196=null;
		Token COLUMN197=null;
		ParserRuleReturnScope field_type198 =null;
		ParserRuleReturnScope not_null199 =null;
		ParserRuleReturnScope with_default200 =null;

		CommonTree c_tree=null;
		CommonTree Identifier195_tree=null;
		CommonTree FOR196_tree=null;
		CommonTree COLUMN197_tree=null;
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
		RewriteRuleSubtreeStream stream_not_null=new RewriteRuleSubtreeStream(adaptor,"rule not_null");
		RewriteRuleSubtreeStream stream_with_default=new RewriteRuleSubtreeStream(adaptor,"rule with_default");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// DBL.g:705:3: ( Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) )
			// DBL.g:705:5: Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )?
			{
			Identifier195=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element5895); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier195);

			// DBL.g:705:16: ( FOR COLUMN c= Identifier )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==FOR) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// DBL.g:705:17: FOR COLUMN c= Identifier
					{
					FOR196=(Token)match(input,FOR,FOLLOW_FOR_in_field_element5898); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOR.add(FOR196);

					COLUMN197=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_field_element5900); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN197);

					c=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element5904); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(c);

					}
					break;

			}

			pushFollow(FOLLOW_field_type_in_field_element5908);
			field_type198=field_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_type.add(field_type198.getTree());
			// DBL.g:705:54: ( not_null )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==NOT) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// DBL.g:705:55: not_null
					{
					pushFollow(FOLLOW_not_null_in_field_element5911);
					not_null199=not_null();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_not_null.add(not_null199.getTree());
					}
					break;

			}

			// DBL.g:705:66: ( with_default )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==WITH) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// DBL.g:705:67: with_default
					{
					pushFollow(FOLLOW_with_default_in_field_element5916);
					with_default200=with_default();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_with_default.add(with_default200.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: Identifier, not_null, with_default, c, field_type
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
			// 705:81: -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
			{
				// DBL.g:705:84: ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_DEF, "FIELD_DEF"), root_1);
				// DBL.g:705:96: ^( FIELD_NAME Identifier )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_NAME, "FIELD_NAME"), root_2);
				adaptor.addChild(root_2, stream_Identifier.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:705:121: ( ^( FOR_COLUMN $c) )?
				if ( stream_c.hasNext() ) {
					// DBL.g:705:121: ^( FOR_COLUMN $c)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_COLUMN, "FOR_COLUMN"), root_2);
					adaptor.addChild(root_2, stream_c.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_c.reset();

				// DBL.g:705:139: ^( FIELD_TYPE field_type )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_TYPE, "FIELD_TYPE"), root_2);
				adaptor.addChild(root_2, stream_field_type.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:705:164: ( not_null )?
				if ( stream_not_null.hasNext() ) {
					adaptor.addChild(root_1, stream_not_null.nextTree());
				}
				stream_not_null.reset();

				// DBL.g:705:176: ( with_default )?
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
			if ( state.backtracking>0 ) { memoize(input, 55, field_element_StartIndex); }

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
	// DBL.g:708:1: not_null : NOT NULL -> ^( NOT_NULL ) ;
	public final DBLParser.not_null_return not_null() throws RecognitionException {
		DBLParser.not_null_return retval = new DBLParser.not_null_return();
		retval.start = input.LT(1);
		int not_null_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT201=null;
		Token NULL202=null;

		CommonTree NOT201_tree=null;
		CommonTree NULL202_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// DBL.g:708:9: ( NOT NULL -> ^( NOT_NULL ) )
			// DBL.g:709:2: NOT NULL
			{
			NOT201=(Token)match(input,NOT,FOLLOW_NOT_in_not_null5966); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NOT.add(NOT201);

			NULL202=(Token)match(input,NULL,FOLLOW_NULL_in_not_null5968); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL202);

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
			// 709:11: -> ^( NOT_NULL )
			{
				// DBL.g:709:14: ^( NOT_NULL )
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
			if ( state.backtracking>0 ) { memoize(input, 56, not_null_StartIndex); }

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
	// DBL.g:712:1: with_default : WITH DEFAULT -> ^( WITH_DEFAULT ) ;
	public final DBLParser.with_default_return with_default() throws RecognitionException {
		DBLParser.with_default_return retval = new DBLParser.with_default_return();
		retval.start = input.LT(1);
		int with_default_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH203=null;
		Token DEFAULT204=null;

		CommonTree WITH203_tree=null;
		CommonTree DEFAULT204_tree=null;
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// DBL.g:712:13: ( WITH DEFAULT -> ^( WITH_DEFAULT ) )
			// DBL.g:713:2: WITH DEFAULT
			{
			WITH203=(Token)match(input,WITH,FOLLOW_WITH_in_with_default5989); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH203);

			DEFAULT204=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_with_default5991); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT204);

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
			// 713:15: -> ^( WITH_DEFAULT )
			{
				// DBL.g:713:18: ^( WITH_DEFAULT )
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
			if ( state.backtracking>0 ) { memoize(input, 57, with_default_StartIndex); }

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
	// DBL.g:716:1: field_type : data_type ;
	public final DBLParser.field_type_return field_type() throws RecognitionException {
		DBLParser.field_type_return retval = new DBLParser.field_type_return();
		retval.start = input.LT(1);
		int field_type_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope data_type205 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// DBL.g:717:3: ( data_type )
			// DBL.g:717:5: data_type
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_data_type_in_field_type6017);
			data_type205=data_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, data_type205.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 58, field_type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "field_type"


	public static class query_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query_expression"
	// DBL.g:730:1: query_expression : query_expression_body ;
	public final DBLParser.query_expression_return query_expression() throws RecognitionException {
		DBLParser.query_expression_return retval = new DBLParser.query_expression_return();
		retval.start = input.LT(1);
		int query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_expression_body206 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// DBL.g:731:3: ( query_expression_body )
			// DBL.g:731:5: query_expression_body
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_expression_body_in_query_expression6038);
			query_expression_body206=query_expression_body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_expression_body206.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 59, query_expression_StartIndex); }

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
	// DBL.g:733:1: query_expression_body : ( non_join_query_expression | joined_table );
	public final DBLParser.query_expression_body_return query_expression_body() throws RecognitionException {
		DBLParser.query_expression_body_return retval = new DBLParser.query_expression_body_return();
		retval.start = input.LT(1);
		int query_expression_body_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_expression207 =null;
		ParserRuleReturnScope joined_table208 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// DBL.g:734:3: ( non_join_query_expression | joined_table )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==LEFT_PAREN||LA67_0==SELECT) ) {
				alt67=1;
			}
			else if ( (LA67_0==Identifier) ) {
				int LA67_3 = input.LA(2);
				if ( (synpred112_DBL()) ) {
					alt67=1;
				}
				else if ( (true) ) {
					alt67=2;
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
					// DBL.g:734:5: non_join_query_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_expression_in_query_expression_body6050);
					non_join_query_expression207=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression207.getTree());

					}
					break;
				case 2 :
					// DBL.g:735:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_expression_body6056);
					joined_table208=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table208.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 60, query_expression_body_StartIndex); }

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
	// DBL.g:737:1: non_join_query_expression : ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* ;
	public final DBLParser.non_join_query_expression_return non_join_query_expression() throws RecognitionException {
		DBLParser.non_join_query_expression_return retval = new DBLParser.non_join_query_expression_return();
		retval.start = input.LT(1);
		int non_join_query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set211=null;
		Token set212=null;
		Token set214=null;
		Token set215=null;
		ParserRuleReturnScope non_join_query_term209 =null;
		ParserRuleReturnScope joined_table210 =null;
		ParserRuleReturnScope query_term213 =null;
		ParserRuleReturnScope query_term216 =null;

		CommonTree set211_tree=null;
		CommonTree set212_tree=null;
		CommonTree set214_tree=null;
		CommonTree set215_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// DBL.g:738:3: ( ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* )
			// DBL.g:738:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// DBL.g:738:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==LEFT_PAREN||LA69_0==SELECT) ) {
				alt69=1;
			}
			else if ( (LA69_0==Identifier) ) {
				int LA69_3 = input.LA(2);
				if ( (synpred113_DBL()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=2;
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
					// DBL.g:738:6: non_join_query_term
					{
					pushFollow(FOLLOW_non_join_query_term_in_non_join_query_expression6069);
					non_join_query_term209=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term209.getTree());

					}
					break;
				case 2 :
					// DBL.g:738:28: joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_expression6073);
					joined_table210=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table210.getTree());

					set211=input.LT(1);
					set211=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set211), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// DBL.g:738:59: ( ALL | DISTINCT )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==ALL||LA68_0==DISTINCT) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// DBL.g:
							{
							set212=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set212));
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

					pushFollow(FOLLOW_query_term_in_non_join_query_expression6091);
					query_term213=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term213.getTree());

					}
					break;

			}

			// DBL.g:739:5: ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==EXCEPT||LA71_0==UNION) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// DBL.g:739:6: ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					set214=input.LT(1);
					set214=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set214), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// DBL.g:739:24: ( ALL | DISTINCT )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==ALL||LA70_0==DISTINCT) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// DBL.g:
							{
							set215=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set215));
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

					pushFollow(FOLLOW_query_term_in_non_join_query_expression6115);
					query_term216=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term216.getTree());

					}
					break;

				default :
					break loop71;
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
			if ( state.backtracking>0 ) { memoize(input, 61, non_join_query_expression_StartIndex); }

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
	// DBL.g:741:1: query_term : ( non_join_query_term | joined_table );
	public final DBLParser.query_term_return query_term() throws RecognitionException {
		DBLParser.query_term_return retval = new DBLParser.query_term_return();
		retval.start = input.LT(1);
		int query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_term217 =null;
		ParserRuleReturnScope joined_table218 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// DBL.g:742:3: ( non_join_query_term | joined_table )
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==LEFT_PAREN||LA72_0==SELECT) ) {
				alt72=1;
			}
			else if ( (LA72_0==Identifier) ) {
				int LA72_3 = input.LA(2);
				if ( (synpred121_DBL()) ) {
					alt72=1;
				}
				else if ( (true) ) {
					alt72=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}

			switch (alt72) {
				case 1 :
					// DBL.g:742:5: non_join_query_term
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_term_in_query_term6129);
					non_join_query_term217=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term217.getTree());

					}
					break;
				case 2 :
					// DBL.g:743:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_term6135);
					joined_table218=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table218.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 62, query_term_StartIndex); }

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
	// DBL.g:745:1: non_join_query_term : ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* ;
	public final DBLParser.non_join_query_term_return non_join_query_term() throws RecognitionException {
		DBLParser.non_join_query_term_return retval = new DBLParser.non_join_query_term_return();
		retval.start = input.LT(1);
		int non_join_query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INTERSECT221=null;
		Token set222=null;
		Token INTERSECT224=null;
		Token set225=null;
		ParserRuleReturnScope non_join_query_primary219 =null;
		ParserRuleReturnScope joined_table220 =null;
		ParserRuleReturnScope query_primary223 =null;
		ParserRuleReturnScope query_primary226 =null;

		CommonTree INTERSECT221_tree=null;
		CommonTree set222_tree=null;
		CommonTree INTERSECT224_tree=null;
		CommonTree set225_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// DBL.g:746:3: ( ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* )
			// DBL.g:746:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// DBL.g:746:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==LEFT_PAREN||LA74_0==SELECT) ) {
				alt74=1;
			}
			else if ( (LA74_0==Identifier) ) {
				alt74=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// DBL.g:746:7: non_join_query_primary
					{
					pushFollow(FOLLOW_non_join_query_primary_in_non_join_query_term6149);
					non_join_query_primary219=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary219.getTree());

					}
					break;
				case 2 :
					// DBL.g:746:32: joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_term6153);
					joined_table220=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table220.getTree());

					INTERSECT221=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term6155); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT221_tree = (CommonTree)adaptor.create(INTERSECT221);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT221_tree, root_0);
					}

					// DBL.g:746:56: ( ALL | DISTINCT )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==ALL||LA73_0==DISTINCT) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// DBL.g:
							{
							set222=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set222));
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

					pushFollow(FOLLOW_query_primary_in_non_join_query_term6165);
					query_primary223=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary223.getTree());

					}
					break;

			}

			// DBL.g:747:5: ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==INTERSECT) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// DBL.g:747:6: INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					INTERSECT224=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term6173); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT224_tree = (CommonTree)adaptor.create(INTERSECT224);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT224_tree, root_0);
					}

					// DBL.g:747:17: ( ALL | DISTINCT )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==ALL||LA75_0==DISTINCT) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// DBL.g:
							{
							set225=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set225));
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

					pushFollow(FOLLOW_query_primary_in_non_join_query_term6183);
					query_primary226=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary226.getTree());

					}
					break;

				default :
					break loop76;
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
			if ( state.backtracking>0 ) { memoize(input, 63, non_join_query_term_StartIndex); }

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
	// DBL.g:749:1: query_primary : ( non_join_query_primary | joined_table );
	public final DBLParser.query_primary_return query_primary() throws RecognitionException {
		DBLParser.query_primary_return retval = new DBLParser.query_primary_return();
		retval.start = input.LT(1);
		int query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_primary227 =null;
		ParserRuleReturnScope joined_table228 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// DBL.g:750:3: ( non_join_query_primary | joined_table )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==LEFT_PAREN||LA77_0==SELECT) ) {
				alt77=1;
			}
			else if ( (LA77_0==Identifier) ) {
				alt77=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// DBL.g:750:5: non_join_query_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_primary_in_query_primary6197);
					non_join_query_primary227=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary227.getTree());

					}
					break;
				case 2 :
					// DBL.g:751:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_primary6203);
					joined_table228=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table228.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 64, query_primary_StartIndex); }

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
	// DBL.g:753:1: non_join_query_primary : ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN );
	public final DBLParser.non_join_query_primary_return non_join_query_primary() throws RecognitionException {
		DBLParser.non_join_query_primary_return retval = new DBLParser.non_join_query_primary_return();
		retval.start = input.LT(1);
		int non_join_query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN230=null;
		Token RIGHT_PAREN232=null;
		ParserRuleReturnScope simple_table229 =null;
		ParserRuleReturnScope non_join_query_expression231 =null;

		CommonTree LEFT_PAREN230_tree=null;
		CommonTree RIGHT_PAREN232_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// DBL.g:754:3: ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==SELECT) ) {
				alt78=1;
			}
			else if ( (LA78_0==LEFT_PAREN) ) {
				alt78=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// DBL.g:754:5: simple_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_table_in_non_join_query_primary6215);
					simple_table229=simple_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_table229.getTree());

					}
					break;
				case 2 :
					// DBL.g:755:5: LEFT_PAREN non_join_query_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN230=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_non_join_query_primary6221); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN230_tree = (CommonTree)adaptor.create(LEFT_PAREN230);
					adaptor.addChild(root_0, LEFT_PAREN230_tree);
					}

					pushFollow(FOLLOW_non_join_query_expression_in_non_join_query_primary6223);
					non_join_query_expression231=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression231.getTree());

					RIGHT_PAREN232=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_non_join_query_primary6225); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN232_tree = (CommonTree)adaptor.create(RIGHT_PAREN232);
					adaptor.addChild(root_0, RIGHT_PAREN232_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 65, non_join_query_primary_StartIndex); }

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
	// DBL.g:757:1: simple_table options {k=1; } : query_specification ;
	public final DBLParser.simple_table_return simple_table() throws RecognitionException {
		DBLParser.simple_table_return retval = new DBLParser.simple_table_return();
		retval.start = input.LT(1);
		int simple_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_specification233 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// DBL.g:759:3: ( query_specification )
			// DBL.g:759:5: query_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_specification_in_simple_table6246);
			query_specification233=query_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_specification233.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 66, simple_table_StartIndex); }

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
	// DBL.g:761:1: query_specification : SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) ;
	public final DBLParser.query_specification_return query_specification() throws RecognitionException {
		DBLParser.query_specification_return retval = new DBLParser.query_specification_return();
		retval.start = input.LT(1);
		int query_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SELECT234=null;
		ParserRuleReturnScope set_qualifier235 =null;
		ParserRuleReturnScope select_list236 =null;
		ParserRuleReturnScope from_clause237 =null;
		ParserRuleReturnScope where_clause238 =null;
		ParserRuleReturnScope groupby_clause239 =null;
		ParserRuleReturnScope having_clause240 =null;
		ParserRuleReturnScope orderby_clause241 =null;
		ParserRuleReturnScope limit_clause242 =null;

		CommonTree SELECT234_tree=null;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// DBL.g:762:3: ( SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) )
			// DBL.g:762:5: SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )?
			{
			SELECT234=(Token)match(input,SELECT,FOLLOW_SELECT_in_query_specification6258); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SELECT.add(SELECT234);

			// DBL.g:762:12: ( set_qualifier )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==ALL||LA79_0==DISTINCT) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// DBL.g:762:12: set_qualifier
					{
					pushFollow(FOLLOW_set_qualifier_in_query_specification6260);
					set_qualifier235=set_qualifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_set_qualifier.add(set_qualifier235.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_select_list_in_query_specification6263);
			select_list236=select_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_select_list.add(select_list236.getTree());
			// DBL.g:762:39: ( from_clause )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==FROM) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// DBL.g:762:39: from_clause
					{
					pushFollow(FOLLOW_from_clause_in_query_specification6265);
					from_clause237=from_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_from_clause.add(from_clause237.getTree());
					}
					break;

			}

			// DBL.g:762:52: ( where_clause )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==WHERE) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// DBL.g:762:52: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_query_specification6268);
					where_clause238=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause238.getTree());
					}
					break;

			}

			// DBL.g:762:66: ( groupby_clause )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==GROUP) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// DBL.g:762:66: groupby_clause
					{
					pushFollow(FOLLOW_groupby_clause_in_query_specification6271);
					groupby_clause239=groupby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_clause.add(groupby_clause239.getTree());
					}
					break;

			}

			// DBL.g:762:82: ( having_clause )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==HAVING) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// DBL.g:762:82: having_clause
					{
					pushFollow(FOLLOW_having_clause_in_query_specification6274);
					having_clause240=having_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_having_clause.add(having_clause240.getTree());
					}
					break;

			}

			// DBL.g:763:5: ( orderby_clause )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==ORDER) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// DBL.g:763:5: orderby_clause
					{
					pushFollow(FOLLOW_orderby_clause_in_query_specification6281);
					orderby_clause241=orderby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_clause.add(orderby_clause241.getTree());
					}
					break;

			}

			// DBL.g:763:21: ( limit_clause )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==LIMIT) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// DBL.g:763:21: limit_clause
					{
					pushFollow(FOLLOW_limit_clause_in_query_specification6284);
					limit_clause242=limit_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_limit_clause.add(limit_clause242.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: orderby_clause, where_clause, set_qualifier, SELECT, limit_clause, select_list, having_clause, groupby_clause, from_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 764:5: -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
			{
				// DBL.g:764:8: ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SELECT.nextNode(), root_1);
				// DBL.g:764:17: ( from_clause )?
				if ( stream_from_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_from_clause.nextTree());
				}
				stream_from_clause.reset();

				// DBL.g:764:30: ( set_qualifier )?
				if ( stream_set_qualifier.hasNext() ) {
					adaptor.addChild(root_1, stream_set_qualifier.nextTree());
				}
				stream_set_qualifier.reset();

				adaptor.addChild(root_1, stream_select_list.nextTree());
				// DBL.g:764:57: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				// DBL.g:764:71: ( groupby_clause )?
				if ( stream_groupby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_clause.nextTree());
				}
				stream_groupby_clause.reset();

				// DBL.g:765:5: ( having_clause )?
				if ( stream_having_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_having_clause.nextTree());
				}
				stream_having_clause.reset();

				// DBL.g:765:20: ( orderby_clause )?
				if ( stream_orderby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_orderby_clause.nextTree());
				}
				stream_orderby_clause.reset();

				// DBL.g:765:36: ( limit_clause )?
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
			if ( state.backtracking>0 ) { memoize(input, 67, query_specification_StartIndex); }

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
	// DBL.g:767:1: select_list : ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) );
	public final DBLParser.select_list_return select_list() throws RecognitionException {
		DBLParser.select_list_return retval = new DBLParser.select_list_return();
		retval.start = input.LT(1);
		int select_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token MULTIPLY243=null;
		Token COMMA245=null;
		ParserRuleReturnScope derived_column244 =null;
		ParserRuleReturnScope derived_column246 =null;

		CommonTree MULTIPLY243_tree=null;
		CommonTree COMMA245_tree=null;
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_derived_column=new RewriteRuleSubtreeStream(adaptor,"rule derived_column");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// DBL.g:768:3: ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==MULTIPLY) ) {
				alt87=1;
			}
			else if ( (LA87_0==CASE||LA87_0==COUNT||LA87_0==Character_String_Literal||LA87_0==Identifier||LA87_0==LEFT_PAREN||LA87_0==MINUS||LA87_0==NOT||LA87_0==NULL||LA87_0==NUMBER||LA87_0==PLUS||LA87_0==REAL_NUMBER) ) {
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
					// DBL.g:768:5: MULTIPLY
					{
					MULTIPLY243=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_select_list6334); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY243);

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
					// 768:14: -> ^( SEL_LIST ALL )
					{
						// DBL.g:768:17: ^( SEL_LIST ALL )
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
					// DBL.g:769:5: derived_column ( COMMA derived_column )*
					{
					pushFollow(FOLLOW_derived_column_in_select_list6348);
					derived_column244=derived_column();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_derived_column.add(derived_column244.getTree());
					// DBL.g:769:20: ( COMMA derived_column )*
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==COMMA) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// DBL.g:769:21: COMMA derived_column
							{
							COMMA245=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list6351); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA245);

							pushFollow(FOLLOW_derived_column_in_select_list6353);
							derived_column246=derived_column();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_derived_column.add(derived_column246.getTree());
							}
							break;

						default :
							break loop86;
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
					// 769:44: -> ^( SEL_LIST ( derived_column )+ )
					{
						// DBL.g:769:47: ^( SEL_LIST ( derived_column )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 68, select_list_StartIndex); }

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
	// DBL.g:771:1: set_qualifier : ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) );
	public final DBLParser.set_qualifier_return set_qualifier() throws RecognitionException {
		DBLParser.set_qualifier_return retval = new DBLParser.set_qualifier_return();
		retval.start = input.LT(1);
		int set_qualifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DISTINCT247=null;
		Token ALL248=null;

		CommonTree DISTINCT247_tree=null;
		CommonTree ALL248_tree=null;
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// DBL.g:772:3: ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==DISTINCT) ) {
				alt88=1;
			}
			else if ( (LA88_0==ALL) ) {
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
					// DBL.g:772:5: DISTINCT
					{
					DISTINCT247=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_set_qualifier6376); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT247);

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
					// 772:14: -> ^( SET_QUALIFIER DISTINCT )
					{
						// DBL.g:772:17: ^( SET_QUALIFIER DISTINCT )
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
					// DBL.g:773:5: ALL
					{
					ALL248=(Token)match(input,ALL,FOLLOW_ALL_in_set_qualifier6390); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL248);

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
					// 773:9: -> ^( SET_QUALIFIER ALL )
					{
						// DBL.g:773:12: ^( SET_QUALIFIER ALL )
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
			if ( state.backtracking>0 ) { memoize(input, 69, set_qualifier_StartIndex); }

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
	// DBL.g:775:1: derived_column : boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) ;
	public final DBLParser.derived_column_return derived_column() throws RecognitionException {
		DBLParser.derived_column_return retval = new DBLParser.derived_column_return();
		retval.start = input.LT(1);
		int derived_column_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression249 =null;
		ParserRuleReturnScope as_clause250 =null;

		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");
		RewriteRuleSubtreeStream stream_as_clause=new RewriteRuleSubtreeStream(adaptor,"rule as_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// DBL.g:776:3: ( boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) )
			// DBL.g:776:5: boolean_value_expression ( as_clause )?
			{
			pushFollow(FOLLOW_boolean_value_expression_in_derived_column6410);
			boolean_value_expression249=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression249.getTree());
			// DBL.g:776:30: ( as_clause )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==AS||LA89_0==Identifier) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// DBL.g:776:30: as_clause
					{
					pushFollow(FOLLOW_as_clause_in_derived_column6412);
					as_clause250=as_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_as_clause.add(as_clause250.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: as_clause, boolean_value_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 776:41: -> ^( COLUMN boolean_value_expression ( as_clause )? )
			{
				// DBL.g:776:44: ^( COLUMN boolean_value_expression ( as_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN, "COLUMN"), root_1);
				adaptor.addChild(root_1, stream_boolean_value_expression.nextTree());
				// DBL.g:776:78: ( as_clause )?
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
			if ( state.backtracking>0 ) { memoize(input, 70, derived_column_StartIndex); }

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
	// DBL.g:779:1: column_reference : b= Identifier -> ^( COLUMN_NAME $b) ;
	public final DBLParser.column_reference_return column_reference() throws RecognitionException {
		DBLParser.column_reference_return retval = new DBLParser.column_reference_return();
		retval.start = input.LT(1);
		int column_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		Token b=null;

		CommonTree b_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// DBL.g:780:2: (b= Identifier -> ^( COLUMN_NAME $b) )
			// DBL.g:780:4: b= Identifier
			{
			b=(Token)match(input,Identifier,FOLLOW_Identifier_in_column_reference6440); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(b);

			// AST REWRITE
			// elements: b
			// token labels: b
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 780:17: -> ^( COLUMN_NAME $b)
			{
				// DBL.g:780:20: ^( COLUMN_NAME $b)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN_NAME, "COLUMN_NAME"), root_1);
				adaptor.addChild(root_1, stream_b.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 71, column_reference_StartIndex); }

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
	// DBL.g:783:1: as_clause : ( AS )? column_reference ;
	public final DBLParser.as_clause_return as_clause() throws RecognitionException {
		DBLParser.as_clause_return retval = new DBLParser.as_clause_return();
		retval.start = input.LT(1);
		int as_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AS251=null;
		ParserRuleReturnScope column_reference252 =null;

		CommonTree AS251_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// DBL.g:784:3: ( ( AS )? column_reference )
			// DBL.g:784:5: ( AS )? column_reference
			{
			root_0 = (CommonTree)adaptor.nil();


			// DBL.g:784:5: ( AS )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==AS) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// DBL.g:784:6: AS
					{
					AS251=(Token)match(input,AS,FOLLOW_AS_in_as_clause6464); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AS251_tree = (CommonTree)adaptor.create(AS251);
					adaptor.addChild(root_0, AS251_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_column_reference_in_as_clause6468);
			column_reference252=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference252.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 72, as_clause_StartIndex); }

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
	// DBL.g:786:1: column_reference_list : column_reference ( COMMA column_reference )* -> ( column_reference )+ ;
	public final DBLParser.column_reference_list_return column_reference_list() throws RecognitionException {
		DBLParser.column_reference_list_return retval = new DBLParser.column_reference_list_return();
		retval.start = input.LT(1);
		int column_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA254=null;
		ParserRuleReturnScope column_reference253 =null;
		ParserRuleReturnScope column_reference255 =null;

		CommonTree COMMA254_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// DBL.g:787:2: ( column_reference ( COMMA column_reference )* -> ( column_reference )+ )
			// DBL.g:787:4: column_reference ( COMMA column_reference )*
			{
			pushFollow(FOLLOW_column_reference_in_column_reference_list6479);
			column_reference253=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(column_reference253.getTree());
			// DBL.g:787:21: ( COMMA column_reference )*
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==COMMA) ) {
					int LA91_2 = input.LA(2);
					if ( (LA91_2==Identifier) ) {
						int LA91_3 = input.LA(3);
						if ( (synpred142_DBL()) ) {
							alt91=1;
						}

					}

				}

				switch (alt91) {
				case 1 :
					// DBL.g:787:22: COMMA column_reference
					{
					COMMA254=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_reference_list6482); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA254);

					pushFollow(FOLLOW_column_reference_in_column_reference_list6484);
					column_reference255=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_column_reference.add(column_reference255.getTree());
					}
					break;

				default :
					break loop91;
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
			// 787:47: -> ( column_reference )+
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
			if ( state.backtracking>0 ) { memoize(input, 73, column_reference_list_StartIndex); }

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
	// DBL.g:789:1: table : ( Identifier | qualified_identifier );
	public final DBLParser.table_return table() throws RecognitionException {
		DBLParser.table_return retval = new DBLParser.table_return();
		retval.start = input.LT(1);
		int table_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier256=null;
		ParserRuleReturnScope qualified_identifier257 =null;

		CommonTree Identifier256_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// DBL.g:790:3: ( Identifier | qualified_identifier )
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==Identifier) ) {
				int LA92_1 = input.LA(2);
				if ( (LA92_1==DIVIDE) ) {
					alt92=2;
				}
				else if ( (LA92_1==EOF||LA92_1==AS||LA92_1==COMMA||LA92_1==CROSS||LA92_1==EXCEPT||LA92_1==FULL||LA92_1==GROUP||LA92_1==HAVING||LA92_1==INNER||LA92_1==INTERSECT||LA92_1==Identifier||LA92_1==JOIN||LA92_1==LEFT||LA92_1==LIMIT||LA92_1==NATURAL||LA92_1==ON||LA92_1==ORDER||(LA92_1 >= RIGHT && LA92_1 <= RIGHT_PAREN)||LA92_1==UNION||LA92_1==USING||LA92_1==WHERE) ) {
					alt92=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// DBL.g:790:5: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier256=(Token)match(input,Identifier,FOLLOW_Identifier_in_table6502); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier256_tree = (CommonTree)adaptor.create(Identifier256);
					adaptor.addChild(root_0, Identifier256_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:792:5: qualified_identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_identifier_in_table6514);
					qualified_identifier257=qualified_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_identifier257.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 74, table_StartIndex); }

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
	// DBL.g:795:1: qualified_identifier : l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )? -> ^( QUALIFIED $l $f ( $m)? ) ;
	public final DBLParser.qualified_identifier_return qualified_identifier() throws RecognitionException {
		DBLParser.qualified_identifier_return retval = new DBLParser.qualified_identifier_return();
		retval.start = input.LT(1);
		int qualified_identifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE258=null;
		Token LEFT_PAREN259=null;
		Token RIGHT_PAREN260=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE258_tree=null;
		CommonTree LEFT_PAREN259_tree=null;
		CommonTree RIGHT_PAREN260_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// DBL.g:796:3: (l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )? -> ^( QUALIFIED $l $f ( $m)? ) )
			// DBL.g:796:5: l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )?
			{
			l=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6529); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(l);

			DIVIDE258=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_qualified_identifier6531); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE258);

			f=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6535); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(f);

			// DBL.g:796:38: ( LEFT_PAREN m= Identifier RIGHT_PAREN )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==LEFT_PAREN) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// DBL.g:796:39: LEFT_PAREN m= Identifier RIGHT_PAREN
					{
					LEFT_PAREN259=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_qualified_identifier6538); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN259);

					m=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6542); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(m);

					RIGHT_PAREN260=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_qualified_identifier6544); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN260);

					}
					break;

			}

			// AST REWRITE
			// elements: m, f, l
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
			// 796:77: -> ^( QUALIFIED $l $f ( $m)? )
			{
				// DBL.g:796:80: ^( QUALIFIED $l $f ( $m)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED, "QUALIFIED"), root_1);
				adaptor.addChild(root_1, stream_l.nextNode());
				adaptor.addChild(root_1, stream_f.nextNode());
				// DBL.g:796:99: ( $m)?
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
			if ( state.backtracking>0 ) { memoize(input, 75, qualified_identifier_StartIndex); }

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
	// DBL.g:799:1: member : l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) ;
	public final DBLParser.member_return member() throws RecognitionException {
		DBLParser.member_return retval = new DBLParser.member_return();
		retval.start = input.LT(1);
		int member_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE261=null;
		Token LEFT_PAREN262=null;
		Token RIGHT_PAREN263=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE261_tree=null;
		CommonTree LEFT_PAREN262_tree=null;
		CommonTree RIGHT_PAREN263_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// DBL.g:799:8: (l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) )
			// DBL.g:800:2: l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN
			{
			l=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6579); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(l);

			DIVIDE261=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_member6581); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE261);

			f=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6585); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(f);

			LEFT_PAREN262=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_member6587); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN262);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6591); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(m);

			RIGHT_PAREN263=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_member6593); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN263);

			// AST REWRITE
			// elements: f, m, l
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
			// 800:71: -> ^( MEMBER $l $f $m)
			{
				// DBL.g:800:74: ^( MEMBER $l $f $m)
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
			if ( state.backtracking>0 ) { memoize(input, 76, member_StartIndex); }

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
	// DBL.g:803:1: from_clause : FROM ^ table_reference_list ;
	public final DBLParser.from_clause_return from_clause() throws RecognitionException {
		DBLParser.from_clause_return retval = new DBLParser.from_clause_return();
		retval.start = input.LT(1);
		int from_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FROM264=null;
		ParserRuleReturnScope table_reference_list265 =null;

		CommonTree FROM264_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// DBL.g:804:3: ( FROM ^ table_reference_list )
			// DBL.g:804:5: FROM ^ table_reference_list
			{
			root_0 = (CommonTree)adaptor.nil();


			FROM264=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause6628); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FROM264_tree = (CommonTree)adaptor.create(FROM264);
			root_0 = (CommonTree)adaptor.becomeRoot(FROM264_tree, root_0);
			}

			pushFollow(FOLLOW_table_reference_list_in_from_clause6631);
			table_reference_list265=table_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_reference_list265.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 77, from_clause_StartIndex); }

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
	// DBL.g:806:1: table_reference_list : table_reference ( COMMA table_reference )* -> ( table_reference )+ ;
	public final DBLParser.table_reference_list_return table_reference_list() throws RecognitionException {
		DBLParser.table_reference_list_return retval = new DBLParser.table_reference_list_return();
		retval.start = input.LT(1);
		int table_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA267=null;
		ParserRuleReturnScope table_reference266 =null;
		ParserRuleReturnScope table_reference268 =null;

		CommonTree COMMA267_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_table_reference=new RewriteRuleSubtreeStream(adaptor,"rule table_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// DBL.g:807:3: ( table_reference ( COMMA table_reference )* -> ( table_reference )+ )
			// DBL.g:807:4: table_reference ( COMMA table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_reference_list6642);
			table_reference266=table_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_reference.add(table_reference266.getTree());
			// DBL.g:807:20: ( COMMA table_reference )*
			loop94:
			while (true) {
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==COMMA) ) {
					alt94=1;
				}

				switch (alt94) {
				case 1 :
					// DBL.g:807:21: COMMA table_reference
					{
					COMMA267=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_reference_list6645); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA267);

					pushFollow(FOLLOW_table_reference_in_table_reference_list6647);
					table_reference268=table_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table_reference.add(table_reference268.getTree());
					}
					break;

				default :
					break loop94;
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
			// 807:45: -> ( table_reference )+
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
			if ( state.backtracking>0 ) { memoize(input, 78, table_reference_list_StartIndex); }

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
	// DBL.g:809:1: table_reference : ( table_primary | joined_table );
	public final DBLParser.table_reference_return table_reference() throws RecognitionException {
		DBLParser.table_reference_return retval = new DBLParser.table_reference_return();
		retval.start = input.LT(1);
		int table_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary269 =null;
		ParserRuleReturnScope joined_table270 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// DBL.g:810:3: ( table_primary | joined_table )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case DIVIDE:
					{
					int LA95_2 = input.LA(3);
					if ( (LA95_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case LEFT_PAREN:
							{
							int LA95_9 = input.LA(5);
							if ( (LA95_9==Identifier) ) {
								int LA95_10 = input.LA(6);
								if ( (LA95_10==RIGHT_PAREN) ) {
									switch ( input.LA(7) ) {
									case AS:
										{
										int LA95_3 = input.LA(8);
										if ( (LA95_3==Identifier) ) {
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
												alt95=1;
												}
												break;
											case UNION:
												{
												int LA95_6 = input.LA(10);
												if ( (LA95_6==JOIN) ) {
													alt95=2;
												}
												else if ( (LA95_6==ALL||LA95_6==DISTINCT||LA95_6==Identifier||LA95_6==LEFT_PAREN||LA95_6==SELECT) ) {
													alt95=1;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 95, 6, input);
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
												alt95=2;
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
														new NoViableAltException("", 95, 4, input);
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
													new NoViableAltException("", 95, 3, input);
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
											alt95=1;
											}
											break;
										case UNION:
											{
											int LA95_6 = input.LA(9);
											if ( (LA95_6==JOIN) ) {
												alt95=2;
											}
											else if ( (LA95_6==ALL||LA95_6==DISTINCT||LA95_6==Identifier||LA95_6==LEFT_PAREN||LA95_6==SELECT) ) {
												alt95=1;
											}

											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 95, 6, input);
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
											alt95=2;
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
													new NoViableAltException("", 95, 4, input);
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
										alt95=1;
										}
										break;
									case UNION:
										{
										int LA95_6 = input.LA(8);
										if ( (LA95_6==JOIN) ) {
											alt95=2;
										}
										else if ( (LA95_6==ALL||LA95_6==DISTINCT||LA95_6==Identifier||LA95_6==LEFT_PAREN||LA95_6==SELECT) ) {
											alt95=1;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 95, 6, input);
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
										alt95=2;
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
												new NoViableAltException("", 95, 11, input);
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
											new NoViableAltException("", 95, 10, input);
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
										new NoViableAltException("", 95, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case AS:
							{
							int LA95_3 = input.LA(5);
							if ( (LA95_3==Identifier) ) {
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
									alt95=1;
									}
									break;
								case UNION:
									{
									int LA95_6 = input.LA(7);
									if ( (LA95_6==JOIN) ) {
										alt95=2;
									}
									else if ( (LA95_6==ALL||LA95_6==DISTINCT||LA95_6==Identifier||LA95_6==LEFT_PAREN||LA95_6==SELECT) ) {
										alt95=1;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 95, 6, input);
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
									alt95=2;
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
											new NoViableAltException("", 95, 4, input);
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
										new NoViableAltException("", 95, 3, input);
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
								alt95=1;
								}
								break;
							case UNION:
								{
								int LA95_6 = input.LA(6);
								if ( (LA95_6==JOIN) ) {
									alt95=2;
								}
								else if ( (LA95_6==ALL||LA95_6==DISTINCT||LA95_6==Identifier||LA95_6==LEFT_PAREN||LA95_6==SELECT) ) {
									alt95=1;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 95, 6, input);
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
								alt95=2;
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
										new NoViableAltException("", 95, 4, input);
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
							alt95=1;
							}
							break;
						case UNION:
							{
							int LA95_6 = input.LA(5);
							if ( (LA95_6==JOIN) ) {
								alt95=2;
							}
							else if ( (LA95_6==ALL||LA95_6==DISTINCT||LA95_6==Identifier||LA95_6==LEFT_PAREN||LA95_6==SELECT) ) {
								alt95=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 95, 6, input);
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
							alt95=2;
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
									new NoViableAltException("", 95, 8, input);
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
								new NoViableAltException("", 95, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case AS:
					{
					int LA95_3 = input.LA(3);
					if ( (LA95_3==Identifier) ) {
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
							alt95=1;
							}
							break;
						case UNION:
							{
							int LA95_6 = input.LA(5);
							if ( (LA95_6==JOIN) ) {
								alt95=2;
							}
							else if ( (LA95_6==ALL||LA95_6==DISTINCT||LA95_6==Identifier||LA95_6==LEFT_PAREN||LA95_6==SELECT) ) {
								alt95=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 95, 6, input);
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
							alt95=2;
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
									new NoViableAltException("", 95, 4, input);
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
								new NoViableAltException("", 95, 3, input);
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
						alt95=1;
						}
						break;
					case UNION:
						{
						int LA95_6 = input.LA(4);
						if ( (LA95_6==JOIN) ) {
							alt95=2;
						}
						else if ( (LA95_6==ALL||LA95_6==DISTINCT||LA95_6==Identifier||LA95_6==LEFT_PAREN||LA95_6==SELECT) ) {
							alt95=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 95, 6, input);
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
						alt95=2;
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
								new NoViableAltException("", 95, 4, input);
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
					alt95=1;
					}
					break;
				case UNION:
					{
					int LA95_6 = input.LA(3);
					if ( (LA95_6==JOIN) ) {
						alt95=2;
					}
					else if ( (LA95_6==ALL||LA95_6==DISTINCT||LA95_6==Identifier||LA95_6==LEFT_PAREN||LA95_6==SELECT) ) {
						alt95=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 95, 6, input);
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
					alt95=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 95, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// DBL.g:810:5: table_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_table_primary_in_table_reference6666);
					table_primary269=table_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary269.getTree());

					}
					break;
				case 2 :
					// DBL.g:811:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_table_reference6672);
					joined_table270=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table270.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 79, table_reference_StartIndex); }

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
	// DBL.g:813:1: joined_table : table_primary ( cross_join | qualified_join | natural_join | union_join )+ ;
	public final DBLParser.joined_table_return joined_table() throws RecognitionException {
		DBLParser.joined_table_return retval = new DBLParser.joined_table_return();
		retval.start = input.LT(1);
		int joined_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary271 =null;
		ParserRuleReturnScope cross_join272 =null;
		ParserRuleReturnScope qualified_join273 =null;
		ParserRuleReturnScope natural_join274 =null;
		ParserRuleReturnScope union_join275 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// DBL.g:814:3: ( table_primary ( cross_join | qualified_join | natural_join | union_join )+ )
			// DBL.g:814:5: table_primary ( cross_join | qualified_join | natural_join | union_join )+
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_table_primary_in_joined_table6684);
			table_primary271=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary271.getTree());

			// DBL.g:814:19: ( cross_join | qualified_join | natural_join | union_join )+
			int cnt96=0;
			loop96:
			while (true) {
				int alt96=5;
				switch ( input.LA(1) ) {
				case UNION:
					{
					int LA96_2 = input.LA(2);
					if ( (LA96_2==JOIN) ) {
						alt96=4;
					}

					}
					break;
				case CROSS:
					{
					alt96=1;
					}
					break;
				case FULL:
				case INNER:
				case JOIN:
				case LEFT:
				case RIGHT:
					{
					alt96=2;
					}
					break;
				case NATURAL:
					{
					alt96=3;
					}
					break;
				}
				switch (alt96) {
				case 1 :
					// DBL.g:814:20: cross_join
					{
					pushFollow(FOLLOW_cross_join_in_joined_table6687);
					cross_join272=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join272.getTree());

					}
					break;
				case 2 :
					// DBL.g:814:33: qualified_join
					{
					pushFollow(FOLLOW_qualified_join_in_joined_table6691);
					qualified_join273=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join273.getTree());

					}
					break;
				case 3 :
					// DBL.g:814:50: natural_join
					{
					pushFollow(FOLLOW_natural_join_in_joined_table6695);
					natural_join274=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join274.getTree());

					}
					break;
				case 4 :
					// DBL.g:814:65: union_join
					{
					pushFollow(FOLLOW_union_join_in_joined_table6699);
					union_join275=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join275.getTree());

					}
					break;

				default :
					if ( cnt96 >= 1 ) break loop96;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(96, input);
					throw eee;
				}
				cnt96++;
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
			if ( state.backtracking>0 ) { memoize(input, 80, joined_table_StartIndex); }

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
	// DBL.g:816:1: joined_table_prim : ( cross_join | qualified_join | natural_join | union_join );
	public final DBLParser.joined_table_prim_return joined_table_prim() throws RecognitionException {
		DBLParser.joined_table_prim_return retval = new DBLParser.joined_table_prim_return();
		retval.start = input.LT(1);
		int joined_table_prim_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope cross_join276 =null;
		ParserRuleReturnScope qualified_join277 =null;
		ParserRuleReturnScope natural_join278 =null;
		ParserRuleReturnScope union_join279 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// DBL.g:817:3: ( cross_join | qualified_join | natural_join | union_join )
			int alt97=4;
			switch ( input.LA(1) ) {
			case CROSS:
				{
				alt97=1;
				}
				break;
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
				{
				alt97=2;
				}
				break;
			case NATURAL:
				{
				alt97=3;
				}
				break;
			case UNION:
				{
				alt97=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// DBL.g:817:5: cross_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cross_join_in_joined_table_prim6713);
					cross_join276=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join276.getTree());

					}
					break;
				case 2 :
					// DBL.g:818:5: qualified_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_join_in_joined_table_prim6719);
					qualified_join277=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join277.getTree());

					}
					break;
				case 3 :
					// DBL.g:819:5: natural_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_natural_join_in_joined_table_prim6725);
					natural_join278=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join278.getTree());

					}
					break;
				case 4 :
					// DBL.g:820:5: union_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_union_join_in_joined_table_prim6731);
					union_join279=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join279.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 81, joined_table_prim_StartIndex); }

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
	// DBL.g:822:1: cross_join : CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) ;
	public final DBLParser.cross_join_return cross_join() throws RecognitionException {
		DBLParser.cross_join_return retval = new DBLParser.cross_join_return();
		retval.start = input.LT(1);
		int cross_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CROSS280=null;
		Token JOIN281=null;
		ParserRuleReturnScope r =null;

		CommonTree CROSS280_tree=null;
		CommonTree JOIN281_tree=null;
		RewriteRuleTokenStream stream_CROSS=new RewriteRuleTokenStream(adaptor,"token CROSS");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// DBL.g:823:3: ( CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) )
			// DBL.g:823:5: CROSS JOIN r= table_primary
			{
			CROSS280=(Token)match(input,CROSS,FOLLOW_CROSS_in_cross_join6743); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CROSS.add(CROSS280);

			JOIN281=(Token)match(input,JOIN,FOLLOW_JOIN_in_cross_join6745); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN281);

			pushFollow(FOLLOW_table_primary_in_cross_join6749);
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
			// 823:32: -> ^( JOIN CROSS $r)
			{
				// DBL.g:823:35: ^( JOIN CROSS $r)
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
			if ( state.backtracking>0 ) { memoize(input, 82, cross_join_StartIndex); }

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
	// DBL.g:825:1: qualified_join : (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) ;
	public final DBLParser.qualified_join_return qualified_join() throws RecognitionException {
		DBLParser.qualified_join_return retval = new DBLParser.qualified_join_return();
		retval.start = input.LT(1);
		int qualified_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token JOIN282=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope s =null;

		CommonTree JOIN282_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_specification=new RewriteRuleSubtreeStream(adaptor,"rule join_specification");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// DBL.g:826:3: ( (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) )
			// DBL.g:826:5: (t= join_type )? JOIN r= table_primary s= join_specification
			{
			// DBL.g:826:5: (t= join_type )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==FULL||LA98_0==INNER||LA98_0==LEFT||LA98_0==RIGHT) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// DBL.g:826:6: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_qualified_join6775);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN282=(Token)match(input,JOIN,FOLLOW_JOIN_in_qualified_join6779); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN282);

			pushFollow(FOLLOW_table_primary_in_qualified_join6783);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			pushFollow(FOLLOW_join_specification_in_qualified_join6787);
			s=join_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_join_specification.add(s.getTree());
			// AST REWRITE
			// elements: r, t, JOIN, s
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
			// 826:62: -> ^( JOIN ( $t)? $r $s)
			{
				// DBL.g:826:65: ^( JOIN ( $t)? $r $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				// DBL.g:826:73: ( $t)?
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
			if ( state.backtracking>0 ) { memoize(input, 83, qualified_join_StartIndex); }

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
	// DBL.g:828:1: natural_join : NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) ;
	public final DBLParser.natural_join_return natural_join() throws RecognitionException {
		DBLParser.natural_join_return retval = new DBLParser.natural_join_return();
		retval.start = input.LT(1);
		int natural_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NATURAL283=null;
		Token JOIN284=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;

		CommonTree NATURAL283_tree=null;
		CommonTree JOIN284_tree=null;
		RewriteRuleTokenStream stream_NATURAL=new RewriteRuleTokenStream(adaptor,"token NATURAL");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// DBL.g:829:3: ( NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) )
			// DBL.g:829:5: NATURAL (t= join_type )? JOIN r= table_primary
			{
			NATURAL283=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_natural_join6815); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NATURAL.add(NATURAL283);

			// DBL.g:829:13: (t= join_type )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==FULL||LA99_0==INNER||LA99_0==LEFT||LA99_0==RIGHT) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// DBL.g:829:14: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_natural_join6820);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN284=(Token)match(input,JOIN,FOLLOW_JOIN_in_natural_join6824); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN284);

			pushFollow(FOLLOW_table_primary_in_natural_join6828);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: t, NATURAL, r, JOIN
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
			// 829:49: -> ^( JOIN NATURAL ( $t)? $r)
			{
				// DBL.g:829:52: ^( JOIN NATURAL ( $t)? $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_NATURAL.nextNode());
				// DBL.g:829:68: ( $t)?
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
			if ( state.backtracking>0 ) { memoize(input, 84, natural_join_StartIndex); }

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
	// DBL.g:831:1: union_join : UNION JOIN r= table_primary -> ^( JOIN UNION $r) ;
	public final DBLParser.union_join_return union_join() throws RecognitionException {
		DBLParser.union_join_return retval = new DBLParser.union_join_return();
		retval.start = input.LT(1);
		int union_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token UNION285=null;
		Token JOIN286=null;
		ParserRuleReturnScope r =null;

		CommonTree UNION285_tree=null;
		CommonTree JOIN286_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// DBL.g:832:3: ( UNION JOIN r= table_primary -> ^( JOIN UNION $r) )
			// DBL.g:832:5: UNION JOIN r= table_primary
			{
			UNION285=(Token)match(input,UNION,FOLLOW_UNION_in_union_join6855); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNION.add(UNION285);

			JOIN286=(Token)match(input,JOIN,FOLLOW_JOIN_in_union_join6857); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN286);

			pushFollow(FOLLOW_table_primary_in_union_join6861);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			// AST REWRITE
			// elements: r, JOIN, UNION
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
			// 832:32: -> ^( JOIN UNION $r)
			{
				// DBL.g:832:35: ^( JOIN UNION $r)
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
			if ( state.backtracking>0 ) { memoize(input, 85, union_join_StartIndex); }

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
	// DBL.g:834:1: join_type : ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) );
	public final DBLParser.join_type_return join_type() throws RecognitionException {
		DBLParser.join_type_return retval = new DBLParser.join_type_return();
		retval.start = input.LT(1);
		int join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INNER287=null;
		Token OUTER288=null;
		ParserRuleReturnScope t =null;

		CommonTree INNER287_tree=null;
		CommonTree OUTER288_tree=null;
		RewriteRuleTokenStream stream_OUTER=new RewriteRuleTokenStream(adaptor,"token OUTER");
		RewriteRuleSubtreeStream stream_outer_join_type=new RewriteRuleSubtreeStream(adaptor,"rule outer_join_type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// DBL.g:835:3: ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) )
			int alt100=3;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==INNER) ) {
				alt100=1;
			}
			else if ( (LA100_0==FULL||LA100_0==LEFT||LA100_0==RIGHT) ) {
				int LA100_2 = input.LA(2);
				if ( (LA100_2==OUTER) ) {
					alt100=2;
				}
				else if ( (LA100_2==EOF||LA100_2==JOIN) ) {
					alt100=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 100, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// DBL.g:835:5: INNER
					{
					root_0 = (CommonTree)adaptor.nil();


					INNER287=(Token)match(input,INNER,FOLLOW_INNER_in_join_type6884); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INNER287_tree = (CommonTree)adaptor.create(INNER287);
					adaptor.addChild(root_0, INNER287_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:836:5: t= outer_join_type OUTER
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type6892);
					t=outer_join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_outer_join_type.add(t.getTree());
					OUTER288=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_type6894); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OUTER.add(OUTER288);

					// AST REWRITE
					// elements: OUTER, t
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
					// 836:29: -> ^( OUTER $t)
					{
						// DBL.g:836:32: ^( OUTER $t)
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
					// DBL.g:837:5: t= outer_join_type
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type6911);
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
					// 837:23: -> ^( OUTER $t)
					{
						// DBL.g:837:26: ^( OUTER $t)
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
			if ( state.backtracking>0 ) { memoize(input, 86, join_type_StartIndex); }

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
	// DBL.g:839:1: outer_join_type : ( LEFT | RIGHT | FULL );
	public final DBLParser.outer_join_type_return outer_join_type() throws RecognitionException {
		DBLParser.outer_join_type_return retval = new DBLParser.outer_join_type_return();
		retval.start = input.LT(1);
		int outer_join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set289=null;

		CommonTree set289_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// DBL.g:840:3: ( LEFT | RIGHT | FULL )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set289=input.LT(1);
			if ( input.LA(1)==FULL||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set289));
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
			if ( state.backtracking>0 ) { memoize(input, 87, outer_join_type_StartIndex); }

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
	// DBL.g:844:1: join_specification : ( join_condition | named_columns_join );
	public final DBLParser.join_specification_return join_specification() throws RecognitionException {
		DBLParser.join_specification_return retval = new DBLParser.join_specification_return();
		retval.start = input.LT(1);
		int join_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope join_condition290 =null;
		ParserRuleReturnScope named_columns_join291 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// DBL.g:845:3: ( join_condition | named_columns_join )
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==ON) ) {
				alt101=1;
			}
			else if ( (LA101_0==USING) ) {
				alt101=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}

			switch (alt101) {
				case 1 :
					// DBL.g:845:5: join_condition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_join_condition_in_join_specification6956);
					join_condition290=join_condition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, join_condition290.getTree());

					}
					break;
				case 2 :
					// DBL.g:846:5: named_columns_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_named_columns_join_in_join_specification6962);
					named_columns_join291=named_columns_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, named_columns_join291.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 88, join_specification_StartIndex); }

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
	// DBL.g:848:1: join_condition : ON ^ search_condition ;
	public final DBLParser.join_condition_return join_condition() throws RecognitionException {
		DBLParser.join_condition_return retval = new DBLParser.join_condition_return();
		retval.start = input.LT(1);
		int join_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ON292=null;
		ParserRuleReturnScope search_condition293 =null;

		CommonTree ON292_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// DBL.g:849:3: ( ON ^ search_condition )
			// DBL.g:849:5: ON ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			ON292=(Token)match(input,ON,FOLLOW_ON_in_join_condition6974); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ON292_tree = (CommonTree)adaptor.create(ON292);
			root_0 = (CommonTree)adaptor.becomeRoot(ON292_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_join_condition6977);
			search_condition293=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition293.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 89, join_condition_StartIndex); }

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
	// DBL.g:851:1: named_columns_join : USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) ;
	public final DBLParser.named_columns_join_return named_columns_join() throws RecognitionException {
		DBLParser.named_columns_join_return retval = new DBLParser.named_columns_join_return();
		retval.start = input.LT(1);
		int named_columns_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token USING294=null;
		Token LEFT_PAREN295=null;
		Token RIGHT_PAREN296=null;
		ParserRuleReturnScope f =null;

		CommonTree USING294_tree=null;
		CommonTree LEFT_PAREN295_tree=null;
		CommonTree RIGHT_PAREN296_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleSubtreeStream stream_column_reference_list=new RewriteRuleSubtreeStream(adaptor,"rule column_reference_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// DBL.g:852:3: ( USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) )
			// DBL.g:852:5: USING LEFT_PAREN f= column_reference_list RIGHT_PAREN
			{
			USING294=(Token)match(input,USING,FOLLOW_USING_in_named_columns_join6989); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING294);

			LEFT_PAREN295=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_named_columns_join6991); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN295);

			pushFollow(FOLLOW_column_reference_list_in_named_columns_join6995);
			f=column_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference_list.add(f.getTree());
			RIGHT_PAREN296=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_named_columns_join6997); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN296);

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
			// 852:58: -> ^( USING $f)
			{
				// DBL.g:852:61: ^( USING $f)
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
			if ( state.backtracking>0 ) { memoize(input, 90, named_columns_join_StartIndex); }

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
	// DBL.g:854:1: table_primary : table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) ;
	public final DBLParser.table_primary_return table_primary() throws RecognitionException {
		DBLParser.table_primary_return retval = new DBLParser.table_primary_return();
		retval.start = input.LT(1);
		int table_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token a=null;
		Token AS298=null;
		ParserRuleReturnScope table297 =null;

		CommonTree a_tree=null;
		CommonTree AS298_tree=null;
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// DBL.g:855:3: ( table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) )
			// DBL.g:855:5: table ( ( AS )? a= Identifier )?
			{
			pushFollow(FOLLOW_table_in_table_primary7018);
			table297=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(table297.getTree());
			// DBL.g:855:11: ( ( AS )? a= Identifier )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==AS||LA103_0==Identifier) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// DBL.g:855:12: ( AS )? a= Identifier
					{
					// DBL.g:855:12: ( AS )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==AS) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// DBL.g:855:13: AS
							{
							AS298=(Token)match(input,AS,FOLLOW_AS_in_table_primary7022); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AS.add(AS298);

							}
							break;

					}

					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_table_primary7028); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(a);

					}
					break;

			}

			// AST REWRITE
			// elements: a, table
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
			// 855:33: -> ^( TABLE table ( $a)? )
			{
				// DBL.g:855:36: ^( TABLE table ( $a)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE, "TABLE"), root_1);
				adaptor.addChild(root_1, stream_table.nextTree());
				// DBL.g:855:50: ( $a)?
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
			if ( state.backtracking>0 ) { memoize(input, 91, table_primary_StartIndex); }

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
	// DBL.g:857:1: where_clause : WHERE ^ search_condition ;
	public final DBLParser.where_clause_return where_clause() throws RecognitionException {
		DBLParser.where_clause_return retval = new DBLParser.where_clause_return();
		retval.start = input.LT(1);
		int where_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHERE299=null;
		ParserRuleReturnScope search_condition300 =null;

		CommonTree WHERE299_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// DBL.g:858:3: ( WHERE ^ search_condition )
			// DBL.g:858:5: WHERE ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			WHERE299=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause7056); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHERE299_tree = (CommonTree)adaptor.create(WHERE299);
			root_0 = (CommonTree)adaptor.becomeRoot(WHERE299_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_where_clause7059);
			search_condition300=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition300.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 92, where_clause_StartIndex); }

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
	// DBL.g:866:1: routine_invocation : ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) );
	public final DBLParser.routine_invocation_return routine_invocation() throws RecognitionException {
		DBLParser.routine_invocation_return retval = new DBLParser.routine_invocation_return();
		retval.start = input.LT(1);
		int routine_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier301=null;
		Token LEFT_PAREN302=null;
		Token RIGHT_PAREN304=null;
		Token COUNT305=null;
		Token LEFT_PAREN306=null;
		Token RIGHT_PAREN308=null;
		Token COUNT309=null;
		Token LEFT_PAREN310=null;
		Token MULTIPLY311=null;
		Token RIGHT_PAREN312=null;
		ParserRuleReturnScope funcArgs303 =null;
		ParserRuleReturnScope funcArgs307 =null;

		CommonTree Identifier301_tree=null;
		CommonTree LEFT_PAREN302_tree=null;
		CommonTree RIGHT_PAREN304_tree=null;
		CommonTree COUNT305_tree=null;
		CommonTree LEFT_PAREN306_tree=null;
		CommonTree RIGHT_PAREN308_tree=null;
		CommonTree COUNT309_tree=null;
		CommonTree LEFT_PAREN310_tree=null;
		CommonTree MULTIPLY311_tree=null;
		CommonTree RIGHT_PAREN312_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_funcArgs=new RewriteRuleSubtreeStream(adaptor,"rule funcArgs");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// DBL.g:867:2: ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) )
			int alt105=3;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==Identifier) ) {
				alt105=1;
			}
			else if ( (LA105_0==COUNT) ) {
				int LA105_2 = input.LA(2);
				if ( (LA105_2==LEFT_PAREN) ) {
					int LA105_3 = input.LA(3);
					if ( (LA105_3==MULTIPLY) ) {
						alt105=3;
					}
					else if ( (LA105_3==CASE||LA105_3==COUNT||LA105_3==Character_String_Literal||LA105_3==Identifier||LA105_3==LEFT_PAREN||LA105_3==MINUS||LA105_3==NOT||LA105_3==NULL||LA105_3==NUMBER||LA105_3==PLUS||LA105_3==REAL_NUMBER) ) {
						alt105=2;
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

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 2, input);
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
					// DBL.g:867:4: Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN
					{
					Identifier301=(Token)match(input,Identifier,FOLLOW_Identifier_in_routine_invocation7072); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier301);

					LEFT_PAREN302=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7074); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN302);

					// DBL.g:867:26: ( funcArgs )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==CASE||LA104_0==COUNT||LA104_0==Character_String_Literal||LA104_0==Identifier||LA104_0==LEFT_PAREN||LA104_0==MINUS||LA104_0==NOT||LA104_0==NULL||LA104_0==NUMBER||LA104_0==PLUS||LA104_0==REAL_NUMBER) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// DBL.g:867:26: funcArgs
							{
							pushFollow(FOLLOW_funcArgs_in_routine_invocation7076);
							funcArgs303=funcArgs();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs303.getTree());
							}
							break;

					}

					RIGHT_PAREN304=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7079); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN304);

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
					// 867:48: -> ^( FUNCTION[$Identifier.text] ( funcArgs )? )
					{
						// DBL.g:867:51: ^( FUNCTION[$Identifier.text] ( funcArgs )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, (Identifier301!=null?Identifier301.getText():null)), root_1);
						// DBL.g:867:80: ( funcArgs )?
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
					// DBL.g:868:4: COUNT LEFT_PAREN funcArgs RIGHT_PAREN
					{
					COUNT305=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation7094); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT305);

					LEFT_PAREN306=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7096); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN306);

					pushFollow(FOLLOW_funcArgs_in_routine_invocation7098);
					funcArgs307=funcArgs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs307.getTree());
					RIGHT_PAREN308=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7100); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN308);

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
					// 868:42: -> ^( COUNT_VAL funcArgs )
					{
						// DBL.g:868:45: ^( COUNT_VAL funcArgs )
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
					// DBL.g:869:4: COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN
					{
					COUNT309=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation7113); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT309);

					LEFT_PAREN310=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7115); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN310);

					MULTIPLY311=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_routine_invocation7117); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY311);

					RIGHT_PAREN312=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7119); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN312);

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
					// 869:42: -> ^( COUNT_ROWS )
					{
						// DBL.g:869:45: ^( COUNT_ROWS )
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
			if ( state.backtracking>0 ) { memoize(input, 93, routine_invocation_StartIndex); }

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
	// DBL.g:871:1: funcArgs : boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ ;
	public final DBLParser.funcArgs_return funcArgs() throws RecognitionException {
		DBLParser.funcArgs_return retval = new DBLParser.funcArgs_return();
		retval.start = input.LT(1);
		int funcArgs_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA314=null;
		ParserRuleReturnScope boolean_value_expression313 =null;
		ParserRuleReturnScope boolean_value_expression315 =null;

		CommonTree COMMA314_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// DBL.g:872:3: ( boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ )
			// DBL.g:872:5: boolean_value_expression ( COMMA boolean_value_expression )*
			{
			pushFollow(FOLLOW_boolean_value_expression_in_funcArgs7136);
			boolean_value_expression313=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression313.getTree());
			// DBL.g:872:30: ( COMMA boolean_value_expression )*
			loop106:
			while (true) {
				int alt106=2;
				int LA106_0 = input.LA(1);
				if ( (LA106_0==COMMA) ) {
					alt106=1;
				}

				switch (alt106) {
				case 1 :
					// DBL.g:872:31: COMMA boolean_value_expression
					{
					COMMA314=(Token)match(input,COMMA,FOLLOW_COMMA_in_funcArgs7139); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA314);

					pushFollow(FOLLOW_boolean_value_expression_in_funcArgs7141);
					boolean_value_expression315=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression315.getTree());
					}
					break;

				default :
					break loop106;
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
			// 872:64: -> ( boolean_value_expression )+
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
			if ( state.backtracking>0 ) { memoize(input, 94, funcArgs_StartIndex); }

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
	// DBL.g:879:1: groupby_clause : GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) ;
	public final DBLParser.groupby_clause_return groupby_clause() throws RecognitionException {
		DBLParser.groupby_clause_return retval = new DBLParser.groupby_clause_return();
		retval.start = input.LT(1);
		int groupby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token GROUP316=null;
		Token BY317=null;
		ParserRuleReturnScope g =null;

		CommonTree GROUP316_tree=null;
		CommonTree BY317_tree=null;
		RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleSubtreeStream stream_grouping_element_list=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// DBL.g:880:3: ( GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) )
			// DBL.g:880:5: GROUP BY g= grouping_element_list
			{
			GROUP316=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupby_clause7162); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_GROUP.add(GROUP316);

			BY317=(Token)match(input,BY,FOLLOW_BY_in_groupby_clause7164); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY317);

			pushFollow(FOLLOW_grouping_element_list_in_groupby_clause7168);
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
			// 880:38: -> ^( GROUP_BY $g)
			{
				// DBL.g:880:41: ^( GROUP_BY $g)
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
			if ( state.backtracking>0 ) { memoize(input, 95, groupby_clause_StartIndex); }

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
	// DBL.g:882:1: grouping_element_list : grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ ;
	public final DBLParser.grouping_element_list_return grouping_element_list() throws RecognitionException {
		DBLParser.grouping_element_list_return retval = new DBLParser.grouping_element_list_return();
		retval.start = input.LT(1);
		int grouping_element_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA319=null;
		ParserRuleReturnScope grouping_element318 =null;
		ParserRuleReturnScope grouping_element320 =null;

		CommonTree COMMA319_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_grouping_element=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// DBL.g:883:3: ( grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ )
			// DBL.g:883:5: grouping_element ( COMMA grouping_element )*
			{
			pushFollow(FOLLOW_grouping_element_in_grouping_element_list7189);
			grouping_element318=grouping_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element318.getTree());
			// DBL.g:883:22: ( COMMA grouping_element )*
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==COMMA) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// DBL.g:883:23: COMMA grouping_element
					{
					COMMA319=(Token)match(input,COMMA,FOLLOW_COMMA_in_grouping_element_list7192); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA319);

					pushFollow(FOLLOW_grouping_element_in_grouping_element_list7194);
					grouping_element320=grouping_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element320.getTree());
					}
					break;

				default :
					break loop107;
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
			// 883:48: -> ( grouping_element )+
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
			if ( state.backtracking>0 ) { memoize(input, 96, grouping_element_list_StartIndex); }

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
	// DBL.g:885:1: grouping_element : ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set );
	public final DBLParser.grouping_element_return grouping_element() throws RecognitionException {
		DBLParser.grouping_element_return retval = new DBLParser.grouping_element_return();
		retval.start = input.LT(1);
		int grouping_element_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ordinary_grouping_set321 =null;
		ParserRuleReturnScope rollup_list322 =null;
		ParserRuleReturnScope cube_list323 =null;
		ParserRuleReturnScope empty_grouping_set324 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// DBL.g:886:3: ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set )
			int alt108=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt108=1;
				}
				break;
			case LEFT_PAREN:
				{
				int LA108_2 = input.LA(2);
				if ( (LA108_2==RIGHT_PAREN) ) {
					alt108=4;
				}
				else if ( (LA108_2==Identifier) ) {
					alt108=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 108, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ROLLUP:
				{
				alt108=2;
				}
				break;
			case CUBE:
				{
				alt108=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}
			switch (alt108) {
				case 1 :
					// DBL.g:886:5: ordinary_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ordinary_grouping_set_in_grouping_element7213);
					ordinary_grouping_set321=ordinary_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ordinary_grouping_set321.getTree());

					}
					break;
				case 2 :
					// DBL.g:887:5: rollup_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rollup_list_in_grouping_element7219);
					rollup_list322=rollup_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rollup_list322.getTree());

					}
					break;
				case 3 :
					// DBL.g:888:5: cube_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cube_list_in_grouping_element7225);
					cube_list323=cube_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cube_list323.getTree());

					}
					break;
				case 4 :
					// DBL.g:889:5: empty_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_empty_grouping_set_in_grouping_element7231);
					empty_grouping_set324=empty_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, empty_grouping_set324.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 97, grouping_element_StartIndex); }

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
	// DBL.g:891:1: ordinary_grouping_set : ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !);
	public final DBLParser.ordinary_grouping_set_return ordinary_grouping_set() throws RecognitionException {
		DBLParser.ordinary_grouping_set_return retval = new DBLParser.ordinary_grouping_set_return();
		retval.start = input.LT(1);
		int ordinary_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN326=null;
		Token RIGHT_PAREN328=null;
		ParserRuleReturnScope column_reference_list325 =null;
		ParserRuleReturnScope column_reference_list327 =null;

		CommonTree LEFT_PAREN326_tree=null;
		CommonTree RIGHT_PAREN328_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// DBL.g:892:3: ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !)
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==Identifier) ) {
				alt109=1;
			}
			else if ( (LA109_0==LEFT_PAREN) ) {
				alt109=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}

			switch (alt109) {
				case 1 :
					// DBL.g:892:5: column_reference_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set7243);
					column_reference_list325=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list325.getTree());

					}
					break;
				case 2 :
					// DBL.g:893:5: LEFT_PAREN ! column_reference_list RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN326=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_ordinary_grouping_set7249); if (state.failed) return retval;
					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set7252);
					column_reference_list327=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list327.getTree());

					RIGHT_PAREN328=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set7254); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 98, ordinary_grouping_set_StartIndex); }

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
	// DBL.g:895:1: rollup_list : ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) ;
	public final DBLParser.rollup_list_return rollup_list() throws RecognitionException {
		DBLParser.rollup_list_return retval = new DBLParser.rollup_list_return();
		retval.start = input.LT(1);
		int rollup_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ROLLUP329=null;
		Token LEFT_PAREN330=null;
		Token RIGHT_PAREN331=null;
		ParserRuleReturnScope c =null;

		CommonTree ROLLUP329_tree=null;
		CommonTree LEFT_PAREN330_tree=null;
		CommonTree RIGHT_PAREN331_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_ROLLUP=new RewriteRuleTokenStream(adaptor,"token ROLLUP");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// DBL.g:896:3: ( ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) )
			// DBL.g:896:5: ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			ROLLUP329=(Token)match(input,ROLLUP,FOLLOW_ROLLUP_in_rollup_list7267); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROLLUP.add(ROLLUP329);

			LEFT_PAREN330=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_rollup_list7269); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN330);

			pushFollow(FOLLOW_ordinary_grouping_set_in_rollup_list7273);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN331=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_rollup_list7275); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN331);

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
			// 896:59: -> ^( ROLLUP $c)
			{
				// DBL.g:896:62: ^( ROLLUP $c)
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
			if ( state.backtracking>0 ) { memoize(input, 99, rollup_list_StartIndex); }

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
	// DBL.g:898:1: cube_list : CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) ;
	public final DBLParser.cube_list_return cube_list() throws RecognitionException {
		DBLParser.cube_list_return retval = new DBLParser.cube_list_return();
		retval.start = input.LT(1);
		int cube_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CUBE332=null;
		Token LEFT_PAREN333=null;
		Token RIGHT_PAREN334=null;
		ParserRuleReturnScope c =null;

		CommonTree CUBE332_tree=null;
		CommonTree LEFT_PAREN333_tree=null;
		CommonTree RIGHT_PAREN334_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_CUBE=new RewriteRuleTokenStream(adaptor,"token CUBE");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// DBL.g:899:3: ( CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) )
			// DBL.g:899:5: CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			CUBE332=(Token)match(input,CUBE,FOLLOW_CUBE_in_cube_list7296); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CUBE.add(CUBE332);

			LEFT_PAREN333=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cube_list7298); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN333);

			pushFollow(FOLLOW_ordinary_grouping_set_in_cube_list7302);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN334=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cube_list7304); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN334);

			// AST REWRITE
			// elements: CUBE, c
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
			// 899:57: -> ^( CUBE $c)
			{
				// DBL.g:899:60: ^( CUBE $c)
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
			if ( state.backtracking>0 ) { memoize(input, 100, cube_list_StartIndex); }

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
	// DBL.g:901:1: empty_grouping_set : LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) ;
	public final DBLParser.empty_grouping_set_return empty_grouping_set() throws RecognitionException {
		DBLParser.empty_grouping_set_return retval = new DBLParser.empty_grouping_set_return();
		retval.start = input.LT(1);
		int empty_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN335=null;
		Token RIGHT_PAREN336=null;

		CommonTree LEFT_PAREN335_tree=null;
		CommonTree RIGHT_PAREN336_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// DBL.g:902:3: ( LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) )
			// DBL.g:902:5: LEFT_PAREN RIGHT_PAREN
			{
			LEFT_PAREN335=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_empty_grouping_set7325); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN335);

			RIGHT_PAREN336=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_empty_grouping_set7327); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN336);

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
			// 902:28: -> ^( EMPTY_GROUPING_SET )
			{
				// DBL.g:902:31: ^( EMPTY_GROUPING_SET )
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
			if ( state.backtracking>0 ) { memoize(input, 101, empty_grouping_set_StartIndex); }

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
	// DBL.g:904:1: having_clause : HAVING ^ boolean_value_expression ;
	public final DBLParser.having_clause_return having_clause() throws RecognitionException {
		DBLParser.having_clause_return retval = new DBLParser.having_clause_return();
		retval.start = input.LT(1);
		int having_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token HAVING337=null;
		ParserRuleReturnScope boolean_value_expression338 =null;

		CommonTree HAVING337_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// DBL.g:905:3: ( HAVING ^ boolean_value_expression )
			// DBL.g:905:5: HAVING ^ boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			HAVING337=(Token)match(input,HAVING,FOLLOW_HAVING_in_having_clause7345); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			HAVING337_tree = (CommonTree)adaptor.create(HAVING337);
			root_0 = (CommonTree)adaptor.becomeRoot(HAVING337_tree, root_0);
			}

			pushFollow(FOLLOW_boolean_value_expression_in_having_clause7348);
			boolean_value_expression338=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression338.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 102, having_clause_StartIndex); }

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
	// DBL.g:913:1: orderby_clause : ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) ;
	public final DBLParser.orderby_clause_return orderby_clause() throws RecognitionException {
		DBLParser.orderby_clause_return retval = new DBLParser.orderby_clause_return();
		retval.start = input.LT(1);
		int orderby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ORDER339=null;
		Token BY340=null;
		ParserRuleReturnScope sort_specifier_list341 =null;

		CommonTree ORDER339_tree=null;
		CommonTree BY340_tree=null;
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
		RewriteRuleSubtreeStream stream_sort_specifier_list=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// DBL.g:914:3: ( ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) )
			// DBL.g:914:5: ORDER BY sort_specifier_list
			{
			ORDER339=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderby_clause7362); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ORDER.add(ORDER339);

			BY340=(Token)match(input,BY,FOLLOW_BY_in_orderby_clause7364); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY340);

			pushFollow(FOLLOW_sort_specifier_list_in_orderby_clause7366);
			sort_specifier_list341=sort_specifier_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier_list.add(sort_specifier_list341.getTree());
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
			// 914:34: -> ^( ORDER_BY sort_specifier_list )
			{
				// DBL.g:914:37: ^( ORDER_BY sort_specifier_list )
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
			if ( state.backtracking>0 ) { memoize(input, 103, orderby_clause_StartIndex); }

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
	// DBL.g:916:1: sort_specifier_list : sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) ;
	public final DBLParser.sort_specifier_list_return sort_specifier_list() throws RecognitionException {
		DBLParser.sort_specifier_list_return retval = new DBLParser.sort_specifier_list_return();
		retval.start = input.LT(1);
		int sort_specifier_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA343=null;
		ParserRuleReturnScope sort_specifier342 =null;
		ParserRuleReturnScope sort_specifier344 =null;

		CommonTree COMMA343_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_sort_specifier=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// DBL.g:917:3: ( sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) )
			// DBL.g:917:5: sort_specifier ( COMMA sort_specifier )*
			{
			pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list7386);
			sort_specifier342=sort_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier342.getTree());
			// DBL.g:917:20: ( COMMA sort_specifier )*
			loop110:
			while (true) {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==COMMA) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// DBL.g:917:21: COMMA sort_specifier
					{
					COMMA343=(Token)match(input,COMMA,FOLLOW_COMMA_in_sort_specifier_list7389); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA343);

					pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list7391);
					sort_specifier344=sort_specifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier344.getTree());
					}
					break;

				default :
					break loop110;
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
			// 917:44: -> ^( SORT_SPECIFIERS ( sort_specifier )+ )
			{
				// DBL.g:917:47: ^( SORT_SPECIFIERS ( sort_specifier )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 104, sort_specifier_list_StartIndex); }

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
	// DBL.g:919:1: sort_specifier : fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) ;
	public final DBLParser.sort_specifier_return sort_specifier() throws RecognitionException {
		DBLParser.sort_specifier_return retval = new DBLParser.sort_specifier_return();
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// DBL.g:920:3: (fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) )
			// DBL.g:920:5: fn= column_reference (a= order_specification )? (o= null_ordering )?
			{
			pushFollow(FOLLOW_column_reference_in_sort_specifier7416);
			fn=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(fn.getTree());
			// DBL.g:920:26: (a= order_specification )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==ASC||LA111_0==DESC) ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// DBL.g:920:26: a= order_specification
					{
					pushFollow(FOLLOW_order_specification_in_sort_specifier7420);
					a=order_specification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_order_specification.add(a.getTree());
					}
					break;

			}

			// DBL.g:920:49: (o= null_ordering )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==NULL) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// DBL.g:920:49: o= null_ordering
					{
					pushFollow(FOLLOW_null_ordering_in_sort_specifier7425);
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
			// 920:65: -> ^( SORT_KEY $fn ( $a)? ( $o)? )
			{
				// DBL.g:920:68: ^( SORT_KEY $fn ( $a)? ( $o)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SORT_KEY, "SORT_KEY"), root_1);
				adaptor.addChild(root_1, stream_fn.nextTree());
				// DBL.g:920:84: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// DBL.g:920:88: ( $o)?
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
			if ( state.backtracking>0 ) { memoize(input, 105, sort_specifier_StartIndex); }

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
	// DBL.g:922:1: order_specification : ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) );
	public final DBLParser.order_specification_return order_specification() throws RecognitionException {
		DBLParser.order_specification_return retval = new DBLParser.order_specification_return();
		retval.start = input.LT(1);
		int order_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ASC345=null;
		Token DESC346=null;

		CommonTree ASC345_tree=null;
		CommonTree DESC346_tree=null;
		RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
		RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// DBL.g:923:3: ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) )
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==ASC) ) {
				alt113=1;
			}
			else if ( (LA113_0==DESC) ) {
				alt113=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 113, 0, input);
				throw nvae;
			}

			switch (alt113) {
				case 1 :
					// DBL.g:923:5: ASC
					{
					ASC345=(Token)match(input,ASC,FOLLOW_ASC_in_order_specification7455); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASC.add(ASC345);

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
					// 923:9: -> ^( ORDER ASC )
					{
						// DBL.g:923:12: ^( ORDER ASC )
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
					// DBL.g:924:5: DESC
					{
					DESC346=(Token)match(input,DESC,FOLLOW_DESC_in_order_specification7469); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESC.add(DESC346);

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
					// 924:10: -> ^( ORDER DESC )
					{
						// DBL.g:924:13: ^( ORDER DESC )
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
			if ( state.backtracking>0 ) { memoize(input, 106, order_specification_StartIndex); }

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
	// DBL.g:926:1: limit_clause : LIMIT e= numeric_value_expression -> ^( LIMIT $e) ;
	public final DBLParser.limit_clause_return limit_clause() throws RecognitionException {
		DBLParser.limit_clause_return retval = new DBLParser.limit_clause_return();
		retval.start = input.LT(1);
		int limit_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LIMIT347=null;
		ParserRuleReturnScope e =null;

		CommonTree LIMIT347_tree=null;
		RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// DBL.g:927:3: ( LIMIT e= numeric_value_expression -> ^( LIMIT $e) )
			// DBL.g:927:5: LIMIT e= numeric_value_expression
			{
			LIMIT347=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limit_clause7489); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIMIT.add(LIMIT347);

			pushFollow(FOLLOW_numeric_value_expression_in_limit_clause7493);
			e=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(e.getTree());
			// AST REWRITE
			// elements: LIMIT, e
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
			// 927:38: -> ^( LIMIT $e)
			{
				// DBL.g:927:41: ^( LIMIT $e)
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
			if ( state.backtracking>0 ) { memoize(input, 107, limit_clause_StartIndex); }

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
	// DBL.g:929:1: null_ordering : ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) );
	public final DBLParser.null_ordering_return null_ordering() throws RecognitionException {
		DBLParser.null_ordering_return retval = new DBLParser.null_ordering_return();
		retval.start = input.LT(1);
		int null_ordering_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL348=null;
		Token FIRST349=null;
		Token NULL350=null;
		Token LAST351=null;

		CommonTree NULL348_tree=null;
		CommonTree FIRST349_tree=null;
		CommonTree NULL350_tree=null;
		CommonTree LAST351_tree=null;
		RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// DBL.g:930:3: ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) )
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==NULL) ) {
				int LA114_1 = input.LA(2);
				if ( (LA114_1==FIRST) ) {
					alt114=1;
				}
				else if ( (LA114_1==LAST) ) {
					alt114=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 114, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}

			switch (alt114) {
				case 1 :
					// DBL.g:930:5: NULL FIRST
					{
					NULL348=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering7514); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL348);

					FIRST349=(Token)match(input,FIRST,FOLLOW_FIRST_in_null_ordering7516); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIRST.add(FIRST349);

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
					// 930:16: -> ^( NULL_ORDER FIRST )
					{
						// DBL.g:930:19: ^( NULL_ORDER FIRST )
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
					// DBL.g:931:5: NULL LAST
					{
					NULL350=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering7530); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL350);

					LAST351=(Token)match(input,LAST,FOLLOW_LAST_in_null_ordering7532); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LAST.add(LAST351);

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
					// 931:15: -> ^( NULL_ORDER LAST )
					{
						// DBL.g:931:18: ^( NULL_ORDER LAST )
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
			if ( state.backtracking>0 ) { memoize(input, 108, null_ordering_StartIndex); }

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
	// DBL.g:940:1: search_condition : boolean_value_expression ;
	public final DBLParser.search_condition_return search_condition() throws RecognitionException {
		DBLParser.search_condition_return retval = new DBLParser.search_condition_return();
		retval.start = input.LT(1);
		int search_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression352 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// DBL.g:941:2: ( boolean_value_expression )
			// DBL.g:941:4: boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_value_expression_in_search_condition7554);
			boolean_value_expression352=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression352.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 109, search_condition_StartIndex); }

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
	// DBL.g:943:1: param_clause : WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) ;
	public final DBLParser.param_clause_return param_clause() throws RecognitionException {
		DBLParser.param_clause_return retval = new DBLParser.param_clause_return();
		retval.start = input.LT(1);
		int param_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH353=null;
		Token LEFT_PAREN354=null;
		Token COMMA356=null;
		Token RIGHT_PAREN358=null;
		ParserRuleReturnScope param355 =null;
		ParserRuleReturnScope param357 =null;

		CommonTree WITH353_tree=null;
		CommonTree LEFT_PAREN354_tree=null;
		CommonTree COMMA356_tree=null;
		CommonTree RIGHT_PAREN358_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// DBL.g:944:3: ( WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) )
			// DBL.g:944:5: WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN
			{
			WITH353=(Token)match(input,WITH,FOLLOW_WITH_in_param_clause7565); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH353);

			LEFT_PAREN354=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_param_clause7567); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN354);

			pushFollow(FOLLOW_param_in_param_clause7569);
			param355=param();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_param.add(param355.getTree());
			// DBL.g:944:27: ( COMMA param )*
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==COMMA) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// DBL.g:944:28: COMMA param
					{
					COMMA356=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_clause7572); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA356);

					pushFollow(FOLLOW_param_in_param_clause7574);
					param357=param();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_param.add(param357.getTree());
					}
					break;

				default :
					break loop115;
				}
			}

			RIGHT_PAREN358=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_param_clause7578); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN358);

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
			// 944:54: -> ^( PARAMS ( param )+ )
			{
				// DBL.g:944:57: ^( PARAMS ( param )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 110, param_clause_StartIndex); }

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
	// DBL.g:946:1: param : k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) ;
	public final DBLParser.param_return param() throws RecognitionException {
		DBLParser.param_return retval = new DBLParser.param_return();
		retval.start = input.LT(1);
		int param_StartIndex = input.index();

		CommonTree root_0 = null;

		Token k=null;
		Token EQUAL359=null;
		ParserRuleReturnScope v =null;

		CommonTree k_tree=null;
		CommonTree EQUAL359_tree=null;
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// DBL.g:947:3: (k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) )
			// DBL.g:947:5: k= Character_String_Literal EQUAL v= numeric_value_expression
			{
			k=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_param7601); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_String_Literal.add(k);

			EQUAL359=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_param7603); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL359);

			pushFollow(FOLLOW_numeric_value_expression_in_param7607);
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
			// 947:65: -> ^( PARAM $k $v)
			{
				// DBL.g:947:68: ^( PARAM $k $v)
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
			if ( state.backtracking>0 ) { memoize(input, 111, param_StartIndex); }

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
	// DBL.g:949:1: method_specifier : USING m= Identifier -> ^( USING[$m.text] ) ;
	public final DBLParser.method_specifier_return method_specifier() throws RecognitionException {
		DBLParser.method_specifier_return retval = new DBLParser.method_specifier_return();
		retval.start = input.LT(1);
		int method_specifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token m=null;
		Token USING360=null;

		CommonTree m_tree=null;
		CommonTree USING360_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// DBL.g:950:3: ( USING m= Identifier -> ^( USING[$m.text] ) )
			// DBL.g:950:5: USING m= Identifier
			{
			USING360=(Token)match(input,USING,FOLLOW_USING_in_method_specifier7631); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING360);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_method_specifier7635); if (state.failed) return retval; 
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
			// 950:24: -> ^( USING[$m.text] )
			{
				// DBL.g:950:27: ^( USING[$m.text] )
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
			if ( state.backtracking>0 ) { memoize(input, 112, method_specifier_StartIndex); }

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
	// DBL.g:957:1: boolean_value_expression : and_predicate ( OR ^ and_predicate )* ;
	public final DBLParser.boolean_value_expression_return boolean_value_expression() throws RecognitionException {
		DBLParser.boolean_value_expression_return retval = new DBLParser.boolean_value_expression_return();
		retval.start = input.LT(1);
		int boolean_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OR362=null;
		ParserRuleReturnScope and_predicate361 =null;
		ParserRuleReturnScope and_predicate363 =null;

		CommonTree OR362_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

			// DBL.g:958:2: ( and_predicate ( OR ^ and_predicate )* )
			// DBL.g:958:4: and_predicate ( OR ^ and_predicate )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_and_predicate_in_boolean_value_expression7655);
			and_predicate361=and_predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate361.getTree());

			// DBL.g:958:18: ( OR ^ and_predicate )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==OR) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// DBL.g:958:19: OR ^ and_predicate
					{
					OR362=(Token)match(input,OR,FOLLOW_OR_in_boolean_value_expression7658); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR362_tree = (CommonTree)adaptor.create(OR362);
					root_0 = (CommonTree)adaptor.becomeRoot(OR362_tree, root_0);
					}

					pushFollow(FOLLOW_and_predicate_in_boolean_value_expression7661);
					and_predicate363=and_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate363.getTree());

					}
					break;

				default :
					break loop116;
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
			if ( state.backtracking>0 ) { memoize(input, 113, boolean_value_expression_StartIndex); }

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
	// DBL.g:960:1: and_predicate : boolean_factor ( AND ^ boolean_factor )* ;
	public final DBLParser.and_predicate_return and_predicate() throws RecognitionException {
		DBLParser.and_predicate_return retval = new DBLParser.and_predicate_return();
		retval.start = input.LT(1);
		int and_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AND365=null;
		ParserRuleReturnScope boolean_factor364 =null;
		ParserRuleReturnScope boolean_factor366 =null;

		CommonTree AND365_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

			// DBL.g:961:3: ( boolean_factor ( AND ^ boolean_factor )* )
			// DBL.g:961:5: boolean_factor ( AND ^ boolean_factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_factor_in_and_predicate7674);
			boolean_factor364=boolean_factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor364.getTree());

			// DBL.g:961:20: ( AND ^ boolean_factor )*
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==AND) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// DBL.g:961:21: AND ^ boolean_factor
					{
					AND365=(Token)match(input,AND,FOLLOW_AND_in_and_predicate7677); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND365_tree = (CommonTree)adaptor.create(AND365);
					root_0 = (CommonTree)adaptor.becomeRoot(AND365_tree, root_0);
					}

					pushFollow(FOLLOW_boolean_factor_in_and_predicate7680);
					boolean_factor366=boolean_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor366.getTree());

					}
					break;

				default :
					break loop117;
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
			if ( state.backtracking>0 ) { memoize(input, 114, and_predicate_StartIndex); }

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
	// DBL.g:963:1: boolean_factor : ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) );
	public final DBLParser.boolean_factor_return boolean_factor() throws RecognitionException {
		DBLParser.boolean_factor_return retval = new DBLParser.boolean_factor_return();
		retval.start = input.LT(1);
		int boolean_factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT368=null;
		ParserRuleReturnScope boolean_test367 =null;
		ParserRuleReturnScope boolean_test369 =null;

		CommonTree NOT368_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleSubtreeStream stream_boolean_test=new RewriteRuleSubtreeStream(adaptor,"rule boolean_test");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

			// DBL.g:964:3: ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) )
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==CASE||LA118_0==COUNT||LA118_0==Character_String_Literal||LA118_0==Identifier||LA118_0==LEFT_PAREN||LA118_0==MINUS||LA118_0==NULL||LA118_0==NUMBER||LA118_0==PLUS||LA118_0==REAL_NUMBER) ) {
				alt118=1;
			}
			else if ( (LA118_0==NOT) ) {
				alt118=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}

			switch (alt118) {
				case 1 :
					// DBL.g:964:5: boolean_test
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_test_in_boolean_factor7693);
					boolean_test367=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_test367.getTree());

					}
					break;
				case 2 :
					// DBL.g:965:5: NOT boolean_test
					{
					NOT368=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_factor7699); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT368);

					pushFollow(FOLLOW_boolean_test_in_boolean_factor7701);
					boolean_test369=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_test.add(boolean_test369.getTree());
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
					// 965:22: -> ^( NOT boolean_test )
					{
						// DBL.g:965:25: ^( NOT boolean_test )
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
			if ( state.backtracking>0 ) { memoize(input, 115, boolean_factor_StartIndex); }

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
	// DBL.g:967:1: boolean_test : boolean_primary ( is_clause )? ;
	public final DBLParser.boolean_test_return boolean_test() throws RecognitionException {
		DBLParser.boolean_test_return retval = new DBLParser.boolean_test_return();
		retval.start = input.LT(1);
		int boolean_test_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_primary370 =null;
		ParserRuleReturnScope is_clause371 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

			// DBL.g:968:3: ( boolean_primary ( is_clause )? )
			// DBL.g:968:5: boolean_primary ( is_clause )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_primary_in_boolean_test7721);
			boolean_primary370=boolean_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_primary370.getTree());

			// DBL.g:968:21: ( is_clause )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==IS) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// DBL.g:968:21: is_clause
					{
					pushFollow(FOLLOW_is_clause_in_boolean_test7723);
					is_clause371=is_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, is_clause371.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 116, boolean_test_StartIndex); }

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
	// DBL.g:970:1: is_clause : IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) ;
	public final DBLParser.is_clause_return is_clause() throws RecognitionException {
		DBLParser.is_clause_return retval = new DBLParser.is_clause_return();
		retval.start = input.LT(1);
		int is_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IS372=null;
		Token NOT373=null;
		ParserRuleReturnScope t =null;

		CommonTree IS372_tree=null;
		CommonTree NOT373_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleSubtreeStream stream_truth_value=new RewriteRuleSubtreeStream(adaptor,"rule truth_value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

			// DBL.g:971:3: ( IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) )
			// DBL.g:971:5: IS ( NOT )? t= truth_value
			{
			IS372=(Token)match(input,IS,FOLLOW_IS_in_is_clause7736); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS372);

			// DBL.g:971:8: ( NOT )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==NOT) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// DBL.g:971:8: NOT
					{
					NOT373=(Token)match(input,NOT,FOLLOW_NOT_in_is_clause7738); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT373);

					}
					break;

			}

			pushFollow(FOLLOW_truth_value_in_is_clause7743);
			t=truth_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_truth_value.add(t.getTree());
			// AST REWRITE
			// elements: NOT, t, IS
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
			// 971:27: -> ^( IS ( NOT )? $t)
			{
				// DBL.g:971:30: ^( IS ( NOT )? $t)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				// DBL.g:971:35: ( NOT )?
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
			if ( state.backtracking>0 ) { memoize(input, 117, is_clause_StartIndex); }

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
	// DBL.g:973:1: truth_value : ( TRUE | FALSE | UNKNOWN );
	public final DBLParser.truth_value_return truth_value() throws RecognitionException {
		DBLParser.truth_value_return retval = new DBLParser.truth_value_return();
		retval.start = input.LT(1);
		int truth_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set374=null;

		CommonTree set374_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

			// DBL.g:974:3: ( TRUE | FALSE | UNKNOWN )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set374=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE||input.LA(1)==UNKNOWN ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set374));
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
			if ( state.backtracking>0 ) { memoize(input, 118, truth_value_StartIndex); }

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
	// DBL.g:976:1: boolean_primary : ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression );
	public final DBLParser.boolean_primary_return boolean_primary() throws RecognitionException {
		DBLParser.boolean_primary_return retval = new DBLParser.boolean_primary_return();
		retval.start = input.LT(1);
		int boolean_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN377=null;
		Token RIGHT_PAREN379=null;
		ParserRuleReturnScope predicate375 =null;
		ParserRuleReturnScope numeric_value_expression376 =null;
		ParserRuleReturnScope boolean_value_expression378 =null;
		ParserRuleReturnScope case_expression380 =null;

		CommonTree LEFT_PAREN377_tree=null;
		CommonTree RIGHT_PAREN379_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

			// DBL.g:977:3: ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression )
			int alt121=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA121_1 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt121=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt121=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 1, input);
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
				int LA121_2 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt121=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt121=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 2, input);
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
				int LA121_3 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt121=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt121=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NULL:
				{
				int LA121_4 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt121=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt121=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA121_5 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt121=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt121=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA121_6 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt121=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt121=2;
				}
				else if ( (synpred187_DBL()) ) {
					alt121=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COUNT:
				{
				int LA121_7 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt121=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt121=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CASE:
				{
				alt121=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}
			switch (alt121) {
				case 1 :
					// DBL.g:977:5: predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_boolean_primary7787);
					predicate375=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate375.getTree());

					}
					break;
				case 2 :
					// DBL.g:978:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_boolean_primary7793);
					numeric_value_expression376=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression376.getTree());

					}
					break;
				case 3 :
					// DBL.g:979:5: LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN377=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_boolean_primary7799); if (state.failed) return retval;
					pushFollow(FOLLOW_boolean_value_expression_in_boolean_primary7802);
					boolean_value_expression378=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression378.getTree());

					RIGHT_PAREN379=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_boolean_primary7804); if (state.failed) return retval;
					}
					break;
				case 4 :
					// DBL.g:980:5: case_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_boolean_primary7811);
					case_expression380=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression380.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 119, boolean_primary_StartIndex); }

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
	// DBL.g:987:1: predicate : ( comparison_predicate | in_predicate | like_predicate | null_predicate );
	public final DBLParser.predicate_return predicate() throws RecognitionException {
		DBLParser.predicate_return retval = new DBLParser.predicate_return();
		retval.start = input.LT(1);
		int predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison_predicate381 =null;
		ParserRuleReturnScope in_predicate382 =null;
		ParserRuleReturnScope like_predicate383 =null;
		ParserRuleReturnScope null_predicate384 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

			// DBL.g:988:3: ( comparison_predicate | in_predicate | like_predicate | null_predicate )
			int alt122=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA122_1 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt122=2;
				}
				else if ( (true) ) {
					alt122=4;
				}

				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA122_2 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt122=2;
				}
				else if ( (true) ) {
					alt122=4;
				}

				}
				break;
			case NUMBER:
			case REAL_NUMBER:
				{
				int LA122_3 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt122=2;
				}
				else if ( (true) ) {
					alt122=4;
				}

				}
				break;
			case NULL:
				{
				int LA122_4 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt122=2;
				}
				else if ( (true) ) {
					alt122=4;
				}

				}
				break;
			case Identifier:
				{
				int LA122_5 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt122=2;
				}
				else if ( (synpred190_DBL()) ) {
					alt122=3;
				}
				else if ( (true) ) {
					alt122=4;
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA122_6 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt122=2;
				}
				else if ( (true) ) {
					alt122=4;
				}

				}
				break;
			case COUNT:
				{
				int LA122_7 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt122=2;
				}
				else if ( (true) ) {
					alt122=4;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 122, 0, input);
				throw nvae;
			}
			switch (alt122) {
				case 1 :
					// DBL.g:988:5: comparison_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_comparison_predicate_in_predicate7825);
					comparison_predicate381=comparison_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_predicate381.getTree());

					}
					break;
				case 2 :
					// DBL.g:989:5: in_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_in_predicate_in_predicate7831);
					in_predicate382=in_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in_predicate382.getTree());

					}
					break;
				case 3 :
					// DBL.g:990:5: like_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_like_predicate_in_predicate7837);
					like_predicate383=like_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, like_predicate383.getTree());

					}
					break;
				case 4 :
					// DBL.g:991:5: null_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_null_predicate_in_predicate7843);
					null_predicate384=null_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, null_predicate384.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 120, predicate_StartIndex); }

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
	// DBL.g:999:1: comparison_predicate options {k=1; } : l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) ;
	public final DBLParser.comparison_predicate_return comparison_predicate() throws RecognitionException {
		DBLParser.comparison_predicate_return retval = new DBLParser.comparison_predicate_return();
		retval.start = input.LT(1);
		int comparison_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope l =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope r =null;

		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");
		RewriteRuleSubtreeStream stream_comp_op=new RewriteRuleSubtreeStream(adaptor,"rule comp_op");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

			// DBL.g:1001:2: (l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) )
			// DBL.g:1001:4: l= numeric_value_expression c= comp_op r= numeric_value_expression
			{
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate7867);
			l=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(l.getTree());
			pushFollow(FOLLOW_comp_op_in_comparison_predicate7871);
			c=comp_op();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_comp_op.add(c.getTree());
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate7875);
			r=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(r.getTree());
			// AST REWRITE
			// elements: l, c, r
			// token labels: 
			// rule labels: retval, r, c, l
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1001:68: -> ^( $c $l $r)
			{
				// DBL.g:1001:71: ^( $c $l $r)
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
			if ( state.backtracking>0 ) { memoize(input, 121, comparison_predicate_StartIndex); }

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
	// DBL.g:1003:1: comp_op : ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ );
	public final DBLParser.comp_op_return comp_op() throws RecognitionException {
		DBLParser.comp_op_return retval = new DBLParser.comp_op_return();
		retval.start = input.LT(1);
		int comp_op_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set385=null;

		CommonTree set385_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

			// DBL.g:1004:3: ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set385=input.LT(1);
			if ( input.LA(1)==EQUAL||input.LA(1)==GEQ||input.LA(1)==GTH||input.LA(1)==LEQ||input.LA(1)==LTH||input.LA(1)==NOT_EQUAL ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set385));
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
			if ( state.backtracking>0 ) { memoize(input, 122, comp_op_StartIndex); }

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
	// DBL.g:1017:1: in_predicate : v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) ;
	public final DBLParser.in_predicate_return in_predicate() throws RecognitionException {
		DBLParser.in_predicate_return retval = new DBLParser.in_predicate_return();
		retval.start = input.LT(1);
		int in_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT386=null;
		Token IN387=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope a =null;

		CommonTree NOT386_tree=null;
		CommonTree IN387_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleSubtreeStream stream_in_predicate_value=new RewriteRuleSubtreeStream(adaptor,"rule in_predicate_value");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

			// DBL.g:1017:14: (v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) )
			// DBL.g:1017:16: v= numeric_value_expression ( NOT )? IN a= in_predicate_value
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_predicate7943);
			v=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(v.getTree());
			// DBL.g:1017:44: ( NOT )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==NOT) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// DBL.g:1017:44: NOT
					{
					NOT386=(Token)match(input,NOT,FOLLOW_NOT_in_in_predicate7946); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT386);

					}
					break;

			}

			IN387=(Token)match(input,IN,FOLLOW_IN_in_in_predicate7949); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IN.add(IN387);

			pushFollow(FOLLOW_in_predicate_value_in_in_predicate7953);
			a=in_predicate_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_in_predicate_value.add(a.getTree());
			// AST REWRITE
			// elements: IN, NOT, v, a
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
			// 1017:73: -> ^( IN $v $a ( NOT )? )
			{
				// DBL.g:1017:76: ^( IN $v $a ( NOT )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_a.nextTree());
				// DBL.g:1017:87: ( NOT )?
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
			if ( state.backtracking>0 ) { memoize(input, 123, in_predicate_StartIndex); }

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
	// DBL.g:1018:1: in_predicate_value : LEFT_PAREN ! in_value_list RIGHT_PAREN !;
	public final DBLParser.in_predicate_value_return in_predicate_value() throws RecognitionException {
		DBLParser.in_predicate_value_return retval = new DBLParser.in_predicate_value_return();
		retval.start = input.LT(1);
		int in_predicate_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN388=null;
		Token RIGHT_PAREN390=null;
		ParserRuleReturnScope in_value_list389 =null;

		CommonTree LEFT_PAREN388_tree=null;
		CommonTree RIGHT_PAREN390_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

			// DBL.g:1019:3: ( LEFT_PAREN ! in_value_list RIGHT_PAREN !)
			// DBL.g:1019:5: LEFT_PAREN ! in_value_list RIGHT_PAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			LEFT_PAREN388=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_in_predicate_value7977); if (state.failed) return retval;
			pushFollow(FOLLOW_in_value_list_in_in_predicate_value7980);
			in_value_list389=in_value_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, in_value_list389.getTree());

			RIGHT_PAREN390=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_in_predicate_value7983); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 124, in_predicate_value_StartIndex); }

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
	// DBL.g:1021:1: in_value_list : numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ ;
	public final DBLParser.in_value_list_return in_value_list() throws RecognitionException {
		DBLParser.in_value_list_return retval = new DBLParser.in_value_list_return();
		retval.start = input.LT(1);
		int in_value_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA392=null;
		ParserRuleReturnScope numeric_value_expression391 =null;
		ParserRuleReturnScope numeric_value_expression393 =null;

		CommonTree COMMA392_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

			// DBL.g:1022:3: ( numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ )
			// DBL.g:1022:5: numeric_value_expression ( COMMA numeric_value_expression )*
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_value_list7995);
			numeric_value_expression391=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression391.getTree());
			// DBL.g:1022:31: ( COMMA numeric_value_expression )*
			loop124:
			while (true) {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==COMMA) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// DBL.g:1022:33: COMMA numeric_value_expression
					{
					COMMA392=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_value_list8000); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA392);

					pushFollow(FOLLOW_numeric_value_expression_in_in_value_list8002);
					numeric_value_expression393=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression393.getTree());
					}
					break;

				default :
					break loop124;
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
			// 1022:68: -> ( numeric_value_expression )+
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
			if ( state.backtracking>0 ) { memoize(input, 125, in_value_list_StartIndex); }

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
	// DBL.g:1029:1: like_predicate : f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) ;
	public final DBLParser.like_predicate_return like_predicate() throws RecognitionException {
		DBLParser.like_predicate_return retval = new DBLParser.like_predicate_return();
		retval.start = input.LT(1);
		int like_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token NOT394=null;
		Token LIKE395=null;
		ParserRuleReturnScope f =null;

		CommonTree s_tree=null;
		CommonTree NOT394_tree=null;
		CommonTree LIKE395_tree=null;
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

			// DBL.g:1030:3: (f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) )
			// DBL.g:1030:5: f= column_reference ( NOT )? LIKE s= Character_String_Literal
			{
			pushFollow(FOLLOW_column_reference_in_like_predicate8024);
			f=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(f.getTree());
			// DBL.g:1030:24: ( NOT )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==NOT) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// DBL.g:1030:24: NOT
					{
					NOT394=(Token)match(input,NOT,FOLLOW_NOT_in_like_predicate8026); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT394);

					}
					break;

			}

			LIKE395=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_predicate8029); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIKE.add(LIKE395);

			s=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_like_predicate8033); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_String_Literal.add(s);

			// AST REWRITE
			// elements: f, s, LIKE, NOT
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
			// 1030:61: -> ^( LIKE ( NOT )? $f $s)
			{
				// DBL.g:1030:64: ^( LIKE ( NOT )? $f $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_LIKE.nextNode(), root_1);
				// DBL.g:1030:71: ( NOT )?
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
			if ( state.backtracking>0 ) { memoize(input, 126, like_predicate_StartIndex); }

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
	// DBL.g:1038:1: null_predicate : f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) ;
	public final DBLParser.null_predicate_return null_predicate() throws RecognitionException {
		DBLParser.null_predicate_return retval = new DBLParser.null_predicate_return();
		retval.start = input.LT(1);
		int null_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token IS396=null;
		Token NULL397=null;
		ParserRuleReturnScope f =null;

		CommonTree n_tree=null;
		CommonTree IS396_tree=null;
		CommonTree NULL397_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

			// DBL.g:1039:3: (f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) )
			// DBL.g:1039:5: f= numeric_value_expression IS (n= NOT )? NULL
			{
			pushFollow(FOLLOW_numeric_value_expression_in_null_predicate8064);
			f=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(f.getTree());
			IS396=(Token)match(input,IS,FOLLOW_IS_in_null_predicate8066); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS396);

			// DBL.g:1039:35: (n= NOT )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==NOT) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// DBL.g:1039:36: n= NOT
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_null_predicate8071); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(n);

					}
					break;

			}

			NULL397=(Token)match(input,NULL,FOLLOW_NULL_in_null_predicate8075); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL397);

			// AST REWRITE
			// elements: n, IS, f, NULL
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
			// 1039:49: -> ^( IS $f NULL ( $n)? )
			{
				// DBL.g:1039:52: ^( IS $f NULL ( $n)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				adaptor.addChild(root_1, stream_f.nextTree());
				adaptor.addChild(root_1, stream_NULL.nextNode());
				// DBL.g:1039:66: ( $n)?
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
			if ( state.backtracking>0 ) { memoize(input, 127, null_predicate_StartIndex); }

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
	// DBL.g:1047:1: numeric_value_expression : term ( ( PLUS | MINUS ) ^ term )* ;
	public final DBLParser.numeric_value_expression_return numeric_value_expression() throws RecognitionException {
		DBLParser.numeric_value_expression_return retval = new DBLParser.numeric_value_expression_return();
		retval.start = input.LT(1);
		int numeric_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set399=null;
		ParserRuleReturnScope term398 =null;
		ParserRuleReturnScope term400 =null;

		CommonTree set399_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

			// DBL.g:1048:2: ( term ( ( PLUS | MINUS ) ^ term )* )
			// DBL.g:1048:4: term ( ( PLUS | MINUS ) ^ term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_term_in_numeric_value_expression8103);
			term398=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term398.getTree());

			// DBL.g:1048:9: ( ( PLUS | MINUS ) ^ term )*
			loop127:
			while (true) {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==MINUS||LA127_0==PLUS) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// DBL.g:1048:10: ( PLUS | MINUS ) ^ term
					{
					set399=input.LT(1);
					set399=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set399), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_numeric_value_expression8113);
					term400=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term400.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 128, numeric_value_expression_StartIndex); }

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
	// DBL.g:1050:1: term : numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* ;
	public final DBLParser.term_return term() throws RecognitionException {
		DBLParser.term_return retval = new DBLParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set402=null;
		ParserRuleReturnScope numeric_primary401 =null;
		ParserRuleReturnScope numeric_primary403 =null;

		CommonTree set402_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

			// DBL.g:1051:3: ( numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* )
			// DBL.g:1051:5: numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_numeric_primary_in_term8126);
			numeric_primary401=numeric_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary401.getTree());

			// DBL.g:1051:21: ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			loop128:
			while (true) {
				int alt128=2;
				int LA128_0 = input.LA(1);
				if ( (LA128_0==DIVIDE||LA128_0==MODULAR||LA128_0==MULTIPLY) ) {
					alt128=1;
				}

				switch (alt128) {
				case 1 :
					// DBL.g:1051:22: ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary
					{
					set402=input.LT(1);
					set402=input.LT(1);
					if ( input.LA(1)==DIVIDE||input.LA(1)==MODULAR||input.LA(1)==MULTIPLY ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set402), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numeric_primary_in_term8138);
					numeric_primary403=numeric_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary403.getTree());

					}
					break;

				default :
					break loop128;
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
			if ( state.backtracking>0 ) { memoize(input, 129, term_StartIndex); }

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
	// DBL.g:1053:1: array : LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ ;
	public final DBLParser.array_return array() throws RecognitionException {
		DBLParser.array_return retval = new DBLParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN404=null;
		Token COMMA406=null;
		Token RIGHT_PAREN408=null;
		ParserRuleReturnScope literal405 =null;
		ParserRuleReturnScope literal407 =null;

		CommonTree LEFT_PAREN404_tree=null;
		CommonTree COMMA406_tree=null;
		CommonTree RIGHT_PAREN408_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }

			// DBL.g:1054:3: ( LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ )
			// DBL.g:1054:5: LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN
			{
			LEFT_PAREN404=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_array8151); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN404);

			pushFollow(FOLLOW_literal_in_array8153);
			literal405=literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_literal.add(literal405.getTree());
			// DBL.g:1054:24: ( COMMA literal )*
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==COMMA) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// DBL.g:1054:25: COMMA literal
					{
					COMMA406=(Token)match(input,COMMA,FOLLOW_COMMA_in_array8156); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA406);

					pushFollow(FOLLOW_literal_in_array8158);
					literal407=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literal.add(literal407.getTree());
					}
					break;

				default :
					break loop129;
				}
			}

			RIGHT_PAREN408=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_array8163); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN408);

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
			// 1054:54: -> ( literal )+
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
			if ( state.backtracking>0 ) { memoize(input, 130, array_StartIndex); }

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
	// DBL.g:1056:1: numeric_primary : ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation );
	public final DBLParser.numeric_primary_return numeric_primary() throws RecognitionException {
		DBLParser.numeric_primary_return retval = new DBLParser.numeric_primary_return();
		retval.start = input.LT(1);
		int numeric_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN411=null;
		Token RIGHT_PAREN413=null;
		ParserRuleReturnScope literal409 =null;
		ParserRuleReturnScope column_reference410 =null;
		ParserRuleReturnScope numeric_value_expression412 =null;
		ParserRuleReturnScope routine_invocation414 =null;

		CommonTree LEFT_PAREN411_tree=null;
		CommonTree RIGHT_PAREN413_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

			// DBL.g:1057:3: ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation )
			int alt130=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
			case MINUS:
			case NULL:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt130=1;
				}
				break;
			case Identifier:
				{
				int LA130_2 = input.LA(2);
				if ( (LA130_2==LEFT_PAREN) ) {
					alt130=4;
				}
				else if ( (LA130_2==EOF||LA130_2==AND||LA130_2==AS||LA130_2==COMMA||LA130_2==CROSS||LA130_2==DIVIDE||LA130_2==ELSE||(LA130_2 >= END && LA130_2 <= EQUAL)||LA130_2==EXCEPT||(LA130_2 >= FROM && LA130_2 <= FULL)||(LA130_2 >= GEQ && LA130_2 <= GROUP)||LA130_2==GTH||LA130_2==HAVING||LA130_2==IN||LA130_2==INNER||LA130_2==INTERSECT||LA130_2==IS||LA130_2==Identifier||LA130_2==JOIN||LA130_2==LEFT||LA130_2==LEQ||LA130_2==LIMIT||LA130_2==LTH||LA130_2==MINUS||LA130_2==MODULAR||LA130_2==MULTIPLY||LA130_2==NATURAL||(LA130_2 >= NOT && LA130_2 <= NOT_EQUAL)||(LA130_2 >= OR && LA130_2 <= ORDER)||LA130_2==PLUS||(LA130_2 >= RIGHT && LA130_2 <= RIGHT_PAREN)||LA130_2==THEN||LA130_2==UNION||(LA130_2 >= WHEN && LA130_2 <= WHERE)) ) {
					alt130=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 130, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFT_PAREN:
				{
				alt130=3;
				}
				break;
			case COUNT:
				{
				alt130=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}
			switch (alt130) {
				case 1 :
					// DBL.g:1057:5: literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_literal_in_numeric_primary8180);
					literal409=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal409.getTree());

					}
					break;
				case 2 :
					// DBL.g:1058:4: column_reference
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_in_numeric_primary8185);
					column_reference410=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference410.getTree());

					}
					break;
				case 3 :
					// DBL.g:1059:4: LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN411=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_numeric_primary8190); if (state.failed) return retval;
					pushFollow(FOLLOW_numeric_value_expression_in_numeric_primary8193);
					numeric_value_expression412=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression412.getTree());

					RIGHT_PAREN413=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_numeric_primary8195); if (state.failed) return retval;
					}
					break;
				case 4 :
					// DBL.g:1060:4: routine_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_routine_invocation_in_numeric_primary8201);
					routine_invocation414=routine_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, routine_invocation414.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 131, numeric_primary_StartIndex); }

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
	// DBL.g:1062:1: literal : ( string_value_expr | signed_numerical_literal | NULL );
	public final DBLParser.literal_return literal() throws RecognitionException {
		DBLParser.literal_return retval = new DBLParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL417=null;
		ParserRuleReturnScope string_value_expr415 =null;
		ParserRuleReturnScope signed_numerical_literal416 =null;

		CommonTree NULL417_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }

			// DBL.g:1063:3: ( string_value_expr | signed_numerical_literal | NULL )
			int alt131=3;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				alt131=1;
				}
				break;
			case MINUS:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt131=2;
				}
				break;
			case NULL:
				{
				alt131=3;
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
					// DBL.g:1063:5: string_value_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_value_expr_in_literal8212);
					string_value_expr415=string_value_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value_expr415.getTree());

					}
					break;
				case 2 :
					// DBL.g:1064:5: signed_numerical_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_signed_numerical_literal_in_literal8218);
					signed_numerical_literal416=signed_numerical_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, signed_numerical_literal416.getTree());

					}
					break;
				case 3 :
					// DBL.g:1065:5: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL417=(Token)match(input,NULL,FOLLOW_NULL_in_literal8224); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL417_tree = (CommonTree)adaptor.create(NULL417);
					adaptor.addChild(root_0, NULL417_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 132, literal_StartIndex); }

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
	// DBL.g:1067:1: string_value_expr : Character_String_Literal ;
	public final DBLParser.string_value_expr_return string_value_expr() throws RecognitionException {
		DBLParser.string_value_expr_return retval = new DBLParser.string_value_expr_return();
		retval.start = input.LT(1);
		int string_value_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Character_String_Literal418=null;

		CommonTree Character_String_Literal418_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }

			// DBL.g:1068:3: ( Character_String_Literal )
			// DBL.g:1068:5: Character_String_Literal
			{
			root_0 = (CommonTree)adaptor.nil();


			Character_String_Literal418=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_string_value_expr8236); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Character_String_Literal418_tree = (CommonTree)adaptor.create(Character_String_Literal418);
			adaptor.addChild(root_0, Character_String_Literal418_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 133, string_value_expr_StartIndex); }

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
	// DBL.g:1070:1: signed_numerical_literal : ( sign )? unsigned_numerical_literal ;
	public final DBLParser.signed_numerical_literal_return signed_numerical_literal() throws RecognitionException {
		DBLParser.signed_numerical_literal_return retval = new DBLParser.signed_numerical_literal_return();
		retval.start = input.LT(1);
		int signed_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope sign419 =null;
		ParserRuleReturnScope unsigned_numerical_literal420 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }

			// DBL.g:1071:3: ( ( sign )? unsigned_numerical_literal )
			// DBL.g:1071:5: ( sign )? unsigned_numerical_literal
			{
			root_0 = (CommonTree)adaptor.nil();


			// DBL.g:1071:5: ( sign )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==MINUS||LA132_0==PLUS) ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// DBL.g:1071:5: sign
					{
					pushFollow(FOLLOW_sign_in_signed_numerical_literal8248);
					sign419=sign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sign419.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal8251);
			unsigned_numerical_literal420=unsigned_numerical_literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unsigned_numerical_literal420.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 134, signed_numerical_literal_StartIndex); }

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
	// DBL.g:1073:1: unsigned_numerical_literal : ( NUMBER | REAL_NUMBER );
	public final DBLParser.unsigned_numerical_literal_return unsigned_numerical_literal() throws RecognitionException {
		DBLParser.unsigned_numerical_literal_return retval = new DBLParser.unsigned_numerical_literal_return();
		retval.start = input.LT(1);
		int unsigned_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set421=null;

		CommonTree set421_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }

			// DBL.g:1074:3: ( NUMBER | REAL_NUMBER )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set421=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==REAL_NUMBER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set421));
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
			if ( state.backtracking>0 ) { memoize(input, 135, unsigned_numerical_literal_StartIndex); }

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
	// DBL.g:1077:1: sign : ( PLUS | MINUS );
	public final DBLParser.sign_return sign() throws RecognitionException {
		DBLParser.sign_return retval = new DBLParser.sign_return();
		retval.start = input.LT(1);
		int sign_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set422=null;

		CommonTree set422_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }

			// DBL.g:1078:3: ( PLUS | MINUS )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set422=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set422));
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
			if ( state.backtracking>0 ) { memoize(input, 136, sign_StartIndex); }

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
	// DBL.g:1085:1: case_expression : case_specification ;
	public final DBLParser.case_expression_return case_expression() throws RecognitionException {
		DBLParser.case_expression_return retval = new DBLParser.case_expression_return();
		retval.start = input.LT(1);
		int case_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope case_specification423 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }

			// DBL.g:1086:3: ( case_specification )
			// DBL.g:1086:5: case_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_case_specification_in_case_expression8299);
			case_specification423=case_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, case_specification423.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 137, case_expression_StartIndex); }

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
	// DBL.g:1088:1: case_abbreviation : ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN );
	public final DBLParser.case_abbreviation_return case_abbreviation() throws RecognitionException {
		DBLParser.case_abbreviation_return retval = new DBLParser.case_abbreviation_return();
		retval.start = input.LT(1);
		int case_abbreviation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULLIF424=null;
		Token LEFT_PAREN425=null;
		Token COMMA427=null;
		Token RIGHT_PAREN429=null;
		Token COALESCE430=null;
		Token LEFT_PAREN431=null;
		Token COMMA433=null;
		Token RIGHT_PAREN435=null;
		ParserRuleReturnScope numeric_value_expression426 =null;
		ParserRuleReturnScope boolean_value_expression428 =null;
		ParserRuleReturnScope numeric_value_expression432 =null;
		ParserRuleReturnScope boolean_value_expression434 =null;

		CommonTree NULLIF424_tree=null;
		CommonTree LEFT_PAREN425_tree=null;
		CommonTree COMMA427_tree=null;
		CommonTree RIGHT_PAREN429_tree=null;
		CommonTree COALESCE430_tree=null;
		CommonTree LEFT_PAREN431_tree=null;
		CommonTree COMMA433_tree=null;
		CommonTree RIGHT_PAREN435_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }

			// DBL.g:1089:3: ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN )
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==NULLIF) ) {
				alt134=1;
			}
			else if ( (LA134_0==COALESCE) ) {
				alt134=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 134, 0, input);
				throw nvae;
			}

			switch (alt134) {
				case 1 :
					// DBL.g:1089:5: NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					NULLIF424=(Token)match(input,NULLIF,FOLLOW_NULLIF_in_case_abbreviation8311); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULLIF424_tree = (CommonTree)adaptor.create(NULLIF424);
					adaptor.addChild(root_0, NULLIF424_tree);
					}

					LEFT_PAREN425=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation8313); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN425_tree = (CommonTree)adaptor.create(LEFT_PAREN425);
					adaptor.addChild(root_0, LEFT_PAREN425_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation8315);
					numeric_value_expression426=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression426.getTree());

					COMMA427=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation8317); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA427_tree = (CommonTree)adaptor.create(COMMA427);
					adaptor.addChild(root_0, COMMA427_tree);
					}

					pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation8319);
					boolean_value_expression428=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression428.getTree());

					RIGHT_PAREN429=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation8322); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN429_tree = (CommonTree)adaptor.create(RIGHT_PAREN429);
					adaptor.addChild(root_0, RIGHT_PAREN429_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:1090:5: COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					COALESCE430=(Token)match(input,COALESCE,FOLLOW_COALESCE_in_case_abbreviation8328); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COALESCE430_tree = (CommonTree)adaptor.create(COALESCE430);
					adaptor.addChild(root_0, COALESCE430_tree);
					}

					LEFT_PAREN431=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation8330); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN431_tree = (CommonTree)adaptor.create(LEFT_PAREN431);
					adaptor.addChild(root_0, LEFT_PAREN431_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation8332);
					numeric_value_expression432=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression432.getTree());

					// DBL.g:1090:50: ( COMMA boolean_value_expression )+
					int cnt133=0;
					loop133:
					while (true) {
						int alt133=2;
						int LA133_0 = input.LA(1);
						if ( (LA133_0==COMMA) ) {
							alt133=1;
						}

						switch (alt133) {
						case 1 :
							// DBL.g:1090:52: COMMA boolean_value_expression
							{
							COMMA433=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation8336); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA433_tree = (CommonTree)adaptor.create(COMMA433);
							adaptor.addChild(root_0, COMMA433_tree);
							}

							pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation8338);
							boolean_value_expression434=boolean_value_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression434.getTree());

							}
							break;

						default :
							if ( cnt133 >= 1 ) break loop133;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(133, input);
							throw eee;
						}
						cnt133++;
					}

					RIGHT_PAREN435=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation8344); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN435_tree = (CommonTree)adaptor.create(RIGHT_PAREN435);
					adaptor.addChild(root_0, RIGHT_PAREN435_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 138, case_abbreviation_StartIndex); }

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
	// DBL.g:1092:1: case_specification : ( simple_case | searched_case );
	public final DBLParser.case_specification_return case_specification() throws RecognitionException {
		DBLParser.case_specification_return retval = new DBLParser.case_specification_return();
		retval.start = input.LT(1);
		int case_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope simple_case436 =null;
		ParserRuleReturnScope searched_case437 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }

			// DBL.g:1093:3: ( simple_case | searched_case )
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==CASE) ) {
				int LA135_1 = input.LA(2);
				if ( (LA135_1==COUNT||LA135_1==Character_String_Literal||LA135_1==Identifier||LA135_1==LEFT_PAREN||LA135_1==MINUS||LA135_1==NULL||LA135_1==NUMBER||LA135_1==PLUS||LA135_1==REAL_NUMBER) ) {
					alt135=1;
				}
				else if ( (LA135_1==WHEN) ) {
					alt135=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 135, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 135, 0, input);
				throw nvae;
			}

			switch (alt135) {
				case 1 :
					// DBL.g:1093:5: simple_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_case_in_case_specification8356);
					simple_case436=simple_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_case436.getTree());

					}
					break;
				case 2 :
					// DBL.g:1094:5: searched_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_searched_case_in_case_specification8362);
					searched_case437=searched_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_case437.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 139, case_specification_StartIndex); }

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
	// DBL.g:1096:1: simple_case : CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END ;
	public final DBLParser.simple_case_return simple_case() throws RecognitionException {
		DBLParser.simple_case_return retval = new DBLParser.simple_case_return();
		retval.start = input.LT(1);
		int simple_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE438=null;
		Token END442=null;
		ParserRuleReturnScope numeric_value_expression439 =null;
		ParserRuleReturnScope simple_when_clause440 =null;
		ParserRuleReturnScope else_clause441 =null;

		CommonTree CASE438_tree=null;
		CommonTree END442_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }

			// DBL.g:1097:3: ( CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END )
			// DBL.g:1097:5: CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE438=(Token)match(input,CASE,FOLLOW_CASE_in_simple_case8374); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE438_tree = (CommonTree)adaptor.create(CASE438);
			adaptor.addChild(root_0, CASE438_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_case8376);
			numeric_value_expression439=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression439.getTree());

			// DBL.g:1097:35: ( simple_when_clause )+
			int cnt136=0;
			loop136:
			while (true) {
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==WHEN) ) {
					alt136=1;
				}

				switch (alt136) {
				case 1 :
					// DBL.g:1097:37: simple_when_clause
					{
					pushFollow(FOLLOW_simple_when_clause_in_simple_case8380);
					simple_when_clause440=simple_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_when_clause440.getTree());

					}
					break;

				default :
					if ( cnt136 >= 1 ) break loop136;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(136, input);
					throw eee;
				}
				cnt136++;
			}

			// DBL.g:1097:59: ( else_clause )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==ELSE) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// DBL.g:1097:61: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_simple_case8387);
					else_clause441=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause441.getTree());

					}
					break;

			}

			END442=(Token)match(input,END,FOLLOW_END_in_simple_case8393); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END442_tree = (CommonTree)adaptor.create(END442);
			adaptor.addChild(root_0, END442_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 140, simple_case_StartIndex); }

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
	// DBL.g:1099:1: searched_case : CASE ^ ( searched_when_clause )+ ( else_clause )? END !;
	public final DBLParser.searched_case_return searched_case() throws RecognitionException {
		DBLParser.searched_case_return retval = new DBLParser.searched_case_return();
		retval.start = input.LT(1);
		int searched_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE443=null;
		Token END446=null;
		ParserRuleReturnScope searched_when_clause444 =null;
		ParserRuleReturnScope else_clause445 =null;

		CommonTree CASE443_tree=null;
		CommonTree END446_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }

			// DBL.g:1100:3: ( CASE ^ ( searched_when_clause )+ ( else_clause )? END !)
			// DBL.g:1100:5: CASE ^ ( searched_when_clause )+ ( else_clause )? END !
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE443=(Token)match(input,CASE,FOLLOW_CASE_in_searched_case8405); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE443_tree = (CommonTree)adaptor.create(CASE443);
			root_0 = (CommonTree)adaptor.becomeRoot(CASE443_tree, root_0);
			}

			// DBL.g:1100:11: ( searched_when_clause )+
			int cnt138=0;
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==WHEN) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// DBL.g:1100:12: searched_when_clause
					{
					pushFollow(FOLLOW_searched_when_clause_in_searched_case8409);
					searched_when_clause444=searched_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_when_clause444.getTree());

					}
					break;

				default :
					if ( cnt138 >= 1 ) break loop138;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(138, input);
					throw eee;
				}
				cnt138++;
			}

			// DBL.g:1100:35: ( else_clause )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==ELSE) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// DBL.g:1100:36: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_searched_case8414);
					else_clause445=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause445.getTree());

					}
					break;

			}

			END446=(Token)match(input,END,FOLLOW_END_in_searched_case8418); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 141, searched_case_StartIndex); }

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
	// DBL.g:1102:1: simple_when_clause : WHEN numeric_value_expression THEN result ;
	public final DBLParser.simple_when_clause_return simple_when_clause() throws RecognitionException {
		DBLParser.simple_when_clause_return retval = new DBLParser.simple_when_clause_return();
		retval.start = input.LT(1);
		int simple_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN447=null;
		Token THEN449=null;
		ParserRuleReturnScope numeric_value_expression448 =null;
		ParserRuleReturnScope result450 =null;

		CommonTree WHEN447_tree=null;
		CommonTree THEN449_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }

			// DBL.g:1102:20: ( WHEN numeric_value_expression THEN result )
			// DBL.g:1102:22: WHEN numeric_value_expression THEN result
			{
			root_0 = (CommonTree)adaptor.nil();


			WHEN447=(Token)match(input,WHEN,FOLLOW_WHEN_in_simple_when_clause8429); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHEN447_tree = (CommonTree)adaptor.create(WHEN447);
			adaptor.addChild(root_0, WHEN447_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_when_clause8431);
			numeric_value_expression448=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression448.getTree());

			THEN449=(Token)match(input,THEN,FOLLOW_THEN_in_simple_when_clause8433); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			THEN449_tree = (CommonTree)adaptor.create(THEN449);
			adaptor.addChild(root_0, THEN449_tree);
			}

			pushFollow(FOLLOW_result_in_simple_when_clause8435);
			result450=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, result450.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 142, simple_when_clause_StartIndex); }

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
	// DBL.g:1103:1: searched_when_clause : WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) ;
	public final DBLParser.searched_when_clause_return searched_when_clause() throws RecognitionException {
		DBLParser.searched_when_clause_return retval = new DBLParser.searched_when_clause_return();
		retval.start = input.LT(1);
		int searched_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN451=null;
		Token THEN452=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope r =null;

		CommonTree WHEN451_tree=null;
		CommonTree THEN452_tree=null;
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");
		RewriteRuleSubtreeStream stream_search_condition=new RewriteRuleSubtreeStream(adaptor,"rule search_condition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }

			// DBL.g:1104:3: ( WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) )
			// DBL.g:1104:5: WHEN c= search_condition THEN r= result
			{
			WHEN451=(Token)match(input,WHEN,FOLLOW_WHEN_in_searched_when_clause8445); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHEN.add(WHEN451);

			pushFollow(FOLLOW_search_condition_in_searched_when_clause8449);
			c=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_search_condition.add(c.getTree());
			THEN452=(Token)match(input,THEN,FOLLOW_THEN_in_searched_when_clause8451); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_THEN.add(THEN452);

			pushFollow(FOLLOW_result_in_searched_when_clause8455);
			r=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_result.add(r.getTree());
			// AST REWRITE
			// elements: r, c, WHEN
			// token labels: 
			// rule labels: retval, c, r
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1104:43: -> ^( WHEN $c $r)
			{
				// DBL.g:1104:46: ^( WHEN $c $r)
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
			if ( state.backtracking>0 ) { memoize(input, 143, searched_when_clause_StartIndex); }

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
	// DBL.g:1106:1: else_clause : ELSE r= result -> ^( ELSE $r) ;
	public final DBLParser.else_clause_return else_clause() throws RecognitionException {
		DBLParser.else_clause_return retval = new DBLParser.else_clause_return();
		retval.start = input.LT(1);
		int else_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ELSE453=null;
		ParserRuleReturnScope r =null;

		CommonTree ELSE453_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }

			// DBL.g:1107:3: ( ELSE r= result -> ^( ELSE $r) )
			// DBL.g:1107:5: ELSE r= result
			{
			ELSE453=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_clause8479); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ELSE.add(ELSE453);

			pushFollow(FOLLOW_result_in_else_clause8483);
			r=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_result.add(r.getTree());
			// AST REWRITE
			// elements: ELSE, r
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
			// 1107:19: -> ^( ELSE $r)
			{
				// DBL.g:1107:22: ^( ELSE $r)
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
			if ( state.backtracking>0 ) { memoize(input, 144, else_clause_StartIndex); }

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
	// DBL.g:1109:1: result : ( numeric_value_expression | NULL );
	public final DBLParser.result_return result() throws RecognitionException {
		DBLParser.result_return retval = new DBLParser.result_return();
		retval.start = input.LT(1);
		int result_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL455=null;
		ParserRuleReturnScope numeric_value_expression454 =null;

		CommonTree NULL455_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }

			// DBL.g:1110:3: ( numeric_value_expression | NULL )
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==COUNT||LA140_0==Character_String_Literal||LA140_0==Identifier||LA140_0==LEFT_PAREN||LA140_0==MINUS||LA140_0==NUMBER||LA140_0==PLUS||LA140_0==REAL_NUMBER) ) {
				alt140=1;
			}
			else if ( (LA140_0==NULL) ) {
				int LA140_2 = input.LA(2);
				if ( (synpred221_DBL()) ) {
					alt140=1;
				}
				else if ( (true) ) {
					alt140=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}

			switch (alt140) {
				case 1 :
					// DBL.g:1110:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_result8504);
					numeric_value_expression454=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression454.getTree());

					}
					break;
				case 2 :
					// DBL.g:1110:32: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL455=(Token)match(input,NULL,FOLLOW_NULL_in_result8508); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL455_tree = (CommonTree)adaptor.create(NULL455);
					adaptor.addChild(root_0, NULL455_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 145, result_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "result"

	// $ANTLR start synpred67_DBL
	public final void synpred67_DBL_fragment() throws RecognitionException {
		// DBL.g:518:3: ( open_statement )
		// DBL.g:518:3: open_statement
		{
		pushFollow(FOLLOW_open_statement_in_synpred67_DBL4434);
		open_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred67_DBL

	// $ANTLR start synpred72_DBL
	public final void synpred72_DBL_fragment() throws RecognitionException {
		// DBL.g:528:3: ( open_statement )
		// DBL.g:528:3: open_statement
		{
		pushFollow(FOLLOW_open_statement_in_synpred72_DBL4474);
		open_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred72_DBL

	// $ANTLR start synpred112_DBL
	public final void synpred112_DBL_fragment() throws RecognitionException {
		// DBL.g:734:5: ( non_join_query_expression )
		// DBL.g:734:5: non_join_query_expression
		{
		pushFollow(FOLLOW_non_join_query_expression_in_synpred112_DBL6050);
		non_join_query_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred112_DBL

	// $ANTLR start synpred113_DBL
	public final void synpred113_DBL_fragment() throws RecognitionException {
		// DBL.g:738:6: ( non_join_query_term )
		// DBL.g:738:6: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred113_DBL6069);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred113_DBL

	// $ANTLR start synpred121_DBL
	public final void synpred121_DBL_fragment() throws RecognitionException {
		// DBL.g:742:5: ( non_join_query_term )
		// DBL.g:742:5: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred121_DBL6129);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred121_DBL

	// $ANTLR start synpred142_DBL
	public final void synpred142_DBL_fragment() throws RecognitionException {
		// DBL.g:787:22: ( COMMA column_reference )
		// DBL.g:787:22: COMMA column_reference
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred142_DBL6482); if (state.failed) return;

		pushFollow(FOLLOW_column_reference_in_synpred142_DBL6484);
		column_reference();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred142_DBL

	// $ANTLR start synpred185_DBL
	public final void synpred185_DBL_fragment() throws RecognitionException {
		// DBL.g:977:5: ( predicate )
		// DBL.g:977:5: predicate
		{
		pushFollow(FOLLOW_predicate_in_synpred185_DBL7787);
		predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred185_DBL

	// $ANTLR start synpred186_DBL
	public final void synpred186_DBL_fragment() throws RecognitionException {
		// DBL.g:978:5: ( numeric_value_expression )
		// DBL.g:978:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred186_DBL7793);
		numeric_value_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred186_DBL

	// $ANTLR start synpred187_DBL
	public final void synpred187_DBL_fragment() throws RecognitionException {
		// DBL.g:979:5: ( LEFT_PAREN boolean_value_expression RIGHT_PAREN )
		// DBL.g:979:5: LEFT_PAREN boolean_value_expression RIGHT_PAREN
		{
		match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred187_DBL7799); if (state.failed) return;

		pushFollow(FOLLOW_boolean_value_expression_in_synpred187_DBL7802);
		boolean_value_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred187_DBL7804); if (state.failed) return;

		}

	}
	// $ANTLR end synpred187_DBL

	// $ANTLR start synpred188_DBL
	public final void synpred188_DBL_fragment() throws RecognitionException {
		// DBL.g:988:5: ( comparison_predicate )
		// DBL.g:988:5: comparison_predicate
		{
		pushFollow(FOLLOW_comparison_predicate_in_synpred188_DBL7825);
		comparison_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred188_DBL

	// $ANTLR start synpred189_DBL
	public final void synpred189_DBL_fragment() throws RecognitionException {
		// DBL.g:989:5: ( in_predicate )
		// DBL.g:989:5: in_predicate
		{
		pushFollow(FOLLOW_in_predicate_in_synpred189_DBL7831);
		in_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred189_DBL

	// $ANTLR start synpred190_DBL
	public final void synpred190_DBL_fragment() throws RecognitionException {
		// DBL.g:990:5: ( like_predicate )
		// DBL.g:990:5: like_predicate
		{
		pushFollow(FOLLOW_like_predicate_in_synpred190_DBL7837);
		like_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred190_DBL

	// $ANTLR start synpred221_DBL
	public final void synpred221_DBL_fragment() throws RecognitionException {
		// DBL.g:1110:5: ( numeric_value_expression )
		// DBL.g:1110:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred221_DBL8504);
		numeric_value_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred221_DBL

	// Delegated rules

	public final boolean synpred185_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred185_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred72_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred72_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred190_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred190_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred189_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred189_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred121_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred121_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred186_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred186_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred113_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred113_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred221_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred221_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred142_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred142_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred188_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred188_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred112_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred112_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred187_DBL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred187_DBL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_boolean_type_in_data_type3569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bit_type_in_data_type3575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varbit_type_in_data_type3581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_type_in_data_type3587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varbinary_type_in_data_type3593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blob_type_in_data_type3599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INET4_in_data_type3605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_string_type_in_data_type3611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_type_in_data_type3617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_type_in_data_type3623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_type_in_character_string_type3635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varchar_type_in_character_string_type3641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nchar_type_in_character_string_type3647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nvarchar_type_in_character_string_type3653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_character_string_type3659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int1_type_in_numeric_type3671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int2_type_in_numeric_type3677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int4_type_in_numeric_type3683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int8_type_in_numeric_type3689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float4_type_in_numeric_type3695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_type_in_numeric_type3701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float8_type_in_numeric_type3707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_type_in_numeric_type3713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_datetime_type3725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_datetime_type3731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timetz_type_in_datetime_type3737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_datetime_type3743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timestamptz_type_in_datetime_type3749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param3761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param3766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param3773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3776 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_precision_param3778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param3783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_type_length3796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_type_length3799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_type_length3801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_boolean_type3814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_boolean_type3820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_bit_type3836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_bit_type3838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBIT_in_varbit_type3855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_varbit_type3857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_varbit_type3868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_VARYING_in_varbit_type3870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_varbit_type3872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT1_in_int1_type3889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TINYINT_in_int1_type3895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT2_in_int2_type3911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMALLINT_in_int2_type3917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT4_in_int4_type3933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_int4_type3939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_int4_type3949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT8_in_int8_type3965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIGINT_in_int8_type3971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT4_in_float4_type3987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_in_float4_type3993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_float_type4007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_float_type4009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT8_in_float8_type4028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type4034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type4044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PRECISION_in_float8_type4046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERIC_in_number_type4062 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_precision_param_in_number_type4065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_number_type4081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_precision_param_in_number_type4084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_number_type4102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_precision_param_in_number_type4109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_char_type4133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_char_type4135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_char_type4146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_char_type4148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARCHAR_in_varchar_type4165 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_varchar_type4167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_varchar_type4178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_VARYING_in_varchar_type4180 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_varchar_type4182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCHAR_in_nchar_type4199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_nchar_type4201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nchar_type4212 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nchar_type4214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_nchar_type4216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NVARCHAR_in_nvarchar_type4233 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type4235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nvarchar_type4246 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nvarchar_type4248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_VARYING_in_nvarchar_type4250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type4252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMETZ_in_timetz_type4269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timetz_type4275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_WITH_in_timetz_type4277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_TIME_in_timetz_type4279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_ZONE_in_timetz_type4281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMPTZ_in_timestamptz_type4297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_timestamptz_type4303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_WITH_in_timestamptz_type4305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_TIME_in_timestamptz_type4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_ZONE_in_timestamptz_type4309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_binary_type4325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_binary_type4327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBINARY_in_varbinary_type4340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_varbinary_type4342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_varbinary_type4349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_VARYING_in_varbinary_type4351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_length_in_varbinary_type4353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOB_in_blob_type4366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTEA_in_blob_type4372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_sql4390 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_sql4392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_transaction_statement_in_statement4410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_execute_statement_in_statement4418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_execute_immediate_statement_in_statement4426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_statement4434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prepare_statement_in_statement4442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declare_cursor_statement_in_statement4450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_describe_statement_in_statement4458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fetch_statement_in_statement4466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_statement4474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_close_statement_in_statement4482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_transaction_statement4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement4506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_ISOLATION_in_set_transaction_statement4508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LEVEL_in_set_transaction_statement4510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L,0x0000080004008000L});
	public static final BitSet FOLLOW_isolation_level_in_set_transaction_statement4514 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_COMMA_in_set_transaction_statement4517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_read_operation_in_set_transaction_statement4521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SERIALIZABLE_in_isolation_level4562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_no_commit_in_isolation_level4568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_uncommitted_in_isolation_level4574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_committed_in_isolation_level4580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatable_read_in_isolation_level4586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NO_in_no_commit4600 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_COMMIT_in_no_commit4602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_uncommitted4625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_UNCOMMITTED_in_read_uncommitted4627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_committed4646 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_COMMITTED_in_read_committed4648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEATABLE_in_repeatable_read4669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_READ_in_repeatable_read4671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_only_in_read_operation4690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_write_in_read_operation4696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_only4709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_ONLY_in_read_only4711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_write4731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_WRITE_in_read_write4733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXECUTE_in_execute_statement4764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_execute_statement4768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXECUTE_in_execute_immediate_statement4807 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_IMMEDIATE_in_execute_immediate_statement4809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_execute_immediate_statement4813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_in_open_statement4848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_open_statement4852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_USING_in_open_statement4856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_open_statement4860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_open_statement4864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DESCRIPTOR_in_open_statement4866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_open_statement4871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_open_statement4875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PREPARE_in_prepare_statement5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_prepare_statement5050 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_into_clause_in_prepare_statement5053 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_FROM_in_prepare_statement5057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_prepare_statement5061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARE_in_declare_cursor_statement5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_declare_cursor_statement5115 = new BitSet(new long[]{0x0080000000000000L,0x0000020000001000L,0x0000080000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_DYNAMIC_in_declare_cursor_statement5120 = new BitSet(new long[]{0x0080000000000000L,0x0000020000000000L,0x0000080000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_SCROLL_in_declare_cursor_statement5128 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_NO_in_declare_cursor_statement5131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_SCROLL_in_declare_cursor_statement5133 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_CURSOR_in_declare_cursor_statement5138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001800000000L});
	public static final BitSet FOLLOW_WITH_in_declare_cursor_statement5144 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_HOLD_in_declare_cursor_statement5146 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_WITHOUT_in_declare_cursor_statement5150 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_HOLD_in_declare_cursor_statement5152 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_FOR_in_declare_cursor_statement5158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_declare_cursor_statement5162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESCRIBE_in_describe_statement5227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_describe_statement5231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_into_clause_in_describe_statement5233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FETCH_in_fetch_statement5265 = new BitSet(new long[]{0x0040000000100020L,0x0000102000000000L,0x0000040000040000L,0x0000000000400100L});
	public static final BitSet FOLLOW_fetch_position_in_fetch_statement5268 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_FROM_in_fetch_statement5272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_fetch_statement5276 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_fetch_into_in_fetch_statement5279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEXT_in_fetch_position5324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIOR_in_fetch_position5326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_fetch_position5328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_fetch_position5330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEFORE_in_fetch_position5332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AFTER_in_fetch_position5334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURRENT_in_fetch_position5336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELATIVE_in_fetch_position5356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_fetch_position5361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_fetch_position5365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_fetch_in_fetch_into5435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiple_row_fetch_in_fetch_into5443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTO_in_single_fetch5462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_single_fetch5467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_multiple_row_fetch5506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row_fetch5511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_NUMBER_in_multiple_row_fetch5513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_ROWS_in_multiple_row_fetch5516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_multiple_row_into_in_multiple_row_fetch5521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTO_in_multiple_row_into5589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row_into5593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_multiple_row_into5614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DESCRIPTOR_in_multiple_row_into5616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row_into5620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INTO_in_multiple_row_into5622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row_into5626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLOSE_in_close_statement5674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_close_statement5678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTO_in_into_clause5719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Identifier_in_into_clause5724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_Variable_in_into_clause5728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_USING_in_into_clause5732 = new BitSet(new long[]{0x0000000008002100L,0x0000000000000000L,0x0000002000020000L,0x0800000000000000L});
	public static final BitSet FOLLOW_using_target_in_into_clause5736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMES_in_using_target5812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LABELS_in_using_target5814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANY_in_using_target5816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOTH_in_using_target5818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_using_target5820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_system_names_in_using_target5822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYSTEM_in_system_names5835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NAMES_in_system_names5837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_table_elements5860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_field_element_in_table_elements5862 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_COMMA_in_table_elements5865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_field_element_in_table_elements5867 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_table_elements5871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_field_element5895 = new BitSet(new long[]{0x6800000C27E00000L,0x400003C000000400L,0x003001400000007EL,0x0010000000100000L,0x00000000070003E8L});
	public static final BitSet FOLLOW_FOR_in_field_element5898 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_COLUMN_in_field_element5900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_field_element5904 = new BitSet(new long[]{0x6800000C27E00000L,0x400001C000000400L,0x003001400000007EL,0x0010000000100000L,0x00000000070003E8L});
	public static final BitSet FOLLOW_field_type_in_field_element5908 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_not_null_in_field_element5911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_with_default_in_field_element5916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_not_null5966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NULL_in_not_null5968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_with_default5989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_with_default5991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_type_in_field_type6017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_expression_body_in_query_expression6038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_query_expression_body6050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_expression_body6056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_non_join_query_expression6069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_expression6073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression6075 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L,0x0000000000101000L,0x0000010000000000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression6091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression6099 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L,0x0000000000101000L,0x0000010000000000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression6115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_non_join_query_term_in_query_term6129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_term6135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_primary_in_non_join_query_term6149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_term6153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term6155 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L,0x0000000000101000L,0x0000010000000000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term6165 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term6173 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L,0x0000000000101000L,0x0000010000000000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term6183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_non_join_query_primary_in_query_primary6197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_primary6203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_table_in_non_join_query_primary6215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_non_join_query_primary6221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000101000L,0x0000010000000000L});
	public static final BitSet FOLLOW_non_join_query_expression_in_non_join_query_primary6223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_non_join_query_primary6225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_specification_in_simple_table6246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_query_specification6258 = new BitSet(new long[]{0x0101000200000100L,0x0000000000000080L,0x0009100440101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_set_qualifier_in_query_specification6260 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100440101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_select_list_in_query_specification6263 = new BitSet(new long[]{0x0000000000000002L,0x0044100000000000L,0x2000000001000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_from_clause_in_query_specification6265 = new BitSet(new long[]{0x0000000000000002L,0x0044000000000000L,0x2000000001000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_where_clause_in_query_specification6268 = new BitSet(new long[]{0x0000000000000002L,0x0044000000000000L,0x2000000001000000L});
	public static final BitSet FOLLOW_groupby_clause_in_query_specification6271 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x2000000001000000L});
	public static final BitSet FOLLOW_having_clause_in_query_specification6274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000001000000L});
	public static final BitSet FOLLOW_orderby_clause_in_query_specification6281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_limit_clause_in_query_specification6284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTIPLY_in_select_list6334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derived_column_in_select_list6348 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_COMMA_in_select_list6351 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_derived_column_in_select_list6353 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_DISTINCT_in_set_qualifier6376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_set_qualifier6390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_derived_column6410 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_as_clause_in_derived_column6412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_column_reference6440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_as_clause6464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_column_reference_in_as_clause6468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list6479 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_COMMA_in_column_reference_list6482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list6484 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_Identifier_in_table6502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_identifier_in_table6514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_DIVIDE_in_qualified_identifier6531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6535 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_qualified_identifier6538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_qualified_identifier6544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_member6579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_DIVIDE_in_member6581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_member6585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_member6587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_member6591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_member6593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from_clause6628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_table_reference_list_in_from_clause6631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list6642 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_COMMA_in_table_reference_list6645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list6647 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_table_primary_in_table_reference6666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_table_reference6672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_primary_in_joined_table6684 = new BitSet(new long[]{0x0010000000000000L,0x8000200000000000L,0x0000008000084000L,0x0000000080000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table6687 = new BitSet(new long[]{0x0010000000000002L,0x8000200000000000L,0x0000008000084000L,0x0000000080000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table6691 = new BitSet(new long[]{0x0010000000000002L,0x8000200000000000L,0x0000008000084000L,0x0000000080000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_natural_join_in_joined_table6695 = new BitSet(new long[]{0x0010000000000002L,0x8000200000000000L,0x0000008000084000L,0x0000000080000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_union_join_in_joined_table6699 = new BitSet(new long[]{0x0010000000000002L,0x8000200000000000L,0x0000008000084000L,0x0000000080000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table_prim6713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table_prim6719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_natural_join_in_joined_table_prim6725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_union_join_in_joined_table_prim6731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CROSS_in_cross_join6743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_JOIN_in_cross_join6745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_table_primary_in_cross_join6749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_type_in_qualified_join6775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_JOIN_in_qualified_join6779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_table_primary_in_qualified_join6783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_join_specification_in_qualified_join6787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATURAL_in_natural_join6815 = new BitSet(new long[]{0x0000000000000000L,0x8000200000000000L,0x0000000000084000L,0x0000000080000000L});
	public static final BitSet FOLLOW_join_type_in_natural_join6820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_JOIN_in_natural_join6824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_table_primary_in_natural_join6828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNION_in_union_join6855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_JOIN_in_union_join6857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_table_primary_in_union_join6861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNER_in_join_type6884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type6892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OUTER_in_join_type6894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type6911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_condition_in_join_specification6956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_named_columns_join_in_join_specification6962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_condition6974 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_search_condition_in_join_condition6977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_named_columns_join6989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_named_columns_join6991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_column_reference_list_in_named_columns_join6995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_named_columns_join6997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_in_table_primary7018 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_AS_in_table_primary7022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_table_primary7028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause7056 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_search_condition_in_where_clause7059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_routine_invocation7072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7074 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000100200010L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation7076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation7094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7096 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation7098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation7113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_MULTIPLY_in_routine_invocation7117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs7136 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_COMMA_in_funcArgs7139 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs7141 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupby_clause7162 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_BY_in_groupby_clause7164 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000101000L,0x0000000800000000L});
	public static final BitSet FOLLOW_grouping_element_list_in_groupby_clause7168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list7189 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_COMMA_in_grouping_element_list7192 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000101000L,0x0000000800000000L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list7194 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_grouping_element7213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rollup_list_in_grouping_element7219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cube_list_in_grouping_element7225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_grouping_set_in_grouping_element7231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set7243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_ordinary_grouping_set7249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set7252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set7254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROLLUP_in_rollup_list7267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_rollup_list7269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000101000L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_rollup_list7273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_rollup_list7275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CUBE_in_cube_list7296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_cube_list7298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000101000L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_cube_list7302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_cube_list7304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_empty_grouping_set7325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_empty_grouping_set7327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HAVING_in_having_clause7345 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_boolean_value_expression_in_having_clause7348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_orderby_clause7362 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_BY_in_orderby_clause7364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_sort_specifier_list_in_orderby_clause7366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list7386 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_COMMA_in_sort_specifier_list7389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list7391 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_column_reference_in_sort_specifier7416 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000004L,0x0001000000000000L});
	public static final BitSet FOLLOW_order_specification_in_sort_specifier7420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_null_ordering_in_sort_specifier7425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASC_in_order_specification7455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESC_in_order_specification7469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIMIT_in_limit_clause7489 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_value_expression_in_limit_clause7493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering7514 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_FIRST_in_null_ordering7516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering7530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LAST_in_null_ordering7532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_search_condition7554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_param_clause7565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_param_clause7567 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause7569 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_COMMA_in_param_clause7572 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause7574 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_param_clause7578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_param7601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_EQUAL_in_param7603 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_value_expression_in_param7607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_method_specifier7631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_Identifier_in_method_specifier7635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression7655 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_OR_in_boolean_value_expression7658 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression7661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate7674 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_AND_in_and_predicate7677 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate7680 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor7693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_boolean_factor7699 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor7701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_primary_in_boolean_test7721 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_is_clause_in_boolean_test7723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_in_is_clause7736 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000100000000000L,0x0000000000000000L,0x0000000000041000L});
	public static final BitSet FOLLOW_NOT_in_is_clause7738 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000041000L});
	public static final BitSet FOLLOW_truth_value_in_is_clause7743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_boolean_primary7787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_boolean_primary7793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_boolean_primary7799 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_boolean_value_expression_in_boolean_primary7802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_boolean_primary7804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_boolean_primary7811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_predicate7825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_predicate7831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_predicate7837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_predicate_in_predicate7843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate7867 = new BitSet(new long[]{0x0000000000000000L,0x0012000000080000L,0x0000200008200000L});
	public static final BitSet FOLLOW_comp_op_in_comparison_predicate7871 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate7875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_predicate7943 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_NOT_in_in_predicate7946 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_IN_in_in_predicate7949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_in_predicate_value_in_in_predicate7953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_in_predicate_value7977 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_in_value_list_in_in_predicate_value7980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_in_predicate_value7983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list7995 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_COMMA_in_in_value_list8000 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list8002 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_column_reference_in_like_predicate8024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000800000L});
	public static final BitSet FOLLOW_NOT_in_like_predicate8026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LIKE_in_like_predicate8029 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_Character_String_Literal_in_like_predicate8033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_null_predicate8064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_IS_in_null_predicate8066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001100000000000L});
	public static final BitSet FOLLOW_NOT_in_null_predicate8071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NULL_in_null_predicate8075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression8103 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_numeric_value_expression8106 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression8113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_numeric_primary_in_term8126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L,0x0000000500000000L});
	public static final BitSet FOLLOW_set_in_term8129 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_primary_in_term8138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L,0x0000000500000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_array8151 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0009000040000000L,0x0000000000200010L});
	public static final BitSet FOLLOW_literal_in_array8153 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_COMMA_in_array8156 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0009000040000000L,0x0000000000200010L});
	public static final BitSet FOLLOW_literal_in_array8158 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_array8163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_numeric_primary8180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_numeric_primary8185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_numeric_primary8190 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_value_expression_in_numeric_primary8193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_numeric_primary8195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_routine_invocation_in_numeric_primary8201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_value_expr_in_literal8212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signed_numerical_literal_in_literal8218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_literal8224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_string_value_expr8236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sign_in_signed_numerical_literal8248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal8251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_specification_in_case_expression8299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULLIF_in_case_abbreviation8311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation8313 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation8315 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation8317 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation8319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation8322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COALESCE_in_case_abbreviation8328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation8330 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation8332 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation8336 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation8338 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation8344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_case_in_case_specification8356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_searched_case_in_case_specification8362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_simple_case8374 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_case8376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_simple_when_clause_in_simple_case8380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_else_clause_in_simple_case8387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_simple_case8393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_searched_case8405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_searched_when_clause_in_searched_case8409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_else_clause_in_searched_case8414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_searched_case8418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_simple_when_clause8429 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_when_clause8431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_THEN_in_simple_when_clause8433 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_result_in_simple_when_clause8435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_searched_when_clause8445 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_search_condition_in_searched_when_clause8449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_THEN_in_searched_when_clause8451 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_result_in_searched_when_clause8455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_clause8479 = new BitSet(new long[]{0x0101000000000000L,0x0000000000000000L,0x0009000040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_result_in_else_clause8483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_result8504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_result8508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_synpred67_DBL4434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_synpred72_DBL4474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_synpred112_DBL6050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred113_DBL6069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred121_DBL6129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred142_DBL6482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_column_reference_in_synpred142_DBL6484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred185_DBL7787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred186_DBL7793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_synpred187_DBL7799 = new BitSet(new long[]{0x0101000200000000L,0x0000000000000000L,0x0009100040101000L,0x0000000000200010L});
	public static final BitSet FOLLOW_boolean_value_expression_in_synpred187_DBL7802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred187_DBL7804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_synpred188_DBL7825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_synpred189_DBL7831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_synpred190_DBL7837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred221_DBL8504 = new BitSet(new long[]{0x0000000000000002L});
}
