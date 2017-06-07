package com.fanniemae.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightPagePOM {
	
	private static WebElement element;
	
	public static void clickFlightTab(WebDriver driver){
			driver.findElement(By.id("tab-flight-tab-hp")).click();
	}
	
	public static void flyFromTextBox(String flyFrom, WebDriver driver){
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		element.clear();
		element.sendKeys(flyFrom);
	
	}
	public static void flyToTextBox(String flyTo, WebDriver driver){
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		element.clear();
		element.sendKeys(flyTo);
	
}
	
	public static void departDate(String departDate, WebDriver driver){
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		element.clear();
		element.sendKeys(departDate);
	
}
	
	public static void returnDate(String returnDate, WebDriver driver){
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		element.clear();
		element.sendKeys(returnDate);
	
}
	public static void clickSearchButton(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button"));
		element.click();
	}
}
