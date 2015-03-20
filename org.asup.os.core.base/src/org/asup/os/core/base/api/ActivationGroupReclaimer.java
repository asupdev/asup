package org.asup.os.core.base.api;

import org.asup.fw.core.annotation.ToDo;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;

@Program(name = "QWVCCDLA")
public class ActivationGroupReclaimer {

	public static enum QCPFMSG {
		CPF1653, CPF1654
	}

	public @Entry void main(
			@ToDo @DataDef(length = 10) QEnum<ACTIVATIONGROUPEnum, QCharacter> activationGroup,
			@ToDo @DataDef(length = 1) QEnum<CLOSEOPTIONEnum, QCharacter> closeOption) {
	}

	public static enum ACTIVATIONGROUPEnum {
		ELIGIBLE, OTHER
	}

	public static enum CLOSEOPTIONEnum {
		@Special(value = "N")
		NORMAL, @Special(value = "A")
		ABNORMAL
	}

}
