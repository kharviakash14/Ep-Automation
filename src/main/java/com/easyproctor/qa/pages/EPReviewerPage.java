package com.easyproctor.qa.pages;


import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.io.FileOutputStream;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;

import java.io.IOException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.easyproctor.qa.base.BasePage;
import com.easyproctor.qa.util.Email;
import com.easyproctor.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;

import org.apache.commons.mail.SimpleEmail;

public class EPReviewerPage extends BasePage{
	
	
	@FindBy(xpath="//*[@id='inputId']")
	WebElement username;
	
	@FindBy(xpath="//*[@ng-model='pwd']")
	WebElement password;
	
	@FindBy(xpath="//*[contains(text(),'LOGIN')]")
	WebElement login;
	
	
	@FindBy(xpath="//*[text()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath="//*[contains(text(),'No submission(s) found for the given filter values')]")
	WebElement message;
	
	
	@FindBy(xpath="//*[@id='searchName']")
	WebElement search;
	
	@FindBy(xpath = "//button[@id='FilterDiv']")
	WebElement filter;
	
	@FindBy(xpath = "//*[@id='SubmissionListing']/tbody/tr/td[1]/a")
	WebElement Attempts;
	
	@FindBy(xpath = "//button[@id='matched']")
	WebElement continuebtn;
	
	
	public EPReviewerPage() {
		PageFactory.initElements(driver, this);
	}

	
/*	public void submisionmail() throws InterruptedException, IOException
	{
		
		String sheetname = "Sheet1";
		
		String loginname = prop.getProperty("loginname");
		String revpassword = prop.getProperty("reviewerpassword");
		
		username.sendKeys(loginname);
		
		password.sendKeys(revpassword);
		signin.click();
		search.sendKeys("Exam_POC_CQI");
		driver.findElement(By.xpath("//a[contains(text(),'Exam_POC_CQI')]")).click();
		
		Thread.sleep(10000);

		filter.click();
		Thread.sleep(10000);
		String fromdate = prop.getProperty("fromdate");
		String todate = prop.getProperty("todate");
		//driver.findElement(By.xpath(fullxpath)).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@ng-model='FromDate']")).sendKeys("02/14/2022");
		driver.findElement(By.xpath("//input[@ng-model='ToDate']")).sendKeys("03/14/2022");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model='ToDate']")).sendKeys(Keys.RETURN);
	
		Thread.sleep(10000);
		filter.click();
		
		Thread.sleep(10000);
		if(message.isDisplayed())
		{
			System.out.println(" no submissions");
		}
		else
		{
			Thread.sleep(10000);

			Select s1 = new Select(driver.findElement(By.xpath("//*[@ng-model='PageSize']")));

			s1.selectByValue("string:200");

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main']/div/div/table")));
			
			Thread.sleep(500000);
			
	
			driver.findElement(By.xpath("//*[@id='main']/div/div/table"));
			
			int subrows = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
			System.out.println("no of students in this test is :" + subrows);

			String beforexpath = " //*[@id='main']/div/div/table/tbody/tr[";
			String afterxpath = "]/td[2]";
			
		
			String beforexpathseverity ="//*[@id='main']/div/div/table/tbody/tr[";
			
			String afterxpathseverity="]/td[3]";
			File file1 = new File("Students.txt");

			FileWriter fw = new FileWriter(file1);
			for (int i = 1; i <= subrows; i++) {
				String fullxpath = beforexpath + i + afterxpath;
				
				String severityxpath = beforexpathseverity + i + afterxpathseverity;
				WebElement element = driver.findElement(By.xpath(fullxpath));
				WebElement element2 = driver.findElement(By.xpath(severityxpath));
				String studentname = element.getText();
				String severityname = element2.getText();
				String username = studentname.substring(studentname.lastIndexOf(" ") + 1);
				System.out.println("User name is " + username + ":"+ severityname);
				
				
			
			
			

			
				
		FileInputStream fis = new FileInputStream("D:\\dummy.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(fis);

				XSSFSheet sheet = workbook.getSheet("TestData");

				XSSFRow row = sheet.createRow(1);
				XSSFCell cell = row.createCell(1);
				cell.setCellType(cell.cell);
				cell.setCellValue("SoftwareTestingMaterial.com");
				
				
				
				FileOutputStream fos = new FileOutputStream("D:\\dummy.xlsx");
				XSSFCell cell1 = sheet.getRow(1).createCell(1);
				cell1.setCellValue(username);
				workbook.write(fos);
				fos.close();
				System.out.println("END OF WRITING DATA IN EXCEL");
				
				File file = new File("D:\\Output.xlsx");
				FileInputStream fis = new FileInputStream(file);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				XSSFSheet sh = wb.getSheetAt(0);
				sh.createRow(0).createCell(0).setCellValue(username);
				FileOutputStream fos = new FileOutputStream(file);
				
				wb.write(fos);
			
				fw.write(username +":"+ severityname);
				fw.write("\n");
				//fw.newLine();
				//fw.close();
			}
			
			
			
			
			fw.close();
		
		}
	
	}*/
	
	
	public void analysis() throws IOException, InterruptedException 
	{
		
		username.sendKeys("Proctorc");
		password.sendKeys("P@ssw0rd");
		login.click();
		search.sendKeys("LP Practice");
		driver.findElement(By.xpath("//a[contains(text(),'Live Proctor Test')]")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		String candidatename = driver.findElement(By.xpath("//*[@id='main']/div/div/table/tbody/tr[1]/td[2]/a")).getText();
		String username1 = candidatename.substring(candidatename.lastIndexOf(" ") + 1);
		driver.findElement(By.xpath("//*[@id='main']/div/div/table/tbody/tr[1]/td[2]/a")).click();
		
		Thread.sleep(10000);
		
		String attemptcount =driver.findElement(By.xpath("//*[@id='submissionHeadingTitle']/span")).getText();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		if(driver.findElement(By.xpath("//*[@id='SubmissionListing']/tbody/tr/td[1]/a")).isDisplayed());
		{
		
			
			System.out.print("Analysis is completed");
			
		}
		
	
	
		File file2 = new File("StudentsAttempts.txt");

		FileWriter fw1 = new FileWriter(file2);
		
		fw1.write(username1 +":"+attemptcount );
		fw1.write("\n");
		fw1.close();
		
		
		
		boolean status = driver.findElement(By.xpath("//*[contains(text(),'Waiting')]")).isDisplayed();
		System.out.println(status);
		
		if(status == true)
		{
			System.out.print("Analysis is not completed");
		}
		else 
		{
			System.out.print("Analysis is  completed");
		}
		
	}	
	
	
	
	public void loginpagemethod() throws InterruptedException, EmailException
	{
		Thread.sleep(20000);
		String loginname = prop.getProperty("EPreviewerloginname");
		String revpassword = prop.getProperty("EPreviewerpassword");
		
		username.sendKeys(loginname);
		Thread.sleep(5000);
		password.sendKeys(revpassword);
		Thread.sleep(5000);
		/*username.sendKeys("admin01");
		password.sendKeys("P@ssw0rd");*/
		signin.click();
		Thread.sleep(10000);
	}	
	
	public void examnamesearch() throws InterruptedException{
		
		String abc = System.getProperty("user.dir");
		System.out.println(abc);
		
		Thread.sleep(5000);
		
		String examname = prop.getProperty("EPExamname");
		
		search.sendKeys(examname);
		search.sendKeys(Keys.ENTER);
		//search.sendKeys("RecordReview Proctoring");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[contains(text(),'"+examname+"')]")).click();
	}
	
	public void studentsearch() throws InterruptedException
	{
		Thread.sleep(10000);

		Select s1 = new Select(driver.findElement(By.xpath("//*[@ng-model='PageSize']")));

		s1.selectByValue("string:200");
		String studentname =driver.findElement(By.xpath("//*[@id='main']/div/div/table/tbody/tr[60]/td[2]/a")).getText();
		
		driver.findElement(By.xpath("//*[@id='main']/div/div/table/tbody/tr[8]/td[2]/a")).click();
		Thread.sleep(10000);
	}	
	
	
	public void schedulepage() throws InterruptedException
	{
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//*[@id=schedulenamesid]/a")).click();
		
		String schedulename = prop.getProperty("Schedulename");
		
		driver.findElement(By.xpath("//*[contains(text(),'" + schedulename + "')]")).click();
	}
	
	public void attempts()
	{
	/*String proctoringtype =	driver.findElement(By.xpath("//*[@id='SubmissionListing']/tbody/tr/td[8]")).getText();
	
	System.out.println("Proctoring type : "+ proctoringtype);
		
		int attemptlistcount = driver.findElements(By.xpath("//*[@id='SubmissionListing']/tbody/tr")).size();
		
		String fxpath ="//*[@id='SubmissionListing']/tbody/tr["; 
		String sxpath ="]/td[1]/a";
		String abc = null;
		for(int i =1;i<=attemptlistcount;i++)
		{
		String fullxpath=fxpath+i+sxpath;
		
		 abc =driver.findElement(By.xpath(fullxpath)).getText();
		
		System.out.println("------------------------------"+abc);
		
		
	}*/
		//driver.findElement(By.xpath("//*[@id='SubmissionListing']/tbody/tr/td[1]/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id='Attempts']/tbody/tr/td[1]/a")).click();
		
	}
	

	public void selectingstudent()
	{
		
		String username = prop.getProperty("studentname");
		driver.findElement(By.xpath("//*[contains(text(),'" + username + "')]")).click();
	}
	
	
	
	public void selectingstudents() throws InterruptedException{
	Thread.sleep(5000);
	
	driver.navigate().refresh();
	
	Thread.sleep(10000);
	
	Select s1 = new Select(driver.findElement(By.xpath("//*[@ng-model='PageSize']")));

	s1.selectByValue("string:200");

	/*WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main']/div/div/table")));*/
	
	Thread.sleep(50000);
	driver.findElement(By.xpath("//*[@id='main']/div/div/table"));
	int subrows = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
	System.out.println("no of students in this test is :" + subrows);

	String beforexpath = " //*[@id='main']/div/div/table/tbody/tr[";
	String afterxpath = "]/td[2]";
	
	

	for (int i = 1; i <= subrows; i++) {
		String fullxpath = beforexpath + i + afterxpath;
		WebElement element = driver.findElement(By.xpath(fullxpath));

		String studentname = element.getText();
		String username = studentname.substring(studentname.lastIndexOf(" ") + 1);
		System.out.println("User name is " + username);

		if (username.equals(prop.getProperty("studentname"))) {

			Thread.sleep(10000);

			/*WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fullxpath))); */   // remove this
			
			Thread.sleep(50000);
			driver.findElement(By.xpath(fullxpath));
			
			filter.click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[contains(text(),'" + username + "')]")).click();
			
			System.out.println("Clicked on user----------------------------------------------");
			
			break;
		}
	}
	
	}

	public void filter() throws InterruptedException
	{
		Thread.sleep(10000);
		filter.click();
		Thread.sleep(10000);
		String fromdate = prop.getProperty("fromdate");
		String todate = prop.getProperty("todate");
		String username = prop.getProperty("studentname");
		//driver.findElement(By.xpath(fullxpath)).click();
		
		driver.findElement(By.xpath("//input[@ng-model='FromDate']")).sendKeys(fromdate);
		driver.findElement(By.xpath("//input[@ng-model='ToDate']")).sendKeys(todate);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model='ToDate']")).sendKeys(Keys.RETURN);
	
		Thread.sleep(10000);
		filter.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[contains(text(),'" + username + "')]")).click();
	}
	
	public void photoverifcation() throws InterruptedException
	{
		Thread.sleep(10000);
		continuebtn.click();
	}
	
	}
	
			
	

	
	
	
	

