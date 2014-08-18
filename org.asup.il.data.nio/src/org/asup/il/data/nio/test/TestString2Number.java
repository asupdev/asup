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

public class TestString2Number {

	public static final int RADIX = Character.MAX_RADIX;
	
	public static void main(String[] args) {

		long timeIni = System.currentTimeMillis();
		for(int i=0; i<1000000;i++) {
			Long.parseLong("ZZZZZZZZZZZZ", RADIX);
		}
		long timeEnd = System.currentTimeMillis();
		
		System.out.println(timeEnd-timeIni);
		
		for(int i=0; i<36;i++) {
			System.out.println(Integer.toString(i, RADIX));
		}
	}

}
