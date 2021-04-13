package com.selenium.ssp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vk\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> iteratorvalue =handler.iterator();
		
		String parentid = iteratorvalue.next();
		
		String childid = iteratorvalue.next();
		
		driver.switchTo().window(childid);
		 
		System.out.println("child:"+childid);
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("emailid")).sendKeys("vin");
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
		
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(parentid);
		
		
		
		
		
		
		
		
		
	}

}
