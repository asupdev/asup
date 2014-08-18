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

import org.asup.fw.core.QContextID;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;
import org.asup.il.data.QEnum;
import org.asup.il.data.annotation.Special;
import org.asup.il.data.nio.NIODataManagerImpl;

public class TestFlag {
	
	private enum Conflict {
		@Special("YES")
		Y, 
		@Special("NO")
		N,
		OTHER;
	};

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		QDataManager dataManager = new NIODataManagerImpl();
		QDataFactory dataFactory = dataManager.createFactory(new QContextID() {
			
			@Override
			public String getID() {
				return "TEST";
			}
		});
		
		QCharacter delegate = dataFactory.createCharacter(3);		
		QEnum<Conflict, QCharacter> enumerator = null; //dataFactory.createEnum(Conflict.class, delegate, false);

//		enumerator.eval(Conflict.Y);
		delegate.eval("Z");
		
		switch (enumerator.asEnum()) {
		case Y:
			System.out.println(Conflict.Y);
			break;

		case N:
			System.out.println(Conflict.N);
			break;
			
		case OTHER:
			break;
		default:
			break;
		}

	}
}
