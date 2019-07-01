package com.redbus.Utills;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionUtils {
	public final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static String getProertyValue(String propertyFilePath,String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(propertyFilePath);
		prop.load(fis);
		String propertyValue=prop.getProperty(key);
		return propertyValue;
	}
	
	public static void waitForElement(WebDriver driver,WebElement element,String eleName)
	{
		logger.info("--------------Wating for vissibilty of element--------------------");
	}
	
	

}
