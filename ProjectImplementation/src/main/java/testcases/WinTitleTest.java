package testcases;
 
import java.util.Set;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
import wrappers.GenericWrappers;
 
public class WinTitleTest extends GenericWrappers {
@Test
      public void test() {
            // TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.nvsp.in");
            String win1 = driver.getTitle();
            clickByXpath("//*[@id='main-content']/div/div/div[2]/div[1]/div[1]/div/div[2]/a");
            switchToLastWindow();
            String win2 = driver.getTitle();
            System.out.println(win1);
            System.out.println(win2);
     
            Set<String> allwinid = driver.getWindowHandles();
            for (String eachwinid : allwinid) {
                  if (driver.getTitle().equals("NVSP Service Portal")) {
                      //  closeBrowser();                    
                  }
                  driver.switchTo().window(eachwinid);
            }
      }
}