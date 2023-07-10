package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class zamotoclass 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.zomato.com/india");
		
		//to click on sign up link 
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("mamta");
		//driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("1234");
        
	}

}
