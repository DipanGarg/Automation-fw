package org.cts.configHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

public final class ConfigProvider {

	private static final String PROPERTIES_FILE = "//Resources//DBProperties.properties";
	private static Properties props = new Properties();
	public static final String WORKING_DIR=System.getProperty("user.dir");
	public static final String EXTENT_REPORTS_FOLDER=WORKING_DIR+"\\Resources\\DBProperties.properties";
	public static final String EXTENT_REPORTS_FOLDER1=WORKING_DIR+"\\Resources\\SeleniumProperties.properties";
	
	
	// static method to get the instance of the ConfigProvider
	
/*	private ConfigProvider() {
		  String ID = UUID.randomUUID().toString(); 
	}
	*/
	public static  ConfigProvider getInstance() throws FileNotFoundException {
		final ConfigProvider configProvider = new ConfigProvider();
		configProvider.loadProperties();
		return configProvider;
	}
	
	/*private InputStream getPropertiesFile() throws FileNotFoundException {
		return new FileInputStream(EXTENT_REPORTS_FOLDER);
		//	return this.getClass().getResourceAsStream(EXTENT_REPORTS_FOLDER);
		
	}*/
	
	private void loadProperties() {
		try {
			props.load(new FileInputStream(EXTENT_REPORTS_FOLDER));
			props.load(new FileInputStream(EXTENT_REPORTS_FOLDER1));
			} catch (Exception e) {
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
