/** 
 * 
Copyright (c) 2012, 2014 Sme.UP and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.asup.os.type.dtaara.base.api;

import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QWCCCRVC", messages = { "CPF1008", "CPF1015", "CPF1021",
		"CPF1022", "CPF1023", "CPF1024", "CPF1025", "CPF1026", "CPF1047",
		"CPF1062", "CPF1092", "CPF180B", "CPF3143", "CPF3148", "CPF3150",
		"CPF5812", "CPF9212", "CPF9802", "CPF9812", "CPF9837", "CPF9845",
		"CPF9846", "OPT1350", "OPT1360", "OPT1460", "OPT1462", "OPT1463",
		"OPT1530", "OPT1555", "OPT1605", "OPT1640", "OPT1790", "OPT1795",
		"OPT1805", "OPT1810", "OPT1813", "OPT1815", "OPT1820", "OPT1821",
		"OPT1825", "OPT1860", "OPT1861", "OPT1862", "OPT1863", "OPT1872",
		"OPT2001", "OPT2004", "OPT2005", "OPT2006", "OPT2007", "OPT2008",
		"OPT2009", "OPT2010", "OPT2015", "OPT2028", "OPT2029", "OPT2040",
		"OPT2301", "OPT2420", "OPT2422", "OPT7740" })
public class QWCCCRVC {

	@Entry
	public void main(@DataDef() DataArea dataArea,
			@DataDef(length = 1) QCharacter type, @DataDef() Length length,
			@DataDef(length = 1, varying = true) QCharacter initialValue,
			@DataDef() RemoteDataArea remoteDataArea,
			@DataDef(length = 8) QCharacter remoteLocation,
			@DataDef(length = 18) QCharacter relationalDatabase,
			@DataDef(length = 10) QCharacter aPPCDeviceDescription,
			@DataDef(length = 8) QCharacter localLocation,
			@DataDef(length = 8) QCharacter mode,
			@DataDef(length = 8) QCharacter remoteNetworkIdentifier,
			@DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 10) QCharacter authority) {
	}

	public class DataArea extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter dataArea;
		@DataDef(length = 10)
		public QCharacter library;
	}

	public static class Length extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef()
		public QBinary length;
		@DataDef()
		public QBinary decimalPositions;
	}

	public class RemoteDataArea extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter remoteDataArea;
		@DataDef(length = 10)
		public QCharacter library;
	}
}
