/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.os.type.pgm.rpj;

import javax.inject.Inject;

import org.asup.fw.core.QContextID;
import org.asup.il.core.annotation.Overlay;
import org.asup.il.data.DecimalType;
import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QData;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QDataWriter;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QList;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QPointer;
import org.asup.il.data.QString;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.isam.QDataSet;
import org.asup.os.type.pgm.QProgramManager;

public class RPJProgramSupport {

	@Inject
	public QDataFactory qDF;

	@Inject
	public QProgramManager programManager;
	@Inject
	public QContextID contextID;
	@DataDef
	public Indicators qIN;
	@DataDef
	public QIndicator qINOF;
	@DataDef
	public QIndicator qINRT;
	@DataDef
	public QIndicator qINLR;
	@DataDef
	public QIndicator qINKA;
	@DataDef
	public QIndicator qINKB;
	@DataDef
	public QIndicator qINKC;
	@DataDef
	public QIndicator qINKD;
	@DataDef
	public QIndicator qINKE;
	@DataDef
	public QIndicator qINKF;
	@DataDef
	public QIndicator qINKG;
	@DataDef
	public QIndicator qINKH;
	@DataDef
	public QIndicator qINKI;
	@DataDef
	public QIndicator qINKJ;
	@DataDef
	public QIndicator qINKK;
	@DataDef
	public QIndicator qINKL;
	@DataDef
	public QIndicator qINKM;
	@DataDef
	public QIndicator qINKN;
	@DataDef
	public QIndicator qINKP;
	@DataDef
	public QIndicator qINKQ;
	@DataDef
	public QIndicator qINKR;
	@DataDef
	public QIndicator qINKS;
	@DataDef
	public QIndicator qINKT;
	@DataDef
	public QIndicator qINKU;
	@DataDef
	public QIndicator qINKV;
	@DataDef
	public QIndicator qINKW;
	@DataDef
	public QIndicator qINKX;
	@DataDef
	public QIndicator qINKY;
	@DataDef
	public ProgramStatus qSTATUS;
	@DataDef
	public Date qDATE;
	@DataDef
	public Specials qSP;

	public QNumeric qAbs(QNumeric numeric) {
		return numeric;
	}

	public QDataWriter qAll(QNumeric numeric) {
		return QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter().set(numeric);
	}

	public QDataWriter qAll(QString string) {
		return QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter().set(string);
	}

	/*
	public QBufferedData qBox(Enum<?> label) {
		return null;
	}*/

	public QIndicator qBox(boolean boolean_) {

		QIndicator qIndicator = qDF.createIndicator(true);
		qIndicator.eval(boolean_);
		
		return qIndicator;
	}

	public QDecimal qBox(Integer decimal) {

		QDecimal qDecimal = qDF.createDecimal(10, 0, DecimalType.ZONED, true);
		qDecimal.eval(decimal);

		return qDecimal;
	}

	public QCharacter qBox(String character) {

		QCharacter qCharacter = qDF.createCharacter(character.length(), false, true);
		qCharacter.eval(character);

		return qCharacter;
	}

	public void qCall(QString program, QData[] parameters) {
		programManager.callProgram(contextID, null, program.trimR(), parameters);
	}

	public void qCall(String program, QData[] parameters) {
		programManager.callProgram(contextID, null, program.trim(), parameters);
	}

	public QString qChar(QNumeric numeric) {
		return qBox(numeric.asString());
	}

	public QString qChar(int number) {

		QCharacter character = qDF.createCharacter(19, true, true);
		character.eval(Integer.toString(number));

		return character;
	}

	public QDecimal qCheck(String comparator, QString base, Integer start) {
		return null;
	}

	public QDecimal qCheckr(String comparator, QString base, Integer start) {
		return null;
	}

	public QDecimal qDec(QNumeric numeric, int precision, int scale) {
		return null;
	}
	
	public QDecimal qDec(QString string, int precision, int scale) {
		return null;
	}

	public QDecimal qDec(String string, int precision, int scale) {
		return null;
	}

	public void qCommand(String statement) {

	}

	public QDatetime qAdddur(QDatetime op1, QDecimal op2, Enum<?> format) {
		return null;
	}

	public QDatetime qSubdur(QDatetime op1, QDecimal op2, Enum<?> format) {
		return null;
	}

