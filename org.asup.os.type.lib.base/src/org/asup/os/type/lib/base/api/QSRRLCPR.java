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
import org.asup.il.data.QDatetime;
import org.asup.il.data.QEnum;
import org.asup.il.data.QList;
import org.asup.il.data.QStruct;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.il.data.annotation.Special;
import org.asup.os.omac.annotation.Domain;
import org.asup.os.type.file.QFile;
import org.asup.os.type.lib.QLibrary;

@Program(name = "QSRRLCPR", messages = { "CPFB8ED", "CPF37A5", "CPF37B8",
		"CPF37C2", "CPF370C", "CPF3705", "CPF3706", "CPF3707", "CPF3709",
		"CPF372C", "CPF3727", "CPF3728", "CPF373E", "CPF3730", "CPF3731",
		"CPF3732", "CPF3733", "CPF3738", "CPF3739", "CPF3740", "CPF3743",
		"CPF3748", "CPF375F", "CPF3752", "CPF3757", "CPF3758", "CPF376B",
		"CPF3767", "CPF3768", "CPF3769", "CPF3770", "CPF3773", "CPF3779",
		"CPF378B", "CPF3780", "CPF3782", "CPF3783", "CPF3784", "CPF3785",
		"CPF3791", "CPF3793", "CPF3794", "CPF3796", "CPF38A2", "CPF38A6",
		"CPF380E", "CPF3805", "CPF3807", "CPF3812", "CPF3818", "CPF384F",
		"CPF3894", "CPF5729", "CPF9809", "CPF9812", "CPF9814", "CPF9820",
		"CPF9822", "CPF9825", "CPF9829", "CPF9830", "CPF9833", "CPF9876",
		"OPT1498", "OPT1502", "OPT1605" })
public class QSRRLCPR {
	@Entry
	public void main(
			@DataDef(dimension = "300") QList<QEnum<?, ?>> savedLibrary,
			@DataDef(dimension = "4") QList<QEnum<?, ?>> device,
			@DataDef(dimension = "75") QList<QEnum<?, ?>> volumeIdentifier,
			QEnum<SequenceNumber, QBinary> sequenceNumber,
			@DataDef(length = 17) QEnum<Label, QCharacter> label,
			@DataDef(length = 1) QEnum<EndOfMediaOption, QCharacter> endOfMediaOption,
			@DataDef(length = 10) QEnum<StartingLibrary, QCharacter> startingLibrary,
			@Domain(name = QFile.class, restricted = false) SaveFile saveFile,
			MediaDefinition mediaDefinition,
			@DataDef(length = 256) QCharacter opticalFile,
			@DataDef(dimension = "300") QList<QEnum<?, ?>> librariesToOmit,
			@DataDef(length = 1) QEnum<Option, QCharacter> option,
			@DataDef(length = 1) QEnum<DataBaseMemberOption, QCharacter> dataBaseMemberOption,
			@DataDef(length = 10) QEnum<DeferID, QCharacter> deferID,
			QEnum<SpooledFileData, QBinary> spooledFileData,
			QEnum<PrivateAuthorities, QBinary> privateAuthorities,
			QDatetime dateWhenSaved,
			QDatetime timeWhenSaved,
			@DataDef(dimension = "4") QList<QEnum<?, ?>> allowObjectDifferences,
			QEnum<ForceObjectConversion, QStruct> forceObjectConversion,
			@DataDef(length = 10) QEnum<RestoreToLibrary, QCharacter> restoreToLibrary,
			@DataDef(length = 10) QEnum<RestoreToASPDevice, QCharacter> restoreToASPDevice,
			QEnum<RestoreToASPNumber, QBinary> restoreToASPNumber,
			@DataDef(length = 1) QEnum<Output, QCharacter> output,
			@Domain(name = QFile.class, restricted = false) FileToReceiveOutput fileToReceiveOutput,
			OutputMemberOption outputMemberOptions,
			@DataDef(length = 1) QEnum<TypeOfOutputInformation, QCharacter> typeOfOutputInformation,
			@DataDef(dimension = "300") QList<ObjectsToOmit> objectsToOmit) {
	}

	public static enum SequenceNumber {
		@Special(value = "-2")
		SEARCH, OTHER
	}

	public static enum Label {
		@Special(value = "*SAVLIB")
		SAVLIB, OTHER
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
		@Domain(name = QLibrary.class, restricted = false, specials = {
				"*LIBL", "*CURLIB" })
		@DataDef(length = 10)
		public QCharacter library;
	}

	public static enum Option {
		@Special(value = "M")
		ALL, @Special(value = "N")
		NEW, @Special(value = "O")
		OLD, @Special(value = "F")
		FREE
	}

	public static enum DataBaseMemberOption {
		@Special(value = "M")
		MATCH, @Special(value = "A")
		ALL, @Special(value = "N")
		NEW, @Special(value = "O")
		OLD
	}

	public static enum DeferID {
		@Special(value = "*DFT")
		DFT, @Special(value = "*NONE")
		NONE, OTHER
	}

	public static enum SpooledFileData {
		@Special(value = "3")
		NEW, @Special(value = "0")
		NONE
	}

	public static enum PrivateAuthorities {
		@Special(value = "0")
		NO, @Special(value = "1")
		YES
	}

	public static enum ForceObjectConversion {
		@Special(value = "S")
		SYSVAL, @Special(value = "N")
		NO, OTHER
	}

	public static enum RestoreToLibrary {
		@Special(value = "*SAVLIB")
		SAVLIB, OTHER
	}

	public static enum RestoreToASPDevice {
		@Special(value = "*SAVASPDEV")
		SAVASPDEV, OTHER
	}

	public static enum RestoreToASPNumber {
		@Special(value = "-1")
		SAVASP, OTHER
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

		public static enum ReplaceOrAddRecords {
			@Special(value = "R")
			REPLACE, @Special(value = "A")
			ADD
		}

		public static enum MemberToReceiveOutput {
			@Special(value = "*FIRST")
			FIRST, OTHER
		}
	}

	public static enum TypeOfOutputInformation {
		@Special(value = "O")
		OBJ, @Special(value = "M")
		MBR
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
}
