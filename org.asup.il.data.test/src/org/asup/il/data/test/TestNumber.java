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
package org.asup.il.data.test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class TestNumber {

	public static void main(String[] args) {

	
		byte[] examples = {-128, -1, -2, -3, 0, 127, 1, 2, 79};

		for(byte b: examples){			
			System.out.println(formatBinary(b));
		}

		
		BigDecimal decimal = new BigDecimal("0.44", new MathContext(1, RoundingMode.HALF_UP));
		System.out.println(decimal);
		
		BigDecimal decimal2 = new BigDecimal(0.41, new MathContext(1, RoundingMode.HALF_UP));
		System.out.println(decimal2);
		
		System.out.println(decimal.compareTo(decimal2));
		System.out.println(decimal.equals(decimal2));
		
	}

	/**
	 * http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	 * @param b
	 * @return
	 */
	private static String formatBinary(byte b){
		
		
		String s = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
		
		return s;
	}
}
