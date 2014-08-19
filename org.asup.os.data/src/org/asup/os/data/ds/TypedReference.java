/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.data.ds;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructDelegator;
import org.asup.il.data.annotation.DataDef;
import org.asup.os.type.QTypedObject;

public class TypedReference<T extends QTypedObject> extends QDataStructDelegator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@DataDef(length = 10)
	public QCharacter name;

	@DataDef(length = 10)
	public QCharacter library;

}
