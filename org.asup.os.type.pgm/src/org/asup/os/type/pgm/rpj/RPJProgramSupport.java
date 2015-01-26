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
import org.asup.il.isam.QDisplay;
import org.asup.il.isam.QPrint;
import org.asup.os.type.pgm.QProgramManager;

public class RPJProgramSupport {

	@Inject
	public QDataFactory dataFactory;

	@Inject
	public QProgramManager programManager;
	@Inject
	public QContextID contextID;
	@DataDef(dimension = 99)
	public QArray<QIndicator> qIN;
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
	public QIndicator qINU1;
	@DataDef
	public QIndicator qINU2;
	@DataDef
	public QIndicator qINU3;
	@DataDef
	public QIndicator qINU4;
	@DataDef
	public QIndicator qINU5;
	@DataDef
	public QIndicator qINU6;
	@DataDef
	public QIndicator qINU7;
	@DataDef
	public QIndicator qINU8;
	@DataDef
	public QIndicator qINU9;
	@DataDef
	public ProgramStatus qSTATUS;
	@DataDef
	public Date qDATE;
	@DataDef
	public Specials qSP;

	QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	public static class ProgramStatus extends QDataStructWrapper {

		private static final long serialVersionUID = 1L;

		@DataDef(precision = 5)
		public QDecimal qStatus;
	}

	public static class Date extends QDataStructWrapper {

		private static final long serialVersionUID = 1L;

		@DataDef(precision = 4)
		public QDecimal uyear4;

		@DataDef(precision = 2)
		@Overlay(position = "1")
		public QDecimal uyear;
	}

	public static enum Specials {
		NULL, OFF, ON, ZERO, ZEROS, BLANK, BLANKS, LOVAL, HIVAL, MS;

		public boolean asBoolean() {
			return this.toString().equals("ON");
		}

		public boolean b() {
			return this.asBoolean();
		}

		public String asString() {
			return this.toString();
		}
	}

	private static enum LookupOperator {
		EQ, LT, LE, GT, GE;
	}

	/*
	 * public QBufferedData qBox(Enum<?> label) { return null; }
	 */

	public QIndicator qBox(boolean boolean_) {

		QIndicator qIndicator = dataFactory.createIndicator(true);
		qIndicator.eval(boolean_);

		return qIndicator;
	}

	public QDecimal qBox(Integer decimal) {

		QDecimal qDecimal = null;

		if (Math.abs(decimal) >= 0 && Math.abs(decimal) <= 9)
			qDecimal = dataFactory.createDecimal(1, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 10 && Math.abs(decimal) <= 99)
			qDecimal = dataFactory.createDecimal(2, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 100 && Math.abs(decimal) <= 999)
			qDecimal = dataFactory.createDecimal(3, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 1000 && Math.abs(decimal) <= 9999)
			qDecimal = dataFactory.createDecimal(4, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 10000 && Math.abs(decimal) <= 99999)
			qDecimal = dataFactory.createDecimal(5, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 100000 && Math.abs(decimal) <= 999999)
			qDecimal = dataFactory.createDecimal(6, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 1000000 && Math.abs(decimal) <= 9999999)
			qDecimal = dataFactory.createDecimal(7, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 10000000 && Math.abs(decimal) <= 99999999)
			qDecimal = dataFactory.createDecimal(8, 0, DecimalType.ZONED, true);
		else if (Math.abs(decimal) >= 100000000 && Math.abs(decimal) <= 999999999)
			qDecimal = dataFactory.createDecimal(9, 0, DecimalType.ZONED, true);
		else
			qDecimal = dataFactory.createDecimal(10, 0, DecimalType.ZONED, true);

		qDecimal.eval(decimal);

		return qDecimal;
	}

	public QDecimal qBox(Double double_) {

		QDecimal qDecimal = null;

		if (Math.abs(double_) >= 0 && Math.abs(double_) <= 9)
			qDecimal = dataFactory.createDecimal(1, 0, DecimalType.ZONED, true);
		else
			qDecimal = dataFactory.createDecimal(10, 0, DecimalType.ZONED, true);

		qDecimal.eval(double_);

		return qDecimal;
	}

