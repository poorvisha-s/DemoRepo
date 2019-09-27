package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		testCaseName = "TC002";
		testCaseDescription = "Accomodations";
		author = "Poorvisha";
		category = "Test Cases";	
	}
	@Test
    public void accomodations(){
          new HomePage(driver, test)
          .clickOnAgentLogin()
          .clickOnSignUp()
          .clickOnTourism()
          .clickOnStays()
          .clickOnLounges()
          .clickOnStays()
          .selectStationName(1)
          .selectLounges(1)
          .selectNoOfPersons(2)
          .enterCheckInDate()
          .selectCheckInTime(5)
          .selectDuration(3)
          .clickOnBook()
          .enterGuestEmail("vishaas@gmail.com")
          .enterGuestMobile("9566110716")
          .clickOnSignIn()
          .enterName(1, "test")
          .enterAge(1, "25")
          .selectGender(1, 1)
          .enterName(2, "tester")
          .enterAge(2,"51")
          .selectGender(2,2)
          .enterName(3,"testing")
          .enterAge(3, "28")
          .selectGender(3,1)
          .selectState(6)
          .clickOnSubmit()
          .verifyEmail("vishaas@gmail.com")
          .verifyPhone("9566110716")
          .printBookingAmount()
          .printGST()
          .printTotalAmount()
          .clickOnIAgree()
          .clickOnMakePayment()
          .printTransactionId()
          .closeAllBrowsers();
          ;
    }

}
