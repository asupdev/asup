/** 
 * 
Copyright (coffee) 2012, 2013 Sme.UP and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.asup.os.type.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.asup.il.data.QCharacter;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.data.annotation.Entry;
import org.asup.il.data.annotation.Program;
import org.asup.os.core.jobs.QJob;

@Program(name = "QP0LCRML", messages = { "CPFA0AB", "CPFA0A1", "CPFA0A7",
		"CPFA0A9", "CPFA0BD", "CPFA0B1", "CPFA0B2", "CPFA0B7", "CPFA085",
		"CPFA09C", "CPFA093", "CPFB8ED", "CPF1645", "CPF1646", "CPF2213",
		"CPF2214", "CPF2225", "CPF224A", "CPF2242", "CPF2244", "CPF225A",
		"CPF2259", "CPF2260", "CPF2261", "CPF2262", "CPF2269", "CPF2272",
		"CPF2291", "CPF2292", "CPF2293", "CPF24A8", "CPF24B3", "CPF2531",
		"CPF2532", "CPF2548", "CPF2551", "CPF3220", "CPF3224", "CPF323C",
		"CPF323D", "CPF323F", "CPF3231", "CPF324B", "CPF324C", "CPF3245",
		"CPF325D", "CPF327C", "CPF327E", "CPF329D", "CPF3323", "CPF3330",
		"CPF3353", "CPF3373", "CPF3374", "CPF3467", "CPF3469", "CPF36F7",
		"CPF7003", "CPF7010", "CPF7014", "CPF8127", "CPF8176", "CPF9802",
		"CPF9807", "CPF9808", "CPF9814", "CPF9819", "CPF9820", "CPF9825",
		"CPF9827", "CPF9833", "CPF9876", "CPI4304", "CPI4305", "CPI4306",
		"CPI4307", "OPT1555", "OPT1605", "OPT1640", "OPT1790", "OPT1795",
		"OPT1805", "OPT1810", "OPT1813", "OPT1815", "OPT1820", "OPT1821",
		"OPT1825", "OPT1860", "OPT1861", "OPT1862", "OPT1863", "OPT1872",
		"OPT2001", "OPT2004", "OPT2005", "OPT2006", "OPT2007", "OPT2008",
		"OPT2009", "OPT2010", "OPT2015", "OPT2028", "OPT2029", "OPT2040",
		"OPT2301", "OPT2420", "OPT2422", "OPT7740" })
public class DeleteObject {

	@Inject QJob job;
	
	@Entry
	public void main(@DataDef(length = 5000) QCharacter objectLink) throws IOException {
		
		/*		URI uri = URI.createURI(objectLink.trimR());
		String library = uri.scheme().toUpperCase();
		String type = uri.host();
		String name = uri.lastSegment();
		
		QSourceEntry sourceEntry = sourceManager.getObjectEntry(job, library, type, name);
		if(sourceEntry != null)
			sourceManager.removeEntry(job, sourceEntry);
		else
			throw new OperatingSystemRuntimeException("OPT1862");*/
	}
}
