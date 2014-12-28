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
package org.asup.os.type.dtaq.base.data;

import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.QBinary;
import org.asup.il.data.annotation.DataDef;

public class QueueSize extends QDataStructWrapper {
	private static final long serialVersionUID = 1L;
	@DataDef()
	public QBinary maximumNumberOfEntries;
	@DataDef()
	public QBinary initialNumberOfEntries;
}
