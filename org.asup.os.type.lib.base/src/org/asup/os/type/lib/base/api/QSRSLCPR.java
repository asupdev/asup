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

import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QEnum;
import org.asup.il.data.QList;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;

@Program(name = "QSRSLCPR", messages = { "CPFB8ED", "CPF37AB", "CPF37AC",
		"CPF37BC", "CPF37BD", "CPF37BE", "CPF37B1", "CPF37B4", "CPF37B5",
		"CPF37B7", "CPF37B9", "CPF37C7", "CPF3701", "CPF3703", "CPF3708",
		"CPF3709", "CPF3727", "CPF3728", "CPF3730", "CPF3731", "CPF3733",
		"CPF3735", "CPF3738", "CPF3749", "CPF3751", "CPF3767", "CPF3768",
		"CPF377D", "CPF377E", "CPF377F", "CPF3770", "CPF3771", "CPF3777",
		"CPF378A", "CPF378C", "CPF378E", "CPF3781", "CPF3782", "CPF3785",
		"CPF3789", "CPF379E", "CPF3793", "CPF3794", "CPF3797", "CPF38A2",
		"CPF38A3", "CPF38A4", "CPF380B", "CPF3812", "CPF3815", "CPF3818",
		"CPF384E", "CPF3871", "CPF388B", "CPF3892", "CPF3894", "CPF5729",
		"CPF9809", "CPF9812", "CPF9814", "CPF9820", "CPF9822", "CPF9825",
		"CPF9830", "CPF9833", "CPF9876", "OPT1332" })
public class QSRSLCPR {
	@Entry
	public void main(
			@DataDef(dimension = "300") QList<QEnum<?, ?>> library,
			@DataDef(dimension = "4") QList<QEnum<?, ?>> device,
			@DataDef(dimension = "75") QList<QEnum<?, ?>> volumeIdentifier,
			QEnum<SequenceNumber, QBinary> sequenceNumber,
			@DataDef(length = 17) QEnum<Label, QCharacter> label,
			QEnum<FileExpirationDate, QDatetime> fileExpirationDate,
			@DataDef(length = 1) QEnum<EndOfMediaOption, QCharacter> endOfMediaOption,
			@DataDef(length = 10) QEnum<StartingLibrary, QCharacter> startingLibrary,
			SaveFile saveFile,
			MediaDefinition mediaDefinition,
			@DataDef(length = 256) QCharacter opticalFile,
			@DataDef(length = 1) QEnum<UseOptimumBlock, QCharacter> useOptimumBlock,
			@DataDef(length = 6) QEnum<TargetRelease, QCharacter> targetRelease,
			@DataDef(length = 1) QEnum<UpdateHistory, QCharacter> updateHistory,
			@DataDef(length = 1) QEnum<Clear, QCharacter> clear,
			@DataDef(length = 1) QEnum<ObjectPreCheck, QCharacter> objectPreCheck,
			@DataDef(length = 1) QEnum<SaveActive, QCharacter> saveActive,
			SaveActiveWaitTime saveActiveWaitTime,
			SaveActiveMessageQueue saveActiveMessageQueue,
			@DataDef(length = 10) QEnum<SynchronizationID, QCharacter> synchronizationID,
			@DataDef(length = 1) QEnum<SaveAccessPaths, QCharacter> saveAccessPaths,
			@DataDef(length = 1) QEnum<SaveFileData, QCharacter> saveFileData,
			QEnum<SpooledFileData, QBinary> spooledFileData,
			@DataDef(length = 1) QEnum<QueueData, QCharacter> queueData,
			QEnum<PrivateAuthorities, QBinary> privateAuthorities,
			@DataDef(length = 1) QEnum<Storage, QCharacter> storage,
			@DataDef(length = 1) QEnum<DataCompression, QCharacter> dataCompression,
			@DataDef(length = 1) QEnum<DataCompaction, QCharacter> dataCompaction,
			@DataDef(dimension = "300") QList<QEnum<?, ?>> librariesToOmit,
			@DataDef(dimension = "300") QList<ObjectsToOmit> objectsToOmit,
			@DataDef(length = 10) QEnum<ASPDevice, QCharacter> aSPDevice,
			@DataDef(length = 1) QEnum<Output, QCharacter> output,
			FileToReceiveOutput fileToReceiveOutput,
			OutputMemberOption outputMemberOptions,
			@DataDef(length = 1) QEnum<TypeOfOutputInformation, QCharacter> typeOfOutputInformation,
			CommandUserSpace commandUserSpace) {
	}

	public static enum SequenceNumber {
		@Special(value = "-3")
		END, OTHER
	}

	public static enum Label {
		@Special(value = "*LIB")
		LIB, OTHER
	}

	public static enum FileExpirationDate {
		@Special(value = "0999999")
		PERM, OTHER
	}

	public static enum EndOfMediaOption {
		@Special(value = "X'40'")
		REWIND, @Special(value = "X'00'")
		LEAVE, @Special(value = "X'80'")
		UNLOAD
	}

	public static enum StartingLibrary {
		@Special(value = "*FIRST")
		FIRST, OTHER
	}

