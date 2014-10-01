package org.asup.il.data.nio.test;

import java.io.UnsupportedEncodingException;

import org.asup.il.data.nio.NIOCharacterImpl;

public class TestHexadecimal {
	
	private static String ENCODING = "IBM-280";
	
	public static void main(String[] args) throws UnsupportedEncodingException {

		String inputHex = "C1A24BE4D7";
		
		byte[] bytes = new byte[5];
		for(int i=0; i<5; i++) {
			String hex = new String(inputHex.substring(2*i, 2*i+2));
			int b = Integer.parseInt(hex,16);
			bytes[i] = (byte) b;
		}

		NIOCharacterImpl character = new NIOCharacterImpl(15, null);
		character.allocate();
		character.movel(new String(bytes, ENCODING));
		System.out.println(character.toString());

	}
}
