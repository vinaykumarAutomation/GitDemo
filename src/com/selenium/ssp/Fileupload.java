package com.selenium.ssp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vk\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		WebElement upload = driver.findElement(By.id("fileupload"));
		
		upload.sendKeys("C:\\Users\\vk\\Documents\\qulitpre.docx");
		upload.findElement(By.xpath("//*[@id=\'post-206\']/div/div[3]/form/input[2]")).click();
		
		
	}

}
