package com.fanniemae.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {
	public static void main(String[] args) {
		//Load the driver
		
		WebDriver driver;
		
		//set Property for firefox
		//based on the version use any of the below web driver
		
		//System.setProperty("webdriver.gecko.driver", "C:\\softwares\\selenium-java-3.4.0\\driver\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "C:\\softwares\\selenium-java-3.4.0\\driver\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//set Property for Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium-java-3.4.0\\driver\\chromedriver_win32\\chromedriver.exe");
		
		//driver = new FirefoxDriver();
		
		driver = new ChromeDriver();
	
				
		//Open the browser for the driver
		
		String baseUrl = "http://google.com";
		
		driver.get(baseUrl);
		
		//do the task
		
		System.out.println("Title  -> "+ driver.getTitle());
		
		//Alt+shft+z (to surround try and catch
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close the browser
		
		driver.quit();
	}

}
