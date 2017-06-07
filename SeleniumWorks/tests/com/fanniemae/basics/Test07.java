package com.fanniemae.basics;


// Program to show parameterization with 
// expedia.com 


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fanniemae.utility.Driver;

@RunWith(Parameterized.class)
public class Test07 {

	private String fltSrc;
	
	private String fltDest; 
	
	private String deptDate; 
	
	private String retDate;
	
	private int noOfAdults;
	
	public Test07(String fltSrc, String fltDest, String deptDate, String retDate, int noOfAdults) {
		this.fltSrc = fltSrc;
		this.fltDest = fltDest;
		this.deptDate = deptDate;
		this.retDate = retDate;
		this.noOfAdults = noOfAdults;
	}

	WebDriver driver ; 
	String baseURL;

	 
	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"Chicago, IL (CHI-All Airports)", "San Francisco, California", "06/14/2017", "06/17/2017", 2}, 
			{"Washington, DC (IAD-Washington Dulles Intl.)", "San Francisco, California", "06/14/2017", "06/17/2017", 2}
		});
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
	}

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		baseURL = "https://www.expedia.com/";
	}



	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void expediaTest() {
		driver.get(baseURL);
		
		// click on Flights tab 
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		
		// fltSrc -> flight-origin-hp-flight
		driver.findElement(By.id("flight-origin-hp-flight")).clear();
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(fltSrc);

		// fltDest -> flight-destination-hp-flight
		driver.findElement(By.id("flight-destination-hp-flight")).clear();
		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(fltDest);
		
		

		// deptDate -> flight-departing-hp-flight
		driver.findElement(By.id("flight-departing-hp-flight")).clear();
		driver.findElement(By.id("flight-departing-hp-flight")).sendKeys(deptDate);
		
		

		// arrDate -> flight-returning-hp-flight
		driver.findElement(By.id("flight-returning-hp-flight")).clear();
		driver.findElement(By.id("flight-returning-hp-flight")).sendKeys(retDate);

	}

}
       