	public QDecimal qDiff(QDatetime op1, QDatetime op2, Enum<?> format) {
		return null;
	}

	public void qDisplay(QString text) {
		System.out.println(text);
	}

	public QString qEditc(QNumeric numeric, String format) {
		return null;
	}

	public QString qEditc(int numeric, String format) {
		return null;
	}
	
	public QString qEditw(QNumeric numeric, String format) {
		return null;
	}

	public QDecimal qElem(QList<?> list) {
		QDecimal decimal = qDF.createDecimal(5, 0, DecimalType.ZONED, true);
		decimal.eval(list.capacity());
		return decimal;
	}

	public QIndicator qEof(QDataSet<?> dataSet) {
		return qBox(dataSet.isEndOfData());
	}

	public QIndicator qOpen(QDataSet<?> dataSet) {
		return qBox(dataSet.isOpen());
	}

	public QIndicator qEqual(QDataSet<?> dataSet) {
		return qBox(dataSet.onError());
	}
	public QIndicator qError() {
		return null;
	}
	
	public QIndicator qError(QDataSet<?> dataSet) {
		return qBox(dataSet.onError());
	}

	public QIndicator qFound(QDataSet<?> dataSet) {
		return qBox(dataSet.isFound());
	}

	public QDecimal qInt(QString string) {
		return qBox(Integer.parseInt(string.trimR()));
	}

	public QDecimal qInt(Integer numeric) {
		return qBox(numeric);
	}
	
	public void qJump(Enum<?> label) {
	}

	public void qLabel(Enum<?> name) {
	}

	public QPointer qAddr(QBufferedData bufferedData) {
		return null;
	}

	public QPointer qPaddr(QString string) {
		return null;
	}
	
	public QPointer qAlloc(QNumeric size) {
		return null;
	}
	
	public QPointer qAlloc(Integer size) {
		return null;
	}
	
	public QPointer qRealloc(QPointer pointer, QNumeric size) {
		return null;
	}
	
	public QPointer qRealloc(QPointer pointer, Integer size) {
		return null;
	}
	
	public void qDealloc(QPointer pointer) {
		// TODO
	}
	
	public QIndicator qTestn(QString string) {
		// TODO
		return null;
	}

	public QDecimal qLen(QBufferedData bufferedData) {
		QDecimal decimal = qDF.createDecimal(5, 0, DecimalType.ZONED, true);
		decimal.eval(bufferedData.getLength());
		return decimal;
	}

	public QDecimal qLen(String string) {
		QDecimal decimal = qDF.createDecimal(5, 0, DecimalType.ZONED, true);
		decimal.eval(string.length());
		return decimal;
	}

	public QDecimal qSize(QBufferedData bufferedData) {
		QDecimal decimal = qDF.createDecimal(5, 0, DecimalType.ZONED, true);
		decimal.eval(bufferedData.getSize());
		return decimal;
	}
	
	public QDecimal qLookup(Specials argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}

	public QDecimal qLookup(QBufferedData argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}
	
	public QDecimal qLookup(String argument, QList<QCharacter> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}
	
