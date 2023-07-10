package ScreenShort1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;



public class ScreenShotOfActiTime {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    //way number.....4
	    RemoteWebDriver rdriver = new ChromeDriver();
		rdriver.manage().window().maximize();
		rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rdriver.get("http://laptop-i4em60b9/login.do");
		
		File src=rdriver.getScreenshotAs(OutputType.FILE);
    	File dest=new File("./Screeanshot/actiTime.png");
    	
    	Files.copy(src, dest);
		
		

	}

}
