package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		testCaseName = "TC001";
		testCaseDescription = "IRCTC SignUp";
		author = "Poorvisha";
		category = "Test Cases";
		browsername = "chrome";
	}
	@Test
    public void irctcSignUp(){
          new HomePage(driver, test)
          .clickOnAgentLogin()
          .clickOnSignUp()
          .enterUserId("poorvisha")
          .enterPassword("password")
          .enterConfirmPassword("password")
          .selectSecurityQuestion(1)
          .enterSecurityAnswer("test answer")
          .selectpreferredLanguage(0)
          .enterFirstName("Poorvisha")
          .enterMiddleName("Poorvi")
          .enterLastName("Visha")
          .selectGenderFemale()
          .selectMaritalStatusUnmarried()
          .selectDOBDate(19)
          .selectDOBMonth(2)
          .selectDOBYear(10)
          .selectOccupation(2)
          .enterAadhaarCardNo("1234567891234567")
          .enterPanCard("ABCDE1234F")
          .selectCountry(1)
          .enterEmail("tester@email.com")
          .enterISDMobile("9876543210")
          .selectNationality(1)
          .enterFlatNo("156C")
          .enterStreet("test street")
          .enterArea("test area")
          .enterPincode("600040")
          .selectCity(1)
          .selectPostOffice(1)
          .enterPhone("98765432")
          .selectCopyResidenceYes()
          .enterCaptcha("ABCD")
          .selectNewsletterNo()
          .selectPromotionsNo()
          .selectSBIThroughPhoneYes();
    }
 
}
