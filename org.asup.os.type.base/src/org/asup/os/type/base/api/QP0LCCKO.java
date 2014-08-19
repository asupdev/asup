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

import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QP0LCCKO", messages = { "CPFA0AA", "CPFA0AB", "CPFA0AD",
		"CPFA0A1", "CPFA0A3", "CPFA0A7", "CPFA0A9", "CPFA0BF", "CPFA0B2",
		"CPFA0DA", "CPFA09C", "CPFA09D", "CPFA09E", "CPFA1C5", "CPF2203",
		"CPF2204", "CPF2209", "CPF2213", "CPF2225", "CPF2228", "CPF223F",
		"CPF224A", "CPF2242", "CPF2244", "CPF225A", "CPF2259", "CPF2260",
		"CPF2261", "CPF2262", "CPF2264", "CPF2269", "CPF2272", "CPF2291",
		"CPF2292", "CPF2293", "CPF708F", "CPF709F", "CPF9801", "CPF9802",
		"CPF9803", "CPF9804", "CPF9806", "CPF9810", "CPF9820", "CPF9825",
		"CPF9830", "CPF9873", "CPF9875" })
public class QP0LCCKO {

	@Entry
	public void main(@DataDef(length = 5000) QCharacter object,
			@DataDef(length = 10) QCharacter directorySubtree) {
	}
}
