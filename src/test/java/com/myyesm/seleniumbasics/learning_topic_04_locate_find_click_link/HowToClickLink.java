package com.myyesm.seleniumbasics.learning_topic_04_locate_find_click_link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToClickLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		
		//findElement(Locator) - 
		WebElement submit_button = driver.findElement(By.name("submit"));

		//click - 
		submit_button.click();
		
		Thread.sleep(5000);

		driver.quit();

	}
}
