package com.myyesm.seleniumbasics.learning_topic_07_switch_to_frames;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToSwitchToMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(2000);
		WebElement okbutton = driver.findElement(By.xpath("//button[text()='OK']"));
		okbutton.click();
		Thread.sleep(2000);
		Set<String> allWindows = driver.getWindowHandles();  //Set won't have any index value.
		System.out.println("Before Click on Flights link : "+allWindows.size());
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		WebElement flightsLink = driver.findElement(By.partialLinkText("FLIGHTS"));
		flightsLink.click();
			
		String[] all = driver.getWindowHandles().toArray(new String[0]);
		System.out.println(all.length);
		driver.switchTo().window(all[1]);
		System.out.println(driver.getTitle());
		
		driver.close();//out diver is still alive.
		
		driver.switchTo().window(all[0]);
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();  //driver gets killed
	}
}

/*
 * 
 * /*ArrayList<String> all = new ArrayList<>(driver.getWindowHandles());  //List will have a index value.
		System.out.println(allWindows.size());
		System.out.println(driver.getTitle());  //home page title
		

		driver.switchTo().window(all.get(1)); //1 means second window, 0 means first winodw, index starts from 0
		System.out.println(driver.getTitle()); //flights related title
		
		driver.close();
		
		driver.switchTo().window(all.get(0));
		System.out.println(driver.getTitle());  //HomePage title*/


