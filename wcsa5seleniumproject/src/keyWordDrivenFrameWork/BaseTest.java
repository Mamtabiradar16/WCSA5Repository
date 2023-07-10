package keyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Flib implements IautoConstant {
	// it is use to open & close the Browser
	
	
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData("./data/config.properties","Value");
		String url = flib.readPropertyData("./data/config.properties","Url");
		
		if(browservalue.contentEquals("Firefox")) 
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
		}
		
		else if(browservalue.equalsIgnoreCase("Edge")) 
		{
		    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		    ChromeDriver driver = new ChromeDriver();
		   
			
		}
		
	}

}
