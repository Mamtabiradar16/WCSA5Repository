package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselecter1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //upcasting chromedriver to webdriver
		driver.manage().window().maximize();    //use manage webpage and maximize()
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("111111`");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class$='_9npi']")).sendKeys("11111");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log Out")).click();
		
		
		
	}

}
