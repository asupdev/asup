package org.asup.il.data.test;

import java.io.UnsupportedEncodingException;

import javax.inject.Inject;

import org.asup.fw.core.QApplication;
import org.asup.fw.test.annotation.TestStarted;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataFactory;
import org.asup.il.data.QDataManager;

public class TestHexadecimal {
	
	@Inject
	private QApplication application;
	@Inject
	private QDataManager dataManager;
	
	private static String ENCODING = "IBM-280";
	
	@TestStarted
	public void doTest() throws UnsupportedEncodingException {
		
		QDataFactory dataFactory = dataManager.createFactory(application);
		
		String inputHex = "C1A24BE4D7";
		
		byte[] bytes = new byte[inputHex.length()/2];
		for(int i=0; i<bytes.length; i++) {
			String hex = new String(inputHex.substring(2*i, 2*i+2));
			bytes[i] = (byte) Integer.parseInt(hex,16);
		}

		QCharacter character = dataFactory.createCharacter(15, false, true);
		character.movel(new String(bytes, ENCODING));
		
	}
}
