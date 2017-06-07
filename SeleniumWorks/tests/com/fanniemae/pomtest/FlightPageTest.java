package com.fanniemae.pomtest;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fanniemae.pom.FlightPagePOM;
import com.fanniemae.pom.FlightPagePOMFactory;
import com.fanniemae.utility.DriverFactory;
import com.fanniemae.utility.DriverNames;

public class FlightPageTest {

	WebDriver driver;
	//FlightPagePOM flightpage;
	String baseURL;
	FlightPagePOMFactory flightFactory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		// if PHANTOMJS browser is used we cant use the data just for clicking the tabs
		//to run with phantomjs driver comment the text data (62-66)
		
		//driver = DriverFactory.getDriver(DriverNames.PHANTOMJS);
		baseURL = "https://www.expedia.com/";
		flightFactory = new FlightPagePOMFactory(driver);
				
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Ignore
	@Test
	public void test() {
		driver.get(baseURL);
		FlightPagePOM.clickFlightTab(driver);
		FlightPagePOM.flyFromTextBox("Washington, DC (IAD-Washington Dulles Intl.)", driver);
		FlightPagePOM.flyToTextBox("San Francisco, CA (SFO-San Francisco Intl.)", driver);
		FlightPagePOM.departDate("06/14/2017",driver);
		FlightPagePOM.returnDate("06/20/2017",driver);
		FlightPagePOM.clickSearchButton(driver);
		
	}

	@Test
	public void test1() {
		driver.get(baseURL);
		flightFactory.clickFlightTab(); 
		flightFactory.sendflyFrom("Washington, DC (IAD-Washington Dulles Intl.)");
		flightFactory.sendflyTo("San Francisco, CA (SFO-San Francisco Intl.)");
		flightFactory.senddepartDate("06/14/2017");
		flightFactory.sendreturnDate("06/20/2017");
		flightFactory.selectNoofAdults("3");
		flightFactory.clicksubmitBtn();
		
		
	}
}
