package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TourismPage extends GenericWrappers{
	public TourismPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public LoungePage clickOnStays(){
    	switchToLastWindow();
			sleepThread(5000);
	        clickByXpath("//div[@class='Accommodation']");
	        switchToLastWindow();
	        sleepThread(5000);
	        return new LoungePage(driver, test);
    }
    public TourismPage clickOnMenu(){
    	sleepThread(5000);
          clickByXpath("//a[@class='button-collapse sideOpener']");
          return this;
    }
    public CharterPage clickOnCharter(){
          clickByXpath("//a[text()='Charter']");
          return new CharterPage(driver, test);
    }
}

