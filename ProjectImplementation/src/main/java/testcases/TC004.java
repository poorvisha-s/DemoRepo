package testcases;


import org.testng.annotations.Test;

import utils.DP004;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	@Test(dataProvider="fetchData", dataProviderClass=DP004.class)
	public void saloonCheck(String name, String orgName, String address, String email, String reqFor, String originStation,
			String destStation, String duration, String coach, String numPas, String purpose, String services, 
			String verifyText) throws InterruptedException {
		int indexReq = Integer.parseInt(reqFor);
        //invokeApp("chrome", "https://www.irctc.co.in");
        //clickByLink("AGENT LOGIN");
        //clickByXpath("//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a");
        clickByXpath("//*[@id='bluemenu']/ul/li[2]/a");
        clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/a");
        clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/ul/li[4]/a");
        switchToLastWindow();
        sleepThread(10000);
        clickByXpath("//*[@id='slider-1']/div[1]/div[2]/a[3]/div");               
        clickByXpath("/html/body/app-root/homeheader/header/nav/div/div/a[2]/i");
        clickByXpath("//*[@id='mySidenav']/ul/li[11]/a");
        clickByXpath("//*[@id='dealBriefnew']/ul/li[2]/a");
        sleepThread(10000);
        enterByName("name", name);
        enterByName("organization", orgName);
        enterByName("address", address);
        enterByName("email", email);
        selectIndexByName("requestFor", indexReq);
        enterByName("originStation", originStation);
        enterByName("destnStation", destStation);
        clickByName("checkInDate");
        clickByXpath("//*[@id='Saloon-wrap']/div[4]/div/div/table//tbody/tr[3]/td[1]/span");
        clickByName("checkOutDate");
        clickByXpath("//*[@id='Saloon-wrap']/div[5]/div/div/table//tbody/tr[3]/td[4]");
        enterByName("durationPeriod", duration);
        enterByName("coachDetails", coach);
        enterByName("numPassenger", numPas);
        enterByName("charterPurpose", purpose);
        enterByName("services", services);
        submitByXpath("/html/body/app-root/saloon_charter/section[2]/div/div/div/div/div/div/div[2]/form/div[11]/button");
        verifyTextByXpath("/html/body/app-root/saloon_charter/section[2]/div/div/div/div/div/div/div[2]/form/div[4]/span", verifyText);
	}
}