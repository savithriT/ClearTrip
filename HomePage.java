package com.cleartrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how=How.ID, using="RoundTrip")
	public WebElement roundTrip;
	
	@FindBy(how=How.ID, using="FromTag")
	public WebElement fromPlaceElement;
	
	@FindBy(how=How.ID, using="ToTag")
	public WebElement toPlaceElement;
	
	@FindBy(how=How.ID, using="DepartDate")
	public WebElement departElement;
	
	@FindBy(how=How.ID, using="ReturnDate")
	public WebElement returnElement;
	
	
	@FindBy(how=How.ID, using="Adults")
	public WebElement adultElement;
	
	@FindBy(how=How.ID, using="Childrens")
	public WebElement childrenElement;
	
	@FindBy(how=How.ID, using="Infants")
	public WebElement infantElement;
	
	@FindBy(how=How.CSS, using="#SearchBtn")
	public WebElement flightSearchElement;
	
	public void selectRoundTrip(WebDriver driver){  
		roundTrip.click();
	}
	
	public void setFromAndToPlaces(WebDriver driver){
		
		fromPlaceElement.sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		toPlaceElement.sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
	}
	
	public void setDepartAndReturnDates(WebDriver driver){
		departElement.sendKeys("01/01/2017");
		returnElement.sendKeys("02/01/2017");
	}
	
	
	public void setMemberDetails(WebDriver driver){
		adultElement.sendKeys("1");
		/*childrenElement.sendKeys("1");
		infantElement.sendKeys("1");*/
	}
	
	public void submitSearchCriteria(WebDriver driver) throws Exception{
	
		flightSearchElement.click();
		
		//if not able to click 
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", flightSearchElement);
		
	}
}
