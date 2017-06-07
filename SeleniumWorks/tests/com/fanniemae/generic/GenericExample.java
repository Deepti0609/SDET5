package com.fanniemae.generic;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.fanniemae.generics.GenericMethod;
import com.fanniemae.utility.Driver;
import com.fanniemae.utility.WaitTypes;

public class GenericExample {
	WebDriver driver ; 
	String baseURL;
	WaitTypes waitTypes;
	GenericMethod genericMethod;
	ChromeOptions chromeOptions;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
	}

	@Before
	public void setUp() throws Exception {
		chromeOptions  = new ChromeOptions();

		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--disable-web-security");
		chromeOptions.addArguments("--no-proxy-server");

		java.util.Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		chromeOptions.setExperimentalOption("prefs", prefs);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		
		driver = new ChromeDriver(capabilities);
		
		
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
		baseURL = "http://webmail.sdettraining.com/Login.aspx";
		waitTypes= new WaitTypes(driver);
		genericMethod = new GenericMethod(driver);
		driver.get(baseURL);
	}



	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void test() 
		throws Exception{
		
		// for email
		genericMethod.getElement("ctl00_MPH_txtUserName", "id")
			.sendKeys("cohort312@sdettraining.com");
		// password 
		genericMethod.getElement("ctl00_MPH_txtPassword", "id")
			.sendKeys("Hexaware03!");
		
		// click submit 
		genericMethod.getElement("btnLogin", "id").click();
		
		
		
		// change the iframe 
		driver.switchTo().frame("ctl00_Split_Frame_ContentFrame");
		
		
		WebElement calendarAck =
				genericMethod.getElement("ctl00_MPH_calendarToday__Label", "id");
			
		
		System.out.println("Coming from Server -> " +calendarAck.getText());
		Assert.assertEquals("Testing for Asserting Calendar", "Calendar", calendarAck.getText());
		
		
		
	}

	
	
	
}













