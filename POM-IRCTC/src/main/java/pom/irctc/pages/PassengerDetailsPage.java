package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PassengerDetailsPage extends GenericWrappers{
	public PassengerDetailsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public PassengerDetailsPage SelectGSTOption(int data){
        selectIndexByXpath("//select[@name='gstGet']", data);
        return this;
  }
  public PassengerDetailsPage enterCustomerGST(String data){
        enterByXpath("//input[@name='gstNo']", data);
        return this;
  }
  public PassengerDetailsPage enterName(int pasNo, String data){
        enterByXpath("//table//tr["+pasNo+"]//input[@placeholder='Name']", data);
        return this;
  }
  public PassengerDetailsPage enterAge(int pasNo, String data){
        enterByXpath("//table//tr["+pasNo+"]//input[@placeholder='Age']", data);
        return this;
  }
  public PassengerDetailsPage selectGender(int pasNo, int data){
        selectIndexByXpath("//table//tr["+pasNo+"]//select", data);
        return this;
  }
  public PassengerDetailsPage selectState(int data){
        selectIndexByXpath("//select[@name='state']", data);
        return this;
  }
  public SummaryPage clickOnSubmit(){
        clickByXpath("//button[text()='SUBMIT']");
        sleepThread(5000);
        return new SummaryPage(driver, test);
  }
  public PassengerDetailsPage clickOnSubmitFailure(){
        clickByXpath("//button[text()='SUBMIT']");
        return this;
  }
  public PassengerDetailsPage verifyCustomerGSTINFieldError(String data){
        verifyTextByXpath("//span[text()='"+data+"']", data);
        return this;
  } 
}

