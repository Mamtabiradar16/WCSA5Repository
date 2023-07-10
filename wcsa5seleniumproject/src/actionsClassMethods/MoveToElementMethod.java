package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		// it is use to parform mouseHover action
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/jewellery/watch+band.html");// lounch the bluestone appliction
		//driver.findElement(By.partialLinkText("Watch Jewellery")).click();
		Thread.sleep(2000);
	    WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
		  
         // ttargeto parform mouse action  on webelement
		Actions act = new Actions(driver);
		
		//to parform mouseHover action 
		act.moveToElement(target).perform();
		
		
		
		
	}

}
