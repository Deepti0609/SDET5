package com.fanniemae.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightPagePOMFactory {

	private WebDriver driver;
	
	public FlightPagePOMFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//tab-flight-tab-hp
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;
	
	//flight-origin-hp-flight
	@FindBy(id="flight-origin-hp-flight")
	WebElement flyFrom;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement flyTo;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
	
	@FindBy(id="flight-adults-hp-flight")
	WebElement noofAdults;
	
	@FindBy(xpath=".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button")
	WebElement searchBtn;
	
	public void clickFlightTab(){
		flightTab.click();
		
	}
	
	public void sendflyFrom(String flyFrom){
		this.flyFrom.clear();
		this.flyFrom.sendKeys(flyFrom);
	}
	
	public void sendflyTo(String flyTo){
		this.flyTo.clear();
		this.flyTo.sendKeys(flyTo);
	}
	
	public void senddepartDate(String departDate){
		this.departDate.clear();
		this.departDate.sendKeys(departDate);
	}
	
	
	public void sendreturnDate(String returnDate){
		this.returnDate.clear();
		this.returnDate.sendKeys(returnDate);
	}
	
	public void selectNoofAdults(String noofAdults){
		
		Select select = new Select(this.noofAdults);
		select.selectByValue(noofAdults);	
	}
	
	public void clicksubmitBtn(){
		searchBtn.click();
	}
}
