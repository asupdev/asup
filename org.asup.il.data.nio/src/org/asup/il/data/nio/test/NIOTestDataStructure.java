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

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.QDecimal;
import org.asup.il.data.annotation.DataDef;

public class NIOTestDataStructure extends QDataStructDelegator {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@DataDef(length=10)
	public QCharacter alfa;
	
	@DataDef(precision=5)
	public QDecimal decimal;

}