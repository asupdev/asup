package org.asup.il.data.nio.test;

import java.nio.ByteBuffer;

public class TestNIO {

	public TestNIO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ByteBuffer buffer = ByteBuffer.allocate(2);
		buffer.putShort((short) 32769);
		buffer.rewind();
		byte[] array = buffer.array();
		System.out.println(array);

	}

}
