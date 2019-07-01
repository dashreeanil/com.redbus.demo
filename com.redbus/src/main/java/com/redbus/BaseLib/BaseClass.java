package com.redbus.BaseLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.redbus.Utills.ActionUtils;

public class BaseClass implements GlobalVariable {

	WebDriver driver;
	public static String userDirectory = System.getProperty("user.dir");

	/**
	 * @param browser
	 * @throws IOException
	 * @author:
	 * 
	 * 			Description: Method for dynamically launching the browser depending
	 *          upon the parameter.
	 */
	@Parameters({ "browser_Name" })
	@BeforeClass

	public void launchBrowser(String browser) throws IOException {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(ActionUtils.getProertyValue(DRIVERSETUPFILEPATH, "chromeKey"),
					ActionUtils.getProertyValue(DRIVERSETUPFILEPATH, "chromeValue"));
			driver.get(ActionUtils.getProertyValue(CONFIGPRPERTIESFILEPATH, "url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(ActionUtils.getProertyValue(DRIVERSETUPFILEPATH, "firefoxKey"),
					ActionUtils.getProertyValue(DRIVERSETUPFILEPATH, "firefoxValue"));
			driver.get(ActionUtils.getProertyValue(CONFIGPRPERTIESFILEPATH, "url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		} /*
			 * else if (browser.equalsIgnoreCase("ie")) { System.setProperty(IE_KEY,
			 * IE_VALUE); driver.get(URL); driver.manage().window().maximize();
			 * driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS); }
			 */else {
			System.out.println("Kindly enter a valid browser name");
		}
	}

	@AfterClass
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
