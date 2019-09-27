package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	@Test
	public void sReport(){
		ExtentReports extent = new ExtentReports("./reports/samplereport.html");
		ExtentTest test = extent.startTest("TC001", "Sample Test");
		test.log(LogStatus.PASS, "Test Passed");
		//test.log(LogStatus.FAIL, "Test Failed");
		//test.log(LogStatus.WARNING, "Test Warning");
		test.assignAuthor("Poorvisha");
		test.assignCategory("Sample");
		extent.endTest(test);
		extent.flush();
	}

}
