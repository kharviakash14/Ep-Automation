package com.easyproctor.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import com.easyproctor.qa.util.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	
	public static WebDriver driver;
	public static Properties prop;
		@SuppressWarnings("deprecation")
		public static EventFiringDecorator e_driver;
	//public ExtentReports extent;
	//public ExtentTest extenttest;
	public static WebEventListener eventListener;
	
	
	
	
	public BasePage() {

		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\akash.kharvi\\workspace\\EasyProctorTestAutomation\\"
					+ "src\\main\\java\\com\\easyproctor\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	/*@SuppressWarnings("deprecation")
	public static void initialization() throws InterruptedException {
		 
		
	
		
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


			driver.get(prop.getProperty("url"));
			//driver.get("https://testandassessment.excelsoftcorp.com/EPLiveProctoring/#/login");
			//driver.get("https://sidcuat.excelindia.com/EPLiveProctoring/#/login");
			Thread.sleep(5000);
			
			e_driver = new EventFiringDecorator(driver);
			// Now create object of EventListerHandler to register it with EventFiringDecorator
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;
		
	}*/

	public void failed(String testMethodName) {

		// String methodname = iTestResult.getName();
		
		
		//String directory="C:\\Users\\akash.kharvi\\workspace\\EasyProctorTestAutomation\\FailedTests";
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,
					new File("C:\\Users\\akash.kharvi\\workspace\\EasyProctorTestAutomation\\FailedTests" + "\\+fail_"
							+ testMethodName + ".jpg"));

							

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	
	

	
public static void candidateintialization() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	/*
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();*/
	
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("candidateurl"));
		//driver.get("https://eassessmentbuild.excelindia.com/sidcTestplayer/instruction.aspx?lockdownparam=201324&sb=1&rp=1&envid=1&assestid=487053&scheduleid=16863&ssl=0");
		Thread.sleep(5000);
		
		/*e_driver = new EventFiringDecorator(driver);
		// Now create object of EventListerHandler to register it with EventFiringDecorator
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;*/
	
}

public static void cqiintialization() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver(); 

//WebDriverManager.edgedriver().setup();
//driver = new EdgeDriver();


	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testandassessment.excelsoftcorp.com/easyproctor/EP.Web/app/index.html#/");
	
	
	
	Thread.sleep(5000);	
	
/*	e_driver = new EventFiringDecorator(driver);
	// Now create object of EventListerHandler to register it with EventFiringDecorator
	eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver;
*/
	

}
	

	}

