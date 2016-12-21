package com.cleartrip.actions;

import org.openqa.selenium.WebDriver;

import com.cleartrip.pages.ContinueBookingPage;
import com.cleartrip.pages.EmailAddressPage;
import com.cleartrip.pages.FlightSelectionPage;
import com.cleartrip.pages.HomePage;
import com.cleartrip.pages.PaymentPage;
import com.cleartrip.pages.TravellersPage;
import com.cleartrip.util.PageUtil;

public class FlightActions {

	public static void searchFlights(WebDriver driver) throws Exception {

		HomePage homePage = PageUtil.initElements(driver, HomePage.class);

		homePage.selectRoundTrip(driver);
		homePage.setFromAndToPlaces(driver);
		homePage.setDepartAndReturnDates(driver);
		homePage.setMemberDetails(driver);
		homePage.submitSearchCriteria(driver);

		FlightSelectionPage selectionPage = PageUtil.initElements(driver,
				FlightSelectionPage.class);
		selectionPage.clickOnBookFlight(driver);
		
		ContinueBookingPage continueBookPage = PageUtil.initElements(driver, ContinueBookingPage.class);
		continueBookPage.acceptTheTerms(driver);
		try{
		continueBookPage.continueBooking(driver);
		}
		
		catch(Exception e){
			continueBookPage.handleInsuranceError(driver);
			
		}
		
		EmailAddressPage mailPage = PageUtil.initElements(driver,EmailAddressPage.class);
		mailPage.enterEmailAddress(driver);
		mailPage.clickOnContinueButton(driver);
		
		
		TravellersPage travellersPage = PageUtil.initElements(driver,TravellersPage.class);		
		travellersPage.enterNames(driver);
		travellersPage.enterMobileNumber(driver);
		travellersPage.clickOnTravellersContinue(driver);
		
		PaymentPage paymentPage = PageUtil.initElements(driver,PaymentPage.class);		
		paymentPage.enterCardNumber(driver);
		paymentPage.enterExpiryDate(driver);
		paymentPage.enterCardHolderName(driver);
		paymentPage.enterCVVnumber(driver);
		paymentPage.clickOnMakePayment(driver);
		
	}
}
