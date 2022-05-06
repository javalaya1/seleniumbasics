package com.myyesm.seleniumbasics.learning_topic_04_locate_find_click_link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToClickButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://mail.yahoo.com/");
		
		//locate - id(), name(), classname(), tagname(), linkText(), partialLinkText(), 
		By create_account_link_locator = By.xpath("//a[text()='Sign up' or text()='Create an account'] ");

		//find - 
		WebElement create_an_account_link = driver.findElement(create_account_link_locator);

		//click - 
		create_an_account_link.click();
		
		Thread.sleep(5000);

		driver.quit();

	}
}
