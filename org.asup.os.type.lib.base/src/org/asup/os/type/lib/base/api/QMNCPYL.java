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

@Program(name = "QMNCPYL", messages = { "CPF2358", "CPF2365", "CPF2859",
		"CPF2864", "CPF2875", "CPF2883", "CPF2888", "CPF2909", "CPF2949",
		"CPF2952", "CPF2971", "CPF2972", "CPF2975", "CPF2976", "CPF3140",
		"CPF3143", "CPF3148", "CPF3150", "CPF502B", "CPF502D", "CPF502E",
		"CPF502F", "CPF5026", "CPF5029", "CPF503A", "CPF503B", "CPF503F",
		"CPF5030", "CPF5033", "CPF5034", "CPF5079", "CPF5084", "CPF5085",
		"CPF5090", "CPF5097", "CPF9212", "CPF9806", "CPF9810", "CPF9820",
		"CPF9825", "CPF9830", "CPF9873", "CPF9875" })
public class QMNCPYL {
	@Entry
	public void main(
			@DataDef(length = 10) QCharacter existingLibrary,
			@DataDef(length = 10) QCharacter newLibrary,
			@DataDef(length = 4) QEnum<CreateLibrary, QCharacter> createLibrary,
			@DataDef(length = 4) QEnum<DuplicateData, QCharacter> duplicateData,
			@DataDef(length = 4) QEnum<DuplicateConstraints, QCharacter> duplicateConstraints,
			@DataDef(length = 4) QEnum<DuplicateTriggers, QCharacter> duplicateTriggers,
			@DataDef(length = 4) QEnum<DuplicateFileIdentifiers, QCharacter> duplicateFileIdentifiers) {
	}

	public static enum CreateLibrary {
		@Special(value = "*YES")
		YES, @Special(value = "*NO")
		NO
	}

	public static enum DuplicateData {
		@Special(value = "*YES")
		YES, @Special(value = "*NO")
		NO
	}

	public static enum DuplicateConstraints {
		@Special(value = "*YES")
		YES, @Special(value = "*NO")
		NO
	}

	public static enum DuplicateTriggers {
		@Special(value = "*YES")
		YES, @Special(value = "*NO")
		NO
	}

	public static enum DuplicateFileIdentifiers {
		@Special(value = "*NO")
		NO, @Special(value = "*YES")
		YES
	}
}
