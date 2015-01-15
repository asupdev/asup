package org.asup.il.isam;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.asup.il.data.QBufferedDataDelegator;
import org.asup.il.data.QDataStructWrapper;
import org.asup.il.data.annotation.DataDef;
import org.asup.il.isam.annotation.Descend;
import org.asup.il.isam.annotation.Index;

public abstract class QRecordWrapper extends QDataStructWrapper implements QRecord, QBufferedDataDelegator {

	private static final long serialVersionUID = 1L;

	private QIndex index;
	
	@Override
	public QIndex getIndex() {

		if(index == null) {
			synchronized (this) {
				if(index == null) {
					try {
						
						Class<?> keyKlass = null; 
						
						for(Class<?> klass: this.getClass().getDeclaredClasses()) {
							
							if(klass.getAnnotation(Index.class) != null) {
								keyKlass = klass;
								break;
							}
						}
						
						if(keyKlass == null)
							return null;
												
						index = new VirtualIndex(keyKlass);
					} catch (SecurityException | IllegalArgumentException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return index;
	}

	public class VirtualIndex implements QIndex {
		
		private Class<?> klass;
		
		public VirtualIndex(Class<?> klass) {
			this.klass = klass;
		}
		
		List<QIndexColumn> columns = new ArrayList<QIndexColumn>();
		
		@Override
		public List<QIndexColumn> getColumns() {
		
			if(this.columns.isEmpty()) {
				synchronized (this.columns) {
					for(final Field field: klass.getFields()) {
			
						try {
							
							DataDef dataDef = field.getAnnotation(DataDef.class);
							if(dataDef == null) {
								Class<?> dictionaryClass = klass.getDeclaringClass().getSuperclass();
								Field dictionaryField = dictionaryClass.getField(field.getName());
								if(dictionaryField == null)
									continue;

								dataDef = dictionaryField.getAnnotation(DataDef.class);
							}
									
							if(dataDef == null)
								continue;
							
							final int precision = dataDef.precision();
							final int length = dataDef.length();
																
							QIndexColumn indexColumn = new QIndexColumn() {

								
								@Override
								public String getName() {
									return field.getName();
								}

								@Override
								public OperationDirection getDirection() {
									if(field.getAnnotation(Descend.class) != null)
										return OperationDirection.BACKWARD;
									else
										return OperationDirection.FORWARD;
								}

								@Override
								public boolean isNumeric() {
									return precision != 0;
								}

								@Override
								public int getLength() {
									if(isNumeric())
										return precision;
									else
										return length;
								}
								
							};
							
							this.columns.add(indexColumn);

						} catch (NoSuchFieldException | SecurityException e1) {
							e1.printStackTrace();
						}
					}

				}
			}
			return this.columns;
		}
	}
}