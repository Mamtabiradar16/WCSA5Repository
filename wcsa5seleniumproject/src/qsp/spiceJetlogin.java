package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spiceJetlogin
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8888334011");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("64644");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='LOGIN']")).click();
		
		

	}
	
}
