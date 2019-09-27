package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoungePage extends GenericWrappers{
	public LoungePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public LoungePage selectStationName(int data){
        selectIndexByXpath("//select[@name='city']", data);
        return this;
  }
  public LoungePage selectLounges(int data){
              sleepThread(3000);
        selectIndexByXpath("//select[@name='laungecity']", data);
        return this;
  }
  public LoungePage selectNoOfPersons(int data){
        selectIndexByXpath("//select[@name='selPassangers']", data);
        return this;
  }
  public LoungePage enterCheckInDate(){
        clickByXpath("//input[@name='acservicecheckindate']");
        clickByXpath("//table//tr[5]//span[text()='27']");
        return this;
  }
  public LoungePage selectCheckInTime(int data){
        selectIndexByXpath("//select[@name='checkInTime']", data);
        return this;
  }
  public LoungePage selectDuration(int data){
        selectIndexByXpath("//select[@name='checkOutTime']", data);
        return this;
  }
  public TourismLoginPage clickOnBook(){
              sleepThread(5000);
        clickByXpath("//button[text()='Book']");
        sleepThread(5000);
        return new TourismLoginPage(driver, test);
  }
}
