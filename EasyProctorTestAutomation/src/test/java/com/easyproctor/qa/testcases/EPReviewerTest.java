package com.easyproctor.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.easyproctor.qa.base.BasePage;
import com.easyproctor.qa.pages.EPReviewerPage;

public class EPReviewerTest extends BasePage {

	EPReviewerPage tm;
	
	public EPReviewerTest()
	{
		super();
	}
	
	@BeforeClass
	
	public void setUp() throws InterruptedException
	{
			cqiintialization();
		tm =  new EPReviewerPage();
			
	}


	
	@Test(priority=1)
	public void logintest() throws InterruptedException, IOException, TimeoutException, EmailException
	{
		//tm.submisionmail();
		//tm.analysis();
	
		tm.loginpagemethod();
		
		
	}
	@Test(priority=2)
	public void examnametest() throws InterruptedException, IOException, TimeoutException, EmailException
	{
		//tm.submisionmail();
		//tm.analysis();
		tm.examnamesearch();
	}
	
	
	
	@Test(priority=3)
	public void schedulepagetest() throws InterruptedException, IOException, TimeoutException, EmailException
	{
		//tm.submisionmail();
		//tm.analysis();
		tm.schedulepage();
	}
	@Test(priority=4)
	public void studentnametest() throws InterruptedException, IOException, TimeoutException, EmailException
	{
		tm.selectingstudent();
		//tm.analysis();
		
		//tm.filter();
		//Assert.assertEquals("True", "True");
	}
	@Test( priority = 5,dependsOnMethods = "logintest")
	public void manageproctor() throws InterruptedException, IOException, TimeoutException, EmailException
	{
		//tm.submisionmail();
		//tm.analysis();
		
		tm.attempts();
		Assert.assertEquals("True", "True");
		
	}
	/*@Test( priority = 6,dependsOnMethods = "logintest")
	
	public void Proctorlogin() throws InterruptedException, IOException, TimeoutException, EmailException
	{
		//tm.submisionmail();
		//tm.analysis();
		
		//tm.photoverifcation();
		Assert.assertEquals("True", "True");
		
	}
	
	@Test( priority = 7	,dependsOnMethods = "logintest")
	public void Proctorlogout() throws InterruptedException, IOException, TimeoutException, EmailException
	{
		//tm.submisionmail();
		//tm.analysis();
		
		Assert.assertEquals("True", "True");
		
	}*/
		
	
	@Test(priority=5)
	public void attemptstest() throws InterruptedException, IOException, TimeoutException, EmailException
	{
		//tm.submisionmail();
		//tm.analysis();
		
		tm.attempts();
		
	}
	
	@Test(priority=6) 
	public void photoverificationtest() throws InterruptedException, IOException, TimeoutException, EmailException
	{
		//tm.submisionmail();
		//tm.analysis();
		
		tm.photoverifcation();
		
	}
	

	
	@AfterClass
	
public void teardown(ITestResult result) throws IOException {
		
		driver.quit();
	}
	
}
