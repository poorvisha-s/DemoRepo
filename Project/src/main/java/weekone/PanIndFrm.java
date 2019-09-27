package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class PanIndFrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://panind.com/india/new_pan/");
		driver.findElementById("pan_firstname").sendKeys("Poorvisha");
		driver.findElementById("pan_middlename").sendKeys("Poorvi");
		driver.findElementById("pan_lastname").sendKeys("Visha");
		driver.findElementById("pan_fatherfirstname").sendKeys("Sarvesan");
		driver.findElementById("pan_fathermiddlename").sendKeys("Sarvi");
		driver.findElementById("pan_fatherlastname").sendKeys("San");
		driver.findElementById("pan_mobilenumber").sendKeys("9876543210");
		driver.findElementById("pan_email").sendKeys("tester@email.com");
		driver.findElementById("pan_dob").sendKeys("19021990");
		driver.findElementById("pan_dob").sendKeys(Keys.TAB);
		driver.findElementById("pan_addressline1").sendKeys("TEST STREET");
		driver.findElementById("pan_addressline2").sendKeys("Medavakkam");
		driver.findElementById("pan_cityname").sendKeys("Chennai");
		driver.findElementById("pan_pincode").sendKeys("600100");
		driver.findElementByXPath("//*[@id='msform']/div[16]/div[2]/input[2]").click();

	}

}
