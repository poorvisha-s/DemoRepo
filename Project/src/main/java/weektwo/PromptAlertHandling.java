package weektwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	    WebElement newFrame = driver.findElementById("iframeResult");
	    driver.switchTo().frame(newFrame);
		driver.findElementByXPath("/html/body/button").click();
		driver.switchTo().alert().sendKeys("Liberty");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
		
	}

}
