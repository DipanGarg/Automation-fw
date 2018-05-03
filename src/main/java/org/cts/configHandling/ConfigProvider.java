package org.cts.configHandling;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigProvider {

	private static final String PROPERTIES_FILE = "/Resource/DBProperties.properties";
	private static Properties props = new Properties();
	
	// static method to get the instance of the ConfigProvider
	
	public static ConfigProvider getInstance() {
		final ConfigProvider configProvider = new ConfigProvider();
		configProvider.loadProperties(configProvider.getPropertiesFile());
		System.out.println("Inside getinstance %%%^^^^%%%%^^$#$%#%#");
		return configProvider;
	}
	
	private InputStream getPropertiesFile() {
		return this.getClass().getResourceAsStream(PROPERTIES_FILE);
				
	}
	
	private void loadProperties(InputStream inputStream) {
		try {
			props.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getProperty(String key) {
		return props.getProperty(key);
	}
	
	public void setProperty(String key, String value) {
		props.setProperty(key, value);
	}
}
