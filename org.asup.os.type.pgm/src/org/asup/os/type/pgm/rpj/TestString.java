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

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------------------------");
		System.out.println("Estrazione variabile ");
		System.out.println("-----------------------------");

		String a = "CAMPO(ALFA(12) BETA(13) GAMMA(14))"; 
		String result = RPJStringSupport.p_rxatt(a, "ALFA(", "", false, "");
		System.out.println("Risultato " + result);

		System.out.println("-----------------------------");
		System.out.println("Sostituzione variabili ");
		System.out.println("-----------------------------");
		String b = "se a <> da b"; 
		result = RPJStringSupport.p_rxsos(b, "");
		System.out.println("Risultato " + result);
		System.out.println("-----------------------------");
		System.out.println("xLATE ");
		System.out.println("-----------------------------");
		b = "Vorrei sostituire le seguenti parole: AAAA è la prima serie AAAA è la seconda"; 
		result = RPJStringSupport.p_rxlate(b, "AAAA","1234","1");
		System.out.println("Risultato " + result);
		
	}

}
