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

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QIndicator;

public class RPJServiceSupport {

	@Inject
	private QDataFactory qDF;
	
	public QCharacter p_rxsos(String arg1, String arg2){

		StringBuffer nameBuffer = new StringBuffer();
		String a = "";
		
		for(char c: arg1.toCharArray()) {
			if(c=='|') {
//				a = "_$_PIPE_$_";
//				nameBuffer.append(a);
				nameBuffer.append(c);
			}
			else if(c=='&') {
				a = "&amp;";
				nameBuffer.append(a);
			}
			else if(c=='>') {
				a = "&gt;";
				nameBuffer.append(a);
			}
			else if(c=='<') {
				a = "&lt;";
				nameBuffer.append(a);
			}
			else if(c=='\'') {
				a = "&apos;";
				nameBuffer.append(a);
			}
			else if(c=='"') {
				a = "&quot;";
				nameBuffer.append(a);
			}
			else {
				nameBuffer.append(c);
			}
		}
		String string = nameBuffer.toString();
		QCharacter value = qDF.createCharacter(string.length(), true, true);
		value.eval(string);
		
		return value; 
	}
	public QCharacter p_rxatt(String arg0, String arg1, String arg2, QIndicator arg3, QCharacter arg4){

		QCharacter value = qDF.createCharacter(30000, true, true);

		// data una stringa cerca il valore fra "()" di un attributo
		// cerco "(" nell'attributo
		if(arg1.indexOf("(")==-1){
			arg1=arg1+"(";	
		}
		//lunghezza stringa
		int $L = arg1.length();
		// indice iniziale 
		int $I = arg0.indexOf(arg1);
		if($I == -1){
			value.eval("");
			return value;
		}
		// indice iniziale 
		int $F = arg0.indexOf(")", $I);
		if($F == -1){
			value.eval("");
			return value;
		}
		
		// dati i due indici estraggo il testo
//		return arg0.substring($I+$L,$F);
		value.eval(arg0.substring($I+$L,$F));
		
		return value; 

	}
	public QCharacter p_rxlate(String arg0, String arg1, String arg2, String arg3){

		QCharacter value = qDF.createCharacter(32766, true, true);
		
		if(arg0==null) 
			arg0 = "";
		if(arg1==null) 
			arg1 = "";
		if(arg2==null) 
			arg2 = "";
		if(arg3==null) 
			arg3 = "";
		StringBuffer nameBuffer = new StringBuffer();
		int $A = arg0.length();
		int $B = arg1.length();
		if($B<=$A){
			int $I = 0;
			$I = arg0.substring($I).indexOf(arg1);
			if($I<=0){
				value.eval("");
				return value;
			}
			nameBuffer.append(arg0.substring(0,$I));
			if(arg3.equals("1")){
				nameBuffer.append(arg0.substring($I).replaceFirst(arg1,arg2));
			}else{
				nameBuffer.append(arg0.substring($I).replace(arg1,arg2));
			}
			value.eval(nameBuffer.toString());
			return value; 
		}
		value.eval("");
		return value; 
	}
}