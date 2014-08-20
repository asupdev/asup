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
import org.asup.os.omac.annotation.Domain;
import org.asup.os.type.lib.QLibrary;

@Program(name = "QLICHGLB")
public class QLICHGLB {
	@Entry
	public void main(
			@Domain(name = QLibrary.class, restricted = false, specials = { "*CURLIB" }) @DataDef(length = 10) QCharacter library,
			@DataDef(length = 7) QEnum<LibraryType, QCharacter> libraryType,
			@DataDef(length = 50) QEnum<TextDescription, QCharacter> textDescription,
			@DataDef(length = 10) QEnum<CreateAuthority, QCharacter> createAuthority,
			@DataDef(length = 10) QEnum<CreateObjectAuditing, QCharacter> createObjectAuditing) {
	}

	public static enum LibraryType {
		@Special(value = "*SAME")
		SAME, @Special(value = "PROD")
		PROD, @Special(value = "TEST")
		TEST
	}

	public static enum TextDescription {
		@Special(value = "*SAME")
		SAME, @Special(value = "")
		BLANK, OTHER
	}

	public static enum CreateAuthority {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*CHANGE")
		CHANGE, @Special(value = "*ALL")
		ALL, @Special(value = "*USE")
		USE, @Special(value = "*EXCLUDE")
		EXCLUDE, OTHER
	}

	public static enum CreateObjectAuditing {
		@Special(value = "*SAME")
		SAME, @Special(value = "*SYSVAL")
		SYSVAL, @Special(value = "*NONE")
		NONE, @Special(value = "*USRPRF")
		USRPRF, @Special(value = "*CHANGE")
		CHANGE, @Special(value = "*ALL")
		ALL
	}
}
