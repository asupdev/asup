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

import org.asup.il.data.QList;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;

@Program(name = "QLIDSLIB")
public class QLIDSLIB {
	@Entry
	public void main(@DataDef(dimension = "15") QList<QCharacter> library,
			@DataDef(length = 10) QEnum<ASPDevice, QCharacter> aSPDevice,
			@DataDef(length = 1) QEnum<Output, QCharacter> output) {
	}

	public static enum ASPDevice {
		@Special(value = "*")
		TERM_STAR, @Special(value = "*ALLAVL")
		ALLAVL, @Special(value = "*CURASPGRP")
		CURASPGRP, @Special(value = "*SYSBAS")
		SYSBAS, OTHER
	}

	public static enum Output {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}
}
