package weekone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrroSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		driver.findElementByXPath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a").click();
		driver.findElementById("u_id").sendKeys("poorvi@123");
		driver.findElementById("u_pwd").sendKeys("qwerty@123");
		driver.findElementById("u_repwd").sendKeys("qwerty@123");
		driver.findElementById("u_secans").sendKeys("test security answer");
		driver.findElementById("u_name").sendKeys("Poorvisha");
		driver.findElementByXPath("//*[@id='u_dob']").sendKeys("19/02/1990");
		driver.findElementById("u_designation").sendKeys("test design");
		driver.findElementById("u_emailid").sendKeys("tester@email.com");
		driver.findElementById("u_mobile").sendKeys("9876543210");
		driver.findElementById("u_phone").sendKeys("98765432");
		driver.findElementByXPath("//*[@id='name']").sendKeys("ABC Company Ltd");
		driver.findElementById("capacity").sendKeys("1500");
		driver.findElementById("address").sendKeys("12, Test Street, Chennai - 600100");
		driver.findElementById("email").sendKeys("company@email.com");
		driver.findElementById("mcontact").sendKeys("8765432109");
		driver.findElementById("contact").sendKeys("87654321");
		driver.findElementByName("name_o").sendKeys("Visha");
		driver.findElementByName("address_o").sendKeys("78, Owner street, Chennai - 600040");
		driver.findElementByName("emailid_o").sendKeys("owner@email.com");
		driver.findElementByName("phoneno_o").sendKeys("7465321089");
		driver.findElementByName("mobile_o").sendKeys("7654321");
		driver.findElementByName("submitb").click();
		

	}

}
