package com.selenium.ssp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestRunner {

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vk\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
//		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("tv");
	Thread.sleep(5000);
		
//		 driver.findElement(By.xpath("(//*[@class='Icon__image'])[1]"));
		
		 
		/* 
		 WebElement buttonSubmit= driver.findElement(By.xpath("(//*[@class='Icon__image'])[1]"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()", buttonSubmit);
	  */


//		WebElement ele = driver.findElement(By.xpath("(//*[@class='Icon__image'])[1]"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()", ele);
		
		WebElement ele = driver.findElement(By.xpath("(//div[@id='root']//div[@class='Icon__base'])[1]"));
		Thread.sleep(5000);
		
		
		ele.sendKeys(Keys.ENTER);

		
	}
}