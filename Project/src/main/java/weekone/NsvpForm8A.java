package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class NsvpForm8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nvsp.in/Forms/Forms/form8a?lang=en-GB");
		driver.findElementById("applicantFirstName").sendKeys("Poorvi");
		driver.findElementById("applicantSurname").sendKeys("Visha");
		driver.findElementById("applicantPartNumber").sendKeys("1234");
		driver.findElementById("applicantSerialNumberInPart").sendKeys("5678");
		driver.findElementById("applicantPrevepicno").sendKeys("ABC75345682");
		driver.findElementById("applicantFamilyPrevepicno").sendKeys("DEF45612378");
		driver.findElementById("applicantEmail").sendKeys("tester@email.com");
		driver.findElementById("applicantMobile").sendKeys("9876543210");
		driver.findElementById("applicantPresentHouseNo").sendKeys("12B");
		driver.findElementById("applicantPresentStreet").sendKeys("Test Street");
		driver.findElementById("applicantPresentVillage").sendKeys("Chennai");
		driver.findElementById("applicantPresentPostoffice").sendKeys("Medavakkam");
		driver.findElementById("applicantPresentPincode").sendKeys("600100");
		driver.findElementById("applicantFormPlace").sendKeys("Chennai");
		driver.findElementById("submit_button_store_id").click();
	}

}
