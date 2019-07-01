package com.redbus.Utills;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ActionUtils {
	
	public static String getProertyValue(String propertyFilePath,String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(propertyFilePath);
		prop.load(fis);
		String propertyValue=prop.getProperty(key);
		return propertyValue;
	}

}
