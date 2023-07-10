package ScrollBar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter12 {

	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the Browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//apply imlicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		//launch the web appliction
		driver.get("https://www.selenium.dev/");
		//to parform Scrolling oprations
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,-1000)");
    	Thread.sleep(2000);
	
		
		
		
		

	}

}
