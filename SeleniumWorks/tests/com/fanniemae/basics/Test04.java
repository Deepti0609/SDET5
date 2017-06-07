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

public class Test04 {
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
       baseURL = "http://naveenks.com/selenium/RegForm.html";
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
	
		WebElement element1 = driver.findElement(By.id("genderMale"));
		element1.click();
		
		
		WebElement element2 = driver.findElement(By.id("genderFemale"));
		element2.click();
		
		WebElement element3 = driver.findElement(By.id("genderTrans"));
		element3.click();
			
			System.out.println("Male is selected -> " + element1.isSelected());
			System.out.println("Female is selected -> " + element2.isSelected());
			System.out.println("Trans Gender is selected -> " + element3.isSelected());
		
	}

}
