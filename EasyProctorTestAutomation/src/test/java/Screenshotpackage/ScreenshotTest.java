package Screenshotpackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.easyproctor.qa.base.BasePage;
import com.easyproctor.qa.pages.CustomListener;


@Listeners(CustomListener.class)
public class ScreenshotTest extends BasePage {
	
	@BeforeMethod
	
	public void setUp() throws InterruptedException{
		candidateintialization();
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void takeScreenshotTest()
	{
		Assert.assertEquals(false, true);
	}
	

}
