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

import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QList;
import org.asup.il.data.QStruct;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QWCCDAOC", messages = { "CPFA0AB", "CPFA0A1", "CPFA0A7",
		"CPFA0A9", "CPFA0BD", "CPFA0B1", "CPFA0B2", "CPFA09C", "CPF1005",
		"CPF2213", "CPF2214", "CPF2225", "CPF224A", "CPF2242", "CPF2244",
		"CPF225A", "CPF2259", "CPF2260", "CPF2261", "CPF2262", "CPF2269",
		"CPF2272", "CPF2291", "CPF2292", "CPF2293", "CPF9802", "CPF9819",
		"CPF9820", "CPF9825", "OPT1555", "OPT1605", "OPT1640", "OPT1790",
		"OPT1795", "OPT1805", "OPT1810", "OPT1813", "OPT1815", "OPT1820",
		"OPT1821", "OPT1825", "OPT1860", "OPT1861", "OPT1862", "OPT1863",
		"OPT1872", "OPT2001", "OPT2004", "OPT2005", "OPT2006", "OPT2007",
		"OPT2008", "OPT2009", "OPT2010", "OPT2015", "OPT2028", "OPT2029",
		"OPT2040", "OPT2301", "OPT2420", "OPT2422", "OPT7740" })
public class QWCCDAOC {

	@Entry
	public void main(
			@DataDef(dimension = "50") QList<ObjectSpecifications> objectSpecifications,
			@DataDef(length = 1) QCharacter lockScope) {
	}

	public class ObjectSpecifications extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef()
		public QStruct field_0;
		@DataDef(length = 7)
		public QCharacter field_1;
		@DataDef()
		public QBinary field_2;
		@DataDef(length = 10)
		public QCharacter field_3;
	}
}
