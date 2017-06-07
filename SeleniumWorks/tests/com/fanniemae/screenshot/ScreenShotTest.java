package com.fanniemae.screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fanniemae.generic.ScreenShot;
import com.fanniemae.generics.GenericMethod;
import com.fanniemae.utility.Driver;

public class ScreenShotTest {
	WebDriver driver ; 
	String baseURL;
	GenericMethod genericMethod;
	ScreenShot screenshot;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
	}

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		baseURL = "https://www.expedia.com/";
		genericMethod = new GenericMethod(driver);
		driver.get(baseURL);
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		
		//capture screenshot
//		
//		String path = "C:\\Users\\Huser\\Desktop\\Testing\\";
//		String fileName = "sample.png";
//		
//		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(file, new File(path+fileName));
		screenshot = new ScreenShot(driver);
		
		screenshot.takeScreenShot();
		
			
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	@Test
	public void test()  throws Exception{
		
		
		
		String flyFrom = "Washington, DC (IAD-Washington Dulles Intl.)";
		String flyTo =  "Washington, DC (IAD-Washington Dulles Intl.)";
		
		genericMethod.getElement("tab-flight-tab-hp", "id").click();
		
		
		genericMethod.getElement("flight-origin-hp-flight", "id").sendKeys(flyFrom);
		genericMethod.getElement("flight-destination-hp-flight", "id").sendKeys(flyTo);
		
		genericMethod.getElement(".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button", "xpath").click();
		
	}

	
	
	
}