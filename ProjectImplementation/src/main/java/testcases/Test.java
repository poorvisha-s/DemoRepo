package testcases;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		            driver.get("https://www.nvsp.in");
		            @SuppressWarnings("unused")
					String win1 = driver.getTitle();
		            driver.findElementByXPath("//*[@id='main-content']/div/div/div[2]/div[1]/div[1]/div/div[2]/a").click();
		            //switchToLastWindow();
		            //String win2 = driver.getTitle();
		            //System.out.println(win1);
		            //System.out.println(win2);
		     Set<String> allwinid = driver.getWindowHandles();
		            for (String eachwinid : allwinid) {
		            	driver.switchTo().window(eachwinid);
		                String win = driver.getTitle();
		                System.out.println(win);
		            	if (win.equals("Form6")) {
		            continue;                   
		                  } else {
		                	  driver.close();
		                  }
		            }
		      }
		
	}