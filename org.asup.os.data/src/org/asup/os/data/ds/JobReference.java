/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.asup.os.data.ds;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.annotation.DataDef;

public class JobReference extends QDataStructWrapper {

	private static final long serialVersionUID = 1L;

	@DataDef(length = 10)
	public QCharacter name = null;

	@DataDef(length = 10)
	public QCharacter user = null;

	@DataDef(length = 6)
	public QCharacter number = null;
}
