package assianment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		//lunch  the child window
	    WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
	    Point element = childWindow .getLocation();
				
	  
	    int xaxis=element.getX();
	    int yaxis=element.getY();
	  
	  
	  //close the all browsers without using 
	  
	  
	  	  
	  
	  

	}

}
