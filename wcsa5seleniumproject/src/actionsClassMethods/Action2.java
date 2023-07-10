package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/jewellery/watch+band.html");
		WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
		driver.findElement(By.xpath("//span[.='1 gram' and (@data-p='gold-coins-weight-1gms,m')]")).clear();
		driver.findElement(By.id("5920"));
		
		

	}

}
