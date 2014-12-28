package org.asup.il.isam.test.file.dbf;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDecimal;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.isam.QRecordWrapper;

public class BRDIST0F extends QRecordWrapper {
	private static final long serialVersionUID = 1L;
	@DataDef(length = 3)
	public QCharacter dçtipd;
	@DataDef(length = 15)
	public QCharacter dçassi;
	@DataDef(length = 4)
	public QCharacter dçusr1;
	@DataDef(length = 15)
	public QCharacter dçcomp;
	@DataDef(length = 4)
	public QCharacter dçusr2;
	@DataDef(length = 2)
	public QCharacter dçstat;
	@DataDef(length = 6)
	public QCharacter dçsqci;
	@DataDef(precision = 3)
	public QDecimal dçltad;
	@DataDef(precision = 8)
	public QDecimal dçdinv;
	@DataDef(precision = 8)
	public QDecimal dçdfnv;
	@DataDef(length = 5)
	public QCharacter dçcrse;
	@DataDef(precision = 15, scale = 6)
	public QDecimal dçcoef;
	@DataDef(length = 15)
	public QCharacter dçpas1;
	@DataDef(length = 15)
	public QCharacter dçpas2;
	@DataDef(precision = 11, scale = 3)
	public QDecimal dçqtlo;
	@DataDef(precision = 5, scale = 3)
	public QDecimal dçpert;
	@DataDef(precision = 15, scale = 6)
	public QDecimal dçqua1;
	@DataDef(precision = 15, scale = 6)
	public QDecimal dçqua2;
	@DataDef(precision = 15, scale = 6)
	public QDecimal dçqua3;
	@DataDef(precision = 15, scale = 6)
	public QDecimal dçqua4;
	@DataDef(precision = 15, scale = 6)
	public QDecimal dçqua5;
	@DataDef(length = 1)
	public QCharacter dçflg1;
	@DataDef(length = 1)
	public QCharacter dçflg2;
	@DataDef(length = 1)
	public QCharacter dçflg3;
	@DataDef(length = 1)
	public QCharacter dçflg4;
	@DataDef(length = 1)
	public QCharacter dçflg5;
	@DataDef(length = 50)
	public QCharacter dçnota;
	@DataDef(length = 20)
	public QCharacter dçdise;
	@DataDef(length = 5)
	public QCharacter dçdisp;
	@DataDef(precision = 8)
	public QDecimal dçdtin;
	@DataDef(precision = 8)
	public QDecimal dçdtag;
	@DataDef(length = 10)
	public QCharacter dçusag;
}
