package com.redbus.Scripts_Demo;

import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.redbus.BaseLib.GlobalVariable;

public class SeleniumGridDemo implements GlobalVariable {
	@Test
	public void TestDemo() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		//System.setProperty(CHROME_KEY, CHROME_VALUE);
		WebDriver driver = new RemoteWebDriver(new java.net.URL("http://localhost:5566/"), dc);
		driver.get("https://www.guru99.com/introduction-to-selenium-grid.html");
	}

}
