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
import org.asup.il.data.QDecimal;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QLIRTVOB", messages = { "CPFB8ED", "CPF2115", "CPF2150",
		"CPF2151", "CPF2173", "CPF218C", "CPF218D", "CPF2451", "CPF3202",
		"CPF3203", "CPF36F7", "CPF37A5", "CPF37B8", "CPF37C2", "CPF3770",
		"CPF3773", "CPF3796", "CPF38A2", "CPF38A6", "CPF3805", "CPF3807",
		"CPF3812", "CPF384F", "CPF3867", "CPF3868", "CPF3871", "CPF3872",
		"CPF5729", "CPF980B", "CPF9801", "CPF9802", "CPF9803", "CPF9807",
		"CPF9808", "CPF9809", "CPF9810", "CPF9811", "CPF9812", "CPF9814",
		"CPF9820", "CPF9821", "CPF9822", "CPF9825", "CPF9829", "CPF9830",
		"CPF9831", "CPF9833", "CPF9876", "OPT1498", "OPT1502", "OPT1605" })
public class QLIRTVOB {

	@Entry
	public void main(@DataDef() Object object,
			@DataDef(length = 7) QCharacter objectType,
			@DataDef() ASPDevice aSPDevice,
			@DataDef(length = 10) QCharacter cLVarForRTNLIB10,
			@DataDef(length = 10) QCharacter cLVarForOBJATR10,
			@DataDef(length = 10) QCharacter cLVarForUSRDFNATR10,
			@DataDef(length = 50) QCharacter cLVarForTEXT50,
			@DataDef(length = 10) QCharacter cLVarForOWNER10,
			@DataDef(length = 10) QCharacter cLVarForPGP10,
			@DataDef(precision = 2) QDecimal cLVarForASP20,
			@DataDef(precision = 5) QDecimal cLVarForLIBASP50,
			@DataDef(length = 10) QCharacter cLVarForOBJASPDEV10,
			@DataDef(length = 10) QCharacter cLVarForOBJASPGRP10,
			@DataDef(length = 10) QCharacter cLVarForLIBASPDEV10,
			@DataDef(length = 10) QCharacter cLVarForLIBASPGRP10,
			@DataDef(length = 1) QCharacter cLVarForOVFASP1,
			@DataDef(length = 13) QCharacter cLVarForCRTDATE13,
			@DataDef(length = 13) QCharacter cLVarForCHGDATE13,
			@DataDef(length = 13) QCharacter cLVarForSAVDATE13,
			@DataDef(length = 13) QCharacter cLVarForSAVACTDATE13,
			@DataDef(length = 13) QCharacter cLVarForRSTDATE13,
			@DataDef(length = 10) QCharacter cLVarForCRTUSER10,
			@DataDef(length = 8) QCharacter cLVarForCRTSYSTEM8,
			@DataDef(length = 2) QCharacter cLVarForOBJDMN2,
			@DataDef(length = 1) QCharacter cLVarForUSEUPD1,
			@DataDef(length = 7) QCharacter cLVarForUSEDATE7,
			@DataDef(precision = 5) QDecimal cLVarForUSECOUNT50,
			@DataDef(length = 7) QCharacter cLVarForRESETDATE7,
			@DataDef(length = 10) QCharacter cLVarForSTG10,
			@DataDef(length = 1) QCharacter cLVarForCPR1,
			@DataDef(precision = 15) QDecimal cLVarForSIZE150,
			@DataDef(precision = 15) QDecimal cLVarForSPCSIZE150,
			@DataDef(length = 1) QCharacter cLVarForSPCALIGN1,
			@DataDef(precision = 15) QDecimal cLVarForSAVSIZE150,
			@DataDef(length = 10) QCharacter cLVarForSAVCMD10,
			@DataDef(precision = 4) QDecimal cLVarForSAVSEQNBR40,
			@DataDef(precision = 10) QDecimal cLVarForSAVLRGSEQ100,
			@DataDef(length = 71) QCharacter cLVarForSAVVOL71,
			@DataDef(length = 10) QCharacter cLVarForSAVDEV10,
			@DataDef(length = 10) QCharacter cLVarForSAVF10,
			@DataDef(length = 10) QCharacter cLVarForSAVFLIB10,
			@DataDef(length = 17) QCharacter cLVarForSAVLABEL17,
			@DataDef(length = 10) QCharacter cLVarForSRCF10,
			@DataDef(length = 10) QCharacter cLVarForSRCFLIB10,
			@DataDef(length = 10) QCharacter cLVarForSRCMBR10,
			@DataDef(length = 13) QCharacter cLVarForSRCDATE13,
			@DataDef(length = 9) QCharacter cLVarForSYSLVL9,
			@DataDef(length = 16) QCharacter cLVarForCOMPILER16,
			@DataDef(length = 8) QCharacter cLVarForOBJLVL8,
			@DataDef(length = 1) QCharacter cLVarForALWAPICHG1,
			@DataDef(length = 1) QCharacter cLVarForAPICHG1,
			@DataDef(length = 1) QCharacter cLVarForUSRCHG1,
			@DataDef(length = 16) QCharacter cLVarForLICPGM16,
			@DataDef(length = 10) QCharacter cLVarForPTF10,
			@DataDef(length = 10) QCharacter cLVarForAPAR10,
			@DataDef(length = 10) QCharacter cLVarForOBJAUD10,
			@DataDef(length = 1) QCharacter cLVarForOBJSIG1,
			@DataDef(length = 1) QCharacter cLVarForSYSSIG1,
			@DataDef(length = 1) QCharacter cLVarForMLTSIG1,
			@DataDef(length = 1) QCharacter cLVarForJRNSTS1,
			@DataDef(length = 10) QCharacter cLVarForJRN10,
			@DataDef(length = 10) QCharacter cLVarForJRNLIB10,
			@DataDef(length = 1) QCharacter cLVarForJRNIMG1,
			@DataDef(length = 1) QCharacter cLVarForJRNOMTE1,
			@DataDef(length = 13) QCharacter cLVarForJRNSTRDATE13,
			@DataDef(length = 10) QCharacter cLVarForSTRJRNRCV10,
			@DataDef(length = 10) QCharacter cLVarForJRNRCVLIB10,
			@DataDef(length = 10) QCharacter cLVarForRCVLIBASP10,
			@DataDef(length = 10) QCharacter cLVarForRCVLIBGRP10) {
	}

	public class Object extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}

	public class ASPDevice extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}
}
