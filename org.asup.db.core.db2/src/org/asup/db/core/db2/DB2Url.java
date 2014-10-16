package org.asup.db.core.db2;

import java.util.Properties;

import org.eclipse.emf.common.util.URI;

public class DB2Url {
	private URI uri;
	private String databaseName = ""; 
	private Properties properties = new Properties();
	private int port;

	public DB2Url(String urlString) {
		String tempUrl = urlString.substring(0, urlString.indexOf("://"));
		String cleanUri = urlString.substring(tempUrl.lastIndexOf(":") + 1);	
		this.uri = URI.createURI(cleanUri);
		this.port = parsePort(this.uri.port());
		findDatabaseNameFrom(this.uri.path());
	}

	private int parsePort(String portString) {
		try {
			return Integer.parseInt(portString);
		} catch (NumberFormatException e) {
			return 50000;
		}
	}

	private void findDatabaseNameFrom(String path) {
		if (path != null && !path.trim().equals("")) {
			String[] tokens = path.substring(1).split(":");
			if (tokens.length > 0) {
				this.databaseName = tokens[0];
				if (tokens.length > 1) {
					findProperties(tokens[1]);
				}
			}
		}
	}

	private void findProperties(String propertiesString) {
		String[] tokens = propertiesString.split(";");
		for (String token : tokens) {
			putInProperty(token);
		}
	}

	private void putInProperty(String aProperty) {
		String[] tokens = aProperty.split("=");
		if (tokens.length >= 2) {
			properties.put(tokens[0], tokens[1]);
		}
	}

	public String getHost() {
		return this.uri.host();
	}

	public int getPort() {
		return this.port;
	}

	public String getDatabaseName() {
		return this.databaseName;
	}

	public Properties getProperties() {
		return this.properties;
	}

}
