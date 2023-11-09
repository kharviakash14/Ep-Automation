package com.easyproctor.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.easyproctor.qa.base.BasePage;

public class CandidateLogin extends BasePage {
	DesiredCapabilities caps = null;

	@FindBy(xpath = "//*[@id='mat-input-0']")

	WebElement username;

	@FindBy(xpath = "//*[@id='mat-input-1']")

	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement signing;

	@FindBy(xpath = "//button[@id='myschedulebutton']")
	WebElement myexamschedule;

	@FindBy(xpath = "//*[@id='btnReview']/span[1]/span")
	WebElement arrowbutton;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkbox;

	@FindBy(xpath = "//button[@id='useragreeNxtBtn']")
	WebElement useragreementnext;

	@FindBy(xpath = "//button[normalize-space()='Retest']")
	WebElement retestbtn;

	@FindBy(xpath = "//button[@id='systemCheckNxtBtn']")
	WebElement systemchecknextbtn;

	@FindBy(xpath = "//button[normalize-space()='Capture Photo ID']")
	WebElement capturephotoid;

	@FindBy(xpath = "//button[@id='btnCapHeadShot']")
	WebElement captureheadshot;

	@FindBy(xpath = "//button[@id='headshotPhotoidNxtBtn']")
	WebElement headshotnextbutton;

	@FindBy(xpath = "//button[@id='roomVideoNxtBtn']")
	WebElement roomvideonextbtn;

	@FindBy(xpath = "//button[@class='btn']")
	WebElement taketestbtn;

	@FindBy(xpath = "//*[@id='Start']")
	WebElement startbtn;

	@FindBy(xpath = "//*[@id='btnSubmit']")
	WebElement examsubmit;

	@FindBy(xpath = "//*[@title='Yes']")
	WebElement Yesbtn;

	@FindBy(xpath = "//*[@id='spnClose']")
	WebElement closebtn;

	public CandidateLogin() {
		PageFactory.initElements(driver, this);
	}

	// String un, String pwd inside the method bracket
	public void candidtaelogin() throws InterruptedException {
		username.sendKeys("AGUser22");
		password.sendKeys("P@ssw0rd");
		signing.click();
		myexamschedule.click();
		arrowbutton.click();
		// checkbox.click();
		useragreementnext.click();
		Thread.sleep(1000);
		System.out.println("ABC");
		/*
		 * Actions action = new Actions(driver);
		 * action.sendKeys(Keys.chord(Keys.ALT + "f")).perform(); Actions
		 * action1 = new Actions(driver); action.sendKeys("s");
		 */

		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("use-fake-ui-for-media-stream");
		 * 
		 * caps = new DesiredCapabilities(); caps.setCapability("project",
		 * "Testing Automte"); caps.setCapability("build", "Support Automate");
		 * caps.setCapability("name", "Test: Chrome Options");
		 * 
		 * caps.setCapability("browser", "Chrome");
		 * caps.setCapability("browser_version", "62.0");
		 * caps.setCapability("os", "Windows"); caps.setCapability("os_version",
		 * "10");
		 * 
		 * caps.setCapability("browserstack.networkLogs", "true");
		 * caps.setCapability("browserstack.debug", "true");
		 * caps.setCapability("browserstack.console", "verbose");
		 * caps.setCapability(ChromeOptions.CAPABILITY, options); ChromeOptions
		 * optionsC = new ChromeOptions();
		 * optionsC.addArguments(Arrays.asList("disable-infobars",
		 * "ignore-certificate-errors",
		 * "start-maximized","use-fake-ui-for-media-stream"));
		 * 
		 * driver.get(
		 * "chrome://settings/content/siteDetails?site=https%3A%2F%2Fepbuild.excelindia.com"
		 * );
		 * 
		 * Select s1 = new
		 * Select(driver.findElement(By.xpath("//*[@aria-label='Camera']")));
		 * s1.selectByValue("allow"); Select s2 = new
		 * Select(driver.findElement(By.xpath("//*[@aria-label='Microphone']")))
		 * ; //*[@id="permission"] s2.selectByValue("allow");
		 * Thread.sleep(10000); driver.navigate().back();
		 */

		Thread.sleep(50000);
		systemchecknextbtn.click();
		Thread.sleep(50000);
		// capturephotoid.click();
		Thread.sleep(50000);
		// captureheadshot.click();
		// Thread.sleep(50000);
		headshotnextbutton.click();
		Thread.sleep(50000);
		roomvideonextbtn.click();
		Thread.sleep(50000);
		taketestbtn.click();
		Thread.sleep(10000);
		startbtn.click();
		Thread.sleep(50000);
		examsubmit.click();

	}

	public void candidtaeloginfield() throws InterruptedException {
		username.sendKeys("PPC2");
		password.sendKeys("P@ssw0rd");
		signing.click();
	}

	public void myexamschedule() {
		myexamschedule.click();
	}

	public void dashboardexam() {
		arrowbutton.click();
	}

	public void useragreementpage() throws InterruptedException {
		Thread.sleep(10000);
		
		checkbox.click();
		
		
		useragreementnext.click();
		Thread.sleep(5000);
	}

	public void systemcheckpage() throws InterruptedException, AWTException {
		System.out.println("ABC");

		
		
		
		/*
		 * Robot rb = new Robot();
		 * 
		 * // Press control keyboard key rb.keyPress(KeyEvent.VK_CONTROL);
		 * 
		 * // Press A keyboard key rb.keyPress(KeyEvent.VK_T);
		 * 
		 * driver.get("chrome://settings/content/siteDetails?");
		 * 
		 * driver.navigate().refresh();
		 */
		driver.navigate().refresh();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(50000);
		systemchecknextbtn.click();
		Thread.sleep(30000);
	}

	public void photo() throws InterruptedException {

		WebElement nextbtn = driver.findElement(By.xpath("//button[@id='headshotPhotoidNxtBtn']"));
		if (nextbtn.isEnabled()) {
			headshotnextbutton.click();
		} else {
			capturephotoid.click();
			Thread.sleep(30000);
			captureheadshot.click();
			Thread.sleep(30000);
			headshotnextbutton.click();
		}

		/*
		 * capturephotoid.click(); Thread.sleep(30000); captureheadshot.click();
		 * Thread.sleep(30000); headshotnextbutton.click(); Thread.sleep(30000);
		 */
	}

	public void roomvideopage() throws InterruptedException {
		Thread.sleep(50000);
		roomvideonextbtn.click();

	}

	public void taketest() throws InterruptedException {
		Thread.sleep(80000);
		taketestbtn.click();
		Thread.sleep(10000);
	}

	public void startbutton() throws InterruptedException, AWTException {
		Thread.sleep(20000);

		/*
		 * Actions action= new Actions(driver);
		 * action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		 */

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		// driver.switchTo().window(tabs2.get(0));
		Thread.sleep(30000);
		startbtn.click();
		Thread.sleep(50000);

		Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		examsubmit.click();
		Thread.sleep(50000);
		Yesbtn.click();

		closebtn.click();
	}

	/*
	 * public void teststartbtn() { startbtn.click(); }
	 */

}
