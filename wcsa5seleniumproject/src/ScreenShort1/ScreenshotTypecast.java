package ScreenShort1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;


public class ScreenshotTypecast
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		//1)Typecasting from WebDriver to TakeScreenShot
		//Way number.....3
        TakesScreenshot ts=(TakesScreenshot)driver;
        
        
        //2)Typecasting  from WebDriver to RemotWebDriver
        /* second way
         * RemotWebDriver rwd=(RemotWebDriver)driver;
         * rwd.getScreenShotAs();
         */
        
        
        //3)creating object of ChromeDriver
        /*ChormeDriver driver = new ChromeDriver();
         * driver.getScreenShotAs();
         */
        
        
        //4) creating object of RemotWebDriver
        /*RemotWebDriver wrd=new RemotWebDriver();
         * wrd.getScreenShotAs();
         */
        
        
        //5)//By using EventFiringWebDriver(rdriver);
		/*EventFiringWebDriver efw = new EventFiringWebDriver(rdriver);
		File src = efw.getScreenshotAs(OutputType.FILE);*/
		
		
        File src=ts.getScreenshotAs(OutputType.FILE);//to take Screen Shot
        File fl=new File("./Screeanshot/Google.png");//to store in file
       
       Files.copy(src, fl);//src==>copy   fl==>paste
       
        
        
        
        
	}

	
	
		
	

}
