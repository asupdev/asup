package org.asup.il.data.nio;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataStruct;

public abstract class NIOAbstractDataStruct extends NIOCharacterImpl implements QDataStruct {

	public NIOAbstractDataStruct(int length, byte[] value) {
		super(length, value);
	}

	@Override
	public void reset() {
		for (QBufferedData element : this.getElements()) {
			element.reset();
		}
	}
}
