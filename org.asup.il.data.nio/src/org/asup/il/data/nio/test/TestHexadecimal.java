package org.asup.il.data.nio.test;

import java.io.UnsupportedEncodingException;

import org.asup.il.data.nio.NIOCharacterImpl;
import org.asup.il.data.nio.NIODecimalImpl;

public class TestHexadecimal {
	
	private static String ENCODING = "IBM-280";
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		int i= Integer.parseInt("40",16);
		System.out.println("Decimal:="+ i);
		
		
		NIODecimalImpl decimal = new NIODecimalImpl(10, 0, null);
		decimal.allocate();
		decimal.eval(64);

		NIOCharacterImpl character = new NIOCharacterImpl(15, null);
		character.allocate();
		byte[] bytes = new byte[1];
		bytes[0] = 64;
		character.movel(new String(bytes, ENCODING));
		System.out.println(character.toString());

		character.movel(decimal);
		
		String inputHex = null;
		
		inputHex = "40";
		System.out.println(fromHexString(inputHex));
		System.out.println(Integer.parseInt(inputHex, 16));
	}
	

	public static String fromHexString(String hex) {
	    StringBuilder str = new StringBuilder();
	    for (int i = 0; i < hex.length(); i+=2) {
	        str.append((char) Integer.parseInt(hex.substring(i, i + 2), 16));
	    }
	    return str.toString();
	}
}
