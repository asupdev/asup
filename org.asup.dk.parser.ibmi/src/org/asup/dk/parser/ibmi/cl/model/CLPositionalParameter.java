/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Dario Foresti - Initial API and implementation
 */
package org.asup.dk.parser.ibmi.cl.model;


public class CLPositionalParameter extends CLAbstractComponent {
	
	CLValue value = null;
	
	public CLValue getValue() {
		return this.value;
	}

	public void setValue(CLValue value) {
		this.value = value;
	}
	
	@Override
	public CLComponentType getComponentType() {		
		return CLComponentType.POS_PARAMETER;
	}
}