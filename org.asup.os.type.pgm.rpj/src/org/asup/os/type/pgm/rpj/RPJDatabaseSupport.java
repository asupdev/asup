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

import org.asup.il.data.BinaryType;
import org.asup.il.data.QBinary;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QString;
import org.asup.il.data.annotation.DataDef;

public class RPJDatabaseSupport {

	@DataDef
	public SQLCA sqlca;
	
	public void qExecute(QString statement) {

	}
	
	public void qSelect(QString statement, QBufferedData into) {

	}

	public static class SQLCA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 8)
		public QCharacter sqlaid;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary sqlcabc;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary sqlcod;
	}
}