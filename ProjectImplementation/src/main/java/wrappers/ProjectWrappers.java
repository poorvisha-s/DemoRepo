package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectWrappers extends GenericWrappers{
	@BeforeMethod
	public void beforeMethod() {
		invokeApp("chrome", "https://www.irctc.co.in");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[8]/span");
		clickByXpath("//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a");
	}
    @AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
}
