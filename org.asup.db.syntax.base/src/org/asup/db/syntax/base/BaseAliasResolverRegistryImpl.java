package org.asup.db.syntax.base;

import javax.inject.Inject;

import org.asup.db.syntax.QAliasResolver;
import org.asup.db.syntax.QQueryWriter;
import org.asup.db.syntax.impl.AliasResolverRegistryImpl;
import org.asup.fw.core.QPlugin;
import org.asup.fw.core.QPluginRegistry;
import org.asup.fw.core.QPluginRegistryFactory;

public class BaseAliasResolverRegistryImpl extends AliasResolverRegistryImpl {

	@SuppressWarnings("unchecked")
	@Inject
	public BaseAliasResolverRegistryImpl(QPluginRegistryFactory pluginRegistryFactory) {
		QPluginRegistry<? extends QPlugin> pluginRegistry = pluginRegistryFactory.createPluginRegistry(QQueryWriter.class);
		setStore((QPluginRegistry<QAliasResolver>) pluginRegistry);
	}

}
