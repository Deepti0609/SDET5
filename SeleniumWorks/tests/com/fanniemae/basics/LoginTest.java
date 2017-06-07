package com.fanniemae.basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fanniemae.utility.Driver;

public class LoginTest {

	WebDriver driver;
	String baseURL;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
				 
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
		
	}

	@Before
	public void setUp() throws Exception {
       driver = new ChromeDriver();
       String baseURL = "http://naveenks.com/selenium/LoginForm.html";
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
	public void loginTest() {
		//send username and password
		driver.findElement(By.id("uname")).sendKeys("testing@fanniemae.com");
		driver.findElement(By.id("pwd")).sendKeys("secret");
		
		//click on submit
		
		driver.findElement(By.id("submitBtn")).click();
	}

}
