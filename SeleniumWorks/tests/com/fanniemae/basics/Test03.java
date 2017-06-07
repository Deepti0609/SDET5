package com.fanniemae.basics;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fanniemae.utility.Driver;

public class Test03 {

	WebDriver driver;
	String baseURL;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
				 
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
		
	}

	@Before
	public void setUp() throws Exception {
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       baseURL = "https://google.com";
       driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}


	@Test
	public void test() {
//		WebElement element1 = driver.findElement(By.id("lst-ib"));
//		System.out.println("Element1 Enables -> " + element1.isEnabled());
//		element1.sendKeys("places to visit");
		
		// id's are disabled in the google webpage
		/*WebElement element2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("Element2 Enables -> " + element2.isEnabled());
		element2.sendKeys("places to visit");*/
		
		//gs_htif0
		// id's are disabled  in the google webpage
		
		WebElement element3 = driver.findElement(By.id("gs_htif0"));
		System.out.println("Element3 Enables -> " + element3.isEnabled());
		element3.sendKeys("places to visit");
	}

}
