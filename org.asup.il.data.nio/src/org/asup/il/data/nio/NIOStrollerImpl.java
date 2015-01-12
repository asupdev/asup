package org.asup.il.data.nio;

import java.util.List;

import org.asup.il.data.QArray;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QNumeric;
import org.asup.il.data.QString;
import org.asup.il.data.QStroller;

public class NIOStrollerImpl<D extends QDataStruct> extends NIOScrollerImpl<D> implements QStroller<D> {

	private static final long serialVersionUID = 1L;

	public NIOStrollerImpl() {
		super();
	}
	
	public NIOStrollerImpl(D model, int dimension) {
		super(model, dimension);
	}

	@Override
	public String asString() {
//		absolute(1);
		return current().asString();
	}

	@Override
	public void cat(QString factor1) {
		current().cat(factor1);
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, QString factor2, int space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, String factor2, int space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1) {
		current().cat(factor1);
	}

	@Override
	public void cat(String factor1, QString factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public void cat(String factor1, QString factor2, int space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2) {
		current().cat(factor1, factor2);
	}

	@Override
	public void cat(String factor1, String factor2, int space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, Number space) {
		current().cat(factor1, space);
	}

	@Override
	public void cat(String factor1, Number space) {
		current().cat(factor1, space);		
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		return current().eq(value);
	}

	@Override
	public boolean eq(QString value) {
		return current().eq(value);
	}

	@Override
	public boolean eq(String value) {
		return current().eq(value);
	}

	@Override
	public void eval(boolean value) {
		current().eval(value);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		current().eval(value);
	}

	@Override
	public void eval(QBufferedData value) {
		current().eval(value);
	}

	@Override
	public void eval(String value) {
		current().eval(value);
	}

	@Override
	public void eval(QStroller<D> value) {
		value.eval(this);
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return current().ge(value);
	}

	@Override
	public boolean ge(QString value) {
		return current().ge(value);
	}

	@Override
	public boolean ge(String value) {
		return current().ge(value);
	}

	@Override
	public QBufferedData getElement(int position) {
		return current().getElement(position);
	}

	@Override
	public QBufferedData getElement(String name) {
		return current().getElement(name);
	}

	@Override
	public List<QBufferedData> getElements() {
		return current().getElements();
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return current().gt(value);
	}

	@Override
	public boolean gt(QString value) {
		return current().gt(value);
	}

	@Override
	public boolean gt(String value) {
		return current().gt(value);
	}

	@Override
	public void in() {
		current().in();
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return current().le(value);
	}

	@Override
	public boolean le(QString value) {
		return current().le(value);
	}

	@Override
	public boolean le(String value) {
		return current().le(value);
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return current().lt(value);
	}

	@Override
	public boolean lt(QString value) {
		return current().lt(value);
	}

	@Override
	public boolean lt(String value) {
		return current().lt(value);
	}

	@Override
	public void move(boolean value) {
		current().move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		current().move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void move(int value) {
		current().move(value);
	}

	@Override
	public void move(int value, boolean clear) {
		current().move(value, clear);
	}


	@Override
	public void move(QBufferedData value) {
		current().move(value);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void move(String value) {
		current().move(value);
	}

	@Override
	public void move(String value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void movea(QArray<?> value) {
		current().movea(value);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		current().movea(value, clear);
	}

	@Override
	public void movel(boolean value) {
		current().movel(value);
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		current().movel(value);
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(int value) {
		current().movel(value);
	}

	@Override
	public void movel(int value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(QBufferedData value) {
		current().movel(value);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(String value) {
		current().movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return current().ne(value);
	}

	@Override
	public boolean ne(QString value) {
		return current().ne(value);
	}

	@Override
	public boolean ne(String value) {
		return current().ne(value);
	}

	@Override
	public void out() {
		current().out();
	}

	@Override
	public String trim() {
		return current().trim();
	}

	@Override
	public String trimL() {
		return current().trimL();
	}

	@Override
	public String trimR() {
		return current().trimR();
	}

	@Override
	public void xlate(String from, String to, QString target) {
		current().xlate(from, to, target);
	}

	@Override
	public void xlate(QString from, QString to, QString target) {
		current().xlate(from, to, target);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space) {
		current().cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QNumeric space) {
		current().cat(factor1, space);
	}

	@Override
	public void cat(String factor1, QNumeric space) {
		current().cat(factor1, space);		
	}
}