package com.cleartrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage {

	@FindBy(how=How.ID, using="creditCardNumberDisp")
	public WebElement cardNumberElement;
	
	@FindBy(how=How.ID, using="CcExpirationMonth")
	public WebElement expiryMonthElement;
	
	@FindBy(how=How.ID, using="CcExpirationYear")
	public WebElement expiryYearElem;
	
	@FindBy(how=How.ID, using="BillName")
	public WebElement cardHolderNameElement;
	
	@FindBy(how=How.ID, using="cvvCode")
	public WebElement cvvNumberElement;
	
	@FindBy(how=How.ID, using="paymentSubmit")
	public WebElement paymentButtonElement;
	
public void enterCardNumber(WebDriver driver){
	cardNumberElement.sendKeys("1234567812345678");
	
	}
	
public void enterExpiryDate(WebDriver driver){
	expiryMonthElement.sendKeys("02");
	expiryYearElem.sendKeys("2018");
}

public void enterCardHolderName(WebDriver driver){
	cardHolderNameElement.sendKeys("savithri");
}
public void enterCVVnumber(WebDriver driver){
	cvvNumberElement.sendKeys("655");
	
}
public void clickOnMakePayment(WebDriver driver){
	paymentButtonElement.click();
}
}
