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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.asup.fw.core.QContextID;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.nio.NIODataManagerImpl;

public class NIOTestSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String fileName = "./nio.txt";
		QDataStruct dataStructure = buildDataStructure();

		// save the object to file
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(dataStructure);
		out.close();
			
		// read the object from file
		// save the object to file
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(fis);
		dataStructure = (QDataStruct) in.readObject();
		in.close();
	}

	@SuppressWarnings({ "unused", "null" })
	private static QDataStruct buildDataStructure() {
		
		QDataManager dataManager = new NIODataManagerImpl();
		QDataFactory dataFactory = dataManager.createFactory(new QContextID() {
			
			@Override
			public String getID() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		NIOTestDataStructure dataStruct = null; //dataFactory.createDataStructure(NIOTestDataStructure.class, null);
		dataStruct.alfa.eval("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		dataStruct.decimal.eval(123);
		
		return dataStruct;
	}
}