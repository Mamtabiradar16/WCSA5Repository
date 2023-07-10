package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instacssselector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/?hl=en");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[ name*='erna']")).sendKeys("8888334011");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("Dummy123");
		driver.findElement(By.cssSelector("button[class*='acap _aca']")).click();
		//Thread.sleep(2000);

	}

}
