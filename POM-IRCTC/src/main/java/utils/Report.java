package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Report {
	public static ExtentReports extent;
	public ExtentTest test;
	public String testCaseName, testCaseDescription, author, category;
	
	public void startReport(){
		extent = new ExtentReports("./reports/report.html", false);
	}
	
	public void startTest(String testName, String testDescription){
		test = extent.startTest(testName, testDescription);
	}
	
	public void logStatus(String status, String desc){
		long snapNumber= takesnap();
		if(status.equalsIgnoreCase("pass")){
			test.log(LogStatus.PASS, desc+test.addScreenCapture(".././reports/images/"+snapNumber+".png"));
		} else if (status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, desc+test.addScreenCapture(".././reports/images/"+snapNumber+".png"));
		}
	}
	
	public abstract long takesnap();
	
	
	public void logStatus(String status, String desc, boolean snap){
		if(!snap){
			if(status.equalsIgnoreCase("pass")){
				test.log(LogStatus.PASS, desc);
			} else if (status.equalsIgnoreCase("fail")) {
				test.log(LogStatus.FAIL, desc);
			}
		}	
	}
	
	public void endTest(){
		extent.endTest(test);
	}
	
	public void endReport(){
		extent.flush();
	}

}
