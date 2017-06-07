package com.fanniemae.generic;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShot {
	WebDriver driver ;
	
	public ScreenShot(WebDriver driver){
		this.driver = driver;
	}

	public void takeScreenShot(String fileName){
	// capture Screen shot 
	try {
		String path ="C:\\Users\\Huser\\Desktop\\Testing\\";
		
		File file =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path+fileName));
		
		
	} catch (WebDriverException | IOException e ) {
		e.printStackTrace();
	} 

	}
	
	
	
	public void takeScreenShot(){
	// capture Screen shot 
	try {
		String path ="C:\\Users\\Huser\\Desktop\\Testing\\";
		java.util.Date date = new java.util.Date();


		File file =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File(path+date.getYear() +"-" + date.getSeconds() +".png"));
		
		
	} catch (WebDriverException | IOException e ) {
		e.printStackTrace();
	} 

	}
}
