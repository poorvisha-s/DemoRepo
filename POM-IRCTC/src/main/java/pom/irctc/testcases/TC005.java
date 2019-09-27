package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		testCaseName = "TC005";
		testCaseDescription = "GST Validation";
		author = "Poorvisha";
		category = "Test Cases";	
	}
	@Test
    public void gstValidation(){
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
          .SelectGSTOption(1)
          .enterCustomerGST("1234")
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
          .clickOnSubmitFailure()
          .verifyCustomerGSTINFieldError("Please Enter Valid GSt number")
          ;
    }
}