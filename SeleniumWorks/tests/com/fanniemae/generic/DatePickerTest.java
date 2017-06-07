package com.fanniemae.generic;



import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fanniemae.generics.GenericMethod;
import com.fanniemae.utility.Driver;


public class DatePickerTest {

	WebDriver driver ; 
	String baseURL;
	GenericMethod genericMethod; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
	}

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
	    // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		baseURL = "https://www.expedia.com/";
		genericMethod = new GenericMethod(driver);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	

	@Ignore 	@Test
	public void test() throws Exception{
		
		// click on flights tab
		genericMethod.getElement("tab-flight-tab-hp", "id").click();

		// flight-departing-hp-flight
		// click departing text box 
		genericMethod.getElement("flight-departing-hp-flight", "id").clear();
		genericMethod.getElement("flight-departing-hp-flight", "id").click();
		
	//	String locator = "//*[@id="flight-departing-wrapper-hp-flight"]/div/"
	// 			+ "div/div[2]/table/tbody/tr/td/button[not (@ disabled)]";
	
		String locator=".//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[text()='10']";
		String type ="xpath";

		
		if(genericMethod.checkSingleEntry(locator, type)){
			
		WebElement departDate = 
				genericMethod.getElement(locator, type);
		
		Thread.sleep(2000);
		departDate.click();
		}else{
			System.out.println("Too many entries of the locator...");
			// assertFalse(false);
		}
	}

	
	
	
	@Test
	public void getFlyingFromListTest()
	throws Exception{
		String flyFromPartial ="new";
		String flyToPartial ="cal";
		// click flight tab 
		genericMethod.getElement("tab-flight-tab-hp", "id").click();
		
		Thread.sleep(2000);
		
		// clear and enter partial text on flyFrm 
		genericMethod.getElement("flight-origin-hp-flight", "id").clear();
		genericMethod.getElement("flight-origin-hp-flight", "id").
				sendKeys(flyFromPartial);
		
		
		Thread.sleep(3000);
		// results-item 
		List<WebElement> elements  = 
					genericMethod.getElementsAsList("results-item", "class");
		System.out.println("Number of Entries -> " + elements.size());
		
		
		List<String> flyFromStringList = new ArrayList<String>();
		
		for(WebElement temp : elements){
			System.out.println(temp.getText());
			flyFromStringList.add(temp.getText());
		}
		
		


		for(int i=0; i<flyFromStringList.size(); i++){
//			System.out.println("processing -> " + elements.get(i).getText());
			genericMethod.getElement("flight-origin-hp-flight", "id").clear();
			genericMethod.getElement("flight-origin-hp-flight", "id").
					sendKeys(flyFromStringList.get(i));
					
			Thread.sleep(1400);
		}
		
		
		System.out.println("------------Destination--------------------");

	
		genericMethod.getElement("flight-destination-hp-flight", "id").clear();
		genericMethod.getElement("flight-destination-hp-flight", "id")
				.sendKeys(flyToPartial);
			
		Thread.sleep(3000);
		// results-item 
		List<WebElement> elements1  = 
					genericMethod.getElementsAsList("results-item", "class");
		System.out.println("Number of Entries -> " + elements.size());
		
		
		for(WebElement temp : elements1){
			System.out.println(temp.getText());
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
