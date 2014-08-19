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

@Program(name = "QLICHGOB", messages = { "CPF2105", "CPF2110", "CPF2113",
		"CPF2114", "CPF2123", "CPF2150", "CPF2151", "CPF2176", "CPF2182",
		"CPF2189", "CPF2195", "CPF2196", "CPF2198", "CPF2451", "CPF36F7",
		"CPF70E4", "CPF70E5", "CPF70E7", "CPF70F1", "CPF70F5", "CPF70F6",
		"CPF70F8", "CPF7003", "CPF7004", "CPF701A", "CPF701B", "CPF7011",
		"CPF7013", "CPF7015", "CPF7017", "CPF7018", "CPF704E", "CPF708D",
		"CPF708E", "CPF708F", "CPF709F", "CPF7304", "CPF8127", "CPF8176",
		"CPF9801", "CPF9802", "CPF9803", "CPF9804", "CPF9806", "CPF9810",
		"CPF9820", "CPF9825", "CPF9830", "CPF9873", "CPF9875" })
public class QLICHGOB {

	@Entry
	public void main(@DataDef() Object object,
			@DataDef(length = 7) QCharacter objectType,
			@DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 1) QCharacter daysUsedCount) {
	}

	public class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}
}
