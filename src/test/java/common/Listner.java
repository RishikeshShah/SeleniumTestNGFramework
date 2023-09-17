package common;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.CaptureScreenshot;

public class Listner extends CaptureScreenshot implements ITestListener {

	public void onTestStart(ITestResult result) {
		// name of method will be printed on report
		Reporter.log("Method name is- "+ result.getName());
		System.out.println("Test case: "+ result.getName() +" is starting");
	}

	public void onTestSuccess(ITestResult result) {
		// Integer value will be printed on report Ex. For SUCCESS = 1 ,for FAILURE = 2;
		  
		Reporter.log("Status of execution is- "+ result.getStatus());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test"+result.getName() +": failed - screenshot captured");
		getScreenshot(); // take screenshot
		
		// Print the link of screenshot on Reports
		//Reporter.log("<a href=\"C:\\Users\\shahr\\eclipse-workspace\\webPortal\\screenshot\\Fri_Sep_08_07-47-07_CEST_2023.png\">Test Results</a>");
	}
	
}


