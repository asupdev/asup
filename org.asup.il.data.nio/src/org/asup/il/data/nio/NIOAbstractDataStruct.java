package org.asup.il.data.nio;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataStruct;

public abstract class NIOAbstractDataStruct extends NIOCharacterImpl implements QDataStruct {

	private static final long serialVersionUID = 1L;

	public NIOAbstractDataStruct() {
		super();
	}

	public NIOAbstractDataStruct(int length) {
		super(length);
	}

	@Override
	public void clear() {
		for (QBufferedData element : this.getElements()) {
			element.clear();
		}
	}
	

	@Override
	public boolean isEmpty() {

		for (QBufferedData element : this.getElements()) {
			if(!element.isEmpty())
				return false;
		}

		return true;
	}

}
