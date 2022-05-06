package com.myyesm.seleniumbasics.learning_topic_01_openbrowsers;

import org.openqa.selenium.edge.EdgeDriver;

public class LearningHowToOpenEdgeBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "all_executables\\msedgedriver_100_0_1190_0.exe");
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}

