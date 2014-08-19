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
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QSYCHAUT", messages = { "CPE3101", "CPE3408", "CPE3418",
		"CPE3474", "CPFA0AA", "CPFA0AB", "CPFA0AD", "CPFA0A2", "CPFA0A3",
		"CPFA0A4", "CPFA0A7", "CPFA0A9", "CPFA0B1", "CPFA0C1", "CPFA0DD",
		"CPFA0D4", "CPFA08B", "CPFA08C", "CPFA085", "CPFA086", "CPFA087",
		"CPFA088", "CPFA089", "CPFA09C", "CPFA09D", "CPFA09E", "CPFA091",
		"CPFA092", "CPFA094", "CPFBC50", "CPF22F0", "CPF223A", "CPF3BF6",
		"CPF362C", "CPF362D", "CPF3640", "CPF3660", "CPF3693", "CPF3931",
		"CPF3945", "CPF8191", "CPF8193", "CPF9845", "CPF9846" })
public class QSYCHAUT {

	@Entry
	public void main(@DataDef(length = 5000) QCharacter object,
			@DataDef(dimension = "50") QList<QCharacter> user,
			@DataDef(length = 10) QCharacter newDataAuthorities,
			@DataDef(dimension = "4") QList<QCharacter> newObjectAuthorities,
			@DataDef(length = 10) QCharacter authorizationList,
			@DataDef() QBinary symbolicLink,
			@DataDef(length = 10) QCharacter directorySubtree) {
	}
}
