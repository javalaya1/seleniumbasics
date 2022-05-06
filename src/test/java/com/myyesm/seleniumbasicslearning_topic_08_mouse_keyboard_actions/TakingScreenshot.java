package com.myyesm.seleniumbasicslearning_topic_08_mouse_keyboard_actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenshot {
	
	@Test
	public void takeScreenshot() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;// Parent Change
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File new_folder = new File(System.getProperty("user.dir") + "/screenshots");
		if (!new_folder.exists()) {
			new_folder.mkdirs();
		}
		
		String screenshotName = 
				LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_hh-mm-ss"));
		File dest = new File(new_folder.toString()+"/"+screenshotName+".png");
		
		FileUtils.copyFile(src, dest);
		
	}

}
