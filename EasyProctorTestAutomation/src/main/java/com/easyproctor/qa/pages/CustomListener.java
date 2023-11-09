package com.easyproctor.qa.pages;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.zeroturnaround.zip.ZipUtil;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.easyproctor.qa.ExtentReportListener.ExtentReporterNG;
import com.easyproctor.qa.base.BasePage;
import com.easyproctor.qa.util.TestUtil;

public class CustomListener extends BasePage implements ITestListener{
	
	ExtentReports extent = ExtentReporterNG.extentReportGenerator();
	ExtentTest test;
	String conactenate = ".";
//private static ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		System.out.println("before flush11---------------------------");
	 test = extent.createTest(result.getMethod().getMethodName());	
	// extenttest.set(test);
	 System.out.println("before flush12----------------------");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("before flush1-----------------------------");
		test.log(Status.PASS, "Successful");
		
		System.out.println("before flush2------------------------");
	}

	public void onTestFailure(ITestResult result){
		
		//screenshot and attach to report
		test.log(Status.FAIL, "FAILURE");
		  test.log(Status.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
          test.log(Status.FAIL, "TEST CASE FAILED IS "+result.getThrowable());
		
		System.out.println("FAILED Test---------------------------------------------");
		
	
			
	
			// TODO Auto-generated catch block
	
			
			
					// TODO Auto-generated catch block
		
		
		 try {
			 String pp =conactenate+TestUtil.takeScreenshotAtEndOfTest();
			 System.out.println("path==="+pp);
			 test.fail("Test Case failed check screenshot below"  +test.addScreenCaptureFromPath(pp)); 
			//test.fail("Test Case failed check screenshot below"  +test.addScreenCaptureFromPath(TestUtil.takeScreenshotAtEndOfTest()));
			
			
			
			
			// test.fail("Test Case failed check screenshot below"+test.addScreenCaptureFromBase64String(TestUtil.takeScreenshotAtEndOfTest()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		  //extentTest.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build()); //to add screenshot in extent report
         //extentTest.fail("details").addScreenCaptureFromPath(screenshotPath);
			//To add it in the extent report
			
		System.out.println("After screenshot");	
		
		
	}	
		
		
		
		
		
		
		
		
		
		
/*extenttest.get().fail(result.getThrowable());
try {
	extenttest.get().addScreenCaptureFromPath(TestUtil.getScreenshot(result.getMethod().getMethodName()));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/
		
		
			
		
		
		
		
	

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Successful");
		//extenttest.get().skip(result.getThrowable());
	/*	try {
			
			extenttest.get().addScreenCaptureFromPath(TestUtil.getScreenshot(result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
	/*	  Iterator<ITestResult> skippedTestCases = context.getSkippedTests().getAllResults().iterator();
	        while (skippedTestCases.hasNext()) {
	            ITestResult skippedTestCase = skippedTestCases.next();
	            ITestNGMethod method = skippedTestCase.getMethod();
	            if (context.getSkippedTests().getResults(method).size() > 0) {
	                System.out.println("Removing:" + skippedTestCase.getTestClass().toString());
	                skippedTestCases.remove();
	          }  */
		
		System.out.println("before flush----------------------");
		extent.flush();
	
		System.out.println("after flush---------------------------");
		
		
		String zippath= System.getProperty("user.dir")+"\\reports\\";
		String zippath2= System.getProperty("user.dir")+"\\reports.zip";
		ZipUtil.pack(new File(zippath), new File(zippath2));
	        
	}

}
