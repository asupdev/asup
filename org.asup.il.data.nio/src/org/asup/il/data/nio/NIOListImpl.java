package org.asup.il.data.nio;

import java.util.ArrayList;
import java.util.Iterator;

import org.asup.il.data.QData;
import org.asup.il.data.QDataVisitor;
import org.asup.il.data.QList;
import org.asup.il.data.QNumeric;

public class NIOListImpl<D extends NIODataImpl> extends NIODataImpl implements QList<D> {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<D> _elements;
	private D _model;
	private int _dimension;
	
	public NIOListImpl(D model, int dimension) {
		this._model = model;
		this._dimension = dimension;
		this._elements = new ArrayList<D>(_dimension);
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);		
	}

	@Override
	public void clear() {
		_elements.clear();
	}

	@Override
	public void eval(Object value) {
		
		if(value instanceof QList<?>) {
			
			clear();
			
			int i=1;
			for(QData element: (QList<?>)value) {
				get(i).eval(element);
				i++;
			}
			return;
		}
		
		System.err.println("unexpcected condition: 7fjzs9yuwef");
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub		
	}

	@Override
	public boolean isEmpty() {
		return _elements.isEmpty();
	}

	@Override
	public Iterator<D> iterator() {
		return _elements.iterator();
	}

	@SuppressWarnings("unchecked")
	@Override
	public D get(int index) {

		D element = null;
		if(_elements.size() >= index)
			element = _elements.get(index-1);
		
		if(element == null) {
			element = (D) _model.copy();
			_elements.add(index-1, element);
			
			return element;
		}
		else
			return element;
	}

	@Override
	public D get(QNumeric index) {
		return get(index.asInteger());
	}

	@Override
	public int capacity() {
		if(count() >= _dimension)
			return count();
		else
			return _dimension;				
	}

	@Override
	public QData copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		return _elements.size();
	}

}