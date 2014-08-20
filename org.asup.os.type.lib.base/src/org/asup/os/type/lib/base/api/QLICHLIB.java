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

@Program(name = "QLICHLIB")
public class QLICHLIB {
	@Entry
	public void main(
			@DataDef(dimension = "250") QList<QEnum<?, ?>> librariesForCurrentThread,
			@DataDef(length = 10) QEnum<CurrentLibrary, QCharacter> currentLibrary) {
	}

	public static enum CurrentLibrary {
		@Special(value = "*SAME")
		SAME, @Special(value = "X'40404040404040404040'")
		CRTDFT, OTHER
	}
}
