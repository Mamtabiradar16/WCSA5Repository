package PopUp2;

import java.sql.Driver;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PopUPNotification {
	static WebDriver driver;

	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter BrowserValue!!");
		    String browserValue=sc.next();
		   
			if(browserValue.equalsIgnoreCase("chrome"))
		    {
		    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		     ChromeOptions co = new	ChromeOptions();
		     co.addArguments("--disable-notifications");
		     WebDriver driver = new ChromeDriver(co);
		 	 driver.manage().window().maximize();
		 	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		 	 driver.get("https://www.easemytrip.com/flights.html");
		
		
		    }
			 
		  /* else if(browserValue.equalsIgnoreCase("Firebox"))
		    {
		    	System.setProperty("firfoxdriver.firefox.driver","./drivers/firefoxdriver.exe");
		         FirefoxOptions fo = new FirefoxOptions();
		         driver  = new FirefoxOptions(fo);
		         driver.manage().window().maximize();
			 	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			 	 driver.get("https://www.easemytrip.com/flights.html");
		          
		    }*/
		    else if ( browserValue.equalsIgnoreCase("Egde")) 
		    {
		    	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		    	
		    	EdgeOptions eo = new	EdgeOptions();
		         driver = new EdgeDriver(eo);
		         driver.manage().window().maximize();
			 	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			 	 driver.get("https://www.easemytrip.com/flights.html");
		    }
		    else
		    {
		    	System.out.println("Enter Valid browserValues");
		    }
	    
	 	 

	}

}
