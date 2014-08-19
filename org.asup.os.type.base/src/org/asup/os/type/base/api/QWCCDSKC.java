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
import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QWCCDSKC", messages = { "CPFA092", "CPFA093", "CPFA094",
		"CPFB8ED", "CPF0919", "CPF0924", "CPF0935", "CPF0939", "CPF0948",
		"CPF095B", "CPF0950", "CPF0951", "CPF0952", "CPF0953", "CPF0958",
		"CPF0988", "CPF1F05", "CPF1F4A", "CPF1F41", "CPF1F53", "CPF1093",
		"CPF22F0", "CPF2203", "CPF2225", "CPF3285", "CPF3770", "CPF3771",
		"CPF38A2", "CPF38A3", "CPF38A4", "CPF3812", "CPF3815", "CPF384E",
		"CPF3867", "CPF3868", "CPF3871", "CPF388B", "CPF3892", "CPF3894",
		"CPF5729", "CPF9801", "CPF9802", "CPF9803", "CPF9804", "CPF9809",
		"CPF9812", "CPF9814", "CPF9820", "CPF9822", "CPF9825", "CPF9833",
		"CPF9845", "CPF9846", "CPF9847", "CPF9850", "CPF9851", "CPF9871",
		"CPF9876", "CPI8901", "CPI8902", "CPI8903", "CPI8906", "OPT1332" })
public class QWCCDSKC {

	@Entry
	public void main(@DataDef() Object object,
			@DataDef(length = 7) QCharacter objectType,
			@DataDef(length = 10) QCharacter member,
			@DataDef(length = 10) QCharacter aSPDevice,
			@DataDef(length = 1) QCharacter output) {
	}

	public class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}
}
