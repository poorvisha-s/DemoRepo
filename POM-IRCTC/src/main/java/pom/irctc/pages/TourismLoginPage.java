package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TourismLoginPage extends GenericWrappers{
	public TourismLoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public TourismLoginPage enterGuestEmail(String data){
        enterByXpath("//form[@id='gulogin-form']//input[@name='email']", data);
        return this;
  }
  public TourismLoginPage enterGuestMobile(String data){
        enterByXpath("//form[@id='gulogin-form']//input[@name='mobileNo']", data);
        return this;
  }
  public PassengerDetailsPage clickOnSignIn(){
        clickByXpath("//form[@id='gulogin-form']//input[@value='SIGN IN']");
        sleepThread(5000);
        return new PassengerDetailsPage(driver, test);
  }

}

