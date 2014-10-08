package org.asup.il.data.nio;

import org.asup.il.data.QBufferedData;
import org.asup.il.data.QNumeric;

public abstract class NIONumericImpl extends NIOBufferedDataImpl implements QNumeric {

	private static final long serialVersionUID = 1L;

	public abstract Number readNumber();
	
	public abstract void writeNumber(Number number);
	
	public abstract int compareNumber(Number value);
	
	public NIONumericImpl() {
		super();
	}
	
	protected <E extends Enum<E>> Number getPrimitive(E value) {
		if(value.name().equals("ZEROS"))
			return 0;
		else if(value.name().equals("ZERO"))
			return 0;
		else if(value.name().equals("LOVAL"))
			return 0;
		return 0;
	}

/*	@Override
	public void reset() {
		if(_default != null)
			eval(_default);
		else
			eval(0);
	}*/
	
	
	@Override
	public String toString() {
		return readNumber().toString();		
	}
	
	@Override
	public short asShort() {
		return readNumber().shortValue();
	}
	
	@Override
	public String asString() {
		return readNumber().toString();
	}

	@Override
	public int asInteger() {
		return readNumber().intValue();
	}
	
	@Override
	public long asLong() {
		return readNumber().longValue();
	}
	
	@Override
	public void eval(short value) {
		writeNumber(value);
	}

	@Override
	public void eval(int value) {
		writeNumber(value);		
	}

	@Override
	public void eval(long value) {
		writeNumber(value);		
	}

	@Override
	public void eval(QNumeric value) {
		writeNumber(value.asLong());		
	}

	@Override
	public void eval(QBufferedData value) {
		move(value, true);
	}

	@Override
	public void eval(Object value) {
		
		if (value == null) {
			clear();
			return;
		}
		else if(value.toString().isEmpty()) {
			clear();
		}
		else {
			eval(Long.parseLong(new String(value.toString())));
		}
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		eval(getPrimitive(value));		
	}

	@Override
	public boolean eq(Number value) {
		return compareNumber(value) == 0;
	}

	@Override
	public boolean eq(QNumeric value) {
		return compareNumber(value.asLong()) == 0;
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		return eq(getPrimitive(value));
	}
	
	@Override
	public boolean ne(Number value) {
		return !eq(value);
	}

	@Override
	public boolean ne(QNumeric value) {
		return !eq(value);
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return !eq(value);
	}

	@Override
	public boolean ge(Number value) {
		return compareNumber(value) >= 0;
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return ge(getPrimitive(value));
	}

	@Override
	public boolean ge(QNumeric value) {
		return compareNumber(value.asLong()) >= 0;
	}

	@Override
	public boolean gt(Number value) {
		return compareNumber(value) > 0;
	}

	@Override
	public boolean gt(QNumeric value) {
		return compareNumber(value.asLong()) > 0;
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return gt(getPrimitive(value));
	}

	@Override
	public boolean le(Number value) {
		return compareNumber(value) <= 0;
	}


	@Override
	public boolean le(QNumeric value) {
		return compareNumber(value.asLong()) <= 0;
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return le(getPrimitive(value));
	}
	
	@Override
	public boolean lt(Number value) {
		return compareNumber(value) < 0;
	}


	@Override
	public boolean lt(QNumeric value) {
		return compareNumber(value.asLong()) < 0;
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return lt(getPrimitive(value));
	}
	
	@Override
	public void plus(short value) {
		eval(asLong()+value);		
	}

	@Override
	public void plus(long value) {
		eval(asLong()+value);		
	}

	@Override
	public void plus(int value) {
		eval(asLong()+value);		
	}

	@Override
	public void plus(QNumeric value) {
		eval(asLong()+value.asLong());
	}

	@Override
	public void minus(short value) {
		eval(asLong()-value);
	}

	@Override
	public void minus(long value) {
		eval(asLong()-value);		
	}

	@Override
	public void minus(int value) {
		eval(asLong()-value);		
	}

	@Override
	public void minus(QNumeric value) {
		eval(asLong()-value.asLong());		
	}

	@Override
	public void mult(short value) {
		eval(asLong()*value);		
	}

	@Override
	public void mult(long value) {
		eval(asLong()-value);		
	}

	@Override
	public void mult(int value) {
		eval(asLong()-value);		
	}

	@Override
	public void mult(QNumeric value) {
		eval(asLong()-value.asLong());		
	}

	@Override
	public void divide(short value) {
		eval(asLong()/value);
	}

	@Override
	public void divide(int value) {
		eval(asLong()/value);		
	}

	@Override
	public void divide(long value) {
		eval(asLong()/value);		
	}

	@Override
	public void divide(QNumeric value) {
		eval(asLong()/value.asLong());
	}
	
	@Override
	public void power(short value) {
		eval(asLong()^value);		
	}

	@Override
	public void power(long value) {
		eval(asLong()^value);		
	}

	@Override
	public void power(int value) {
		eval(asLong()^value);		
	}

	@Override
	public void power(QNumeric value) {
		eval(asLong()^value.asLong());		
	}
	
	@Override
	public void move(String value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), size(), value.getBytes(), clear, getFiller());
	}
	
	@Override
	public <E extends Enum<E>> void move(E value) {
		move(getPrimitive(value));		
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		move(getPrimitive(value), clear);		
	}


	@Override
	public void movel(String value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), size(), value.getBytes(), clear, getFiller());
	}
	
	@Override
	public <E extends Enum<E>> void movel(E value) {
		movel(getPrimitive(value));		
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		movel(getPrimitive(value), clear);		
	}
}