package webDriverMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowhandlesMethod {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		
		//get the handle or address of current or parent window
		String st1 = driver.getWindowHandle();
		System.out.println("parent window address:  "+st1);
		
		//lunch  the child window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		
		//get the handle or address of chind window  only
		String st = driver.getWindowHandle();
        System.out.println("child window address:   "+st);
        
        Set<String> allHandles = driver.getWindowHandles();
        //by using loopin statement
        for(String wh:allHandles)
        {
        	System.out.println(wh);
        }
        //by using quit() we can close parent and child  Window (Both)
         driver.quit();
         
        //By using Close() we can close only parent Window
         driver.close();
         
         
         
        	
	}

}
