package weektwo;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementByXPath("//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a").click();
		driver.findElementByXPath("//*[@id='bluemenu']/ul/li[6]/a").click();
		driver.findElementByXPath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a").click();
		Set<String> allwinid = driver.getWindowHandles();
		for (String eachwinid : allwinid) {
		                driver.switchTo().window(eachwinid);
		}
		Thread.sleep(10000);
		driver.findElementByXPath("//*[@id='main-content']/div/div/div[2]/div[1]/div[1]/div/div[2]/a").click();
		allwinid = driver.getWindowHandles();
		for (String eachwinid : allwinid) {
		                driver.switchTo().window(eachwinid);
		}
		Thread.sleep(10000);
		WebElement lang = driver.findElementById("language");
		Select sellang = new Select(lang);
		sellang.selectByIndex(1);
		Thread.sleep(5000);
		WebElement state = driver.findElementByName("ST_CODE");
		Select selstate = new Select(state);
		selstate.selectByIndex(1);
		Thread.sleep(5000);
		WebElement dist = driver.findElementById("distList");
		Select seldist = new Select(dist);
		seldist.selectByIndex(1);
		Thread.sleep(5000);
		WebElement consti = driver.findElementByName("AC_NO");
		Select selconsti = new Select(consti);
		selconsti.selectByIndex(1);
		Thread.sleep(5000);
		driver.findElementById("isExistingVoter").click();
		driver.findElementById("applicantName").sendKeys("Poorvi");
		driver.findElementById("applicantSurname").sendKeys("Visha");
		driver.findElementById("applicantFMHName").sendKeys("Arun");
		driver.findElementById("applicantFMHSurname").sendKeys("Prakash");
		WebElement typeofrel = driver.findElementById("applicantRelationType");
		Select seltypeofrel = new Select(typeofrel);
		seltypeofrel.selectByIndex(1);
		driver.findElementById("RbdDateOfBirth").click();	
		driver.findElementById("txtDateOfBirth").sendKeys("19021990");
		WebElement gender = driver.findElementById("elector_gender");
		Select selgender = new Select(gender);
		selgender.selectByIndex(1);
		driver.findElementById("applicantPresentHouseNo").sendKeys("12B");
		driver.findElementById("applicantPresentStreet").sendKeys("Test Street");
		driver.findElementById("applicantPresentVillage").sendKeys("Chennai");
		driver.findElementById("applicantPresentPostoffice").sendKeys("Medavakkam");
		driver.findElementById("applicantPresentPincode").sendKeys("600100");
        driver.findElementById("chkPermanent").click();
		driver.findElementById("applicantFamilyPrevepicno").sendKeys("ABC123456");
		driver.findElementByName("OTHER_DISABLITY").sendKeys("Not Applicable");
		driver.findElementById("applicantEmail").sendKeys("tester@email.com");
		driver.findElementById("applicantMobile").sendKeys("9876543210");
		driver.findElementById("applicantBirthVillage").sendKeys("Chennai");
		WebElement birthstate = driver.findElementById("applicantBirthState");
		Select selbirthstate = new Select(birthstate);
		selbirthstate.selectByIndex(1);
		Thread.sleep(5000);
		WebElement birthdist = driver.findElementById("applicantBirthDistrict");
		Select selbirthdist = new Select(birthdist);
		selbirthdist.selectByIndex(1);
		driver.findElementById("txtRESIDENT_SINCE").sendKeys("15052010");
		WebElement prevsate = driver.findElementById("ddPrevState");
		Select selprevsate = new Select(prevsate);
		selprevsate.selectByIndex(1);
		WebElement prevac = driver.findElementById("ddPrevac");
		Select selprevac = new Select(prevac);
		selprevac.selectByIndex(1);

		driver.findElementById("applicantPreHouseNo").sendKeys("11");
		driver.findElementById("applicantPreStreet").sendKeys("prev st");
		driver.findElementById("applicantPreVillage").sendKeys("pre town");
		driver.findElementById("applicantPrePostoffice").sendKeys("pre post");
		driver.findElementById("applicantPrePincode").sendKeys("600100");
		WebElement prevdist = driver.findElementById("Prev_DistNo");
		Select selprevdist = new Select(prevdist);
		selprevdist.selectByIndex(1);
		driver.findElementById("applicantFormPlace").sendKeys("Medavakkam");
		
	}

}
