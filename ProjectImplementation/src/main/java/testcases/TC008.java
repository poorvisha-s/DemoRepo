package testcases;



import org.testng.annotations.Test;

import utils.DP008;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	@Test(dataProvider="fetchData",dataProviderClass=DP008.class)
	public void correctionElectoralRoll(String language, String stateList, String distList, String acList, 
			String firstName, String surname, String partNumber, String serialNumber, String oldEpicno, 
			String houseNo, String street, String village, String postOffice, String pinCode, String cDistList, 
			String cAge, String cGender, String idList, String addressList, String mobile, String email, String place, String verifyText) {
		
		int inLang = Integer.parseInt(language);
		int inState = Integer.parseInt(stateList);
		int inDist = Integer.parseInt(distList);
		int inAc = Integer.parseInt(acList);
		int inCDist = Integer.parseInt(cDistList);
		int inCGen = Integer.parseInt(cGender);
		int inCList = Integer.parseInt(idList);
		int inCAddList = Integer.parseInt(addressList);
		
		//invokeApp("chrome", "https://www.irctc.co.in");
		//clickByLink("AGENT LOGIN");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
		switchToLastWindow();
		sleepThread(5000);
		clickByXpath("//*[@id='main-content']/div/div/div[2]/div[2]/div[1]/div/div[2]/a");
		switchToLastWindow();
		sleepThread(5000);
		selectIndexById("language", inLang);
		sleepThread(5000);
		selectIndexById("stateList", inState);
		selectIndexById("distList", inDist);
		selectIndexById("acList", inAc);
        enterById("applicantName", firstName);
        enterById("applicantSurname", surname);  
		enterById("applicantPartNumber", partNumber);
		enterById("applicantSerialNumberInPart", serialNumber);
		enterById("applicantOldEPIC", oldEpicno);
		clickById("chkIS_ADDRESS_CORRECTION");
		clickById("chkIS_AGE_CORRECTION");
		clickById("chkIS_GENDER_CORRECTION");
		enterById("applicantPresentHouseNo", houseNo);
		enterById("applicantPresentStreet", street);
		enterById("applicantPresentVillage",village);
		enterById("applicantPresentPostoffice", postOffice);
		enterById("applicantPresentPincode", pinCode);
		selectIndexById("CorrecteddistList", inCDist);
		enterById("txtCorrectedAge", cAge);
		selectIndexById("applicantGender", inCGen);
		selectIndexById("IDProoflist", inCList);
		selectIndexById("AddressProoflist", inCAddList);
		enterById("applicantEmail", email);
		enterById("applicantMobile ", mobile);
		enterByName("APPLICANT_PLACE", place);
		clickById("submit_button_store_id");
		verifyTextByXpath("//*[@id='validation']/div[15]/div[2]/div/span[2]/span", verifyText);
		//closeAllBrowsers();
	}

}
