package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class NsvpForm7SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.nvsp.in/Forms/Forms/form7?lang=en-GB");
		driver.findElementById("applicantName").sendKeys("Poorvisha");
		driver.findElementById("applicantSurName").sendKeys("Visha");
		driver.findElementById("ApplicantrPartNumber").sendKeys("123");
		driver.findElementById("ApplicantSerialNumber").sendKeys("4567");
		driver.findElementById("applicantEPIC").sendKeys("A98732100");
		driver.findElementById("AppliacntMobile").sendKeys("9876543210");
		driver.findElementById("AppliantEmail").sendKeys("tester@email.com");
		driver.findElementById("objectorName").sendKeys("Poorvisha");
		driver.findElementById("ObjectorSurname").sendKeys("Sarvesan");
		driver.findElementById("objecotrPartNO").sendKeys("456");
		driver.findElementById("objecotrSrINPartNO").sendKeys("7890");
		driver.findElementById("ObjectorEPIC").sendKeys("B74185296");
		driver.findElementById("applicantFormPlace").sendKeys("Chennai");
		driver.findElementById("submit_button_store_id").click();
	}

}
