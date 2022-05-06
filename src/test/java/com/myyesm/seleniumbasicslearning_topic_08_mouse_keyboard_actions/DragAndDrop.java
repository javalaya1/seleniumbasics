package com.myyesm.seleniumbasicslearning_topic_08_mouse_keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void registrationTest() throws InterruptedException	 {
		System.setProperty("webdriver.chrome.driver", "all_executables\\chromedriver_101_0_4951_15.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.navigate().to("https://demoqa.com/droppable/");

		WebElement src = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement dest = driver.findElement(By.xpath("//p[text()='Drop here']"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(src, dest).perform();
		
		Thread.sleep(5000);
		driver.quit();

	}
}
