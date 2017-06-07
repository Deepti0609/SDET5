package com.fanniemae.action;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.fanniemae.generic.ScreenShot;
import com.fanniemae.generics.GenericMethod;
import com.fanniemae.utility.Driver;

public class ActionTest {
	WebDriver driver ; 
	String baseURL;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
	}

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		baseURL = "http://tasyah.com/";
		driver.get(baseURL);
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException {
		
		String menuXpath = ".//*[@id='menu_category_Menu_VIfWm2LT_332']/a/span/span";
		String subXpath = ".//*[@id='menu_category_Menu_VIfWm2LT_332']/div/div/div[1]/div/ul/li[1]/a/span";
		
		//Menu
		WebElement menuElement = driver.findElement(By.xpath(menuXpath));
		Actions menuAction = new Actions(driver);
		menuAction.moveToElement(menuElement).perform();
		
		Thread.sleep(2000);
		
		//SubMenu
		
		WebElement subElement = driver.findElement(By.xpath(subXpath));
		
		//subElement.click(); 
		
		// we can also do above with creating action driver again or create another action drive and write the below code
		
		Actions subAction = new Actions(driver);
		
		subAction.moveToElement(subElement).click().perform();
		
	}

}
