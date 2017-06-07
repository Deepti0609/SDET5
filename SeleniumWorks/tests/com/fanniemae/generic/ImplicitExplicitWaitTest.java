package com.fanniemae.generic;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fanniemae.utility.Driver;
import com.fanniemae.utility.WaitTypes;

public class ImplicitExplicitWaitTest {
	WebDriver driver;
	String baseURL;
	WaitTypes waitTypes;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
				 
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
		
	}

	@Before
	public void setUp() throws Exception {
       driver = new ChromeDriver();
     //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       baseURL = "http://tasyah.com/";
       waitTypes = new WaitTypes(driver);
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
		driver.findElement(By.xpath(".//*[@id='Menu_VIfWm2LT']/nav/ul/li[7]/a/span")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		//ExpectedConditions.visibilityOf(driver.findElement(By.id("input-email")));
		WebElement emailField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-email")));
		emailField.sendKeys("testing@tasyah.com");
		
		//driver.findElement(By.id("input-email")).sendKeys("testing@tasyah.com");
		driver.findElement(By.id("input-password")).sendKeys("testing");
		driver.findElement(By.xpath(".//*[@id='System_nyHsmShk']/div/div[2]/div/form/div/div[2]/input")).click();
	}

	
	public void explicitTest(){
		driver.findElement(By.xpath(".//*[@id='Menu_VIfWm2LT']/nav/ul/li[7]/a/span")).click();
		WebElement email = waitTypes.presenceElementLocated(By.id("input-email"), 20);
		email.sendKeys("testing@tasyah.com");
	}
	
}
