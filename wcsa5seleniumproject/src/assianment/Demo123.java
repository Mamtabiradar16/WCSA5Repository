package assianment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo123 {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///D:/HTML/menu.html");
		WebElement multi=driver.findElement(By.id("menu"));
		
		Select sal = new Select(multi);
			Thread.sleep(2000);
		// To select using Index
		sal.selectByIndex(2);
		
		//To select Using Visible Text
		sal.selectByVisibleText("pani puri");
			Thread.sleep(2000);
		
		//to select using value
		sal.selectByValue("v2");
			Thread.sleep(2000);
		
		// to Deselect using Index
		sal.deselectByIndex(3);
			Thread.sleep(2000);
		
		
		// to deselect by using visible text
		sal.deselectByVisibleText("pav bhaji");
			Thread.sleep(2000);
		
		//to deselect by using value
		sal.deselectByValue("v5");
			Thread.sleep(2000);
		
		//to select multiple optoins by using for loop
		for(int i=0; i<9; i++)
		{
			sal.selectByIndex(i);
			Thread.sleep(1000);
			
		}
			Thread.sleep(3000);
		
	   //to deselect multiple option by using for loop
		/*for(int i=0;i<9;i++) 
		{
			sal.deselectByIndex(i);
			Thread.sleep(1000);
		
		}*/
			// to deselect all options using deselectall()
			sal.deselectAll();
			

	}

}
