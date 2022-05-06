package com.myyesm.seleniumbasicslearning_topic_08_mouse_keyboard_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoard_events_using_Selenium_Actions {
	
	@Test
	public void registrationTest() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		
		WebElement registerlink = driver.findElement(By.linkText("REGISTER"));
		
		Actions all_mouse_keyboard_events = new Actions(driver);
		all_mouse_keyboard_events.moveToElement(registerlink).click().perform();
		
		WebElement firstnameText = driver.findElement(By.name("firstName"));
		all_mouse_keyboard_events.click(firstnameText).perform();
		//Thread.sleep(2000);
		
		all_mouse_keyboard_events = new Actions(driver);
		all_mouse_keyboard_events.sendKeys("JAVA").perform();
		Thread.sleep(2000);
		all_mouse_keyboard_events.sendKeys(Keys.TAB).perform();
		all_mouse_keyboard_events.sendKeys("SELENIUM").perform();
		Thread.sleep(2000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
//		String shiftTab = Keys.chord(Keys.SHIFT, Keys.TAB);
//		firstnameText.sendKeys(shiftTab);
		
//		r.keyPress(KeyEvent.VK_CLEAR);
//		r.keyRelease(KeyEvent.VK_CLEAR);
				
		Thread.sleep(2000);
		all_mouse_keyboard_events.sendKeys(Keys.CLEAR).perform();
		Thread.sleep(2000);
		all_mouse_keyboard_events.sendKeys("Python").perform();
			
		Thread.sleep(5000);
	//	driver.quit();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
	}
}

/*
 important annotations
 Testng - TDD
 -----------------
 @BeforeSuite
 @BeforeTest
 @BeforeGroup
 @BeforeClass
 @BeforeMethod
 @Test
 @AfterMethod
 @AfterClass
 @AfterGroup
 @AfterTest
 @AfterSuite
 
 @Parameter
 @Optional
 ------
 testng will run based on testng.xml file
 
 @Dataprovide
 ==================================================
 Cucumber - BDD
 -------------------
 @Before
 @Given
 @When
 @And
 @Then
 @@AFter
 
tags = @Smoke

cucumber will run based on feature file.
 
 * 
 */
