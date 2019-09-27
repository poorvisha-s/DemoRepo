package weektwo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.findElementByLinkText("AGENT LOGIN").click();
        driver.findElementByXPath("//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a").click();
        driver.findElementById("userRegistrationForm:userName").sendKeys("poorvi_s");
		driver.findElementById("userRegistrationForm:password").sendKeys("test@123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("test@123");
		WebElement secques = driver.findElementById("userRegistrationForm:securityQ");
		Select selsecques = new Select(secques);
		selsecques.selectByIndex(2);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Test Answer");
		WebElement preflang = driver.findElementById("userRegistrationForm:prelan");
		Select selpreflang = new Select(preflang);
		selpreflang.selectByIndex(0);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Poorvisha");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Poorvi");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Visha");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement dobdate = driver.findElementById("userRegistrationForm:dobDay");
		Select seldobdate = new Select(dobdate);
		seldobdate.selectByIndex(18);
		WebElement dobmonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select seldobmonth = new Select(dobmonth);
		seldobmonth.selectByIndex(1);
		WebElement dobyear = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select seldobyear = new Select(dobyear);
		seldobyear.selectByIndex(8);
		WebElement occup = driver.findElementById("userRegistrationForm:occupation");
		Select seloccup = new Select(occup);
		seloccup.selectByIndex(2);
		driver.findElementById("userRegistrationForm:uidno").sendKeys("1234123456785678");
		driver.findElementById("userRegistrationForm:idno").sendKeys("ABCDE1234F");
		WebElement coun = driver.findElementById("userRegistrationForm:countries");
		Select selcoun = new Select(coun);
		selcoun.selectByIndex(1);
		driver.findElementById("userRegistrationForm:email").sendKeys("tester@email.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9876543210");
		WebElement natio = driver.findElementById("userRegistrationForm:nationalityId");
		Select selnatio = new Select(natio);
		selnatio.selectByIndex(1);
		driver.findElementById("userRegistrationForm:address").sendKeys("12A");
		driver.findElementById("userRegistrationForm:street").sendKeys("Test street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Medavakkam");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600100");
		driver.findElementById("userRegistrationForm:pincode").sendKeys(Keys.TAB);
		//driver.findElementById("userRegistrationForm:statesName").sendKeys("Tamil Nadu");
		Thread.sleep(5000);
		WebElement citytown = driver.findElementById("userRegistrationForm:cityName");
		Select selcitytown = new Select(citytown);
		selcitytown.selectByIndex(1);
		Thread.sleep(5000);
		WebElement postoff = driver.findElementById("userRegistrationForm:postofficeName");
		Select selpostoff = new Select(postoff);
		selpostoff.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("76543210");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		driver.findElementById("nlpAnswer").sendKeys("ABCD");
		driver.findElementById("userRegistrationForm:newsletter:1").click();
		driver.findElementById("userRegistrationForm:commercialpromo:1").click();
		driver.findElementById("userRegistrationForm:irctcsbicard:0").click();
	}

}
