package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
				driver.findElementById("userRegistrationForm:userName").sendKeys("poorvi_s");
				driver.findElementById("userRegistrationForm:password").sendKeys("testpword");
				driver.findElementById("userRegistrationForm:confpasword").sendKeys("testpword");
				driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("test sec answer");
				driver.findElementById("userRegistrationForm:firstName").sendKeys("Poorvisha");
				driver.findElementById("userRegistrationForm:middleName").sendKeys("Poorvi");
				driver.findElementById("userRegistrationForm:lastName").sendKeys("Visha");
				driver.findElementById("userRegistrationForm:gender:1").click();
				driver.findElementById("userRegistrationForm:maritalStatus:0").click();
				driver.findElementById("userRegistrationForm:uidno").sendKeys("1234678912346789");
				driver.findElementById("userRegistrationForm:idno").sendKeys("ABCDE1234F");
				driver.findElementById("userRegistrationForm:email").sendKeys("tester@email.com");
				//driver.findElementById("userRegistrationForm:isdCode").sendKeys("+91");
				driver.findElementById("userRegistrationForm:mobile").sendKeys("9876543210");
				driver.findElementById("userRegistrationForm:address").sendKeys("A1");
				driver.findElementById("userRegistrationForm:street").sendKeys("test street");
				driver.findElementById("userRegistrationForm:area").sendKeys("test area");
				//driver.findElementById("userRegistrationForm:pincode").sendKeys("600100");
				//driver.findElementById("userRegistrationForm:statesName").sendKeys("Tamil Nadu");
				//driver.findElementById("userRegistrationForm:landline").sendKeys("98765432");
				driver.findElementById("userRegistrationForm:newsletter:1").click();
				driver.findElementById("userRegistrationForm:commercialpromo:1").click();
				driver.findElementById("userRegistrationForm:j_idt502").click();
	}

}
