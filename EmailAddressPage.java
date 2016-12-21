package com.cleartrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmailAddressPage {
	
	@FindBy(how=How.ID, using="username")
	public WebElement emailElement;
	
	@FindBy(how=How.CSS, using="#LoginContinueBtn_1")
	public WebElement continueButtonElement;
	
	
	public void enterEmailAddress(WebDriver driver){
		emailElement.sendKeys("savithri.ht@gmail.com");
	}
	
	public void clickOnContinueButton(WebDriver driver) throws Exception{
		Thread.sleep(2000);
		continueButtonElement.click();
	}
}
