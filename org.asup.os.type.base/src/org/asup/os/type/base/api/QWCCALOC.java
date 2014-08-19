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

import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QList;
import org.asup.il.data.QStruct;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QWCCALOC", messages = { "CPF1002", "CPF1040", "CPF1085",
		"CPF9814", "CPF9825", "OPT1862", "OPT1863", "OPT2040", "OPT2301",
		"OPT2410", "OPT7740", "TCP1908", "TCP261C", "TCP2665", "TCP2666",
		"TCP8050", "TCP9509", "TCP9999" })
public class QWCCALOC {

	@Entry
	public void main(
			@DataDef(dimension = "50") QList<ObjectSpecifications> objectSpecifications,
			@DataDef() QBinary waitTime,
			@DataDef(length = 1) QCharacter lockScope,
			@DataDef(length = 1) QCharacter lockConflictAction) {
	}

	public class ObjectSpecifications extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef()
		public QStruct field_0;
		@DataDef(length = 7)
		public QCharacter field_1;
		@DataDef()
		public QBinary field_2;
		@DataDef(length = 10)
		public QCharacter field_3;
	}
}
