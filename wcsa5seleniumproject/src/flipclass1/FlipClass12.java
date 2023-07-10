package flipclass1;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipClass12 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://laptop-i4em60b9/login.do");
	    
	    Flibclass flib = new Flibclass();
	    
	    for(int i=1;i<=8;i++) 
	    {   
	    	
	    	// Read Valid data from excel file to test the data
	    	//String validuser = flib.readExcelData("./data/ActiTimeTestData.xlsx","Validcreds", 1, 1);
	    	//String validpass = flib.readExcelData("./data/ActiTimeTestData.xlsx","Validcreds", 1, 1);
	    	
	    	// read  InValid data from excel file to test the data
	       driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","InValidcreds", i, 0));
	  	   Thread.sleep(2000);
	  	   driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","InValidcreds", i, 0));
	  	   Thread.sleep(2000);
	  	   driver.findElement(By.linkText("Login")).click();
	  	   driver.findElement(By.name("username")).clear();
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	  
	    
	    
	    
	     

	}

}
