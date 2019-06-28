package com.redbus.Scripts_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

@Test
public class SSLCertification {

	 {
		// TODO Auto-generated method stub
		DesiredCapabilities d = DesiredCapabilities.chrome();
		d.acceptInsecureCerts();
		d.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		d.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(d);
		WebDriver driver = new ChromeDriver(c);

	}

}
