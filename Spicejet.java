package com.selenium.ssp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vk\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("HYD");
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		 
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).clear();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("GOI");
		driver.findElement(By.linkText("Goa (GOI)")).click();
		
		
		
		
		
		
	}

}
