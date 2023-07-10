package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//   //button[text()='X']
		
		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Login']")).click();
		WebElement target = driver.findElement(By.xpath("//div[text()='Home & Kitchen']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();

		
		

	}

}
