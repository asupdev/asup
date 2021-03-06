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
package org.asup.il.data.test;

import java.io.IOException;

import javax.inject.Inject;

import org.asup.fw.core.QApplication;
import org.asup.fw.test.QTestAsserter;
import org.asup.fw.test.annotation.Test;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.il.data.QArray;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataWriter;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.annotation.DataDef;

@Test(category="ILDATA", object="DATASTRUCTURE")
public class TestDataStructure {

	@Inject
	private QApplication application;
	@Inject
	private QDataManager dataManager;
	@Inject
	private QTestAsserter testAsserter;

	private static int DIM = 9999;
	
	@TestStarted
	public void doTest() throws IOException, ClassNotFoundException {

		QDataFactory dataFactory = dataManager.createFactory(application);

		testAsserter.resetTime();
		DataStructure dataStruct = dataFactory.createDataStruct(DataStructure.class, 0, true);
		testAsserter.assertNotNull("DataStructure creation", dataStruct);

		dataStruct.alfa.eval("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		testAsserter.assertEquals("Read first 10 chars", "ABCDEFGHIJ", dataStruct.alfa.toString());
		
		dataStruct.decimal.eval(123);
		testAsserter.assertEquals("Read decimal", 123, dataStruct.decimal.asInteger());
		
		dataStruct.multiple.get(1).eval("A");
		dataStruct.multiple.get(2).eval("B");
		testAsserter.assertEquals("Read array element[1]", "A", dataStruct.multiple.get(1).toString().trim());
		testAsserter.assertEquals("Read array element[2]", "B", dataStruct.multiple.get(2).toString().trim());

		int c = 0;		
		for(@SuppressWarnings("unused") QCharacter multElement: dataStruct.multiple) {
			c++;
		}
		testAsserter.assertEquals("Count all elements first", DIM, c);

		c = 0;		
		for(@SuppressWarnings("unused") QCharacter multElement: dataStruct.multiple) {
			c++;
		}
		testAsserter.assertEquals("Count all elements second", DIM, c);
		
		c = 0;
		for(QCharacter multElement: dataStruct.multiple) {
			if(multElement.isEmpty())
				continue;
			c++;
		}
		testAsserter.assertEquals("Count not empty elements", 2, c);

		for(QCharacter multElement: dataStruct.multiple) {
			multElement.asBytes();
		}
		testAsserter.assertEquals("Read all elements", true, true);
		
		c = 1;
		for(QCharacter multElement: dataStruct.multiple) {
			multElement.eval(Integer.toString(c));
			c++;
		}
		testAsserter.assertEquals("Write elements", true, true);

		c = 1;
		for(QCharacter multElement: dataStruct.multiple) {
			if(multElement.isEmpty())
				continue;
			
			multElement.asBytes();
			c++;
		}
		testAsserter.assertEquals("Read not empty elements", DIM, c-1);
		

		QCharacter character = dataFactory.createCharacter(10000, false, true);
		
		for(QCharacter multElement: dataStruct.multiple) {
			character.movel(multElement, true);
		}
		testAsserter.assertEquals("Movel elements", true, true);


		QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter(); 
		for(QCharacter multElement: dataStruct.multiple) {
			character.accept(dataWriter.set(multElement));
		}
		testAsserter.assertEquals("Evaluation elements", true, true);
	}
	
	public static class DataStructure extends QDataStructWrapper {
		
		private static final long serialVersionUID = 1L;

		@DataDef(length=10)
		public QCharacter alfa;
		
		@DataDef(precision=5)
		public QDecimal decimal;

		@DataDef(length=1000, dimension=9999)
		public QArray<QCharacter> multiple;
	}
}