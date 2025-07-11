package com.myyesm.seleniumbasics.learning_topic_03_openurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl_Type_1_Using_GetMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver dd = new ChromeDriver();
		
		dd.manage().window().maximize();
		
		dd.get("https://mail.yahoo.com/");  //open url
		
		Thread.sleep(5000);
				
		dd.quit();
		
		int i = 10;

		String s = "Hi";

		int j = 20;
	}
	
}
