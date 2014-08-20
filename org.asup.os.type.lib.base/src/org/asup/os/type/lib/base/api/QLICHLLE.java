/** 
 * 
Copyright (c) 2012, 2014 Sme.UP and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.asup.os.type.lib.base.api;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;

@Program(name = "QLICHLLE", messages = { "CPFA0AB", "CPFA0DD", "CPFA0D4",
		"CPFA08B", "CPFA08C", "CPFA085", "CPFA086", "CPFA087", "CPFA088",
		"CPFA089", "CPFA09C", "CPFA09D", "CPFA09E", "CPFA091", "CPFA092",
		"CPFA094", "CPFBC50", "CPF2106", "CPF2110", "CPF2113", "CPF2133",
		"CPF2134", "CPF2137", "CPF2176", "CPF2182", "CPF22F0", "CPF223A",
		"CPF2289", "CPF2290", "CPF3BF6", "CPF362C", "CPF362D", "CPF3640",
		"CPF3660", "CPF3693", "CPF3931", "CPF3945", "CPF8191", "CPF8193",
		"CPF9845", "CPF9846" })
public class QLICHLLE {
	@Entry
	public void main(
			@DataDef(length = 10) QEnum<CurrentLibrary, QCharacter> currentLibrary) {
	}

	public static enum CurrentLibrary {
		@Special(value = "X'40404040404040404040'")
		CRTDFT, OTHER
	}
}
