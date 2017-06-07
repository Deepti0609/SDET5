package com.fanniemae.basics;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.fanniemae.utility.Driver;

public class GoogleTest{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty(Driver.FIREFOX, Driver.FIREFOX_PATH);
	
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("places near me");
    driver.findElement(By.id("_fZl")).click();
    driver.findElement(By.linkText("Top Things To Do Near Me - TripAdvisor")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
   Thread.sleep(4000);
  }
    
  }

