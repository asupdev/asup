/** 
 * 
Copyright (c) 2012, 2014 Sme.UP and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.asup.os.type.dtaara.base.api;

import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QCLRTVDA", messages = { "CPFB8ED", "CPF0811", "CPF0812",
		"CPF0813", "CPF101A", "CPF1015", "CPF1016", "CPF1021", "CPF1022",
		"CPF1043", "CPF1044", "CPF1045", "CPF1046", "CPF1063", "CPF1067",
		"CPF1072", "CPF1087", "CPF1088", "CPF1089", "CPF180B", "CPF37A5",
		"CPF37B8", "CPF37C2", "CPF3770", "CPF3773", "CPF3784", "CPF3791",
		"CPF3793", "CPF3794", "CPF3796", "CPF38A2", "CPF38A6", "CPF3805",
		"CPF3807", "CPF3812", "CPF384F", "CPF3867", "CPF3868", "CPF3871",
		"CPF3872", "CPF5729", "CPF9809", "CPF9812", "CPF9814", "CPF9820",
		"CPF9822", "CPF9825", "CPF9829", "CPF9830", "CPF9833", "CPF9849",
		"CPF9876", "CPF9899", "OPT1498", "OPT1502", "OPT1605" })
public class QCLRTVDA {

	@Entry
	public void main(
			@DataDef() DataAreaSpecification dataAreaSpecification,
			@DataDef(length = 1, varying = true) QCharacter cLVariableForReturnedValue) {
	}

	public class DataAreaSpecification extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef()
		public DataArea dataArea;
		@DataDef()
		public SubstringSpecification substringSpecifications;

		public class SubstringSpecification extends QDataStructDelegator {
			private static final long serialVersionUID = 1L;
			@DataDef()
			public QBinary substringStartingPosition;
			@DataDef()
			public QBinary substringLength;
		}

		public class DataArea extends QDataStructDelegator {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 10)
			public QCharacter dataArea;
			@DataDef(length = 10)
			public QCharacter library;
		}
	}
}
