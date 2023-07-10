package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement act1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='loan']/descendant::li"));
		
		WebElement act2 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target2 = driver.findElement(By.xpath("//ol[@id='bank']/descendant::li"));
		
		WebElement act3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target3 = driver.findElement(By.xpath("//ol[@id='amt7']/descendant::li"));
		
		
		
		WebElement act4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target4 = driver.findElement(By.xpath("//ol[@id='amt8']/descendant::li"));
	
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(act1, target1).perform();
		act.dragAndDrop(act2, target2).perform();
		act.dragAndDrop(act3, target3).perform();
		act.dragAndDrop(act4, target4).perform();
		
		
		
	}

}
