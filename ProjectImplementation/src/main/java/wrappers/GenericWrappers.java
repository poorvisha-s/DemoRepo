package wrappers;
 
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
 
public class GenericWrappers implements Wrappers{
 
      RemoteWebDriver driver;
      int i = 1;
     
      public void invokeApp(String browser, String url) {
            // TODO Auto-generated method stub
            try {
                  if(browser.equalsIgnoreCase("chrome")) {
                        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
                        driver = new ChromeDriver();
                  }
                  else if(browser.equalsIgnoreCase("firefox")) {
                        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
                        driver = new FirefoxDriver();
                  }
                  else if(browser.equalsIgnoreCase("ie")) {
                        System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
                        driver = new InternetExplorerDriver();
                  }
                  driver.manage().window().maximize();
                  driver.get(url);
                  System.out.println("The browser "+browser+" is launched with URL: "+url);
            } catch (WebDriverException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The browser "+browser+" is not launched due to unknown error");
            } finally {
                  takeSnap();
            }
      }
      
      public void enterById(String idValue, String data) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementById(idValue).sendKeys(data);
                  System.out.println("The element with id "+idValue+" is entered with data "+data);
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with id "+idValue+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+idValue+" is not visible in the application");           
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+idValue+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+idValue+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void enterByName(String nameValue, String data) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementByName(nameValue).sendKeys(data);
                  System.out.println("The element with name "+nameValue+" is entered with data "+data);
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with name "+nameValue+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with name "+nameValue+" is not visible in the application");        
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with name "+nameValue+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with name "+nameValue+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void enterByXpath(String xpathValue, String data) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementByXPath(xpathValue).sendKeys(data);
                  System.out.println("The element with XPath "+xpathValue+" is entered with data "+data);
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with XPath "+xpathValue+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathValue+" is not visible in the application");      
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathValue+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathValue+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      public void verifyTitle(String title) {
            // TODO Auto-generated method stub
            try {
                  String txt = driver.getTitle();
                  if(txt.equals(title)){
                        System.out.println("The title of the browser is dispalyed correctly as "+title);
                  }
                  else {
                        System.out.println("The title of the browser is displayed incorrectly");
                  }
                  System.out.println("The title of the browser is verified");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void verifyTextById(String id, String text) {
            // TODO Auto-generated method stub
            try {
                  String txt = driver.findElementById(id).getText();
                  if(txt.equals(text)){
                        System.out.println("The text in the element with id "+id+" is displayed correctly as "+text);
                  }
                  else {
                        System.out.println("The text in the element with id "+id+" is displayed incorrectly");
                  }
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with id "+id+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+id+" is not visible in the application");         
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+id+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void verifyTextByXpath(String xpath, String text) {
            // TODO Auto-generated method stub
            try {
                  String txt = driver.findElementByXPath(xpath).getText();
                  if(txt.equals(text)){
                        System.out.println("The text in the element with XPath "+xpath+" is displayed correctly as "+text);
                  }
                  else {
                        System.out.println("The text in the element with XPath "+xpath+" is displayed incorrectly");
                  }
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with XPath "+xpath+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpath+" is not visible in the application");           
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpath+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void verifyTextContainsByXpath(String xpath, String text) {
            // TODO Auto-generated method stub
            try {
                  String txt = driver.findElementByXPath(xpath).getText();
                  if(txt.contains(text)){
                        System.out.println("The text in the element with XPath "+xpath+" contains "+text);
                  }
                  else {
                        System.out.println("The text in the element with XPath "+xpath+" does not contain "+text);
                  }
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with XPath "+xpath+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpath+" is not visible in the application");           
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpath+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void clickById(String id) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementById(id).click();
                  System.out.println("The element with id "+id+" is clicked");
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with id "+id+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+id+" is not visible in the application");         
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+id+" is not interactable");                 
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+id+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void clickByClassName(String classVal) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementByClassName(classVal).click();
                  System.out.println("The element with ClassName "+classVal+" is clicked");
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with ClassName "+classVal+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with ClassName "+classVal+" is not visible in the application");     
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with ClassName "+classVal+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with ClassName "+classVal+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void clickByName(String name) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementByName(name).click();
                  System.out.println("The element with Name "+name+" is clicked");
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with Name "+name+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with Name "+name+" is not visible in the application");           
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with Name "+name+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with Name "+name+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void clickByLink(String name) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementByLinkText(name).click();
                  System.out.println("The element with Link Name "+name+" is clicked");
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with Link Name "+name+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with Link Name "+name+" is not visible in the application");        
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with Link Name "+name+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with Link Name "+name+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void clickByLinkNoSnap(String name) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementByLinkText(name).click();
                  System.out.println("The element with Link Name "+name+" is clicked");
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with Link Name "+name+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with Link Name "+name+" is not visible in the application");        
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with Link Name "+name+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with Link Name "+name+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            }
      }
 
      
      public void clickByXpath(String xpathVal) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementByXPath(xpathVal).click();
                  System.out.println("The element with XPath "+xpathVal+" is clicked");
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with XPath "+xpathVal+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathVal+" is not visible in the application");        
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathVal+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathVal+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void clickByXpathNoSnap(String xpathVal) {
            // TODO Auto-generated method stub
            try {
                  driver.findElementByXPath(xpathVal).click();
                  System.out.println("The element with XPath "+xpathVal+" is clicked");
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with XPath "+xpathVal+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathVal+" is not visible in the application");        
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathVal+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathVal+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            }
      }
 
      
      public String getTextById(String idVal) {
            // TODO Auto-generated method stub
            String txt = null;
            try {
                  txt = driver.findElementById(idVal).getText();
                  System.out.println("The element with id "+idVal+" has the text "+txt);
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with id "+idVal+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+idVal+" is not visible in the application");           
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+idVal+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with id "+idVal+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
            return txt;
      }
 
      
      public String getTextByXpath(String xpathVal) {
            // TODO Auto-generated method stub
            String txt = null;
            try {
                  txt = driver.findElementByXPath(xpathVal).getText();
                  System.out.println("The element with XPath "+xpathVal+" has the text "+txt);
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The element with XPath "+xpathVal+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathVal+" is not visible in the application");        
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathVal+" is not interactable");              
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The element with XPath "+xpathVal+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
            return txt;
      }
 
      
      public void selectVisibileTextById(String id, String value) {
            // TODO Auto-generated method stub
            try {
                  WebElement ddown = driver.findElementById(id);
                  Select selddown = new Select(ddown);
                  selddown.selectByVisibleText(value);
                  System.out.println("The dropdown with id "+id+" is selected with visible text value "+value);
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The dropdown with id "+id+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The dropdown with id "+id+" is not visible in the application");         
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The dropdown with id "+id+" is not interactable");
            } catch (ElementNotSelectableException e) {
                  // TODO: handle exception
                  System.err.println("The dropdown with id "+id+" is not selectable");
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The dropdown with id "+id+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      public void selectIndexById(String id, int value) {
            // TODO Auto-generated method stub
            try {
                  WebElement ddown = driver.findElementById(id);
                  Select selddown = new Select(ddown);
                  selddown.selectByIndex(value);
                  System.out.println("The dropdown with id "+id+" is selected with index value "+value);
            } catch (NoSuchElementException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The dropdown with id "+id+" is not found in the DOM" );
            } catch (ElementNotVisibleException e) {
                  // TODO: handle exception
                  System.err.println("The dropdown with id "+id+" is not visible in the application");         
            } catch (ElementNotInteractableException e) {
                  // TODO: handle exception
                  System.err.println("The dropdown with id "+id+" is not interactable");
            } catch (ElementNotSelectableException e) {
                  // TODO: handle exception
                  System.err.println("The dropdown with id "+id+" is not selectable");
            } catch (StaleElementReferenceException e) {
                  // TODO: handle exception
                  System.err.println("The dropdown with id "+id+" is not stable");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
      }
 
      
      
      
      public void switchToParentWindow() {
            // TODO Auto-generated method stub
            String id = null;
      try {
            Set<String> allwinid = driver.getWindowHandles();
            for (String eachid : allwinid) {
                  driver.switchTo().window(eachid);
                  id = eachid;
                  break;
                  }
            System.out.println("The driver switched to the window with Session ID "+id);
      } catch (NoSuchWindowException e) {
            // TODO Auto-generated catch block
            System.err.println("The window with Session ID "+id+" is not available to perform switch");
      } catch (WebDriverException e) {
            // TODO: handle exception
            System.err.println("Browser got closed due to unknown error");
      } finally {
            takeSnap();
      }
      }
 
      
      public void switchToLastWindow() {

            // TODO Auto-generated method stub
            String id = null;
            try {
                  Set<String> allwinid = driver.getWindowHandles();
                  for (String eachid : allwinid) {
                        driver.switchTo().window(eachid);
                        id = eachid;
                        }
                  System.out.println("The driver switched to the window with Session ID "+id);
            } catch (NoSuchWindowException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The window with Session ID "+id+" is not available to perform switch");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
                  takeSnap();
            }
            }
 
      
      public void acceptAlert() {
            // TODO Auto-generated method stub
            try {
                  driver.switchTo().alert().accept();
                  System.out.println("The Alert opened has been accepted");
            } catch (NoAlertPresentException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The Alert is not found");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
				takeSnap();
			}
      }
 
      
      public void dismissAlert() {
            // TODO Auto-generated method stub
            try {
                  driver.switchTo().alert().dismiss();
                  System.out.println("The Alert opened has been dismissed");
            } catch (NoAlertPresentException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The Alert is not found");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            } finally {
				takeSnap();
			}
      }
 
      
      public String getAlertText() {
            // TODO Auto-generated method stub
            String txt = null;
            try {
                  txt = driver.switchTo().alert().getText();
                  System.out.println("The display text message of the Alert opened is: "+txt);
            } catch (NoAlertPresentException e) {
                  // TODO Auto-generated catch block
                  System.err.println("The Alert is not found");
            } catch (WebDriverException e) {
                  // TODO: handle exception
                  System.err.println("Browser got closed due to unknown error");
            }
            return txt;
      }
 
      
      public void takeSnap() {
            // TODO Auto-generated method stub
            try {
                  File tmp = driver.getScreenshotAs(OutputType.FILE);
                  File dest = new File("./Screenshots/snap"+i+".png");
                 FileUtils.copyFile(tmp,dest);
                  System.out.println("The Snapshot is printed in the destination: ./Screenshots/snap"+i+".png");
            } catch (WebDriverException e) {
                  // TODO Auto-generated catch block
                  System.err.println("Browser got closed due to unknown error");
            } catch (IOException e) {
				// TODO Auto-generated catch block
				
			}
            i++;
      }
 
      
      public void closeBrowser() {
            // TODO Auto-generated method stub
            try {
                  driver.close();
                  System.out.println("The active browser is closed");
            } catch (WebDriverException e) {
                  // TODO Auto-generated catch block
                  System.err.println("Browser got closed due to unknown error");
            }
      }

      
      public void closeAllBrowsers() {
            // TODO Auto-generated method stub
            try {
                  driver.quit();
                  System.out.println("The browser is closed");
            } catch (WebDriverException e) {
                  // TODO Auto-generated catch block
                  System.err.println("Browser got closed due to unknown error");
            }
      }

	public void tabById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).sendKeys(Keys.TAB);
			System.out.println("The element with id "+id+" is sent keys tab");
		} catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            System.err.println("The element with id "+id+" is not found in the DOM" );
      } catch (ElementNotVisibleException e) {
            // TODO: handle exception
            System.err.println("The element with id "+id+" is not visible in the application");           
      } catch (ElementNotInteractableException e) {
            // TODO: handle exception
            System.err.println("The element with id "+id+" is not interactable");              
      } catch (StaleElementReferenceException e) {
            // TODO: handle exception
            System.err.println("The element with id "+id+" is not stable");
      } catch (WebDriverException e) {
            // TODO: handle exception
            System.err.println("Browser got closed due to unknown error");
      } finally {
            takeSnap();
      }
	}
	
 
		
	public void selectIndexByName(String name, int value) {
		// TODO Auto-generated method stub
		try {
            WebElement ddown = driver.findElementByName(name);
            Select selddown = new Select(ddown);
            selddown.selectByIndex(value);
            System.out.println("The dropdown with name "+name+" is selected with index value "+value);
      } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            System.err.println("The dropdown with name "+name+" is not found in the DOM" );
      } catch (ElementNotVisibleException e) {
            // TODO: handle exception
            System.err.println("The dropdown with name "+name+" is not visible in the application");         
      } catch (ElementNotInteractableException e) {
            // TODO: handle exception
            System.err.println("The dropdown with name "+name+" is not interactable");
      } catch (ElementNotSelectableException e) {
            // TODO: handle exception
            System.err.println("The dropdown with name "+name+" is not selectable");
      } catch (StaleElementReferenceException e) {
            // TODO: handle exception
            System.err.println("The dropdown with name "+name+" is not stable");
      } catch (WebDriverException e) {
            // TODO: handle exception
            System.err.println("Browser got closed due to unknown error");
      } finally {
            takeSnap();
      }
	}

	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
            WebElement ddown = driver.findElementByXPath(xpath);
            Select selddown = new Select(ddown);
            selddown.selectByIndex(value);
            System.out.println("The dropdown with xpath "+xpath+" is selected with index value "+value);
      } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            System.err.println("The dropdown with xpath "+xpath+" is not found in the DOM" );
      } catch (ElementNotVisibleException e) {
            // TODO: handle exception
            System.err.println("The dropdown with xpath "+xpath+" is not visible in the application");         
      } catch (ElementNotInteractableException e) {
            // TODO: handle exception
            System.err.println("The dropdown with xpath "+xpath+" is not interactable");
      } catch (ElementNotSelectableException e) {
            // TODO: handle exception
            System.err.println("The dropdown with xpath "+xpath+" is not selectable");
      } catch (StaleElementReferenceException e) {
            // TODO: handle exception
            System.err.println("The dropdown with xpath "+xpath+" is not stable");
      } catch (WebDriverException e) {
            // TODO: handle exception
            System.err.println("Browser got closed due to unknown error");
      } finally {
            takeSnap();
      }
	}

	public String getAttributeByXpath(String xpath, String attribute) {
		// TODO Auto-generated method stub
		String attr = null;
        try {
              attr = driver.findElementByXPath(xpath).getAttribute(attribute);
              System.out.println("The element with XPath "+xpath+" has the attribute "+attribute+" with value "+attr);
        } catch (NoSuchElementException e) {
              // TODO Auto-generated catch block
              System.err.println("The element with XPath "+xpath+" is not found in the DOM" );
        } catch (ElementNotVisibleException e) {
              // TODO: handle exception
              System.err.println("The element with XPath "+xpath+" is not visible in the application");        
        } catch (ElementNotInteractableException e) {
              // TODO: handle exception
              System.err.println("The element with XPath "+xpath+" is not interactable");              
        } catch (StaleElementReferenceException e) {
              // TODO: handle exception
              System.err.println("The element with XPath "+xpath+" is not stable");
        } catch (WebDriverException e) {
              // TODO: handle exception
              System.err.println("Browser got closed due to unknown error");
        } finally {
              takeSnap();
        }
        return attr;

	}

	public void pageDownByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpath).sendKeys(Keys.PAGE_DOWN);
			System.out.println("The element with xpath "+xpath+" is sent page down");
		} catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            System.err.println("The element with xpath "+xpath+" is not found in the DOM" );
      } catch (ElementNotVisibleException e) {
            // TODO: handle exception
            System.err.println("The element with xpath "+xpath+" is not visible in the application");           
      } catch (ElementNotInteractableException e) {
            // TODO: handle exception
            System.err.println("The element with xpath "+xpath+" is not interactable");              
      } catch (StaleElementReferenceException e) {
            // TODO: handle exception
            System.err.println("The element with xpath "+xpath+" is not stable");
      } catch (WebDriverException e) {
            // TODO: handle exception
            System.err.println("Browser got closed due to unknown error");
      } finally {
            takeSnap();
      }
	}

	public void submitByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
            driver.findElementByXPath(xpath).submit();
            System.out.println("The element with XPath "+xpath+" is clicked to submit the details");
      } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            System.err.println("The element with XPath "+xpath+" is not found in the DOM" );
      } catch (ElementNotVisibleException e) {
            // TODO: handle exception
            System.err.println("The element with XPath "+xpath+" is not visible in the application");        
      } catch (ElementNotInteractableException e) {
            // TODO: handle exception
            System.err.println("The element with XPath "+xpath+" is not interactable");              
      } catch (StaleElementReferenceException e) {
            // TODO: handle exception
            System.err.println("The element with XPath "+xpath+" is not stable");
      } catch (WebDriverException e) {
            // TODO: handle exception
            System.err.println("Browser got closed due to unknown error");
      } finally {
            takeSnap();
      }
	}

	public void sleepThread(int msec) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(msec);
			System.out.println("The thread was idle for "+msec+" milliseconds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("The idle thread was interrupted due to unknown error");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Browser got closed due to unknown error");
		}	
	}
}