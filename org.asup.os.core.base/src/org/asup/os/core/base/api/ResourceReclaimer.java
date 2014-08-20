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

import org.asup.il.data.annotation.Command;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;

@Command(name = "RCLRSC")
@Program(name = "QWCCRCRC")
public class ResourceReclaimer {

	@Entry
	public void main() {
	}
}
