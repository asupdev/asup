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

@Program(name = "QLICKOBJ", messages = { "CPF22DF", "CPF22EB", "CPF22E1",
		"CPF22F1", "CPF22F3", "CPF22F5", "CPF2203", "CPF2204", "CPF2209",
		"CPF2213", "CPF2225", "CPF2228", "CPF223F", "CPF224A", "CPF2242",
		"CPF2244", "CPF225A", "CPF2259", "CPF2260", "CPF2261", "CPF2262",
		"CPF2264", "CPF2269", "CPF2272", "CPF2291", "CPF2292", "CPF2293",
		"CPF708F", "CPF709F", "CPF9801", "CPF9802", "CPF9803", "CPF9804",
		"CPF9806", "CPF9810", "CPF9815", "CPF9820", "CPF9825", "CPF9830",
		"CPF9873", "CPF9875", "CPF9899" })
public class QLICKOBJ {

	@Entry
	public void main(@DataDef() Object object,
			@DataDef(length = 7) QCharacter objectType,
			@DataDef(length = 10) QCharacter memberIfDataBaseFile,
			@DataDef(dimension = "10") QList<QCharacter> authority) {
	}

	public class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}
}
