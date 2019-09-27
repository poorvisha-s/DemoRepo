package testcases;

import org.testng.annotations.Test;

import utils.DP006;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	@Test(dataProvider="fetchData",dataProviderClass=DP006.class)
	public void overseasVoter(String language, String stateList, String distList, String acList, 
			String firstName, String surname, String Fname, String Fsurname, String rType, String dob, 
			String bState, String bDist, String bVillage, String eGender, String email, String mobile, 
			String houseNo, String street, String village, String postOffice, String pinCode, String passportNo,
			String pPlace, String pDate, String pExpDate, String visaNo, String visaType, String vDate,
			String vExpDate, String vAuth, String abDate, String aHouseNo, String aStreet, String aVillage, 
			String aState, String aCountry, String aZipCode, String prevStat, String prevAc, String prevAdd, 
			String prevEpic, String oEpic, String place, String verifyText) {
		//invokeApp("chrome", "https://www.irctc.co.in");
		//clickByLink("AGENT LOGIN");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
		switchToLastWindow();
		sleepThread(5000);
		clickByXpath("//*[@id='main-content']/div/div/div[2]/div[1]/div[2]/div/div[2]/a");
		switchToLastWindow();
		sleepThread(5000);
		selectIndexById("language", 1);
		sleepThread(5000);
		selectIndexById("stateList", 10);
		selectIndexById("filterDistList", 2);
		selectIndexById("acList", 4);
        enterById("applicantFirstName", "Poorvi");
        enterById("applicantSurname", "Visha");
        enterById("applicantFMHFirstName", "Arun");
        enterById("applicantFMHSurname", "Prakash");
        selectIndexById("applicantRelationType", 1);
        enterById("txtDateOfBirth", "19021990");
        selectIndexById("applicantBirthState", 1);
        sleepThread(5000);
		selectIndexById("applicantBirthDistrict", 1);
		enterById("applicantBirthVillage", "Chennai");
        selectIndexById("elector_gender", 1);
		enterById("applicantEmail", "tester@email.com");
		enterById("applicantMobile", "9876543210");
		enterById("applicantPresentHouseNo", "12B");
		enterById("applicantPresentStreet", "Test Street");
		enterById("applicantPresentVillage", "Chennai");
		enterById("applicantPresentPostoffice", "Medavakkam");
		enterById("applicantPresentPincode", "600100");	
		enterById("applicantPassportNumber", "A1234567");
		enterById("applicantPassporIssuePlace", "Chennai");
		enterById("txtPresentPassportIssueDate", "12012005");
		enterById("txtPresentPassportExpDate", "12/01/2025");
		enterByName("VISA_NO", "01234567");
		enterByName("VISA_TYPE", "Single");
		enterById("txtPresentVisaIssueDate", "14052018");
		enterById("txtPresentVisaExpDate", "18032021");
		enterByName("VISA_ISSUING_AUTHORITY", "Officer");
		clickByClassName("CorrectioninName");
		enterById("txtABSENT_DATE", "15052018");
		enterByName("ABROAD_HOUSE_NO", "14");
		enterByName("ABROAD_STREET_AREA", "Test Other Street");
		enterByName("ABROAD_VILLAGE", "Test Village");
		enterByName("ABROAD_STATE", "Test State");
		enterById("applicantAbroadCountry", "United Kingdom");
		enterById("applicantAbroadZipCode", "AB1 2CD");
		clickById("prevrecord");
		selectIndexById("ddPrevState", 8);
		sleepThread(5000);
		selectIndexById("ddPrevac", 1);
		enterById("applicantPrevtAddr", "14, Midland street, 600100");
		enterById("applicantPrevepicno", "ABCD123456");
		enterById("applicantOldEPICIssuedDate", "12052016");
		enterByName("APPLICANT_PLACE", "Chennai");
		clickById("submit_button_store_id");
		verifyTextByXpath("//*[@id='form']/div[2]/div[24]/div[2]/span/span", "Please Enter Captcha");
		//closeAllBrowsers();
	}

}
