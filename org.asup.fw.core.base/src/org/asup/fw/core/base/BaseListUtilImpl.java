package org.asup.fw.core.base;

import java.util.List;
import org.asup.fw.core.impl.ServiceImpl;
import org.asup.fw.util.QListUtil;

public class BaseListUtilImpl extends ServiceImpl implements QListUtil {

	@Override
	public <E> void addFirst(List<E> list, E element) {
		list.add(0, element);
	}

	@Override
	public <E> void addLast(List<E> list, E element) {
		list.add(list.size()-1, element);
	}
}
