package blueStone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStonClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.bluestone.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Allow']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Offers ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='25% Off your first Gold Mine installment']")).click();
       

	}

}
