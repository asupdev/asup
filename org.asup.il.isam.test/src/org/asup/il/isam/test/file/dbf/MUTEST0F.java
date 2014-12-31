package org.asup.il.isam.test.file.dbf;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDecimal;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.isam.QRecordWrapper;

public class MUTEST0F extends QRecordWrapper {
	private static final long serialVersionUID = 1L;
	@DataDef(length = 15)
	public QCharacter mtcate;
	@DataDef(length = 30)
	public QCharacter mtogge;
	@DataDef(length = 1)
	public QCharacter mterro;
	@DataDef(length = 7)
	public QCharacter mtmess;
	@DataDef(precision = 15)
	public QDecimal mttime;
	@DataDef(length = 10)
	public QCharacter mtuses;
	@DataDef(precision = 8)
	public QDecimal mtdtes;
	@DataDef(precision = 8)
	public QDecimal mtores;
	@DataDef(length = 6)
	public QCharacter mtjoes;
}