package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class NsvpForm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nvsp.in/Forms/Forms/form8?lang=en-GB");
		driver.findElementById("applicantName").sendKeys("Poorvi");
		driver.findElementById("applicantSurname").sendKeys("Visha");
		driver.findElementById("applicantPartNumber").sendKeys("1234");
		driver.findElementById("applicantSerialNumberInPart").sendKeys("5678");
		driver.findElementById("applicantOldEPIC").sendKeys("ABC75345682");
		driver.findElementById("chkIS_NAME_CORRECTION").click();
		driver.findElementById("chkIS_EPIC_NO_CORRECTION").click();
		driver.findElementById("chkIS_DOB_CORRECTION").click();
		driver.findElementById("CORRECTED_applicantName").sendKeys("Visha");
		driver.findElementById("CORRECTED_applicantSurname").sendKeys("Poorvi");
		driver.findElementById("CorrectEPIC").sendKeys("DEF12345678");
		driver.findElementById("txtDateOfBirth").sendKeys("16101983");
		driver.findElementById("applicantEmail").sendKeys("tester@email.com");
		driver.findElementById("applicantMobile ").sendKeys("9876543210");
		driver.findElementById("applicantFormPlace").sendKeys("Chennai");
		driver.findElementById("submit_button_store_id").click();
	
	}

}
