package testcases;
 


import org.testng.annotations.Test;

import utils.DP003;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@Test(dataProvider="fetchData", dataProviderClass=DP003.class)
	public void nvsp(String language, String state, String district, String assembly, String firstname, String surname,
			String relFirstname, String relSurname, String relationType, String dob, String gender, String house, String street,
			String town, String postOffice, String pinCode, String epic, String disability, String email, String mobile, 
			String birthVillage, String birthState, String birthDist, String resSince, String prevState, String prevAssemb, 
			String prevHouse, String prevStreet, String prevTown, String prevPostOff, String prevPinCode, String prevDist, 
			String signPlace) throws InterruptedException {
		int indexLang = Integer.parseInt(language);
		int indexState= Integer.parseInt(state);
		int indexDist= Integer.parseInt(district);
		int indexAssem= Integer.parseInt(assembly);
		int indexRelType= Integer.parseInt(relationType);
		int indexGender = Integer.parseInt(gender);
		int indexBirthState= Integer.parseInt(birthState);
		int indexBirthDist= Integer.parseInt(birthDist);
		int indexPrevState= Integer.parseInt(prevState);
		int indexPrevAssemb= Integer.parseInt(prevAssemb);
		int indexPrevDist= Integer.parseInt(prevDist);
		
    	//invokeApp("chrome", "https://www.irctc.co.in");
        //clickByLink("AGENT LOGIN");
        //clickByXpath("//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a");
        clickByXpath("//*[@id='bluemenu']/ul/li[6]/a");
        clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
        switchToLastWindow();
        sleepThread(10000);
        clickByXpath("//*[@id='main-content']/div/div/div[2]/div[1]/div[1]/div/div[2]/a");
        switchToLastWindow();
        sleepThread(10000);
        selectIndexById("language", indexLang);
        sleepThread(5000);
        selectIndexByName("ST_CODE", indexState);
        sleepThread(5000);
        selectIndexById("distList", indexDist);
        sleepThread(5000);
        selectIndexByName("AC_NO", indexAssem);
        sleepThread(5000);
        clickById("isExistingVoter");
        enterById("applicantName", firstname);
        enterById("applicantSurname", surname);
        enterById("applicantFMHName", relFirstname);
        enterById("applicantFMHSurname", relSurname);
        selectIndexById("applicantRelationType", indexRelType);
        clickById("RbdDateOfBirth");
        enterById("txtDateOfBirth", dob);
        selectIndexById("elector_gender", indexGender);
		enterById("applicantPresentHouseNo", house);
		enterById("applicantPresentStreet", street);
		enterById("applicantPresentVillage", town);
		enterById("applicantPresentPostoffice", postOffice);
		enterById("applicantPresentPincode", pinCode);		
		clickById("chkPermanent");
		enterById("applicantFamilyPrevepicno", epic);
		enterByName("OTHER_DISABLITY", disability);
		enterById("applicantEmail", email);
		enterById("applicantMobile", mobile);
		enterById("applicantBirthVillage", birthVillage);
		selectIndexById("applicantBirthState", indexBirthState);
		sleepThread(5000);
		selectIndexById("applicantBirthDistrict", indexBirthDist);
		enterById("txtRESIDENT_SINCE", resSince);
		selectIndexById("ddPrevState", indexPrevState);
		selectIndexById("ddPrevac", indexPrevAssemb);
		enterById("applicantPreHouseNo", prevHouse);
		enterById("applicantPreStreet", prevStreet);
		enterById("applicantPreVillage", prevTown);
		enterById("applicantPrePostoffice", prevPostOff);
		enterById("applicantPrePincode", prevPinCode);
		selectIndexById("Prev_DistNo", indexPrevDist);
		enterById("applicantFormPlace", signPlace);
	}
}