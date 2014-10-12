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
package org.asup.il.data.nio.test;

import java.io.IOException;

import org.asup.fw.core.QContextID;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataEvaluator;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QIntegratedLanguageDataFactory;
import org.asup.il.data.nio.NIOCharacterImpl;
import org.asup.il.data.nio.NIODataManagerImpl;

public class NIOTestSerialization {

	static QDataManager dataManager = new NIODataManagerImpl();
	static QDataFactory dataFactory = dataManager.createFactory(new QContextID() {
		
		@Override
		public String getID() {
			// TODO Auto-generated method stub
			return null;
		}
	});
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		long timeIni = 0;
				
		timeIni = System.currentTimeMillis();
		NIOTestDataStructure dataStructure = buildDataStructure();
		System.out.println("Creation: "+ (System.currentTimeMillis()-timeIni));

		timeIni = System.currentTimeMillis();
		for(QCharacter multElement: dataStructure.multiple) {
			if(multElement.isEmpty())
				continue;
		}
		System.out.println("Iterate first: "+ (System.currentTimeMillis()-timeIni));

		timeIni = System.currentTimeMillis();
		for(QCharacter multElement: dataStructure.multiple) {
			if(multElement.isEmpty())
				continue;
		}
		System.out.println("Iterate: "+ (System.currentTimeMillis()-timeIni));

		timeIni = System.currentTimeMillis();
		for(QCharacter multElement: dataStructure.multiple) {
			multElement.asBytes();
		}
		System.out.println("Read: "+ (System.currentTimeMillis()-timeIni));

		timeIni = System.currentTimeMillis();
		int i=0;
		for(QCharacter multElement: dataStructure.multiple) {
			i++;
			multElement.eval(Integer.toString(i));
		}
		System.out.println("Write: "+ (System.currentTimeMillis()-timeIni));

		timeIni = System.currentTimeMillis();
		for(QCharacter multElement: dataStructure.multiple) {
			if(multElement.isEmpty())
				continue;
		}
		System.out.println("Iterate: "+ (System.currentTimeMillis()-timeIni));

		NIOCharacterImpl character = new NIOCharacterImpl(10000);
		character.allocate();
		
		timeIni = System.currentTimeMillis();
		for(int y=0; y<100; y++) {		
			for(QCharacter multElement: dataStructure.multiple) {
				character.movel(multElement, false);
			}
		}
		System.out.println("Movel: "+ (System.currentTimeMillis()-timeIni));

		QDataEvaluator evaluator = QIntegratedLanguageDataFactory.eINSTANCE.createDataEvaluator(); 
		timeIni = System.currentTimeMillis();
		for(int y=0; y<100; y++) {		
			for(QCharacter multElement: dataStructure.multiple) {
				character.accept(evaluator.set(multElement));
			}
		}
		System.out.println("Evaluation: "+ (System.currentTimeMillis()-timeIni));
	}

	private static NIOTestDataStructure buildDataStructure() {
		
		NIOTestDataStructure dataStruct = dataFactory.createDataStruct(NIOTestDataStructure.class, 0, true);
		dataStruct.alfa.eval("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		dataStruct.decimal.eval(123);
		dataStruct.multiple.get(1).eval("A");
		dataStruct.multiple.get(2).eval("B");
		
		return dataStruct;
	}
}