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

@Program(name = "QLIRNOBJ", messages = { "CPFA030", "CPFB8ED", "CPF0601",
		"CPF0602", "CPF0605", "CPF0610", "CPF0678", "CPF1763", "CPF180B",
		"CPF2105", "CPF2110", "CPF2111", "CPF2112", "CPF2113", "CPF2114",
		"CPF2132", "CPF2136", "CPF2139", "CPF2140", "CPF2150", "CPF2151",
		"CPF2160", "CPF2164", "CPF2166", "CPF2173", "CPF2176", "CPF218C",
		"CPF2182", "CPF2189", "CPF2190", "CPF22BC", "CPF2451", "CPF2512",
		"CPF2691", "CPF2692", "CPF2693", "CPF2694", "CPF2696", "CPF320B",
		"CPF3201", "CPF3202", "CPF3203", "CPF322D", "CPF3220", "CPF323C",
		"CPF323D", "CPF324C", "CPF3245", "CPF326A", "CPF327F", "CPF329D",
		"CPF3323", "CPF3330", "CPF3353", "CPF3375", "CPF3376", "CPF3467",
		"CPF3469", "CPF5702", "CPF7003", "CPF8D05", "CPF88C4", "CPF9801",
		"CPF9803", "CPF9807", "CPF9808", "CPF9809", "CPF9814", "CPF9825",
		"CPF9830", "CPF9833", "CPF9876" })
public class QLIRNOBJ {

	@Entry
	public void main(@DataDef() Object object,
			@DataDef(length = 7) QCharacter objectType,
			@DataDef(length = 10) QCharacter newObject,
			@DataDef(length = 1) QCharacter system,
			@DataDef(length = 10) QCharacter aSPDevice) {
	}

	public class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}
}
