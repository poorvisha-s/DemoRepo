package testcases;

import org.testng.annotations.Test;

import utils.DP005;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@Test(dataProvider="fetchData",dataProviderClass=DP005.class)
	public void gstValidation(String statName, String lounges, String noOfPas, String checkInTime, String checkOutTime,
			String email, String mobile, String gst, String gstNo, String pasOneName, String pasTwoName, String pasThreeName, String pasOneAge,
			String pasTwoAge, String pasThreeAge, String pasOneGender, String pasTwoGender, String pasThreeGender, 
			String state, String verifyText) throws InterruptedException {
		
		int stateNameIndex = Integer.parseInt(statName);
		int loungeCity = Integer.parseInt(lounges);
		int pasNo = Integer.parseInt(noOfPas);
		int checkIn = Integer.parseInt(checkInTime);
		int checkOut = Integer.parseInt(checkOutTime);
		int genOne = Integer.parseInt(pasOneGender);
		int genTwo = Integer.parseInt(pasTwoGender);
		int genThree = Integer.parseInt(pasThreeGender);
		int stateIndex = Integer.parseInt(state);
		int inGst = Integer.parseInt(gst);
		String[] pasName = {pasOneName, pasTwoName, pasThreeName};
		String[] pasAge = {pasOneAge, pasTwoAge, pasThreeAge};
		int[] pasGender = {genOne,genTwo,genThree};
		
		//invokeApp("chrome", "https://www.irctc.co.in");
		//clickByLink("AGENT LOGIN");
		//clickByXpath("//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[2]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/ul/li[4]/a");
		switchToLastWindow();
		sleepThread(10000);
		clickByXpath("//*[@id='slider-1']/div[1]/div[2]/a[3]/div");
		sleepThread(5000);
		selectIndexByName("city", stateNameIndex);
		selectIndexByName("laungecity", loungeCity);
		selectIndexByName("selPassangers", pasNo); 
		clickByName("acservicecheckindate");               
		clickByXpath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[4]/div[1]/div/div/table/tbody/tr[5]/td[6]/span");               
		selectIndexByName("checkInTime", checkIn);
		selectIndexByName("checkOutTime", checkOut);
		sleepThread(10000);
		clickByXpath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[10]/button[2]");
		sleepThread(10000);
		enterByName("email", email);
		enterByName("mobileNo", mobile);
		clickByXpath("//*[@id='gulogin-form']/div[3]/div/input");
		selectIndexByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[1]/div[1]/select", inGst);
		enterByName("gstNo", gstNo);
		for(int i=0;i<=pasNo;i++){
			int j=i+1;
			enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr["+j+"]/td[2]/div/input", pasName[i]);
			enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr["+j+"]/td[3]/div/input", pasAge[i]);
			selectIndexByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr["+j+"]/td[4]/div/select", pasGender[i]);
		}
		selectIndexByName("state", stateIndex);
		clickByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[5]/button[3]");
		verifyTextByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[1]/div[2]/span", verifyText);
	}
}