	public QCharacter qBox(String character) {

		QCharacter qCharacter = dataFactory.createCharacter(character.length(), false, true);
		qCharacter.eval(character);

		return qCharacter;
	}

	public QCharacter qBox(byte character) {

		QCharacter qCharacter = dataFactory.createCharacter(1, false, true);
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

		QCharacter character = dataFactory.createCharacter(19, true, true);
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
		// TODO
		QCharacter character = null;
		if (numeric.getLength() == 1) {
			character = dataFactory.createCharacter(numeric.getLength(), false, true);
			character.eval(Integer.toString(numeric.asInteger()));
		} else {
			character = dataFactory.createCharacter(numeric.getLength() + 1, true, true);
			character.eval(Double.toString(numeric.asDouble()));
		}

		return character;
	}

	public QString qEditc(int numeric, String format) {
		return null;
	}

	public QString qEditw(QNumeric numeric, String format) {
		// TODO
		QCharacter character = null;
		if (numeric.getLength() == 1) {
			character = dataFactory.createCharacter(numeric.getLength(), false, true);
			character.eval(Integer.toString(numeric.asInteger()));
		} else {
			character = dataFactory.createCharacter(numeric.getLength() + 1, true, true);
			character.eval(Double.toString(numeric.asDouble()));
		}

		return character;
	}

	public QIndicator qEof(QDataSet<?> dataSet) {
		return qBox(dataSet.isEndOfData());
	}

	public QIndicator qOpen(QDataSet<?> dataSet) {
		return qBox(dataSet.isOpen());
	}

	public QIndicator qOpen(QDisplay<?> display) {
		return qBox(display.isOpen());
	}

	public QIndicator qOpen(QPrint<?> print) {
		return qBox(print.isOpen());
	}

	public QIndicator qEqual(QDataSet<?> dataSet) {
		return qBox(dataSet.onError());
	}

	public QIndicator qError() {
		return null;
	}

	public QIndicator qError(QDataSet<?> dataSet) {
		if (dataSet == null)
			return qBox(true);
		else
			return qBox(dataSet.onError());
	}

