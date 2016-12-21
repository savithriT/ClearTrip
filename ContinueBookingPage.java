package com.cleartrip.pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContinueBookingPage {
	
	@FindBy(how=How.ID, using="insurance_confirm")
	public static WebElement acceptElement ;
	
	@FindBy(how=How.ID, using="itineraryBtn")
	public static WebElement continueBookingElement ;
	
	@FindBy(how=How.ID, using="insurance_box")
	public static WebElement insuranceElement ;
	
	public  void acceptTheTerms(WebDriver driver ){
		acceptElement.click();
	}
	
	public  void continueBooking(WebDriver driver ){
		continueBookingElement.click();
		//driver.get("https://www.cleartrip.com/flights/itinerary/6832185738-5f01-43bc-932d-10731cca608f/traveller");
	}

	public void handleInsuranceError(WebDriver driver){
		insuranceElement.click();
	}
}
