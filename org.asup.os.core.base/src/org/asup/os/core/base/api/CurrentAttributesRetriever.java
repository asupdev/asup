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
package org.asup.os.core.base.api;

import org.asup.il.data.BinaryType;
import org.asup.il.data.QArray;
import org.asup.il.data.QBinary;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Program(name = "QWCRTVCA")
public class CurrentAttributesRetriever {

	public @Entry void main(@DataDef(length = 1000) QCharacter rcvvar, 
							@DataDef(binaryType = BinaryType.BYTE, value = "1000") QBinary rcvlen, 
							@DataDef(length = 8) QCharacter format,
							@DataDef(binaryType = BinaryType.BYTE) QBinary numval, 
							@DataDef(dimension = 100, binaryType = BinaryType.BYTE) QArray<QBinary> $ky, 
							QUSEC qusec) {
		
		
		
		"".toCharArray();
	}

	public static class QUSEC extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		public QBinary qusbprv;
		@DataDef(binaryType = BinaryType.BYTE)
		public QBinary qusbavl;
		@DataDef(length = 7)
		public QCharacter qusei;
		@DataDef(length = 1)
		public QCharacter quserved;
	}

}
