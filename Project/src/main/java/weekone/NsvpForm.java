package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class NsvpForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nvsp.in/Forms/Forms/form6?lang=en-GB");
		driver.findElementById("applicantName").sendKeys("Poorvi");
		driver.findElementById("applicantSurname").sendKeys("Visha");
		driver.findElementById("applicantFMHName").sendKeys("Arun");
		driver.findElementById("applicantFMHSurname").sendKeys("Prakash");
		driver.findElementById("RbdDateOfBirth").click();
		//driver.findElementById("txtDateOfBirth").sendKeys("19/02/1990");
		driver.findElementById("applicantPresentHouseNo").sendKeys("12B");
		driver.findElementById("applicantPresentStreet").sendKeys("Test Street");
		driver.findElementById("applicantPresentVillage").sendKeys("Chennai");
		driver.findElementById("applicantPresentPostoffice").sendKeys("Medavakkam");
		driver.findElementById("applicantPresentPincode").sendKeys("600100");
		driver.findElementById("chkPermanent").click();
		//driver.findElementById("applicantPermanentHouseNo").sendKeys("12B");
		//driver.findElementById("applicantPermanentStreet").sendKeys("Test Street");
		//driver.findElementById("applicantPermanentVillage").sendKeys("Chennai");
		//driver.findElementById("applicantPermanentPostoffice").sendKeys("Medavakkam");
		//driver.findElementById("applicantPermanentPincode").sendKeys("600100");
		driver.findElementById("applicantFamilyPrevepicno").sendKeys("ABC123456");
		driver.findElementByName("OTHER_DISABLITY").sendKeys("Not Applicable");
		driver.findElementById("applicantEmail").sendKeys("tester@email.com");
		driver.findElementById("applicantMobile").sendKeys("9876543210");
		driver.findElementById("applicantBirthVillage").sendKeys("Chennai");
		driver.findElementById("txtRESIDENT_SINCE").sendKeys("15/05/2010");
		driver.findElementById("applicantFormPlace").sendKeys("Medavakkam");
		driver.findElementById("submit_button_store_id").click();
	}

}
