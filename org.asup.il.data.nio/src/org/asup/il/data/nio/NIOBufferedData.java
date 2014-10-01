package org.asup.il.data.nio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QData;
import org.asup.il.data.QDataDelegator;

public abstract class NIOBufferedData implements QBufferedData, Serializable {
	
	private NIOBufferedData _parent;

	private transient ByteBuffer _buffer;
	private int _position;
	
	public abstract void allocate();
	
	protected ByteBuffer getBuffer() {
		
		if(_buffer != null)
			return _buffer;		
		else if(_parent != null)
			return _parent.getBuffer();		
		else
			return null;
	}
	
	protected NIOBufferedData getParent() {
		return this._parent;
	}
	
	protected void setParent(NIOBufferedData parent) {
		this._parent = parent;
	}
	
	protected void setBuffer(ByteBuffer buffer) {
		_buffer = buffer;
	}
	
	protected int getPosition() {
		
		if(_parent != null)
			return _parent.getPosition()+_position;
		else
			return _position;
	}
	
	protected void setPosition(int position) {
		_position = position;
	}
	
	private void writeObject(ObjectOutputStream stream) throws IOException {
		
		byte[] array = null;
		if(_buffer != null)
			array = _buffer.array();
		else
			array = new byte[0];		
		stream.writeInt(array.length);
		stream.write(array);
		
		stream.writeInt(_position);
	}

	private void readObject(ObjectInputStream stream) throws IOException {
	
		int length = stream.readInt();
		byte[] array = new byte[length];
		stream.read(array);

		_position = stream.readInt();

		// TODO
		if(_position == 538976288)
			_position = 0;
		
		if(_parent == null) {		
			_buffer = ByteBuffer.allocate(length);
			_buffer.put(array);
		}
	}

	@Override
	public void assign(QBufferedData value) {
		slice(value, 0);
	}

	public void slice(QBufferedData target, int position) {

		NIOBufferedData nioBufferedData = getNIOBufferedData(target);

		if(nioBufferedData == null)
			throw new FrameworkCoreRuntimeException("No buffer reference found: " + target.getClass());
		
		setReference(nioBufferedData, position);
	}

	private void setReference(NIOBufferedData nioBufferedData, int position) {
		
		nioBufferedData.setParent(this);
		nioBufferedData.setBuffer(null);
		nioBufferedData.setPosition(getPosition() + position);
	}
	
	private NIOBufferedData getNIOBufferedData(QData bufferedData) {
		
		NIOBufferedData nioBufferedData = null;
		
		if (bufferedData instanceof NIOBufferedData) {
			nioBufferedData = (NIOBufferedData) bufferedData;
		}
		else if (bufferedData instanceof QDataDelegator) {
			QDataDelegator dataDelegator = (QDataDelegator)bufferedData;
			nioBufferedData = getNIOBufferedData(dataDelegator.getDelegate());
		}
		
		return nioBufferedData;
	}
}
