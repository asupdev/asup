/** 
 * 
Copyright (coffee) 2012, 2013 Sme.UP and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.asup.os.type.base.api;

import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QList;
import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QLIDOBJD", messages = { "CPFB8ED", "CPF2105", "CPF2110",
		"CPF2113", "CPF2114", "CPF2115", "CPF2121", "CPF2123", "CPF2124",
		"CPF2150", "CPF2176", "CPF2177", "CPF218C", "CPF218D", "CPF2182",
		"CPF2189", "CPF326B", "CPF9803", "CPF9809", "CPF9814", "CPF9825",
		"CPF9827", "CPF9833", "CPF9845", "CPF9846", "CPF9847", "CPF9850",
		"CPF9851", "CPF9860", "CPF9871", "CPF9875", "CPF9899", "OPT1813",
		"OPT1815", "OPT1820", "OPT1821", "OPT1825", "OPT1860", "OPT1861",
		"OPT1862", "OPT1863", "OPT1872", "OPT2001", "OPT2004", "OPT2005",
		"OPT2006", "OPT2007", "OPT2008", "OPT2009", "OPT2010", "OPT2015",
		"OPT2028", "OPT2029", "OPT2040", "OPT2301", "OPT2420", "OPT2422",
		"OPT7740" })
public class QLIDOBJD {

	@Entry
	public void main(@DataDef() Object object,
			@DataDef(dimension = "92") QList<QCharacter> objectType,
			@DataDef(length = 1) QCharacter detail,
			@DataDef() ASPDevice aSPDevice,
			@DataDef(length = 1) QCharacter output,
			@DataDef() FileToReceiveOutput fileToReceiveOutput,
			@DataDef() OutputMemberOptions outputMemberOptions) {
	}

	public class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}

	public class ASPDevice extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}

	public class FileToReceiveOutput extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}

	public class OutputMemberOptions extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 7)
		public QCharacter field_1;
	}
}
