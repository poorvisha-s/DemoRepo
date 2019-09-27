package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		testCaseName = "TC004";
		testCaseDescription = "Saloon Mandatory Check";
		author = "Poorvisha";
		category = "Test Cases";	
	}
	@Test
    public void saloonMandatoryCheck(){
          new HomePage(driver, test)
          .clickOnAgentLogin()
          .clickOnSignUp()
          .clickOnTourism()
          .clickOnStays()
          .clickOnLounges()
          .clickOnMenu()
          .clickOnCharter()
          .clickOnEnquiryForm()
          .enterNameOfApplicant("Poorvi")
          .enterNameOfOrganisation("test org")
          .enterAddress("12,Test Steet, Test Area, Chennai - 600040")
          .enterMobile("")
          .enterEmailId("tester@email.com")
          .selectRequestFor(1)
          .enterOriginatingStation("Chennai")
          .enterDestinationStation("Delhi")
          .selectDateOfDeparture()
          .selectDateOfArrival()
          .enterDurationOfTour("2")
          .enterNoAndTypeOfCoaches("2")
          .enterNoOfPassengers("4")
          .enterPurposeOFCharter("all purpose")
          .enterAdditionalServices("additional services")
          .clickOnSubmit()
          .verifyMobileFieldError("Mobile field is required.")
          ;
    }

}
