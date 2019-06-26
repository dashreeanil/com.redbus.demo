package com.redbus.BaseLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass implements GlobalVariable{
	
WebDriver driver;
@Parameters ({ "browser_Name" })
@BeforeClass

public void launchBrowser(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty(FIREFOX_KEY,FIREFOX_VALUE);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	}
	else if (browser.equalsIgnoreCase("ie")) {
		System.setProperty(IE_KEY,IE_VALUE);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	}
	else
	{
		System.out.println("Kindly enter the browser name");
	}
}

@AfterClass
public void tearDown()
{
	driver.manage().deleteAllCookies();
	driver.quit();
}

}
