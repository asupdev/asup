package org.asup.db.syntax.base;

import javax.inject.Inject;

import org.asup.db.syntax.QNameHelper;
import org.asup.db.syntax.QQueryWriter;
import org.asup.db.syntax.impl.NameHelperRegistryImpl;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;

public class BaseNameHelperRegistryImpl extends NameHelperRegistryImpl {

	@SuppressWarnings("unchecked")
	@Inject
	public BaseNameHelperRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		QPluginRegistry<? extends QPlugin> pluginRegistry = pluginRegistryFactory.createPluginRegistry(QQueryWriter.class);
		setStore((QPluginRegistry<QNameHelper>) pluginRegistry);
	}

}
