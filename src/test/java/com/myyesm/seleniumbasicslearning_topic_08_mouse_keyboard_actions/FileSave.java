package com.myyesm.seleniumbasicslearning_topic_08_mouse_keyboard_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FileSave {

	@Test
	public void registrationTest() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");

		WebElement registerlink = driver.findElement(By.linkText("For work"));

		Actions all_mouse_keyboard_events = new Actions(driver);
		// context click means - right click
		all_mouse_keyboard_events.contextClick(registerlink).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		// the below code is for project location.
		String projectLocation = System.getProperty("user.dir");

		// the below code is to create folder in the project location
		File new_folder = new File(projectLocation + "/save_files");
		if (!new_folder.exists()) {
			new_folder.mkdirs();
		}

		System.out.println(new_folder.getAbsolutePath());
		Thread.sleep(5000);
		
		String fn = new_folder.getAbsolutePath() + "\\index_1.html";
		
		StringSelection ss = new StringSelection(fn);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);// ctrl+c
//
//	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = r;  //new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CLEAR);
		robot.keyRelease(KeyEvent.VK_CLEAR);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.quit();
	}
}

/*
 * important annotations Testng - TDD -----------------
 * 
 * @BeforeSuite
 * 
 * @BeforeTest
 * 
 * @BeforeGroup
 * 
 * @BeforeClass
 * 
 * @BeforeMethod
 * 
 * @Test
 * 
 * @AfterMethod
 * 
 * @AfterClass
 * 
 * @AfterGroup
 * 
 * @AfterTest
 * 
 * @AfterSuite
 * 
 * @Parameter
 * 
 * @Optional ------ testng will run based on testng.xml file
 * 
 * @Dataprovide ================================================== Cucumber -
 * BDD -------------------
 * 
 * @Before
 * 
 * @Given
 * 
 * @When
 * 
 * @And
 * 
 * @Then
 * 
 * @@AFter
 * 
 * tags = @Smoke
 * 
 * cucumber will run based on feature file.
 * 
 * 
 */
