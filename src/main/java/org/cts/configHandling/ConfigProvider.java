package org.cts.configHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.cts.utils.Constants;

public final class ConfigProvider {

	private static final String PROPERTIES_FILE = Constants.WORKING_DIR + "\\src\\test\\resources\\";
	private static Properties props = new Properties();

	/**
	 * static method to get the instance of the ConfigProvider 
	 * @param propertyFileName
	 * @return ConfigProvider
	 * @throws FileNotFoundException
	 */
	public static ConfigProvider getInstance(String propertyFileName) throws FileNotFoundException {
		final ConfigProvider configProvider = new ConfigProvider();
		String path = PROPERTIES_FILE + propertyFileName + ".properties";
		configProvider.loadProperties(path);
		return configProvider;
	}

	/**
	 * static method to get the instance of the ConfigProvider 
	 * @return ConfigProvider
	 * @throws FileNotFoundException
	 */
	public static ConfigProvider getInstance() throws FileNotFoundException {
		final ConfigProvider configProvider = new ConfigProvider();
		configProvider.loadProperties();
		return configProvider;
	}

	private void loadProperties() {
		try {
			File folder = new File(PROPERTIES_FILE);
			File[] listOfFiles = folder.listFiles();
			for (File file : listOfFiles) {
				if (file.isFile() && file.getName().endsWith(".properties")) {
					props.load(new FileInputStream(folder + "\\" + file.getName()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void loadProperties(String propertyFile) {
		try {
			File file = new File(propertyFile);
			if (file.isFile() && file.getName().endsWith(".properties")) {
				props.load(new FileInputStream(file));

			}
		} catch (Exception e) {
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
