package com.easyproctor.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
/*import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;*/
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Parameters;

import com.easyproctor.qa.base.BasePage;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtil extends BasePage{

	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICIT_WAIT=30;
	
	//public static ExtentTest extenttest;
    
    
    
	public static String getScreenshot(String screenshotname) throws IOException
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") +"\\FailedTests\\" + screenshotname + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public static String takeScreenshotAtEndOfTest() throws IOException {
	    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	   
	    
	   // String destination = System.getProperty("user.dir") +".\\reports\\"+dateName+ ".png";
	    
	    String destination = "./reports/screenshots/" + dateName + ".png";
	    System.out.println("des ======"+destination);
	    
	    File finalDestination = new File(destination);
	    FileHandler.copy(source, finalDestination);
	    
	  
	    return destination;
	}



public void passfailscreenshot(String name) throws IOException
{
	String abc = TestUtil.getScreenshot(name);
}



}
	

