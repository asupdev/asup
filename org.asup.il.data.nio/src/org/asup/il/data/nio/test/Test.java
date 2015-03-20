package org.asup.il.data.nio.test;

import org.asup.il.data.nio.NIOCharacterImpl;
import org.asup.il.data.nio.NIODecimalImpl;

public class Test {


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		NIODecimalImpl decimal = new NIODecimalImpl(4, 2);
		decimal.allocate();

		decimal.eval(1);
		
		byte[] bytes = decimal.asBytes();
		
		System.out.println(decimal.toString());
		
		System.out.println(decimal.asString());

		
		NIOCharacterImpl character = new NIOCharacterImpl(4);
		character.allocate();
		
		character.movel("0   ");
		
		bytes = character.asBytes();
		
		System.out.println(character.toString());
		
		System.out.println(character.asString());
	}
}
