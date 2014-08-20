/**
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.asup.os.type.pgm.base;

import java.io.PrintStream;
import java.util.Iterator;

import org.asup.il.data.QArray;
import org.asup.il.data.QBinary;
import org.asup.il.data.QBoolean;
import org.asup.il.data.QBufferedData;
import org.asup.il.data.QCharacter;
import org.asup.il.data.QDataStruct;
import org.asup.il.data.QDatetime;
import org.asup.il.data.QDecimal;
import org.asup.il.data.QEnum;
import org.asup.il.data.QFloating;
import org.asup.il.data.QGraphic;
import org.asup.il.data.QHexadecimal;
import org.asup.il.data.QIdentifier;
import org.asup.il.data.QIndicator;
import org.asup.il.data.QPointer;
import org.asup.il.data.QScroller;
import org.asup.il.data.QStroller;
import org.asup.il.data.impl.DataVisitorImpl;

public class BaseProgramMemoryPrinter extends DataVisitorImpl {

	PrintStream ps;
	String prefix;
	
	public BaseProgramMemoryPrinter(PrintStream ps) {
		this.ps = ps;
		this.prefix = null;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	@Override
	public boolean visit(QArray<?> data) {
		return super.visit(data);
	}

	@Override
	public boolean visit(QBinary data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QBoolean data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QCharacter data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QDataStruct data) {
		
		print("");
		
		Iterator<QBufferedData> elements = data.getElements().iterator();
		BaseProgramMemoryPrinter childPrinter = new BaseProgramMemoryPrinter(ps);
		while(elements.hasNext()) {
			elements.next().accept(childPrinter);
			if(elements.hasNext())
				ps.print("/");
		}

		return false;
	}

	@Override
	public boolean visit(QDatetime data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QDecimal data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QEnum<?, ?> data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QFloating data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QGraphic data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QHexadecimal data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QIdentifier data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QIndicator data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QPointer data) {
		
		print(data);		

		return super.visit(data);
	}

	@Override
	public boolean visit(QScroller<?> data) {
		return super.visit(data);
	}

	@Override
	public boolean visit(QStroller<?> data) {
		return super.visit(data);
	}
	
	private void print(Object object) {
		if(prefix != null)
			ps.print(prefix);
		
		ps.print(object.toString());
		ps.flush();
	}
}
