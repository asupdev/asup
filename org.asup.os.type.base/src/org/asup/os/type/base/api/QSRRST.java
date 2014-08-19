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
import org.asup.il.data.QList;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDatetime;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QSRRST", messages = { "CPFA0DB", "CPFA0DC", "CPF323C",
		"CPF323D", "CPF324C", "CPF3245", "CPF326A", "CPF327F", "CPF329D",
		"CPF3323", "CPF3330", "CPF3353", "CPF3375", "CPF3376", "CPF3467",
		"CPF3469", "CPF370C", "CPF3707", "CPF3727", "CPF3738", "CPF3743",
		"CPF3768", "CPF3782", "CPF3794", "CPF38A5", "CPF380D", "CPF3805",
		"CPF381E", "CPF3812", "CPF382A", "CPF382B", "CPF382C", "CPF382D",
		"CPF382F", "CPF3823", "CPF3826", "CPF3828", "CPF383A", "CPF383B",
		"CPF383C", "CPF383D", "CPF383E", "CPF3833", "CPF3834", "CPF3835",
		"CPF3839", "CPF384A", "CPF384B", "CPF384C", "CPF384F", "CPF3840",
		"CPF5702", "CPF5729", "CPF7003", "CPF8D05", "CPF88C4", "CPF9801",
		"CPF9802", "CPF9803", "CPF9807", "CPF9808", "CPF9809", "CPF9814",
		"CPF9825", "CPF9830", "CPF9833", "CPF9876", "OPT1498", "OPT1502",
		"OPT1605" })
public class QSRRST {

	@Entry
	public void main(@DataDef(dimension = "4") QList<QCharacter> device,
			@DataDef(dimension = "300") QList<Objects> objects,
			@DataDef(dimension = "300") QList<NamePattern> namePattern,
			@DataDef() QBinary directorySubtree, @DataDef() QBinary system,
			@DataDef() QDatetime dateWhenSaved,
			@DataDef() QDatetime timeWhenSaved, @DataDef() QBinary option,
			@DataDef(dimension = "3") QList<QBinary> allowObjectDifferences,
			@DataDef() ForceObjectConversion forceObjectConversion,
			@DataDef() QBinary objectID,
			@DataDef() QBinary createParentDirectories,
			@DataDef(length = 10) QCharacter parentDirectoryOwner,
			@DataDef() QBinary rebuildMountedFileSystem,
			@DataDef(dimension = "75") QList<QCharacter> volumeIdentifier,
			@DataDef(length = 17) QCharacter label,
			@DataDef() QBinary sequenceNumber,
			@DataDef(length = 1) QCharacter endOfMediaOption,
			@DataDef(length = 256) QCharacter opticalFile,
			@DataDef(length = 5000) QCharacter output,
			@DataDef() QBinary typeOfOutputInformation,
			@DataDef() QBinary privateAuthorities) {
	}

	public class Objects extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 5000)
		public QCharacter field_0;
		@DataDef(length = 1)
		public QCharacter field_1;
		@DataDef(length = 5000)
		public QCharacter field_2;
	}

	public class NamePattern extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 255)
		public QCharacter field_0;
		@DataDef(length = 1)
		public QCharacter field_1;
	}

	public class ForceObjectConversion extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef()
		public QBinary field_0;
		@DataDef()
		public QBinary field_1;
	}
}
