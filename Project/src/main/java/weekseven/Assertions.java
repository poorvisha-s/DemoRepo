package weekseven;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assert.assertEquals("Liberty", "Liberty", "Expected text matched");
		Assert.assertNotEquals("", "", "");
		//Assert.assertTrue(condition, message);
		//Assert.assertFalse(condition, message);
		SoftAssert obj = new SoftAssert();
		obj.assertEquals("", "");
		
		
		obj.assertAll();

	}

}