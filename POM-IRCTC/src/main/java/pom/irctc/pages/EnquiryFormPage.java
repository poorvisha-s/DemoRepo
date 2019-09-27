package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers{
	public EnquiryFormPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public EnquiryFormPage enterNameOfApplicant(String data){
        enterByXpath("//input[@name='name']", data);
        return this;
  }
  public EnquiryFormPage enterNameOfOrganisation(String data){
      enterByXpath("//input[@name='organization']", data);
        return this;
  }
  public EnquiryFormPage enterAddress(String data){
      enterByXpath("//input[@name='address']", data);
        return this;
  }
  public EnquiryFormPage enterMobile(String data){
        enterByXpath("//input[@name='mobile']", data);
        return this;
  }
  public EnquiryFormPage enterEmailId(String data){
      enterByXpath("//input[@name='email']", data);
        return this;
  }
  public EnquiryFormPage selectRequestFor(int data){
      selectIndexByXpath("//select[@name='requestFor']", data);
        return this;
  }
 public EnquiryFormPage enterOriginatingStation(String data){
      enterByXpath("//input[@name='originStation']", data);
        return this;
  }
  public EnquiryFormPage enterDestinationStation(String data){
      enterByXpath("//input[@name='destnStation']", data);
        return this;
  }
  public EnquiryFormPage selectDateOfDeparture(){
      clickByXpath("//input[@name='checkInDate']");
      clickByXpath("//span[text()='27']");
        return this;
  }
  public EnquiryFormPage selectDateOfArrival(){
           sleepThread(5000);
      clickByXpath("//input[@name='checkOutDate']");
      clickByXpath("//input[@name='checkOutDate']//following::table//tr/td/span[text()='27']");
        return this;
  }
  public EnquiryFormPage enterDurationOfTour(String data){
      enterByXpath("//input[@name='durationPeriod']", data);
        return this;
  }
  public EnquiryFormPage enterNoAndTypeOfCoaches(String data){
      enterByXpath("//input[@name='coachDetails']", data);
        return this;
  }
  public EnquiryFormPage enterNoOfPassengers(String data){
      enterByXpath("//input[@name='numPassenger']", data);
        return this;
  }
  public EnquiryFormPage enterPurposeOFCharter(String data){
      enterByXpath("//textarea[@name='charterPurpose']", "test purpose");
        return this;
  }
  public EnquiryFormPage enterAdditionalServices(String data){
      enterByXpath("//textarea[@name='services']", data);
        return this;
  }
  public EnquiryFormPage clickOnSubmit(){
      submitByXpath("//button[text()='Submit']");
        return this;
  }
  public EnquiryFormPage verifyMobileFieldError(String data){
      verifyTextByXpath("//*[text()='Mobile field is required.']", data);          
        return this;
  }   
}
