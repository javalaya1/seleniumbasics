package com.myyesm.seleniumbasics.learning_topic_01_openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningHowToOpenChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		 //1 - We should as System class to search whether we have a particular browser installed in our machine or not
		//Javacode to check browser got installed in our machine or not
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");

		//2. To open Chrome Browser
		WebDriver browser = new ChromeDriver();  //Selenium code to open browser
		browser.manage().window().maximize();
		
		//3. wait for 5 seconds
		Thread.sleep(5000);  //add throws declaration to method  //Java Code
		
		//4. close the browser
		browser.close();  //selenium code to close current browse, it won't close all browsers, but process won't remove from task manager
		
		//5. delete the process from the task manager
		browser.quit(); //closes all browser if any thing is open in the current execution and also it will delete process from task manager
	}
}
