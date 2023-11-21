package com.easyproctor.qa.ExtentReportListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int counter =0;
	    //You could mentioned maxRetryCnt (Maximiun Retry Count) as per your requirement. Here I took 2, If any failed testcases then it runs two times
	  int retrylimit = 2;
	    
	    //This method will be called everytime a test fails. It will return TRUE if a test fails and need to be retried, else it returns FALSE
	    public boolean retry(ITestResult result) {
	        if (counter < retrylimit) {
	            System.out.println("Retrying " + result.getName() + " again and the count is " + (counter+1));
	            counter++;
	            return true;
	        }
	        return false;
	    }
	   
	}

