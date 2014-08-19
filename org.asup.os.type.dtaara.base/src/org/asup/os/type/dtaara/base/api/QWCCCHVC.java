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

@Program(name = "QWCCCHVC", messages = { "CPF101A", "CPF1015", "CPF1018",
		"CPF1019", "CPF1020", "CPF1021", "CPF1022", "CPF1026", "CPF1043",
		"CPF1044", "CPF1045", "CPF1046", "CPF1062", "CPF1063", "CPF1067",
		"CPF1072", "CPF1087", "CPF1088", "CPF1089", "CPF1138", "CPF1155",
		"CPF1162", "CPF1163", "CPF1168", "CPF1170", "CPF1192", "CPF18BE",
		"CPF180B", "CPF180C", "CPF362C", "CPF362D", "CPF3640", "CPF3660",
		"CPF3693", "CPF3931", "CPF3945", "CPF8191", "CPF8193", "CPF9845",
		"CPF9846", "CPF9899" })
public class QWCCCHVC {

	@Entry
	public void main(@DataDef() DataAreaSpecification dataAreaSpecification,
			@DataDef(length = 1, varying = true) QCharacter newValue) {
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
