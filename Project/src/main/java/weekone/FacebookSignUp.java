package weekone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
driver.findElementByName("firstname").sendKeys("Poorvisha");
driver.findElementByName("lastname").sendKeys("Sarvesan");
driver.findElementByName("reg_email__").sendKeys("123456789");
driver.findElementByName("reg_passwd__").sendKeys("qwerty");
driver.findElementById("u_0_9").click();
driver.findElementByName("websubmit").click();


	}

}
