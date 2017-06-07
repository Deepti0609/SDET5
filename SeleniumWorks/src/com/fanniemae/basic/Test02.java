package com.fanniemae.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fanniemae.utility.Driver;

public class Test02 {

	public static void main(String[] args) {
		WebDriver driver;
		
		 
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
		
		driver = new ChromeDriver();
		
		String baseURL = "http://naveenks.com/selenium/LoginForm.html";
		
		driver.get(baseURL);
		
		//full screen
		driver.manage().window().maximize();
		
		//send username and password
		driver.findElement(By.id("uname")).sendKeys("testing@fanniemae.com");
		driver.findElement(By.id("pwd")).sendKeys("secret");
		
		//click on submit
		
		driver.findElement(By.id("submitBtn")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
}
