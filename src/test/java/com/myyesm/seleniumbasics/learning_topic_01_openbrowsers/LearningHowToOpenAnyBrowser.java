package com.myyesm.seleniumbasics.learning_topic_01_openbrowsers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearningHowToOpenAnyBrowser {   //25%

	public static WebDriver openAnyBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
			return new ChromeDriver(); 
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "all_executables\\geckodriver_v0_31_0.exe");
			return new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "all_executables\\msedgedriver_100_0_1190_0.exe");
			return new EdgeDriver();
		}

		return null;
	}

	public static void main(String[] args) throws InterruptedException {
		try (FileInputStream fis = new FileInputStream("testdata\\config.properties")) {
			Properties p = new Properties();
			p.load(fis);
			String bn = p.getProperty("config.browsername");

			WebDriver driver = openAnyBrowser(bn); // upcasting - when we take dynamic child class object
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.quit();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
