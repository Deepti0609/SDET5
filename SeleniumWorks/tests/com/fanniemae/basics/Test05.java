package com.fanniemae.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.fanniemae.utility.Driver;

public class Test05 {

	WebDriver driver;
	String baseURL;
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
       baseURL = "http://html.com/attributes/select-multiple/";
       baseURL1 = "https://www.expedia.com/";
       baseURL2 = "http://naveenks.com/selenium/RegForm.html";
       driver.get(baseURL2);
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
	
    @Ignore
	@Test
	public void test() throws InterruptedException {
		
		//.//*[@id='post-291']/div/div[2]/select
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='post-291']/div/div[2]/select"));
		Select select = new Select(element1);
		select.selectByValue("American");
		select.selectByValue("Greater");
		
		Thread.sleep(2000);
		
		select.deselectByValue("Greater");
		Thread.sleep(2000);
		
		select.selectByValue("Andean");
		Thread.sleep(2000);
		
		select.deselectAll();
				
				
	}

    @Ignore
    @Test
    public void expediaTest() throws Exception{
    	driver.findElement(By.id("tab-flight-tab-hp")).click();
    	
    
    	//adults id -> flight-adults-hp-flight
    	//children id ->flight-children-hp-flight
    	
    	WebElement roomsElement = driver.findElement(By.id("flight-adults-hp-flight"));
    	Select roomsSelect = new Select(roomsElement);
    	
    	List<WebElement> options = roomsSelect.getOptions();
    	
    	for(int i=0;i<options.size();i++){
    		System.out.println(options.get(i).getText());
    	}
    	
    	roomsSelect.selectByIndex(1);
    	Thread.sleep(2000);
    	
    	roomsSelect.selectByIndex(2);
    	Thread.sleep(3000);
    	
    	
    }

    @Test
    public void getAttributeValue() throws Exception{
    	WebElement element = driver.findElement(By.xpath("html/body/div[1]/form/div[13]/div/input[1]"));
    	
    	String elementText = element.getAttribute("value");
    	System.out.println("Element Text -> " + elementText);
    }




}




