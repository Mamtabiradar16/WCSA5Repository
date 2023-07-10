package ScrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class disableclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/HTML/disable.html");
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(2000);
		//driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		// To generate alert Pop Up
		jse.executeScript("alert('Hello There!')");
		driver.switchTo().alert().accept();
		//To handle Disabled WebElement
		jse.executeScript("document.getElementById('i2').value='manager'");

	}

}
