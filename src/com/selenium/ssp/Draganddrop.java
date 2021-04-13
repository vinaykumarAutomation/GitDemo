package com.selenium.ssp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vk\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.xpath(("//iframe[contains(@src,'droppable')]"))));
		
		Thread.sleep(3000);
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
//		action.dragAndDrop(sourceElement, targetElement).build().perform();
		 action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
	}

}
