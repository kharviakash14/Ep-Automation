package com.easyproctor.qa.ExtentReportListener;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		
		//String dateName = new SimpleDateFormat("yyyy-MM-dd,hhmmss").format(new Date());
		//String path =System.getProperty("user.dir")+"./reports" + "ExtentReport"+".html";
		String path =System.getProperty("user.dir")+"\\reports\\"+ "ExtentReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation results");
		reporter.config().setDocumentTitle("Test Results");		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Akash Kharvi");
		extent.setSystemInfo("Server", "EPBuild");
		return extent;
		
	}
}
