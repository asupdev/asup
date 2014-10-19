package org.asup.os.core.base.api;

import org.asup.fw.core.annotation.Supported;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

public @Supported @Program(name = "RUNMBR") class RUNMBR {
	public @Entry void main(@DataDef(qualified = true) SourceFile sourceFile,
			@DataDef(length = 10) QCharacter sourceMember) {
	}

	public static class SourceFile extends QDataStructDelegator {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "")
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}
}
