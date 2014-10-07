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
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
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
			multElement.eval(i);
		}
		System.out.println("Write: "+ (System.currentTimeMillis()-timeIni));

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