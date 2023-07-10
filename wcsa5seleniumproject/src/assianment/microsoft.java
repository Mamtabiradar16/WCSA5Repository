package assianment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class microsoft
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.minecraft.net/en-us/login?return_url=/en-us/profile");
		driver.findElement(By.xpath("//input[@id='emailField']")).sendKeys("mamta");   //case1  for username
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'pa')]")).sendKeys("8888");  //case4 for password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();  //case2 for login
		
		

	}

}
