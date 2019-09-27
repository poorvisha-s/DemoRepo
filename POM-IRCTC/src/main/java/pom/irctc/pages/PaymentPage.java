package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PaymentPage extends GenericWrappers{
	public PaymentPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public PaymentPage printTransactionId(){
        String data = getAttributeByXpath("//div/span[text()='Transaction ID :']/following-sibling::input", "value");
        System.out.println("Transaction ID = "+data);
        return this;
  }
}

