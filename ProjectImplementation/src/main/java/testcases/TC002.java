package testcases;


import org.testng.annotations.Test;

import utils.DP002;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
@Test(dataProvider="fetchData", dataProviderClass = DP002.class)
	public void accomodations(String statName, String lounges, String noOfPas, String checkInTime, String checkOutTime,
			String email, String mobile, String pasOneName, String pasTwoName, String pasThreeName, String pasOneAge,
			String pasTwoAge, String pasThreeAge, String pasOneGender, String pasTwoGender, String pasThreeGender, 
			String state, String transIdAttribute) throws InterruptedException {
	int stateNameIndex = Integer.parseInt(statName);
	int loungeCity = Integer.parseInt(lounges);
	int pasNo = Integer.parseInt(noOfPas);
	int checkIn = Integer.parseInt(checkInTime);
	int checkOut = Integer.parseInt(checkOutTime);
	int genOne = Integer.parseInt(pasOneGender);
	int genTwo = Integer.parseInt(pasTwoGender);
	int genThree = Integer.parseInt(pasThreeGender);
	int stateIndex = Integer.parseInt(state);
	String[] pasName = {pasOneName, pasTwoName, pasThreeName};
	String[] pasAge = {pasOneAge, pasTwoAge, pasThreeAge};
	int[] pasGender = {genOne,genTwo,genThree};
	
	System.out.println(pasName[0]+" "+pasName[1]+" "+pasName[2]);
	int r=1;
	System.out.println(r+1);

		//invokeApp("chrome", "https://www.irctc.co.in");
		//clickByLink("AGENT LOGIN");
		//clickByXpath("//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[2]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/ul/li[4]/a");
		switchToLastWindow();
		sleepThread(10000);
		clickByXpath("//*[@id='slider-1']/div[1]/div[2]/a[3]/div");
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
		sleepThread(10000);
		for(int i=0;i<=pasNo;i++){
			int j=i+1;
			enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr["+j+"]/td[2]/div/input", pasName[i]);
			enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr["+j+"]/td[3]/div/input", pasAge[i]);
			selectIndexByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr["+j+"]/td[4]/div/select", pasGender[i]);
		}
		/*enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[1]/td[2]/div/input", pasOneName);
		enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[2]/td[2]/div/input", pasTwoName);
		enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[3]/td[2]/div/input", pasThreeName);
		enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[1]/td[3]/div/input", pasOneAge);
		enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[2]/td[3]/div/input", pasTwoAge);
		enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[3]/td[3]/div/input", pasThreeAge);
		selectIndexByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[1]/td[4]/div/select", genOne);
		selectIndexByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[2]/td[4]/div/select", genTwo);
		selectIndexByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[3]/td[4]/div/select", genThree);*/
		selectIndexByName("state", stateIndex);
		clickByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[5]/button[3]");
		sleepThread(10000);
		verifyTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[2]/div[1]/span", email);
		verifyTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[2]/div[2]/span", mobile);
		String bookingamt = getTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[3]/div[1]/span");
		String gst = getTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[3]/div[2]/span");
		String totalamt = getTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[3]/div[3]/span");
		System.out.println("Booking amount = "+bookingamt);
		System.out.println("GST = "+gst);
		System.out.println("Totalamount = "+totalamt);
		sleepThread(10000);
		pageDownByXpath("/html/body");
		clickByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[5]/div[1]/label/span/span");
		clickByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[5]/div[2]/button");
		sleepThread(10000);
		String transid = getAttributeByXpath("//*[@id='payform']/div/div/div/div/div[1]/input", transIdAttribute);
		System.out.println("Transaction ID = "+transid);
		//closeAllBrowsers();
	}
}