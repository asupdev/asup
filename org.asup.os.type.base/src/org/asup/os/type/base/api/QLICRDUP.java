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

import org.asup.il.data.QList;
import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QLICRDUP", messages = { "CPFB8ED", "CPF2105", "CPF2109",
		"CPF2110", "CPF2113", "CPF2116", "CPF2122", "CPF2123", "CPF2130",
		"CPF2151", "CPF2152", "CPF2155", "CPF216C", "CPF216D", "CPF2160",
		"CPF2162", "CPF2173", "CPF2176", "CPF218C", "CPF2182", "CPF2185",
		"CPF2186", "CPF9806", "CPF9814", "CPF9825", "CPF9827", "CPF9833",
		"OPT1462", "OPT1463", "OPT1530", "OPT1555", "OPT1605", "OPT1640",
		"OPT1790", "OPT1795", "OPT1805", "OPT1810", "OPT1813", "OPT1815",
		"OPT1820", "OPT1821", "OPT1825", "OPT1860", "OPT1861", "OPT1862",
		"OPT1863", "OPT1872", "OPT2001", "OPT2004", "OPT2005", "OPT2006",
		"OPT2007", "OPT2008", "OPT2009", "OPT2010", "OPT2015", "OPT2028",
		"OPT2029", "OPT2040", "OPT2301", "OPT2420", "OPT2422", "OPT7740" })
public class QLICRDUP {

	@Entry
	public void main(@DataDef(length = 10) QCharacter fromObject,
			@DataDef(length = 10) QCharacter fromLibrary,
			@DataDef(dimension = "57") QList<QCharacter> objectType,
			@DataDef(length = 10) QCharacter toLibrary,
			@DataDef(length = 10) QCharacter newObject,
			@DataDef(length = 10) QCharacter fromASPDevice,
			@DataDef(length = 10) QCharacter toASPDevice,
			@DataDef(length = 1) QCharacter duplicateData,
			@DataDef(length = 1) QCharacter duplicateConstraints,
			@DataDef(length = 1) QCharacter duplicateTriggers,
			@DataDef(length = 1) QCharacter duplicateFileIdentifiers) {
	}
}
