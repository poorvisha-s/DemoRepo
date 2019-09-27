package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SummaryPage extends GenericWrappers{
	public SummaryPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public SummaryPage verifyEmail(String data){
        //String actData = getTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[2]/div[1]/span");
        //Assert.assertEquals(actData, data, "Verify Email");
  verifyTextByXpath("//div/label[text()='Email ID']/following-sibling::span", data);
  return this;
}
public SummaryPage verifyPhone(String data){
  verifyTextByXpath("//div/label[text()='Phone No.']/following-sibling::span", data);
  return this;
}
public SummaryPage printBookingAmount(){
  String data = getTextByXpath("//div/label[text()='Booking Amount :']/following-sibling::span");
  System.out.println("Booking amount = "+data);
  return this;
}
public SummaryPage printGST(){
  String data = getTextByXpath("//div/label[text()='GST : ']/following-sibling::span");
  System.out.println("GST = "+data);
  return this;
}
public SummaryPage printTotalAmount(){
  String data = getTextByXpath("//div/label[text()='Total Amount: ']/following-sibling::span");
  System.out.println("Totalamount = "+data);
  return this;
}
public SummaryPage sendPageDown(){
  pageDownByXpath("/html/body");
  return this;
}
public SummaryPage clickOnIAgree(){
          sleepThread(5000);
                          pageDownByXpath("/html/body");
  clickByXpath("//label[@for='lr2']/span");
  return this;
}
public PaymentPage clickOnMakePayment(){
  clickByXpath("//button[text()='MAKE PAYMENT']");
  sleepThread(5000);
  return new PaymentPage(driver, test);
}
}

