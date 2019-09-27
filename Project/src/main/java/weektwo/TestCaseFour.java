package weektwo;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseFour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementByXPath("//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a").click();
		driver.findElementByXPath("//*[@id='bluemenu']/ul/li[2]/a").click();
		driver.findElementByXPath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/a").click();
		driver.findElementByXPath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/ul/li[4]/a").click();
		Set<String> allwinid = driver.getWindowHandles();
		for (String eachwinid : allwinid) {
		                driver.switchTo().window(eachwinid);
		}
		Thread.sleep(10000);
		driver.findElementByXPath("//*[@id='slider-1']/div[1]/div[2]/a[3]/div").click();		
		driver.findElementByXPath("/html/body/app-root/homeheader/header/nav/div/div/a[2]/i").click();
		driver.findElementByXPath("//*[@id='mySidenav']/ul/li[11]/a").click();
		driver.findElementByXPath("//*[@id='dealBriefnew']/ul/li[2]/a").click();
		Thread.sleep(10000);
		driver.findElementByName("name").sendKeys("Poorvi");
		driver.findElementByName("organization").sendKeys("test org");
		driver.findElementByName("address").sendKeys("12,Test Steet, Test Area, Chennai - 600040");
		driver.findElementByName("email").sendKeys("tester@email.com");
		WebElement req = driver.findElementByName("requestFor");
		Select selreq = new Select(req);
		selreq.selectByIndex(1);
		driver.findElementByName("originStation").sendKeys("Chennai");
		driver.findElementByName("destnStation").sendKeys("Delhi");
		driver.findElementByName("checkInDate").click();
		driver.findElementByXPath("//*[@id='Saloon-wrap']/div[4]/div/div/table//tbody/tr[3]/td[1]/span").click();
		driver.findElementByName("checkOutDate").click();
		driver.findElementByXPath("//*[@id='Saloon-wrap']/div[5]/div/div/table//tbody/tr[3]/td[4]").click();
		driver.findElementByName("durationPeriod").sendKeys("2");
		driver.findElementByName("coachDetails").sendKeys("coach");
		driver.findElementByName("numPassenger").sendKeys("2");
		driver.findElementByName("charterPurpose").sendKeys("test purpose");
		driver.findElementByName("services").sendKeys("all services"+Keys.TAB);
		driver.findElementByXPath("/html/body/app-root/saloon_charter/section[2]/div/div/div/div/div/div/div[2]/form/div[11]/button").submit();
		String errormobile = driver.findElementByXPath("/html/body/app-root/saloon_charter/section[2]/div/div/div/div/div/div/div[2]/form/div[4]/span").getText();
		 if(errormobile.equals("Mobile field is required."))
	       {
	    	   System.out.println("Error message is displayed correctly");
	       }
	       else
	       {
	    	   System.out.println("Error message is displayed incorrectly");
	       }
	}
}
