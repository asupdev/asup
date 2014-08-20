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

@Program(name = "QLICHLBL", messages = { "CPFA0B2", "CPFA0B7", "CPFB8ED",
		"CPF1641", "CPF1645", "CPF1646", "CPF2103", "CPF2104", "CPF2106",
		"CPF2110", "CPF2113", "CPF2118", "CPF2128", "CPF2176", "CPF2182",
		"CPF24A8", "CPF24B3", "CPF2531", "CPF2532", "CPF2548", "CPF2551",
		"CPF3220", "CPF3224", "CPF323C", "CPF323D", "CPF323F", "CPF3231",
		"CPF324B", "CPF324C", "CPF3245", "CPF325D", "CPF327C", "CPF327E",
		"CPF329D", "CPF33A7", "CPF33A8", "CPF33A9", "CPF33C2", "CPF33C3",
		"CPF33C4", "CPF33C5", "CPF33C6", "CPF33C7", "CPF33D0", "CPF33D1",
		"CPF33F0", "CPF3303", "CPF3309", "CPF3323", "CPF3330", "CPF3335",
		"CPF334A", "CPF3340", "CPF3341", "CPF3342", "CPF3343", "CPF3344",
		"CPF3353", "CPF3373", "CPF3374", "CPF3401", "CPF3464", "CPF3467",
		"CPF3469", "CPF3492", "CPF36F7", "CPF7003", "CPF7010", "CPF7014",
		"CPF708E", "CPF708F", "CPF709F", "CPF8127", "CPF8176", "CPF9801",
		"CPF9802", "CPF9803", "CPF9804", "CPF9806", "CPF9807", "CPF9808",
		"CPF9810", "CPF9814", "CPF9820", "CPF9825", "CPF9827", "CPF9830",
		"CPF9833", "CPF9873", "CPF9875", "CPF9876", "CPI4304", "CPI4305",
		"CPI4306", "CPI4307", "OPT7740" })
public class QLICHLBL {
	@Entry
	public void main(@DataDef(length = 10) QCharacter library,
			@DataDef(length = 1) QEnum<Option, QCharacter> option) {
	}

	public static enum Option {
		@Special(value = "S")
		ADD, @Special(value = "T")
		REMOVE
	}
}