	public QIndicator qFound(QDataSet<?> dataSet) {
		if (dataSet == null)
			return qBox(false);
		else
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

	public QDecimal qSize(QBufferedData bufferedData) {
		QDecimal decimal = dataFactory.createDecimal(5, 0, DecimalType.ZONED, true);
		decimal.eval(bufferedData.getSize());
		return decimal;
	}

	public QDecimal qRem(QNumeric ope1, QNumeric ope2) {
		return null;
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
		QCharacter character = dataFactory.createCharacter(str.length(), false, true);
		character.eval(str);

		return character;

	}

	public QString qTriml(String source) {
		return qTriml(qBox(source));
	}

	public QString qTriml(QString source) {

		String str = source.trimL();
		QCharacter character = dataFactory.createCharacter(str.length(), false, true);
		character.eval(str);

		return character;

	}

	public QString qTrimr(String source) {
		return qTrimr(qBox(source));
	}

	public QString qTrimr(QString source) {

		String str = source.trimR();
		int length = str.length();
		QCharacter character = dataFactory.createCharacter(length, false, true);
		character.eval(str);

		return character;
	}

	public QString qCat(String string1, String string2) {
		return qCat(qBox(string1), qBox(string1));
	}

	public QString qCat(QString string1, QString string2) {

		String str = string1.trimR() + " " + string2.asString();
		int length = str.length();
		QCharacter character = dataFactory.createCharacter(length, false, true);
		character.eval(str);

		return character;
	}

	public QString qBcat(String string1, String string2) {
		return qBcat(qBox(string1), qBox(string1));
	}

	public QString qBcat(QString string1, QString string2) {

		String str = string1.trimR() + " " + string2.asString();
		int length = str.length();
		QCharacter character = dataFactory.createCharacter(length, false, true);
		character.eval(str);

		return character;
	}

	public QString qTcat(String string1, String string2) {
		return qTcat(qBox(string1), qBox(string1));

	}

	public QString qTcat(QString string1, QString string2) {

		String str = string1.trimR() + string2.asString();
		int length = str.length();
		QCharacter character = dataFactory.createCharacter(length, false, true);
		character.eval(str);

		return character;
	}
	
	public QString qSst(String string1, QNumeric int1, QNumeric int2) {
		
		//TODO: inserire l'implementazione corretta
		String str = qBox(string1).trimR();
		int length = str.length();
		QCharacter character = dataFactory.createCharacter(length, false, true);
		character.eval(str);

		return character;

		
	}

	/*
	public QString qSst(QString string1, QNumeric int1, QNumeric int2) {

		String str = string1.trimR();
		int length = str.length();
		QCharacter character = dataFactory.createCharacter(length, false, true);
		character.eval(str);

		return character;
	}
	*/

	

	public QString qStr(QPointer source, Integer length) {

		if (source.getTarget() instanceof QString)
			return (QString) source.getTarget();
		else
			return null;

	}

	public QString qXlate(String oldString, String newString, QString source) {
		return null;
	}

	public void qXfoot(QArray<QDecimal> list, QNumeric target) {
	}

	/* Abs */
	public QNumeric qAbs(QNumeric numeric) {
		return qBox(Math.abs(numeric.asDouble()));
	}

	/* All */
	public QDataWriter qAll(QNumeric numeric) {
		return this.dataWriter.set(numeric);
	}

	public QDataWriter qAll(byte numeric) {
		return QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter().set(numeric);
	}

	public QDataWriter qAll(QString string) {
		return QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter().set(string);
	}

	public QDataWriter qAll(String string) {
		return QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter().set(string);
	}

	public QNumeric qAbs(Integer numeric) {
		return qBox(Math.abs(numeric));
	}

	/* Elem */
	public QNumeric qElem(QList<? extends QBufferedData> list) {

		// TODO Unsigned
		QDecimal decimal = dataFactory.createDecimal(5, 0, DecimalType.ZONED, true);
		decimal.eval(list.capacity());
		return decimal;
	}

	/* Len */
	public QDecimal qLen(QBufferedData bufferedData) {
		return createDecimal(bufferedData.getLength());
	}

	public QDecimal qLen(String string) {
		return createDecimal(string.length());
	}

	private QDecimal createDecimal(int length) {

		QDecimal decimal = null;
		if (length >= 0 && length <= 9)
			decimal = dataFactory.createDecimal(1, 0, DecimalType.ZONED, true);
		else if (length >= 10 && length <= 99)
			decimal = dataFactory.createDecimal(2, 0, DecimalType.ZONED, true);
		else if (length >= 100 && length <= 999)
			decimal = dataFactory.createDecimal(3, 0, DecimalType.ZONED, true);
		else if (length >= 1000 && length <= 9999)
			decimal = dataFactory.createDecimal(4, 0, DecimalType.ZONED, true);
		else
			decimal = dataFactory.createDecimal(5, 0, DecimalType.ZONED, true);

		decimal.eval(length);

		return decimal;
	}

	/* Lookup */
	public QNumeric qLookup(Specials argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}

	public QNumeric qLookup(QBufferedData argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}

	public QNumeric qLookup(String argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.EQ, argument, list, startIndex, numElements);
	}

