package com.fanniemae.basics;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fanniemae.utility.Driver;

// this class is to show working of navigation
public class Test02 {

	WebDriver driver;
	String baseURL1;
	String baseURL2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
				 
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
		
	}

	@Before
	public void setUp() throws Exception {
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       baseURL1 = "http://www.fanniemae.com/portal/index.html";
       baseURL2 = "https://www.google.com/";
       driver.get(baseURL1);
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
	public void test() throws InterruptedException {
		String baseURL1Title = driver.getTitle();
		System.out.println("Base URL1 Title -> " + baseURL1Title);
		
		Thread.sleep(2000);
		
		driver.navigate().to(baseURL2);
		String baseURL2Title = driver.getTitle();
		
		System.out.println("Base URL2 Title -> " + baseURL2Title);
		
		Thread.sleep(2000);
		System.out.println("Going Back");
		driver.navigate().back();
		
		Thread.sleep(1500);
		System.out.println("Before Refresh");
		driver.navigate().refresh();
		System.out.println("Before Forward");
		driver.navigate().forward();
		
		System.out.println("Current URL after forward is " + driver.getCurrentUrl());
		
		System.out.println("---------------------------------------------------");
		System.out.println(driver.getPageSource());
		
	
	}
}
