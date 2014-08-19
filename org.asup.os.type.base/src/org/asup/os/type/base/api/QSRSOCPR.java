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

@Program(name = "QSRSOCPR", messages = { "CPFB8ED", "CPF37AB", "CPF37AC",
		"CPF37BC", "CPF37BD", "CPF37BE", "CPF37B1", "CPF37B4", "CPF37B5",
		"CPF37B7", "CPF37B9", "CPF37C7", "CPF3701", "CPF3702", "CPF3703",
		"CPF3708", "CPF3709", "CPF3727", "CPF3728", "CPF3730", "CPF3731",
		"CPF3733", "CPF3735", "CPF3738", "CPF3747", "CPF3749", "CPF3767",
		"CPF3768", "CPF377D", "CPF377E", "CPF377F", "CPF3770", "CPF3771",
		"CPF3774", "CPF3778", "CPF378A", "CPF378C", "CPF378E", "CPF3781",
		"CPF3782", "CPF3789", "CPF379E", "CPF3793", "CPF3794", "CPF3797",
		"CPF38A2", "CPF38A3", "CPF38A4", "CPF380B", "CPF3812", "CPF3815",
		"CPF384E", "CPF3867", "CPF3868", "CPF3871", "CPF388B", "CPF3892",
		"CPF3894", "CPF5729", "CPF9809", "CPF9812", "CPF9814", "CPF9820",
		"CPF9822", "CPF9825", "CPF9833", "CPF9876", "OPT1332" })
public class QSRSOCPR {

	@Entry
	public void main(@DataDef(dimension = "300") QList<QCharacter> objects,
			@DataDef(dimension = "300") QList<QCharacter> library,
			@DataDef(dimension = "4") QList<QCharacter> device,
			@DataDef(dimension = "300") QList<QCharacter> objectTypes,
			@DataDef(dimension = "75") QList<QCharacter> volumeIdentifier,
			@DataDef() QBinary sequenceNumber,
			@DataDef(length = 17) QCharacter label,
			@DataDef() QDatetime fileExpirationDate,
			@DataDef(length = 6) QCharacter targetRelease,
			@DataDef(length = 1) QCharacter endOfMediaOption,
			@DataDef() SaveFile saveFile,
			@DataDef() MediaDefinition mediaDefinition,
			@DataDef(length = 1) QCharacter updateHistory,
			@DataDef(length = 1) QCharacter clear,
			@DataDef(length = 1) QCharacter objectPreCheck,
			@DataDef(length = 1) QCharacter saveActive,
			@DataDef() SaveActiveWaitTime saveActiveWaitTime,
			@DataDef() SaveActiveMessageQueue saveActiveMessageQueue,
			@DataDef(length = 10) QCharacter synchronizationID,
			@DataDef(dimension = "50") QList<FileMember> fileMember,
			@DataDef(length = 1) QCharacter saveAccessPaths,
			@DataDef(length = 1) QCharacter saveFileData,
			@DataDef() QBinary spooledFileData,
			@DataDef(length = 1) QCharacter queueData,
			@DataDef() QBinary privateAuthorities,
			@DataDef(length = 1) QCharacter storage,
			@DataDef(length = 1) QCharacter dataCompression,
			@DataDef(length = 1) QCharacter dataCompaction,
			@DataDef(dimension = "300") QList<QCharacter> librariesToOmit,
			@DataDef(dimension = "300") QList<ObjectsToOmit> objectsToOmit,
			@DataDef(length = 10) QCharacter aSPDevice,
			@DataDef(length = 1) QCharacter output,
			@DataDef() FileToReceiveOutput fileToReceiveOutput,
			@DataDef() OutputMemberOptions outputMemberOptions,
			@DataDef(length = 1) QCharacter typeOfOutputInformation,
			@DataDef(length = 256) QCharacter opticalFile,
			@DataDef(length = 1) QCharacter useOptimumBlock,
			@DataDef() CommandUserSpace commandUserSpace) {
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

	public class SaveActiveWaitTime extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef()
		public QBinary field_0;
		@DataDef()
		public QBinary field_1;
		@DataDef()
		public QBinary field_2;
	}

	public class SaveActiveMessageQueue extends QDataStructDelegator {
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

	public class ObjectsToOmit extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef()
		public QStruct field_0;
		@DataDef(length = 7)
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

	public class CommandUserSpace extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter field_0;
		@DataDef(length = 10)
		public QCharacter field_1;
	}
}
