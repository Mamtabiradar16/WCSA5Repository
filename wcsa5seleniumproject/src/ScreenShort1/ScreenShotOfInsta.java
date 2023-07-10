package ScreenShort1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;


public class ScreenShotOfInsta {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    //way number.....5
	    WebDriver rdriver = new ChromeDriver();
		rdriver.manage().window().maximize();
		rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rdriver.get("https://www.instagram.com/?hl=en");
		//By using EventFiringWebDriver(rdriver);
		EventFiringWebDriver efw = new EventFiringWebDriver(rdriver);
		File src = efw.getScreenshotAs(OutputType.FILE);
		File fil = new File("./Screeanshot/insta.png");
		Files.copy(src, fil);
		
		

	}

}
