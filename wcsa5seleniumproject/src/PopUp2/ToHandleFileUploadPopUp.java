package PopUp2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");

		Actions as=new Actions(driver);
	    WebElement target = driver.findElement(By.id("uploadfile"));
	    as.doubleClick(target).perform();
	      
		
		Runtime.getRuntime().exec("./autoItprograms/omayoFileUpload.exe");
	    Thread.sleep(2000);
	   /* Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(target).perform();*/
		
       File dest=new File("./Autoitprograms/demo3.exe");
       String sba= dest.getAbsolutePath();
       Runtime.getRuntime().exec(sba);
    	
    	
		Thread.sleep(2000);
		driver.quit();
	    
	    

	}

}
