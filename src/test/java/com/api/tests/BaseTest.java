package com.api.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.api.reporting.ExtentReportManager;

public class BaseTest {
		
		@BeforeMethod
	    public void startExtentTest(ITestResult result) {
	        // Automatically get test name from method name
	        String testName = result.getMethod().getMethodName();
	        ExtentReportManager.startTest(testName);
	    }

	    @AfterMethod
	    public void endExtentTest() {
	        ExtentReportManager.endTest();
	    }
}
