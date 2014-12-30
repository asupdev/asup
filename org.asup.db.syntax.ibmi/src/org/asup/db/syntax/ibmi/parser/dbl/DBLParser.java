// $ANTLR 3.5.1 DBL.g 2014-12-30 10:23:31

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
		"CHAR", "CHARACTER", "CHAR_SPECIAL", "CLOSE", "CLOSE_STATEMENT", "COALESCE", 
		"COLUMN", "COLUMNS_LIST", "COLUMN_NAME", "COMMA", "COMMENT", "COMMIT", 
		"COMMITTED", "CONNECT", "CONNECTION", "COUNT", "COUNT_ROWS", "COUNT_VAL", 
		"CREATE", "CROSS", "CUBE", "CURRENT", "CURSOR", "Character_String_Literal", 
		"Control_Characters", "D", "DATE", "DB_NAME", "DEC", "DECIMAL", "DECLARE", 
		"DECLARE_CURSOR_STATEMENT", "DEFAULT", "DESC", "DESCRIBE", "DESCRIBE_STATEMENT", 
		"DESCRIPTOR", "DISCONNECT", "DISTINCT", "DIVIDE", "DOT", "DOUBLE", "DROP", 
		"DYNAMIC", "Digit", "Double_Quote", "E", "ELSE", "EMPTY_GROUPING_SET", 
		"END", "EQUAL", "ESC_SEQ", "EXCEPT", "EXCLUSIVE", "EXECUTE", "EXECUTE_IMMEDIATE_STATEMENT", 
		"EXECUTE_STATEMENT", "EXPONENT", "EXTERNAL", "Extended_Control_Characters", 
		"F", "FALSE", "FETCH", "FETCH_POSITION", "FETCH_STATEMENT", "FIELD_DEF", 
		"FIELD_NAME", "FIELD_TYPE", "FIRST", "FLOAT", "FLOAT4", "FLOAT8", "FOR", 
		"FORMAT", "FOR_COLUMN", "FROM", "FULL", "FUNCTION", "FUNC_ARGS", "G", 
		"GEQ", "GROUP", "GROUP_BY", "GTH", "H", "HAVING", "HEX_DIGIT", "HOLD", 
		"I", "IMMEDIATE", "IN", "INDEX", "INDEX_NAME", "INET4", "INNER", "INSERT", 
		"INT", "INT1", "INT2", "INT4", "INT8", "INTEGER", "INTERSECT", "INTO", 
		"IS", "ISOLATION", "ISOLATION_LEVEL", "Identifier", "J", "JOIN", "K", 
		"L", "LABELS", "LAST", "LEFT", "LEFT_PAREN", "LEQ", "LEVEL", "LIKE", "LIMIT", 
		"LOCATION", "LOCK", "LTH", "M", "MEMBER", "MINUS", "MODE", "MODULAR", 
		"MULTIPLE_ROW_FETCH", "MULTIPLY", "N", "NAME", "NAMES", "NATIONAL", "NATURAL", 
		"NCHAR", "NEW_NAME", "NEXT", "NO", "NOT", "NOT_EQUAL", "NOT_NULL", "NO_COMMIT", 
		"NO_SCROLL", "NULL", "NULLIF", "NULL_ORDER", "NUMBER", "NUMERIC", "NVARCHAR", 
		"O", "OCTAL_ESC", "ON", "ONLY", "OPEN", "OPEN_STATEMENT", "OR", "ORDER", 
		"ORDER_BY", "OR_REPLACE", "OUTER", "P", "PARAM", "PARAMS", "PLUS", "PRECISION", 
		"PREPARE", "PREPARE_STATEMENT", "PRIOR", "PROCEDURE_ARGS", "PROCEDURE_NAME", 
		"Q", "QUALIFIED", "Quote", "R", "READ", "READ_COMMITTED", "READ_ONLY", 
		"READ_UNCOMMITTED", "READ_WRITE", "REAL", "REAL_NUMBER", "RELATIVE", "RELEASE", 
		"RELEASE_STATEMENT", "RENAME", "REPEATABLE", "REPEATABLE_READ", "REPLACE", 
		"RESET", "RESTRICT", "RIGHT", "RIGHT_PAREN", "ROLLBACK", "ROLLBACK_STATEMENT", 
		"ROLLUP", "ROWS", "RW_OPERATION", "S", "SCROLL", "SELECT", "SEL_LIST", 
		"SEMI_COLON", "SERIALIZABLE", "SERVER_NAME", "SET", "SET_QUALIFIER", "SET_TRANSACTION_STATEMENT", 
		"SHARE", "SHOW_FUNCTION", "SHOW_TABLE", "SINGLE_FETCH", "SMALLINT", "SORT_KEY", 
		"SORT_SPECIFIERS", "SQL", "STATEMENT", "STORE", "STORE_TYPE", "SYSTEM", 
		"SYSTEM_NAMES", "Space", "T", "TABLE", "TABLE_DEF", "TABLE_NAME", "TARGET_FIELDS", 
		"TEXT", "THEN", "TIME", "TIMESTAMP", "TIMESTAMPTZ", "TIMETZ", "TINYINT", 
		"TO", "TRANSACTION", "TRUE", "U", "UNCOMMITTED", "UNICODE_ESC", "UNION", 
		"UNIQUE", "UNKNOWN", "USER", "USING", "USING_DESCRIPTOR", "V", "VALUES", 
		"VARBINARY", "VARBIT", "VARCHAR", "VARIABLE", "VARYING", "VIEW", "VIEW_NAME", 
		"Variable", "W", "WHEN", "WHERE", "WITH", "WITHOUT", "WITHOUT_HOLD", "WITH_DEFAULT", 
		"WITH_HOLD", "WORK", "WRITE", "White_Space", "X", "Y", "Z", "ZONE"
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
	public static final int CHAR_SPECIAL=36;
	public static final int CLOSE=37;
	public static final int CLOSE_STATEMENT=38;
	public static final int COALESCE=39;
	public static final int COLUMN=40;
	public static final int COLUMNS_LIST=41;
	public static final int COLUMN_NAME=42;
	public static final int COMMA=43;
	public static final int COMMENT=44;
	public static final int COMMIT=45;
	public static final int COMMITTED=46;
	public static final int CONNECT=47;
	public static final int CONNECTION=48;
	public static final int COUNT=49;
	public static final int COUNT_ROWS=50;
	public static final int COUNT_VAL=51;
	public static final int CREATE=52;
	public static final int CROSS=53;
	public static final int CUBE=54;
	public static final int CURRENT=55;
	public static final int CURSOR=56;
	public static final int Character_String_Literal=57;
	public static final int Control_Characters=58;
	public static final int D=59;
	public static final int DATE=60;
	public static final int DB_NAME=61;
	public static final int DEC=62;
	public static final int DECIMAL=63;
	public static final int DECLARE=64;
	public static final int DECLARE_CURSOR_STATEMENT=65;
	public static final int DEFAULT=66;
	public static final int DESC=67;
	public static final int DESCRIBE=68;
	public static final int DESCRIBE_STATEMENT=69;
	public static final int DESCRIPTOR=70;
	public static final int DISCONNECT=71;
	public static final int DISTINCT=72;
	public static final int DIVIDE=73;
	public static final int DOT=74;
	public static final int DOUBLE=75;
	public static final int DROP=76;
	public static final int DYNAMIC=77;
	public static final int Digit=78;
	public static final int Double_Quote=79;
	public static final int E=80;
	public static final int ELSE=81;
	public static final int EMPTY_GROUPING_SET=82;
	public static final int END=83;
	public static final int EQUAL=84;
	public static final int ESC_SEQ=85;
	public static final int EXCEPT=86;
	public static final int EXCLUSIVE=87;
	public static final int EXECUTE=88;
	public static final int EXECUTE_IMMEDIATE_STATEMENT=89;
	public static final int EXECUTE_STATEMENT=90;
	public static final int EXPONENT=91;
	public static final int EXTERNAL=92;
	public static final int Extended_Control_Characters=93;
	public static final int F=94;
	public static final int FALSE=95;
	public static final int FETCH=96;
	public static final int FETCH_POSITION=97;
	public static final int FETCH_STATEMENT=98;
	public static final int FIELD_DEF=99;
	public static final int FIELD_NAME=100;
	public static final int FIELD_TYPE=101;
	public static final int FIRST=102;
	public static final int FLOAT=103;
	public static final int FLOAT4=104;
	public static final int FLOAT8=105;
	public static final int FOR=106;
	public static final int FORMAT=107;
	public static final int FOR_COLUMN=108;
	public static final int FROM=109;
	public static final int FULL=110;
	public static final int FUNCTION=111;
	public static final int FUNC_ARGS=112;
	public static final int G=113;
	public static final int GEQ=114;
	public static final int GROUP=115;
	public static final int GROUP_BY=116;
	public static final int GTH=117;
	public static final int H=118;
	public static final int HAVING=119;
	public static final int HEX_DIGIT=120;
	public static final int HOLD=121;
	public static final int I=122;
	public static final int IMMEDIATE=123;
	public static final int IN=124;
	public static final int INDEX=125;
	public static final int INDEX_NAME=126;
	public static final int INET4=127;
	public static final int INNER=128;
	public static final int INSERT=129;
	public static final int INT=130;
	public static final int INT1=131;
	public static final int INT2=132;
	public static final int INT4=133;
	public static final int INT8=134;
	public static final int INTEGER=135;
	public static final int INTERSECT=136;
	public static final int INTO=137;
	public static final int IS=138;
	public static final int ISOLATION=139;
	public static final int ISOLATION_LEVEL=140;
	public static final int Identifier=141;
	public static final int J=142;
	public static final int JOIN=143;
	public static final int K=144;
	public static final int L=145;
	public static final int LABELS=146;
	public static final int LAST=147;
	public static final int LEFT=148;
	public static final int LEFT_PAREN=149;
	public static final int LEQ=150;
	public static final int LEVEL=151;
	public static final int LIKE=152;
	public static final int LIMIT=153;
	public static final int LOCATION=154;
	public static final int LOCK=155;
	public static final int LTH=156;
	public static final int M=157;
	public static final int MEMBER=158;
	public static final int MINUS=159;
	public static final int MODE=160;
	public static final int MODULAR=161;
	public static final int MULTIPLE_ROW_FETCH=162;
	public static final int MULTIPLY=163;
	public static final int N=164;
	public static final int NAME=165;
	public static final int NAMES=166;
	public static final int NATIONAL=167;
	public static final int NATURAL=168;
	public static final int NCHAR=169;
	public static final int NEW_NAME=170;
	public static final int NEXT=171;
	public static final int NO=172;
	public static final int NOT=173;
	public static final int NOT_EQUAL=174;
	public static final int NOT_NULL=175;
	public static final int NO_COMMIT=176;
	public static final int NO_SCROLL=177;
	public static final int NULL=178;
	public static final int NULLIF=179;
	public static final int NULL_ORDER=180;
	public static final int NUMBER=181;
	public static final int NUMERIC=182;
	public static final int NVARCHAR=183;
	public static final int O=184;
	public static final int OCTAL_ESC=185;
	public static final int ON=186;
	public static final int ONLY=187;
	public static final int OPEN=188;
	public static final int OPEN_STATEMENT=189;
	public static final int OR=190;
	public static final int ORDER=191;
	public static final int ORDER_BY=192;
	public static final int OR_REPLACE=193;
	public static final int OUTER=194;
	public static final int P=195;
	public static final int PARAM=196;
	public static final int PARAMS=197;
	public static final int PLUS=198;
	public static final int PRECISION=199;
	public static final int PREPARE=200;
	public static final int PREPARE_STATEMENT=201;
	public static final int PRIOR=202;
	public static final int PROCEDURE_ARGS=203;
	public static final int PROCEDURE_NAME=204;
	public static final int Q=205;
	public static final int QUALIFIED=206;
	public static final int Quote=207;
	public static final int R=208;
	public static final int READ=209;
	public static final int READ_COMMITTED=210;
	public static final int READ_ONLY=211;
	public static final int READ_UNCOMMITTED=212;
	public static final int READ_WRITE=213;
	public static final int REAL=214;
	public static final int REAL_NUMBER=215;
	public static final int RELATIVE=216;
	public static final int RELEASE=217;
	public static final int RELEASE_STATEMENT=218;
	public static final int RENAME=219;
	public static final int REPEATABLE=220;
	public static final int REPEATABLE_READ=221;
	public static final int REPLACE=222;
	public static final int RESET=223;
	public static final int RESTRICT=224;
	public static final int RIGHT=225;
	public static final int RIGHT_PAREN=226;
	public static final int ROLLBACK=227;
	public static final int ROLLBACK_STATEMENT=228;
	public static final int ROLLUP=229;
	public static final int ROWS=230;
	public static final int RW_OPERATION=231;
	public static final int S=232;
	public static final int SCROLL=233;
	public static final int SELECT=234;
	public static final int SEL_LIST=235;
	public static final int SEMI_COLON=236;
	public static final int SERIALIZABLE=237;
	public static final int SERVER_NAME=238;
	public static final int SET=239;
	public static final int SET_QUALIFIER=240;
	public static final int SET_TRANSACTION_STATEMENT=241;
	public static final int SHARE=242;
	public static final int SHOW_FUNCTION=243;
	public static final int SHOW_TABLE=244;
	public static final int SINGLE_FETCH=245;
	public static final int SMALLINT=246;
	public static final int SORT_KEY=247;
	public static final int SORT_SPECIFIERS=248;
	public static final int SQL=249;
	public static final int STATEMENT=250;
	public static final int STORE=251;
	public static final int STORE_TYPE=252;
	public static final int SYSTEM=253;
	public static final int SYSTEM_NAMES=254;
	public static final int Space=255;
	public static final int T=256;
	public static final int TABLE=257;
	public static final int TABLE_DEF=258;
	public static final int TABLE_NAME=259;
	public static final int TARGET_FIELDS=260;
	public static final int TEXT=261;
	public static final int THEN=262;
	public static final int TIME=263;
	public static final int TIMESTAMP=264;
	public static final int TIMESTAMPTZ=265;
	public static final int TIMETZ=266;
	public static final int TINYINT=267;
	public static final int TO=268;
	public static final int TRANSACTION=269;
	public static final int TRUE=270;
	public static final int U=271;
	public static final int UNCOMMITTED=272;
	public static final int UNICODE_ESC=273;
	public static final int UNION=274;
	public static final int UNIQUE=275;
	public static final int UNKNOWN=276;
	public static final int USER=277;
	public static final int USING=278;
	public static final int USING_DESCRIPTOR=279;
	public static final int V=280;
	public static final int VALUES=281;
	public static final int VARBINARY=282;
	public static final int VARBIT=283;
	public static final int VARCHAR=284;
	public static final int VARIABLE=285;
	public static final int VARYING=286;
	public static final int VIEW=287;
	public static final int VIEW_NAME=288;
	public static final int Variable=289;
	public static final int W=290;
	public static final int WHEN=291;
	public static final int WHERE=292;
	public static final int WITH=293;
	public static final int WITHOUT=294;
	public static final int WITHOUT_HOLD=295;
	public static final int WITH_DEFAULT=296;
	public static final int WITH_HOLD=297;
	public static final int WORK=298;
	public static final int WRITE=299;
	public static final int White_Space=300;
	public static final int X=301;
	public static final int Y=302;
	public static final int Z=303;
	public static final int ZONE=304;

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
		this.state.ruleMemo = new HashMap[368+1];


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


	public static class data_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "data_type"
	// DBL.g:363:1: data_type : ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type );
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

			// DBL.g:364:3: ( boolean_type | bit_type | varbit_type | binary_type | varbinary_type | blob_type | INET4 | character_string_type | datetime_type | numeric_type )
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
					// DBL.g:364:5: boolean_type
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
					// DBL.g:365:5: bit_type
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
					// DBL.g:366:5: varbit_type
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
					// DBL.g:367:5: binary_type
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
					// DBL.g:368:5: varbinary_type
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
					// DBL.g:369:5: blob_type
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
					// DBL.g:370:5: INET4
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
					// DBL.g:371:5: character_string_type
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
					// DBL.g:372:5: datetime_type
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
					// DBL.g:373:5: numeric_type
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
	// DBL.g:375:1: character_string_type : ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT );
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

			// DBL.g:376:3: ( char_type | varchar_type | nchar_type | nvarchar_type | TEXT )
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
					// DBL.g:376:5: char_type
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
					// DBL.g:377:5: varchar_type
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
					// DBL.g:378:5: nchar_type
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
					// DBL.g:379:5: nvarchar_type
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
					// DBL.g:380:5: TEXT
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
	// DBL.g:382:1: numeric_type : ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type );
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

			// DBL.g:383:3: ( int1_type | int2_type | int4_type | int8_type | float4_type | float_type | float8_type | number_type )
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
					// DBL.g:383:5: int1_type
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
					// DBL.g:384:5: int2_type
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
					// DBL.g:385:5: int4_type
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
					// DBL.g:386:5: int8_type
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
					// DBL.g:387:5: float4_type
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
					// DBL.g:388:5: float_type
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
					// DBL.g:389:5: float8_type
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
					// DBL.g:390:5: number_type
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
	// DBL.g:392:1: datetime_type : ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type );
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

			// DBL.g:393:3: ( DATE | TIME | timetz_type | TIMESTAMP | timestamptz_type )
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
					// DBL.g:393:5: DATE
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
					// DBL.g:394:5: TIME
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
					// DBL.g:395:5: timetz_type
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
					// DBL.g:396:5: TIMESTAMP
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
					// DBL.g:397:5: timestamptz_type
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
	// DBL.g:399:1: precision_param : ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !);
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

			// DBL.g:400:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !| LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !)
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
					// DBL.g:400:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
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
					// DBL.g:401:5: LEFT_PAREN ! NUMBER COMMA ! NUMBER RIGHT_PAREN !
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
	// DBL.g:403:1: type_length : LEFT_PAREN ! NUMBER RIGHT_PAREN !;
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

			// DBL.g:404:3: ( LEFT_PAREN ! NUMBER RIGHT_PAREN !)
			// DBL.g:404:5: LEFT_PAREN ! NUMBER RIGHT_PAREN !
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
	// DBL.g:406:1: boolean_type : ( BOOLEAN | BOOL -> BOOLEAN );
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

			// DBL.g:407:3: ( BOOLEAN | BOOL -> BOOLEAN )
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
					// DBL.g:407:5: BOOLEAN
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
					// DBL.g:408:5: BOOL
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
					// 408:10: -> BOOLEAN
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
	// DBL.g:410:1: bit_type : BIT ( type_length )? -> BIT ;
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

			// DBL.g:411:3: ( BIT ( type_length )? -> BIT )
			// DBL.g:411:5: BIT ( type_length )?
			{
			BIT42=(Token)match(input,BIT,FOLLOW_BIT_in_bit_type3836); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BIT.add(BIT42);

			// DBL.g:411:9: ( type_length )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LEFT_PAREN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// DBL.g:411:9: type_length
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
			// 411:22: -> BIT
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
	// DBL.g:413:1: varbit_type : ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT );
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

			// DBL.g:414:3: ( VARBIT ( type_length )? -> VARBIT | BIT VARYING ( type_length )? -> VARBIT )
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
					// DBL.g:414:5: VARBIT ( type_length )?
					{
					VARBIT44=(Token)match(input,VARBIT,FOLLOW_VARBIT_in_varbit_type3855); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARBIT.add(VARBIT44);

					// DBL.g:414:12: ( type_length )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LEFT_PAREN) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// DBL.g:414:12: type_length
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
					// 414:25: -> VARBIT
					{
						adaptor.addChild(root_0, stream_VARBIT.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:415:5: BIT VARYING ( type_length )?
					{
					BIT46=(Token)match(input,BIT,FOLLOW_BIT_in_varbit_type3868); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BIT.add(BIT46);

					VARYING47=(Token)match(input,VARYING,FOLLOW_VARYING_in_varbit_type3870); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING47);

					// DBL.g:415:17: ( type_length )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==LEFT_PAREN) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// DBL.g:415:17: type_length
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
					// 415:30: -> VARBIT
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
	// DBL.g:417:1: int1_type : ( INT1 | TINYINT -> INT1 );
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

			// DBL.g:418:3: ( INT1 | TINYINT -> INT1 )
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
					// DBL.g:418:5: INT1
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
					// DBL.g:419:5: TINYINT
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
					// 419:13: -> INT1
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
	// DBL.g:421:1: int2_type : ( INT2 | SMALLINT -> INT2 );
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

			// DBL.g:422:3: ( INT2 | SMALLINT -> INT2 )
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
					// DBL.g:422:5: INT2
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
					// DBL.g:423:5: SMALLINT
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
					// 423:14: -> INT2
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
	// DBL.g:425:1: int4_type : ( INT4 | INT -> INT4 | INTEGER -> INT4 );
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

			// DBL.g:426:3: ( INT4 | INT -> INT4 | INTEGER -> INT4 )
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
					// DBL.g:426:5: INT4
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
					// DBL.g:427:5: INT
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
					// 427:9: -> INT4
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INT4, "INT4"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DBL.g:428:5: INTEGER
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
					// 428:13: -> INT4
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
	// DBL.g:430:1: int8_type : ( INT8 | BIGINT -> INT8 );
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

			// DBL.g:431:3: ( INT8 | BIGINT -> INT8 )
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
					// DBL.g:431:5: INT8
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
					// DBL.g:432:5: BIGINT
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
					// 432:12: -> INT8
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
	// DBL.g:434:1: float4_type : ( FLOAT4 | REAL -> FLOAT4 );
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

			// DBL.g:435:3: ( FLOAT4 | REAL -> FLOAT4 )
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
					// DBL.g:435:5: FLOAT4
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
					// DBL.g:436:5: REAL
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
					// 436:10: -> FLOAT4
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
	// DBL.g:438:1: float_type : FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) ;
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

			// DBL.g:438:12: ( FLOAT ( type_length )? -> ^( FLOAT ( type_length )? ) )
			// DBL.g:438:14: FLOAT ( type_length )?
			{
			FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_float_type4007); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT60);

			// DBL.g:438:20: ( type_length )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LEFT_PAREN) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// DBL.g:438:20: type_length
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
			// 438:33: -> ^( FLOAT ( type_length )? )
			{
				// DBL.g:438:36: ^( FLOAT ( type_length )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_FLOAT.nextNode(), root_1);
				// DBL.g:438:44: ( type_length )?
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
	// DBL.g:439:1: float8_type : ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 );
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

			// DBL.g:440:3: ( FLOAT8 | DOUBLE -> FLOAT8 | DOUBLE PRECISION -> FLOAT8 )
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
					// DBL.g:440:5: FLOAT8
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
					// DBL.g:441:5: DOUBLE
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
					// 441:12: -> FLOAT8
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT8, "FLOAT8"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// DBL.g:442:5: DOUBLE PRECISION
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
					// 442:22: -> FLOAT8
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
	// DBL.g:444:1: number_type : ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) );
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

			// DBL.g:445:3: ( NUMERIC ( precision_param )? -> ^( NUMERIC precision_param ) | DECIMAL ( precision_param )? -> ^( NUMERIC precision_param ) | DEC ( precision_param )? -> ^( NUMERIC precision_param ) )
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
					// DBL.g:445:5: NUMERIC ( precision_param )?
					{
					NUMERIC66=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_number_type4062); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMERIC.add(NUMERIC66);

					// DBL.g:445:13: ( precision_param )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==LEFT_PAREN) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// DBL.g:445:14: precision_param
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
					// 445:32: -> ^( NUMERIC precision_param )
					{
						// DBL.g:445:35: ^( NUMERIC precision_param )
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
					// DBL.g:446:5: DECIMAL ( precision_param )?
					{
					DECIMAL68=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_number_type4081); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DECIMAL.add(DECIMAL68);

					// DBL.g:446:13: ( precision_param )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LEFT_PAREN) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// DBL.g:446:14: precision_param
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
					// 446:32: -> ^( NUMERIC precision_param )
					{
						// DBL.g:446:35: ^( NUMERIC precision_param )
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
					// DBL.g:447:5: DEC ( precision_param )?
					{
					DEC70=(Token)match(input,DEC,FOLLOW_DEC_in_number_type4102); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEC.add(DEC70);

					// DBL.g:447:13: ( precision_param )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LEFT_PAREN) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// DBL.g:447:14: precision_param
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
					// 447:32: -> ^( NUMERIC precision_param )
					{
						// DBL.g:447:35: ^( NUMERIC precision_param )
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
	// DBL.g:449:1: char_type : ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR );
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

			// DBL.g:450:3: ( CHAR ( type_length )? -> CHAR | CHARACTER ( type_length )? -> CHAR )
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
					// DBL.g:450:5: CHAR ( type_length )?
					{
					CHAR72=(Token)match(input,CHAR,FOLLOW_CHAR_in_char_type4133); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHAR.add(CHAR72);

					// DBL.g:450:10: ( type_length )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==LEFT_PAREN) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// DBL.g:450:10: type_length
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
					// 450:23: -> CHAR
					{
						adaptor.addChild(root_0, stream_CHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:451:5: CHARACTER ( type_length )?
					{
					CHARACTER74=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_char_type4146); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER74);

					// DBL.g:451:15: ( type_length )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LEFT_PAREN) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// DBL.g:451:15: type_length
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
					// 451:28: -> CHAR
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
	// DBL.g:453:1: varchar_type : ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR );
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

			// DBL.g:454:3: ( VARCHAR ( type_length )? -> VARCHAR | CHARACTER VARYING ( type_length )? -> VARCHAR )
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
					// DBL.g:454:5: VARCHAR ( type_length )?
					{
					VARCHAR76=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_varchar_type4165); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARCHAR.add(VARCHAR76);

					// DBL.g:454:13: ( type_length )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==LEFT_PAREN) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// DBL.g:454:13: type_length
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
					// 454:26: -> VARCHAR
					{
						adaptor.addChild(root_0, stream_VARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:455:5: CHARACTER VARYING ( type_length )?
					{
					CHARACTER78=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_varchar_type4178); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER78);

					VARYING79=(Token)match(input,VARYING,FOLLOW_VARYING_in_varchar_type4180); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING79);

					// DBL.g:455:23: ( type_length )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==LEFT_PAREN) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// DBL.g:455:23: type_length
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
					// 455:36: -> VARCHAR
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
	// DBL.g:457:1: nchar_type : ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR );
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

			// DBL.g:458:3: ( NCHAR ( type_length )? -> NCHAR | NATIONAL CHARACTER ( type_length )? -> NCHAR )
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
					// DBL.g:458:5: NCHAR ( type_length )?
					{
					NCHAR81=(Token)match(input,NCHAR,FOLLOW_NCHAR_in_nchar_type4199); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCHAR.add(NCHAR81);

					// DBL.g:458:11: ( type_length )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LEFT_PAREN) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// DBL.g:458:11: type_length
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
					// 458:24: -> NCHAR
					{
						adaptor.addChild(root_0, stream_NCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:459:5: NATIONAL CHARACTER ( type_length )?
					{
					NATIONAL83=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nchar_type4212); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL83);

					CHARACTER84=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nchar_type4214); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER84);

					// DBL.g:459:24: ( type_length )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==LEFT_PAREN) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// DBL.g:459:24: type_length
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
					// 459:37: -> NCHAR
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
	// DBL.g:461:1: nvarchar_type : ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR );
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

			// DBL.g:462:3: ( NVARCHAR ( type_length )? -> NVARCHAR | NATIONAL CHARACTER VARYING ( type_length )? -> NVARCHAR )
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
					// DBL.g:462:5: NVARCHAR ( type_length )?
					{
					NVARCHAR86=(Token)match(input,NVARCHAR,FOLLOW_NVARCHAR_in_nvarchar_type4233); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NVARCHAR.add(NVARCHAR86);

					// DBL.g:462:14: ( type_length )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==LEFT_PAREN) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// DBL.g:462:14: type_length
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
					// 462:27: -> NVARCHAR
					{
						adaptor.addChild(root_0, stream_NVARCHAR.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:463:5: NATIONAL CHARACTER VARYING ( type_length )?
					{
					NATIONAL88=(Token)match(input,NATIONAL,FOLLOW_NATIONAL_in_nvarchar_type4246); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NATIONAL.add(NATIONAL88);

					CHARACTER89=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_nvarchar_type4248); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER89);

					VARYING90=(Token)match(input,VARYING,FOLLOW_VARYING_in_nvarchar_type4250); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARYING.add(VARYING90);

					// DBL.g:463:32: ( type_length )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==LEFT_PAREN) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// DBL.g:463:32: type_length
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
					// 463:45: -> NVARCHAR
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
	// DBL.g:465:1: timetz_type : ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ );
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

			// DBL.g:466:3: ( TIMETZ | TIME WITH TIME ZONE -> TIMETZ )
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
					// DBL.g:466:5: TIMETZ
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
					// DBL.g:467:5: TIME WITH TIME ZONE
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
					// 467:25: -> TIMETZ
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
	// DBL.g:469:1: timestamptz_type : ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ );
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

			// DBL.g:470:3: ( TIMESTAMPTZ | TIMESTAMP WITH TIME ZONE -> TIMESTAMPTZ )
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
					// DBL.g:470:5: TIMESTAMPTZ
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
					// DBL.g:471:5: TIMESTAMP WITH TIME ZONE
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
					// 471:30: -> TIMESTAMPTZ
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
	// DBL.g:473:1: binary_type : BINARY ( type_length )? ;
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

			// DBL.g:474:3: ( BINARY ( type_length )? )
			// DBL.g:474:5: BINARY ( type_length )?
			{
			root_0 = (CommonTree)adaptor.nil();


			BINARY102=(Token)match(input,BINARY,FOLLOW_BINARY_in_binary_type4325); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BINARY102_tree = (CommonTree)adaptor.create(BINARY102);
			adaptor.addChild(root_0, BINARY102_tree);
			}

			// DBL.g:474:12: ( type_length )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==LEFT_PAREN) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// DBL.g:474:12: type_length
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
	// DBL.g:476:1: varbinary_type : ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? );
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

			// DBL.g:477:3: ( VARBINARY ( type_length )? | BINARY VARYING ( type_length )? )
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
					// DBL.g:477:5: VARBINARY ( type_length )?
					{
					root_0 = (CommonTree)adaptor.nil();


					VARBINARY104=(Token)match(input,VARBINARY,FOLLOW_VARBINARY_in_varbinary_type4340); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARBINARY104_tree = (CommonTree)adaptor.create(VARBINARY104);
					adaptor.addChild(root_0, VARBINARY104_tree);
					}

					// DBL.g:477:15: ( type_length )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==LEFT_PAREN) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// DBL.g:477:15: type_length
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
					// DBL.g:478:5: BINARY VARYING ( type_length )?
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

					// DBL.g:478:20: ( type_length )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==LEFT_PAREN) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// DBL.g:478:20: type_length
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
	// DBL.g:480:1: blob_type : ( BLOB | BYTEA -> BLOB );
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

			// DBL.g:481:3: ( BLOB | BYTEA -> BLOB )
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
					// DBL.g:481:5: BLOB
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
					// DBL.g:482:5: BYTEA
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
					// 482:11: -> BLOB
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
	// DBL.g:489:1: sql : statement EOF ;
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

			// DBL.g:490:3: ( statement EOF )
			// DBL.g:490:5: statement EOF
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
	// DBL.g:493:1: statement : ( set_transaction_statement | execute_statement | execute_immediate_statement | open_statement | prepare_statement | declare_cursor_statement | describe_statement | fetch_statement | open_statement | close_statement );
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

			// DBL.g:494:3: ( set_transaction_statement | execute_statement | execute_immediate_statement | open_statement | prepare_statement | declare_cursor_statement | describe_statement | fetch_statement | open_statement | close_statement )
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
					// DBL.g:495:3: set_transaction_statement
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
					// DBL.g:497:3: execute_statement
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
					// DBL.g:499:3: execute_immediate_statement
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
					// DBL.g:501:3: open_statement
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
					// DBL.g:503:3: prepare_statement
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
					// DBL.g:505:3: declare_cursor_statement
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
					// DBL.g:507:3: describe_statement
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
					// DBL.g:509:3: fetch_statement
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
					// DBL.g:511:3: open_statement
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
					// DBL.g:513:3: close_statement
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
	// DBL.g:517:2: set_transaction_statement : SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) ;
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

			// DBL.g:518:2: ( SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )? -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? ) )
			// DBL.g:519:2: SET TRANSACTION ISOLATION LEVEL i= isolation_level ( COMMA r= read_operation )?
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
			// DBL.g:519:52: ( COMMA r= read_operation )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==COMMA) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// DBL.g:519:53: COMMA r= read_operation
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
			// 519:78: -> ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
			{
				// DBL.g:521:2: ^( SET_TRANSACTION_STATEMENT ^( ISOLATION_LEVEL $i) ( ^( RW_OPERATION $r) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_TRANSACTION_STATEMENT, "SET_TRANSACTION_STATEMENT"), root_1);
				// DBL.g:521:30: ^( ISOLATION_LEVEL $i)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ISOLATION_LEVEL, "ISOLATION_LEVEL"), root_2);
				adaptor.addChild(root_2, stream_i.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:521:52: ( ^( RW_OPERATION $r) )?
				if ( stream_r.hasNext() ) {
					// DBL.g:521:53: ^( RW_OPERATION $r)
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
	// DBL.g:524:1: isolation_level : ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read );
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

			// DBL.g:525:2: ( SERIALIZABLE | no_commit | read_uncommitted | read_committed | repeatable_read )
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
					// DBL.g:526:2: SERIALIZABLE
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
					// DBL.g:528:2: no_commit
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
					// DBL.g:530:2: read_uncommitted
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
					// DBL.g:532:2: read_committed
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
					// DBL.g:534:2: repeatable_read
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
	// DBL.g:537:1: no_commit : NO COMMIT -> ^( NO_COMMIT ) ;
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

			// DBL.g:538:2: ( NO COMMIT -> ^( NO_COMMIT ) )
			// DBL.g:539:2: NO COMMIT
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
			// 539:12: -> ^( NO_COMMIT )
			{
				// DBL.g:539:15: ^( NO_COMMIT )
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
	// DBL.g:542:1: read_uncommitted : READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) ;
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

			// DBL.g:543:2: ( READ UNCOMMITTED -> ^( READ_UNCOMMITTED ) )
			// DBL.g:544:2: READ UNCOMMITTED
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
			// 544:19: -> ^( READ_UNCOMMITTED )
			{
				// DBL.g:544:22: ^( READ_UNCOMMITTED )
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
	// DBL.g:547:1: read_committed : READ COMMITTED -> ^( READ_COMMITTED ) ;
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

			// DBL.g:548:2: ( READ COMMITTED -> ^( READ_COMMITTED ) )
			// DBL.g:549:2: READ COMMITTED
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
			// 549:17: -> ^( READ_COMMITTED )
			{
				// DBL.g:549:20: ^( READ_COMMITTED )
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
	// DBL.g:552:1: repeatable_read : REPEATABLE READ -> ^( REPEATABLE_READ ) ;
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

			// DBL.g:553:2: ( REPEATABLE READ -> ^( REPEATABLE_READ ) )
			// DBL.g:554:2: REPEATABLE READ
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
			// 554:18: -> ^( REPEATABLE_READ )
			{
				// DBL.g:554:21: ^( REPEATABLE_READ )
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
	// DBL.g:557:1: read_operation : ( read_only | read_write );
	public final DBLParser.read_operation_return read_operation() throws RecognitionException {
		DBLParser.read_operation_return retval = new DBLParser.read_operation_return();
		retval.start = input.LT(1);
		int read_operation_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope read_only141 =null;
		ParserRuleReturnScope read_write142 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// DBL.g:558:2: ( read_only | read_write )
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
					// DBL.g:559:2: read_only
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
					// DBL.g:561:2: read_write
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
	// DBL.g:564:1: read_only : READ ONLY -> ^( READ_ONLY ) ;
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

			// DBL.g:565:2: ( READ ONLY -> ^( READ_ONLY ) )
			// DBL.g:566:2: READ ONLY
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
			// 566:12: -> ^( READ_ONLY )
			{
				// DBL.g:566:15: ^( READ_ONLY )
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
	// DBL.g:569:1: read_write : READ WRITE -> ^( READ_WRITE ) ;
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

			// DBL.g:570:2: ( READ WRITE -> ^( READ_WRITE ) )
			// DBL.g:571:2: READ WRITE
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
			// 571:13: -> ^( READ_WRITE )
			{
				// DBL.g:571:16: ^( READ_WRITE )
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
	// DBL.g:577:2: execute_statement : EXECUTE s= Identifier -> ^( EXECUTE_STATEMENT ^( STATEMENT $s) ) ;
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

			// DBL.g:578:3: ( EXECUTE s= Identifier -> ^( EXECUTE_STATEMENT ^( STATEMENT $s) ) )
			// DBL.g:579:3: EXECUTE s= Identifier
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
			// 579:24: -> ^( EXECUTE_STATEMENT ^( STATEMENT $s) )
			{
				// DBL.g:579:27: ^( EXECUTE_STATEMENT ^( STATEMENT $s) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE_STATEMENT, "EXECUTE_STATEMENT"), root_1);
				// DBL.g:579:47: ^( STATEMENT $s)
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
	// DBL.g:582:1: execute_immediate_statement : EXECUTE IMMEDIATE v= Variable -> ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) ) ;
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

			// DBL.g:583:3: ( EXECUTE IMMEDIATE v= Variable -> ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) ) )
			// DBL.g:584:3: EXECUTE IMMEDIATE v= Variable
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
			// 584:32: -> ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) )
			{
				// DBL.g:584:35: ^( EXECUTE_IMMEDIATE_STATEMENT ^( VARIABLE $v) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE_IMMEDIATE_STATEMENT, "EXECUTE_IMMEDIATE_STATEMENT"), root_1);
				// DBL.g:584:65: ^( VARIABLE $v)
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
	// DBL.g:589:2: open_statement : OPEN c= Identifier ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )? -> {$v1 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) ) -> {$v2 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) ) -> {$d != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) ) -> ^( OPEN_STATEMENT ^( CURSOR $c) ) ;
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

			// DBL.g:590:3: ( OPEN c= Identifier ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )? -> {$v1 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) ) -> {$v2 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) ) -> {$d != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) ) -> ^( OPEN_STATEMENT ^( CURSOR $c) ) )
			// DBL.g:591:3: OPEN c= Identifier ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )?
			{
			OPEN150=(Token)match(input,OPEN,FOLLOW_OPEN_in_open_statement4848); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OPEN.add(OPEN150);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_open_statement4852); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// DBL.g:591:21: ( ( USING v1= Variable ) | ( USING DESCRIPTOR (v2= Variable |d= Identifier ) ) )?
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
					// DBL.g:591:22: ( USING v1= Variable )
					{
					// DBL.g:591:22: ( USING v1= Variable )
					// DBL.g:591:23: USING v1= Variable
					{
					USING151=(Token)match(input,USING,FOLLOW_USING_in_open_statement4856); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING151);

					v1=(Token)match(input,Variable,FOLLOW_Variable_in_open_statement4860); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v1);

					}

					}
					break;
				case 2 :
					// DBL.g:591:42: ( USING DESCRIPTOR (v2= Variable |d= Identifier ) )
					{
					// DBL.g:591:42: ( USING DESCRIPTOR (v2= Variable |d= Identifier ) )
					// DBL.g:591:43: USING DESCRIPTOR (v2= Variable |d= Identifier )
					{
					USING152=(Token)match(input,USING,FOLLOW_USING_in_open_statement4864); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING152);

					DESCRIPTOR153=(Token)match(input,DESCRIPTOR,FOLLOW_DESCRIPTOR_in_open_statement4866); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESCRIPTOR.add(DESCRIPTOR153);

					// DBL.g:591:60: (v2= Variable |d= Identifier )
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
							// DBL.g:591:61: v2= Variable
							{
							v2=(Token)match(input,Variable,FOLLOW_Variable_in_open_statement4871); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v2);

							}
							break;
						case 2 :
							// DBL.g:591:73: d= Identifier
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
			// elements: v1, USING, d, c, c, c, DESCRIPTOR, v2, c
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
			// 591:91: -> {$v1 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) )
			if (v1 != null) {
				// DBL.g:591:109: ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING ^( VARIABLE $v1) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// DBL.g:591:126: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:591:139: ^( USING ^( VARIABLE $v1) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_USING.nextNode(), root_2);
				// DBL.g:591:147: ^( VARIABLE $v1)
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

			else // 592:14: -> {$v2 != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) )
			if (v2 != null) {
				// DBL.g:592:32: ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( VARIABLE $v2) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// DBL.g:592:49: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:592:62: ^( USING_DESCRIPTOR ^( VARIABLE $v2) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USING_DESCRIPTOR, "USING_DESCRIPTOR"), root_2);
				// DBL.g:592:81: ^( VARIABLE $v2)
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

			else // 593:14: -> {$d != null}? ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) )
			if (d != null) {
				// DBL.g:593:31: ^( OPEN_STATEMENT ^( CURSOR $c) ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// DBL.g:593:48: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:593:62: ^( USING_DESCRIPTOR ^( DESCRIPTOR $d) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USING_DESCRIPTOR, "USING_DESCRIPTOR"), root_2);
				// DBL.g:593:81: ^( DESCRIPTOR $d)
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

			else // 594:14: -> ^( OPEN_STATEMENT ^( CURSOR $c) )
			{
				// DBL.g:594:17: ^( OPEN_STATEMENT ^( CURSOR $c) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPEN_STATEMENT, "OPEN_STATEMENT"), root_1);
				// DBL.g:594:34: ^( CURSOR $c)
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
	// DBL.g:599:2: prepare_statement : PREPARE s= Identifier ( into_clause )? FROM v= Variable -> ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) ) ;
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

			// DBL.g:600:3: ( PREPARE s= Identifier ( into_clause )? FROM v= Variable -> ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) ) )
			// DBL.g:601:3: PREPARE s= Identifier ( into_clause )? FROM v= Variable
			{
			PREPARE154=(Token)match(input,PREPARE,FOLLOW_PREPARE_in_prepare_statement5046); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PREPARE.add(PREPARE154);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_prepare_statement5050); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// DBL.g:601:24: ( into_clause )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==INTO) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// DBL.g:601:25: into_clause
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
			// elements: s, v, into_clause, FROM
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
			// 601:55: -> ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) )
			{
				// DBL.g:601:58: ^( PREPARE_STATEMENT ^( STATEMENT $s) ( into_clause )? ^( FROM ^( VARIABLE $v) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PREPARE_STATEMENT, "PREPARE_STATEMENT"), root_1);
				// DBL.g:601:78: ^( STATEMENT $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENT, "STATEMENT"), root_2);
				adaptor.addChild(root_2, stream_s.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:601:94: ( into_clause )?
				if ( stream_into_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_into_clause.nextTree());
				}
				stream_into_clause.reset();

				// DBL.g:601:109: ^( FROM ^( VARIABLE $v) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);
				// DBL.g:601:116: ^( VARIABLE $v)
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
	// DBL.g:605:2: declare_cursor_statement : DECLARE c= Identifier (d= DYNAMIC )? (sc= scroll )? CURSOR (h= hold )? FOR s= Identifier -> ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) ) ;
	public final DBLParser.declare_cursor_statement_return declare_cursor_statement() throws RecognitionException {
		DBLParser.declare_cursor_statement_return retval = new DBLParser.declare_cursor_statement_return();
		retval.start = input.LT(1);
		int declare_cursor_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token d=null;
		Token s=null;
		Token DECLARE157=null;
		Token CURSOR158=null;
		Token FOR159=null;
		ParserRuleReturnScope sc =null;
		ParserRuleReturnScope h =null;

		CommonTree c_tree=null;
		CommonTree d_tree=null;
		CommonTree s_tree=null;
		CommonTree DECLARE157_tree=null;
		CommonTree CURSOR158_tree=null;
		CommonTree FOR159_tree=null;
		RewriteRuleTokenStream stream_DECLARE=new RewriteRuleTokenStream(adaptor,"token DECLARE");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_CURSOR=new RewriteRuleTokenStream(adaptor,"token CURSOR");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DYNAMIC=new RewriteRuleTokenStream(adaptor,"token DYNAMIC");
		RewriteRuleSubtreeStream stream_scroll=new RewriteRuleSubtreeStream(adaptor,"rule scroll");
		RewriteRuleSubtreeStream stream_hold=new RewriteRuleSubtreeStream(adaptor,"rule hold");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// DBL.g:606:3: ( DECLARE c= Identifier (d= DYNAMIC )? (sc= scroll )? CURSOR (h= hold )? FOR s= Identifier -> ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) ) )
			// DBL.g:607:3: DECLARE c= Identifier (d= DYNAMIC )? (sc= scroll )? CURSOR (h= hold )? FOR s= Identifier
			{
			DECLARE157=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_declare_cursor_statement5111); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DECLARE.add(DECLARE157);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_declare_cursor_statement5115); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// DBL.g:607:24: (d= DYNAMIC )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==DYNAMIC) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// DBL.g:607:25: d= DYNAMIC
					{
					d=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declare_cursor_statement5120); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DYNAMIC.add(d);

					}
					break;

			}

			// DBL.g:607:37: (sc= scroll )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==NO||LA49_0==SCROLL) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// DBL.g:607:38: sc= scroll
					{
					pushFollow(FOLLOW_scroll_in_declare_cursor_statement5127);
					sc=scroll();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_scroll.add(sc.getTree());
					}
					break;

			}

			CURSOR158=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_declare_cursor_statement5131); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CURSOR.add(CURSOR158);

			// DBL.g:607:57: (h= hold )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( ((LA50_0 >= WITH && LA50_0 <= WITHOUT)) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// DBL.g:607:58: h= hold
					{
					pushFollow(FOLLOW_hold_in_declare_cursor_statement5136);
					h=hold();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_hold.add(h.getTree());
					}
					break;

			}

			FOR159=(Token)match(input,FOR,FOLLOW_FOR_in_declare_cursor_statement5140); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR159);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_declare_cursor_statement5144); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			// AST REWRITE
			// elements: d, CURSOR, s, c, FOR, h, sc
			// token labels: d, s, c
			// rule labels: retval, sc, h
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_sc=new RewriteRuleSubtreeStream(adaptor,"rule sc",sc!=null?sc.getTree():null);
			RewriteRuleSubtreeStream stream_h=new RewriteRuleSubtreeStream(adaptor,"rule h",h!=null?h.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 608:3: -> ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) )
			{
				// DBL.g:608:6: ^( DECLARE_CURSOR_STATEMENT ^( CURSOR $c) ( $d)? ( $sc)? ( $h)? ^( FOR ^( STATEMENT $s) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARE_CURSOR_STATEMENT, "DECLARE_CURSOR_STATEMENT"), root_1);
				// DBL.g:608:33: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_CURSOR.nextNode(), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:608:46: ( $d)?
				if ( stream_d.hasNext() ) {
					adaptor.addChild(root_1, stream_d.nextNode());
				}
				stream_d.reset();

				// DBL.g:608:52: ( $sc)?
				if ( stream_sc.hasNext() ) {
					adaptor.addChild(root_1, stream_sc.nextTree());
				}
				stream_sc.reset();

				// DBL.g:608:59: ( $h)?
				if ( stream_h.hasNext() ) {
					adaptor.addChild(root_1, stream_h.nextTree());
				}
				stream_h.reset();

				// DBL.g:608:65: ^( FOR ^( STATEMENT $s) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_2);
				// DBL.g:608:71: ^( STATEMENT $s)
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


	public static class scroll_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "scroll"
	// DBL.g:611:1: scroll : ( SCROLL -> ^( SCROLL ) | NO SCROLL -> ^( NO_SCROLL ) );
	public final DBLParser.scroll_return scroll() throws RecognitionException {
		DBLParser.scroll_return retval = new DBLParser.scroll_return();
		retval.start = input.LT(1);
		int scroll_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SCROLL160=null;
		Token NO161=null;
		Token SCROLL162=null;

		CommonTree SCROLL160_tree=null;
		CommonTree NO161_tree=null;
		CommonTree SCROLL162_tree=null;
		RewriteRuleTokenStream stream_SCROLL=new RewriteRuleTokenStream(adaptor,"token SCROLL");
		RewriteRuleTokenStream stream_NO=new RewriteRuleTokenStream(adaptor,"token NO");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// DBL.g:612:2: ( SCROLL -> ^( SCROLL ) | NO SCROLL -> ^( NO_SCROLL ) )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==SCROLL) ) {
				alt51=1;
			}
			else if ( (LA51_0==NO) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// DBL.g:613:2: SCROLL
					{
					SCROLL160=(Token)match(input,SCROLL,FOLLOW_SCROLL_in_scroll5204); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCROLL.add(SCROLL160);

					// AST REWRITE
					// elements: SCROLL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 613:9: -> ^( SCROLL )
					{
						// DBL.g:613:12: ^( SCROLL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SCROLL.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:615:2: NO SCROLL
					{
					NO161=(Token)match(input,NO,FOLLOW_NO_in_scroll5216); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NO.add(NO161);

					SCROLL162=(Token)match(input,SCROLL,FOLLOW_SCROLL_in_scroll5218); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCROLL.add(SCROLL162);

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
					// 615:12: -> ^( NO_SCROLL )
					{
						// DBL.g:615:15: ^( NO_SCROLL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NO_SCROLL, "NO_SCROLL"), root_1);
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
			if ( state.backtracking>0 ) { memoize(input, 43, scroll_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "scroll"


	public static class hold_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hold"
	// DBL.g:618:1: hold : ( WITH HOLD -> ^( WITH_HOLD ) | WITHOUT HOLD -> ^( WITHOUT_HOLD ) );
	public final DBLParser.hold_return hold() throws RecognitionException {
		DBLParser.hold_return retval = new DBLParser.hold_return();
		retval.start = input.LT(1);
		int hold_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH163=null;
		Token HOLD164=null;
		Token WITHOUT165=null;
		Token HOLD166=null;

		CommonTree WITH163_tree=null;
		CommonTree HOLD164_tree=null;
		CommonTree WITHOUT165_tree=null;
		CommonTree HOLD166_tree=null;
		RewriteRuleTokenStream stream_HOLD=new RewriteRuleTokenStream(adaptor,"token HOLD");
		RewriteRuleTokenStream stream_WITHOUT=new RewriteRuleTokenStream(adaptor,"token WITHOUT");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// DBL.g:619:2: ( WITH HOLD -> ^( WITH_HOLD ) | WITHOUT HOLD -> ^( WITHOUT_HOLD ) )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==WITH) ) {
				alt52=1;
			}
			else if ( (LA52_0==WITHOUT) ) {
				alt52=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// DBL.g:620:2: WITH HOLD
					{
					WITH163=(Token)match(input,WITH,FOLLOW_WITH_in_hold5238); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITH.add(WITH163);

					HOLD164=(Token)match(input,HOLD,FOLLOW_HOLD_in_hold5240); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HOLD.add(HOLD164);

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
					// 620:12: -> ^( WITH_HOLD )
					{
						// DBL.g:620:15: ^( WITH_HOLD )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH_HOLD, "WITH_HOLD"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// DBL.g:622:2: WITHOUT HOLD
					{
					WITHOUT165=(Token)match(input,WITHOUT,FOLLOW_WITHOUT_in_hold5253); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WITHOUT.add(WITHOUT165);

					HOLD166=(Token)match(input,HOLD,FOLLOW_HOLD_in_hold5255); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HOLD.add(HOLD166);

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
					// 622:15: -> ^( WITHOUT_HOLD )
					{
						// DBL.g:622:18: ^( WITHOUT_HOLD )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITHOUT_HOLD, "WITHOUT_HOLD"), root_1);
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
			if ( state.backtracking>0 ) { memoize(input, 44, hold_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "hold"


	public static class describe_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "describe_statement"
	// DBL.g:626:2: describe_statement : DESCRIBE s= Identifier into_clause -> ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause ) ;
	public final DBLParser.describe_statement_return describe_statement() throws RecognitionException {
		DBLParser.describe_statement_return retval = new DBLParser.describe_statement_return();
		retval.start = input.LT(1);
		int describe_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token DESCRIBE167=null;
		ParserRuleReturnScope into_clause168 =null;

		CommonTree s_tree=null;
		CommonTree DESCRIBE167_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
		RewriteRuleSubtreeStream stream_into_clause=new RewriteRuleSubtreeStream(adaptor,"rule into_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// DBL.g:627:3: ( DESCRIBE s= Identifier into_clause -> ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause ) )
			// DBL.g:628:3: DESCRIBE s= Identifier into_clause
			{
			DESCRIBE167=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describe_statement5282); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE167);

			s=(Token)match(input,Identifier,FOLLOW_Identifier_in_describe_statement5286); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(s);

			pushFollow(FOLLOW_into_clause_in_describe_statement5288);
			into_clause168=into_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_into_clause.add(into_clause168.getTree());
			// AST REWRITE
			// elements: into_clause, s
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
			// 628:37: -> ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause )
			{
				// DBL.g:628:39: ^( DESCRIBE_STATEMENT ^( STATEMENT $s) into_clause )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DESCRIBE_STATEMENT, "DESCRIBE_STATEMENT"), root_1);
				// DBL.g:628:60: ^( STATEMENT $s)
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
			if ( state.backtracking>0 ) { memoize(input, 45, describe_statement_StartIndex); }

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
	// DBL.g:631:2: fetch_statement : FETCH ( fetch_position )? FROM c= Identifier ( fetch_into )? -> ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? ) ;
	public final DBLParser.fetch_statement_return fetch_statement() throws RecognitionException {
		DBLParser.fetch_statement_return retval = new DBLParser.fetch_statement_return();
		retval.start = input.LT(1);
		int fetch_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token FETCH169=null;
		Token FROM171=null;
		ParserRuleReturnScope fetch_position170 =null;
		ParserRuleReturnScope fetch_into172 =null;

		CommonTree c_tree=null;
		CommonTree FETCH169_tree=null;
		CommonTree FROM171_tree=null;
		RewriteRuleTokenStream stream_FETCH=new RewriteRuleTokenStream(adaptor,"token FETCH");
		RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_fetch_position=new RewriteRuleSubtreeStream(adaptor,"rule fetch_position");
		RewriteRuleSubtreeStream stream_fetch_into=new RewriteRuleSubtreeStream(adaptor,"rule fetch_into");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// DBL.g:632:3: ( FETCH ( fetch_position )? FROM c= Identifier ( fetch_into )? -> ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? ) )
			// DBL.g:633:3: FETCH ( fetch_position )? FROM c= Identifier ( fetch_into )?
			{
			FETCH169=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_statement5320); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FETCH.add(FETCH169);

			// DBL.g:633:9: ( fetch_position )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==AFTER||LA53_0==BEFORE||LA53_0==CURRENT||LA53_0==FIRST||LA53_0==LAST||LA53_0==NEXT||LA53_0==PRIOR||LA53_0==RELATIVE) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// DBL.g:633:10: fetch_position
					{
					pushFollow(FOLLOW_fetch_position_in_fetch_statement5323);
					fetch_position170=fetch_position();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fetch_position.add(fetch_position170.getTree());
					}
					break;

			}

			FROM171=(Token)match(input,FROM,FOLLOW_FROM_in_fetch_statement5327); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FROM.add(FROM171);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_fetch_statement5331); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(c);

			// DBL.g:633:45: ( fetch_into )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==FOR||LA54_0==INTO) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// DBL.g:633:46: fetch_into
					{
					pushFollow(FOLLOW_fetch_into_in_fetch_statement5334);
					fetch_into172=fetch_into();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fetch_into.add(fetch_into172.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: c, fetch_position, fetch_into
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
			// 633:59: -> ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? )
			{
				// DBL.g:633:62: ^( FETCH_STATEMENT ( fetch_position )? ^( CURSOR $c) ( fetch_into )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_STATEMENT, "FETCH_STATEMENT"), root_1);
				// DBL.g:633:80: ( fetch_position )?
				if ( stream_fetch_position.hasNext() ) {
					adaptor.addChild(root_1, stream_fetch_position.nextTree());
				}
				stream_fetch_position.reset();

				// DBL.g:633:98: ^( CURSOR $c)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CURSOR, "CURSOR"), root_2);
				adaptor.addChild(root_2, stream_c.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:633:111: ( fetch_into )?
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
			if ( state.backtracking>0 ) { memoize(input, 46, fetch_statement_StartIndex); }

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
	// DBL.g:636:2: fetch_position : (p= ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT ) -> ^( FETCH_POSITION $p) | RELATIVE (v= Variable |i= NUMBER ) -> {$v != null}? ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) ) -> ^( FETCH_POSITION ^( RELATIVE NUMBER ) ) );
	public final DBLParser.fetch_position_return fetch_position() throws RecognitionException {
		DBLParser.fetch_position_return retval = new DBLParser.fetch_position_return();
		retval.start = input.LT(1);
		int fetch_position_StartIndex = input.index();

		CommonTree root_0 = null;

		Token p=null;
		Token v=null;
		Token i=null;
		Token RELATIVE173=null;

		CommonTree p_tree=null;
		CommonTree v_tree=null;
		CommonTree i_tree=null;
		CommonTree RELATIVE173_tree=null;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// DBL.g:637:3: (p= ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT ) -> ^( FETCH_POSITION $p) | RELATIVE (v= Variable |i= NUMBER ) -> {$v != null}? ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) ) -> ^( FETCH_POSITION ^( RELATIVE NUMBER ) ) )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==AFTER||LA57_0==BEFORE||LA57_0==CURRENT||LA57_0==FIRST||LA57_0==LAST||LA57_0==NEXT||LA57_0==PRIOR) ) {
				alt57=1;
			}
			else if ( (LA57_0==RELATIVE) ) {
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
					// DBL.g:637:5: p= ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT )
					{
					// DBL.g:637:8: ( NEXT | PRIOR | FIRST | LAST | BEFORE | AFTER | CURRENT )
					int alt55=7;
					switch ( input.LA(1) ) {
					case NEXT:
						{
						alt55=1;
						}
						break;
					case PRIOR:
						{
						alt55=2;
						}
						break;
					case FIRST:
						{
						alt55=3;
						}
						break;
					case LAST:
						{
						alt55=4;
						}
						break;
					case BEFORE:
						{
						alt55=5;
						}
						break;
					case AFTER:
						{
						alt55=6;
						}
						break;
					case CURRENT:
						{
						alt55=7;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 55, 0, input);
						throw nvae;
					}
					switch (alt55) {
						case 1 :
							// DBL.g:637:9: NEXT
							{
							p=(Token)match(input,NEXT,FOLLOW_NEXT_in_fetch_position5379); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NEXT.add(p);

							}
							break;
						case 2 :
							// DBL.g:637:14: PRIOR
							{
							p=(Token)match(input,PRIOR,FOLLOW_PRIOR_in_fetch_position5381); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_PRIOR.add(p);

							}
							break;
						case 3 :
							// DBL.g:637:20: FIRST
							{
							p=(Token)match(input,FIRST,FOLLOW_FIRST_in_fetch_position5383); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FIRST.add(p);

							}
							break;
						case 4 :
							// DBL.g:637:26: LAST
							{
							p=(Token)match(input,LAST,FOLLOW_LAST_in_fetch_position5385); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LAST.add(p);

							}
							break;
						case 5 :
							// DBL.g:637:31: BEFORE
							{
							p=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_fetch_position5387); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_BEFORE.add(p);

							}
							break;
						case 6 :
							// DBL.g:637:38: AFTER
							{
							p=(Token)match(input,AFTER,FOLLOW_AFTER_in_fetch_position5389); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AFTER.add(p);

							}
							break;
						case 7 :
							// DBL.g:637:44: CURRENT
							{
							p=(Token)match(input,CURRENT,FOLLOW_CURRENT_in_fetch_position5391); if (state.failed) return retval; 
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
					// 637:53: -> ^( FETCH_POSITION $p)
					{
						// DBL.g:637:56: ^( FETCH_POSITION $p)
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
					// DBL.g:639:4: RELATIVE (v= Variable |i= NUMBER )
					{
					RELATIVE173=(Token)match(input,RELATIVE,FOLLOW_RELATIVE_in_fetch_position5411); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RELATIVE.add(RELATIVE173);

					// DBL.g:639:13: (v= Variable |i= NUMBER )
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==Variable) ) {
						alt56=1;
					}
					else if ( (LA56_0==NUMBER) ) {
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
							// DBL.g:639:14: v= Variable
							{
							v=(Token)match(input,Variable,FOLLOW_Variable_in_fetch_position5416); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Variable.add(v);

							}
							break;
						case 2 :
							// DBL.g:639:25: i= NUMBER
							{
							i=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_fetch_position5420); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NUMBER.add(i);

							}
							break;

					}

					// AST REWRITE
					// elements: NUMBER, RELATIVE, v, RELATIVE
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
					// 639:35: -> {$v != null}? ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) )
					if (v != null) {
						// DBL.g:639:51: ^( FETCH_POSITION ^( RELATIVE ^( VARIABLE $v) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_POSITION, "FETCH_POSITION"), root_1);
						// DBL.g:639:68: ^( RELATIVE ^( VARIABLE $v) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_RELATIVE.nextNode(), root_2);
						// DBL.g:639:79: ^( VARIABLE $v)
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

					else // 640:14: -> ^( FETCH_POSITION ^( RELATIVE NUMBER ) )
					{
						// DBL.g:640:25: ^( FETCH_POSITION ^( RELATIVE NUMBER ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FETCH_POSITION, "FETCH_POSITION"), root_1);
						// DBL.g:640:42: ^( RELATIVE NUMBER )
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
			if ( state.backtracking>0 ) { memoize(input, 47, fetch_position_StartIndex); }

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
	// DBL.g:643:2: fetch_into : ( single_fetch | multiple_row_fetch );
	public final DBLParser.fetch_into_return fetch_into() throws RecognitionException {
		DBLParser.fetch_into_return retval = new DBLParser.fetch_into_return();
		retval.start = input.LT(1);
		int fetch_into_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope single_fetch174 =null;
		ParserRuleReturnScope multiple_row_fetch175 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// DBL.g:644:3: ( single_fetch | multiple_row_fetch )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==INTO) ) {
				alt58=1;
			}
			else if ( (LA58_0==FOR) ) {
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
					// DBL.g:645:3: single_fetch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_single_fetch_in_fetch_into5490);
					single_fetch174=single_fetch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_fetch174.getTree());

					}
					break;
				case 2 :
					// DBL.g:647:3: multiple_row_fetch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_multiple_row_fetch_in_fetch_into5498);
					multiple_row_fetch175=multiple_row_fetch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiple_row_fetch175.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 48, fetch_into_StartIndex); }

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
	// DBL.g:650:2: single_fetch : INTO v= Variable -> ^( SINGLE_FETCH ^( INTO ^( VARIABLE $v) ) ) ;
	public final DBLParser.single_fetch_return single_fetch() throws RecognitionException {
		DBLParser.single_fetch_return retval = new DBLParser.single_fetch_return();
		retval.start = input.LT(1);
		int single_fetch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token v=null;
		Token INTO176=null;

		CommonTree v_tree=null;
		CommonTree INTO176_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// DBL.g:651:3: ( INTO v= Variable -> ^( SINGLE_FETCH ^( INTO ^( VARIABLE $v) ) ) )
			// DBL.g:652:3: INTO v= Variable
			{
			INTO176=(Token)match(input,INTO,FOLLOW_INTO_in_single_fetch5517); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTO.add(INTO176);

			v=(Token)match(input,Variable,FOLLOW_Variable_in_single_fetch5522); if (state.failed) return retval; 
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
			// 652:20: -> ^( SINGLE_FETCH ^( INTO ^( VARIABLE $v) ) )
			{
				// DBL.g:652:23: ^( SINGLE_FETCH ^( INTO ^( VARIABLE $v) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SINGLE_FETCH, "SINGLE_FETCH"), root_1);
				// DBL.g:652:38: ^( INTO ^( VARIABLE $v) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_2);
				// DBL.g:652:45: ^( VARIABLE $v)
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
			if ( state.backtracking>0 ) { memoize(input, 49, single_fetch_StartIndex); }

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
	// DBL.g:656:2: multiple_row_fetch : FOR (v= Variable | NUMBER ) ROWS (mi= multiple_row )? INTO ds= Variable -> {$v != null}? ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) ) -> ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) ) ;
	public final DBLParser.multiple_row_fetch_return multiple_row_fetch() throws RecognitionException {
		DBLParser.multiple_row_fetch_return retval = new DBLParser.multiple_row_fetch_return();
		retval.start = input.LT(1);
		int multiple_row_fetch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token v=null;
		Token ds=null;
		Token FOR177=null;
		Token NUMBER178=null;
		Token ROWS179=null;
		Token INTO180=null;
		ParserRuleReturnScope mi =null;

		CommonTree v_tree=null;
		CommonTree ds_tree=null;
		CommonTree FOR177_tree=null;
		CommonTree NUMBER178_tree=null;
		CommonTree ROWS179_tree=null;
		CommonTree INTO180_tree=null;
		RewriteRuleTokenStream stream_ROWS=new RewriteRuleTokenStream(adaptor,"token ROWS");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleSubtreeStream stream_multiple_row=new RewriteRuleSubtreeStream(adaptor,"rule multiple_row");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// DBL.g:657:3: ( FOR (v= Variable | NUMBER ) ROWS (mi= multiple_row )? INTO ds= Variable -> {$v != null}? ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) ) -> ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) ) )
			// DBL.g:658:3: FOR (v= Variable | NUMBER ) ROWS (mi= multiple_row )? INTO ds= Variable
			{
			FOR177=(Token)match(input,FOR,FOLLOW_FOR_in_multiple_row_fetch5561); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR177);

			// DBL.g:658:7: (v= Variable | NUMBER )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==Variable) ) {
				alt59=1;
			}
			else if ( (LA59_0==NUMBER) ) {
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
					// DBL.g:658:8: v= Variable
					{
					v=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row_fetch5566); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v);

					}
					break;
				case 2 :
					// DBL.g:658:19: NUMBER
					{
					NUMBER178=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_multiple_row_fetch5568); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER178);

					}
					break;

			}

			ROWS179=(Token)match(input,ROWS,FOLLOW_ROWS_in_multiple_row_fetch5571); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROWS.add(ROWS179);

			// DBL.g:658:32: (mi= multiple_row )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==USING) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// DBL.g:658:33: mi= multiple_row
					{
					pushFollow(FOLLOW_multiple_row_in_multiple_row_fetch5576);
					mi=multiple_row();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiple_row.add(mi.getTree());
					}
					break;

			}

			INTO180=(Token)match(input,INTO,FOLLOW_INTO_in_multiple_row_fetch5580); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTO.add(INTO180);

			ds=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row_fetch5584); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(ds);

			// AST REWRITE
			// elements: FOR, ds, mi, ds, mi, FOR, INTO, v, NUMBER, INTO
			// token labels: v, ds
			// rule labels: retval, mi
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleTokenStream stream_ds=new RewriteRuleTokenStream(adaptor,"token ds",ds);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_mi=new RewriteRuleSubtreeStream(adaptor,"rule mi",mi!=null?mi.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 658:68: -> {$v != null}? ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) )
			if (v != null) {
				// DBL.g:658:84: ^( MULTIPLE_ROW_FETCH ^( FOR ^( VARIABLE $v) ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULTIPLE_ROW_FETCH, "MULTIPLE_ROW_FETCH"), root_1);
				// DBL.g:658:105: ^( FOR ^( VARIABLE $v) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_2);
				// DBL.g:658:111: ^( VARIABLE $v)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_3);
				adaptor.addChild(root_3, stream_v.nextNode());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:658:127: ( $mi)?
				if ( stream_mi.hasNext() ) {
					adaptor.addChild(root_1, stream_mi.nextTree());
				}
				stream_mi.reset();

				// DBL.g:658:134: ^( INTO ^( VARIABLE $ds) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_2);
				// DBL.g:658:141: ^( VARIABLE $ds)
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

			else // 659:12: -> ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) )
			{
				// DBL.g:659:16: ^( MULTIPLE_ROW_FETCH ^( FOR NUMBER ) ( $mi)? ^( INTO ^( VARIABLE $ds) ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULTIPLE_ROW_FETCH, "MULTIPLE_ROW_FETCH"), root_1);
				// DBL.g:659:37: ^( FOR NUMBER )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_2);
				adaptor.addChild(root_2, stream_NUMBER.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:659:51: ( $mi)?
				if ( stream_mi.hasNext() ) {
					adaptor.addChild(root_1, stream_mi.nextTree());
				}
				stream_mi.reset();

				// DBL.g:659:58: ^( INTO ^( VARIABLE $ds) )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_2);
				// DBL.g:659:65: ^( VARIABLE $ds)
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

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, multiple_row_fetch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiple_row_fetch"


	public static class multiple_row_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiple_row"
	// DBL.g:662:2: multiple_row : USING DESCRIPTOR d= Variable -> ^( DESCRIPTOR ^( VARIABLE $d) ) ;
	public final DBLParser.multiple_row_return multiple_row() throws RecognitionException {
		DBLParser.multiple_row_return retval = new DBLParser.multiple_row_return();
		retval.start = input.LT(1);
		int multiple_row_StartIndex = input.index();

		CommonTree root_0 = null;

		Token d=null;
		Token USING181=null;
		Token DESCRIPTOR182=null;

		CommonTree d_tree=null;
		CommonTree USING181_tree=null;
		CommonTree DESCRIPTOR182_tree=null;
		RewriteRuleTokenStream stream_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token DESCRIPTOR");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// DBL.g:663:3: ( USING DESCRIPTOR d= Variable -> ^( DESCRIPTOR ^( VARIABLE $d) ) )
			// DBL.g:664:3: USING DESCRIPTOR d= Variable
			{
			USING181=(Token)match(input,USING,FOLLOW_USING_in_multiple_row5682); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING181);

			DESCRIPTOR182=(Token)match(input,DESCRIPTOR,FOLLOW_DESCRIPTOR_in_multiple_row5684); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DESCRIPTOR.add(DESCRIPTOR182);

			d=(Token)match(input,Variable,FOLLOW_Variable_in_multiple_row5688); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Variable.add(d);

			// AST REWRITE
			// elements: d, DESCRIPTOR
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
			// 664:31: -> ^( DESCRIPTOR ^( VARIABLE $d) )
			{
				// DBL.g:664:33: ^( DESCRIPTOR ^( VARIABLE $d) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_DESCRIPTOR.nextNode(), root_1);
				// DBL.g:664:46: ^( VARIABLE $d)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_2);
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
			if ( state.backtracking>0 ) { memoize(input, 51, multiple_row_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiple_row"


	public static class close_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "close_statement"
	// DBL.g:668:2: close_statement : CLOSE c= Identifier -> ^( CLOSE_STATEMENT ^( CURSOR $c) ) ;
	public final DBLParser.close_statement_return close_statement() throws RecognitionException {
		DBLParser.close_statement_return retval = new DBLParser.close_statement_return();
		retval.start = input.LT(1);
		int close_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token CLOSE183=null;

		CommonTree c_tree=null;
		CommonTree CLOSE183_tree=null;
		RewriteRuleTokenStream stream_CLOSE=new RewriteRuleTokenStream(adaptor,"token CLOSE");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// DBL.g:669:3: ( CLOSE c= Identifier -> ^( CLOSE_STATEMENT ^( CURSOR $c) ) )
			// DBL.g:670:3: CLOSE c= Identifier
			{
			CLOSE183=(Token)match(input,CLOSE,FOLLOW_CLOSE_in_close_statement5724); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CLOSE.add(CLOSE183);

			c=(Token)match(input,Identifier,FOLLOW_Identifier_in_close_statement5728); if (state.failed) return retval; 
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
			// 670:22: -> ^( CLOSE_STATEMENT ^( CURSOR $c) )
			{
				// DBL.g:670:25: ^( CLOSE_STATEMENT ^( CURSOR $c) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLOSE_STATEMENT, "CLOSE_STATEMENT"), root_1);
				// DBL.g:670:43: ^( CURSOR $c)
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
			if ( state.backtracking>0 ) { memoize(input, 52, close_statement_StartIndex); }

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
	// DBL.g:675:2: into_clause : INTO (d= Identifier |v= Variable ) ( USING t= using_target )? -> {$d!=null}? ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? ) -> ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? ) ;
	public final DBLParser.into_clause_return into_clause() throws RecognitionException {
		DBLParser.into_clause_return retval = new DBLParser.into_clause_return();
		retval.start = input.LT(1);
		int into_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token d=null;
		Token v=null;
		Token INTO184=null;
		Token USING185=null;
		ParserRuleReturnScope t =null;

		CommonTree d_tree=null;
		CommonTree v_tree=null;
		CommonTree INTO184_tree=null;
		CommonTree USING185_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_using_target=new RewriteRuleSubtreeStream(adaptor,"rule using_target");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// DBL.g:676:3: ( INTO (d= Identifier |v= Variable ) ( USING t= using_target )? -> {$d!=null}? ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? ) -> ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? ) )
			// DBL.g:677:3: INTO (d= Identifier |v= Variable ) ( USING t= using_target )?
			{
			INTO184=(Token)match(input,INTO,FOLLOW_INTO_in_into_clause5769); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTO.add(INTO184);

			// DBL.g:677:8: (d= Identifier |v= Variable )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==Identifier) ) {
				alt61=1;
			}
			else if ( (LA61_0==Variable) ) {
				alt61=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// DBL.g:677:9: d= Identifier
					{
					d=(Token)match(input,Identifier,FOLLOW_Identifier_in_into_clause5774); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(d);

					}
					break;
				case 2 :
					// DBL.g:677:22: v= Variable
					{
					v=(Token)match(input,Variable,FOLLOW_Variable_in_into_clause5778); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Variable.add(v);

					}
					break;

			}

			// DBL.g:677:34: ( USING t= using_target )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==USING) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// DBL.g:677:35: USING t= using_target
					{
					USING185=(Token)match(input,USING,FOLLOW_USING_in_into_clause5782); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USING.add(USING185);

					pushFollow(FOLLOW_using_target_in_into_clause5786);
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
			// 677:59: -> {$d!=null}? ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? )
			if (d!=null) {
				// DBL.g:677:74: ^( INTO ^( DESCRIPTOR $d) ( ^( USING $t) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_1);
				// DBL.g:677:81: ^( DESCRIPTOR $d)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DESCRIPTOR, "DESCRIPTOR"), root_2);
				adaptor.addChild(root_2, stream_d.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:677:98: ( ^( USING $t) )?
				if ( stream_t.hasNext()||stream_USING.hasNext() ) {
					// DBL.g:677:98: ^( USING $t)
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

			else // 678:9: -> ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? )
			{
				// DBL.g:678:14: ^( INTO ^( VARIABLE $v) ( ^( USING $t) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_INTO.nextNode(), root_1);
				// DBL.g:678:21: ^( VARIABLE $v)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_2);
				adaptor.addChild(root_2, stream_v.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:678:36: ( ^( USING $t) )?
				if ( stream_USING.hasNext()||stream_t.hasNext() ) {
					// DBL.g:678:36: ^( USING $t)
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
			if ( state.backtracking>0 ) { memoize(input, 53, into_clause_StartIndex); }

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
	// DBL.g:681:2: using_target : ( NAMES | LABELS | ANY | BOTH | ALL | system_names );
	public final DBLParser.using_target_return using_target() throws RecognitionException {
		DBLParser.using_target_return retval = new DBLParser.using_target_return();
		retval.start = input.LT(1);
		int using_target_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NAMES186=null;
		Token LABELS187=null;
		Token ANY188=null;
		Token BOTH189=null;
		Token ALL190=null;
		ParserRuleReturnScope system_names191 =null;

		CommonTree NAMES186_tree=null;
		CommonTree LABELS187_tree=null;
		CommonTree ANY188_tree=null;
		CommonTree BOTH189_tree=null;
		CommonTree ALL190_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// DBL.g:682:2: ( NAMES | LABELS | ANY | BOTH | ALL | system_names )
			int alt63=6;
			switch ( input.LA(1) ) {
			case NAMES:
				{
				alt63=1;
				}
				break;
			case LABELS:
				{
				alt63=2;
				}
				break;
			case ANY:
				{
				alt63=3;
				}
				break;
			case BOTH:
				{
				alt63=4;
				}
				break;
			case ALL:
				{
				alt63=5;
				}
				break;
			case SYSTEM:
				{
				alt63=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// DBL.g:683:2: NAMES
					{
					root_0 = (CommonTree)adaptor.nil();


					NAMES186=(Token)match(input,NAMES,FOLLOW_NAMES_in_using_target5862); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NAMES186_tree = (CommonTree)adaptor.create(NAMES186);
					adaptor.addChild(root_0, NAMES186_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:683:8: LABELS
					{
					root_0 = (CommonTree)adaptor.nil();


					LABELS187=(Token)match(input,LABELS,FOLLOW_LABELS_in_using_target5864); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LABELS187_tree = (CommonTree)adaptor.create(LABELS187);
					adaptor.addChild(root_0, LABELS187_tree);
					}

					}
					break;
				case 3 :
					// DBL.g:683:15: ANY
					{
					root_0 = (CommonTree)adaptor.nil();


					ANY188=(Token)match(input,ANY,FOLLOW_ANY_in_using_target5866); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ANY188_tree = (CommonTree)adaptor.create(ANY188);
					adaptor.addChild(root_0, ANY188_tree);
					}

					}
					break;
				case 4 :
					// DBL.g:683:19: BOTH
					{
					root_0 = (CommonTree)adaptor.nil();


					BOTH189=(Token)match(input,BOTH,FOLLOW_BOTH_in_using_target5868); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOTH189_tree = (CommonTree)adaptor.create(BOTH189);
					adaptor.addChild(root_0, BOTH189_tree);
					}

					}
					break;
				case 5 :
					// DBL.g:683:24: ALL
					{
					root_0 = (CommonTree)adaptor.nil();


					ALL190=(Token)match(input,ALL,FOLLOW_ALL_in_using_target5870); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ALL190_tree = (CommonTree)adaptor.create(ALL190);
					adaptor.addChild(root_0, ALL190_tree);
					}

					}
					break;
				case 6 :
					// DBL.g:683:28: system_names
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_system_names_in_using_target5872);
					system_names191=system_names();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, system_names191.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 54, using_target_StartIndex); }

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
	// DBL.g:686:1: system_names : SYSTEM NAMES -> ^( SYSTEM_NAMES ) ;
	public final DBLParser.system_names_return system_names() throws RecognitionException {
		DBLParser.system_names_return retval = new DBLParser.system_names_return();
		retval.start = input.LT(1);
		int system_names_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SYSTEM192=null;
		Token NAMES193=null;

		CommonTree SYSTEM192_tree=null;
		CommonTree NAMES193_tree=null;
		RewriteRuleTokenStream stream_SYSTEM=new RewriteRuleTokenStream(adaptor,"token SYSTEM");
		RewriteRuleTokenStream stream_NAMES=new RewriteRuleTokenStream(adaptor,"token NAMES");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// DBL.g:687:2: ( SYSTEM NAMES -> ^( SYSTEM_NAMES ) )
			// DBL.g:688:2: SYSTEM NAMES
			{
			SYSTEM192=(Token)match(input,SYSTEM,FOLLOW_SYSTEM_in_system_names5885); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYSTEM.add(SYSTEM192);

			NAMES193=(Token)match(input,NAMES,FOLLOW_NAMES_in_system_names5887); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAMES.add(NAMES193);

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
			// 688:15: -> ^( SYSTEM_NAMES )
			{
				// DBL.g:688:18: ^( SYSTEM_NAMES )
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
			if ( state.backtracking>0 ) { memoize(input, 55, system_names_StartIndex); }

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
	// DBL.g:694:1: table_elements : LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ ;
	public final DBLParser.table_elements_return table_elements() throws RecognitionException {
		DBLParser.table_elements_return retval = new DBLParser.table_elements_return();
		retval.start = input.LT(1);
		int table_elements_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN194=null;
		Token COMMA196=null;
		Token RIGHT_PAREN198=null;
		ParserRuleReturnScope field_element195 =null;
		ParserRuleReturnScope field_element197 =null;

		CommonTree LEFT_PAREN194_tree=null;
		CommonTree COMMA196_tree=null;
		CommonTree RIGHT_PAREN198_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_field_element=new RewriteRuleSubtreeStream(adaptor,"rule field_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// DBL.g:695:3: ( LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN -> ( field_element )+ )
			// DBL.g:695:5: LEFT_PAREN field_element ( COMMA field_element )* RIGHT_PAREN
			{
			LEFT_PAREN194=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_elements5910); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN194);

			pushFollow(FOLLOW_field_element_in_table_elements5912);
			field_element195=field_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_element.add(field_element195.getTree());
			// DBL.g:695:30: ( COMMA field_element )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==COMMA) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// DBL.g:695:31: COMMA field_element
					{
					COMMA196=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_elements5915); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA196);

					pushFollow(FOLLOW_field_element_in_table_elements5917);
					field_element197=field_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_field_element.add(field_element197.getTree());
					}
					break;

				default :
					break loop64;
				}
			}

			RIGHT_PAREN198=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_elements5921); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN198);

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
			// 696:5: -> ( field_element )+
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
			if ( state.backtracking>0 ) { memoize(input, 56, table_elements_StartIndex); }

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
	// DBL.g:699:1: field_element : Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) ;
	public final DBLParser.field_element_return field_element() throws RecognitionException {
		DBLParser.field_element_return retval = new DBLParser.field_element_return();
		retval.start = input.LT(1);
		int field_element_StartIndex = input.index();

		CommonTree root_0 = null;

		Token c=null;
		Token Identifier199=null;
		Token FOR200=null;
		Token COLUMN201=null;
		ParserRuleReturnScope field_type202 =null;
		ParserRuleReturnScope not_null203 =null;
		ParserRuleReturnScope with_default204 =null;

		CommonTree c_tree=null;
		CommonTree Identifier199_tree=null;
		CommonTree FOR200_tree=null;
		CommonTree COLUMN201_tree=null;
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
		RewriteRuleSubtreeStream stream_not_null=new RewriteRuleSubtreeStream(adaptor,"rule not_null");
		RewriteRuleSubtreeStream stream_with_default=new RewriteRuleSubtreeStream(adaptor,"rule with_default");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// DBL.g:700:3: ( Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )? -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? ) )
			// DBL.g:700:5: Identifier ( FOR COLUMN c= Identifier )? field_type ( not_null )? ( with_default )?
			{
			Identifier199=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element5945); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier199);

			// DBL.g:700:16: ( FOR COLUMN c= Identifier )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==FOR) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// DBL.g:700:17: FOR COLUMN c= Identifier
					{
					FOR200=(Token)match(input,FOR,FOLLOW_FOR_in_field_element5948); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOR.add(FOR200);

					COLUMN201=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_field_element5950); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN201);

					c=(Token)match(input,Identifier,FOLLOW_Identifier_in_field_element5954); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(c);

					}
					break;

			}

			pushFollow(FOLLOW_field_type_in_field_element5958);
			field_type202=field_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_field_type.add(field_type202.getTree());
			// DBL.g:700:54: ( not_null )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==NOT) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// DBL.g:700:55: not_null
					{
					pushFollow(FOLLOW_not_null_in_field_element5961);
					not_null203=not_null();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_not_null.add(not_null203.getTree());
					}
					break;

			}

			// DBL.g:700:66: ( with_default )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==WITH) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// DBL.g:700:67: with_default
					{
					pushFollow(FOLLOW_with_default_in_field_element5966);
					with_default204=with_default();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_with_default.add(with_default204.getTree());
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
			// 700:81: -> ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
			{
				// DBL.g:700:84: ^( FIELD_DEF ^( FIELD_NAME Identifier ) ( ^( FOR_COLUMN $c) )? ^( FIELD_TYPE field_type ) ( not_null )? ( with_default )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_DEF, "FIELD_DEF"), root_1);
				// DBL.g:700:96: ^( FIELD_NAME Identifier )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_NAME, "FIELD_NAME"), root_2);
				adaptor.addChild(root_2, stream_Identifier.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:700:121: ( ^( FOR_COLUMN $c) )?
				if ( stream_c.hasNext() ) {
					// DBL.g:700:121: ^( FOR_COLUMN $c)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_COLUMN, "FOR_COLUMN"), root_2);
					adaptor.addChild(root_2, stream_c.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_c.reset();

				// DBL.g:700:139: ^( FIELD_TYPE field_type )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_TYPE, "FIELD_TYPE"), root_2);
				adaptor.addChild(root_2, stream_field_type.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// DBL.g:700:164: ( not_null )?
				if ( stream_not_null.hasNext() ) {
					adaptor.addChild(root_1, stream_not_null.nextTree());
				}
				stream_not_null.reset();

				// DBL.g:700:176: ( with_default )?
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
			if ( state.backtracking>0 ) { memoize(input, 57, field_element_StartIndex); }

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
	// DBL.g:703:1: not_null : NOT NULL -> ^( NOT_NULL ) ;
	public final DBLParser.not_null_return not_null() throws RecognitionException {
		DBLParser.not_null_return retval = new DBLParser.not_null_return();
		retval.start = input.LT(1);
		int not_null_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT205=null;
		Token NULL206=null;

		CommonTree NOT205_tree=null;
		CommonTree NULL206_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// DBL.g:703:9: ( NOT NULL -> ^( NOT_NULL ) )
			// DBL.g:704:2: NOT NULL
			{
			NOT205=(Token)match(input,NOT,FOLLOW_NOT_in_not_null6016); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NOT.add(NOT205);

			NULL206=(Token)match(input,NULL,FOLLOW_NULL_in_not_null6018); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL206);

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
			// 704:11: -> ^( NOT_NULL )
			{
				// DBL.g:704:14: ^( NOT_NULL )
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
			if ( state.backtracking>0 ) { memoize(input, 58, not_null_StartIndex); }

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
	// DBL.g:707:1: with_default : WITH DEFAULT -> ^( WITH_DEFAULT ) ;
	public final DBLParser.with_default_return with_default() throws RecognitionException {
		DBLParser.with_default_return retval = new DBLParser.with_default_return();
		retval.start = input.LT(1);
		int with_default_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH207=null;
		Token DEFAULT208=null;

		CommonTree WITH207_tree=null;
		CommonTree DEFAULT208_tree=null;
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// DBL.g:707:13: ( WITH DEFAULT -> ^( WITH_DEFAULT ) )
			// DBL.g:708:2: WITH DEFAULT
			{
			WITH207=(Token)match(input,WITH,FOLLOW_WITH_in_with_default6039); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH207);

			DEFAULT208=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_with_default6041); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT208);

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
			// 708:15: -> ^( WITH_DEFAULT )
			{
				// DBL.g:708:18: ^( WITH_DEFAULT )
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
			if ( state.backtracking>0 ) { memoize(input, 59, with_default_StartIndex); }

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
	// DBL.g:711:1: field_type : data_type ;
	public final DBLParser.field_type_return field_type() throws RecognitionException {
		DBLParser.field_type_return retval = new DBLParser.field_type_return();
		retval.start = input.LT(1);
		int field_type_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope data_type209 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// DBL.g:712:3: ( data_type )
			// DBL.g:712:5: data_type
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_data_type_in_field_type6067);
			data_type209=data_type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, data_type209.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, field_type_StartIndex); }

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
	// DBL.g:725:1: query_expression : query_expression_body ;
	public final DBLParser.query_expression_return query_expression() throws RecognitionException {
		DBLParser.query_expression_return retval = new DBLParser.query_expression_return();
		retval.start = input.LT(1);
		int query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_expression_body210 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// DBL.g:726:3: ( query_expression_body )
			// DBL.g:726:5: query_expression_body
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_expression_body_in_query_expression6088);
			query_expression_body210=query_expression_body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_expression_body210.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, query_expression_StartIndex); }

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
	// DBL.g:728:1: query_expression_body : ( non_join_query_expression | joined_table );
	public final DBLParser.query_expression_body_return query_expression_body() throws RecognitionException {
		DBLParser.query_expression_body_return retval = new DBLParser.query_expression_body_return();
		retval.start = input.LT(1);
		int query_expression_body_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_expression211 =null;
		ParserRuleReturnScope joined_table212 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// DBL.g:729:3: ( non_join_query_expression | joined_table )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==LEFT_PAREN||LA68_0==SELECT) ) {
				alt68=1;
			}
			else if ( (LA68_0==Identifier) ) {
				int LA68_3 = input.LA(2);
				if ( (synpred112_DBL()) ) {
					alt68=1;
				}
				else if ( (true) ) {
					alt68=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// DBL.g:729:5: non_join_query_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_expression_in_query_expression_body6100);
					non_join_query_expression211=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression211.getTree());

					}
					break;
				case 2 :
					// DBL.g:730:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_expression_body6106);
					joined_table212=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table212.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 62, query_expression_body_StartIndex); }

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
	// DBL.g:732:1: non_join_query_expression : ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* ;
	public final DBLParser.non_join_query_expression_return non_join_query_expression() throws RecognitionException {
		DBLParser.non_join_query_expression_return retval = new DBLParser.non_join_query_expression_return();
		retval.start = input.LT(1);
		int non_join_query_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set215=null;
		Token set216=null;
		Token set218=null;
		Token set219=null;
		ParserRuleReturnScope non_join_query_term213 =null;
		ParserRuleReturnScope joined_table214 =null;
		ParserRuleReturnScope query_term217 =null;
		ParserRuleReturnScope query_term220 =null;

		CommonTree set215_tree=null;
		CommonTree set216_tree=null;
		CommonTree set218_tree=null;
		CommonTree set219_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// DBL.g:733:3: ( ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )* )
			// DBL.g:733:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term ) ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// DBL.g:733:5: ( non_join_query_term | joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==LEFT_PAREN||LA70_0==SELECT) ) {
				alt70=1;
			}
			else if ( (LA70_0==Identifier) ) {
				int LA70_3 = input.LA(2);
				if ( (synpred113_DBL()) ) {
					alt70=1;
				}
				else if ( (true) ) {
					alt70=2;
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
					// DBL.g:733:6: non_join_query_term
					{
					pushFollow(FOLLOW_non_join_query_term_in_non_join_query_expression6119);
					non_join_query_term213=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term213.getTree());

					}
					break;
				case 2 :
					// DBL.g:733:28: joined_table ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_expression6123);
					joined_table214=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table214.getTree());

					set215=input.LT(1);
					set215=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set215), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// DBL.g:733:59: ( ALL | DISTINCT )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==ALL||LA69_0==DISTINCT) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// DBL.g:
							{
							set216=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set216));
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

					pushFollow(FOLLOW_query_term_in_non_join_query_expression6141);
					query_term217=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term217.getTree());

					}
					break;

			}

			// DBL.g:734:5: ( ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==EXCEPT||LA72_0==UNION) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// DBL.g:734:6: ( UNION | EXCEPT ) ^ ( ALL | DISTINCT )? query_term
					{
					set218=input.LT(1);
					set218=input.LT(1);
					if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set218), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// DBL.g:734:24: ( ALL | DISTINCT )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==ALL||LA71_0==DISTINCT) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// DBL.g:
							{
							set219=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set219));
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

					pushFollow(FOLLOW_query_term_in_non_join_query_expression6165);
					query_term220=query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_term220.getTree());

					}
					break;

				default :
					break loop72;
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
			if ( state.backtracking>0 ) { memoize(input, 63, non_join_query_expression_StartIndex); }

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
	// DBL.g:736:1: query_term : ( non_join_query_term | joined_table );
	public final DBLParser.query_term_return query_term() throws RecognitionException {
		DBLParser.query_term_return retval = new DBLParser.query_term_return();
		retval.start = input.LT(1);
		int query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_term221 =null;
		ParserRuleReturnScope joined_table222 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// DBL.g:737:3: ( non_join_query_term | joined_table )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==LEFT_PAREN||LA73_0==SELECT) ) {
				alt73=1;
			}
			else if ( (LA73_0==Identifier) ) {
				int LA73_3 = input.LA(2);
				if ( (synpred121_DBL()) ) {
					alt73=1;
				}
				else if ( (true) ) {
					alt73=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// DBL.g:737:5: non_join_query_term
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_term_in_query_term6179);
					non_join_query_term221=non_join_query_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_term221.getTree());

					}
					break;
				case 2 :
					// DBL.g:738:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_term6185);
					joined_table222=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table222.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 64, query_term_StartIndex); }

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
	// DBL.g:740:1: non_join_query_term : ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* ;
	public final DBLParser.non_join_query_term_return non_join_query_term() throws RecognitionException {
		DBLParser.non_join_query_term_return retval = new DBLParser.non_join_query_term_return();
		retval.start = input.LT(1);
		int non_join_query_term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INTERSECT225=null;
		Token set226=null;
		Token INTERSECT228=null;
		Token set229=null;
		ParserRuleReturnScope non_join_query_primary223 =null;
		ParserRuleReturnScope joined_table224 =null;
		ParserRuleReturnScope query_primary227 =null;
		ParserRuleReturnScope query_primary230 =null;

		CommonTree INTERSECT225_tree=null;
		CommonTree set226_tree=null;
		CommonTree INTERSECT228_tree=null;
		CommonTree set229_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// DBL.g:741:3: ( ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )* )
			// DBL.g:741:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary ) ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// DBL.g:741:5: ( non_join_query_primary | joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==LEFT_PAREN||LA75_0==SELECT) ) {
				alt75=1;
			}
			else if ( (LA75_0==Identifier) ) {
				alt75=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// DBL.g:741:7: non_join_query_primary
					{
					pushFollow(FOLLOW_non_join_query_primary_in_non_join_query_term6199);
					non_join_query_primary223=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary223.getTree());

					}
					break;
				case 2 :
					// DBL.g:741:32: joined_table INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					pushFollow(FOLLOW_joined_table_in_non_join_query_term6203);
					joined_table224=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table224.getTree());

					INTERSECT225=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term6205); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT225_tree = (CommonTree)adaptor.create(INTERSECT225);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT225_tree, root_0);
					}

					// DBL.g:741:56: ( ALL | DISTINCT )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==ALL||LA74_0==DISTINCT) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// DBL.g:
							{
							set226=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set226));
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

					pushFollow(FOLLOW_query_primary_in_non_join_query_term6215);
					query_primary227=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary227.getTree());

					}
					break;

			}

			// DBL.g:742:5: ( INTERSECT ^ ( ALL | DISTINCT )? query_primary )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==INTERSECT) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// DBL.g:742:6: INTERSECT ^ ( ALL | DISTINCT )? query_primary
					{
					INTERSECT228=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_non_join_query_term6223); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTERSECT228_tree = (CommonTree)adaptor.create(INTERSECT228);
					root_0 = (CommonTree)adaptor.becomeRoot(INTERSECT228_tree, root_0);
					}

					// DBL.g:742:17: ( ALL | DISTINCT )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==ALL||LA76_0==DISTINCT) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// DBL.g:
							{
							set229=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==DISTINCT ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set229));
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

					pushFollow(FOLLOW_query_primary_in_non_join_query_term6233);
					query_primary230=query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, query_primary230.getTree());

					}
					break;

				default :
					break loop77;
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
			if ( state.backtracking>0 ) { memoize(input, 65, non_join_query_term_StartIndex); }

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
	// DBL.g:744:1: query_primary : ( non_join_query_primary | joined_table );
	public final DBLParser.query_primary_return query_primary() throws RecognitionException {
		DBLParser.query_primary_return retval = new DBLParser.query_primary_return();
		retval.start = input.LT(1);
		int query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope non_join_query_primary231 =null;
		ParserRuleReturnScope joined_table232 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// DBL.g:745:3: ( non_join_query_primary | joined_table )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==LEFT_PAREN||LA78_0==SELECT) ) {
				alt78=1;
			}
			else if ( (LA78_0==Identifier) ) {
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
					// DBL.g:745:5: non_join_query_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_non_join_query_primary_in_query_primary6247);
					non_join_query_primary231=non_join_query_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_primary231.getTree());

					}
					break;
				case 2 :
					// DBL.g:746:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_query_primary6253);
					joined_table232=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table232.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 66, query_primary_StartIndex); }

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
	// DBL.g:748:1: non_join_query_primary : ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN );
	public final DBLParser.non_join_query_primary_return non_join_query_primary() throws RecognitionException {
		DBLParser.non_join_query_primary_return retval = new DBLParser.non_join_query_primary_return();
		retval.start = input.LT(1);
		int non_join_query_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN234=null;
		Token RIGHT_PAREN236=null;
		ParserRuleReturnScope simple_table233 =null;
		ParserRuleReturnScope non_join_query_expression235 =null;

		CommonTree LEFT_PAREN234_tree=null;
		CommonTree RIGHT_PAREN236_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// DBL.g:749:3: ( simple_table | LEFT_PAREN non_join_query_expression RIGHT_PAREN )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==SELECT) ) {
				alt79=1;
			}
			else if ( (LA79_0==LEFT_PAREN) ) {
				alt79=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// DBL.g:749:5: simple_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_table_in_non_join_query_primary6265);
					simple_table233=simple_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_table233.getTree());

					}
					break;
				case 2 :
					// DBL.g:750:5: LEFT_PAREN non_join_query_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN234=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_non_join_query_primary6271); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN234_tree = (CommonTree)adaptor.create(LEFT_PAREN234);
					adaptor.addChild(root_0, LEFT_PAREN234_tree);
					}

					pushFollow(FOLLOW_non_join_query_expression_in_non_join_query_primary6273);
					non_join_query_expression235=non_join_query_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, non_join_query_expression235.getTree());

					RIGHT_PAREN236=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_non_join_query_primary6275); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN236_tree = (CommonTree)adaptor.create(RIGHT_PAREN236);
					adaptor.addChild(root_0, RIGHT_PAREN236_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 67, non_join_query_primary_StartIndex); }

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
	// DBL.g:752:1: simple_table options {k=1; } : query_specification ;
	public final DBLParser.simple_table_return simple_table() throws RecognitionException {
		DBLParser.simple_table_return retval = new DBLParser.simple_table_return();
		retval.start = input.LT(1);
		int simple_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope query_specification237 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// DBL.g:754:3: ( query_specification )
			// DBL.g:754:5: query_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_query_specification_in_simple_table6296);
			query_specification237=query_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, query_specification237.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, simple_table_StartIndex); }

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
	// DBL.g:756:1: query_specification : SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) ;
	public final DBLParser.query_specification_return query_specification() throws RecognitionException {
		DBLParser.query_specification_return retval = new DBLParser.query_specification_return();
		retval.start = input.LT(1);
		int query_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SELECT238=null;
		ParserRuleReturnScope set_qualifier239 =null;
		ParserRuleReturnScope select_list240 =null;
		ParserRuleReturnScope from_clause241 =null;
		ParserRuleReturnScope where_clause242 =null;
		ParserRuleReturnScope groupby_clause243 =null;
		ParserRuleReturnScope having_clause244 =null;
		ParserRuleReturnScope orderby_clause245 =null;
		ParserRuleReturnScope limit_clause246 =null;

		CommonTree SELECT238_tree=null;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// DBL.g:757:3: ( SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? ) )
			// DBL.g:757:5: SELECT ( set_qualifier )? select_list ( from_clause )? ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )?
			{
			SELECT238=(Token)match(input,SELECT,FOLLOW_SELECT_in_query_specification6308); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SELECT.add(SELECT238);

			// DBL.g:757:12: ( set_qualifier )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==ALL||LA80_0==DISTINCT) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// DBL.g:757:12: set_qualifier
					{
					pushFollow(FOLLOW_set_qualifier_in_query_specification6310);
					set_qualifier239=set_qualifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_set_qualifier.add(set_qualifier239.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_select_list_in_query_specification6313);
			select_list240=select_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_select_list.add(select_list240.getTree());
			// DBL.g:757:39: ( from_clause )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==FROM) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// DBL.g:757:39: from_clause
					{
					pushFollow(FOLLOW_from_clause_in_query_specification6315);
					from_clause241=from_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_from_clause.add(from_clause241.getTree());
					}
					break;

			}

			// DBL.g:757:52: ( where_clause )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==WHERE) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// DBL.g:757:52: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_query_specification6318);
					where_clause242=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause242.getTree());
					}
					break;

			}

			// DBL.g:757:66: ( groupby_clause )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==GROUP) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// DBL.g:757:66: groupby_clause
					{
					pushFollow(FOLLOW_groupby_clause_in_query_specification6321);
					groupby_clause243=groupby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_clause.add(groupby_clause243.getTree());
					}
					break;

			}

			// DBL.g:757:82: ( having_clause )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==HAVING) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// DBL.g:757:82: having_clause
					{
					pushFollow(FOLLOW_having_clause_in_query_specification6324);
					having_clause244=having_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_having_clause.add(having_clause244.getTree());
					}
					break;

			}

			// DBL.g:758:5: ( orderby_clause )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==ORDER) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// DBL.g:758:5: orderby_clause
					{
					pushFollow(FOLLOW_orderby_clause_in_query_specification6331);
					orderby_clause245=orderby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_clause.add(orderby_clause245.getTree());
					}
					break;

			}

			// DBL.g:758:21: ( limit_clause )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==LIMIT) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// DBL.g:758:21: limit_clause
					{
					pushFollow(FOLLOW_limit_clause_in_query_specification6334);
					limit_clause246=limit_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_limit_clause.add(limit_clause246.getTree());
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
			// 759:5: -> ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
			{
				// DBL.g:759:8: ^( SELECT ( from_clause )? ( set_qualifier )? select_list ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ( limit_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SELECT.nextNode(), root_1);
				// DBL.g:759:17: ( from_clause )?
				if ( stream_from_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_from_clause.nextTree());
				}
				stream_from_clause.reset();

				// DBL.g:759:30: ( set_qualifier )?
				if ( stream_set_qualifier.hasNext() ) {
					adaptor.addChild(root_1, stream_set_qualifier.nextTree());
				}
				stream_set_qualifier.reset();

				adaptor.addChild(root_1, stream_select_list.nextTree());
				// DBL.g:759:57: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				// DBL.g:759:71: ( groupby_clause )?
				if ( stream_groupby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_clause.nextTree());
				}
				stream_groupby_clause.reset();

				// DBL.g:760:5: ( having_clause )?
				if ( stream_having_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_having_clause.nextTree());
				}
				stream_having_clause.reset();

				// DBL.g:760:20: ( orderby_clause )?
				if ( stream_orderby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_orderby_clause.nextTree());
				}
				stream_orderby_clause.reset();

				// DBL.g:760:36: ( limit_clause )?
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
			if ( state.backtracking>0 ) { memoize(input, 69, query_specification_StartIndex); }

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
	// DBL.g:762:1: select_list : ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) );
	public final DBLParser.select_list_return select_list() throws RecognitionException {
		DBLParser.select_list_return retval = new DBLParser.select_list_return();
		retval.start = input.LT(1);
		int select_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token MULTIPLY247=null;
		Token COMMA249=null;
		ParserRuleReturnScope derived_column248 =null;
		ParserRuleReturnScope derived_column250 =null;

		CommonTree MULTIPLY247_tree=null;
		CommonTree COMMA249_tree=null;
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_derived_column=new RewriteRuleSubtreeStream(adaptor,"rule derived_column");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// DBL.g:763:3: ( MULTIPLY -> ^( SEL_LIST ALL ) | derived_column ( COMMA derived_column )* -> ^( SEL_LIST ( derived_column )+ ) )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==MULTIPLY) ) {
				alt88=1;
			}
			else if ( (LA88_0==CASE||LA88_0==COUNT||LA88_0==Character_String_Literal||LA88_0==Identifier||LA88_0==LEFT_PAREN||LA88_0==MINUS||LA88_0==NOT||LA88_0==NULL||LA88_0==NUMBER||LA88_0==PLUS||LA88_0==REAL_NUMBER) ) {
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
					// DBL.g:763:5: MULTIPLY
					{
					MULTIPLY247=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_select_list6384); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY247);

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
					// 763:14: -> ^( SEL_LIST ALL )
					{
						// DBL.g:763:17: ^( SEL_LIST ALL )
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
					// DBL.g:764:5: derived_column ( COMMA derived_column )*
					{
					pushFollow(FOLLOW_derived_column_in_select_list6398);
					derived_column248=derived_column();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_derived_column.add(derived_column248.getTree());
					// DBL.g:764:20: ( COMMA derived_column )*
					loop87:
					while (true) {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( (LA87_0==COMMA) ) {
							alt87=1;
						}

						switch (alt87) {
						case 1 :
							// DBL.g:764:21: COMMA derived_column
							{
							COMMA249=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list6401); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA249);

							pushFollow(FOLLOW_derived_column_in_select_list6403);
							derived_column250=derived_column();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_derived_column.add(derived_column250.getTree());
							}
							break;

						default :
							break loop87;
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
					// 764:44: -> ^( SEL_LIST ( derived_column )+ )
					{
						// DBL.g:764:47: ^( SEL_LIST ( derived_column )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 70, select_list_StartIndex); }

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
	// DBL.g:766:1: set_qualifier : ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) );
	public final DBLParser.set_qualifier_return set_qualifier() throws RecognitionException {
		DBLParser.set_qualifier_return retval = new DBLParser.set_qualifier_return();
		retval.start = input.LT(1);
		int set_qualifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DISTINCT251=null;
		Token ALL252=null;

		CommonTree DISTINCT251_tree=null;
		CommonTree ALL252_tree=null;
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// DBL.g:767:3: ( DISTINCT -> ^( SET_QUALIFIER DISTINCT ) | ALL -> ^( SET_QUALIFIER ALL ) )
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==DISTINCT) ) {
				alt89=1;
			}
			else if ( (LA89_0==ALL) ) {
				alt89=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}

			switch (alt89) {
				case 1 :
					// DBL.g:767:5: DISTINCT
					{
					DISTINCT251=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_set_qualifier6426); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT251);

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
					// 767:14: -> ^( SET_QUALIFIER DISTINCT )
					{
						// DBL.g:767:17: ^( SET_QUALIFIER DISTINCT )
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
					// DBL.g:768:5: ALL
					{
					ALL252=(Token)match(input,ALL,FOLLOW_ALL_in_set_qualifier6440); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL252);

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
					// 768:9: -> ^( SET_QUALIFIER ALL )
					{
						// DBL.g:768:12: ^( SET_QUALIFIER ALL )
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
			if ( state.backtracking>0 ) { memoize(input, 71, set_qualifier_StartIndex); }

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
	// DBL.g:770:1: derived_column : boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) ;
	public final DBLParser.derived_column_return derived_column() throws RecognitionException {
		DBLParser.derived_column_return retval = new DBLParser.derived_column_return();
		retval.start = input.LT(1);
		int derived_column_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression253 =null;
		ParserRuleReturnScope as_clause254 =null;

		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");
		RewriteRuleSubtreeStream stream_as_clause=new RewriteRuleSubtreeStream(adaptor,"rule as_clause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// DBL.g:771:3: ( boolean_value_expression ( as_clause )? -> ^( COLUMN boolean_value_expression ( as_clause )? ) )
			// DBL.g:771:5: boolean_value_expression ( as_clause )?
			{
			pushFollow(FOLLOW_boolean_value_expression_in_derived_column6460);
			boolean_value_expression253=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression253.getTree());
			// DBL.g:771:30: ( as_clause )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==AS||LA90_0==Identifier) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// DBL.g:771:30: as_clause
					{
					pushFollow(FOLLOW_as_clause_in_derived_column6462);
					as_clause254=as_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_as_clause.add(as_clause254.getTree());
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
			// 771:41: -> ^( COLUMN boolean_value_expression ( as_clause )? )
			{
				// DBL.g:771:44: ^( COLUMN boolean_value_expression ( as_clause )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COLUMN, "COLUMN"), root_1);
				adaptor.addChild(root_1, stream_boolean_value_expression.nextTree());
				// DBL.g:771:78: ( as_clause )?
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
			if ( state.backtracking>0 ) { memoize(input, 72, derived_column_StartIndex); }

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
	// DBL.g:774:1: column_reference : b= Identifier -> ^( COLUMN_NAME $b) ;
	public final DBLParser.column_reference_return column_reference() throws RecognitionException {
		DBLParser.column_reference_return retval = new DBLParser.column_reference_return();
		retval.start = input.LT(1);
		int column_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		Token b=null;

		CommonTree b_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// DBL.g:775:2: (b= Identifier -> ^( COLUMN_NAME $b) )
			// DBL.g:775:4: b= Identifier
			{
			b=(Token)match(input,Identifier,FOLLOW_Identifier_in_column_reference6490); if (state.failed) return retval; 
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
			// 775:17: -> ^( COLUMN_NAME $b)
			{
				// DBL.g:775:20: ^( COLUMN_NAME $b)
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
			if ( state.backtracking>0 ) { memoize(input, 73, column_reference_StartIndex); }

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
	// DBL.g:778:1: as_clause : ( AS )? column_reference ;
	public final DBLParser.as_clause_return as_clause() throws RecognitionException {
		DBLParser.as_clause_return retval = new DBLParser.as_clause_return();
		retval.start = input.LT(1);
		int as_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AS255=null;
		ParserRuleReturnScope column_reference256 =null;

		CommonTree AS255_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// DBL.g:779:3: ( ( AS )? column_reference )
			// DBL.g:779:5: ( AS )? column_reference
			{
			root_0 = (CommonTree)adaptor.nil();


			// DBL.g:779:5: ( AS )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==AS) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// DBL.g:779:6: AS
					{
					AS255=(Token)match(input,AS,FOLLOW_AS_in_as_clause6514); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AS255_tree = (CommonTree)adaptor.create(AS255);
					adaptor.addChild(root_0, AS255_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_column_reference_in_as_clause6518);
			column_reference256=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference256.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, as_clause_StartIndex); }

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
	// DBL.g:781:1: column_reference_list : column_reference ( COMMA column_reference )* -> ( column_reference )+ ;
	public final DBLParser.column_reference_list_return column_reference_list() throws RecognitionException {
		DBLParser.column_reference_list_return retval = new DBLParser.column_reference_list_return();
		retval.start = input.LT(1);
		int column_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA258=null;
		ParserRuleReturnScope column_reference257 =null;
		ParserRuleReturnScope column_reference259 =null;

		CommonTree COMMA258_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// DBL.g:782:2: ( column_reference ( COMMA column_reference )* -> ( column_reference )+ )
			// DBL.g:782:4: column_reference ( COMMA column_reference )*
			{
			pushFollow(FOLLOW_column_reference_in_column_reference_list6529);
			column_reference257=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(column_reference257.getTree());
			// DBL.g:782:21: ( COMMA column_reference )*
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==COMMA) ) {
					int LA92_2 = input.LA(2);
					if ( (LA92_2==Identifier) ) {
						int LA92_3 = input.LA(3);
						if ( (synpred142_DBL()) ) {
							alt92=1;
						}

					}

				}

				switch (alt92) {
				case 1 :
					// DBL.g:782:22: COMMA column_reference
					{
					COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_reference_list6532); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA258);

					pushFollow(FOLLOW_column_reference_in_column_reference_list6534);
					column_reference259=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_column_reference.add(column_reference259.getTree());
					}
					break;

				default :
					break loop92;
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
			// 782:47: -> ( column_reference )+
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
			if ( state.backtracking>0 ) { memoize(input, 75, column_reference_list_StartIndex); }

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
	// DBL.g:784:1: table : ( Identifier | qualified_identifier );
	public final DBLParser.table_return table() throws RecognitionException {
		DBLParser.table_return retval = new DBLParser.table_return();
		retval.start = input.LT(1);
		int table_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier260=null;
		ParserRuleReturnScope qualified_identifier261 =null;

		CommonTree Identifier260_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// DBL.g:785:3: ( Identifier | qualified_identifier )
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==Identifier) ) {
				int LA93_1 = input.LA(2);
				if ( (LA93_1==DIVIDE) ) {
					alt93=2;
				}
				else if ( (LA93_1==EOF||LA93_1==AS||LA93_1==COMMA||LA93_1==CROSS||LA93_1==EXCEPT||LA93_1==FULL||LA93_1==GROUP||LA93_1==HAVING||LA93_1==INNER||LA93_1==INTERSECT||LA93_1==Identifier||LA93_1==JOIN||LA93_1==LEFT||LA93_1==LIMIT||LA93_1==NATURAL||LA93_1==ON||LA93_1==ORDER||(LA93_1 >= RIGHT && LA93_1 <= RIGHT_PAREN)||LA93_1==UNION||LA93_1==USING||LA93_1==WHERE) ) {
					alt93=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}

			switch (alt93) {
				case 1 :
					// DBL.g:785:5: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier260=(Token)match(input,Identifier,FOLLOW_Identifier_in_table6552); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier260_tree = (CommonTree)adaptor.create(Identifier260);
					adaptor.addChild(root_0, Identifier260_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:787:5: qualified_identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_identifier_in_table6564);
					qualified_identifier261=qualified_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_identifier261.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 76, table_StartIndex); }

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
	// DBL.g:790:1: qualified_identifier : l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )? -> ^( QUALIFIED $l $f ( $m)? ) ;
	public final DBLParser.qualified_identifier_return qualified_identifier() throws RecognitionException {
		DBLParser.qualified_identifier_return retval = new DBLParser.qualified_identifier_return();
		retval.start = input.LT(1);
		int qualified_identifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE262=null;
		Token LEFT_PAREN263=null;
		Token RIGHT_PAREN264=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE262_tree=null;
		CommonTree LEFT_PAREN263_tree=null;
		CommonTree RIGHT_PAREN264_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// DBL.g:791:3: (l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )? -> ^( QUALIFIED $l $f ( $m)? ) )
			// DBL.g:791:5: l= Identifier DIVIDE f= Identifier ( LEFT_PAREN m= Identifier RIGHT_PAREN )?
			{
			l=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6579); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(l);

			DIVIDE262=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_qualified_identifier6581); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE262);

			f=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6585); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(f);

			// DBL.g:791:38: ( LEFT_PAREN m= Identifier RIGHT_PAREN )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==LEFT_PAREN) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// DBL.g:791:39: LEFT_PAREN m= Identifier RIGHT_PAREN
					{
					LEFT_PAREN263=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_qualified_identifier6588); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN263);

					m=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualified_identifier6592); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(m);

					RIGHT_PAREN264=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_qualified_identifier6594); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN264);

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
			// 791:77: -> ^( QUALIFIED $l $f ( $m)? )
			{
				// DBL.g:791:80: ^( QUALIFIED $l $f ( $m)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED, "QUALIFIED"), root_1);
				adaptor.addChild(root_1, stream_l.nextNode());
				adaptor.addChild(root_1, stream_f.nextNode());
				// DBL.g:791:99: ( $m)?
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
			if ( state.backtracking>0 ) { memoize(input, 77, qualified_identifier_StartIndex); }

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
	// DBL.g:794:1: member : l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) ;
	public final DBLParser.member_return member() throws RecognitionException {
		DBLParser.member_return retval = new DBLParser.member_return();
		retval.start = input.LT(1);
		int member_StartIndex = input.index();

		CommonTree root_0 = null;

		Token l=null;
		Token f=null;
		Token m=null;
		Token DIVIDE265=null;
		Token LEFT_PAREN266=null;
		Token RIGHT_PAREN267=null;

		CommonTree l_tree=null;
		CommonTree f_tree=null;
		CommonTree m_tree=null;
		CommonTree DIVIDE265_tree=null;
		CommonTree LEFT_PAREN266_tree=null;
		CommonTree RIGHT_PAREN267_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// DBL.g:794:8: (l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN -> ^( MEMBER $l $f $m) )
			// DBL.g:795:2: l= Identifier DIVIDE f= Identifier LEFT_PAREN m= Identifier RIGHT_PAREN
			{
			l=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6629); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(l);

			DIVIDE265=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_member6631); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE265);

			f=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6635); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(f);

			LEFT_PAREN266=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_member6637); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN266);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_member6641); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(m);

			RIGHT_PAREN267=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_member6643); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN267);

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
			// 795:71: -> ^( MEMBER $l $f $m)
			{
				// DBL.g:795:74: ^( MEMBER $l $f $m)
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
			if ( state.backtracking>0 ) { memoize(input, 78, member_StartIndex); }

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
	// DBL.g:798:1: from_clause : FROM ^ table_reference_list ;
	public final DBLParser.from_clause_return from_clause() throws RecognitionException {
		DBLParser.from_clause_return retval = new DBLParser.from_clause_return();
		retval.start = input.LT(1);
		int from_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FROM268=null;
		ParserRuleReturnScope table_reference_list269 =null;

		CommonTree FROM268_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// DBL.g:799:3: ( FROM ^ table_reference_list )
			// DBL.g:799:5: FROM ^ table_reference_list
			{
			root_0 = (CommonTree)adaptor.nil();


			FROM268=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause6678); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FROM268_tree = (CommonTree)adaptor.create(FROM268);
			root_0 = (CommonTree)adaptor.becomeRoot(FROM268_tree, root_0);
			}

			pushFollow(FOLLOW_table_reference_list_in_from_clause6681);
			table_reference_list269=table_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_reference_list269.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, from_clause_StartIndex); }

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
	// DBL.g:801:1: table_reference_list : table_reference ( COMMA table_reference )* -> ( table_reference )+ ;
	public final DBLParser.table_reference_list_return table_reference_list() throws RecognitionException {
		DBLParser.table_reference_list_return retval = new DBLParser.table_reference_list_return();
		retval.start = input.LT(1);
		int table_reference_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA271=null;
		ParserRuleReturnScope table_reference270 =null;
		ParserRuleReturnScope table_reference272 =null;

		CommonTree COMMA271_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_table_reference=new RewriteRuleSubtreeStream(adaptor,"rule table_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// DBL.g:802:3: ( table_reference ( COMMA table_reference )* -> ( table_reference )+ )
			// DBL.g:802:4: table_reference ( COMMA table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_reference_list6692);
			table_reference270=table_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_reference.add(table_reference270.getTree());
			// DBL.g:802:20: ( COMMA table_reference )*
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==COMMA) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// DBL.g:802:21: COMMA table_reference
					{
					COMMA271=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_reference_list6695); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA271);

					pushFollow(FOLLOW_table_reference_in_table_reference_list6697);
					table_reference272=table_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_table_reference.add(table_reference272.getTree());
					}
					break;

				default :
					break loop95;
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
			// 802:45: -> ( table_reference )+
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
			if ( state.backtracking>0 ) { memoize(input, 80, table_reference_list_StartIndex); }

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
	// DBL.g:804:1: table_reference : ( table_primary | joined_table );
	public final DBLParser.table_reference_return table_reference() throws RecognitionException {
		DBLParser.table_reference_return retval = new DBLParser.table_reference_return();
		retval.start = input.LT(1);
		int table_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary273 =null;
		ParserRuleReturnScope joined_table274 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// DBL.g:805:3: ( table_primary | joined_table )
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case DIVIDE:
					{
					int LA96_2 = input.LA(3);
					if ( (LA96_2==Identifier) ) {
						switch ( input.LA(4) ) {
						case LEFT_PAREN:
							{
							int LA96_9 = input.LA(5);
							if ( (LA96_9==Identifier) ) {
								int LA96_10 = input.LA(6);
								if ( (LA96_10==RIGHT_PAREN) ) {
									switch ( input.LA(7) ) {
									case AS:
										{
										int LA96_3 = input.LA(8);
										if ( (LA96_3==Identifier) ) {
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
												alt96=1;
												}
												break;
											case UNION:
												{
												int LA96_6 = input.LA(10);
												if ( (LA96_6==JOIN) ) {
													alt96=2;
												}
												else if ( (LA96_6==ALL||LA96_6==DISTINCT||LA96_6==Identifier||LA96_6==LEFT_PAREN||LA96_6==SELECT) ) {
													alt96=1;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 96, 6, input);
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
												alt96=2;
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
														new NoViableAltException("", 96, 4, input);
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
													new NoViableAltException("", 96, 3, input);
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
											alt96=1;
											}
											break;
										case UNION:
											{
											int LA96_6 = input.LA(9);
											if ( (LA96_6==JOIN) ) {
												alt96=2;
											}
											else if ( (LA96_6==ALL||LA96_6==DISTINCT||LA96_6==Identifier||LA96_6==LEFT_PAREN||LA96_6==SELECT) ) {
												alt96=1;
											}

											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 96, 6, input);
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
											alt96=2;
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
													new NoViableAltException("", 96, 4, input);
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
										alt96=1;
										}
										break;
									case UNION:
										{
										int LA96_6 = input.LA(8);
										if ( (LA96_6==JOIN) ) {
											alt96=2;
										}
										else if ( (LA96_6==ALL||LA96_6==DISTINCT||LA96_6==Identifier||LA96_6==LEFT_PAREN||LA96_6==SELECT) ) {
											alt96=1;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 96, 6, input);
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
										alt96=2;
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
												new NoViableAltException("", 96, 11, input);
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
											new NoViableAltException("", 96, 10, input);
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
										new NoViableAltException("", 96, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case AS:
							{
							int LA96_3 = input.LA(5);
							if ( (LA96_3==Identifier) ) {
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
									alt96=1;
									}
									break;
								case UNION:
									{
									int LA96_6 = input.LA(7);
									if ( (LA96_6==JOIN) ) {
										alt96=2;
									}
									else if ( (LA96_6==ALL||LA96_6==DISTINCT||LA96_6==Identifier||LA96_6==LEFT_PAREN||LA96_6==SELECT) ) {
										alt96=1;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 96, 6, input);
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
									alt96=2;
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
											new NoViableAltException("", 96, 4, input);
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
										new NoViableAltException("", 96, 3, input);
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
								alt96=1;
								}
								break;
							case UNION:
								{
								int LA96_6 = input.LA(6);
								if ( (LA96_6==JOIN) ) {
									alt96=2;
								}
								else if ( (LA96_6==ALL||LA96_6==DISTINCT||LA96_6==Identifier||LA96_6==LEFT_PAREN||LA96_6==SELECT) ) {
									alt96=1;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 96, 6, input);
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
								alt96=2;
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
										new NoViableAltException("", 96, 4, input);
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
							alt96=1;
							}
							break;
						case UNION:
							{
							int LA96_6 = input.LA(5);
							if ( (LA96_6==JOIN) ) {
								alt96=2;
							}
							else if ( (LA96_6==ALL||LA96_6==DISTINCT||LA96_6==Identifier||LA96_6==LEFT_PAREN||LA96_6==SELECT) ) {
								alt96=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 96, 6, input);
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
							alt96=2;
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
									new NoViableAltException("", 96, 8, input);
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
								new NoViableAltException("", 96, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case AS:
					{
					int LA96_3 = input.LA(3);
					if ( (LA96_3==Identifier) ) {
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
							alt96=1;
							}
							break;
						case UNION:
							{
							int LA96_6 = input.LA(5);
							if ( (LA96_6==JOIN) ) {
								alt96=2;
							}
							else if ( (LA96_6==ALL||LA96_6==DISTINCT||LA96_6==Identifier||LA96_6==LEFT_PAREN||LA96_6==SELECT) ) {
								alt96=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 96, 6, input);
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
							alt96=2;
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
									new NoViableAltException("", 96, 4, input);
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
								new NoViableAltException("", 96, 3, input);
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
						alt96=1;
						}
						break;
					case UNION:
						{
						int LA96_6 = input.LA(4);
						if ( (LA96_6==JOIN) ) {
							alt96=2;
						}
						else if ( (LA96_6==ALL||LA96_6==DISTINCT||LA96_6==Identifier||LA96_6==LEFT_PAREN||LA96_6==SELECT) ) {
							alt96=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 96, 6, input);
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
						alt96=2;
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
								new NoViableAltException("", 96, 4, input);
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
					alt96=1;
					}
					break;
				case UNION:
					{
					int LA96_6 = input.LA(3);
					if ( (LA96_6==JOIN) ) {
						alt96=2;
					}
					else if ( (LA96_6==ALL||LA96_6==DISTINCT||LA96_6==Identifier||LA96_6==LEFT_PAREN||LA96_6==SELECT) ) {
						alt96=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 96, 6, input);
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
					alt96=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}

			switch (alt96) {
				case 1 :
					// DBL.g:805:5: table_primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_table_primary_in_table_reference6716);
					table_primary273=table_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary273.getTree());

					}
					break;
				case 2 :
					// DBL.g:806:5: joined_table
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_joined_table_in_table_reference6722);
					joined_table274=joined_table();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joined_table274.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 81, table_reference_StartIndex); }

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
	// DBL.g:808:1: joined_table : table_primary ( cross_join | qualified_join | natural_join | union_join )+ ;
	public final DBLParser.joined_table_return joined_table() throws RecognitionException {
		DBLParser.joined_table_return retval = new DBLParser.joined_table_return();
		retval.start = input.LT(1);
		int joined_table_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope table_primary275 =null;
		ParserRuleReturnScope cross_join276 =null;
		ParserRuleReturnScope qualified_join277 =null;
		ParserRuleReturnScope natural_join278 =null;
		ParserRuleReturnScope union_join279 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// DBL.g:809:3: ( table_primary ( cross_join | qualified_join | natural_join | union_join )+ )
			// DBL.g:809:5: table_primary ( cross_join | qualified_join | natural_join | union_join )+
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_table_primary_in_joined_table6734);
			table_primary275=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_primary275.getTree());

			// DBL.g:809:19: ( cross_join | qualified_join | natural_join | union_join )+
			int cnt97=0;
			loop97:
			while (true) {
				int alt97=5;
				switch ( input.LA(1) ) {
				case UNION:
					{
					int LA97_2 = input.LA(2);
					if ( (LA97_2==JOIN) ) {
						alt97=4;
					}

					}
					break;
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
				}
				switch (alt97) {
				case 1 :
					// DBL.g:809:20: cross_join
					{
					pushFollow(FOLLOW_cross_join_in_joined_table6737);
					cross_join276=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join276.getTree());

					}
					break;
				case 2 :
					// DBL.g:809:33: qualified_join
					{
					pushFollow(FOLLOW_qualified_join_in_joined_table6741);
					qualified_join277=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join277.getTree());

					}
					break;
				case 3 :
					// DBL.g:809:50: natural_join
					{
					pushFollow(FOLLOW_natural_join_in_joined_table6745);
					natural_join278=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join278.getTree());

					}
					break;
				case 4 :
					// DBL.g:809:65: union_join
					{
					pushFollow(FOLLOW_union_join_in_joined_table6749);
					union_join279=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join279.getTree());

					}
					break;

				default :
					if ( cnt97 >= 1 ) break loop97;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(97, input);
					throw eee;
				}
				cnt97++;
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
			if ( state.backtracking>0 ) { memoize(input, 82, joined_table_StartIndex); }

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
	// DBL.g:811:1: joined_table_prim : ( cross_join | qualified_join | natural_join | union_join );
	public final DBLParser.joined_table_prim_return joined_table_prim() throws RecognitionException {
		DBLParser.joined_table_prim_return retval = new DBLParser.joined_table_prim_return();
		retval.start = input.LT(1);
		int joined_table_prim_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope cross_join280 =null;
		ParserRuleReturnScope qualified_join281 =null;
		ParserRuleReturnScope natural_join282 =null;
		ParserRuleReturnScope union_join283 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// DBL.g:812:3: ( cross_join | qualified_join | natural_join | union_join )
			int alt98=4;
			switch ( input.LA(1) ) {
			case CROSS:
				{
				alt98=1;
				}
				break;
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
				{
				alt98=2;
				}
				break;
			case NATURAL:
				{
				alt98=3;
				}
				break;
			case UNION:
				{
				alt98=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}
			switch (alt98) {
				case 1 :
					// DBL.g:812:5: cross_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cross_join_in_joined_table_prim6763);
					cross_join280=cross_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cross_join280.getTree());

					}
					break;
				case 2 :
					// DBL.g:813:5: qualified_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_join_in_joined_table_prim6769);
					qualified_join281=qualified_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified_join281.getTree());

					}
					break;
				case 3 :
					// DBL.g:814:5: natural_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_natural_join_in_joined_table_prim6775);
					natural_join282=natural_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_join282.getTree());

					}
					break;
				case 4 :
					// DBL.g:815:5: union_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_union_join_in_joined_table_prim6781);
					union_join283=union_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, union_join283.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 83, joined_table_prim_StartIndex); }

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
	// DBL.g:817:1: cross_join : CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) ;
	public final DBLParser.cross_join_return cross_join() throws RecognitionException {
		DBLParser.cross_join_return retval = new DBLParser.cross_join_return();
		retval.start = input.LT(1);
		int cross_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CROSS284=null;
		Token JOIN285=null;
		ParserRuleReturnScope r =null;

		CommonTree CROSS284_tree=null;
		CommonTree JOIN285_tree=null;
		RewriteRuleTokenStream stream_CROSS=new RewriteRuleTokenStream(adaptor,"token CROSS");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// DBL.g:818:3: ( CROSS JOIN r= table_primary -> ^( JOIN CROSS $r) )
			// DBL.g:818:5: CROSS JOIN r= table_primary
			{
			CROSS284=(Token)match(input,CROSS,FOLLOW_CROSS_in_cross_join6793); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CROSS.add(CROSS284);

			JOIN285=(Token)match(input,JOIN,FOLLOW_JOIN_in_cross_join6795); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN285);

			pushFollow(FOLLOW_table_primary_in_cross_join6799);
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
			// 818:32: -> ^( JOIN CROSS $r)
			{
				// DBL.g:818:35: ^( JOIN CROSS $r)
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
			if ( state.backtracking>0 ) { memoize(input, 84, cross_join_StartIndex); }

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
	// DBL.g:820:1: qualified_join : (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) ;
	public final DBLParser.qualified_join_return qualified_join() throws RecognitionException {
		DBLParser.qualified_join_return retval = new DBLParser.qualified_join_return();
		retval.start = input.LT(1);
		int qualified_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token JOIN286=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope s =null;

		CommonTree JOIN286_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_specification=new RewriteRuleSubtreeStream(adaptor,"rule join_specification");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// DBL.g:821:3: ( (t= join_type )? JOIN r= table_primary s= join_specification -> ^( JOIN ( $t)? $r $s) )
			// DBL.g:821:5: (t= join_type )? JOIN r= table_primary s= join_specification
			{
			// DBL.g:821:5: (t= join_type )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==FULL||LA99_0==INNER||LA99_0==LEFT||LA99_0==RIGHT) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// DBL.g:821:6: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_qualified_join6825);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN286=(Token)match(input,JOIN,FOLLOW_JOIN_in_qualified_join6829); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN286);

			pushFollow(FOLLOW_table_primary_in_qualified_join6833);
			r=table_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table_primary.add(r.getTree());
			pushFollow(FOLLOW_join_specification_in_qualified_join6837);
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
			// 821:62: -> ^( JOIN ( $t)? $r $s)
			{
				// DBL.g:821:65: ^( JOIN ( $t)? $r $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				// DBL.g:821:73: ( $t)?
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
			if ( state.backtracking>0 ) { memoize(input, 85, qualified_join_StartIndex); }

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
	// DBL.g:823:1: natural_join : NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) ;
	public final DBLParser.natural_join_return natural_join() throws RecognitionException {
		DBLParser.natural_join_return retval = new DBLParser.natural_join_return();
		retval.start = input.LT(1);
		int natural_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NATURAL287=null;
		Token JOIN288=null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope r =null;

		CommonTree NATURAL287_tree=null;
		CommonTree JOIN288_tree=null;
		RewriteRuleTokenStream stream_NATURAL=new RewriteRuleTokenStream(adaptor,"token NATURAL");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// DBL.g:824:3: ( NATURAL (t= join_type )? JOIN r= table_primary -> ^( JOIN NATURAL ( $t)? $r) )
			// DBL.g:824:5: NATURAL (t= join_type )? JOIN r= table_primary
			{
			NATURAL287=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_natural_join6865); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NATURAL.add(NATURAL287);

			// DBL.g:824:13: (t= join_type )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==FULL||LA100_0==INNER||LA100_0==LEFT||LA100_0==RIGHT) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// DBL.g:824:14: t= join_type
					{
					pushFollow(FOLLOW_join_type_in_natural_join6870);
					t=join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_join_type.add(t.getTree());
					}
					break;

			}

			JOIN288=(Token)match(input,JOIN,FOLLOW_JOIN_in_natural_join6874); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN288);

			pushFollow(FOLLOW_table_primary_in_natural_join6878);
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
			// 824:49: -> ^( JOIN NATURAL ( $t)? $r)
			{
				// DBL.g:824:52: ^( JOIN NATURAL ( $t)? $r)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_JOIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_NATURAL.nextNode());
				// DBL.g:824:68: ( $t)?
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
			if ( state.backtracking>0 ) { memoize(input, 86, natural_join_StartIndex); }

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
	// DBL.g:826:1: union_join : UNION JOIN r= table_primary -> ^( JOIN UNION $r) ;
	public final DBLParser.union_join_return union_join() throws RecognitionException {
		DBLParser.union_join_return retval = new DBLParser.union_join_return();
		retval.start = input.LT(1);
		int union_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token UNION289=null;
		Token JOIN290=null;
		ParserRuleReturnScope r =null;

		CommonTree UNION289_tree=null;
		CommonTree JOIN290_tree=null;
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");
		RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
		RewriteRuleSubtreeStream stream_table_primary=new RewriteRuleSubtreeStream(adaptor,"rule table_primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// DBL.g:827:3: ( UNION JOIN r= table_primary -> ^( JOIN UNION $r) )
			// DBL.g:827:5: UNION JOIN r= table_primary
			{
			UNION289=(Token)match(input,UNION,FOLLOW_UNION_in_union_join6905); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNION.add(UNION289);

			JOIN290=(Token)match(input,JOIN,FOLLOW_JOIN_in_union_join6907); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JOIN.add(JOIN290);

			pushFollow(FOLLOW_table_primary_in_union_join6911);
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
			// 827:32: -> ^( JOIN UNION $r)
			{
				// DBL.g:827:35: ^( JOIN UNION $r)
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
			if ( state.backtracking>0 ) { memoize(input, 87, union_join_StartIndex); }

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
	// DBL.g:829:1: join_type : ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) );
	public final DBLParser.join_type_return join_type() throws RecognitionException {
		DBLParser.join_type_return retval = new DBLParser.join_type_return();
		retval.start = input.LT(1);
		int join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token INNER291=null;
		Token OUTER292=null;
		ParserRuleReturnScope t =null;

		CommonTree INNER291_tree=null;
		CommonTree OUTER292_tree=null;
		RewriteRuleTokenStream stream_OUTER=new RewriteRuleTokenStream(adaptor,"token OUTER");
		RewriteRuleSubtreeStream stream_outer_join_type=new RewriteRuleSubtreeStream(adaptor,"rule outer_join_type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// DBL.g:830:3: ( INNER |t= outer_join_type OUTER -> ^( OUTER $t) |t= outer_join_type -> ^( OUTER $t) )
			int alt101=3;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==INNER) ) {
				alt101=1;
			}
			else if ( (LA101_0==FULL||LA101_0==LEFT||LA101_0==RIGHT) ) {
				int LA101_2 = input.LA(2);
				if ( (LA101_2==OUTER) ) {
					alt101=2;
				}
				else if ( (LA101_2==EOF||LA101_2==JOIN) ) {
					alt101=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 101, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}

			switch (alt101) {
				case 1 :
					// DBL.g:830:5: INNER
					{
					root_0 = (CommonTree)adaptor.nil();


					INNER291=(Token)match(input,INNER,FOLLOW_INNER_in_join_type6934); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INNER291_tree = (CommonTree)adaptor.create(INNER291);
					adaptor.addChild(root_0, INNER291_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:831:5: t= outer_join_type OUTER
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type6942);
					t=outer_join_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_outer_join_type.add(t.getTree());
					OUTER292=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_type6944); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OUTER.add(OUTER292);

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
					// 831:29: -> ^( OUTER $t)
					{
						// DBL.g:831:32: ^( OUTER $t)
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
					// DBL.g:832:5: t= outer_join_type
					{
					pushFollow(FOLLOW_outer_join_type_in_join_type6961);
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
					// 832:23: -> ^( OUTER $t)
					{
						// DBL.g:832:26: ^( OUTER $t)
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
			if ( state.backtracking>0 ) { memoize(input, 88, join_type_StartIndex); }

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
	// DBL.g:834:1: outer_join_type : ( LEFT | RIGHT | FULL );
	public final DBLParser.outer_join_type_return outer_join_type() throws RecognitionException {
		DBLParser.outer_join_type_return retval = new DBLParser.outer_join_type_return();
		retval.start = input.LT(1);
		int outer_join_type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set293=null;

		CommonTree set293_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// DBL.g:835:3: ( LEFT | RIGHT | FULL )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set293=input.LT(1);
			if ( input.LA(1)==FULL||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set293));
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
			if ( state.backtracking>0 ) { memoize(input, 89, outer_join_type_StartIndex); }

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
	// DBL.g:839:1: join_specification : ( join_condition | named_columns_join );
	public final DBLParser.join_specification_return join_specification() throws RecognitionException {
		DBLParser.join_specification_return retval = new DBLParser.join_specification_return();
		retval.start = input.LT(1);
		int join_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope join_condition294 =null;
		ParserRuleReturnScope named_columns_join295 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// DBL.g:840:3: ( join_condition | named_columns_join )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==ON) ) {
				alt102=1;
			}
			else if ( (LA102_0==USING) ) {
				alt102=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// DBL.g:840:5: join_condition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_join_condition_in_join_specification7006);
					join_condition294=join_condition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, join_condition294.getTree());

					}
					break;
				case 2 :
					// DBL.g:841:5: named_columns_join
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_named_columns_join_in_join_specification7012);
					named_columns_join295=named_columns_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, named_columns_join295.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 90, join_specification_StartIndex); }

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
	// DBL.g:843:1: join_condition : ON ^ search_condition ;
	public final DBLParser.join_condition_return join_condition() throws RecognitionException {
		DBLParser.join_condition_return retval = new DBLParser.join_condition_return();
		retval.start = input.LT(1);
		int join_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ON296=null;
		ParserRuleReturnScope search_condition297 =null;

		CommonTree ON296_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// DBL.g:844:3: ( ON ^ search_condition )
			// DBL.g:844:5: ON ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			ON296=(Token)match(input,ON,FOLLOW_ON_in_join_condition7024); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ON296_tree = (CommonTree)adaptor.create(ON296);
			root_0 = (CommonTree)adaptor.becomeRoot(ON296_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_join_condition7027);
			search_condition297=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition297.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, join_condition_StartIndex); }

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
	// DBL.g:846:1: named_columns_join : USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) ;
	public final DBLParser.named_columns_join_return named_columns_join() throws RecognitionException {
		DBLParser.named_columns_join_return retval = new DBLParser.named_columns_join_return();
		retval.start = input.LT(1);
		int named_columns_join_StartIndex = input.index();

		CommonTree root_0 = null;

		Token USING298=null;
		Token LEFT_PAREN299=null;
		Token RIGHT_PAREN300=null;
		ParserRuleReturnScope f =null;

		CommonTree USING298_tree=null;
		CommonTree LEFT_PAREN299_tree=null;
		CommonTree RIGHT_PAREN300_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleSubtreeStream stream_column_reference_list=new RewriteRuleSubtreeStream(adaptor,"rule column_reference_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// DBL.g:847:3: ( USING LEFT_PAREN f= column_reference_list RIGHT_PAREN -> ^( USING $f) )
			// DBL.g:847:5: USING LEFT_PAREN f= column_reference_list RIGHT_PAREN
			{
			USING298=(Token)match(input,USING,FOLLOW_USING_in_named_columns_join7039); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING298);

			LEFT_PAREN299=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_named_columns_join7041); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN299);

			pushFollow(FOLLOW_column_reference_list_in_named_columns_join7045);
			f=column_reference_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference_list.add(f.getTree());
			RIGHT_PAREN300=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_named_columns_join7047); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN300);

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
			// 847:58: -> ^( USING $f)
			{
				// DBL.g:847:61: ^( USING $f)
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
			if ( state.backtracking>0 ) { memoize(input, 92, named_columns_join_StartIndex); }

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
	// DBL.g:849:1: table_primary : table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) ;
	public final DBLParser.table_primary_return table_primary() throws RecognitionException {
		DBLParser.table_primary_return retval = new DBLParser.table_primary_return();
		retval.start = input.LT(1);
		int table_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token a=null;
		Token AS302=null;
		ParserRuleReturnScope table301 =null;

		CommonTree a_tree=null;
		CommonTree AS302_tree=null;
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// DBL.g:850:3: ( table ( ( AS )? a= Identifier )? -> ^( TABLE table ( $a)? ) )
			// DBL.g:850:5: table ( ( AS )? a= Identifier )?
			{
			pushFollow(FOLLOW_table_in_table_primary7068);
			table301=table();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_table.add(table301.getTree());
			// DBL.g:850:11: ( ( AS )? a= Identifier )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==AS||LA104_0==Identifier) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// DBL.g:850:12: ( AS )? a= Identifier
					{
					// DBL.g:850:12: ( AS )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==AS) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// DBL.g:850:13: AS
							{
							AS302=(Token)match(input,AS,FOLLOW_AS_in_table_primary7072); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AS.add(AS302);

							}
							break;

					}

					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_table_primary7078); if (state.failed) return retval; 
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
			// 850:33: -> ^( TABLE table ( $a)? )
			{
				// DBL.g:850:36: ^( TABLE table ( $a)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLE, "TABLE"), root_1);
				adaptor.addChild(root_1, stream_table.nextTree());
				// DBL.g:850:50: ( $a)?
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
			if ( state.backtracking>0 ) { memoize(input, 93, table_primary_StartIndex); }

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
	// DBL.g:852:1: where_clause : WHERE ^ search_condition ;
	public final DBLParser.where_clause_return where_clause() throws RecognitionException {
		DBLParser.where_clause_return retval = new DBLParser.where_clause_return();
		retval.start = input.LT(1);
		int where_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHERE303=null;
		ParserRuleReturnScope search_condition304 =null;

		CommonTree WHERE303_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// DBL.g:853:3: ( WHERE ^ search_condition )
			// DBL.g:853:5: WHERE ^ search_condition
			{
			root_0 = (CommonTree)adaptor.nil();


			WHERE303=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause7106); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHERE303_tree = (CommonTree)adaptor.create(WHERE303);
			root_0 = (CommonTree)adaptor.becomeRoot(WHERE303_tree, root_0);
			}

			pushFollow(FOLLOW_search_condition_in_where_clause7109);
			search_condition304=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, search_condition304.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, where_clause_StartIndex); }

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
	// DBL.g:861:1: routine_invocation : ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) );
	public final DBLParser.routine_invocation_return routine_invocation() throws RecognitionException {
		DBLParser.routine_invocation_return retval = new DBLParser.routine_invocation_return();
		retval.start = input.LT(1);
		int routine_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier305=null;
		Token LEFT_PAREN306=null;
		Token RIGHT_PAREN308=null;
		Token COUNT309=null;
		Token LEFT_PAREN310=null;
		Token RIGHT_PAREN312=null;
		Token COUNT313=null;
		Token LEFT_PAREN314=null;
		Token MULTIPLY315=null;
		Token RIGHT_PAREN316=null;
		ParserRuleReturnScope funcArgs307 =null;
		ParserRuleReturnScope funcArgs311 =null;

		CommonTree Identifier305_tree=null;
		CommonTree LEFT_PAREN306_tree=null;
		CommonTree RIGHT_PAREN308_tree=null;
		CommonTree COUNT309_tree=null;
		CommonTree LEFT_PAREN310_tree=null;
		CommonTree RIGHT_PAREN312_tree=null;
		CommonTree COUNT313_tree=null;
		CommonTree LEFT_PAREN314_tree=null;
		CommonTree MULTIPLY315_tree=null;
		CommonTree RIGHT_PAREN316_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
		RewriteRuleTokenStream stream_MULTIPLY=new RewriteRuleTokenStream(adaptor,"token MULTIPLY");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_funcArgs=new RewriteRuleSubtreeStream(adaptor,"rule funcArgs");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// DBL.g:862:2: ( Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN -> ^( FUNCTION[$Identifier.text] ( funcArgs )? ) | COUNT LEFT_PAREN funcArgs RIGHT_PAREN -> ^( COUNT_VAL funcArgs ) | COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN -> ^( COUNT_ROWS ) )
			int alt106=3;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==Identifier) ) {
				alt106=1;
			}
			else if ( (LA106_0==COUNT) ) {
				int LA106_2 = input.LA(2);
				if ( (LA106_2==LEFT_PAREN) ) {
					int LA106_3 = input.LA(3);
					if ( (LA106_3==MULTIPLY) ) {
						alt106=3;
					}
					else if ( (LA106_3==CASE||LA106_3==COUNT||LA106_3==Character_String_Literal||LA106_3==Identifier||LA106_3==LEFT_PAREN||LA106_3==MINUS||LA106_3==NOT||LA106_3==NULL||LA106_3==NUMBER||LA106_3==PLUS||LA106_3==REAL_NUMBER) ) {
						alt106=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 106, 3, input);
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
							new NoViableAltException("", 106, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}

			switch (alt106) {
				case 1 :
					// DBL.g:862:4: Identifier LEFT_PAREN ( funcArgs )? RIGHT_PAREN
					{
					Identifier305=(Token)match(input,Identifier,FOLLOW_Identifier_in_routine_invocation7122); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier305);

					LEFT_PAREN306=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7124); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN306);

					// DBL.g:862:26: ( funcArgs )?
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==CASE||LA105_0==COUNT||LA105_0==Character_String_Literal||LA105_0==Identifier||LA105_0==LEFT_PAREN||LA105_0==MINUS||LA105_0==NOT||LA105_0==NULL||LA105_0==NUMBER||LA105_0==PLUS||LA105_0==REAL_NUMBER) ) {
						alt105=1;
					}
					switch (alt105) {
						case 1 :
							// DBL.g:862:26: funcArgs
							{
							pushFollow(FOLLOW_funcArgs_in_routine_invocation7126);
							funcArgs307=funcArgs();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs307.getTree());
							}
							break;

					}

					RIGHT_PAREN308=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7129); if (state.failed) return retval; 
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
					// 862:48: -> ^( FUNCTION[$Identifier.text] ( funcArgs )? )
					{
						// DBL.g:862:51: ^( FUNCTION[$Identifier.text] ( funcArgs )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, (Identifier305!=null?Identifier305.getText():null)), root_1);
						// DBL.g:862:80: ( funcArgs )?
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
					// DBL.g:863:4: COUNT LEFT_PAREN funcArgs RIGHT_PAREN
					{
					COUNT309=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation7144); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT309);

					LEFT_PAREN310=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7146); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN310);

					pushFollow(FOLLOW_funcArgs_in_routine_invocation7148);
					funcArgs311=funcArgs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_funcArgs.add(funcArgs311.getTree());
					RIGHT_PAREN312=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7150); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN312);

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
					// 863:42: -> ^( COUNT_VAL funcArgs )
					{
						// DBL.g:863:45: ^( COUNT_VAL funcArgs )
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
					// DBL.g:864:4: COUNT LEFT_PAREN MULTIPLY RIGHT_PAREN
					{
					COUNT313=(Token)match(input,COUNT,FOLLOW_COUNT_in_routine_invocation7163); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(COUNT313);

					LEFT_PAREN314=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_routine_invocation7165); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN314);

					MULTIPLY315=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_routine_invocation7167); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULTIPLY.add(MULTIPLY315);

					RIGHT_PAREN316=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_routine_invocation7169); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN316);

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
					// 864:42: -> ^( COUNT_ROWS )
					{
						// DBL.g:864:45: ^( COUNT_ROWS )
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
			if ( state.backtracking>0 ) { memoize(input, 95, routine_invocation_StartIndex); }

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
	// DBL.g:866:1: funcArgs : boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ ;
	public final DBLParser.funcArgs_return funcArgs() throws RecognitionException {
		DBLParser.funcArgs_return retval = new DBLParser.funcArgs_return();
		retval.start = input.LT(1);
		int funcArgs_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA318=null;
		ParserRuleReturnScope boolean_value_expression317 =null;
		ParserRuleReturnScope boolean_value_expression319 =null;

		CommonTree COMMA318_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_boolean_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule boolean_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// DBL.g:867:3: ( boolean_value_expression ( COMMA boolean_value_expression )* -> ( boolean_value_expression )+ )
			// DBL.g:867:5: boolean_value_expression ( COMMA boolean_value_expression )*
			{
			pushFollow(FOLLOW_boolean_value_expression_in_funcArgs7186);
			boolean_value_expression317=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression317.getTree());
			// DBL.g:867:30: ( COMMA boolean_value_expression )*
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==COMMA) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// DBL.g:867:31: COMMA boolean_value_expression
					{
					COMMA318=(Token)match(input,COMMA,FOLLOW_COMMA_in_funcArgs7189); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA318);

					pushFollow(FOLLOW_boolean_value_expression_in_funcArgs7191);
					boolean_value_expression319=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_value_expression.add(boolean_value_expression319.getTree());
					}
					break;

				default :
					break loop107;
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
			// 867:64: -> ( boolean_value_expression )+
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
			if ( state.backtracking>0 ) { memoize(input, 96, funcArgs_StartIndex); }

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
	// DBL.g:874:1: groupby_clause : GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) ;
	public final DBLParser.groupby_clause_return groupby_clause() throws RecognitionException {
		DBLParser.groupby_clause_return retval = new DBLParser.groupby_clause_return();
		retval.start = input.LT(1);
		int groupby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token GROUP320=null;
		Token BY321=null;
		ParserRuleReturnScope g =null;

		CommonTree GROUP320_tree=null;
		CommonTree BY321_tree=null;
		RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleSubtreeStream stream_grouping_element_list=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// DBL.g:875:3: ( GROUP BY g= grouping_element_list -> ^( GROUP_BY $g) )
			// DBL.g:875:5: GROUP BY g= grouping_element_list
			{
			GROUP320=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupby_clause7212); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_GROUP.add(GROUP320);

			BY321=(Token)match(input,BY,FOLLOW_BY_in_groupby_clause7214); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY321);

			pushFollow(FOLLOW_grouping_element_list_in_groupby_clause7218);
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
			// 875:38: -> ^( GROUP_BY $g)
			{
				// DBL.g:875:41: ^( GROUP_BY $g)
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
			if ( state.backtracking>0 ) { memoize(input, 97, groupby_clause_StartIndex); }

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
	// DBL.g:877:1: grouping_element_list : grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ ;
	public final DBLParser.grouping_element_list_return grouping_element_list() throws RecognitionException {
		DBLParser.grouping_element_list_return retval = new DBLParser.grouping_element_list_return();
		retval.start = input.LT(1);
		int grouping_element_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA323=null;
		ParserRuleReturnScope grouping_element322 =null;
		ParserRuleReturnScope grouping_element324 =null;

		CommonTree COMMA323_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_grouping_element=new RewriteRuleSubtreeStream(adaptor,"rule grouping_element");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// DBL.g:878:3: ( grouping_element ( COMMA grouping_element )* -> ( grouping_element )+ )
			// DBL.g:878:5: grouping_element ( COMMA grouping_element )*
			{
			pushFollow(FOLLOW_grouping_element_in_grouping_element_list7239);
			grouping_element322=grouping_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element322.getTree());
			// DBL.g:878:22: ( COMMA grouping_element )*
			loop108:
			while (true) {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==COMMA) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// DBL.g:878:23: COMMA grouping_element
					{
					COMMA323=(Token)match(input,COMMA,FOLLOW_COMMA_in_grouping_element_list7242); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA323);

					pushFollow(FOLLOW_grouping_element_in_grouping_element_list7244);
					grouping_element324=grouping_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_grouping_element.add(grouping_element324.getTree());
					}
					break;

				default :
					break loop108;
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
			// 878:48: -> ( grouping_element )+
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
			if ( state.backtracking>0 ) { memoize(input, 98, grouping_element_list_StartIndex); }

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
	// DBL.g:880:1: grouping_element : ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set );
	public final DBLParser.grouping_element_return grouping_element() throws RecognitionException {
		DBLParser.grouping_element_return retval = new DBLParser.grouping_element_return();
		retval.start = input.LT(1);
		int grouping_element_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ordinary_grouping_set325 =null;
		ParserRuleReturnScope rollup_list326 =null;
		ParserRuleReturnScope cube_list327 =null;
		ParserRuleReturnScope empty_grouping_set328 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// DBL.g:881:3: ( ordinary_grouping_set | rollup_list | cube_list | empty_grouping_set )
			int alt109=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt109=1;
				}
				break;
			case LEFT_PAREN:
				{
				int LA109_2 = input.LA(2);
				if ( (LA109_2==RIGHT_PAREN) ) {
					alt109=4;
				}
				else if ( (LA109_2==Identifier) ) {
					alt109=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 109, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ROLLUP:
				{
				alt109=2;
				}
				break;
			case CUBE:
				{
				alt109=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// DBL.g:881:5: ordinary_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ordinary_grouping_set_in_grouping_element7263);
					ordinary_grouping_set325=ordinary_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ordinary_grouping_set325.getTree());

					}
					break;
				case 2 :
					// DBL.g:882:5: rollup_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rollup_list_in_grouping_element7269);
					rollup_list326=rollup_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rollup_list326.getTree());

					}
					break;
				case 3 :
					// DBL.g:883:5: cube_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cube_list_in_grouping_element7275);
					cube_list327=cube_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cube_list327.getTree());

					}
					break;
				case 4 :
					// DBL.g:884:5: empty_grouping_set
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_empty_grouping_set_in_grouping_element7281);
					empty_grouping_set328=empty_grouping_set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, empty_grouping_set328.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 99, grouping_element_StartIndex); }

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
	// DBL.g:886:1: ordinary_grouping_set : ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !);
	public final DBLParser.ordinary_grouping_set_return ordinary_grouping_set() throws RecognitionException {
		DBLParser.ordinary_grouping_set_return retval = new DBLParser.ordinary_grouping_set_return();
		retval.start = input.LT(1);
		int ordinary_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN330=null;
		Token RIGHT_PAREN332=null;
		ParserRuleReturnScope column_reference_list329 =null;
		ParserRuleReturnScope column_reference_list331 =null;

		CommonTree LEFT_PAREN330_tree=null;
		CommonTree RIGHT_PAREN332_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// DBL.g:887:3: ( column_reference_list | LEFT_PAREN ! column_reference_list RIGHT_PAREN !)
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==Identifier) ) {
				alt110=1;
			}
			else if ( (LA110_0==LEFT_PAREN) ) {
				alt110=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}

			switch (alt110) {
				case 1 :
					// DBL.g:887:5: column_reference_list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set7293);
					column_reference_list329=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list329.getTree());

					}
					break;
				case 2 :
					// DBL.g:888:5: LEFT_PAREN ! column_reference_list RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN330=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_ordinary_grouping_set7299); if (state.failed) return retval;
					pushFollow(FOLLOW_column_reference_list_in_ordinary_grouping_set7302);
					column_reference_list331=column_reference_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference_list331.getTree());

					RIGHT_PAREN332=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set7304); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 100, ordinary_grouping_set_StartIndex); }

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
	// DBL.g:890:1: rollup_list : ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) ;
	public final DBLParser.rollup_list_return rollup_list() throws RecognitionException {
		DBLParser.rollup_list_return retval = new DBLParser.rollup_list_return();
		retval.start = input.LT(1);
		int rollup_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ROLLUP333=null;
		Token LEFT_PAREN334=null;
		Token RIGHT_PAREN335=null;
		ParserRuleReturnScope c =null;

		CommonTree ROLLUP333_tree=null;
		CommonTree LEFT_PAREN334_tree=null;
		CommonTree RIGHT_PAREN335_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_ROLLUP=new RewriteRuleTokenStream(adaptor,"token ROLLUP");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// DBL.g:891:3: ( ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( ROLLUP $c) )
			// DBL.g:891:5: ROLLUP LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			ROLLUP333=(Token)match(input,ROLLUP,FOLLOW_ROLLUP_in_rollup_list7317); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ROLLUP.add(ROLLUP333);

			LEFT_PAREN334=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_rollup_list7319); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN334);

			pushFollow(FOLLOW_ordinary_grouping_set_in_rollup_list7323);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN335=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_rollup_list7325); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN335);

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
			// 891:59: -> ^( ROLLUP $c)
			{
				// DBL.g:891:62: ^( ROLLUP $c)
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
			if ( state.backtracking>0 ) { memoize(input, 101, rollup_list_StartIndex); }

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
	// DBL.g:893:1: cube_list : CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) ;
	public final DBLParser.cube_list_return cube_list() throws RecognitionException {
		DBLParser.cube_list_return retval = new DBLParser.cube_list_return();
		retval.start = input.LT(1);
		int cube_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CUBE336=null;
		Token LEFT_PAREN337=null;
		Token RIGHT_PAREN338=null;
		ParserRuleReturnScope c =null;

		CommonTree CUBE336_tree=null;
		CommonTree LEFT_PAREN337_tree=null;
		CommonTree RIGHT_PAREN338_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_CUBE=new RewriteRuleTokenStream(adaptor,"token CUBE");
		RewriteRuleSubtreeStream stream_ordinary_grouping_set=new RewriteRuleSubtreeStream(adaptor,"rule ordinary_grouping_set");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// DBL.g:894:3: ( CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN -> ^( CUBE $c) )
			// DBL.g:894:5: CUBE LEFT_PAREN c= ordinary_grouping_set RIGHT_PAREN
			{
			CUBE336=(Token)match(input,CUBE,FOLLOW_CUBE_in_cube_list7346); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CUBE.add(CUBE336);

			LEFT_PAREN337=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_cube_list7348); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN337);

			pushFollow(FOLLOW_ordinary_grouping_set_in_cube_list7352);
			c=ordinary_grouping_set();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ordinary_grouping_set.add(c.getTree());
			RIGHT_PAREN338=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_cube_list7354); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN338);

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
			// 894:57: -> ^( CUBE $c)
			{
				// DBL.g:894:60: ^( CUBE $c)
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
			if ( state.backtracking>0 ) { memoize(input, 102, cube_list_StartIndex); }

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
	// DBL.g:896:1: empty_grouping_set : LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) ;
	public final DBLParser.empty_grouping_set_return empty_grouping_set() throws RecognitionException {
		DBLParser.empty_grouping_set_return retval = new DBLParser.empty_grouping_set_return();
		retval.start = input.LT(1);
		int empty_grouping_set_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN339=null;
		Token RIGHT_PAREN340=null;

		CommonTree LEFT_PAREN339_tree=null;
		CommonTree RIGHT_PAREN340_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// DBL.g:897:3: ( LEFT_PAREN RIGHT_PAREN -> ^( EMPTY_GROUPING_SET ) )
			// DBL.g:897:5: LEFT_PAREN RIGHT_PAREN
			{
			LEFT_PAREN339=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_empty_grouping_set7375); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN339);

			RIGHT_PAREN340=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_empty_grouping_set7377); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN340);

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
			// 897:28: -> ^( EMPTY_GROUPING_SET )
			{
				// DBL.g:897:31: ^( EMPTY_GROUPING_SET )
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
			if ( state.backtracking>0 ) { memoize(input, 103, empty_grouping_set_StartIndex); }

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
	// DBL.g:899:1: having_clause : HAVING ^ boolean_value_expression ;
	public final DBLParser.having_clause_return having_clause() throws RecognitionException {
		DBLParser.having_clause_return retval = new DBLParser.having_clause_return();
		retval.start = input.LT(1);
		int having_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token HAVING341=null;
		ParserRuleReturnScope boolean_value_expression342 =null;

		CommonTree HAVING341_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// DBL.g:900:3: ( HAVING ^ boolean_value_expression )
			// DBL.g:900:5: HAVING ^ boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			HAVING341=(Token)match(input,HAVING,FOLLOW_HAVING_in_having_clause7395); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			HAVING341_tree = (CommonTree)adaptor.create(HAVING341);
			root_0 = (CommonTree)adaptor.becomeRoot(HAVING341_tree, root_0);
			}

			pushFollow(FOLLOW_boolean_value_expression_in_having_clause7398);
			boolean_value_expression342=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression342.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, having_clause_StartIndex); }

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
	// DBL.g:908:1: orderby_clause : ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) ;
	public final DBLParser.orderby_clause_return orderby_clause() throws RecognitionException {
		DBLParser.orderby_clause_return retval = new DBLParser.orderby_clause_return();
		retval.start = input.LT(1);
		int orderby_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ORDER343=null;
		Token BY344=null;
		ParserRuleReturnScope sort_specifier_list345 =null;

		CommonTree ORDER343_tree=null;
		CommonTree BY344_tree=null;
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
		RewriteRuleSubtreeStream stream_sort_specifier_list=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// DBL.g:909:3: ( ORDER BY sort_specifier_list -> ^( ORDER_BY sort_specifier_list ) )
			// DBL.g:909:5: ORDER BY sort_specifier_list
			{
			ORDER343=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderby_clause7412); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ORDER.add(ORDER343);

			BY344=(Token)match(input,BY,FOLLOW_BY_in_orderby_clause7414); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(BY344);

			pushFollow(FOLLOW_sort_specifier_list_in_orderby_clause7416);
			sort_specifier_list345=sort_specifier_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier_list.add(sort_specifier_list345.getTree());
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
			// 909:34: -> ^( ORDER_BY sort_specifier_list )
			{
				// DBL.g:909:37: ^( ORDER_BY sort_specifier_list )
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
			if ( state.backtracking>0 ) { memoize(input, 105, orderby_clause_StartIndex); }

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
	// DBL.g:911:1: sort_specifier_list : sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) ;
	public final DBLParser.sort_specifier_list_return sort_specifier_list() throws RecognitionException {
		DBLParser.sort_specifier_list_return retval = new DBLParser.sort_specifier_list_return();
		retval.start = input.LT(1);
		int sort_specifier_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA347=null;
		ParserRuleReturnScope sort_specifier346 =null;
		ParserRuleReturnScope sort_specifier348 =null;

		CommonTree COMMA347_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_sort_specifier=new RewriteRuleSubtreeStream(adaptor,"rule sort_specifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// DBL.g:912:3: ( sort_specifier ( COMMA sort_specifier )* -> ^( SORT_SPECIFIERS ( sort_specifier )+ ) )
			// DBL.g:912:5: sort_specifier ( COMMA sort_specifier )*
			{
			pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list7436);
			sort_specifier346=sort_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier346.getTree());
			// DBL.g:912:20: ( COMMA sort_specifier )*
			loop111:
			while (true) {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==COMMA) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// DBL.g:912:21: COMMA sort_specifier
					{
					COMMA347=(Token)match(input,COMMA,FOLLOW_COMMA_in_sort_specifier_list7439); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA347);

					pushFollow(FOLLOW_sort_specifier_in_sort_specifier_list7441);
					sort_specifier348=sort_specifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sort_specifier.add(sort_specifier348.getTree());
					}
					break;

				default :
					break loop111;
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
			// 912:44: -> ^( SORT_SPECIFIERS ( sort_specifier )+ )
			{
				// DBL.g:912:47: ^( SORT_SPECIFIERS ( sort_specifier )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 106, sort_specifier_list_StartIndex); }

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
	// DBL.g:914:1: sort_specifier : fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// DBL.g:915:3: (fn= column_reference (a= order_specification )? (o= null_ordering )? -> ^( SORT_KEY $fn ( $a)? ( $o)? ) )
			// DBL.g:915:5: fn= column_reference (a= order_specification )? (o= null_ordering )?
			{
			pushFollow(FOLLOW_column_reference_in_sort_specifier7466);
			fn=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(fn.getTree());
			// DBL.g:915:26: (a= order_specification )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==ASC||LA112_0==DESC) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// DBL.g:915:26: a= order_specification
					{
					pushFollow(FOLLOW_order_specification_in_sort_specifier7470);
					a=order_specification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_order_specification.add(a.getTree());
					}
					break;

			}

			// DBL.g:915:49: (o= null_ordering )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==NULL) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// DBL.g:915:49: o= null_ordering
					{
					pushFollow(FOLLOW_null_ordering_in_sort_specifier7475);
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
			// 915:65: -> ^( SORT_KEY $fn ( $a)? ( $o)? )
			{
				// DBL.g:915:68: ^( SORT_KEY $fn ( $a)? ( $o)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SORT_KEY, "SORT_KEY"), root_1);
				adaptor.addChild(root_1, stream_fn.nextTree());
				// DBL.g:915:84: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// DBL.g:915:88: ( $o)?
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
			if ( state.backtracking>0 ) { memoize(input, 107, sort_specifier_StartIndex); }

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
	// DBL.g:917:1: order_specification : ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) );
	public final DBLParser.order_specification_return order_specification() throws RecognitionException {
		DBLParser.order_specification_return retval = new DBLParser.order_specification_return();
		retval.start = input.LT(1);
		int order_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ASC349=null;
		Token DESC350=null;

		CommonTree ASC349_tree=null;
		CommonTree DESC350_tree=null;
		RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
		RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// DBL.g:918:3: ( ASC -> ^( ORDER ASC ) | DESC -> ^( ORDER DESC ) )
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==ASC) ) {
				alt114=1;
			}
			else if ( (LA114_0==DESC) ) {
				alt114=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}

			switch (alt114) {
				case 1 :
					// DBL.g:918:5: ASC
					{
					ASC349=(Token)match(input,ASC,FOLLOW_ASC_in_order_specification7505); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASC.add(ASC349);

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
					// 918:9: -> ^( ORDER ASC )
					{
						// DBL.g:918:12: ^( ORDER ASC )
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
					// DBL.g:919:5: DESC
					{
					DESC350=(Token)match(input,DESC,FOLLOW_DESC_in_order_specification7519); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESC.add(DESC350);

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
					// 919:10: -> ^( ORDER DESC )
					{
						// DBL.g:919:13: ^( ORDER DESC )
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
			if ( state.backtracking>0 ) { memoize(input, 108, order_specification_StartIndex); }

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
	// DBL.g:921:1: limit_clause : LIMIT e= numeric_value_expression -> ^( LIMIT $e) ;
	public final DBLParser.limit_clause_return limit_clause() throws RecognitionException {
		DBLParser.limit_clause_return retval = new DBLParser.limit_clause_return();
		retval.start = input.LT(1);
		int limit_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LIMIT351=null;
		ParserRuleReturnScope e =null;

		CommonTree LIMIT351_tree=null;
		RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// DBL.g:922:3: ( LIMIT e= numeric_value_expression -> ^( LIMIT $e) )
			// DBL.g:922:5: LIMIT e= numeric_value_expression
			{
			LIMIT351=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limit_clause7539); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIMIT.add(LIMIT351);

			pushFollow(FOLLOW_numeric_value_expression_in_limit_clause7543);
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
			// 922:38: -> ^( LIMIT $e)
			{
				// DBL.g:922:41: ^( LIMIT $e)
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
			if ( state.backtracking>0 ) { memoize(input, 109, limit_clause_StartIndex); }

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
	// DBL.g:924:1: null_ordering : ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) );
	public final DBLParser.null_ordering_return null_ordering() throws RecognitionException {
		DBLParser.null_ordering_return retval = new DBLParser.null_ordering_return();
		retval.start = input.LT(1);
		int null_ordering_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL352=null;
		Token FIRST353=null;
		Token NULL354=null;
		Token LAST355=null;

		CommonTree NULL352_tree=null;
		CommonTree FIRST353_tree=null;
		CommonTree NULL354_tree=null;
		CommonTree LAST355_tree=null;
		RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// DBL.g:925:3: ( NULL FIRST -> ^( NULL_ORDER FIRST ) | NULL LAST -> ^( NULL_ORDER LAST ) )
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==NULL) ) {
				int LA115_1 = input.LA(2);
				if ( (LA115_1==FIRST) ) {
					alt115=1;
				}
				else if ( (LA115_1==LAST) ) {
					alt115=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 115, 1, input);
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
					// DBL.g:925:5: NULL FIRST
					{
					NULL352=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering7564); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL352);

					FIRST353=(Token)match(input,FIRST,FOLLOW_FIRST_in_null_ordering7566); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIRST.add(FIRST353);

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
					// 925:16: -> ^( NULL_ORDER FIRST )
					{
						// DBL.g:925:19: ^( NULL_ORDER FIRST )
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
					// DBL.g:926:5: NULL LAST
					{
					NULL354=(Token)match(input,NULL,FOLLOW_NULL_in_null_ordering7580); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL354);

					LAST355=(Token)match(input,LAST,FOLLOW_LAST_in_null_ordering7582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LAST.add(LAST355);

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
					// 926:15: -> ^( NULL_ORDER LAST )
					{
						// DBL.g:926:18: ^( NULL_ORDER LAST )
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
			if ( state.backtracking>0 ) { memoize(input, 110, null_ordering_StartIndex); }

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
	// DBL.g:935:1: search_condition : boolean_value_expression ;
	public final DBLParser.search_condition_return search_condition() throws RecognitionException {
		DBLParser.search_condition_return retval = new DBLParser.search_condition_return();
		retval.start = input.LT(1);
		int search_condition_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_value_expression356 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// DBL.g:936:2: ( boolean_value_expression )
			// DBL.g:936:4: boolean_value_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_value_expression_in_search_condition7604);
			boolean_value_expression356=boolean_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression356.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 111, search_condition_StartIndex); }

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
	// DBL.g:938:1: param_clause : WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) ;
	public final DBLParser.param_clause_return param_clause() throws RecognitionException {
		DBLParser.param_clause_return retval = new DBLParser.param_clause_return();
		retval.start = input.LT(1);
		int param_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WITH357=null;
		Token LEFT_PAREN358=null;
		Token COMMA360=null;
		Token RIGHT_PAREN362=null;
		ParserRuleReturnScope param359 =null;
		ParserRuleReturnScope param361 =null;

		CommonTree WITH357_tree=null;
		CommonTree LEFT_PAREN358_tree=null;
		CommonTree COMMA360_tree=null;
		CommonTree RIGHT_PAREN362_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// DBL.g:939:3: ( WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN -> ^( PARAMS ( param )+ ) )
			// DBL.g:939:5: WITH LEFT_PAREN param ( COMMA param )* RIGHT_PAREN
			{
			WITH357=(Token)match(input,WITH,FOLLOW_WITH_in_param_clause7615); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WITH.add(WITH357);

			LEFT_PAREN358=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_param_clause7617); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN358);

			pushFollow(FOLLOW_param_in_param_clause7619);
			param359=param();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_param.add(param359.getTree());
			// DBL.g:939:27: ( COMMA param )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==COMMA) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// DBL.g:939:28: COMMA param
					{
					COMMA360=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_clause7622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA360);

					pushFollow(FOLLOW_param_in_param_clause7624);
					param361=param();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_param.add(param361.getTree());
					}
					break;

				default :
					break loop116;
				}
			}

			RIGHT_PAREN362=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_param_clause7628); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN362);

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
			// 939:54: -> ^( PARAMS ( param )+ )
			{
				// DBL.g:939:57: ^( PARAMS ( param )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 112, param_clause_StartIndex); }

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
	// DBL.g:941:1: param : k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) ;
	public final DBLParser.param_return param() throws RecognitionException {
		DBLParser.param_return retval = new DBLParser.param_return();
		retval.start = input.LT(1);
		int param_StartIndex = input.index();

		CommonTree root_0 = null;

		Token k=null;
		Token EQUAL363=null;
		ParserRuleReturnScope v =null;

		CommonTree k_tree=null;
		CommonTree EQUAL363_tree=null;
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

			// DBL.g:942:3: (k= Character_String_Literal EQUAL v= numeric_value_expression -> ^( PARAM $k $v) )
			// DBL.g:942:5: k= Character_String_Literal EQUAL v= numeric_value_expression
			{
			k=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_param7651); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_String_Literal.add(k);

			EQUAL363=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_param7653); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL363);

			pushFollow(FOLLOW_numeric_value_expression_in_param7657);
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
			// 942:65: -> ^( PARAM $k $v)
			{
				// DBL.g:942:68: ^( PARAM $k $v)
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
			if ( state.backtracking>0 ) { memoize(input, 113, param_StartIndex); }

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
	// DBL.g:944:1: method_specifier : USING m= Identifier -> ^( USING[$m.text] ) ;
	public final DBLParser.method_specifier_return method_specifier() throws RecognitionException {
		DBLParser.method_specifier_return retval = new DBLParser.method_specifier_return();
		retval.start = input.LT(1);
		int method_specifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token m=null;
		Token USING364=null;

		CommonTree m_tree=null;
		CommonTree USING364_tree=null;
		RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

			// DBL.g:945:3: ( USING m= Identifier -> ^( USING[$m.text] ) )
			// DBL.g:945:5: USING m= Identifier
			{
			USING364=(Token)match(input,USING,FOLLOW_USING_in_method_specifier7681); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_USING.add(USING364);

			m=(Token)match(input,Identifier,FOLLOW_Identifier_in_method_specifier7685); if (state.failed) return retval; 
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
			// 945:24: -> ^( USING[$m.text] )
			{
				// DBL.g:945:27: ^( USING[$m.text] )
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
			if ( state.backtracking>0 ) { memoize(input, 114, method_specifier_StartIndex); }

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
	// DBL.g:952:1: boolean_value_expression : and_predicate ( OR ^ and_predicate )* ;
	public final DBLParser.boolean_value_expression_return boolean_value_expression() throws RecognitionException {
		DBLParser.boolean_value_expression_return retval = new DBLParser.boolean_value_expression_return();
		retval.start = input.LT(1);
		int boolean_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OR366=null;
		ParserRuleReturnScope and_predicate365 =null;
		ParserRuleReturnScope and_predicate367 =null;

		CommonTree OR366_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

			// DBL.g:953:2: ( and_predicate ( OR ^ and_predicate )* )
			// DBL.g:953:4: and_predicate ( OR ^ and_predicate )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_and_predicate_in_boolean_value_expression7705);
			and_predicate365=and_predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate365.getTree());

			// DBL.g:953:18: ( OR ^ and_predicate )*
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==OR) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// DBL.g:953:19: OR ^ and_predicate
					{
					OR366=(Token)match(input,OR,FOLLOW_OR_in_boolean_value_expression7708); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR366_tree = (CommonTree)adaptor.create(OR366);
					root_0 = (CommonTree)adaptor.becomeRoot(OR366_tree, root_0);
					}

					pushFollow(FOLLOW_and_predicate_in_boolean_value_expression7711);
					and_predicate367=and_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, and_predicate367.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 115, boolean_value_expression_StartIndex); }

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
	// DBL.g:955:1: and_predicate : boolean_factor ( AND ^ boolean_factor )* ;
	public final DBLParser.and_predicate_return and_predicate() throws RecognitionException {
		DBLParser.and_predicate_return retval = new DBLParser.and_predicate_return();
		retval.start = input.LT(1);
		int and_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token AND369=null;
		ParserRuleReturnScope boolean_factor368 =null;
		ParserRuleReturnScope boolean_factor370 =null;

		CommonTree AND369_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

			// DBL.g:956:3: ( boolean_factor ( AND ^ boolean_factor )* )
			// DBL.g:956:5: boolean_factor ( AND ^ boolean_factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_factor_in_and_predicate7724);
			boolean_factor368=boolean_factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor368.getTree());

			// DBL.g:956:20: ( AND ^ boolean_factor )*
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==AND) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// DBL.g:956:21: AND ^ boolean_factor
					{
					AND369=(Token)match(input,AND,FOLLOW_AND_in_and_predicate7727); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND369_tree = (CommonTree)adaptor.create(AND369);
					root_0 = (CommonTree)adaptor.becomeRoot(AND369_tree, root_0);
					}

					pushFollow(FOLLOW_boolean_factor_in_and_predicate7730);
					boolean_factor370=boolean_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_factor370.getTree());

					}
					break;

				default :
					break loop118;
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
			if ( state.backtracking>0 ) { memoize(input, 116, and_predicate_StartIndex); }

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
	// DBL.g:958:1: boolean_factor : ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) );
	public final DBLParser.boolean_factor_return boolean_factor() throws RecognitionException {
		DBLParser.boolean_factor_return retval = new DBLParser.boolean_factor_return();
		retval.start = input.LT(1);
		int boolean_factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT372=null;
		ParserRuleReturnScope boolean_test371 =null;
		ParserRuleReturnScope boolean_test373 =null;

		CommonTree NOT372_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleSubtreeStream stream_boolean_test=new RewriteRuleSubtreeStream(adaptor,"rule boolean_test");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

			// DBL.g:959:3: ( boolean_test | NOT boolean_test -> ^( NOT boolean_test ) )
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==CASE||LA119_0==COUNT||LA119_0==Character_String_Literal||LA119_0==Identifier||LA119_0==LEFT_PAREN||LA119_0==MINUS||LA119_0==NULL||LA119_0==NUMBER||LA119_0==PLUS||LA119_0==REAL_NUMBER) ) {
				alt119=1;
			}
			else if ( (LA119_0==NOT) ) {
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
					// DBL.g:959:5: boolean_test
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_boolean_test_in_boolean_factor7743);
					boolean_test371=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_test371.getTree());

					}
					break;
				case 2 :
					// DBL.g:960:5: NOT boolean_test
					{
					NOT372=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_factor7749); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT372);

					pushFollow(FOLLOW_boolean_test_in_boolean_factor7751);
					boolean_test373=boolean_test();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolean_test.add(boolean_test373.getTree());
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
					// 960:22: -> ^( NOT boolean_test )
					{
						// DBL.g:960:25: ^( NOT boolean_test )
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
			if ( state.backtracking>0 ) { memoize(input, 117, boolean_factor_StartIndex); }

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
	// DBL.g:962:1: boolean_test : boolean_primary ( is_clause )? ;
	public final DBLParser.boolean_test_return boolean_test() throws RecognitionException {
		DBLParser.boolean_test_return retval = new DBLParser.boolean_test_return();
		retval.start = input.LT(1);
		int boolean_test_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope boolean_primary374 =null;
		ParserRuleReturnScope is_clause375 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

			// DBL.g:963:3: ( boolean_primary ( is_clause )? )
			// DBL.g:963:5: boolean_primary ( is_clause )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_boolean_primary_in_boolean_test7771);
			boolean_primary374=boolean_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_primary374.getTree());

			// DBL.g:963:21: ( is_clause )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==IS) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// DBL.g:963:21: is_clause
					{
					pushFollow(FOLLOW_is_clause_in_boolean_test7773);
					is_clause375=is_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, is_clause375.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 118, boolean_test_StartIndex); }

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
	// DBL.g:965:1: is_clause : IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) ;
	public final DBLParser.is_clause_return is_clause() throws RecognitionException {
		DBLParser.is_clause_return retval = new DBLParser.is_clause_return();
		retval.start = input.LT(1);
		int is_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IS376=null;
		Token NOT377=null;
		ParserRuleReturnScope t =null;

		CommonTree IS376_tree=null;
		CommonTree NOT377_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleSubtreeStream stream_truth_value=new RewriteRuleSubtreeStream(adaptor,"rule truth_value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

			// DBL.g:966:3: ( IS ( NOT )? t= truth_value -> ^( IS ( NOT )? $t) )
			// DBL.g:966:5: IS ( NOT )? t= truth_value
			{
			IS376=(Token)match(input,IS,FOLLOW_IS_in_is_clause7786); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS376);

			// DBL.g:966:8: ( NOT )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==NOT) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// DBL.g:966:8: NOT
					{
					NOT377=(Token)match(input,NOT,FOLLOW_NOT_in_is_clause7788); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT377);

					}
					break;

			}

			pushFollow(FOLLOW_truth_value_in_is_clause7793);
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
			// 966:27: -> ^( IS ( NOT )? $t)
			{
				// DBL.g:966:30: ^( IS ( NOT )? $t)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				// DBL.g:966:35: ( NOT )?
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
			if ( state.backtracking>0 ) { memoize(input, 119, is_clause_StartIndex); }

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
	// DBL.g:968:1: truth_value : ( TRUE | FALSE | UNKNOWN );
	public final DBLParser.truth_value_return truth_value() throws RecognitionException {
		DBLParser.truth_value_return retval = new DBLParser.truth_value_return();
		retval.start = input.LT(1);
		int truth_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set378=null;

		CommonTree set378_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

			// DBL.g:969:3: ( TRUE | FALSE | UNKNOWN )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set378=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE||input.LA(1)==UNKNOWN ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set378));
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
			if ( state.backtracking>0 ) { memoize(input, 120, truth_value_StartIndex); }

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
	// DBL.g:971:1: boolean_primary : ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression );
	public final DBLParser.boolean_primary_return boolean_primary() throws RecognitionException {
		DBLParser.boolean_primary_return retval = new DBLParser.boolean_primary_return();
		retval.start = input.LT(1);
		int boolean_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN381=null;
		Token RIGHT_PAREN383=null;
		ParserRuleReturnScope predicate379 =null;
		ParserRuleReturnScope numeric_value_expression380 =null;
		ParserRuleReturnScope boolean_value_expression382 =null;
		ParserRuleReturnScope case_expression384 =null;

		CommonTree LEFT_PAREN381_tree=null;
		CommonTree RIGHT_PAREN383_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

			// DBL.g:972:3: ( predicate | numeric_value_expression | LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !| case_expression )
			int alt122=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA122_1 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt122=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 1, input);
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
				int LA122_2 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt122=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 2, input);
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
				int LA122_3 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt122=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NULL:
				{
				int LA122_4 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt122=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA122_5 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt122=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA122_6 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt122=2;
				}
				else if ( (synpred187_DBL()) ) {
					alt122=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COUNT:
				{
				int LA122_7 = input.LA(2);
				if ( (synpred185_DBL()) ) {
					alt122=1;
				}
				else if ( (synpred186_DBL()) ) {
					alt122=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CASE:
				{
				alt122=4;
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
					// DBL.g:972:5: predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_boolean_primary7837);
					predicate379=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate379.getTree());

					}
					break;
				case 2 :
					// DBL.g:973:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_boolean_primary7843);
					numeric_value_expression380=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression380.getTree());

					}
					break;
				case 3 :
					// DBL.g:974:5: LEFT_PAREN ! boolean_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN381=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_boolean_primary7849); if (state.failed) return retval;
					pushFollow(FOLLOW_boolean_value_expression_in_boolean_primary7852);
					boolean_value_expression382=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression382.getTree());

					RIGHT_PAREN383=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_boolean_primary7854); if (state.failed) return retval;
					}
					break;
				case 4 :
					// DBL.g:975:5: case_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_boolean_primary7861);
					case_expression384=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression384.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 121, boolean_primary_StartIndex); }

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
	// DBL.g:982:1: predicate : ( comparison_predicate | in_predicate | like_predicate | null_predicate );
	public final DBLParser.predicate_return predicate() throws RecognitionException {
		DBLParser.predicate_return retval = new DBLParser.predicate_return();
		retval.start = input.LT(1);
		int predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison_predicate385 =null;
		ParserRuleReturnScope in_predicate386 =null;
		ParserRuleReturnScope like_predicate387 =null;
		ParserRuleReturnScope null_predicate388 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

			// DBL.g:983:3: ( comparison_predicate | in_predicate | like_predicate | null_predicate )
			int alt123=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				int LA123_1 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt123=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt123=2;
				}
				else if ( (true) ) {
					alt123=4;
				}

				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA123_2 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt123=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt123=2;
				}
				else if ( (true) ) {
					alt123=4;
				}

				}
				break;
			case NUMBER:
			case REAL_NUMBER:
				{
				int LA123_3 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt123=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt123=2;
				}
				else if ( (true) ) {
					alt123=4;
				}

				}
				break;
			case NULL:
				{
				int LA123_4 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt123=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt123=2;
				}
				else if ( (true) ) {
					alt123=4;
				}

				}
				break;
			case Identifier:
				{
				int LA123_5 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt123=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt123=2;
				}
				else if ( (synpred190_DBL()) ) {
					alt123=3;
				}
				else if ( (true) ) {
					alt123=4;
				}

				}
				break;
			case LEFT_PAREN:
				{
				int LA123_6 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt123=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt123=2;
				}
				else if ( (true) ) {
					alt123=4;
				}

				}
				break;
			case COUNT:
				{
				int LA123_7 = input.LA(2);
				if ( (synpred188_DBL()) ) {
					alt123=1;
				}
				else if ( (synpred189_DBL()) ) {
					alt123=2;
				}
				else if ( (true) ) {
					alt123=4;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}
			switch (alt123) {
				case 1 :
					// DBL.g:983:5: comparison_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_comparison_predicate_in_predicate7875);
					comparison_predicate385=comparison_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_predicate385.getTree());

					}
					break;
				case 2 :
					// DBL.g:984:5: in_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_in_predicate_in_predicate7881);
					in_predicate386=in_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in_predicate386.getTree());

					}
					break;
				case 3 :
					// DBL.g:985:5: like_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_like_predicate_in_predicate7887);
					like_predicate387=like_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, like_predicate387.getTree());

					}
					break;
				case 4 :
					// DBL.g:986:5: null_predicate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_null_predicate_in_predicate7893);
					null_predicate388=null_predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, null_predicate388.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 122, predicate_StartIndex); }

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
	// DBL.g:994:1: comparison_predicate options {k=1; } : l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

			// DBL.g:996:2: (l= numeric_value_expression c= comp_op r= numeric_value_expression -> ^( $c $l $r) )
			// DBL.g:996:4: l= numeric_value_expression c= comp_op r= numeric_value_expression
			{
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate7917);
			l=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(l.getTree());
			pushFollow(FOLLOW_comp_op_in_comparison_predicate7921);
			c=comp_op();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_comp_op.add(c.getTree());
			pushFollow(FOLLOW_numeric_value_expression_in_comparison_predicate7925);
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
			// 996:68: -> ^( $c $l $r)
			{
				// DBL.g:996:71: ^( $c $l $r)
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
			if ( state.backtracking>0 ) { memoize(input, 123, comparison_predicate_StartIndex); }

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
	// DBL.g:998:1: comp_op : ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ );
	public final DBLParser.comp_op_return comp_op() throws RecognitionException {
		DBLParser.comp_op_return retval = new DBLParser.comp_op_return();
		retval.start = input.LT(1);
		int comp_op_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set389=null;

		CommonTree set389_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

			// DBL.g:999:3: ( EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set389=input.LT(1);
			if ( input.LA(1)==EQUAL||input.LA(1)==GEQ||input.LA(1)==GTH||input.LA(1)==LEQ||input.LA(1)==LTH||input.LA(1)==NOT_EQUAL ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set389));
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
			if ( state.backtracking>0 ) { memoize(input, 124, comp_op_StartIndex); }

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
	// DBL.g:1012:1: in_predicate : v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) ;
	public final DBLParser.in_predicate_return in_predicate() throws RecognitionException {
		DBLParser.in_predicate_return retval = new DBLParser.in_predicate_return();
		retval.start = input.LT(1);
		int in_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NOT390=null;
		Token IN391=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope a =null;

		CommonTree NOT390_tree=null;
		CommonTree IN391_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleSubtreeStream stream_in_predicate_value=new RewriteRuleSubtreeStream(adaptor,"rule in_predicate_value");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

			// DBL.g:1012:14: (v= numeric_value_expression ( NOT )? IN a= in_predicate_value -> ^( IN $v $a ( NOT )? ) )
			// DBL.g:1012:16: v= numeric_value_expression ( NOT )? IN a= in_predicate_value
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_predicate7993);
			v=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(v.getTree());
			// DBL.g:1012:44: ( NOT )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==NOT) ) {
				alt124=1;
			}
			switch (alt124) {
				case 1 :
					// DBL.g:1012:44: NOT
					{
					NOT390=(Token)match(input,NOT,FOLLOW_NOT_in_in_predicate7996); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT390);

					}
					break;

			}

			IN391=(Token)match(input,IN,FOLLOW_IN_in_in_predicate7999); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IN.add(IN391);

			pushFollow(FOLLOW_in_predicate_value_in_in_predicate8003);
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
			// 1012:73: -> ^( IN $v $a ( NOT )? )
			{
				// DBL.g:1012:76: ^( IN $v $a ( NOT )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_a.nextTree());
				// DBL.g:1012:87: ( NOT )?
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
			if ( state.backtracking>0 ) { memoize(input, 125, in_predicate_StartIndex); }

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
	// DBL.g:1013:1: in_predicate_value : LEFT_PAREN ! in_value_list RIGHT_PAREN !;
	public final DBLParser.in_predicate_value_return in_predicate_value() throws RecognitionException {
		DBLParser.in_predicate_value_return retval = new DBLParser.in_predicate_value_return();
		retval.start = input.LT(1);
		int in_predicate_value_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN392=null;
		Token RIGHT_PAREN394=null;
		ParserRuleReturnScope in_value_list393 =null;

		CommonTree LEFT_PAREN392_tree=null;
		CommonTree RIGHT_PAREN394_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

			// DBL.g:1014:3: ( LEFT_PAREN ! in_value_list RIGHT_PAREN !)
			// DBL.g:1014:5: LEFT_PAREN ! in_value_list RIGHT_PAREN !
			{
			root_0 = (CommonTree)adaptor.nil();


			LEFT_PAREN392=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_in_predicate_value8027); if (state.failed) return retval;
			pushFollow(FOLLOW_in_value_list_in_in_predicate_value8030);
			in_value_list393=in_value_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, in_value_list393.getTree());

			RIGHT_PAREN394=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_in_predicate_value8033); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 126, in_predicate_value_StartIndex); }

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
	// DBL.g:1016:1: in_value_list : numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ ;
	public final DBLParser.in_value_list_return in_value_list() throws RecognitionException {
		DBLParser.in_value_list_return retval = new DBLParser.in_value_list_return();
		retval.start = input.LT(1);
		int in_value_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA396=null;
		ParserRuleReturnScope numeric_value_expression395 =null;
		ParserRuleReturnScope numeric_value_expression397 =null;

		CommonTree COMMA396_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

			// DBL.g:1017:3: ( numeric_value_expression ( COMMA numeric_value_expression )* -> ( numeric_value_expression )+ )
			// DBL.g:1017:5: numeric_value_expression ( COMMA numeric_value_expression )*
			{
			pushFollow(FOLLOW_numeric_value_expression_in_in_value_list8045);
			numeric_value_expression395=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression395.getTree());
			// DBL.g:1017:31: ( COMMA numeric_value_expression )*
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==COMMA) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// DBL.g:1017:33: COMMA numeric_value_expression
					{
					COMMA396=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_value_list8050); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA396);

					pushFollow(FOLLOW_numeric_value_expression_in_in_value_list8052);
					numeric_value_expression397=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_numeric_value_expression.add(numeric_value_expression397.getTree());
					}
					break;

				default :
					break loop125;
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
			// 1017:68: -> ( numeric_value_expression )+
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
			if ( state.backtracking>0 ) { memoize(input, 127, in_value_list_StartIndex); }

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
	// DBL.g:1024:1: like_predicate : f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) ;
	public final DBLParser.like_predicate_return like_predicate() throws RecognitionException {
		DBLParser.like_predicate_return retval = new DBLParser.like_predicate_return();
		retval.start = input.LT(1);
		int like_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token NOT398=null;
		Token LIKE399=null;
		ParserRuleReturnScope f =null;

		CommonTree s_tree=null;
		CommonTree NOT398_tree=null;
		CommonTree LIKE399_tree=null;
		RewriteRuleTokenStream stream_Character_String_Literal=new RewriteRuleTokenStream(adaptor,"token Character_String_Literal");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

			// DBL.g:1025:3: (f= column_reference ( NOT )? LIKE s= Character_String_Literal -> ^( LIKE ( NOT )? $f $s) )
			// DBL.g:1025:5: f= column_reference ( NOT )? LIKE s= Character_String_Literal
			{
			pushFollow(FOLLOW_column_reference_in_like_predicate8074);
			f=column_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_reference.add(f.getTree());
			// DBL.g:1025:24: ( NOT )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==NOT) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// DBL.g:1025:24: NOT
					{
					NOT398=(Token)match(input,NOT,FOLLOW_NOT_in_like_predicate8076); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT398);

					}
					break;

			}

			LIKE399=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_predicate8079); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LIKE.add(LIKE399);

			s=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_like_predicate8083); if (state.failed) return retval; 
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
			// 1025:61: -> ^( LIKE ( NOT )? $f $s)
			{
				// DBL.g:1025:64: ^( LIKE ( NOT )? $f $s)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_LIKE.nextNode(), root_1);
				// DBL.g:1025:71: ( NOT )?
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
			if ( state.backtracking>0 ) { memoize(input, 128, like_predicate_StartIndex); }

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
	// DBL.g:1033:1: null_predicate : f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) ;
	public final DBLParser.null_predicate_return null_predicate() throws RecognitionException {
		DBLParser.null_predicate_return retval = new DBLParser.null_predicate_return();
		retval.start = input.LT(1);
		int null_predicate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token IS400=null;
		Token NULL401=null;
		ParserRuleReturnScope f =null;

		CommonTree n_tree=null;
		CommonTree IS400_tree=null;
		CommonTree NULL401_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleSubtreeStream stream_numeric_value_expression=new RewriteRuleSubtreeStream(adaptor,"rule numeric_value_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

			// DBL.g:1034:3: (f= numeric_value_expression IS (n= NOT )? NULL -> ^( IS $f NULL ( $n)? ) )
			// DBL.g:1034:5: f= numeric_value_expression IS (n= NOT )? NULL
			{
			pushFollow(FOLLOW_numeric_value_expression_in_null_predicate8114);
			f=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric_value_expression.add(f.getTree());
			IS400=(Token)match(input,IS,FOLLOW_IS_in_null_predicate8116); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IS.add(IS400);

			// DBL.g:1034:35: (n= NOT )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==NOT) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// DBL.g:1034:36: n= NOT
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_null_predicate8121); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(n);

					}
					break;

			}

			NULL401=(Token)match(input,NULL,FOLLOW_NULL_in_null_predicate8125); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NULL.add(NULL401);

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
			// 1034:49: -> ^( IS $f NULL ( $n)? )
			{
				// DBL.g:1034:52: ^( IS $f NULL ( $n)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);
				adaptor.addChild(root_1, stream_f.nextTree());
				adaptor.addChild(root_1, stream_NULL.nextNode());
				// DBL.g:1034:66: ( $n)?
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
			if ( state.backtracking>0 ) { memoize(input, 129, null_predicate_StartIndex); }

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
	// DBL.g:1042:1: numeric_value_expression : term ( ( PLUS | MINUS ) ^ term )* ;
	public final DBLParser.numeric_value_expression_return numeric_value_expression() throws RecognitionException {
		DBLParser.numeric_value_expression_return retval = new DBLParser.numeric_value_expression_return();
		retval.start = input.LT(1);
		int numeric_value_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set403=null;
		ParserRuleReturnScope term402 =null;
		ParserRuleReturnScope term404 =null;

		CommonTree set403_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }

			// DBL.g:1043:2: ( term ( ( PLUS | MINUS ) ^ term )* )
			// DBL.g:1043:4: term ( ( PLUS | MINUS ) ^ term )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_term_in_numeric_value_expression8153);
			term402=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term402.getTree());

			// DBL.g:1043:9: ( ( PLUS | MINUS ) ^ term )*
			loop128:
			while (true) {
				int alt128=2;
				int LA128_0 = input.LA(1);
				if ( (LA128_0==MINUS||LA128_0==PLUS) ) {
					alt128=1;
				}

				switch (alt128) {
				case 1 :
					// DBL.g:1043:10: ( PLUS | MINUS ) ^ term
					{
					set403=input.LT(1);
					set403=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set403), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_numeric_value_expression8163);
					term404=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term404.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 130, numeric_value_expression_StartIndex); }

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
	// DBL.g:1045:1: term : numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* ;
	public final DBLParser.term_return term() throws RecognitionException {
		DBLParser.term_return retval = new DBLParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set406=null;
		ParserRuleReturnScope numeric_primary405 =null;
		ParserRuleReturnScope numeric_primary407 =null;

		CommonTree set406_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

			// DBL.g:1046:3: ( numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )* )
			// DBL.g:1046:5: numeric_primary ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_numeric_primary_in_term8176);
			numeric_primary405=numeric_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary405.getTree());

			// DBL.g:1046:21: ( ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary )*
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==DIVIDE||LA129_0==MODULAR||LA129_0==MULTIPLY) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// DBL.g:1046:22: ( MULTIPLY | DIVIDE | MODULAR ) ^ numeric_primary
					{
					set406=input.LT(1);
					set406=input.LT(1);
					if ( input.LA(1)==DIVIDE||input.LA(1)==MODULAR||input.LA(1)==MULTIPLY ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set406), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numeric_primary_in_term8188);
					numeric_primary407=numeric_primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_primary407.getTree());

					}
					break;

				default :
					break loop129;
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
			if ( state.backtracking>0 ) { memoize(input, 131, term_StartIndex); }

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
	// DBL.g:1048:1: array : LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ ;
	public final DBLParser.array_return array() throws RecognitionException {
		DBLParser.array_return retval = new DBLParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN408=null;
		Token COMMA410=null;
		Token RIGHT_PAREN412=null;
		ParserRuleReturnScope literal409 =null;
		ParserRuleReturnScope literal411 =null;

		CommonTree LEFT_PAREN408_tree=null;
		CommonTree COMMA410_tree=null;
		CommonTree RIGHT_PAREN412_tree=null;
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }

			// DBL.g:1049:3: ( LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN -> ( literal )+ )
			// DBL.g:1049:5: LEFT_PAREN literal ( COMMA literal )* RIGHT_PAREN
			{
			LEFT_PAREN408=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_array8201); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN408);

			pushFollow(FOLLOW_literal_in_array8203);
			literal409=literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_literal.add(literal409.getTree());
			// DBL.g:1049:24: ( COMMA literal )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==COMMA) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// DBL.g:1049:25: COMMA literal
					{
					COMMA410=(Token)match(input,COMMA,FOLLOW_COMMA_in_array8206); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA410);

					pushFollow(FOLLOW_literal_in_array8208);
					literal411=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literal.add(literal411.getTree());
					}
					break;

				default :
					break loop130;
				}
			}

			RIGHT_PAREN412=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_array8213); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN412);

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
			// 1049:54: -> ( literal )+
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
			if ( state.backtracking>0 ) { memoize(input, 132, array_StartIndex); }

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
	// DBL.g:1051:1: numeric_primary : ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation );
	public final DBLParser.numeric_primary_return numeric_primary() throws RecognitionException {
		DBLParser.numeric_primary_return retval = new DBLParser.numeric_primary_return();
		retval.start = input.LT(1);
		int numeric_primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LEFT_PAREN415=null;
		Token RIGHT_PAREN417=null;
		ParserRuleReturnScope literal413 =null;
		ParserRuleReturnScope column_reference414 =null;
		ParserRuleReturnScope numeric_value_expression416 =null;
		ParserRuleReturnScope routine_invocation418 =null;

		CommonTree LEFT_PAREN415_tree=null;
		CommonTree RIGHT_PAREN417_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }

			// DBL.g:1052:3: ( literal | column_reference | LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !| routine_invocation )
			int alt131=4;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
			case MINUS:
			case NULL:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt131=1;
				}
				break;
			case Identifier:
				{
				int LA131_2 = input.LA(2);
				if ( (LA131_2==LEFT_PAREN) ) {
					alt131=4;
				}
				else if ( (LA131_2==EOF||LA131_2==AND||LA131_2==AS||LA131_2==COMMA||LA131_2==CROSS||LA131_2==DIVIDE||LA131_2==ELSE||(LA131_2 >= END && LA131_2 <= EQUAL)||LA131_2==EXCEPT||(LA131_2 >= FROM && LA131_2 <= FULL)||(LA131_2 >= GEQ && LA131_2 <= GROUP)||LA131_2==GTH||LA131_2==HAVING||LA131_2==IN||LA131_2==INNER||LA131_2==INTERSECT||LA131_2==IS||LA131_2==Identifier||LA131_2==JOIN||LA131_2==LEFT||LA131_2==LEQ||LA131_2==LIMIT||LA131_2==LTH||LA131_2==MINUS||LA131_2==MODULAR||LA131_2==MULTIPLY||LA131_2==NATURAL||(LA131_2 >= NOT && LA131_2 <= NOT_EQUAL)||(LA131_2 >= OR && LA131_2 <= ORDER)||LA131_2==PLUS||(LA131_2 >= RIGHT && LA131_2 <= RIGHT_PAREN)||LA131_2==THEN||LA131_2==UNION||(LA131_2 >= WHEN && LA131_2 <= WHERE)) ) {
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
			case LEFT_PAREN:
				{
				alt131=3;
				}
				break;
			case COUNT:
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
					// DBL.g:1052:5: literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_literal_in_numeric_primary8230);
					literal413=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal413.getTree());

					}
					break;
				case 2 :
					// DBL.g:1053:4: column_reference
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_column_reference_in_numeric_primary8235);
					column_reference414=column_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_reference414.getTree());

					}
					break;
				case 3 :
					// DBL.g:1054:4: LEFT_PAREN ! numeric_value_expression RIGHT_PAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LEFT_PAREN415=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_numeric_primary8240); if (state.failed) return retval;
					pushFollow(FOLLOW_numeric_value_expression_in_numeric_primary8243);
					numeric_value_expression416=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression416.getTree());

					RIGHT_PAREN417=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_numeric_primary8245); if (state.failed) return retval;
					}
					break;
				case 4 :
					// DBL.g:1055:4: routine_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_routine_invocation_in_numeric_primary8251);
					routine_invocation418=routine_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, routine_invocation418.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 133, numeric_primary_StartIndex); }

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
	// DBL.g:1057:1: literal : ( string_value_expr | signed_numerical_literal | NULL );
	public final DBLParser.literal_return literal() throws RecognitionException {
		DBLParser.literal_return retval = new DBLParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL421=null;
		ParserRuleReturnScope string_value_expr419 =null;
		ParserRuleReturnScope signed_numerical_literal420 =null;

		CommonTree NULL421_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }

			// DBL.g:1058:3: ( string_value_expr | signed_numerical_literal | NULL )
			int alt132=3;
			switch ( input.LA(1) ) {
			case Character_String_Literal:
				{
				alt132=1;
				}
				break;
			case MINUS:
			case NUMBER:
			case PLUS:
			case REAL_NUMBER:
				{
				alt132=2;
				}
				break;
			case NULL:
				{
				alt132=3;
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
					// DBL.g:1058:5: string_value_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_value_expr_in_literal8262);
					string_value_expr419=string_value_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value_expr419.getTree());

					}
					break;
				case 2 :
					// DBL.g:1059:5: signed_numerical_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_signed_numerical_literal_in_literal8268);
					signed_numerical_literal420=signed_numerical_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, signed_numerical_literal420.getTree());

					}
					break;
				case 3 :
					// DBL.g:1060:5: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL421=(Token)match(input,NULL,FOLLOW_NULL_in_literal8274); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL421_tree = (CommonTree)adaptor.create(NULL421);
					adaptor.addChild(root_0, NULL421_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 134, literal_StartIndex); }

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
	// DBL.g:1062:1: string_value_expr : Character_String_Literal ;
	public final DBLParser.string_value_expr_return string_value_expr() throws RecognitionException {
		DBLParser.string_value_expr_return retval = new DBLParser.string_value_expr_return();
		retval.start = input.LT(1);
		int string_value_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Character_String_Literal422=null;

		CommonTree Character_String_Literal422_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }

			// DBL.g:1063:3: ( Character_String_Literal )
			// DBL.g:1063:5: Character_String_Literal
			{
			root_0 = (CommonTree)adaptor.nil();


			Character_String_Literal422=(Token)match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_string_value_expr8286); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Character_String_Literal422_tree = (CommonTree)adaptor.create(Character_String_Literal422);
			adaptor.addChild(root_0, Character_String_Literal422_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 135, string_value_expr_StartIndex); }

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
	// DBL.g:1065:1: signed_numerical_literal : ( sign )? unsigned_numerical_literal ;
	public final DBLParser.signed_numerical_literal_return signed_numerical_literal() throws RecognitionException {
		DBLParser.signed_numerical_literal_return retval = new DBLParser.signed_numerical_literal_return();
		retval.start = input.LT(1);
		int signed_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope sign423 =null;
		ParserRuleReturnScope unsigned_numerical_literal424 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }

			// DBL.g:1066:3: ( ( sign )? unsigned_numerical_literal )
			// DBL.g:1066:5: ( sign )? unsigned_numerical_literal
			{
			root_0 = (CommonTree)adaptor.nil();


			// DBL.g:1066:5: ( sign )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==MINUS||LA133_0==PLUS) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// DBL.g:1066:5: sign
					{
					pushFollow(FOLLOW_sign_in_signed_numerical_literal8298);
					sign423=sign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sign423.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal8301);
			unsigned_numerical_literal424=unsigned_numerical_literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unsigned_numerical_literal424.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 136, signed_numerical_literal_StartIndex); }

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
	// DBL.g:1068:1: unsigned_numerical_literal : ( NUMBER | REAL_NUMBER );
	public final DBLParser.unsigned_numerical_literal_return unsigned_numerical_literal() throws RecognitionException {
		DBLParser.unsigned_numerical_literal_return retval = new DBLParser.unsigned_numerical_literal_return();
		retval.start = input.LT(1);
		int unsigned_numerical_literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set425=null;

		CommonTree set425_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }

			// DBL.g:1069:3: ( NUMBER | REAL_NUMBER )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set425=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==REAL_NUMBER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set425));
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
			if ( state.backtracking>0 ) { memoize(input, 137, unsigned_numerical_literal_StartIndex); }

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
	// DBL.g:1072:1: sign : ( PLUS | MINUS );
	public final DBLParser.sign_return sign() throws RecognitionException {
		DBLParser.sign_return retval = new DBLParser.sign_return();
		retval.start = input.LT(1);
		int sign_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set426=null;

		CommonTree set426_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }

			// DBL.g:1073:3: ( PLUS | MINUS )
			// DBL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set426=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set426));
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
			if ( state.backtracking>0 ) { memoize(input, 138, sign_StartIndex); }

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
	// DBL.g:1080:1: case_expression : case_specification ;
	public final DBLParser.case_expression_return case_expression() throws RecognitionException {
		DBLParser.case_expression_return retval = new DBLParser.case_expression_return();
		retval.start = input.LT(1);
		int case_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope case_specification427 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }

			// DBL.g:1081:3: ( case_specification )
			// DBL.g:1081:5: case_specification
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_case_specification_in_case_expression8349);
			case_specification427=case_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, case_specification427.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 139, case_expression_StartIndex); }

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
	// DBL.g:1083:1: case_abbreviation : ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN );
	public final DBLParser.case_abbreviation_return case_abbreviation() throws RecognitionException {
		DBLParser.case_abbreviation_return retval = new DBLParser.case_abbreviation_return();
		retval.start = input.LT(1);
		int case_abbreviation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULLIF428=null;
		Token LEFT_PAREN429=null;
		Token COMMA431=null;
		Token RIGHT_PAREN433=null;
		Token COALESCE434=null;
		Token LEFT_PAREN435=null;
		Token COMMA437=null;
		Token RIGHT_PAREN439=null;
		ParserRuleReturnScope numeric_value_expression430 =null;
		ParserRuleReturnScope boolean_value_expression432 =null;
		ParserRuleReturnScope numeric_value_expression436 =null;
		ParserRuleReturnScope boolean_value_expression438 =null;

		CommonTree NULLIF428_tree=null;
		CommonTree LEFT_PAREN429_tree=null;
		CommonTree COMMA431_tree=null;
		CommonTree RIGHT_PAREN433_tree=null;
		CommonTree COALESCE434_tree=null;
		CommonTree LEFT_PAREN435_tree=null;
		CommonTree COMMA437_tree=null;
		CommonTree RIGHT_PAREN439_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }

			// DBL.g:1084:3: ( NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN )
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==NULLIF) ) {
				alt135=1;
			}
			else if ( (LA135_0==COALESCE) ) {
				alt135=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 135, 0, input);
				throw nvae;
			}

			switch (alt135) {
				case 1 :
					// DBL.g:1084:5: NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					NULLIF428=(Token)match(input,NULLIF,FOLLOW_NULLIF_in_case_abbreviation8361); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULLIF428_tree = (CommonTree)adaptor.create(NULLIF428);
					adaptor.addChild(root_0, NULLIF428_tree);
					}

					LEFT_PAREN429=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation8363); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN429_tree = (CommonTree)adaptor.create(LEFT_PAREN429);
					adaptor.addChild(root_0, LEFT_PAREN429_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation8365);
					numeric_value_expression430=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression430.getTree());

					COMMA431=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation8367); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA431_tree = (CommonTree)adaptor.create(COMMA431);
					adaptor.addChild(root_0, COMMA431_tree);
					}

					pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation8369);
					boolean_value_expression432=boolean_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression432.getTree());

					RIGHT_PAREN433=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation8372); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN433_tree = (CommonTree)adaptor.create(RIGHT_PAREN433);
					adaptor.addChild(root_0, RIGHT_PAREN433_tree);
					}

					}
					break;
				case 2 :
					// DBL.g:1085:5: COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression )+ RIGHT_PAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					COALESCE434=(Token)match(input,COALESCE,FOLLOW_COALESCE_in_case_abbreviation8378); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COALESCE434_tree = (CommonTree)adaptor.create(COALESCE434);
					adaptor.addChild(root_0, COALESCE434_tree);
					}

					LEFT_PAREN435=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation8380); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PAREN435_tree = (CommonTree)adaptor.create(LEFT_PAREN435);
					adaptor.addChild(root_0, LEFT_PAREN435_tree);
					}

					pushFollow(FOLLOW_numeric_value_expression_in_case_abbreviation8382);
					numeric_value_expression436=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression436.getTree());

					// DBL.g:1085:50: ( COMMA boolean_value_expression )+
					int cnt134=0;
					loop134:
					while (true) {
						int alt134=2;
						int LA134_0 = input.LA(1);
						if ( (LA134_0==COMMA) ) {
							alt134=1;
						}

						switch (alt134) {
						case 1 :
							// DBL.g:1085:52: COMMA boolean_value_expression
							{
							COMMA437=(Token)match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation8386); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA437_tree = (CommonTree)adaptor.create(COMMA437);
							adaptor.addChild(root_0, COMMA437_tree);
							}

							pushFollow(FOLLOW_boolean_value_expression_in_case_abbreviation8388);
							boolean_value_expression438=boolean_value_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_value_expression438.getTree());

							}
							break;

						default :
							if ( cnt134 >= 1 ) break loop134;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(134, input);
							throw eee;
						}
						cnt134++;
					}

					RIGHT_PAREN439=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation8394); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PAREN439_tree = (CommonTree)adaptor.create(RIGHT_PAREN439);
					adaptor.addChild(root_0, RIGHT_PAREN439_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 140, case_abbreviation_StartIndex); }

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
	// DBL.g:1087:1: case_specification : ( simple_case | searched_case );
	public final DBLParser.case_specification_return case_specification() throws RecognitionException {
		DBLParser.case_specification_return retval = new DBLParser.case_specification_return();
		retval.start = input.LT(1);
		int case_specification_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope simple_case440 =null;
		ParserRuleReturnScope searched_case441 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }

			// DBL.g:1088:3: ( simple_case | searched_case )
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==CASE) ) {
				int LA136_1 = input.LA(2);
				if ( (LA136_1==COUNT||LA136_1==Character_String_Literal||LA136_1==Identifier||LA136_1==LEFT_PAREN||LA136_1==MINUS||LA136_1==NULL||LA136_1==NUMBER||LA136_1==PLUS||LA136_1==REAL_NUMBER) ) {
					alt136=1;
				}
				else if ( (LA136_1==WHEN) ) {
					alt136=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 136, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 136, 0, input);
				throw nvae;
			}

			switch (alt136) {
				case 1 :
					// DBL.g:1088:5: simple_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_case_in_case_specification8406);
					simple_case440=simple_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_case440.getTree());

					}
					break;
				case 2 :
					// DBL.g:1089:5: searched_case
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_searched_case_in_case_specification8412);
					searched_case441=searched_case();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_case441.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 141, case_specification_StartIndex); }

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
	// DBL.g:1091:1: simple_case : CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END ;
	public final DBLParser.simple_case_return simple_case() throws RecognitionException {
		DBLParser.simple_case_return retval = new DBLParser.simple_case_return();
		retval.start = input.LT(1);
		int simple_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE442=null;
		Token END446=null;
		ParserRuleReturnScope numeric_value_expression443 =null;
		ParserRuleReturnScope simple_when_clause444 =null;
		ParserRuleReturnScope else_clause445 =null;

		CommonTree CASE442_tree=null;
		CommonTree END446_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }

			// DBL.g:1092:3: ( CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END )
			// DBL.g:1092:5: CASE numeric_value_expression ( simple_when_clause )+ ( else_clause )? END
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE442=(Token)match(input,CASE,FOLLOW_CASE_in_simple_case8424); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE442_tree = (CommonTree)adaptor.create(CASE442);
			adaptor.addChild(root_0, CASE442_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_case8426);
			numeric_value_expression443=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression443.getTree());

			// DBL.g:1092:35: ( simple_when_clause )+
			int cnt137=0;
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==WHEN) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// DBL.g:1092:37: simple_when_clause
					{
					pushFollow(FOLLOW_simple_when_clause_in_simple_case8430);
					simple_when_clause444=simple_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_when_clause444.getTree());

					}
					break;

				default :
					if ( cnt137 >= 1 ) break loop137;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(137, input);
					throw eee;
				}
				cnt137++;
			}

			// DBL.g:1092:59: ( else_clause )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==ELSE) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// DBL.g:1092:61: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_simple_case8437);
					else_clause445=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause445.getTree());

					}
					break;

			}

			END446=(Token)match(input,END,FOLLOW_END_in_simple_case8443); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END446_tree = (CommonTree)adaptor.create(END446);
			adaptor.addChild(root_0, END446_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 142, simple_case_StartIndex); }

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
	// DBL.g:1094:1: searched_case : CASE ^ ( searched_when_clause )+ ( else_clause )? END !;
	public final DBLParser.searched_case_return searched_case() throws RecognitionException {
		DBLParser.searched_case_return retval = new DBLParser.searched_case_return();
		retval.start = input.LT(1);
		int searched_case_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CASE447=null;
		Token END450=null;
		ParserRuleReturnScope searched_when_clause448 =null;
		ParserRuleReturnScope else_clause449 =null;

		CommonTree CASE447_tree=null;
		CommonTree END450_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }

			// DBL.g:1095:3: ( CASE ^ ( searched_when_clause )+ ( else_clause )? END !)
			// DBL.g:1095:5: CASE ^ ( searched_when_clause )+ ( else_clause )? END !
			{
			root_0 = (CommonTree)adaptor.nil();


			CASE447=(Token)match(input,CASE,FOLLOW_CASE_in_searched_case8455); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE447_tree = (CommonTree)adaptor.create(CASE447);
			root_0 = (CommonTree)adaptor.becomeRoot(CASE447_tree, root_0);
			}

			// DBL.g:1095:11: ( searched_when_clause )+
			int cnt139=0;
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==WHEN) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// DBL.g:1095:12: searched_when_clause
					{
					pushFollow(FOLLOW_searched_when_clause_in_searched_case8459);
					searched_when_clause448=searched_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, searched_when_clause448.getTree());

					}
					break;

				default :
					if ( cnt139 >= 1 ) break loop139;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(139, input);
					throw eee;
				}
				cnt139++;
			}

			// DBL.g:1095:35: ( else_clause )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==ELSE) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// DBL.g:1095:36: else_clause
					{
					pushFollow(FOLLOW_else_clause_in_searched_case8464);
					else_clause449=else_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, else_clause449.getTree());

					}
					break;

			}

			END450=(Token)match(input,END,FOLLOW_END_in_searched_case8468); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 143, searched_case_StartIndex); }

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
	// DBL.g:1097:1: simple_when_clause : WHEN numeric_value_expression THEN result ;
	public final DBLParser.simple_when_clause_return simple_when_clause() throws RecognitionException {
		DBLParser.simple_when_clause_return retval = new DBLParser.simple_when_clause_return();
		retval.start = input.LT(1);
		int simple_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN451=null;
		Token THEN453=null;
		ParserRuleReturnScope numeric_value_expression452 =null;
		ParserRuleReturnScope result454 =null;

		CommonTree WHEN451_tree=null;
		CommonTree THEN453_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }

			// DBL.g:1097:20: ( WHEN numeric_value_expression THEN result )
			// DBL.g:1097:22: WHEN numeric_value_expression THEN result
			{
			root_0 = (CommonTree)adaptor.nil();


			WHEN451=(Token)match(input,WHEN,FOLLOW_WHEN_in_simple_when_clause8479); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHEN451_tree = (CommonTree)adaptor.create(WHEN451);
			adaptor.addChild(root_0, WHEN451_tree);
			}

			pushFollow(FOLLOW_numeric_value_expression_in_simple_when_clause8481);
			numeric_value_expression452=numeric_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression452.getTree());

			THEN453=(Token)match(input,THEN,FOLLOW_THEN_in_simple_when_clause8483); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			THEN453_tree = (CommonTree)adaptor.create(THEN453);
			adaptor.addChild(root_0, THEN453_tree);
			}

			pushFollow(FOLLOW_result_in_simple_when_clause8485);
			result454=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, result454.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 144, simple_when_clause_StartIndex); }

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
	// DBL.g:1098:1: searched_when_clause : WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) ;
	public final DBLParser.searched_when_clause_return searched_when_clause() throws RecognitionException {
		DBLParser.searched_when_clause_return retval = new DBLParser.searched_when_clause_return();
		retval.start = input.LT(1);
		int searched_when_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHEN455=null;
		Token THEN456=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope r =null;

		CommonTree WHEN455_tree=null;
		CommonTree THEN456_tree=null;
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");
		RewriteRuleSubtreeStream stream_search_condition=new RewriteRuleSubtreeStream(adaptor,"rule search_condition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }

			// DBL.g:1099:3: ( WHEN c= search_condition THEN r= result -> ^( WHEN $c $r) )
			// DBL.g:1099:5: WHEN c= search_condition THEN r= result
			{
			WHEN455=(Token)match(input,WHEN,FOLLOW_WHEN_in_searched_when_clause8495); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHEN.add(WHEN455);

			pushFollow(FOLLOW_search_condition_in_searched_when_clause8499);
			c=search_condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_search_condition.add(c.getTree());
			THEN456=(Token)match(input,THEN,FOLLOW_THEN_in_searched_when_clause8501); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_THEN.add(THEN456);

			pushFollow(FOLLOW_result_in_searched_when_clause8505);
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
			// 1099:43: -> ^( WHEN $c $r)
			{
				// DBL.g:1099:46: ^( WHEN $c $r)
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
			if ( state.backtracking>0 ) { memoize(input, 145, searched_when_clause_StartIndex); }

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
	// DBL.g:1101:1: else_clause : ELSE r= result -> ^( ELSE $r) ;
	public final DBLParser.else_clause_return else_clause() throws RecognitionException {
		DBLParser.else_clause_return retval = new DBLParser.else_clause_return();
		retval.start = input.LT(1);
		int else_clause_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ELSE457=null;
		ParserRuleReturnScope r =null;

		CommonTree ELSE457_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_result=new RewriteRuleSubtreeStream(adaptor,"rule result");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }

			// DBL.g:1102:3: ( ELSE r= result -> ^( ELSE $r) )
			// DBL.g:1102:5: ELSE r= result
			{
			ELSE457=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_clause8529); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ELSE.add(ELSE457);

			pushFollow(FOLLOW_result_in_else_clause8533);
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
			// 1102:19: -> ^( ELSE $r)
			{
				// DBL.g:1102:22: ^( ELSE $r)
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
			if ( state.backtracking>0 ) { memoize(input, 146, else_clause_StartIndex); }

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
	// DBL.g:1104:1: result : ( numeric_value_expression | NULL );
	public final DBLParser.result_return result() throws RecognitionException {
		DBLParser.result_return retval = new DBLParser.result_return();
		retval.start = input.LT(1);
		int result_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NULL459=null;
		ParserRuleReturnScope numeric_value_expression458 =null;

		CommonTree NULL459_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }

			// DBL.g:1105:3: ( numeric_value_expression | NULL )
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==COUNT||LA141_0==Character_String_Literal||LA141_0==Identifier||LA141_0==LEFT_PAREN||LA141_0==MINUS||LA141_0==NUMBER||LA141_0==PLUS||LA141_0==REAL_NUMBER) ) {
				alt141=1;
			}
			else if ( (LA141_0==NULL) ) {
				int LA141_2 = input.LA(2);
				if ( (synpred221_DBL()) ) {
					alt141=1;
				}
				else if ( (true) ) {
					alt141=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 141, 0, input);
				throw nvae;
			}

			switch (alt141) {
				case 1 :
					// DBL.g:1105:5: numeric_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_expression_in_result8554);
					numeric_value_expression458=numeric_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_value_expression458.getTree());

					}
					break;
				case 2 :
					// DBL.g:1105:32: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL459=(Token)match(input,NULL,FOLLOW_NULL_in_result8558); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL459_tree = (CommonTree)adaptor.create(NULL459);
					adaptor.addChild(root_0, NULL459_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 147, result_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "result"

	// $ANTLR start synpred67_DBL
	public final void synpred67_DBL_fragment() throws RecognitionException {
		// DBL.g:501:3: ( open_statement )
		// DBL.g:501:3: open_statement
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
		// DBL.g:511:3: ( open_statement )
		// DBL.g:511:3: open_statement
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
		// DBL.g:729:5: ( non_join_query_expression )
		// DBL.g:729:5: non_join_query_expression
		{
		pushFollow(FOLLOW_non_join_query_expression_in_synpred112_DBL6100);
		non_join_query_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred112_DBL

	// $ANTLR start synpred113_DBL
	public final void synpred113_DBL_fragment() throws RecognitionException {
		// DBL.g:733:6: ( non_join_query_term )
		// DBL.g:733:6: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred113_DBL6119);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred113_DBL

	// $ANTLR start synpred121_DBL
	public final void synpred121_DBL_fragment() throws RecognitionException {
		// DBL.g:737:5: ( non_join_query_term )
		// DBL.g:737:5: non_join_query_term
		{
		pushFollow(FOLLOW_non_join_query_term_in_synpred121_DBL6179);
		non_join_query_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred121_DBL

	// $ANTLR start synpred142_DBL
	public final void synpred142_DBL_fragment() throws RecognitionException {
		// DBL.g:782:22: ( COMMA column_reference )
		// DBL.g:782:22: COMMA column_reference
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred142_DBL6532); if (state.failed) return;

		pushFollow(FOLLOW_column_reference_in_synpred142_DBL6534);
		column_reference();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred142_DBL

	// $ANTLR start synpred185_DBL
	public final void synpred185_DBL_fragment() throws RecognitionException {
		// DBL.g:972:5: ( predicate )
		// DBL.g:972:5: predicate
		{
		pushFollow(FOLLOW_predicate_in_synpred185_DBL7837);
		predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred185_DBL

	// $ANTLR start synpred186_DBL
	public final void synpred186_DBL_fragment() throws RecognitionException {
		// DBL.g:973:5: ( numeric_value_expression )
		// DBL.g:973:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred186_DBL7843);
		numeric_value_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred186_DBL

	// $ANTLR start synpred187_DBL
	public final void synpred187_DBL_fragment() throws RecognitionException {
		// DBL.g:974:5: ( LEFT_PAREN boolean_value_expression RIGHT_PAREN )
		// DBL.g:974:5: LEFT_PAREN boolean_value_expression RIGHT_PAREN
		{
		match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred187_DBL7849); if (state.failed) return;

		pushFollow(FOLLOW_boolean_value_expression_in_synpred187_DBL7852);
		boolean_value_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred187_DBL7854); if (state.failed) return;

		}

	}
	// $ANTLR end synpred187_DBL

	// $ANTLR start synpred188_DBL
	public final void synpred188_DBL_fragment() throws RecognitionException {
		// DBL.g:983:5: ( comparison_predicate )
		// DBL.g:983:5: comparison_predicate
		{
		pushFollow(FOLLOW_comparison_predicate_in_synpred188_DBL7875);
		comparison_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred188_DBL

	// $ANTLR start synpred189_DBL
	public final void synpred189_DBL_fragment() throws RecognitionException {
		// DBL.g:984:5: ( in_predicate )
		// DBL.g:984:5: in_predicate
		{
		pushFollow(FOLLOW_in_predicate_in_synpred189_DBL7881);
		in_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred189_DBL

	// $ANTLR start synpred190_DBL
	public final void synpred190_DBL_fragment() throws RecognitionException {
		// DBL.g:985:5: ( like_predicate )
		// DBL.g:985:5: like_predicate
		{
		pushFollow(FOLLOW_like_predicate_in_synpred190_DBL7887);
		like_predicate();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred190_DBL

	// $ANTLR start synpred221_DBL
	public final void synpred221_DBL_fragment() throws RecognitionException {
		// DBL.g:1105:5: ( numeric_value_expression )
		// DBL.g:1105:5: numeric_value_expression
		{
		pushFollow(FOLLOW_numeric_value_expression_in_synpred221_DBL8554);
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
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param3761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param3766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_param3773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3776 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_COMMA_in_precision_param3778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_precision_param3781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_param3783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_type_length3796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_type_length3799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_type_length3801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_boolean_type3814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_boolean_type3820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_bit_type3836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_bit_type3838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBIT_in_varbit_type3855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_varbit_type3857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_in_varbit_type3868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_VARYING_in_varbit_type3870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
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
	public static final BitSet FOLLOW_FLOAT_in_float_type4007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_float_type4009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT8_in_float8_type4028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type4034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_float8_type4044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_PRECISION_in_float8_type4046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERIC_in_number_type4062 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_precision_param_in_number_type4065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_number_type4081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_precision_param_in_number_type4084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_number_type4102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_precision_param_in_number_type4109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_char_type4133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_char_type4135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_char_type4146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_char_type4148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARCHAR_in_varchar_type4165 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_varchar_type4167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_varchar_type4178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_VARYING_in_varchar_type4180 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_varchar_type4182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCHAR_in_nchar_type4199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_nchar_type4201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nchar_type4212 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nchar_type4214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_nchar_type4216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NVARCHAR_in_nvarchar_type4233 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type4235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIONAL_in_nvarchar_type4246 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CHARACTER_in_nvarchar_type4248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_VARYING_in_nvarchar_type4250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_nvarchar_type4252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMETZ_in_timetz_type4269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timetz_type4275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_WITH_in_timetz_type4277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_TIME_in_timetz_type4279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_ZONE_in_timetz_type4281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMPTZ_in_timestamptz_type4297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMESTAMP_in_timestamptz_type4303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_WITH_in_timestamptz_type4305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_TIME_in_timestamptz_type4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_ZONE_in_timestamptz_type4309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_binary_type4325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_binary_type4327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARBINARY_in_varbinary_type4340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_type_length_in_varbinary_type4342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_in_varbinary_type4349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_VARYING_in_varbinary_type4351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
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
	public static final BitSet FOLLOW_SET_in_set_transaction_statement4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_TRANSACTION_in_set_transaction_statement4506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_ISOLATION_in_set_transaction_statement4508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LEVEL_in_set_transaction_statement4510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000200010020000L});
	public static final BitSet FOLLOW_isolation_level_in_set_transaction_statement4514 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMA_in_set_transaction_statement4517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_read_operation_in_set_transaction_statement4521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SERIALIZABLE_in_isolation_level4562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_no_commit_in_isolation_level4568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_uncommitted_in_isolation_level4574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_committed_in_isolation_level4580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatable_read_in_isolation_level4586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NO_in_no_commit4600 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_COMMIT_in_no_commit4602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_uncommitted4625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_UNCOMMITTED_in_read_uncommitted4627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_committed4646 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_COMMITTED_in_read_committed4648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEATABLE_in_repeatable_read4669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_READ_in_repeatable_read4671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_only_in_read_operation4690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_write_in_read_operation4696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_only4709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_ONLY_in_read_only4711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_write4731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_WRITE_in_read_write4733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXECUTE_in_execute_statement4764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_execute_statement4768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXECUTE_in_execute_immediate_statement4807 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_IMMEDIATE_in_execute_immediate_statement4809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Variable_in_execute_immediate_statement4813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_in_open_statement4848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_open_statement4852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_USING_in_open_statement4856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Variable_in_open_statement4860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_open_statement4864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_DESCRIPTOR_in_open_statement4866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Variable_in_open_statement4871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_open_statement4875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PREPARE_in_prepare_statement5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_prepare_statement5050 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_into_clause_in_prepare_statement5053 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_FROM_in_prepare_statement5057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Variable_in_prepare_statement5061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARE_in_declare_cursor_statement5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declare_cursor_statement5115 = new BitSet(new long[]{0x0100000000000000L,0x0000000000002000L,0x0000100000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_DYNAMIC_in_declare_cursor_statement5120 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_scroll_in_declare_cursor_statement5127 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_CURSOR_in_declare_cursor_statement5131 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000006000000000L});
	public static final BitSet FOLLOW_hold_in_declare_cursor_statement5136 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_FOR_in_declare_cursor_statement5140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declare_cursor_statement5144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCROLL_in_scroll5204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NO_in_scroll5216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_SCROLL_in_scroll5218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_hold5238 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_HOLD_in_hold5240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHOUT_in_hold5253 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_HOLD_in_hold5255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESCRIBE_in_describe_statement5282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_describe_statement5286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_into_clause_in_describe_statement5288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FETCH_in_fetch_statement5320 = new BitSet(new long[]{0x0080000000100020L,0x0000204000000000L,0x0000080000080000L,0x0000000001000400L});
	public static final BitSet FOLLOW_fetch_position_in_fetch_statement5323 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_FROM_in_fetch_statement5327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_fetch_statement5331 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_fetch_into_in_fetch_statement5334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEXT_in_fetch_position5379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIOR_in_fetch_position5381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_fetch_position5383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAST_in_fetch_position5385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEFORE_in_fetch_position5387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AFTER_in_fetch_position5389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURRENT_in_fetch_position5391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELATIVE_in_fetch_position5411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Variable_in_fetch_position5416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_fetch_position5420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_fetch_in_fetch_into5490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiple_row_fetch_in_fetch_into5498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTO_in_single_fetch5517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Variable_in_single_fetch5522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_multiple_row_fetch5561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row_fetch5566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_NUMBER_in_multiple_row_fetch5568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_ROWS_in_multiple_row_fetch5571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_multiple_row_in_multiple_row_fetch5576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_INTO_in_multiple_row_fetch5580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row_fetch5584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_multiple_row5682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_DESCRIPTOR_in_multiple_row5684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Variable_in_multiple_row5688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLOSE_in_close_statement5724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_close_statement5728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTO_in_into_clause5769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Identifier_in_into_clause5774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_Variable_in_into_clause5778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_USING_in_into_clause5782 = new BitSet(new long[]{0x0000000008002100L,0x0000000000000000L,0x0000004000040000L,0x2000000000000000L});
	public static final BitSet FOLLOW_using_target_in_into_clause5786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMES_in_using_target5862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LABELS_in_using_target5864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANY_in_using_target5866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOTH_in_using_target5868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_using_target5870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_system_names_in_using_target5872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYSTEM_in_system_names5885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_NAMES_in_system_names5887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_table_elements5910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_field_element_in_table_elements5912 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_COMMA_in_table_elements5915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_field_element_in_table_elements5917 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_table_elements5921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_field_element5945 = new BitSet(new long[]{0xD000000C27E00000L,0x8000078000000800L,0x00C00280000000FCL,0x0040000000400000L,0x000000001C000FA0L});
	public static final BitSet FOLLOW_FOR_in_field_element5948 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_COLUMN_in_field_element5950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_field_element5954 = new BitSet(new long[]{0xD000000C27E00000L,0x8000038000000800L,0x00C00280000000FCL,0x0040000000400000L,0x000000001C000FA0L});
	public static final BitSet FOLLOW_field_type_in_field_element5958 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_not_null_in_field_element5961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_with_default_in_field_element5966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_not_null6016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_NULL_in_not_null6018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_with_default6039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_DEFAULT_in_with_default6041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_type_in_field_type6067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_expression_body_in_query_expression6088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_query_expression_body6100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_expression_body6106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_non_join_query_expression6119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_expression6123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression6125 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000000202000L,0x0000040000000000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression6141 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_set_in_non_join_query_expression6149 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000000202000L,0x0000040000000000L});
	public static final BitSet FOLLOW_query_term_in_non_join_query_expression6165 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_non_join_query_term_in_query_term6179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_term6185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_primary_in_non_join_query_term6199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_joined_table_in_non_join_query_term6203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term6205 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000000202000L,0x0000040000000000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term6215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INTERSECT_in_non_join_query_term6223 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000000202000L,0x0000040000000000L});
	public static final BitSet FOLLOW_query_primary_in_non_join_query_term6233 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_non_join_query_primary_in_query_primary6247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_query_primary6253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_table_in_non_join_query_primary6265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_non_join_query_primary6271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000202000L,0x0000040000000000L});
	public static final BitSet FOLLOW_non_join_query_expression_in_non_join_query_primary6273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_non_join_query_primary6275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_specification_in_simple_table6296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_query_specification6308 = new BitSet(new long[]{0x0202000200000100L,0x0000000000000100L,0x0024200880202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_set_qualifier_in_query_specification6310 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200880202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_select_list_in_query_specification6313 = new BitSet(new long[]{0x0000000000000002L,0x0088200000000000L,0x8000000002000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_from_clause_in_query_specification6315 = new BitSet(new long[]{0x0000000000000002L,0x0088000000000000L,0x8000000002000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_where_clause_in_query_specification6318 = new BitSet(new long[]{0x0000000000000002L,0x0088000000000000L,0x8000000002000000L});
	public static final BitSet FOLLOW_groupby_clause_in_query_specification6321 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x8000000002000000L});
	public static final BitSet FOLLOW_having_clause_in_query_specification6324 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000002000000L});
	public static final BitSet FOLLOW_orderby_clause_in_query_specification6331 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_limit_clause_in_query_specification6334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTIPLY_in_select_list6384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derived_column_in_select_list6398 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMA_in_select_list6401 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_derived_column_in_select_list6403 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_DISTINCT_in_set_qualifier6426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_set_qualifier6440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_derived_column6460 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_as_clause_in_derived_column6462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_column_reference6490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_as_clause6514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_column_reference_in_as_clause6518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list6529 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMA_in_column_reference_list6532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_column_reference_in_column_reference_list6534 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_Identifier_in_table6552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_identifier_in_table6564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_DIVIDE_in_qualified_identifier6581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_qualified_identifier6588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_qualified_identifier6592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_qualified_identifier6594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_member6629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_DIVIDE_in_member6631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_member6635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_member6637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_member6641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_member6643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from_clause6678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_table_reference_list_in_from_clause6681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list6692 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMA_in_table_reference_list6695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_table_reference_in_table_reference_list6697 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_table_primary_in_table_reference6716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joined_table_in_table_reference6722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_primary_in_joined_table6734 = new BitSet(new long[]{0x0020000000000000L,0x0000400000000000L,0x0000010000108001L,0x0000000200000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table6737 = new BitSet(new long[]{0x0020000000000002L,0x0000400000000000L,0x0000010000108001L,0x0000000200000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table6741 = new BitSet(new long[]{0x0020000000000002L,0x0000400000000000L,0x0000010000108001L,0x0000000200000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_natural_join_in_joined_table6745 = new BitSet(new long[]{0x0020000000000002L,0x0000400000000000L,0x0000010000108001L,0x0000000200000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_union_join_in_joined_table6749 = new BitSet(new long[]{0x0020000000000002L,0x0000400000000000L,0x0000010000108001L,0x0000000200000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_cross_join_in_joined_table_prim6763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_join_in_joined_table_prim6769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_natural_join_in_joined_table_prim6775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_union_join_in_joined_table_prim6781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CROSS_in_cross_join6793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_JOIN_in_cross_join6795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_table_primary_in_cross_join6799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_type_in_qualified_join6825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_JOIN_in_qualified_join6829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_table_primary_in_qualified_join6833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_join_specification_in_qualified_join6837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATURAL_in_natural_join6865 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000108001L,0x0000000200000000L});
	public static final BitSet FOLLOW_join_type_in_natural_join6870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_JOIN_in_natural_join6874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_table_primary_in_natural_join6878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNION_in_union_join6905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_JOIN_in_union_join6907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_table_primary_in_union_join6911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNER_in_join_type6934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type6942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_OUTER_in_join_type6944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outer_join_type_in_join_type6961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_condition_in_join_specification7006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_named_columns_join_in_join_specification7012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_condition7024 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_search_condition_in_join_condition7027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_named_columns_join7039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_named_columns_join7041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_column_reference_list_in_named_columns_join7045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_named_columns_join7047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_in_table_primary7068 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_AS_in_table_primary7072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_table_primary7078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause7106 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_search_condition_in_where_clause7109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_routine_invocation7122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7124 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000400800040L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation7126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation7144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7146 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_funcArgs_in_routine_invocation7148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_routine_invocation7163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_routine_invocation7165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_MULTIPLY_in_routine_invocation7167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_routine_invocation7169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs7186 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMA_in_funcArgs7189 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_boolean_value_expression_in_funcArgs7191 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupby_clause7212 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_BY_in_groupby_clause7214 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0000000000202000L,0x0000002000000000L});
	public static final BitSet FOLLOW_grouping_element_list_in_groupby_clause7218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list7239 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMA_in_grouping_element_list7242 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x0000000000202000L,0x0000002000000000L});
	public static final BitSet FOLLOW_grouping_element_in_grouping_element_list7244 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_grouping_element7263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rollup_list_in_grouping_element7269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cube_list_in_grouping_element7275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_grouping_set_in_grouping_element7281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set7293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_ordinary_grouping_set7299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_column_reference_list_in_ordinary_grouping_set7302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_ordinary_grouping_set7304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROLLUP_in_rollup_list7317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_rollup_list7319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000202000L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_rollup_list7323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_rollup_list7325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CUBE_in_cube_list7346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_cube_list7348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000202000L});
	public static final BitSet FOLLOW_ordinary_grouping_set_in_cube_list7352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_cube_list7354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_empty_grouping_set7375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_empty_grouping_set7377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HAVING_in_having_clause7395 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_boolean_value_expression_in_having_clause7398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_orderby_clause7412 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_BY_in_orderby_clause7414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_sort_specifier_list_in_orderby_clause7416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list7436 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMA_in_sort_specifier_list7439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_sort_specifier_in_sort_specifier_list7441 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_column_reference_in_sort_specifier7466 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000008L,0x0004000000000000L});
	public static final BitSet FOLLOW_order_specification_in_sort_specifier7470 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_null_ordering_in_sort_specifier7475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASC_in_order_specification7505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESC_in_order_specification7519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIMIT_in_limit_clause7539 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_value_expression_in_limit_clause7543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering7564 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_FIRST_in_null_ordering7566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_ordering7580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LAST_in_null_ordering7582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_value_expression_in_search_condition7604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_param_clause7615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_param_clause7617 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause7619 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_COMMA_in_param_clause7622 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_param_in_param_clause7624 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_param_clause7628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_param7651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_EQUAL_in_param7653 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_value_expression_in_param7657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_method_specifier7681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_method_specifier7685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression7705 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_OR_in_boolean_value_expression7708 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_and_predicate_in_boolean_value_expression7711 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate7724 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_AND_in_and_predicate7727 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_boolean_factor_in_and_predicate7730 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor7743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_boolean_factor7749 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor7751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_primary_in_boolean_test7771 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_is_clause_in_boolean_test7773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_in_is_clause7786 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000200000000000L,0x0000000000000000L,0x0000000000104000L});
	public static final BitSet FOLLOW_NOT_in_is_clause7788 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104000L});
	public static final BitSet FOLLOW_truth_value_in_is_clause7793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_boolean_primary7837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_boolean_primary7843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_boolean_primary7849 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_boolean_value_expression_in_boolean_primary7852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_boolean_primary7854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_boolean_primary7861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_predicate7875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_predicate7881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_predicate7887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_predicate_in_predicate7893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate7917 = new BitSet(new long[]{0x0000000000000000L,0x0024000000100000L,0x0000400010400000L});
	public static final BitSet FOLLOW_comp_op_in_comparison_predicate7921 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_value_expression_in_comparison_predicate7925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_predicate7993 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_NOT_in_in_predicate7996 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_IN_in_in_predicate7999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_in_predicate_value_in_in_predicate8003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_in_predicate_value8027 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_in_value_list_in_in_predicate_value8030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_in_predicate_value8033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list8045 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMA_in_in_value_list8050 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_value_expression_in_in_value_list8052 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_column_reference_in_like_predicate8074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200001000000L});
	public static final BitSet FOLLOW_NOT_in_like_predicate8076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LIKE_in_like_predicate8079 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Character_String_Literal_in_like_predicate8083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_null_predicate8114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_IS_in_null_predicate8116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004200000000000L});
	public static final BitSet FOLLOW_NOT_in_null_predicate8121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_NULL_in_null_predicate8125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression8153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_set_in_numeric_value_expression8156 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_term_in_numeric_value_expression8163 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_numeric_primary_in_term8176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L,0x0000000A00000000L});
	public static final BitSet FOLLOW_set_in_term8179 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_primary_in_term8188 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L,0x0000000A00000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_array8201 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000000L,0x0024000080000000L,0x0000000000800040L});
	public static final BitSet FOLLOW_literal_in_array8203 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_COMMA_in_array8206 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000000L,0x0024000080000000L,0x0000000000800040L});
	public static final BitSet FOLLOW_literal_in_array8208 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_array8213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_numeric_primary8230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_numeric_primary8235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_numeric_primary8240 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_value_expression_in_numeric_primary8243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_numeric_primary8245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_routine_invocation_in_numeric_primary8251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_value_expr_in_literal8262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signed_numerical_literal_in_literal8268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_literal8274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_String_Literal_in_string_value_expr8286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sign_in_signed_numerical_literal8298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_unsigned_numerical_literal_in_signed_numerical_literal8301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_specification_in_case_expression8349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULLIF_in_case_abbreviation8361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation8363 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation8365 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation8367 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation8369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation8372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COALESCE_in_case_abbreviation8378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation8380 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_value_expression_in_case_abbreviation8382 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_COMMA_in_case_abbreviation8386 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_boolean_value_expression_in_case_abbreviation8388 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation8394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_case_in_case_specification8406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_searched_case_in_case_specification8412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_simple_case8424 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_case8426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_simple_when_clause_in_simple_case8430 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_else_clause_in_simple_case8437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_END_in_simple_case8443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_searched_case8455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_searched_when_clause_in_searched_case8459 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_else_clause_in_searched_case8464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_END_in_searched_case8468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_simple_when_clause8479 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_numeric_value_expression_in_simple_when_clause8481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_THEN_in_simple_when_clause8483 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_result_in_simple_when_clause8485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_searched_when_clause8495 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_search_condition_in_searched_when_clause8499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_THEN_in_searched_when_clause8501 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_result_in_searched_when_clause8505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_clause8529 = new BitSet(new long[]{0x0202000000000000L,0x0000000000000000L,0x0024000080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_result_in_else_clause8533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_result8554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_result8558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_synpred67_DBL4434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_open_statement_in_synpred72_DBL4474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_expression_in_synpred112_DBL6100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred113_DBL6119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_join_query_term_in_synpred121_DBL6179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred142_DBL6532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_column_reference_in_synpred142_DBL6534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred185_DBL7837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred186_DBL7843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_synpred187_DBL7849 = new BitSet(new long[]{0x0202000200000000L,0x0000000000000000L,0x0024200080202000L,0x0000000000800040L});
	public static final BitSet FOLLOW_boolean_value_expression_in_synpred187_DBL7852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred187_DBL7854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_synpred188_DBL7875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_synpred189_DBL7881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_synpred190_DBL7887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_expression_in_synpred221_DBL8554 = new BitSet(new long[]{0x0000000000000002L});
}
