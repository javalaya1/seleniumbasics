package com.myyesm.seleniumbasics.learning_topic_06_switch_back_to_mainwindow_from_frame;

import java.io.PrintStream;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HowToSwitchToFrame_Type_3_using_frame_as_element {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize(); //method chain
		
		Options  o = driver.manage();
		Window w = o.window();
		w.maximize();
		
		PrintStream ps = System.out;
		ps.println("Hello");
		
		//implicit wait - for all elements this will applicable
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); //it maximum time - but if element found with in one secon - it continues
		
		driver.switchTo().frame(driver.findElement(By.name("iframeResult"))); //switching to frame using name
				
		
		//WebElement tryit_element = driver.findElement(By.xpath("//button[normalize-space()='Try it']"));
		//finding element based on condition that checks for the presence of element.
		WebElement tryit_element = new WebDriverWait(driver, Duration.ofSeconds(120)).pollingEvery(Duration.ofSeconds(5))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Try it']")));
		tryit_element.click();
		
		Thread.sleep(2000); //java method - compulsory - it waits for the given milli seconds.
		
		//Explicit wait - it will wait only for that particular condition/particular element - it will wait.
		Alert a = new WebDriverWait(driver, Duration.ofSeconds(120)).pollingEvery(Duration.ofSeconds(5))
				.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		a.dismiss();
		Thread.sleep(5000);
		driver.quit();
	}
}

/*
priti - how many times - I have practices any program - 1000



*/