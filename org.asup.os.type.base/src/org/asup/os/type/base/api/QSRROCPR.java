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

import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QList;
import org.asup.il.data.QStruct;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QSRROCPR", messages = { "CPFB8ED", "CPF37A5", "CPF37B8",
		"CPF37C2", "CPF370C", "CPF3705", "CPF3706", "CPF3707", "CPF3709",
		"CPF3727", "CPF3728", "CPF3730", "CPF3731", "CPF3733", "CPF3738",
		"CPF3739", "CPF374C", "CPF3743", "CPF3748", "CPF3767", "CPF3768",
		"CPF3769", "CPF3770", "CPF3773", "CPF3780", "CPF3781", "CPF3782",
		"CPF3783", "CPF3784", "CPF3791", "CPF3793", "CPF3794", "CPF3796",
		"CPF38A2", "CPF38A6", "CPF3805", "CPF3807", "CPF3812", "CPF384F",
		"CPF3867", "CPF3868", "CPF3871", "CPF3872", "CPF5729", "CPF9809",
		"CPF9812", "CPF9814", "CPF9820", "CPF9822", "CPF9825", "CPF9829",
		"CPF9830", "CPF9833", "CPF9876", "OPT1498", "OPT1502", "OPT1605" })
public class QSRROCPR {

	@Entry
	public void main(@DataDef(dimension = "300") QList<QCharacter> objects,
			@DataDef(dimension = "300") QList<QCharacter> savedLibrary,
			@DataDef(dimension = "4") QList<QCharacter> device,
			@DataDef(dimension = "74") QList<QCharacter> objectTypes,
			@DataDef(dimension = "75") QList<QCharacter> volumeIdentifier,
			@DataDef() QBinary sequenceNumber,
			@DataDef(length = 17) QCharacter label,
			@DataDef(length = 1) QCharacter endOfMediaOption,
			@DataDef() SaveFile saveFile,
			@DataDef() MediaDefinition mediaDefinition,
			@DataDef(length = 1) QCharacter option,
			@DataDef(dimension = "50") QList<FileMember> fileMember,
			@DataDef(length = 1) QCharacter dataBaseMemberOption,
			@DataDef(length = 10) QCharacter deferID,
			@DataDef() QBinary spooledFileData,
			@DataDef() QBinary privateAuthorities,
			@DataDef() QDatetime dateWhenSaved,
			@DataDef() QDatetime timeWhenSaved,
			@DataDef(dimension = "4") QList<QCharacter> allowObjectDifferences,
			@DataDef() ForceObjectConversion forceObjectConversion,
			@DataDef(length = 10) QCharacter restoreToLibrary,
			@DataDef(length = 10) QCharacter restoreToASPDevice,
			@DataDef() QBinary restoreToASPNumber,
			@DataDef(length = 1) QCharacter output,
			@DataDef() FileToReceiveOutput fileToReceiveOutput,
			@DataDef() OutputMemberOptions outputMemberOptions,
			@DataDef(length = 1) QCharacter typeOfOutputInformation,
			@DataDef(length = 256) QCharacter opticalFile,
			@DataDef(dimension = "300") QList<QCharacter> librariesToOmit,
			@DataDef(dimension = "300") QList<ObjectsToOmit> objectsToOmit) {
	}

	public class SaveFile extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}

	public class MediaDefinition extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}

	public class FileMember extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(dimension = "50")
		public QList<QStruct> field_1;
	}

	public class ForceObjectConversion extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QCharacter field_0;
		@DataDef(length = 1)
		public QCharacter field_1;
	}

	public class FileToReceiveOutput extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}

	public class OutputMemberOptions extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 1)
		public QCharacter field_1;
	}

	public class ObjectsToOmit extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef()
		public QStruct field_0;
		@DataDef(length = 7)
		public QCharacter field_1;
	}
}
