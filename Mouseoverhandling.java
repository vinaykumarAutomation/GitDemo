package com.selenium.ssp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoverhandling  
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vk\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in");
		
	Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a"))).build().perform();
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//*[@id=\'navbarSupportedContent\']/ul/li[1]/div/div/div[1]/a/h6")).click();
	
	}

}
