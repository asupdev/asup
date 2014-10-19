/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.os.core.base.api;

import org.asup.fw.core.annotation.ToDo;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;

@Program(name = "QWCCRCRC")
public class ResourceReclaimer {

	public @Entry void main(
			@ToDo @DataDef(length = 1) QEnum<ProgramLevelEnum, QCharacter> programLevel,
			@ToDo @DataDef(length = 1) QEnum<CloseOptionEnum, QCharacter> closeOption) {
	}

	public static enum ProgramLevelEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "C")
		CALLER
	}

	public static enum CloseOptionEnum {
		@Special(value = "N")
		NORMAL, @Special(value = "A")
		ABNORMAL
	}
}
