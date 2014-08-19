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

@Program(name = "QLIMVOBJ", messages = { "CPFA030", "CPFB8ED", "CPF0601",
		"CPF0602", "CPF0605", "CPF0610", "CPF0678", "CPF1763", "CPF2105",
		"CPF2110", "CPF2112", "CPF2113", "CPF2114", "CPF2135", "CPF2150",
		"CPF2151", "CPF216C", "CPF2160", "CPF2173", "CPF218C", "CPF2182",
		"CPF2183", "CPF2189", "CPF2193", "CPF22BC", "CPF2451", "CPF2512",
		"CPF32CF", "CPF32C3", "CPF320B", "CPF320C", "CPF3201", "CPF3202",
		"CPF3203", "CPF322D", "CPF3220", "CPF3224", "CPF323C", "CPF323D",
		"CPF323F", "CPF3231", "CPF324B", "CPF324C", "CPF3245", "CPF325D",
		"CPF327C", "CPF327E", "CPF329D", "CPF3323", "CPF3330", "CPF3353",
		"CPF3373", "CPF3374", "CPF3467", "CPF3469", "CPF7003", "CPF7010",
		"CPF7014", "CPF9807", "CPF9808", "CPF9814", "CPF9825", "CPF9827",
		"CPF9833", "CPF9876", "OPT7740" })
public class QLIMVOBJ {

	@Entry
	public void main(@DataDef() Object object,
			@DataDef(length = 7) QCharacter objectType,
			@DataDef(length = 10) QCharacter toLibrary,
			@DataDef(length = 10) QCharacter fromASPDevice,
			@DataDef(length = 10) QCharacter toASPDevice) {
	}

	public class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}
}
