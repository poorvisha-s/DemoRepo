package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	 
    public static void main(String[] args) {
		String title = "Gogle";
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}

}
