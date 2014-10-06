package org.asup.il.data.nio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

import org.asup.fw.core.FrameworkCoreRuntimeException;
import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QData;
import org.asup.il.data.QDataDelegator;
import org.asup.il.data.QDataVisitor;

public abstract class NIOBufferedDataImpl extends NIODataImpl implements QBufferedData, Serializable {
	
	private NIOBufferedDataImpl _parent;

	private transient ByteBuffer _buffer;
	private int _position;
	
	protected abstract byte getFiller();
	
	protected ByteBuffer getBuffer() {
		
		if(_buffer != null)
			return _buffer;		
		else if(_parent != null)
			return _parent.getBuffer();		
		else
			return null;
	}

	public void allocate() {
		setBuffer(ByteBuffer.allocate(size()));
		
		reset();		
	}

	protected NIOBufferedDataImpl getParent() {
		return this._parent;
	}
	
	protected void setParent(NIOBufferedDataImpl parent) {
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
	public void assign(QBufferedData target) {
		NIOBufferedDataImpl nioBufferedData = getNIOBufferedData(target);

		if(nioBufferedData == null)
			throw new FrameworkCoreRuntimeException("No buffer reference found: " + target.getClass());

		nioBufferedData.setBuffer(getBuffer());
		nioBufferedData.setPosition(getPosition());

//		slice(value, 0);
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	public void slice(QBufferedData target, int position) {

		NIOBufferedDataImpl nioBufferedData = getNIOBufferedData(target);

		if(nioBufferedData == null)
			throw new FrameworkCoreRuntimeException("No buffer reference found: " + target.getClass());
		
		nioBufferedData.setParent(this);
		nioBufferedData.setBuffer(null);
		nioBufferedData.setPosition(getPosition() + position);

	}
	
	private NIOBufferedDataImpl getNIOBufferedData(QData bufferedData) {
		
		NIOBufferedDataImpl nioBufferedData = null;
		
		if (bufferedData instanceof NIOBufferedDataImpl) {
			nioBufferedData = (NIOBufferedDataImpl) bufferedData;
		}
		else if (bufferedData instanceof QDataDelegator) {
			QDataDelegator dataDelegator = (QDataDelegator)bufferedData;
			nioBufferedData = getNIOBufferedData(dataDelegator.getDelegate());
		}
		
		return nioBufferedData;
	}
	
	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(getBuffer(), getPosition(), size());
	}


	@Override
	public void move(int value) {
		move(value, false);
	}

	@Override
	public void move(int value, boolean clear) {
		move(Integer.toString(value), clear);
	}
	
	@Override
	public void move(Number value) {
		move(value, false);
	}

	@Override
	public void move(Number value, boolean clear) {
		move(value.toString(), clear);
	}	

	@Override
	public void move(QBufferedData value) {
		move(value, false);
	}
	
	@Override
	public void move(QBufferedData value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), size(), value.asBytes(), clear, getFiller());
	}

	@Override
	public void move(String value) {
		move(value, false);
	}	
	
	@Override
	public void movea(QArray<?> value) {
		movea(value, false);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		for (int i = 1; i <= value.capacity(); i++) {
			movel(value.get(i), clear);
		}
	}

	@Override
	public void movel(int value) {
		movel(value, false);
	}

	@Override
	public void movel(int value, boolean clear) {
		movel(Integer.toString(value), clear);
	}
	
	@Override
	public void movel(Number value) {
		movel(value, false);
	}

	@Override
	public void movel(Number value, boolean clear) {
		movel(value.toString(), clear);		
	}
	
	@Override
	public void movel(String value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedData value) {
		movel(value, false);
	}
	
	@Override
	public void movel(QBufferedData value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), size(), value.asBytes(), clear, getFiller());
	}
}
