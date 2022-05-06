package com.myyesm.seleniumbasics.learning_topic_01_openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LearningHowToOpenFireFoxBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "all_executables\\geckodriver_v0_31_0.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
