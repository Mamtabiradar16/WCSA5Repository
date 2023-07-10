package bobotclass1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import actionsClassMethods.Action1;

public class AssinmentonRobotandActionclass {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn"));
	    Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		for(int i=1;i<=2;i++) {
			act.doubleClick(target2).perform();
			act.clickAndHold(target2).perform();
		}
        
        //copy the filter by text
        Robot root = new Robot();
        root.keyPress(KeyEvent.VK_CONTROL);
        root.keyPress(KeyEvent.VK_C);
        
        
        root.keyRelease(KeyEvent.VK_CONTROL);
        root.keyRelease(KeyEvent.VK_C);
        //identify the search box
        driver.findElement(By.id("search_query_top_elastic_search")).click();
        
        root.keyPress(KeyEvent.VK_CONTROL);
        root.keyPress(KeyEvent.VK_V);
        
        
        root.keyRelease(KeyEvent.VK_CONTROL);
        root.keyRelease(KeyEvent.VK_V);
        
        root.keyPress(KeyEvent.VK_ENTER);
        root.keyRelease(KeyEvent.VK_ENTER);
        
        
        
        
        
        

        
       
        
		
        
	}

}
