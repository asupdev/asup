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
import org.asup.il.data.QDecimal;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QLIRTVLD")
public class QLIRTVLD {
	@Entry
	public void main(@DataDef(length = 10) QCharacter library,
			@DataDef(length = 10) QCharacter cLVarForTYPE10,
			@DataDef(precision = 2) QDecimal cLVarForASP20,
			@DataDef(length = 10) QCharacter cLVarForASPDEV10,
			@DataDef(length = 10) QCharacter cLVarForASPGRP10,
			@DataDef(length = 10) QCharacter cLVarForCRTAUT10,
			@DataDef(length = 10) QCharacter cLVarForCRTOBJAUD10,
			@DataDef(length = 1) QCharacter cLVarForJRNSTS1,
			@DataDef(length = 10) QCharacter cLVarForJRN10,
			@DataDef(length = 10) QCharacter cLVarForJRNLIB10,
			@DataDef(length = 1) QCharacter cLVarForJRNIMG1,
			@DataDef(length = 1) QCharacter cLVarForJRNOMTE1,
			@DataDef(length = 1) QCharacter cLVarForINHERIT1,
			@DataDef(length = 13) QCharacter cLVarForJRNSTRDATE13,
			@DataDef(length = 10) QCharacter cLVarForSTRJRNRCV10,
			@DataDef(length = 10) QCharacter cLVarForJRNRCVLIB10,
			@DataDef(length = 10) QCharacter cLVarForRCVLIBASP10,
			@DataDef(length = 10) QCharacter cLVarForRCVLIBGRP10,
			@DataDef(length = 1280) QCharacter cLVarForINHRULES1280,
			@DataDef(length = 50) QCharacter cLVarForTEXT50) {
	}
}
