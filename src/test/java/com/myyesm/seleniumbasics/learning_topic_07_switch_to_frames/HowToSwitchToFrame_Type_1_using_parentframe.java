package com.myyesm.seleniumbasics.learning_topic_07_switch_to_frames;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HowToSwitchToFrame_Type_1_using_parentframe {
	
	public static void main(String[] d) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult"); //taskkill /f /im chromedriver.exe /t;  //in java index always starts from 0 
		WebElement tryit_button = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit_button.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();  
		
		WebElement okText = driver.findElement(By.id("demo")); 
		System.out.println(okText.getText());
		
		Assert.assertTrue(okText.isDisplayed());  //true
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();// how to switch back from frame to main window.
		
		WebElement runbutton = driver.findElement(By.id("runbtn"));
		runbutton.click();
		
		driver.switchTo().frame("iframeResult");
		
		okText = driver.findElement(By.id("demo")); 
		System.out.println(okText.getText());
		Assert.assertFalse(okText.isDisplayed());  //false
		
		Thread.sleep(5000);
		driver.quit();
	}
}
