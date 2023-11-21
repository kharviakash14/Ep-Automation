package com.easyproctor.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easyproctor.qa.base.BasePage;
import com.easyproctor.qa.pages.CandidateLogin;


public class CandidateLoginTest extends BasePage{
	CandidateLogin candlogin;
	public CandidateLoginTest()
	{
		super();
	}

   @BeforeClass
	
	public void setUp() throws InterruptedException
	{
		candidateintialization();
	
		candlogin = new CandidateLogin();
		
	}	
   
   
	
	@Test(priority=1)
	public void candidatetestlogintest() throws InterruptedException
	{
		//candlogin.candidtaeloginfield(prop.getProperty("studentname"), prop.getProperty("studentpassword"));
		candlogin.candidtaeloginfield();
	}
	
	@Test(priority=2)
	public void myexamscheduletest() throws InterruptedException
	{
		candlogin.myexamschedule();

	}
	
	@Test(priority=3)
	public void dashboardexamtest() throws InterruptedException
	{
		candlogin.dashboardexam();

	}
	
	@Test(priority=4)
	public void useragreementpagetest() throws InterruptedException
	{
		candlogin.useragreementpage();

	}
	
	@Test(priority=5)
	public void systemcheckpagetest() throws InterruptedException, AWTException
	{
		candlogin.systemcheckpage();

	}
	
	@Test(priority=6)
	public void phototest() throws InterruptedException
	{
		candlogin.photo();

	}
	
	@Test(priority=7)
	public void roomvideopagetest() throws InterruptedException
	{
		candlogin.roomvideopage();

	}
	
	
	@Test(priority=8)
	public void taketesttest() throws InterruptedException
	{
		candlogin.taketest();

	}
	@Test(priority=9)
	public void startbuttontest() throws InterruptedException, AWTException
	{
		candlogin.startbutton();

	}
	@AfterMethod
	
	public void teardown() throws InterruptedException
	{
		//driver.quit();
	}	
	
	
}
