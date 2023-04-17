package com.automation.config;

import java.io.IOException;
import java.util.Properties;

import com.automation.util.PathHelper;

public class PropertyFileReader implements ConfigurationReader{
	
	Properties properties=null;
	
	public PropertyFileReader() {
		properties=new Properties();
		try {
			properties.load(PathHelper.getInputStreamResourcePath("/src/main/resources/ConfigurationFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		return properties.getProperty("url");
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}

	public String getUsername() {
		return properties.getProperty("Username");
	}

	public String getPassword() {
		return properties.getProperty("Password");
	}

	public String getProduct() {
		return properties.getProperty("Product");
	}	
}