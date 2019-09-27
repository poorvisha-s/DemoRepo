package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		testCaseName = "TC003";
		testCaseDescription = "NVSP Form6";
		author = "Poorvisha";
		category = "Test Cases";	
	}
	@Test
    public void nvspForm6(){
          new HomePage(driver,test)
          .clickOnAgentLogin()
          .clickOnSignUp()
          .clickOnMore()
          .clickOnNVSP()
          .clickOnForm6()
          .selectLanguage(1)
          .selectState(5)
          .selectDistrict(1)
          .selectAssembly(1)
          .selectShiftingConstituency()
          .enterName("Poorvisha")
          .enterSurname("Sarvesan")
          .enterRelativeName("Arun")
          .enterRelativeSurname("Prakash")
          .selectTypeOfRelation(1)
          .clickOnDOB()
          .enterDOB("19021990")
          .selectGender(1)
          .enterCurrentHouseNo("12B")
          .enterCurrentStreet("Test Street")
          .enterCurrentTown("Chennai")
          .enterCurrentPostOffice("Medavakkam")
          .enterCurrentPinCode("600100")
          .clickOnSameAsAbove()
          .enterEPICNo("ABC123456")
          .enterDisabilityOther("Not Applicable")
          .enterEmailId("tester@email.com")
          .enterMobileNo("9876543210")
          .enterBirthTown("Chennai")
          .selectBirthState(1)
          .selectBirthDistrict(1)
          .enterResidentSince("15052010")
          .selectPreviousState(1)
          .selectPreviousAssembly(1)
          .enterPreviousHouseNo("11")
          .enterPreviousStreet("prev st")
          .enterPreviousTown("pre town")
          .enterPreviousPostOffice("pre post")
          .enterPreviousPinCode("600100")
          .selectPreviousDistrict(1)
          .enterPlace("Medavakkam")          
          ;
    }

}