package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class NVSPHomePage extends GenericWrappers{
	public NVSPHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public Form6Page clickOnForm6(){
          clickByXpath("//a[text()='Form6']");
          switchToLastWindow();
          return new Form6Page(driver, test);
    }
}
