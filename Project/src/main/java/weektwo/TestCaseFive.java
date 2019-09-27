package weektwo;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseFive {

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
		Thread.sleep(5000);
		WebElement stationname = driver.findElementByName("city");
		Select selstationname = new Select(stationname);
		selstationname.selectByIndex(1);
		Thread.sleep(5000);
		WebElement lounges = driver.findElementByName("laungecity");
		Select sellounges = new Select(lounges);
		sellounges.selectByValue("1: Object");;
		Thread.sleep(5000);
		WebElement noofper = driver.findElementByName("selPassangers");
		Select selnoofper = new Select(noofper);
		selnoofper.selectByIndex(2);
		Thread.sleep(5000);
		driver.findElementByName("acservicecheckindate").click();
		driver.findElementByXPath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[4]/div[1]/div/div/table/tbody/tr[3]/td[6]/span").click();
		WebElement checkin = driver.findElementByName("checkInTime");
		Select selcheckin = new Select(checkin);
		selcheckin.selectByIndex(9);
		WebElement duration = driver.findElementByName("checkOutTime");
		Select selduration = new Select(duration);
		selduration.selectByIndex(5);
		Thread.sleep(10000);
		driver.findElementByXPath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[10]/button[2]").click();
		Thread.sleep(10000);
		String email = "vishaas@gmail.com";
		driver.findElementByName("email").sendKeys(email);
		String phno = "9566110716";
		driver.findElementByName("mobileNo").sendKeys(phno);
		driver.findElementByXPath("//*[@id='gulogin-form']/div[3]/div/input").click();
		Thread.sleep(10000);
		WebElement gstoption = driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[1]/div[1]/select");
        Select selgstoption = new Select(gstoption);
		selgstoption.selectByIndex(1);
		driver.findElementByName("gstNo").sendKeys("12345678");
		driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[1]/td[2]/div/input").sendKeys("Poorvisha");
		driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[2]/td[2]/div/input").sendKeys("Poorvi");
		driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[3]/td[2]/div/input").sendKeys("Visha");
		driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[1]/td[3]/div/input").sendKeys("25");
		driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[2]/td[3]/div/input").sendKeys("30");
		driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[3]/td[3]/div/input").sendKeys("35");
		WebElement genderone = driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[1]/td[4]/div/select");
		Select selgenderone = new Select(genderone);
		selgenderone.selectByIndex(2);
		WebElement gendertwo = driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[2]/td[4]/div/select");
		Select selgendertwo = new Select(gendertwo);
		selgendertwo.selectByIndex(2);
		WebElement genderthree = driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[3]/td[4]/div/select");
		Select selgenderthree = new Select(genderthree);
		selgenderthree.selectByIndex(1);
		WebElement state = driver.findElementByName("state");
		Select selstate = new Select(state);
		selstate.selectByIndex(12);
		driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[5]/button[3]").click();
		String gsterror = driver.findElementByXPath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[1]/div[2]/span").getText();
       if(gsterror.equals("Please Enter Valid GSt number"))
       {
    	   System.out.println("Error message is displayed correctly");
       }
       else
       {
    	   System.out.println("Error message is displayed incorrectly");
       }
	}
}