	public QDecimal qLookuplt(Specials argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LT, argument, list, startIndex, numElements);
	}

	public QDecimal qLookuplt(QBufferedData argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LT, argument, list, startIndex, numElements);
	}
	
	public QDecimal qLookuple(Specials argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LE, argument, list, startIndex, numElements);
	}

	public QDecimal qLookuple(QBufferedData argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LE, argument, list, startIndex, numElements);
	}
	
	public QDecimal qLookupgt(Specials argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GT, argument, list, startIndex, numElements);
	}

	public QDecimal qLookupgt(QBufferedData argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GT, argument, list, startIndex, numElements);
	}
	
	public QDecimal qLookupge(Specials argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GE, argument, list, startIndex, numElements);
	}

	public QDecimal qLookupge(QBufferedData argument, QList<?> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GE, argument, list, startIndex, numElements);
	}
	
	private QDecimal qLookup(LookupOperator operator, String argument, QList<QCharacter> list, Integer startIndex, Integer numElements) {

		if(startIndex == null)
			startIndex = 1;

		if (numElements == null)
			numElements = list.capacity();

		for (int i = startIndex; i <= numElements; i++) {
			if (list.get(i).eq(argument))
				return qBox(i);
		}

		return qBox(-1);
	}
	
	private QDecimal qLookup(LookupOperator operator, Specials argument, QList<?> list, Integer startIndex, Integer numElements) {

		if(startIndex == null)
			startIndex = 1;

		if (numElements == null)
			numElements = list.capacity();

		for (int i = startIndex; i <= numElements; i++) {
			if (list.get(i).eq(argument))
				return qBox(i);
		}

		return qBox(-1);
	}

	private QDecimal qLookup(LookupOperator operator, QBufferedData argument, QList<?> list, Integer startIndex, Integer numElements) {

		if(startIndex == null)
			startIndex = 1;

		if (numElements == null)
			numElements = list.capacity();
		
		for (int i = startIndex; i <= numElements; i++) {
			if (list.get(i).toString().equals(argument.toString()))
				return qBox(i);
		}

		return qBox(-1);
	}

	public QDecimal qRem(QNumeric ope1, QNumeric ope2) {
		return null;
	}
	
	public QDecimal qScan(byte argument, QString source) {
		return qScan(argument, source, null, null);
	}
	
	public QDecimal qScan(byte argument, QString source, Integer start) {
		return qScan(argument, source, start, null);
	}
	
	// TODO double byte?
	public QDecimal qScan(byte argument, QString source, Integer start, Integer length) {

		if(start == null)
			start = 1;
		
		int position = 0;
		
		if(length != null)
			position = qSubst(source, 1, length).asString().indexOf(argument, start-1) + 1;
		else
			position = source.asString().indexOf(argument, start-1) + 1;

		return qBox(position);
	}
	
	public QDecimal qScan(String argument, QString source) {
		return qScan(argument, source, null, null);
	}
	
	public QDecimal qScan(String argument, QString source, Integer start) {
		return qScan(argument, source, start, null);
	}
	
	public QDecimal qScan(String argument, QString source, Integer start, Integer length) {

		if(start == null)
			start = 1;
		
		int position = 0;
		
		if(length != null)
			position = qSubst(source, 1, length).asString().indexOf(argument, start-1) + 1;
		else
			position = source.asString().indexOf(argument, start-1) + 1;

		return qBox(position);
	}

	public QDecimal qStatus() {
		return qSTATUS.qStatus;
	}

	public QString qReplace(String replacement, String source, Integer from, Integer length) {

		return null;
	}

	public QArray<?> qSubarr(QArray<?> array, int start, int elements) {
		return null;
	}

	public QString qSubst(QArray<QCharacter> source, Integer from) {
		return null;
	}
	public QString qSubst(QArray<QCharacter> source, Integer from, Integer to) {
		return null;
	}
	
	public QString qSubst(QString source, Integer from) {
		return null;
	}

	public QString qSubst(QString source, Integer from, Integer length) {

		return qSubst(source.asString(), from, length);
	}
	public QString qSubst(String source, Integer from, Integer length) {

		String str = source.substring(from - 1, from - 1 + length);

		QString string = qDF.createCharacter(str.length(), false, true);
		string.eval(str);

		return string;
	}
	public QNumeric qTime(QDatetime datetime) {
		return null;
	}

	public void qTime(QNumeric datetime) {
		// TODO
	}

	public QString qTrim(String source) {
		return qTrim(qBox(source));
	}

	public QString qTrim(QString source) {

		String str = source.trim();
		QCharacter character = qDF.createCharacter(str.length(), false, true);
		character.eval(str);

		return character;

	}

	public QString qTriml(String source) {
		return qTriml(qBox(source));
	}

	public QString qTriml(QString source) {

		String str = source.trimL();
		QCharacter character = qDF.createCharacter(str.length(), false, true);
		character.eval(str);

		return character;

	}

	public QString qTrimr(String source) {
		return qTrimr(qBox(source));
	}

	public QString qTrimr(QString source) {

		String str = source.trimR();
		int length = str.length();
		QCharacter character = qDF.createCharacter(length, false, true);
		character.eval(str);

		return character;
	}
	
	public QString qCat(String string1, String string2) {
		return qCat(qBox(string1), qBox(string1));
	}
	
	public QString qCat(QString string1, QString string2) {

		String str = string1.trimR() + " " + string2.asString();
		int length = str.length();
		QCharacter character = qDF.createCharacter(length, false, true);
		character.eval(str);

		return character;
	}

	
	public QString qBcat(String string1, String string2) {
		return qBcat(qBox(string1), qBox(string1));
	}
	
	public QString qBcat(QString string1, QString string2) {

		String str = string1.trimR() + " " + string2.asString();
		int length = str.length();
		QCharacter character = qDF.createCharacter(length, false, true);
		character.eval(str);

		return character;
	}
	
	public QString qTcat(String string1, String string2) {
		return qTcat(qBox(string1), qBox(string1));
	
	}
		
	public QString qTcat(QString string1, QString string2) {

		String str = string1.trimR() + string2.asString();
		int length = str.length();
		QCharacter character = qDF.createCharacter(length, false, true);
		character.eval(str);

		return character;
	}

	public QString qStr(QPointer source, int length) {
		return null;
	}
	
	public QString qXlate(String oldString, String newString, QString source) {
		return null;
	}

	public static class ProgramStatus extends QDataStructWrapper {

		private static final long serialVersionUID = 1L;

		@DataDef(length = 5)
		public QDecimal qStatus;
	}

	public static class Date extends QDataStructWrapper {

		private static final long serialVersionUID = 1L;

		@DataDef(length = 4)
		public QDecimal uyear4;

		@DataDef(length = 2)
		@Overlay(position = "1")
		public QDecimal uyear;
	}

	public static class Indicators extends QDataStructWrapper {

		private static final long serialVersionUID = 1L;

		@Overlay(name = "IN", position = "01")
		public QIndicator qIN01;
		@Overlay(name = "IN", position = "02")
		public QIndicator qIN02;
		@Overlay(name = "IN", position = "03")
		public QIndicator qIN03;
		@Overlay(name = "IN", position = "04")
		public QIndicator qIN04;
		@Overlay(name = "IN", position = "05")
		public QIndicator qIN05;
		@Overlay(name = "IN", position = "06")
		public QIndicator qIN06;
		@Overlay(name = "IN", position = "07")
		public QIndicator qIN07;
		@Overlay(name = "IN", position = "08")
		public QIndicator qIN08;
		@Overlay(name = "IN", position = "09")
		public QIndicator qIN09;
		@Overlay(name = "IN", position = "10")
		public QIndicator qIN10;
		@Overlay(name = "IN", position = "20")
		public QIndicator qIN20;
		@Overlay(name = "IN", position = "21")
		public QIndicator qIN21;
		@Overlay(name = "IN", position = "22")
		public QIndicator qIN22;
		@Overlay(name = "IN", position = "23")
		public QIndicator qIN23;
		@Overlay(name = "IN", position = "24")
		public QIndicator qIN24;
		@Overlay(name = "IN", position = "25")
		public QIndicator qIN25;
		@Overlay(name = "IN", position = "26")
		public QIndicator qIN26;
		@Overlay(name = "IN", position = "27")
		public QIndicator qIN27;
		@Overlay(name = "IN", position = "28")
		public QIndicator qIN28;
		@Overlay(name = "IN", position = "29")
		public QIndicator qIN29;
		@Overlay(name = "IN", position = "30")
		public QIndicator qIN30;
		@Overlay(name = "IN", position = "31")
		public QIndicator qIN31;
		@Overlay(name = "IN", position = "32")
		public QIndicator qIN32;
		@Overlay(name = "IN", position = "33")
		public QIndicator qIN33;
		@Overlay(name = "IN", position = "34")
		public QIndicator qIN34;
		@Overlay(name = "IN", position = "35")
		public QIndicator qIN35;
		@Overlay(name = "IN", position = "36")
		public QIndicator qIN36;
		@Overlay(name = "IN", position = "37")
		public QIndicator qIN37;
		@Overlay(name = "IN", position = "38")
		public QIndicator qIN38;
		@Overlay(name = "IN", position = "39")
		public QIndicator qIN39;
		@Overlay(name = "IN", position = "40")
		public QIndicator qIN40;
		@Overlay(name = "IN", position = "41")
		public QIndicator qIN41;
		@Overlay(name = "IN", position = "42")
		public QIndicator qIN42;
		@Overlay(name = "IN", position = "43")
		public QIndicator qIN43;
		@Overlay(name = "IN", position = "44")
		public QIndicator qIN44;
		@Overlay(name = "IN", position = "45")
		public QIndicator qIN45;
		@Overlay(name = "IN", position = "46")
		public QIndicator qIN46;
		@Overlay(name = "IN", position = "47")
		public QIndicator qIN47;
		@Overlay(name = "IN", position = "48")
		public QIndicator qIN48;
		@Overlay(name = "IN", position = "49")
		public QIndicator qIN49;
		@Overlay(name = "IN", position = "50")
		public QIndicator qIN50;
		@Overlay(name = "IN", position = "51")
		public QIndicator qIN51;
		@Overlay(name = "IN", position = "52")
		public QIndicator qIN52;
		@Overlay(name = "IN", position = "53")
		public QIndicator qIN53;
		@Overlay(name = "IN", position = "54")
		public QIndicator qIN54;
		@Overlay(name = "IN", position = "55")
		public QIndicator qIN55;
		@Overlay(name = "IN", position = "56")
		public QIndicator qIN56;
		@Overlay(name = "IN", position = "57")
		public QIndicator qIN57;
		@Overlay(name = "IN", position = "58")
		public QIndicator qIN58;
		@Overlay(name = "IN", position = "59")
		public QIndicator qIN59;
		@Overlay(name = "IN", position = "60")
		public QIndicator qIN60;
		@Overlay(name = "IN", position = "61")
		public QIndicator qIN61;
		@Overlay(name = "IN", position = "62")
		public QIndicator qIN62;
		@Overlay(name = "IN", position = "63")
		public QIndicator qIN63;
		@Overlay(name = "IN", position = "64")
		public QIndicator qIN64;
		@Overlay(name = "IN", position = "65")
		public QIndicator qIN65;
		@Overlay(name = "IN", position = "66")
		public QIndicator qIN66;
		@Overlay(name = "IN", position = "67")
		public QIndicator qIN67;
		@Overlay(name = "IN", position = "68")
		public QIndicator qIN68;
		@Overlay(name = "IN", position = "69")
		public QIndicator qIN69;
		@Overlay(name = "IN", position = "70")
		public QIndicator qIN70;
		@Overlay(name = "IN", position = "71")
		public QIndicator qIN71;
		@Overlay(name = "IN", position = "72")
		public QIndicator qIN72;
		@Overlay(name = "IN", position = "73")
		public QIndicator qIN73;
		@Overlay(name = "IN", position = "74")
		public QIndicator qIN74;
		@Overlay(name = "IN", position = "75")
		public QIndicator qIN75;
		@Overlay(name = "IN", position = "76")
		public QIndicator qIN76;
		@Overlay(name = "IN", position = "77")
		public QIndicator qIN77;
		@Overlay(name = "IN", position = "78")
		public QIndicator qIN78;
		@Overlay(name = "IN", position = "79")
		public QIndicator qIN79;
		@Overlay(name = "IN", position = "80")
		public QIndicator qIN80;
		@Overlay(name = "IN", position = "81")
		public QIndicator qIN81;
		@Overlay(name = "IN", position = "90")
		public QIndicator qIN90;
		@Overlay(name = "IN", position = "91")
		public QIndicator qIN91;
		@Overlay(name = "IN", position = "92")
		public QIndicator qIN92;
		@Overlay(name = "IN", position = "93")
		public QIndicator qIN93;
		@Overlay(name = "IN", position = "94")
		public QIndicator qIN94;
		@Overlay(name = "IN", position = "95")
		public QIndicator qIN95;
		@Overlay(name = "IN", position = "96")
		public QIndicator qIN96;
		@Overlay(name = "IN", position = "97")
		public QIndicator qIN97;
		@Overlay(name = "IN", position = "98")
		public QIndicator qIN98;
		@Overlay(name = "IN", position = "99")
		public QIndicator qIN99;
		
		public QIndicator get(Integer index) {
			return null;
		}

		public QIndicator get(QDecimal index) {
			return null;
		}
	}

	public static enum Specials {
		ALL, OFF, ON, ZERO, ZEROS, BLANK, BLANKS, LOVAL, HIVAL, MS;

		public boolean asBoolean() {
			return this.toString().equals("ON");
		}

		public String asString() {
			return this.toString();
		}
	}

	private static enum LookupOperator {
		EQ, LT, LE, GT, GE;
	}

	public boolean isOff(int i) {
		// TODO Auto-generated method stub
		return false;
	}
}
