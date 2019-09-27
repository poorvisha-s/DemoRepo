package testcases;


import org.testng.annotations.Test;

import utils.DP009;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	@Test(dataProvider="fetchData", dataProviderClass=DP009.class)
	public void nvspForm8A(String language, String stateList, String distList, String acList, String firstName, 
			String surname, String partNumber, String serialNumber, String prevEpicno, String familyPrevEpicno, 
			String email, String mobile, String houseNo, String street, String village, String postOffice, 
			String pinCode, String place, String verifyText){
		
		int inLang = Integer.parseInt(language);
		int inState = Integer.parseInt(stateList);
		int inDist = Integer.parseInt(distList);
		int inAc = Integer.parseInt(acList);
		
		//invokeApp("chrome", "https://www.irctc.co.in");
		//clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[8]/span");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
		switchToLastWindow();
		sleepThread(5000);
		clickByXpath("//*[@id='main-content']/div/div/div[2]/div[2]/div[2]/div/div[2]/a");
		switchToLastWindow();
		sleepThread(5000);
		selectIndexById("language", inLang);
		selectIndexById("stateList", inState);
		selectIndexById("distList", inDist);
		selectIndexById("acList", inAc);
		
		enterById("applicantFirstName", firstName);
		enterById("applicantSurname", surname);
		enterById("applicantPartNumber", partNumber);
		enterById("applicantSerialNumberInPart", serialNumber);
		enterById("applicantPrevepicno", prevEpicno);
		enterById("applicantFamilyPrevepicno", familyPrevEpicno);
		enterById("applicantEmail", email);
		enterById("applicantMobile", mobile);
		enterById("applicantPresentHouseNo", houseNo);
		enterById("applicantPresentStreet", street);
		enterById("applicantPresentVillage", village);
		enterById("applicantPresentPostoffice", postOffice);
		enterById("applicantPresentPincode", pinCode);
		enterById("applicantFormPlace", place);
		clickById("submit_button_store_id");
		verifyTextByXpath("//*[@id='form']/div[2]/div[3]/div[8]/div/span/span", verifyText);
	}
}
