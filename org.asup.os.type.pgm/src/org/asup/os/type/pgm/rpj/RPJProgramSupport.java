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
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QList;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QString;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.isam.QDataSet;
import org.asup.os.type.pgm.QProgramManager;
import org.asup.os.type.pgm.impl.CallableProgramImpl;

public class RPJProgramSupport extends CallableProgramImpl {
	
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
	public Specials qSP;
	
	@DataDef
	public QDecimal qStatus;

	public static enum Specials {
		ALL, OFF, ON, ZERO, ZEROS, BLANK, BLANKS, LOVAL, HIVAL, MS;
		
		public String asString() {
			return this.toString();
		}
		
		public boolean asBoolean() {
			return this.toString().equals("ON");
		}
	}

	public static class Indicators extends QDataStructDelegator {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		@Overlay(name="IN", position="10")
		public QIndicator qIN10;
		@Overlay(name="IN", position="25")
		public QIndicator qIN25;
		@Overlay(name="IN", position="26")
		public QIndicator qIN26;
		@Overlay(name="IN", position="27")
		public QIndicator qIN27;
		@Overlay(name="IN", position="35")
		public QIndicator qIN35;
		@Overlay(name="IN", position="36")
		public QIndicator qIN36;
		@Overlay(name="IN", position="37")
		public QIndicator qIN37;
		@Overlay(name="IN", position="41")
		public QIndicator qIN41;
		@Overlay(name="IN", position="42")
		public QIndicator qIN42;
		@Overlay(name="IN", position="43")
		public QIndicator qIN43;
		@Overlay(name="IN", position="44")
		public QIndicator qIN44;
		@Overlay(name="IN", position="50")
		public QIndicator qIN50;
		@Overlay(name="IN", position="51")
		public QIndicator qIN51;
		@Overlay(name="IN", position="52")
		public QIndicator qIN52;
		@Overlay(name="IN", position="53")
		public QIndicator qIN53;
		@Overlay(name="IN", position="54")
		public QIndicator qIN54;
		@Overlay(name="IN", position="55")
		public QIndicator qIN55;
		@Overlay(name="IN", position="60")
		public QIndicator qIN60;	
		
		public QIndicator get(Integer index) {
			return null;
		}
		
		
		public QIndicator get(QDecimal index) {
			return null;
		}
	}

	public QDecimal qStatus() {
		return qStatus;
	}
	
	public QIndicator qError() {
		return null;
	}
	
	public QIndicator qFound() {
		return null;
	}
	
	public void qCall(String program, QData[] parameters) {
		programManager.callProgram(contextID, null, program.trim(), parameters);
	}

	public void qCommand(String statement) {
		
	}

	public void qJump(Enum<?> label){}
	
	public void qLabel(Enum<?> name){}
	
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

	public QIndicator qBox(boolean boo) {

		QIndicator qIndicator = qDF.createIndicator(true);
		qIndicator.eval(boo);
		
		return qIndicator;
	}
	
	public QString qChar(QNumeric numeric) {
		return qBox(numeric.asString());
	}

	public QDecimal qCheck(String comparator, QString base, Integer start) {
		return null;
	}

	public QDecimal qCheckr(String comparator, QString base, Integer start) {
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
	public QDecimal qLen(QBufferedData bufferedData) {
		QDecimal decimal = qDF.createDecimal(5, 8, DecimalType.ZONED, true);
		decimal.eval(bufferedData.length());
		return decimal ;
	}

	public <D extends QBufferedData> Integer qLookup(D argument, QArray<D> array, Integer startIndex, Integer numElements) {

		if(numElements == null)
			numElements = array.capacity();
		
		for(int i=startIndex; i >= numElements; i++) {
			if(array.get(i).equals(argument))
				return i;
		}
		
		return -1;
	}
	
	public QDecimal qRem(QNumeric ope1, QNumeric ope2) {
		return null;
	}

	public QDatetime qDiff(QDatetime op1, QDatetime op2, String format) {
		return null;
	}
	
	public QDecimal qScan(String argument, QString source, Integer start) {
		
		int position = source.toString().indexOf(argument, start)+1;
		
		return qBox(position);
	}
	
	public QString qSubst(QString source, Integer from, Integer to) {

		String str = source.toString().substring(from-1, from-1+to); 
		
		QString string = qDF.createCharacter(str.length(), false, true);
		string.eval(str);
				
		return string;
	}
	public QString qSubst(QString source, Integer from) {
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
			
	public QNumeric qTime(QDatetime datetime) {
		return null;
	}

	public QString qXlate(String oldString, String newString, QString source) {
		return null;
	}
	
	public QIndicator qEof(QDataSet<?> dataSet) {
		return qBox(dataSet.isEndOfData());
	}
}
