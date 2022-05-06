package com.myyesm.seleniumbasics.learning_topic_05_select_from_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowToSelectFromDropDown_Type_1_using_index {
	
	public static void main(String[] d) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		
		WebElement register_link = driver.findElement(By.linkText("REGISTER"));
		register_link.click();
		


//		WebElement country_dropdown= driver.findElement(By.name("country"));
//		Select select_country = new Select(country_dropdown);
		
		Select select_country = new Select(driver.findElement(By.name("country")));
		select_country.selectByIndex(1); //1 - 2nd value in dropdown - because index starts from 0
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}
}