	public QNumeric qLookuplt(Specials argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LT, argument, list, startIndex, numElements);
	}

	public QNumeric qLookuplt(QBufferedData argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LT, argument, list, startIndex, numElements);
	}

	public QNumeric qLookuple(Specials argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LE, argument, list, startIndex, numElements);
	}

	public QNumeric qLookuple(QBufferedData argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.LE, argument, list, startIndex, numElements);
	}

	public QNumeric qLookupgt(Specials argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GT, argument, list, startIndex, numElements);
	}

	public QNumeric qLookupgt(QBufferedData argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GT, argument, list, startIndex, numElements);
	}

	public QNumeric qLookupge(Specials argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GE, argument, list, startIndex, numElements);
	}

	public QNumeric qLookupge(QBufferedData argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {
		return qLookup(LookupOperator.GE, argument, list, startIndex, numElements);
	}

	private QNumeric qLookup(LookupOperator operator, String argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {

		if (startIndex == null)
			startIndex = 1;

		if (numElements == null || numElements == 0)
			numElements = list.capacity();

		for (int i = startIndex; i <= numElements; i++) {
			if (list.get(i).toString().equals(argument))
				return qBox(i);
		}

		return qBox(0);
	}

	private QNumeric qLookup(LookupOperator operator, QBufferedData argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {

		if (startIndex == null)
			startIndex = 1;

		if (numElements == null || numElements == 0)
			numElements = list.capacity();

		for (int i = startIndex; i <= numElements; i++) {
			if (list.get(i).asString().equals(argument.asString()))
				return qBox(i);
		}

		return qBox(0);
	}

	private QNumeric qLookup(LookupOperator operator, Specials argument, QList<? extends QBufferedData> list, Integer startIndex, Integer numElements) {

		if (startIndex == null)
			startIndex = 1;

		if (numElements == null || numElements == 0)
			numElements = list.capacity();

		for (int i = startIndex; i <= numElements; i++) {
			if (list.get(i).eq(argument))
				return qBox(i);
		}

		return qBox(0);
	}

	/* Scan */
	public QDecimal qScan(byte argument, QString source) {
		return qScan(argument, source, null, null);
	}

	public QDecimal qScan(byte argument, QString source, Integer start) {
		return qScan(argument, source, start, null);
	}

	// TODO double byte?
	public QDecimal qScan(byte argument, QString source, Integer start, Integer length) {

		if (start == null)
			start = 1;

		int position = 0;

		if (length != null)
			position = qSubst(source, 1, length).asString().indexOf(argument, start - 1) + 1;
		else
			position = source.asString().indexOf(argument, start - 1) + 1;

		return qBox(position);
	}

	public QDecimal qScan(String argument, QString source) {
		return qScan(argument, source, null, null);
	}

	public QDecimal qScan(String argument, QString source, Integer start) {
		return qScan(argument, source, start, null);
	}

	public QDecimal qScan(String argument, QString source, Integer start, Integer length) {

		if (start == null)
			start = 1;

		int position = 0;

		if (length != null)
			position = qSubst(source, 1, length).asString().indexOf(argument, start - 1) + 1;
		else
			position = source.asString().indexOf(argument, start - 1) + 1;

		return qBox(position);
	}

	/* Substring */
	public QString qSubst(QArray<QCharacter> source, Integer startIndex) {
		return qSubst(source.asString(), startIndex, null);
	}

	public QString qSubst(QArray<QCharacter> source, Integer startIndex, Integer length) {

		if (startIndex == null)
			startIndex = 1;

		if (length == null)
			length = source.getLength() - startIndex;

		QString string = dataFactory.createCharacter(length, false, false);
		source.assign(string, startIndex);

		return string;

	}

	public QString qSubst(QString source, Integer startIndex) {
		return qSubst(source, startIndex, null);
	}

	public QString qSubst(QString source, Integer startIndex, Integer length) {

		if (startIndex == null)
			startIndex = 1;

		if (length == null)
			length = source.getLength() - startIndex;

		QString string = dataFactory.createCharacter(length, false, false);
		source.assign(string, startIndex);

		return string;
	}

	public QString qSubst(String source, Integer startIndex, Integer length) {

		if (startIndex == null)
			startIndex = 1;

		if (length == null)
			length = source.length() - startIndex;

		String str = source.substring(startIndex - 1, startIndex - 1 + length);

		QString string = dataFactory.createCharacter(str.length(), false, true);
		string.eval(str);

		return string;
	}
}