	public static class SaveFile extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QEnum<Library, QCharacter> library;

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB   ")
			CURLIB, OTHER
		}
	}

	public static class MediaDefinition extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QCharacter library;
	}

	public static enum UseOptimumBlock {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum TargetRelease {
		@Special(value = "C")
		CURRENT, @Special(value = "P")
		PRV, @Special(value = "V5R3M0")
		V5R3M0, @Special(value = "P")
		V5R4M0, @Special(value = "C")
		V6R1M0
	}

	public static enum UpdateHistory {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum Clear {
		@Special(value = "N")
		NONE, @Special(value = "Y")
		ALL, @Special(value = "A")
		AFTER, @Special(value = "R")
		REPLACE
	}

	public static enum ObjectPreCheck {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum SaveActive {
		@Special(value = "N")
		NO, @Special(value = "L")
		LIB, @Special(value = "R")
		SYNCLIB, @Special(value = "S")
		SYSDFN
	}

	public static class SaveActiveWaitTime extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public QEnum<ObjectLocks, QBinary> objectLocks;
		public QEnum<PendingRecordChanges, QBinary> pendingRecordChanges;
		public QEnum<OtherPendingChanges, QBinary> otherPendingChanges;

		public static enum OtherPendingChanges {
			@Special(value = "-2")
			LOCKWAIT, @Special(value = "-1")
			NOMAX, OTHER
		}

		public static enum PendingRecordChanges {
			@Special(value = "-2")
			LOCKWAIT, @Special(value = "-3")
			NOCMTBDY, @Special(value = "-1")
			NOMAX, OTHER
		}

		public static enum ObjectLocks {
			@Special(value = "-1")
			NOMAX, OTHER
		}
	}

	public static class SaveActiveMessageQueue extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<Name, QCharacter> name;
		@DataDef(length = 10)
		public QCharacter library;

		public static enum Name {
			@Special(value = "*NONE")
			NONE, @Special(value = "*WRKSTN")
			WRKSTN, OTHER
		}
	}

	public static enum SynchronizationID {
		@Special(value = "*NONE")
		NONE, OTHER
	}

	public static enum SaveAccessPaths {
		@Special(value = "S")
		SYSVAL, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum SaveFileData {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum SpooledFileData {
		@Special(value = "0")
		NONE, @Special(value = "1")
		ALL
	}

	public static enum QueueData {
		@Special(value = "N")
		NONE, @Special(value = "D")
		DTAQ
	}

	public static enum PrivateAuthorities {
		@Special(value = "0")
		NO, @Special(value = "1")
		YES
	}

	public static enum Storage {
		@Special(value = "K")
		KEEP, @Special(value = "F")
		FREE
	}

	public static enum DataCompression {
		@Special(value = "D")
		DEV, @Special(value = "N")
		NO, @Special(value = "Y")
		YES, @Special(value = "L")
		LOW, @Special(value = "M")
		MEDIUM, @Special(value = "H")
		HIGH
	}

	public static enum DataCompaction {
		@Special(value = "D")
		DEV, @Special(value = "N")
		NO
	}

	public static class ObjectsToOmit extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		public Object object;
		@DataDef(length = 7)
		public QEnum<ObjectType, QCharacter> objectType;

		public static class Object extends QDataStructDelegator {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 10)
			public QEnum<Name, QCharacter> name;
			@DataDef(length = 10)
			public QEnum<Library, QCharacter> library;

			public static enum Name {
				@Special(value = "*NONE")
				NONE, @Special(value = "*ALL")
				ALL, OTHER
			}

			public static enum Library {
				@Special(value = "*ALL")
				ALL, OTHER
			}
		}

		public static enum ObjectType {
			@Special(value = "*ALL")
			ALL, OTHER
		}
	}

	public static enum ASPDevice {
		@Special(value = "*")
		TERM_STAR, @Special(value = "*SYSBAS")
		SYSBAS, @Special(value = "*CURASPGRP")
		CURASPGRP, OTHER
	}

	public static enum Output {
		@Special(value = "N")
		NONE, @Special(value = "L")
		PRINT, @Special(value = "F")
		OUTFILE
	}

	public static class FileToReceiveOutput extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QEnum<Library, QCharacter> library;

		public static enum Library {
			@Special(value = "*LIBL")
			LIBL, @Special(value = "*CURLIB   ")
			CURLIB, OTHER
		}
	}

	public static class OutputMemberOption extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<MemberToReceiveOutput, QCharacter> memberToReceiveOutput;
		@DataDef(length = 1)
		public QEnum<ReplaceOrAddRecords, QCharacter> replaceOrAddRecords;

		public static enum MemberToReceiveOutput {
			@Special(value = "*FIRST")
			FIRST, OTHER
		}

		public static enum ReplaceOrAddRecords {
			@Special(value = "R")
			REPLACE, @Special(value = "A")
			ADD
		}
	}

	public static enum TypeOfOutputInformation {
		@Special(value = "O")
		OBJ, @Special(value = "L")
		LIB, @Special(value = "M")
		MBR, @Special(value = "E")
		ERR
	}

	public static class CommandUserSpace extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QCharacter library;
	}
}
