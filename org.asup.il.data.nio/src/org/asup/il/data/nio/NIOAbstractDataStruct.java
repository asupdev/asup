package org.asup.il.data.nio;

import org.asup.il.data.QDataStruct;

public abstract class NIOAbstractDataStruct extends NIOCharacterImpl implements QDataStruct {

	public NIOAbstractDataStruct(int length) {
		super(length);
	}

/*	@Override
	public void reset() {
		for (QBufferedData element : this.getElements()) {
			element.reset();
		}
	}*/
}
