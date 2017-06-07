package com.fanniemae.javascript;

import java.util.concurrent.TimeUnit;

import org.junit.After;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fanniemae.utility.Driver;

public class JavaScriptInvoke {
	WebDriver driver ; 
	String baseURL;
	JavascriptExecutor jsExecutor;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
	}

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		jsExecutor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		baseURL = "http://webmail.sdettraining.com/Login.aspx";
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void test()  throws Exception{
		
		jsExecutor.executeScript("window.location = '" + baseURL + "'");
		
		WebElement emailElement = (WebElement) jsExecutor.executeScript("return document.getElementById('ctl00_MPH_txtUserName')");
		
		emailElement.sendKeys("testing@sdettraining.com");
		
		WebElement element = (WebElement) jsExecutor.executeScript("return window.alert('hello from the selenium')");
		
	}

	
	
	
}















