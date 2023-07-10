package blueStone;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone20GM {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
		driver.findElement(By.xpath("//span[text()='50 gram'][1]")).click();
		driver.findElement(By.xpath("//a[text()='Coins ']")).click();
		driver.findElement(By.xpath("//span[text()='weight (Gram)']")).click();
		
		 Robot root = new Robot();
		 for(int i=1;i<2;i++) {
			 root.keyPress(KeyEvent.VK_TAB); 
			
		 }
		 root.keyRelease(KeyEvent.VK_TAB);
		 root.keyPress(KeyEvent.VK_ENTER);
		 root.keyRelease(KeyEvent.VK_ENTER);
	       
	
		


	}

}
