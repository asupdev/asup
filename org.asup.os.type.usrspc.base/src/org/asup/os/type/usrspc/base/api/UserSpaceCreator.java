package org.asup.os.type.usrspc.base.api;

import org.asup.il.core.annotation.Overlay;
import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;


@Program(name = "QUSCRTUS")
public class UserSpaceCreator {

	public @Entry void main(
			@DataDef(qualified = true) UserSpace userSpace,
			@DataDef(length = 10) QCharacter extendedAttribute,
			@DataDef(binaryType = BinaryType.BYTE) QBinary initialSize,
			@DataDef(length = 1) QCharacter initialValue,
			@DataDef(length = 10) QCharacter publicAuthority,
			@DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 10) QCharacter replace,
			ErrorCode errorCode,
			@DataDef(length = 10) QCharacter domain,
			@DataDef(binaryType = BinaryType.BYTE) QBinary transferSizeRequest,
			@DataDef(length = 1) QCharacter optimumSpaceAlignement
			){

	}
	
	public static class UserSpace extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QCharacter library;
	}

	public static class ErrorCode extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "1")
		public QBinary £$01e1;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = "5")
		public QBinary £$01e2;
		@DataDef(length = 7)
		@Overlay(position = "9")
		public QCharacter £$01e3;
		@DataDef(length = 1)
		@Overlay(position = "16")
		public QCharacter £$01e4;
		@DataDef(length = 256)
		@Overlay(position = "17")
		public QCharacter £$01e5;
	}
	
}
