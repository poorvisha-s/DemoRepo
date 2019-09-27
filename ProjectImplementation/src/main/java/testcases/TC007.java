package testcases;


import org.testng.annotations.Test;

import utils.DP007;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	@Test(dataProvider="fetchData",dataProviderClass=DP007.class)
	public void deletionElectoralRoll(String language, String stateList, String distList, String acList, 
			String firstName, String surname, String partNumber, String serialNumber, String epicno, 
			String mobile, String email, String oName, String oSurname, String oPartNo, String oSerialNo, 
			String oEpic, String oReason, String place, String verifyText) {
		

		int inLang = Integer.parseInt(language);
		int inState = Integer.parseInt(stateList);
		int inDist = Integer.parseInt(distList);
		int inAc = Integer.parseInt(acList);
		int inReason = Integer.parseInt(oReason);
		
		
		
		//invokeApp("chrome", "https://www.irctc.co.in");
		//clickByLink("AGENT LOGIN");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
		switchToLastWindow();
		sleepThread(5000);
		clickByXpath("//*[@id='main-content']/div/div/div[2]/div[1]/div[3]/div/div[2]/a");
		switchToLastWindow();
		sleepThread(5000);
		selectIndexById("language", inLang);
		selectIndexById("stateList", inState);
		selectIndexById("distList", inDist);
		selectIndexById("acList", inAc);	
		enterById("applicantName", firstName);
		enterById("applicantSurName", surname);
		enterById("ApplicantrPartNumber", partNumber);
		enterById("ApplicantSerialNumber", serialNumber);
		enterById("applicantEPIC", epicno);
		enterById("AppliacntMobile", mobile);
		enterById("AppliantEmail", email);
		enterById("objectorName", oName);
		enterById("ObjectorSurname", oSurname);
		enterById("objecotrPartNO", oPartNo);
		enterById("objecotrSrINPartNO", oSerialNo);
		enterById("ObjectorEPIC", oEpic);
		selectIndexById("ObjectionReason", inReason);
		enterById("applicantFormPlace", place);
		clickById("submit_button_store_id");
		verifyTextByXpath("//*[@id='form']/div[2]/div[4]/div[6]/div[2]/span/span", verifyText);
		//closeAllBrowsers();
	}

}
