package com.cleartrip.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightSelectionPage {

	
	@FindBy(how=How.CSS, using=".booking.fRight")
	public WebElement bookElement;
	
	@FindBy(how=How.ID, using="BackToRtSpT")
	public WebElement allAirlines;
	
	
	@FindBy(how=How.XPATH, using="//*[@id=\"flightForm\"]/section[2]/div[4]/div[1]/nav/ul/li[4]/div/label/table/tbody/tr[1]/th[1]/input")
	public WebElement selectFlightElement;
	
	public void selectFlight(WebDriver driver) throws Exception{
		selectFlightElement.click();	
	}
	
	
	public void clickOnBookFlight(WebDriver driver) throws Exception{
		
		Thread.sleep(20000);
		List<WebElement> bookElements = driver.findElements(By.cssSelector(".booking.fRight"));
		int i =0;
		System.out.println("book elemts size: "+ bookElements.size());
		for (WebElement webElement : bookElements) {
			System.out.println("in book elements: " + i);
			if(webElement.isDisplayed()){
				System.out.println("Element is displayed : " + i);
				webElement.click();
			}
			
			i++;
		}
	}
}
