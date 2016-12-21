package com.cleartrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TravellersPage {

	@FindBy(how=How.ID, using="AdultTitle1")
	public WebElement AdultTitleElement;
	
	@FindBy(how=How.ID, using="AdultFname1")
	public WebElement AdultFnameElement;
	
	@FindBy(how=How.ID, using="AdultLname1")
	public WebElement AdultLnameElement;
	
	
	@FindBy(how=How.ID, using="AdultDobDay1")
	public WebElement AdultDobDayElement;
	
	@FindBy(how=How.ID, using="AdultDobMonth1")
	public WebElement AdultDobMonthElement;
	
	@FindBy(how=How.ID, using="AdultDobYear1")
	public WebElement AdultDobYearElement;
	
	
	@FindBy(how=How.XPATH, using="//div/div/dl[2]/dl/dd/span/input[1]")	
	public WebElement adultNationalityElement;
	
	@FindBy(how=How.LINK_TEXT, using="Indonesia")
	public WebElement adultNationalityElement1;
	
	
	@FindBy(how=How.ID, using="ChildTitle1")
	public WebElement ChildTitleElement;
	
	@FindBy(how=How.ID, using="ChildFname1")
	public WebElement ChildFnameElement;
	
	@FindBy(how=How.ID, using="ChildLname1")
	public WebElement ChildLnameElement;
	
	@FindBy(how=How.ID, using="ChildDobDay1")
	public WebElement ChildDobDayElement;
	
	@FindBy(how=How.ID, using="ChildDobMonth1")
	public WebElement ChildDobMonthElement;
	
	@FindBy(how=How.ID, using="ChildDobYear1")
	public WebElement ChildDobYearElement;
	
	@FindBy(how=How.ID, using="childNationality1")
	public WebElement childNationalityElement;
	
	@FindBy(how=How.ID, using="InfantTitle1")
	public WebElement InfantTitleElement;
	
	@FindBy(how=How.ID, using="InfantFname1")
	public WebElement InfantFnameElement;
	
	@FindBy(how=How.ID, using="InfantLname1")
	public WebElement InfantLnameElement;
	
	@FindBy(how=How.ID, using="InfantDobDay1")
	public WebElement InfantDobDayElement;
	
	@FindBy(how=How.ID, using="InfantDobMonth1")
	public WebElement InfantDobMonthElement;
	
	@FindBy(how=How.ID, using="InfantDobYear1")
	public WebElement InfantDobYearElement;
	
	@FindBy(how=How.ID, using="infantNationality1")
	public WebElement infantNationalityElement;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"mobileNumber\"]")
	public WebElement mobileNumberElement;
	
	@FindBy(how=How.ID, using="travellerBtn")
	public WebElement travellerBtnElement;
	
		
	public void enterNames(WebDriver driver){
		AdultTitleElement.sendKeys("Ms");
		AdultFnameElement.sendKeys("Savithri");
		AdultLnameElement.sendKeys("T");
		AdultDobDayElement.sendKeys("1");
		AdultDobMonthElement.sendKeys("Jan");
		AdultDobYearElement.sendKeys("1987");
		
		//adultNationalityElement.getAttribute("placeholder");
		adultNationalityElement.sendKeys("Indo");
		adultNationalityElement1.click();
		
		/*ChildTitleElement.sendKeys("Miss");
		ChildFnameElement.sendKeys("Disha");
		ChildLnameElement.sendKeys("T");
		ChildDobDayElement.sendKeys("1");
		ChildDobMonthElement.sendKeys("2");
		ChildDobYearElement.sendKeys("2011");
		childNationalityElement.sendKeys("India");
		
		InfantTitleElement.sendKeys("Miss");
		InfantFnameElement.sendKeys("vihan");
		InfantLnameElement.sendKeys("T");
		InfantDobDayElement.sendKeys("1");
		InfantDobMonthElement.sendKeys("2");
		InfantDobYearElement.sendKeys("2016");
		infantNationalityElement.sendKeys("India");*/
		
	}
	
public void enterMobileNumber(WebDriver driver){
	mobileNumberElement.sendKeys("1234567891");
		
	}

public void clickOnTravellersContinue(WebDriver driver) throws Exception{
	travellerBtnElement.click();
	Thread.sleep(3000);
}
}


