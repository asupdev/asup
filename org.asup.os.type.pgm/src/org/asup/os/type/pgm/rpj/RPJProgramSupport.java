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
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.QList;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QString;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.isam.QDataSet;
import org.asup.os.type.pgm.QProgramManager;
import org.asup.os.type.pgm.impl.CallableProgramImpl;

public class RPJProgramSupport extends CallableProgramImpl {

	public static class Indicators extends QDataStructDelegator {

		/**
		 * 
		 */
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
		@Overlay(name = "IN", position = "60")
		public QIndicator qIN60;
		@Overlay(name = "IN", position = "81")
		public QIndicator qIN81;
		@Overlay(name = "IN", position = "90")
		public QIndicator qIN90;
		public QIndicator get(Integer index) {
			return null;
		}

		public QIndicator get(QDecimal index) {
			return null;
		}
	}

	public static class ProgramStatus extends QDataStructDelegator {

		private static final long serialVersionUID = 1L;

		@DataDef(length=5)
		public QDecimal qStatus;
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
	public ProgramStatus qSTATUS;
	@DataDef
	public Specials qSP;

	public QNumeric qAbs(QNumeric numeric) {
		return numeric;
	}
	
	public QDataEvaluator qAll(QNumeric numeric) {
		return 	QIntegratedLanguageDataFactory.eINSTANCE.createDataEvaluator().set(numeric);
	}
	
	public QDataEvaluator qAll(QString string) {
		return 	QIntegratedLanguageDataFactory.eINSTANCE.createDataEvaluator().set(string);
	}
	
	public QIndicator qBox(boolean boo) {

		QIndicator qIndicator = qDF.createIndicator(true);
		qIndicator.eval(boo);

		return qIndicator;
	}

	public QDecimal qBox(Integer decimal) {

		QDecimal qDecimal = qDF.createDecimal(10, 0, DecimalType.ZONED, true);
		qDecimal.eval(decimal);

		return qDecimal;
	}

	public QCharacter qBox(String character) {

		QCharacter qCharacter = qDF.createCharacter(character.length(), false,
				true);
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

	public void qCommand(String statement) {

	}

	public QDatetime qDiff(QDatetime op1, QDatetime op2, String format) {
		return null;
	}

	public QString qEditc(QNumeric numeric, String format) {
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

	public QIndicator qError() {
		return null;
	}

	public QIndicator qFound() {
		return null;
	}

	public void qJump(Enum<?> label) {
	}

	public void qLabel(Enum<?> name) {
	}

	public QDecimal qLen(QBufferedData bufferedData) {
		QDecimal decimal = qDF.createDecimal(5, 8, DecimalType.ZONED, true);
		decimal.eval(bufferedData.length());
		return decimal;
	}

	public <D extends QBufferedData> Integer qLookup(D argument,
			QArray<D> array, Integer startIndex, Integer numElements) {

		if (numElements == null)
			numElements = array.capacity();

		for (int i = startIndex; i >= numElements; i++) {
			if (array.get(i).equals(argument))
				return i;
		}

		return -1;
	}

	public QDecimal qRem(QNumeric ope1, QNumeric ope2) {
		return null;
	}

	public QDecimal qScan(String argument, QString source, Integer start) {

		int position = source.toString().indexOf(argument, start) + 1;

		return qBox(position);
	}

	public QDecimal qStatus() {
		return qSTATUS.qStatus;
	}

	public QString qSubst(QString source, Integer from) {
		return null;
	}

	public QString qSubst(QString source, Integer from, Integer to) {

		String str = source.toString().substring(from - 1, from - 1 + to);

		QString string = qDF.createCharacter(str.length(), false, true);
		string.eval(str);

		return string;
	}

	public QNumeric qTime(QDatetime datetime) {
		return null;
	}

	public QString qTrim(QString source) {

		String str = source.trim();
		QCharacter character = qDF.createCharacter(str.length(), false, true);
		character.eval(str);

		return character;

	}

	public QString qTriml(QString source) {

		String str = source.trimL();
		QCharacter character = qDF.createCharacter(str.length(), false, true);
		character.eval(str);

		return character;

	}

	public QString qTrimr(QString source) {

		String str = source.trimR();
		QCharacter character = qDF.createCharacter(str.length(), false, true);
		character.eval(str);

		return character;
	}

	public QString qXlate(String oldString, String newString, QString source) {
		return null;
	}
}
