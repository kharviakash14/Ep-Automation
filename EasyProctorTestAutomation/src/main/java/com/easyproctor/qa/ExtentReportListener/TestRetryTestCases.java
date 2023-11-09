package com.easyproctor.qa.ExtentReportListener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryTestCases {
	 @Test(retryAnalyzer = RetryAnalyzer.class)
	    public void firstTestMethod() {
	        System.out.println("First test method");
	        Assert.assertTrue(true);
	    }

	    @Test(retryAnalyzer = RetryAnalyzer.class)
	    public void secondTestMethod() {
	        System.out.println("Second test method");
	        Assert.assertTrue(false);
	    }

}
