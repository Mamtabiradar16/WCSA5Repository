package assianment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaxpath
{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mamta");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1345");
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}
