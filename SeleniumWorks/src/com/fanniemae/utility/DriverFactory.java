package com.fanniemae.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class DriverFactory {
	private static WebDriver driver;
	
	public static WebDriver getDriver(String driverName){
		if(driverName.equals(DriverNames.CHROME)){
		 System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
		 driver = new ChromeDriver();
		
		}else if(driverName.equals(DriverNames.FIREFOX)){
			 System.setProperty(Driver.FIREFOX, Driver.FIREFOX_PATH);
			 driver = new FirefoxDriver();
			
		}else if(driverName.equals("IE")){
			//TODO
		}else if(driverName.equals(DriverNames.PHANTOMJS)){
			 System.setProperty(Driver.PHANTOMJS, Driver.PHANTOMJS_PATH);
			 driver = new PhantomJSDriver();
		}
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     return driver;
	}
	

}
