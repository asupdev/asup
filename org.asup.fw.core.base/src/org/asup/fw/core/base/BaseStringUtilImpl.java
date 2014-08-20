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
package org.asup.fw.core.base;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.asup.fw.core.impl.ServiceImpl;
import org.asup.fw.util.QStringUtil;

@Singleton
public class BaseStringUtilImpl extends ServiceImpl implements QStringUtil {

	@Override
	public String firstToUpper(String string) {
		StringBuffer s = new StringBuffer(string.length());
		CharacterIterator it = new StringCharacterIterator(string);
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
			if(it.getIndex()==0) {
				s.append(String.valueOf(ch).toUpperCase());
			} else {
				s.append(ch);
			}
		}
		return s.toString();
	}

	@Override
	public String appendChars(String string, String chars, int times, boolean before) {
		
		StringBuffer sb = new StringBuffer();
		
		if(!before)
			sb.append(string);
		
		for(int x=0; x<times; x++)
			sb.append(chars);
		
		if(before)
			sb.append(string);
		
		sb.trimToSize();
		
		return sb.toString();
	}
	
	@Inject
	public String removeFirstChar(String str) {
		if(str.length() == 0)
			return str;
		if(str.length() == 1)
			return "";
		
		return str.substring(1);
	}
	
	@Inject
	public String removeLastChar(String str) {
		if(str.length() == 0)
			return str;
		if(str.length() == 1)
			return "";
		
		return str.substring(0, str.length() - 1);
	}
}
