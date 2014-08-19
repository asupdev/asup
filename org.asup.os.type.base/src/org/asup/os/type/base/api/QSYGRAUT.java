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

@Program(name = "QSYGRAUT", messages = { "CPF22A0", "CPF22A1", "CPF22A2",
		"CPF22A3", "CPF22A9", "CPF22DA", "CPF2207", "CPF2208", "CPF2209",
		"CPF2210", "CPF2211", "CPF2216", "CPF2223", "CPF2227", "CPF2236",
		"CPF2243", "CPF2245", "CPF2253", "CPF2254", "CPF2273", "CPF2283",
		"CPF2290", "CPF9804", "OPT1810", "OPT1815", "OPT1820", "OPT1821",
		"OPT1825", "OPT1860", "OPT1861", "OPT1862", "OPT1863", "OPT1864",
		"OPT1872", "OPT2008", "OPT2009", "OPT2010", "OPT2015", "OPT2028",
		"OPT2029", "OPT2040", "OPT2047", "OPT2050", "OPT2301", "OPT2420",
		"OPT2422", "OPT6713", "OPT7740" })
public class QSYGRAUT {

	@Entry
	public void main(@DataDef() Object object,
			@DataDef(length = 7) QCharacter objectType,
			@DataDef(dimension = "50") QList<QCharacter> users,
			@DataDef(dimension = "10") QList<QCharacter> authority,
			@DataDef(length = 10) QCharacter authorizationList,
			@DataDef() ReferenceObject referenceObject,
			@DataDef(length = 7) QCharacter referenceObjectType,
			@DataDef(length = 1) QCharacter replaceAuthority,
			@DataDef(length = 10) QCharacter aSPDevice,
			@DataDef(length = 10) QCharacter referenceASPDevice) {
	}

	public class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}

	public class ReferenceObject extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}
}
