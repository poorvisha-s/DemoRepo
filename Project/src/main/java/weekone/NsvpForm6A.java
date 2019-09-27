package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class NsvpForm6A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nvsp.in/Forms/Forms/form6a?lang=en-GB");
		driver.findElementById("applicantFirstName").sendKeys("Poorvi");
		driver.findElementById("applicantSurname").sendKeys("Visha");
		driver.findElementById("applicantFMHFirstName").sendKeys("Arun");
		driver.findElementById("applicantFMHSurname").sendKeys("Prakash");
		driver.findElementById("txtDateOfBirth").sendKeys("19021990");
		driver.findElementById("applicantBirthVillage").sendKeys("Chennai");
		driver.findElementById("applicantEmail").sendKeys("tester@email.com");
		driver.findElementById("applicantMobile").sendKeys("9876543210");
		driver.findElementByName("HOUSE_NO").sendKeys("12B");
		driver.findElementByName("STREET_AREA").sendKeys("Test Street");
		driver.findElementByName("VILLAGE").sendKeys("Chennai");
		driver.findElementByName("POST_OFFICE").sendKeys("Medavakkam");
		driver.findElementByName("PIN_CODE").sendKeys("600100");
		driver.findElementByName("PASSPORT_NO").sendKeys("A1234567");
		driver.findElementByName("PASSPORT_ISSUE_PLACE").sendKeys("Chennai");
		driver.findElementById("txtPresentPassportIssueDate").sendKeys("12012005");
		driver.findElementById("txtPresentPassportExpDate").sendKeys("12/01/2025");
		driver.findElementByName("VISA_NO").sendKeys("01234567");
		driver.findElementByName("VISA_TYPE").sendKeys("Single");
		driver.findElementById("txtPresentVisaIssueDate").sendKeys("14052018");
		driver.findElementById("txtPresentVisaExpDate").sendKeys("18032021");
		driver.findElementByName("VISA_ISSUING_AUTHORITY").sendKeys("Officer");
		driver.findElementByClassName("CorrectioninName").click();
		driver.findElementById("txtABSENT_DATE").sendKeys("15052018");
		driver.findElementByName("ABROAD_HOUSE_NO").sendKeys("14");
		driver.findElementByName("ABROAD_STREET_AREA").sendKeys("Test Other Street");
		driver.findElementByName("ABROAD_VILLAGE").sendKeys("Test Village");
		driver.findElementByName("ABROAD_STATE").sendKeys("Test State");
		driver.findElementById("applicantAbroadCountry").sendKeys("United Kingdom");
		driver.findElementById("applicantAbroadZipCode").sendKeys("AB1 2CD");
		driver.findElementByName("APPLICANT_PLACE").sendKeys("Chennai");
		driver.findElementById("submit_button_store_id").click();
	}

}
