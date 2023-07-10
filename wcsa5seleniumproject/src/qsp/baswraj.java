package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baswraj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("biradarbaswraj@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Raje9096@");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();

	}

}
